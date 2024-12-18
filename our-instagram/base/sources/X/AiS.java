package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes4.dex */
public final class AiS implements InterfaceC25194BCr {
    public final UserSession A00;
    public final InterfaceC09390do A01;

    public AiS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37050GUg(this, 8));
    }

    @Override // X.InterfaceC25194BCr
    public final void FAJ(C51761Mtk c51761Mtk, InterfaceC196248mG interfaceC196248mG) {
        MY8.A00.A01(this.A00, new C24048Alk(c51761Mtk, interfaceC196248mG, this), (List) ((InterfaceC09390do) c51761Mtk.A00).getValue());
    }

    @Override // X.InterfaceC25194BCr
    public final String getIdentifier() {
        return "BPLMutator";
    }
}
