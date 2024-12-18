package X;

import android.graphics.RectF;
import android.view.View;

/* loaded from: classes6.dex */
public final class GA2 implements GZH {
    public final C31250DoY A00;

    public GA2(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (enumC33370Ep3 == EnumC33370Ep3.A0C && (!AbstractC81033jX.A03(c5hw.A04.A0E))) {
            return true;
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
        this.A00.Dbb(rectF, AbstractC31173DnH.A0a(mud, enumC33370Ep3, i), c5hw, i);
    }
}
