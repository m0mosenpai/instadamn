package X;

import android.view.View;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* loaded from: classes6.dex */
public final class GA0 implements GZH {
    public final InterfaceC16590sC A00;

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(enumC33370Ep3, 1);
        return AbstractC167007dF.A1X(enumC33370Ep3, EnumC33370Ep3.A06);
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(c5hw, 0);
        if (!(view instanceof IgBouncyUfiButtonImageView)) {
            view = null;
        }
        boolean z = true;
        boolean z2 = !c5hw.A0G();
        if (view != null) {
            view.setSelected(z2);
        }
        C5HX c5hx = c5hw.A04;
        Boolean valueOf = Boolean.valueOf(z2);
        c5hx.A04 = valueOf;
        InterfaceC16590sC interfaceC16590sC = this.A00;
        Integer valueOf2 = Integer.valueOf(i);
        if (view != null) {
            z = false;
        }
        interfaceC16590sC.invoke(valueOf, c5hw, valueOf2, Boolean.valueOf(z), mud);
    }

    public GA0(InterfaceC16590sC interfaceC16590sC) {
        this.A00 = interfaceC16590sC;
    }
}
