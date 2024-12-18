package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class OCG {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public OCG(Context context, String str) {
        String A0r = AbstractC166997dE.A0r(context.getResources(), str, 2131973065);
        C14360o3.A07(A0r);
        this.A02 = A0r;
        String A0r2 = AbstractC166997dE.A0r(context.getResources(), str, 2131973065);
        C14360o3.A07(A0r2);
        this.A03 = A0r2;
        this.A00 = context.getColor(R.color.badge_color);
        this.A01 = context.getColor(R.color.grey_5);
    }
}
