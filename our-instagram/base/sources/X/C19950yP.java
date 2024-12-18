package X;

import android.content.Context;

/* renamed from: X.0yP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19950yP {
    public final int A00;
    public final Context A01;
    public final C09310dg A02;

    public C19950yP(Context context, int i) {
        this.A01 = context;
        this.A00 = i;
        C09310dg c09310dg = new C09310dg();
        this.A02 = c09310dg;
        c09310dg.A01(context.getApplicationInfo().sourceDir);
    }
}
