package X;

import android.content.Context;

/* renamed from: X.0qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15960qq {
    public static final C15980qs A00(Context context) {
        C14360o3.A0B(context, 0);
        C15980qs c15980qs = C15980qs.A03;
        if (c15980qs == null) {
            Context applicationContext = context.getApplicationContext();
            C14360o3.A07(applicationContext);
            C15980qs c15980qs2 = new C15980qs(applicationContext);
            C15980qs.A03 = c15980qs2;
            return c15980qs2;
        }
        return c15980qs;
    }
}
