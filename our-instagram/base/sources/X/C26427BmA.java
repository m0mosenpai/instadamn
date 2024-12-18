package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BmA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26427BmA extends AbstractC51572Yf {
    public final C30E A00;
    public final InterfaceC16820sZ A01;
    public final C51722Yv A02;
    public final UserSession A03;
    public final String A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Integer num;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, new J7S(this, 47));
        AbstractC77313dH.A00(c76223bS, new ME1(3, A00, this), new Object[]{this.A04});
        Object obj = A00.A03;
        C4JD c4jd = (C4JD) obj;
        if (c4jd == C4JD.A05) {
            return new K30(this.A02, this.A03);
        }
        int ordinal = c4jd.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    num = C05F.A0C;
                } else {
                    throw AbstractC166987dD.A14(AbstractC167017dG.A0n(obj, AbstractC111324zv.A00(1839), AbstractC166987dD.A1C()));
                }
            } else {
                num = C05F.A01;
            }
        } else {
            num = C05F.A00;
        }
        C51722Yv c51722Yv = this.A02;
        C9CV A0o = AbstractC25228BEl.A0o(C05F.A1F, new C43362JEd(this, 45));
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        return new C26313BkK(AbstractC25225BEi.A0h(c51722Yv, A0o), num);
    }

    public C26427BmA(C51722Yv c51722Yv, UserSession userSession, C30E c30e, String str, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167027dH.A13(str, userSession, c30e);
        this.A04 = str;
        this.A03 = userSession;
        this.A00 = c30e;
        this.A01 = interfaceC16820sZ;
        this.A02 = c51722Yv;
    }
}
