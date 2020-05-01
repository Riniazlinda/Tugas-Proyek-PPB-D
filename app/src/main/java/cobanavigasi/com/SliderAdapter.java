package cobanavigasi.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;


public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;

    }

    //arrays
    public int[] slide_images = {
            R.drawable.icprem2,
            R.drawable.icprem1,
            R.drawable.icprem3,
            R.drawable.icprem4,
            R.drawable.icprem5,
            R.drawable.icprem6
    };

    public String[] slide_description = {
            "Keep your entries secure with Passcode Lock",
            "Beautify your personal space with our unique themes",
            "Express your thoughts as much as you want with unlimited characters",
            "Spice up your otes with custom fonts and text formats",
            "Add your favorite song and photos to match your mood",
            "Unravel your emotions with a full pack of activities and feelings or add your own"
    };

    @Override
    public int getCount() {

        return slide_description.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImage = view.findViewById(R.id.imageView);
        TextView slideText = view.findViewById(R.id.slide_desc);

        slideImage.setImageResource(slide_images[position]);
        slideText.setText(slide_description[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout) object);
    }
}
