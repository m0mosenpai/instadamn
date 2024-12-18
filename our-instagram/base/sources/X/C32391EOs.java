package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.EOs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32391EOs extends AbstractC193068gm {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C62862tP A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;

    public C32391EOs(AbstractC59962oe abstractC59962oe, C62862tP c62862tP, UserSession userSession, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A01 = c62862tP;
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A00 = abstractC59962oe;
    }

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        C9GR.A0F(this.A00.requireActivity(), "supervision_bloks_action_failed", 2131961896);
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        InterfaceC16820sZ interfaceC16820sZ;
        AbstractC33787EwD.A00(this.A01, AbstractC31175DnJ.A0E(obj));
        Map map = ((C31523Dt7) this.A02.A01(C31523Dt7.class, new C31520Dt4())).A00;
        C14360o3.A07(map);
        if (Integer.parseInt(String.valueOf(map.get(this.A03))) == 0) {
            interfaceC16820sZ = this.A04;
        } else {
            interfaceC16820sZ = this.A05;
        }
        interfaceC16820sZ.invoke();
    }
}
