package X;

import android.widget.ListView;

/* renamed from: X.NXb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52771NXb extends AbstractC195668l7 {
    public final ListView A00;

    @Override // X.AbstractC195668l7
    public final void A02(int i, int i2) {
        this.A00.smoothScrollBy(0, 0);
    }

    @Override // X.AbstractC195668l7
    public final int A00() {
        return this.A00.getFirstVisiblePosition();
    }

    @Override // X.AbstractC195668l7
    public final void A01(int i, int i2) {
        this.A00.setSelectionFromTop(i, i2);
    }

    public C52771NXb(ListView listView) {
        super(listView);
        this.A00 = listView;
    }
}
