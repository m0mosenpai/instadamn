package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public abstract class S4H {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0d = AbstractC31177DnL.A0d(c6fw);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            try {
                android.net.Uri A03 = AbstractC08820cl.A03(A0d);
                C14360o3.A0A(A03);
                Intent A0C = AbstractC58318PtA.A0C();
                A0C.setData(A03);
                A0C.setPackage("com.android.vending");
                C12260kU.A00(context, A0C);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }
}
