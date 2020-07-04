package cobanavigasi.com;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    TextView tv;
    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        //Use the current date as the default date in the date picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new DatePickerDialog(getActivity(),AlertDialog.THEME_HOLO_LIGHT,this,year, month, day);
        //Set a title for DatePickerDialog
        dpd.setTitle("Set a Date");
        return dpd;
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date date = new Date(year, month, day-1);
        String dayOfWeek = sdf.format(date);

        tv = getActivity().findViewById(R.id.tanggalnote);
        tv.setText(dayOfWeek + ", " + day + " " + MONTHS[month] + ", " + year);
    }
}