package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.BoR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26568BoR extends AbstractC51572Yf {
    public static final InterfaceC89793zL A09;
    public final int A00;
    public final int A01;
    public final C120985dq A02;
    public final C37644Ghd A03;
    public final C38321qM A04;
    public final InterfaceC31137Dmc A05;
    public final InterfaceC30980Djb A06;
    public final List A07;
    public final UserSession A08;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Object A03;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C29869DFj.A00);
        C77123cy A002 = AbstractC77063cs.A00(c76223bS, C29870DFk.A00);
        Number number = (Number) A00.A03;
        String A0O = AnonymousClass001.A0O("subtitle_transition_key", number.intValue());
        List list = this.A07;
        int size = list.size();
        ArrayList A17 = AbstractC25225BEi.A17(size);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            A17.add(AnonymousClass001.A0O("subtitle_transition_key", i2));
        }
        String[] strArr = (String[]) A17.toArray(new String[0]);
        EnumC76913cd enumC76913cd = EnumC76913cd.GLOBAL;
        C89813zN A01 = AbstractC51432Xq.A01(enumC76913cd, (String[]) Arrays.copyOf(strArr, strArr.length));
        A01.A03(AbstractC79463gt.A05);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        A01.A04(C89893zV.A00(context, 5));
        A01.A05(C89893zV.A00(context, -5));
        InterfaceC89793zL interfaceC89793zL = A09;
        A01.A02 = interfaceC89793zL;
        A01.A02(AbstractC25230BEn.A02(A01, AbstractC79463gt.A00));
        A01.A02 = interfaceC89793zL;
        AbstractC89903zW.A00(c76223bS, A01);
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            A03 = list.get(0);
        } else {
            Context A003 = AbstractC77363dM.A00(c76223bS);
            int A07 = (int) ((AbstractC13880nE.A07(A003) - (AbstractC167017dG.A04(A003) * 2)) * 0.5d);
            boolean A06 = C18U.A06(C06090Tz.A05, this.A08, 36328761830227732L);
            C75933ay c75933ay = C51722Yv.A02;
            long A0K = AbstractC25229BEm.A0K(A07);
            Integer num = C05F.A00;
            C51722Yv A004 = C9CU.A00(null, num, 0, A0K);
            long A0F = AbstractC25229BEm.A0F();
            Integer num2 = C05F.A01;
            C51722Yv A005 = C9CU.A00(A004, num2, 0, A0F);
            C25310BIf c25310BIf = new C25310BIf(A06, 48);
            Integer num3 = C05F.A02;
            if (!A06) {
                c25310BIf = null;
            }
            C51722Yv A0e = AbstractC25230BEn.A0e(AbstractC25230BEn.A0e(AbstractC25231BEo.A0Y(AbstractC25230BEn.A0d(C9CV.A00(C9CV.A00(A005, num3, c25310BIf, 4), num, EnumC77683ds.STRETCH, 3), num2, 1.0f, 1), DRP.A00(this, 5)), num, new C29924DHm(4000L, A00, A002, this, 3), null), num2, DRP.A00(A002, 7), null);
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
            for (Object obj : list) {
                int i3 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                AbstractC50812Vc abstractC50812Vc = (AbstractC50812Vc) obj;
                if (i == number.intValue()) {
                    String A0O2 = AnonymousClass001.A0O("subtitle_component_key_", i);
                    C2XE c2xe2 = A0P.A00;
                    C2WF A032 = AbstractC76963ci.A03(AbstractC25232BEp.A11(abstractC50812Vc, c2xe2), A0P, AbstractC25231BEo.A0W(c2xe2, null, enumC76913cd, A0O));
                    AbstractC107374si.A01(A032, A0O2);
                    A0P.A00(A032);
                }
                i = i3;
            }
            A03 = AbstractC76963ci.A03(A0P, c76223bS, A0e);
        }
        return (AbstractC50812Vc) A03;
    }

    static {
        EnumC76913cd enumC76913cd = AbstractC51432Xq.A04;
        A09 = new C89803zM(500);
    }

    public C26568BoR(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C38321qM c38321qM, InterfaceC31137Dmc interfaceC31137Dmc, InterfaceC30980Djb interfaceC30980Djb, List list, int i, int i2) {
        AbstractC167007dF.A1J(interfaceC31137Dmc, 8, userSession);
        this.A07 = list;
        this.A06 = interfaceC30980Djb;
        this.A04 = c38321qM;
        this.A02 = c120985dq;
        this.A03 = c37644Ghd;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = interfaceC31137Dmc;
        this.A08 = userSession;
    }
}
