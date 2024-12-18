package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class CWX {
    public InterfaceC16620sF A00;
    public final InterfaceC09390do A01 = C1XM.A00(C29806DCy.A00);
    public final O8I A02;
    public final N83 A03;

    public final void A00(C26023BfC c26023BfC) {
        String A00;
        C19L A03;
        InterfaceC16620sF pzq;
        int i;
        C14360o3.A0B(c26023BfC, 0);
        N83 n83 = this.A03;
        C34698FQj c34698FQj = n83.A05;
        User user = c26023BfC.A01;
        UserSession userSession = n83.A01;
        Integer num = C05F.A00;
        if (c34698FQj.A01(userSession, user, num)) {
            A03 = n83.A03();
            i = 47;
        } else if (c26023BfC.A09 != null) {
            A03 = n83.A03();
            i = 48;
        } else {
            Boolean bool = c26023BfC.A03;
            Boolean A0b = AbstractC166997dE.A0b();
            if (!C14360o3.A0K(bool, A0b) && !C14360o3.A0K(c26023BfC.A02, A0b)) {
                C14360o3.A0B(user, 0);
                if (user.A1b()) {
                    A03 = n83.A03();
                    i = 49;
                } else {
                    O8I o8i = n83.A02;
                    String str = c26023BfC.A0B;
                    int i2 = c26023BfC.A00;
                    C14360o3.A0B(str, 0);
                    BIM.A00(o8i.A00, o8i.A01, str, i2);
                    A03 = n83.A03();
                    pzq = new PZX(n83, c26023BfC, (InterfaceC23621Ds) null, 0);
                }
            } else {
                if (C14360o3.A0K(bool, A0b)) {
                    A00 = "SCAMS";
                } else {
                    A00 = AbstractC111324zv.A00(1653);
                }
                A03 = n83.A03();
                pzq = new PZQ(c26023BfC, n83, A00, null, 4);
            }
            AbstractC23641Du.A03(num, AnonymousClass191.A00, pzq, A03);
        }
        pzq = new PZM(n83, c26023BfC, null, i);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, pzq, A03);
    }

    public final void A01(User user, boolean z, boolean z2) {
        C14360o3.A0B(user, 0);
        N83 n83 = this.A03;
        n83.A04.A06(user, new C57245PbT(n83, 41), new C57752Pjf(n83, 10), z, z2);
    }

    public final void A02(String str, int i) {
        C14360o3.A0B(str, 0);
        O8I o8i = this.A02;
        BIM.A03(o8i.A00, o8i.A01, str, i);
        InterfaceC16620sF interfaceC16620sF = this.A00;
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(str, MSV.A00(441));
        }
    }

    public final void A03(String str, int i) {
        C14360o3.A0B(str, 0);
        if (((java.util.Set) this.A01.getValue()).add(str)) {
            O8I o8i = this.A02;
            BIM.A02(o8i.A00, o8i.A01, str, i);
        }
    }

    public final void A04(String str, int i) {
        C14360o3.A0B(str, 0);
        O8I o8i = this.A02;
        BIM.A01(o8i.A00, o8i.A01, str, i);
        N83 n83 = this.A03;
        AbstractC166987dD.A1Z(new PZ1(n83, str, null, 6), n83.A03());
    }

    public CWX(O8I o8i, N83 n83) {
        this.A03 = n83;
        this.A02 = o8i;
    }
}
