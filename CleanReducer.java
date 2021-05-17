import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.FileWriter;


public class CleanReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	@Override
	public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
		



		
		context.write(key, new IntWritable());

		/***
		try {
			
	      
	      //Configuration conf = new Configuration();
	      FileSystem fileSystem = FileSystem.get(conf);
	      //Path pt = new Path("/home/Rishi/Documents/RishiFile/r.txt");
	      Path pt = new Path("/home/kwl317/nasdaq_screener_cleaned.csv");
	      FSDataOutputStream out = fileSystem.create(pt);
	      


	      for (Text value : values) {
		      out.writeChars(value.toString());
		    }
	      
	      out.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	    ***/


	}
}