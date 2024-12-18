package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class SYL {
    public final Context A00;
    public final AbstractC12990ll A01;

    public static String A00(Context context) {
        C14360o3.A0B(context, 0);
        return new SYL(context, C023409i.A0A.A08(context)).A01();
    }

    public final String A01() {
        String A02 = C11830jh.A04.A01(this.A01).A02(C19T.A1n);
        if ((((A02 == null || A02.length() == 0) && (A02 = C16030qx.A02.A04(AbstractC12290kX.A00)) == null) || A02.length() == 0) && (A02 = C16030qx.A00(this.A00)) == null) {
            throw AbstractC166997dE.A0g();
        }
        return A02;
    }

    public SYL(Context context, AbstractC12990ll abstractC12990ll) {
        this.A00 = context;
        this.A01 = abstractC12990ll;
    }
}
