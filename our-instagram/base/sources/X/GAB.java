package X;

import android.graphics.RectF;
import android.view.View;

/* loaded from: classes6.dex */
public final class GAB implements GZH {
    public final C31250DoY A00;

    public GAB(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (c5hw.A05 == C5Hd.USER_REEL) {
            if (enumC33370Ep3 == EnumC33370Ep3.A02 || enumC33370Ep3 == EnumC33370Ep3.A04) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        RectF rectF;
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (view != null) {
            rectF = AbstractC31174DnI.A0A(view);
        } else {
            rectF = null;
        }
        this.A00.Ddu(rectF, AbstractC31173DnH.A0a(mud, enumC33370Ep3, i), c5hw, i);
    }
}
