package X;

import android.content.res.Resources;
import com.facebook.R;

/* loaded from: classes10.dex */
public abstract class S50 {
    public static final String A00(Resources resources, C58877QEn c58877QEn) {
        AbstractC167017dG.A1N(resources, c58877QEn);
        boolean z = c58877QEn.A00.getBoolean("TrackingInfo.USE_MEDIA_REPORTING_FLOW", false);
        int i = R.string.res_0x7f130070_name_removed;
        if (z) {
            i = R.string.res_0x7f13006f_name_removed;
        }
        return AbstractC166997dE.A0q(resources, i);
    }
}
