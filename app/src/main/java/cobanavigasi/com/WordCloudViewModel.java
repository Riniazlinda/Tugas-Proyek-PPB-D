package cobanavigasi.com;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WordCloudViewModel extends ViewModel {
    
    private MutableLiveData<String> mText;

    public WordCloudViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is word cloud fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
