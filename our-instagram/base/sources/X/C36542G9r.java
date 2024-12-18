package X;

import android.view.View;

/* renamed from: X.G9r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36542G9r implements GZH {
    public final C31250DoY A00;

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167007dF.A1K(c5hw, enumC33370Ep3);
        this.A00.DAO(AbstractC31173DnH.A0a(mud, enumC33370Ep3, i), c5hw, i, false);
    }

    public C36542G9r(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (c5hw.A05 == C5Hd.DIRECT_SHARE) {
            if (enumC33370Ep3 == EnumC33370Ep3.A04 || enumC33370Ep3 == EnumC33370Ep3.A02) {
                return true;
            }
            return false;
        }
        return false;
    }
}
