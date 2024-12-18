package X;

import android.content.Context;

/* renamed from: X.W2f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70084W2f {
    public static C70084W2f A04;
    public final C1V7 A00;
    public final C68677VaD A01;
    public final C69481Vo4 A02;
    public final C68908Ve8 A03;

    public static synchronized void A00(Context context) {
        synchronized (C70084W2f.class) {
            C1VI.A00();
            C69481Vo4 c69481Vo4 = new C69481Vo4(new C69057Vgy(context));
            if (A04 != null) {
                C0I2.A00(C70084W2f.class, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            A04 = new C70084W2f(c69481Vo4);
            C1VI.A00();
        }
    }

    public C70084W2f(C69481Vo4 c69481Vo4) {
        C1VI.A00();
        this.A02 = c69481Vo4;
        this.A03 = new C68908Ve8(((C1WC) c69481Vo4.A04).A02);
        this.A01 = new C68677VaD(c69481Vo4.A06);
        C1VI.A00();
        this.A00 = c69481Vo4.A02;
    }
}
