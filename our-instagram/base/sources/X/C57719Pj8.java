package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Pj8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57719Pj8 extends C0YY implements InterfaceC16660sJ {
    public static final C57719Pj8 A00 = new C57719Pj8();

    public C57719Pj8() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r16v1, types: [X.Ny9, java.lang.Object] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractC52972be abstractC52972be = (AbstractC52972be) obj;
        C14360o3.A0B(abstractC52972be, 0);
        C54703OEf c54703OEf = (C54703OEf) abstractC52972be.A00(C55574OmC.A00);
        if (c54703OEf != null) {
            UserSession userSession = (UserSession) abstractC52972be.A00(C55575OmD.A00);
            if (userSession != null) {
                C147236jz c147236jz = (C147236jz) abstractC52972be.A00(C55572OmA.A00);
                if (c147236jz != null) {
                    C206329Bp c206329Bp = (C206329Bp) abstractC52972be.A00(C55573OmB.A00);
                    if (c206329Bp != null) {
                        C54705OEh c54705OEh = new C54705OEh(c54703OEf.A00.A00, userSession, c147236jz.A02, c206329Bp.A01, c147236jz.A01);
                        OB0 ob0 = c54703OEf.A01;
                        OCK ock = c54703OEf.A03;
                        OKW okw = c54703OEf.A04;
                        OSW osw = OSW.A00;
                        C28531Zo c28531Zo = C28531Zo.A04;
                        C14360o3.A07(c28531Zo);
                        C54479O5h c54479O5h = new C54479O5h(new OCL(userSession, OS8.A00, c28531Zo, osw));
                        C54569O8v c54569O8v = c54703OEf.A05;
                        C28531Zo c28531Zo2 = C28531Zo.A04;
                        C14360o3.A07(c28531Zo2);
                        C54478O5g c54478O5g = new C54478O5g(userSession);
                        C7YG A002 = C7YF.A00(userSession);
                        ?? obj2 = new Object();
                        C6Z4 A003 = C6Z3.A00(userSession);
                        return new C51048Mh0(new BP5(userSession, null), c147236jz, ob0, ock, okw, c54569O8v, c54705OEh, new OUT(userSession, c28531Zo2, A002, JV7.A00, AbstractC23021Ah.A00(userSession), A003, c54705OEh, obj2, osw, c54478O5g), c54479O5h, new OIA(userSession));
                    }
                    throw AbstractC166987dD.A14("No viewer session found");
                }
                throw AbstractC166987dD.A14("No viewer parameters found");
            }
            throw AbstractC166987dD.A14(AbstractC58317Pt9.A00(192));
        }
        throw AbstractC166987dD.A14("No use case provider found");
    }
}
