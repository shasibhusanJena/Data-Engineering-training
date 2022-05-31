import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

//job.setNumReduceTasks(2);
//job.setPartitionerClass(CustomPartitioner.class);

public class CustomPartitioner extends Partitioner < Text, IntWritable >
{
public int getPartition(Text key, IntWritable value, int numReduceTasks)
{
if (key.toString().length() < 4)
{
return 0;
}
else
return 1;
}
}
