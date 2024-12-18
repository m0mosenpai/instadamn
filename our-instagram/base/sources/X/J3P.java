package X;

/* loaded from: classes7.dex */
public final class J3P implements Runnable {
    public final /* synthetic */ HHH A00;

    public J3P(HHH hhh) {
        this.A00 = hhh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HHH hhh = this.A00;
        if (hhh.A00 == 0) {
            hhh.A00 = hhh.A0A.getScrollingViewProxy().CFj().getHeight();
        }
        INJ inj = hhh.A01;
        if (hhh.A02 && inj != null) {
            inj.A00.setVisibility(0);
            inj.A02(AbstractC167007dF.A1O(hhh.A06.A02.size()));
            AbstractC13880nE.A0q(inj.A00, new J3O(this));
        }
    }
}
