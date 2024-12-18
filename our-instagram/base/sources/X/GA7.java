package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class GA7 implements GZH {
    public final C31250DoY A00;

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(c5hw, 0);
        String A07 = c5hw.A07();
        if (A07 == null || A07.length() == 0 || c5hw.A0F()) {
            return false;
        }
        return true;
    }

    public GA7(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        C51693MsO A0a = AbstractC31173DnH.A0a(mud, enumC33370Ep3, i);
        Boolean bool = c5hw.A04.A0J;
        if ((bool == null || !bool.booleanValue()) && c5hw.A08() == null && c5hw.A00 != 5) {
            this.A00.D6B(A0a, c5hw, i);
            return;
        }
        C31250DoY c31250DoY = this.A00;
        String A07 = c5hw.A07();
        if (A07 != null) {
            c31250DoY.DRM(A0a, c5hw, A07, i);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
