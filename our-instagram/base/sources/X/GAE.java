package X;

import android.view.View;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GAE implements GZH {
    public final C31250DoY A00;
    public final FJM A01;

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(enumC33370Ep3, 1);
        return AbstractC167007dF.A1X(enumC33370Ep3, EnumC33370Ep3.A03);
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(c5hw, 0);
        User A04 = c5hw.A04();
        if (A04 != null) {
            this.A00.D9j(mud, c5hw, i, false);
            FJM fjm = this.A01;
            String id = A04.getId();
            BIM.A01(fjm.A00, fjm.A01, id, i);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public GAE(C31250DoY c31250DoY, FJM fjm) {
        this.A00 = c31250DoY;
        this.A01 = fjm;
    }
}
