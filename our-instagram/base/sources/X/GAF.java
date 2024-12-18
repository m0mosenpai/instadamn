package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class GAF implements GZH {
    public final C31250DoY A00;
    public final java.util.Set A01;

    public GAF(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
        java.util.Set A07 = AbstractC16830sb.A07(EnumC31336Dq1.A0L, EnumC31336Dq1.A0M, EnumC31336Dq1.A08, EnumC31336Dq1.A0l, EnumC31336Dq1.A0t, EnumC31336Dq1.A1u, EnumC31336Dq1.A2U, EnumC31336Dq1.A0j, EnumC31336Dq1.A2T, EnumC31336Dq1.A0o, EnumC31336Dq1.A2Y, EnumC31336Dq1.A37);
        ArrayList A0i = AbstractC167007dF.A0i(A07);
        Iterator it = A07.iterator();
        while (it.hasNext()) {
            A0i.add(((EnumC31336Dq1) it.next()).A00);
        }
        this.A01 = AbstractC001800i.A0k(A0i);
    }

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (enumC33370Ep3 == EnumC33370Ep3.A04 && c5hw.A07() != null) {
            return true;
        }
        return false;
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        Boolean bool;
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        C51693MsO A0a = AbstractC31173DnH.A0a(mud, enumC33370Ep3, i);
        java.util.Set set = this.A01;
        String A06 = c5hw.A06();
        if (A06 == null) {
            A06 = "";
        }
        if (!set.contains(A06) && (((bool = c5hw.A04.A0J) == null || !bool.booleanValue()) && c5hw.A08() == null && c5hw.A00 != 822)) {
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
