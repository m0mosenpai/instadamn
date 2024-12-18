package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GAD implements GZH {
    public final UserSession A00;
    public final C31250DoY A01;

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(c5hw, 0);
        return AbstractC167007dF.A1X(c5hw.A05, C5Hd.COPYRIGHT_VIDEO_REINSTATED);
    }

    public GAD(UserSession userSession, C31250DoY c31250DoY) {
        this.A00 = userSession;
        this.A01 = c31250DoY;
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        String str = c5hw.A04.A0U;
        String str2 = "";
        if (str != null) {
            String A01 = new C11L("^/").A01(str, "");
            C25621Ms A0q = AbstractC25228BEl.A0q(this.A00);
            A0q.A0B(A01);
            A0q.A05();
            C1GJ.A03(AbstractC31177DnL.A0Q(A0q));
        }
        C31250DoY c31250DoY = this.A01;
        String A07 = c5hw.A07();
        if (A07 != null) {
            str2 = A07;
        }
        c31250DoY.DRM(AbstractC31173DnH.A0a(mud, enumC33370Ep3, i), c5hw, str2, i);
    }
}
