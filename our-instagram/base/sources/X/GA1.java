package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class GA1 implements GZH {
    public final C31250DoY A00;

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(c5hw, 0);
        int i2 = c5hw.A00;
        if (i2 != 159 && i2 != 1519) {
            return false;
        }
        return true;
    }

    public GA1(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        this.A00.Dhk(AbstractC31173DnH.A0a(mud, enumC33370Ep3, i), c5hw, i);
    }
}