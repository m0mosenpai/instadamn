package X;

import android.content.Context;

/* renamed from: X.1Au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23151Au {
    public final synchronized C23141At A00(Context context) {
        C23141At c23141At;
        C14360o3.A0B(context, 0);
        c23141At = C23141At.A01;
        if (c23141At == null) {
            Context applicationContext = context.getApplicationContext();
            C14360o3.A07(applicationContext);
            c23141At = new C23141At(applicationContext);
            C23141At.A01 = c23141At;
            boolean z = C218914p.A05;
            C218914p.A03(EnumC220415e.A03, c23141At);
        }
        return c23141At;
    }
}
