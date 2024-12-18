package X;

import android.text.TextUtils;
import com.meta.foa.session.FoaUserSession;
import java.util.List;

/* renamed from: X.Blo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26405Blo extends AbstractC51572Yf {
    public final FoaUserSession A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;
    public final C27884CQv A03;

    public C26405Blo(FoaUserSession foaUserSession, C27884CQv c27884CQv, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C14360o3.A0B(c27884CQv, 2);
        this.A00 = foaUserSession;
        this.A03 = c27884CQv;
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C29835DEb.A00);
        FoaUserSession foaUserSession = this.A00;
        CPY cpy = (CPY) C29910DGy.A00(c76223bS, A00, new Object[]{foaUserSession}, 34);
        Object obj = A00.A03;
        AbstractC77313dH.A00(c76223bS, C29896DGk.A00(A00, this, 44), new Object[]{obj});
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 1.0f, 1));
        Integer num2 = C05F.A00;
        C51722Yv A0b = AbstractC25233BEq.A0b(A0h, num2, 0);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        long A0I = AbstractC25230BEn.A0I();
        long A0F = AbstractC25229BEm.A0F();
        Integer num3 = C05F.A04;
        C51722Yv A0F2 = AbstractC25234BEr.A0F(null, AbstractC25225BEi.A0n(num3, 0, A0I), 0, A0F);
        Integer num4 = C05F.A1I;
        C51722Yv A002 = C9CU.A00(A0F2, num4, 0, A0F);
        Integer num5 = C05F.A0C;
        C51722Yv A0d = AbstractC25230BEn.A0d(A002, num5, 0.0f, 1);
        C2Z0 A13 = AbstractC25232BEp.A13(A12);
        C14360o3.A0B(foaUserSession, 0);
        String A0G = AbstractC77623dm.A0G(A13, AbstractC25229BEm.A0m(C06090Tz.A05, AbstractC28057CYl.A00(foaUserSession), 36607238920476214L), 2131966201);
        C88 c88 = C88.A0Z;
        long A0M = AbstractC25230BEn.A0M();
        C93E c93e = C93E.CENTER;
        long A0J = AbstractC25229BEm.A0J();
        A13.A00(new C26567BoQ(C9CU.A00(null, num4, 0, A0J), c93e, c88, A0G, num3, 0, A0M, A0M));
        C30170DRa A003 = C30170DRa.A00(this, A13, 9);
        BYS bys = new BYS(A13);
        A003.invoke(bys);
        CharSequence expandTemplate = TextUtils.expandTemplate(AbstractC77623dm.A0F(A13, 2131966199), bys);
        C14360o3.A0A(expandTemplate);
        Integer num6 = C05F.A0Y;
        AbstractC25230BEn.A1H(new C26567BoQ(C9CU.A00(null, C05F.A08, 0, A0J), c93e, c88, expandTemplate, num6, 0, A0M, A0M), A13, A12, A0d);
        A12.A00(new C26605Bp2(AbstractC25230BEn.A0d(null, num, 1.0f, 1), foaUserSession, cpy, this.A03));
        List list = (List) obj;
        if (AbstractC166987dD.A1b(list)) {
            A12.A00(new C26363Bl8(AbstractC25232BEp.A16(AbstractC25230BEn.A0d(AbstractC25233BEq.A0b(C9CU.A00(C9CU.A00(AbstractC25232BEp.A15(null, num6, EnumC77933eL.ABSOLUTE), C05F.A0j, 1, AbstractC25229BEm.A0D()), num4, 0, A0J), num2, 0), num5, 0.0f, 1), num2, AbstractC25225BEi.A0i(AbstractC28406CgC.A00(A12, C88.A0f))), list, C29896DGk.A00(list, this, 46)));
        }
        return AbstractC76963ci.A03(A12, c76223bS, A0b);
    }
}
