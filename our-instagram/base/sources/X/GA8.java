package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class GA8 implements GZH {
    public final C31250DoY A00;

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(enumC33370Ep3, 1);
        return AbstractC167007dF.A1X(EnumC33370Ep3.A02, enumC33370Ep3);
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(c5hw, 0);
        this.A00.Dho(mud, c5hw, i);
    }

    public GA8(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }
}
