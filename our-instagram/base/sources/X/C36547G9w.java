package X;

import android.view.View;

/* renamed from: X.G9w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36547G9w implements GZH {
    public final C31250DoY A00;

    public C36547G9w(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (c5hw.A05 == C5Hd.FOLLOW_REQUEST && enumC33370Ep3 == EnumC33370Ep3.A02 && !c5hw.A0F() && AbstractC70138W6q.A02(c5hw)) {
            return true;
        }
        return false;
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        this.A00.DHy(AbstractC31173DnH.A0a(mud, enumC33370Ep3, i), c5hw, i);
    }
}
