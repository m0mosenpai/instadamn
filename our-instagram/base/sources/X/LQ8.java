package X;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes8.dex */
public final class LQ8 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C86033sa A00;

    public LQ8(C86033sa c86033sa) {
        this.A00 = c86033sa;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        InterfaceC09390do interfaceC09390do = this.A00.A03;
        int A0C = AbstractC166987dD.A0C(AbstractC166997dE.A0L(AbstractC166987dD.A0d(interfaceC09390do)), 16);
        AbstractC010103p.A0H(AbstractC166987dD.A0d(interfaceC09390do), AbstractC16960so.A1Q(new Rect(0, 0, A0C, view.getHeight()), AbstractC166987dD.A0V(view.getWidth() - A0C, 0, view.getWidth(), view.getHeight())));
    }
}
