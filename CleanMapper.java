import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class CleanMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

	private static final int MISSING = 9999;

	@Override
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

	String line = value.toString();
  	String[] arr = line.split(",");
    if (arr.length == 11){
      String output = arr[0]+","+arr[1]+","+arr[2]+","+arr[5]+","+arr[6]+","+arr[7]+","+arr[8]+","+arr[9]+","+arr[10]+"\n";
      context.write(new Text(output), new IntWritable());


    }




  /***
  	for (int i = 0; i < arr.length; i++){
      String token = arr[i];
      token=token.trim();
  		if (i != 3 || i != 4){
  			if (i != arr.length-1){
  				output += token + ",";
  			}
  			else{
  				output += token+"\n";
  			}

  		}

  	}
    ***/

  	
  

}}