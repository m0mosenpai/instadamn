package X;

import android.content.Context;

/* renamed from: X.0xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19700xy {
    public final synchronized C17280tP A00() {
        Context context;
        context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        return A01(context);
    }

    public final synchronized C17280tP A01(Context context) {
        C17280tP c17280tP;
        C14360o3.A0B(context, 0);
        c17280tP = C17280tP.A4A;
        if (c17280tP == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            c17280tP = new C17280tP(context);
            C17280tP.A4A = c17280tP;
        }
        return c17280tP;
    }
}
