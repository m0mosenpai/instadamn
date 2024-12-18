package X;

import android.content.Context;
import android.os.Build;
import com.facebook.systrace.Systrace;

/* renamed from: X.11c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC210111c {
    public static final void A00(Context context) {
        C14360o3.A0B(context, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            String[][] strArr = Systrace.A03;
            C0ev.A00(context);
        }
    }
}
