package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Ffp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35197Ffp {
    public int A00;
    public View.OnClickListener A01;
    public String A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Ffp, java.lang.Object] */
    public static C35197Ffp A00(Object obj) {
        C14360o3.A0B(obj, 0);
        return new Object();
    }

    public static void A01(Resources resources, C35197Ffp c35197Ffp, int i) {
        c35197Ffp.A02 = resources.getString(i);
        c35197Ffp.A00 = R.drawable.instagram_arrow_back_24;
    }

    public static void A02(Resources resources, C35197Ffp c35197Ffp, int i) {
        c35197Ffp.A02 = resources.getString(i);
    }
}
