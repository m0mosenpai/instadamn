package X;

/* loaded from: classes8.dex */
public final class M30 implements Runnable {
    public final /* synthetic */ C3AY A00;
    public final /* synthetic */ C47957LGt A01;

    public M30(C3AY c3ay, C47957LGt c47957LGt) {
        this.A01 = c47957LGt;
        this.A00 = c3ay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C85F c85f = this.A01.A07;
        Object obj = this.A00.A01;
        if (obj != null) {
            c85f.DMy((String) obj);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
