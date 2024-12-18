package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes9.dex */
public final class NFt extends Q2Q {
    public final int A00;

    public NFt(Drawable drawable, int i) {
        super(null, null);
        super.A00.A01 = drawable;
        drawable.setCallback(this);
        this.A00 = i;
    }

    @Override // X.Q2Q
    public final void A00() {
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        Q2E q2e = super.A00;
        int level = q2e.A01.getLevel();
        int width = bounds.width();
        int i = (int) (((width + r2) * (level % 5000)) / 5000.0f);
        q2e.A01.setBounds((-this.A00) + i, bounds.top, i, bounds.bottom);
    }
}
