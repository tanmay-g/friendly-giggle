package tanmaygodbole.popularmovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tanmay.godbole on 20-08-2016
 */
public class ReviewAdapter extends DetailsContentAdapter {

    public ReviewAdapter(Context context, HashMap<String, String> map) {
        super(context, map);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //This is the linear layout from reviews_item_layout
        View resultView;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            resultView = inflater.inflate(R.layout.reviews_item_layout, parent);
        } else {
            resultView = convertView;
        }

        Map.Entry<String, String> item = getItem(position);

        TextView reviewName = ((TextView) resultView.findViewById(R.id.review_name));
        reviewName.setText(item.getKey());
        reviewName.setId(View.generateViewId());
        TextView reviewContent = ((TextView) resultView.findViewById(R.id.review_content));
        reviewContent.setText(item.getValue());
        reviewContent.setId(View.generateViewId());

        resultView.setId(View.generateViewId());

        return resultView;
    }
}
