package X;

/* renamed from: X.GNq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36895GNq implements Runnable {
    public final /* synthetic */ C32736Eb2 A00;
    public final /* synthetic */ C32235EHt A01;

    public RunnableC36895GNq(C32736Eb2 c32736Eb2, C32235EHt c32235EHt) {
        this.A00 = c32736Eb2;
        this.A01 = c32235EHt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32736Eb2 c32736Eb2 = this.A00;
        AbstractC31175DnJ.A0N(c32736Eb2.getSession()).A02(c32736Eb2.requireActivity(), this.A01);
    }
}
