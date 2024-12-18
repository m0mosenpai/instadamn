package X;

import android.content.Context;

/* renamed from: X.1nx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37001nx {
    public static C37001nx A02;
    public C33625Etb A00;
    public final Context A01;

    public C37001nx(Context context) {
        C14360o3.A0B(context, 1);
        this.A01 = context.getApplicationContext();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Etb, java.lang.Object] */
    public final C33625Etb A00() {
        C33625Etb c33625Etb = this.A00;
        if (c33625Etb == null) {
            C14360o3.A06(this.A01);
            ?? obj = new Object();
            this.A00 = obj;
            return obj;
        }
        return c33625Etb;
    }

    public C37001nx() {
    }
}
