/**
 * 
 */
package org.example.androidsdk.demo;

import java.util.List;

import org.example.androidsdk.demo.data.Flower;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * @author Ranvirsinh
 *
 */
public class FlowerAdapter extends ArrayAdapter<Flower> {

	private Context context;
	private List<Flower> objects;
	public FlowerAdapter(Context context, int resource, List<Flower> objects) {
		super(context, resource, objects);
		this.context = context;
		this.objects = objects;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Flower flower = objects.get(position);
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		
		View view = inflater.inflate(R.layout.item_flower
		return super.getView(position, convertView, parent);
	}

}
