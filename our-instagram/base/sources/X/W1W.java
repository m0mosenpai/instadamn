package X;

/* loaded from: classes11.dex */
public final class W1W {
    public final C7Oi A00;

    public static final void A00(W1W w1w, float f, int i) {
        C7Oi c7Oi = w1w.A00;
        c7Oi.A02("max_ampitude", String.valueOf((int) (f * 100.0f)));
        c7Oi.A02("vmrecording_duration", Long.toString(((int) ((i & 4294967295L) / 1000)) & 4294967295L, 10));
        c7Oi.A01("vmrecording_fail");
        ((XEY) c7Oi.A00.getValue()).A6w();
    }

    public W1W(boolean z) {
        this.A00 = new C7Oi(z);
    }
}
