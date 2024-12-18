package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HG2 extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public HG2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj4;
        this.A04 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        if (r1.length() != 0) goto L35;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L24;
                case 1: goto L5;
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.onFail(r7)
            return
        L9:
            r0 = 732152194(0x2ba3c182, float:1.1635556E-12)
            int r3 = X.C0f9.A03(r0)
            java.lang.Object r2 = r6.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r6.A02
            X.GyV r0 = (X.C38628GyV) r0
            int r1 = r0.A01
            java.lang.String r0 = "fail"
            X.C9GR.A0F(r2, r0, r1)
            r0 = -122149075(0xfffffffff8b8272d, float:-2.9880538E34)
            goto Ld6
        L24:
            r0 = 1489404532(0x58c68274, float:1.7461088E15)
            int r3 = X.AbstractC167017dG.A0N(r7, r0)
            java.lang.Object r5 = r6.A03
            X.FO4 r5 = (X.FO4) r5
            if (r5 != 0) goto L46
            java.lang.Object r4 = r6.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r2 = r6.A02
            X.1qM r2 = (X.C38321qM) r2
            boolean r0 = X.AbstractC37301Gc2.A1a(r4, r2)
            if (r0 == 0) goto Led
            X.3d3 r1 = X.EnumC77173d3.A02
            X.3d3 r0 = X.EnumC77173d3.A03
        L43:
            X.I0H.A00(r4, r1, r0, r2)
        L46:
            boolean r0 = r7 instanceof X.C115115Ig
            if (r0 == 0) goto L72
            if (r5 == 0) goto L72
            java.lang.Object r4 = r6.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r2 = r6.A02
            X.1qM r2 = (X.C38321qM) r2
            boolean r0 = X.AbstractC37301Gc2.A1a(r4, r2)
            if (r0 == 0) goto Le7
            X.3d3 r1 = X.EnumC77173d3.A02
            X.3d3 r0 = X.EnumC77173d3.A03
        L5e:
            X.I0H.A00(r4, r1, r0, r2)
            X.2kS r1 = X.C57532kS.A00(r4)
            java.lang.String r0 = r5.A03
            java.lang.Object r0 = r1.A05(r0)
            if (r5 != r0) goto L72
            java.lang.String r0 = r5.A03
            r1.A0F(r0)
        L72:
            java.lang.Object r0 = r6.A01
            X.JH8 r0 = (X.JH8) r0
            if (r0 == 0) goto L7b
            r0.onFail(r7)
        L7b:
            java.lang.Object r5 = r7.A00()
            X.HAO r5 = (X.HAO) r5
            java.util.HashMap r4 = X.AbstractC166987dD.A1G()
            java.lang.String r2 = ""
            if (r5 == 0) goto L95
            int r0 = r5.mStatusCode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L96
        L95:
            r1 = r2
        L96:
            java.lang.String r0 = "error_code"
            r4.put(r0, r1)
            if (r5 == 0) goto Le4
            boolean r0 = r5.A01
            if (r0 == 0) goto Lda
            java.lang.String r1 = "like_si_blocked"
        La3:
            java.lang.String r0 = "error_key"
            r4.put(r0, r1)
            if (r5 == 0) goto Lb4
            java.lang.String r0 = r5.getErrorMessage()
            if (r0 == 0) goto Lb4
            java.lang.String r2 = r5.getErrorMessage()
        Lb4:
            java.lang.String r0 = "error_message"
            r4.put(r0, r2)
            java.lang.Object r0 = r6.A02
            java.lang.String r1 = X.AbstractC37300Gc1.A0V(r0)
            java.lang.String r0 = "m_pk"
            r4.put(r0, r1)
            X.1Xy r2 = X.AbstractC53854Nri.A00()
            java.lang.String r1 = "latest_like_error"
            X.O9r r0 = new X.O9r
            r0.<init>(r1, r4)
            X.1Xx r2 = (X.C28191Xx) r2
            r2.A00 = r0
            r0 = 135513335(0x813c4f7, float:4.4467734E-34)
        Ld6:
            X.C0f9.A0A(r0, r3)
            return
        Lda:
            java.lang.String r1 = r5.A00
            if (r1 == 0) goto Le4
            int r0 = r1.length()
            if (r0 != 0) goto La3
        Le4:
            java.lang.String r1 = "like_client_error"
            goto La3
        Le7:
            X.3d3 r1 = X.EnumC77173d3.A03
            X.3d3 r0 = X.EnumC77173d3.A02
            goto L5e
        Led:
            X.3d3 r1 = X.EnumC77173d3.A03
            X.3d3 r0 = X.EnumC77173d3.A02
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HG2.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        EnumC77173d3 enumC77173d3;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1397832674);
                HAO hao = (HAO) obj;
                int A0N = AbstractC167017dG.A0N(hao, 764161072);
                FO4 fo4 = (FO4) this.A03;
                if (fo4 != null) {
                    C57532kS A00 = C57532kS.A00((UserSession) this.A04);
                    if (fo4 == A00.A05(fo4.A03)) {
                        A00.A0F(fo4.A03);
                        Map map = A00.A01;
                        String str = fo4.A03;
                        if (fo4.A02.equals("like")) {
                            enumC77173d3 = EnumC77173d3.A02;
                        } else {
                            enumC77173d3 = EnumC77173d3.A03;
                        }
                        map.put(str, enumC77173d3);
                    }
                }
                JH8 jh8 = (JH8) this.A01;
                if (jh8 != null) {
                    jh8.Dpz(hao);
                }
                C0f9.A0A(663651593, A0N);
                i = 958880083;
                break;
            case 1:
                A03 = C0f9.A03(-928851721);
                int A032 = C0f9.A03(1643985431);
                ((AbstractC57542kT) this.A03).A0F(((FLC) this.A02).A01);
                AbstractC25651Mw.A00(((C42509Iro) this.A04).A02).E4s(new C42243InT((AlC) this.A01));
                C0f9.A0A(602526040, A032);
                i = 1004019725;
                break;
            case 2:
                A03 = C0f9.A03(-619372366);
                int A033 = C0f9.A03(-1997630108);
                C38321qM c38321qM = (C38321qM) this.A03;
                c38321qM.A0C.EUt(null);
                c38321qM.AEH((AbstractC12990ll) this.A04);
                C9GR.A07((Context) this.A01, ((C38628GyV) this.A02).A05);
                C0f9.A0A(1831499364, A033);
                i = 164585834;
                break;
            default:
                A03 = C0f9.A03(1726897581);
                int A034 = C0f9.A03(1111390522);
                C39465Hbr c39465Hbr = (C39465Hbr) this.A04;
                List list = (List) this.A03;
                Object obj2 = this.A01;
                C1ON A002 = AbstractC40649I0h.A00(c39465Hbr.A01, list);
                C37484Gf2.A00(A002, obj2, list, 25);
                C1GJ.A03(A002);
                C0f9.A0A(-1243143683, A034);
                i = 420946423;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
