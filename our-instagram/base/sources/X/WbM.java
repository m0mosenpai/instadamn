package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class WbM implements InterfaceC71901X9l {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;

    public WbM(View view, View view2) {
        this.A00 = view;
        this.A01 = view2;
    }

    @Override // X.InterfaceC71901X9l
    public final void DOK(int i, boolean z) {
        int i2;
        View view = this.A00;
        if (view != null) {
            i2 = view.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        View view2 = this.A01;
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(view2);
        int i3 = A0G.leftMargin;
        int i4 = A0G.topMargin;
        int i5 = A0G.rightMargin;
        int i6 = i - i2;
        int i7 = 0;
        if (0 < i6) {
            i7 = i6;
        }
        A0G.setMargins(i3, i4, i5, i7);
        view2.requestLayout();
    }
}
