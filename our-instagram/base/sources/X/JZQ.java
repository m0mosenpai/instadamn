package X;

/* loaded from: classes8.dex */
public final class JZQ implements C06N {
    public final int A00;
    public final Object A01;

    public JZQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C06N
    public final void onBackStackChanged() {
        switch (this.A00) {
            case 0:
                KCW kcw = (KCW) this.A01;
                kcw.onBottomSheetPositionChanged(kcw.A01, kcw.A00);
                return;
            case 1:
                KCZ kcz = (KCZ) this.A01;
                kcz.onBottomSheetPositionChanged(kcz.A01, kcz.A00);
                return;
            case 2:
                C54973OTf.A00((C54973OTf) this.A01);
                return;
            default:
                ((JX3) this.A01).A00();
                return;
        }
    }
}
