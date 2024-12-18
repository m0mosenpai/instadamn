package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes4.dex */
public final class AiT implements InterfaceC25194BCr {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public AiT(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C37050GUg(this, 11));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C37050GUg(this, 10));
    }

    @Override // X.InterfaceC25194BCr
    public final void FAJ(C51761Mtk c51761Mtk, InterfaceC196248mG interfaceC196248mG) {
        OVK.A00.A00(this.A00, new C24043Alf(c51761Mtk, interfaceC196248mG, this), (List) ((InterfaceC09390do) c51761Mtk.A00).getValue());
    }

    @Override // X.InterfaceC25194BCr
    public final String getIdentifier() {
        return "UnifiedConfigMutator";
    }
}
