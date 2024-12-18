package X;

import android.view.View;

/* renamed from: X.G9u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36545G9u implements GZH {
    public final C31250DoY A00;

    public C36545G9u(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (enumC33370Ep3 == EnumC33370Ep3.A04 && c5hw.A07() == null && this.A00.A0T(c5hw)) {
            return true;
        }
        return false;
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        this.A00.DRQ(AbstractC31173DnH.A0a(mud, enumC33370Ep3, i), c5hw, i);
    }
}
