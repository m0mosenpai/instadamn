package X;

/* loaded from: classes9.dex */
public final class PR6 implements Runnable {
    public final /* synthetic */ NQ4 A00;
    public final /* synthetic */ String A01;

    public PR6(NQ4 nq4, String str) {
        this.A00 = nq4;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9GR.A09(this.A00.getContext(), this.A01);
    }
}
