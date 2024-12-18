package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1hO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33001hO implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1hP
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1706095036);
            int A032 = C0f9.A03(-1560104276);
            C33001hO c33001hO = new C33001hO(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(735780255, A032);
            C0f9.A0A(-1807567729, A03);
            return c33001hO;
        }
    };
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        List C7R = abstractC29011ae.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = abstractC29011ae.A06();
        JTa jTa = ((C1OW) abstractC29011ae).A02;
        UserSession userSession = this.A00;
        String str = abstractC29011ae.A05;
        boolean z2 = jTa.A09;
        C1ON A05 = AbstractC47995LLh.A05(userSession, jTa.A00, null, directThreadKey, A06, str, jTa.A04, z2, jTa.A07, jTa.A0A);
        A05.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A05);
        C162337Ov.A0Y(c19260xA, C05F.A00);
    }

    public C33001hO(UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
    }
}
