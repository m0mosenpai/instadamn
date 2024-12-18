package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FvS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36030FvS implements XCT {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    public C36030FvS(AbstractC59962oe abstractC59962oe, UserSession userSession, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A00 = abstractC59962oe;
    }

    @Override // X.XCT
    public final void onFailure(Throwable th) {
        C9GR.A0F(this.A00.requireActivity(), "supervision_bloks_action_failed", 2131961896);
    }

    @Override // X.XCT
    public final void onSuccess() {
        InterfaceC16820sZ interfaceC16820sZ;
        Map map = ((C31523Dt7) this.A01.A01(C31523Dt7.class, new C31520Dt4())).A00;
        C14360o3.A07(map);
        if (Integer.parseInt(String.valueOf(map.get(this.A02))) == 0) {
            interfaceC16820sZ = this.A03;
        } else {
            interfaceC16820sZ = this.A04;
        }
        interfaceC16820sZ.invoke();
    }
}
