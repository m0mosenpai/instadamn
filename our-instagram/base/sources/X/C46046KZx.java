package X;

import android.widget.GridView;

/* renamed from: X.KZx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46046KZx extends AbstractC195668l7 {
    public final GridView A00;

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
        this.A00.setSelection(i);
    }

    public C46046KZx(GridView gridView) {
        super(gridView);
        this.A00 = gridView;
    }
}
