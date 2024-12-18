package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1fF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31721fF implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1fG
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-770600406);
            int A032 = C0f9.A03(-1307772806);
            C31721fF c31721fF = new C31721fF(userSession);
            C0f9.A0A(-1788224544, A032);
            C0f9.A0A(219953827, A03);
            return c31721fF;
        }
    };
    public final UserSession A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        Integer num;
        C31701fD c31701fD = (C31701fD) c1ow;
        KVZ kvz = c31701fD.A01;
        if (c31701fD.A00.A00()) {
            num = C05F.A01;
            LE3 le3 = (LE3) this.A01.getValue();
            C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
            C14360o3.A07(c31701fD.A01.A02);
            String str = c31701fD.A01.A03;
            DirectThreadKey C7Q = c31701fD.C7Q();
            boolean z = false;
            if (c31701fD.A00 == EnumC159397Cz.A05) {
                z = true;
            }
            LE3.A00(new C36426G5b(le3, c31701fD, c31281Dp3, num), c31701fD, le3, C7Q, str, z);
        } else {
            num = C05F.A00;
            UserSession userSession = this.A00;
            C1ON A00 = AbstractC46911Kos.A00(userSession, "visual_item_seen", kvz.A04, kvz.A02, kvz.A03, ((C1OW) c31701fD).A02.A09, c31701fD.A06);
            A00.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A03(A00);
        }
        C162337Ov.A0Y(c19260xA, num);
    }

    public C31721fF(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8k
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new LE3(UserSession.this);
            }
        });
    }
}
