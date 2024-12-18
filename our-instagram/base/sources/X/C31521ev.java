package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1ev, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31521ev implements InterfaceC29421bJ {
    public static final C0KV A02 = C31531ew.A00;
    public final InterfaceC09390do A00;
    public final InterfaceC08830cm A01;

    private final void A00(MNP mnp, C31481er c31481er, DirectThreadKey directThreadKey) {
        C83693oE c83693oE;
        InterfaceC08830cm interfaceC08830cm = this.A01;
        C2DS c2ds = (C2DS) this.A00.getValue();
        JTV jtv = (JTV) mnp;
        String str = jtv.A02;
        C114675Fx c114675Fx = jtv.A01;
        C14360o3.A0B(interfaceC08830cm, 0);
        C14360o3.A0B(c2ds, 1);
        C14360o3.A0B(str, 4);
        DirectForwardingParams A03 = c31481er.A03();
        C83403nh BSh = c2ds.BSh(new DirectThreadKey(A03.A07), A03.A06);
        if (BSh != null) {
            C2EY c2ey = BSh.A10;
            C14360o3.A07(c2ey);
            String str2 = c31481er.A05;
            String str3 = directThreadKey.A00;
            if (str3 != null) {
                c83693oE = new C83693oE(str3);
            } else {
                c83693oE = null;
            }
            AbstractC47000KqJ.A00(c114675Fx, c2ds, directThreadKey, "forward_message", str2, str2, str, new M8U(BSh, c31481er, c83693oE, c2ey, str2, interfaceC08830cm));
        }
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C31481er c31481er = (C31481er) c1ow;
        C14360o3.A0B(c31481er, 0);
        C14360o3.A0B(mnp, 1);
        A00(mnp, c31481er, c31481er.C7Q());
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
        C31481er c31481er = (C31481er) c1ow;
        C14360o3.A0B(c31481er, 0);
        ((C2DS) this.A00.getValue()).EFl(c31481er.C7Q(), null, c31481er.A05);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C31481er c31481er = (C31481er) c1ow;
        C14360o3.A0B(c31481er, 0);
        C14360o3.A0B(mnp2, 2);
        A00(mnp2, c31481er, c31481er.C7Q());
    }

    public C31521ev(UserSession userSession) {
        this.A00 = AbstractC09440dt.A01(new C9E1(userSession, 21));
        this.A01 = new B26(userSession);
    }
}
