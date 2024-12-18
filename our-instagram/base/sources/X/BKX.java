package X;

import android.view.View;

/* loaded from: classes5.dex */
public final class BKX implements View.OnLayoutChangeListener {
    public final /* synthetic */ C37556GgC A00;

    public BKX(C37556GgC c37556GgC) {
        this.A00 = c37556GgC;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = i4 - i2;
        BKH bkh = this.A00.A09.A0B;
        if (i9 > 0 && i10 > 0) {
            C65835Tus c65835Tus = bkh.A06;
            J8W j8w = new J8W(bkh, 48);
            if (i9 != c65835Tus.A01 || i10 != c65835Tus.A00) {
                c65835Tus.A01 = i9;
                c65835Tus.A00 = i10;
                j8w.invoke();
            }
            BKH.A01(bkh);
        }
    }
}
