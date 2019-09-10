package com.roha.lungo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Henok G on 17-Aug-16.
 */
public class ImageViewPagerAdapter extends PagerAdapter {

    private int[] images;
    private Context context;
    private LayoutInflater inflater;

    public ImageViewPagerAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        ImageView image;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.single_page, container,false);

        image = (ImageView) itemView.findViewById(R.id.single_page_image);
        image.setImageResource(images[position]);

        ((ViewPager) container).addView(itemView);
        return itemView;

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((LinearLayout) object);
    }
}