package X;

import android.view.View;

/* renamed from: X.G9z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36550G9z implements GZH {
    public final C31250DoY A00;

    public C36550G9z(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C5HX c5hx;
        MUD mud;
        String str;
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (enumC33370Ep3 == EnumC33370Ep3.A08 && c5hw.A04() == null && (mud = (c5hx = c5hw.A04).A0D) != null && (str = mud.A02) != null && str.length() != 0 && c5hx.A12.getValue() != null) {
            return true;
        }
        return false;
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        this.A00.DMB(AbstractC31173DnH.A0a(mud, enumC33370Ep3, i), c5hw, i);
    }
}
