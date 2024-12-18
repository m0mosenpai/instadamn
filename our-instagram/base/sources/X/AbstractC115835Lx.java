package X;

import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;

/* renamed from: X.5Lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115835Lx extends FrameLayout implements InterfaceC115845Ly {
    public ColorDrawable A00;

    public final ColorDrawable getPlaceHolderDrawable() {
        return this.A00;
    }

    public final void setPlaceHolderColor(int i) {
        this.A00 = new ColorDrawable(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = C0f9.A06(471924653);
        super.onDetachedFromWindow();
        E0l();
        C0f9.A0D(-1497581712, A06);
    }
}
