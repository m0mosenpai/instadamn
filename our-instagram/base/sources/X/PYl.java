package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes9.dex */
public final class PYl extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01 = 0;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYl(C47603L0o c47603L0o, InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, Integer num, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A05 = c47603L0o;
        this.A03 = c38321qM;
        this.A02 = interfaceC11380iw;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = z;
        this.A04 = num;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A01 != 0) {
            C51924Mx6 c51924Mx6 = (C51924Mx6) this.A05;
            boolean z = this.A08;
            String str = this.A07;
            C38688GzT c38688GzT = (C38688GzT) this.A02;
            return new PYl((C51759Mti) this.A03, (C51759Mti) this.A00, c38688GzT, c51924Mx6, str, this.A06, (List) this.A04, interfaceC23621Ds, z);
        }
        C47603L0o c47603L0o = (C47603L0o) this.A05;
        C38321qM c38321qM = (C38321qM) this.A03;
        PYl pYl = new PYl(c47603L0o, (InterfaceC11380iw) this.A02, c38321qM, (Integer) this.A04, this.A07, this.A06, interfaceC23621Ds, this.A08);
        pYl.A00 = obj;
        return pYl;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        Long l;
        Long l2;
        if (this.A01 != 0) {
            AbstractC09560e7.A00(obj);
            InterfaceC58303Psv interfaceC58303Psv = ((C51924Mx6) this.A05).A05;
            boolean z = this.A08;
            String str2 = this.A07;
            return new C26230Biu((C51759Mti) this.A03, (C51759Mti) this.A00, (C38688GzT) this.A02, interfaceC58303Psv, str2, this.A06, C16930sl.A00, (List) this.A04, z);
        }
        AbstractC09560e7.A00(obj);
        C19L c19l = (C19L) this.A00;
        C47603L0o c47603L0o = (C47603L0o) this.A05;
        C38321qM c38321qM = (C38321qM) this.A03;
        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
        AbstractC166987dD.A1Z(new MCP(this.A04, c38321qM, c47603L0o, interfaceC11380iw, null, 24), c19l);
        String str3 = this.A07;
        String str4 = this.A06;
        boolean z2 = this.A08;
        UserSession userSession = c47603L0o.A02;
        AbstractC167017dG.A1P(interfaceC11380iw, c38321qM);
        String id = c38321qM.getId();
        if (id != null) {
            User A14 = AbstractC25226BEj.A14(c38321qM);
            if (A14 != null) {
                str = A14.getId();
            } else {
                str = null;
            }
            String A00 = AbstractC43591JPw.A00(340);
            if (str3 != null) {
                l = AbstractC25231BEo.A0j(0, C38801rC.A06(str3));
            } else {
                l = null;
            }
            if (str4 != null) {
                l2 = AbstractC25231BEo.A0j(0, C38801rC.A06(str4));
            } else {
                l2 = null;
            }
            AbstractC73317Y7a.A08(interfaceC11380iw, userSession, l, l2, null, id, str, A00, "system_share_sheet", null, null, c38321qM.A0C.getLoggingInfoToken(), z2);
            return C0eB.A00;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYl) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYl(C51759Mti c51759Mti, C51759Mti c51759Mti2, C38688GzT c38688GzT, C51924Mx6 c51924Mx6, String str, String str2, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A05 = c51924Mx6;
        this.A08 = z;
        this.A07 = str;
        this.A02 = c38688GzT;
        this.A03 = c51759Mti;
        this.A04 = list;
        this.A00 = c51759Mti2;
        this.A06 = str2;
    }
}
