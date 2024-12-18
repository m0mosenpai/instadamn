package X;

import android.view.View;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GAH implements GZH {
    public final C31250DoY A00;
    public final FJM A01;
    public final InterfaceC16820sZ A02;

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(c5hw, 0);
        User A04 = c5hw.A04();
        if (A04 != null) {
            this.A00.A7A(mud, c5hw, A04, i);
            FJM fjm = this.A01;
            String id = A04.getId();
            BIM.A00(fjm.A00, fjm.A01, id, i);
            this.A02.invoke();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public GAH(C31250DoY c31250DoY, FJM fjm, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c31250DoY;
        this.A01 = fjm;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (enumC33370Ep3 == EnumC33370Ep3.A08 && c5hw.A04() != null) {
            return true;
        }
        return false;
    }
}
