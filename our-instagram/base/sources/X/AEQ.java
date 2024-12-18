package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes4.dex */
public abstract class AEQ {
    public static final int A00(Context context, Integer num) {
        int i;
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1 && intValue != 2) {
                throw B4Z.A00();
            }
            i = R.attr.igds_color_controls;
        } else {
            i = R.attr.igds_color_text_on_white;
        }
        return AbstractC167007dF.A09(context, i);
    }

    public static final String A01(Context context, Integer num) {
        int i;
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    i = 2131976245;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i = 2131976237;
            }
        } else {
            i = 2131976238;
        }
        return AbstractC166997dE.A0p(context, i);
    }
}
