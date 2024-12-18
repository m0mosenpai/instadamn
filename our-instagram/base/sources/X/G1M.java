package X;

import android.content.res.Resources;

/* loaded from: classes6.dex */
public final class G1M implements InterfaceC30993Djs {
    public final /* synthetic */ GD1 A00;

    public G1M(GD1 gd1) {
        this.A00 = gd1;
    }

    @Override // X.InterfaceC30993Djs
    public final void DFf() {
        C146106i8 A0K = AbstractC31171DnF.A0K();
        Resources resources = this.A00.A00.getResources();
        AbstractC31265Don.A00();
        AbstractC31172DnG.A1H(resources, A0K, 2131952569);
        A0K.A05();
        A0K.A0H = "request_ai_agent_access_failure";
        AbstractC25233BEq.A1F(A0K);
    }

    @Override // X.InterfaceC30993Djs
    public final void DqO(Integer num) {
        AbstractC31265Don.A00();
        GD1 gd1 = this.A00;
        AbstractC35257Fgr.A07(gd1.A01, gd1.A00, EnumC33519Ers.A0E.toString());
    }
}
