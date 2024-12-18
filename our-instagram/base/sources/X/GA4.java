package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class GA4 implements GZH {
    public final C31250DoY A00;

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(enumC33370Ep3, 1);
        return AbstractC167007dF.A1X(enumC33370Ep3, EnumC33370Ep3.A09);
    }

    public GA4(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (c5hw.A04.A06 != null) {
            this.A00.E0u(mud, c5hw, i);
        } else {
            this.A00.DfT(AbstractC31173DnH.A0a(mud, enumC33370Ep3, i), c5hw, i);
        }
    }
}
