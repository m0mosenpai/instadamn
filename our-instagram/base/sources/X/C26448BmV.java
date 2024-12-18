package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BmV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26448BmV extends AbstractC51572Yf {
    public final UserSession A00;
    public final C39G A01;
    public final InterfaceC75403a7 A02;
    public final InterfaceC87303un A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC16820sZ A05;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C206209Bd c206209Bd = (C206209Bd) this.A05.invoke();
        if (c206209Bd == null) {
            return null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(AbstractC25232BEp.A16(null, C05F.A0C, false), C05F.A0u, 0, AbstractC77623dm.A0A(c76223bS));
        Integer num = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(A00, num, 100.0f, 0);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C25523BQl c25523BQl = null;
        C86493tM c86493tM = (C86493tM) c206209Bd.A01;
        if (c86493tM != null) {
            C75113Zb c75113Zb = (C75113Zb) c206209Bd.A02;
            UserSession userSession = this.A00;
            InterfaceC60442pS interfaceC60442pS = this.A04;
            C206209Bd c206209Bd2 = new C206209Bd(DBI.A00, C30065DMz.A00, DN0.A00, 3);
            C39G c39g = this.A01;
            C51722Yv A0d2 = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
            InterfaceC80043ht interfaceC80043ht = (InterfaceC80043ht) ((InterfaceC16620sF) ((C9BH) c206209Bd.A00).A00).invoke(this.A03, this.A02);
            C68R A002 = C68P.A00(userSession);
            DOC doc = DOC.A00;
            DOD dod = DOD.A00;
            c25523BQl = new C25523BQl(c206209Bd2, A0d2, userSession, A002, null, c86493tM, c39g, interfaceC80043ht, interfaceC60442pS, c75113Zb, null, null, DBB.A00, BRB.A00, C30061DMv.A00, doc, dod, 0, 0, false, false, false, false);
        }
        return AbstractC25227BEk.A0V(c25523BQl, A12, c76223bS, A0d);
    }

    public C26448BmV(UserSession userSession, C39G c39g, InterfaceC75403a7 interfaceC75403a7, InterfaceC87303un interfaceC87303un, InterfaceC60442pS interfaceC60442pS, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC25234BEr.A1R(interfaceC60442pS, userSession, c39g, interfaceC87303un, interfaceC75403a7);
        this.A05 = interfaceC16820sZ;
        this.A04 = interfaceC60442pS;
        this.A00 = userSession;
        this.A01 = c39g;
        this.A03 = interfaceC87303un;
        this.A02 = interfaceC75403a7;
    }
}
