package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class GAC implements GZH {
    public final C31250DoY A00;

    public GAC(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (enumC33370Ep3 == EnumC33370Ep3.A04 && EnumC31336Dq1.A30 == c5hw.A03()) {
            return true;
        }
        return false;
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        this.A00.Dhk(AbstractC31173DnH.A0a(mud, enumC33370Ep3, i), c5hw, i);
    }
}
