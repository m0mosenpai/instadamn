package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.instagram.appreciation.analytics.LoggingData;

/* loaded from: classes8.dex */
public abstract class LAu {
    public static final LoggingData A00(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("appreciation_logging_data");
        if (parcelable != null) {
            return (LoggingData) parcelable;
        }
        throw AbstractC166997dE.A0g();
    }

    public static LoggingData A01(Fragment fragment) {
        return A00(fragment.requireArguments());
    }
}
