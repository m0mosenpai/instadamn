package X;

/* loaded from: classes5.dex */
public final class D22 implements Runnable {
    public final /* synthetic */ CAK A00;
    public final /* synthetic */ BZC A01;
    public final /* synthetic */ EnumC78563fO A02;

    public D22(CAK cak, BZC bzc, EnumC78563fO enumC78563fO) {
        this.A00 = cak;
        this.A02 = enumC78563fO;
        this.A01 = bzc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CAK cak = this.A00;
        int i = cak.A00;
        if (i == -1) {
            if (this.A02 == EnumC78563fO.RTL) {
                this.A01.fullScroll(66);
            }
            cak.A00 = this.A01.getScrollX();
            return;
        }
        this.A01.setScrollX(i);
    }
}
