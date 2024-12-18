package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class QBU extends AbstractC63790Stk {
    @Override // X.InterfaceC65558Tme
    public final void recycle() {
    }

    @Override // X.InterfaceC65558Tme
    public final Class BoY() {
        return this.A00.getClass();
    }

    @Override // X.InterfaceC65558Tme
    public final int getSize() {
        Drawable drawable = this.A00;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }
}
