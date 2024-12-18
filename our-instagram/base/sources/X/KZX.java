package X;

import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes8.dex */
public final class KZX extends C4A7 {
    public final KZI A00;
    public final C92694De A01;
    public final UserSession A02;
    public final C1M0 A03;
    public final String A04;
    public final String A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x017a, code lost:
    
        if (r3 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ KZX(com.instagram.common.session.UserSession r38, java.lang.String r39, java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KZX.<init>(com.instagram.common.session.UserSession, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r10, boolean r11, boolean r12) {
        /*
            r9 = this;
            r5 = 0
            r4 = r9
            if (r11 == 0) goto L3e
            X.KZI r2 = r9.A00
            java.lang.String r1 = r9.A05
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C38321qM.A0i
            java.lang.String r1 = X.C38801rC.A06(r1)
            android.util.LruCache r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            X.05A r0 = (X.C05A) r0
            if (r0 != 0) goto L4a
            com.instagram.common.session.UserSession r3 = r9.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319128223030258(0x81080e00491bf2, double:3.031701161410662E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L3c
            X.4De r0 = r9.A01
            com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2 r3 = new com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2
            r3.<init>(r9, r5, r5)
        L2e:
            X.0eB r2 = X.C0eB.A00
            java.lang.Object r1 = r0.A00(r2, r10, r3)
            X.1JX r0 = X.C1JX.A02
            if (r1 == r0) goto L39
            r1 = r2
        L39:
            if (r1 == r0) goto L49
            return r2
        L3c:
            r7 = 1
            goto L3f
        L3e:
            r7 = 0
        L3f:
            X.4De r0 = r9.A01
            com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2 r3 = new com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2
            r8 = r12
            r6 = r5
            r3.<init>(r4, r5, r6, r7, r8)
            goto L2e
        L49:
            return r1
        L4a:
            r0.getValue()
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KZX.A03(X.1Ds, boolean, boolean):java.lang.Object");
    }

    public static final void A01(C45074Jx3 c45074Jx3, KZX kzx, boolean z, boolean z2, boolean z3) {
        C45016Jw6 c45016Jw6;
        C45150Jyq c45150Jyq;
        Object value;
        C45118Jxn c45118Jxn;
        List A0X;
        String str;
        String str2;
        Object obj;
        ArrayList A0S;
        Object value2;
        C45118Jxn c45118Jxn2;
        List A0X2;
        String str3;
        Object value3;
        List A0X3;
        MUD mud;
        C45170JzB c45170JzB;
        C50679MYx c50679MYx;
        boolean z4;
        Integer num;
        Integer num2;
        boolean z5;
        boolean z6;
        boolean z7;
        C38321qM c38321qM;
        List list;
        Object obj2;
        C38634Gyb c38634Gyb = c45074Jx3.A01;
        if (c38634Gyb != null) {
            c45016Jw6 = new C45016Jw6(Hx8.A00(c38634Gyb), C05F.A00);
        } else {
            c45016Jw6 = null;
        }
        List list2 = c45074Jx3.A05;
        ArrayList A0i = AbstractC167007dF.A0i(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A0i.add(new C45016Jw6(Hx8.A00((C38634Gyb) it.next()), C05F.A01));
        }
        String str4 = c45074Jx3.A02;
        if (c38634Gyb != null && (list = c38634Gyb.A05) != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (C14360o3.A0K(((C45150Jyq) obj2).A02.A0C.getPk(), str4)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            c45150Jyq = (C45150Jyq) obj2;
        } else {
            c45150Jyq = null;
        }
        if (z) {
            ArrayList A0S2 = AbstractC001800i.A0S(A0i, AbstractC166987dD.A1J(c45016Jw6));
            C05A c05a = kzx.A07;
            do {
                value3 = c05a.getValue();
                C45118Jxn c45118Jxn3 = (C45118Jxn) value3;
                A0X3 = AbstractC001800i.A0X(A0S2);
                C50679MYx c50679MYx2 = c45074Jx3.A00;
                mud = new MUD(Boolean.valueOf(c45074Jx3.A06), c50679MYx2.A00, c50679MYx2.A01, 9);
                if (c45150Jyq != null) {
                    c45170JzB = new C45170JzB(c45150Jyq.A02);
                } else {
                    c45170JzB = null;
                }
                c50679MYx = new C50679MYx(c45074Jx3.A04, c45074Jx3.A03, 18);
                z4 = c45074Jx3.A08;
                if (c45074Jx3.A07) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A01;
                }
                if (z3) {
                    num2 = C05F.A01;
                } else {
                    num2 = C05F.A0C;
                }
                z5 = c45118Jxn3.A08;
                z6 = c45118Jxn3.A07;
                z7 = c45118Jxn3.A09;
                c38321qM = c45118Jxn3.A03;
                C14360o3.A0B(A0X3, 5);
                C14360o3.A0B(num, 9);
                C14360o3.A0B(num2, 10);
            } while (!c05a.AIi(value3, new C45118Jxn(c50679MYx, mud, c45170JzB, c38321qM, num, num2, A0X3, z5, z6, z7, z4)));
            return;
        }
        if (z2) {
            C05A c05a2 = kzx.A07;
            MUD mud2 = ((C45118Jxn) c05a2.getValue()).A01;
            if (mud2 != null && AbstractC166997dE.A1Z(mud2.A00, true) && AbstractC166987dD.A1b(A0i) && AbstractC166987dD.A1b(((C45118Jxn) c05a2.getValue()).A06)) {
                C45016Jw6 c45016Jw62 = (C45016Jw6) AbstractC001800i.A0K(((C45118Jxn) c05a2.getValue()).A06);
                List list3 = ((C45118Jxn) c05a2.getValue()).A06;
                C14360o3.A0B(list3, 0);
                int A03 = AbstractC31172DnG.A03(list3, 1);
                if (A03 < 0) {
                    A03 = 0;
                }
                List A0d = AbstractC001800i.A0d(list3, A03);
                C45016Jw6 c45016Jw63 = (C45016Jw6) AbstractC001800i.A0I(A0i);
                List A0c = AbstractC001800i.A0c(A0i, 1);
                C45051Jwg c45051Jwg = c45016Jw63.A00;
                ArrayList A0S3 = AbstractC001800i.A0S(c45051Jwg.A05, c45016Jw62.A00.A05);
                String str5 = c45051Jwg.A04;
                String str6 = c45051Jwg.A03;
                ThreadHeaderStyle threadHeaderStyle = c45051Jwg.A01;
                ThreadContainerType threadContainerType = c45051Jwg.A00;
                C38615GyI c38615GyI = c45051Jwg.A02;
                AbstractC25233BEq.A0w(0, str5, A0S3, threadContainerType);
                C45051Jwg c45051Jwg2 = new C45051Jwg(threadContainerType, threadHeaderStyle, c38615GyI, str5, str6, A0S3);
                Integer num3 = c45016Jw63.A01;
                C14360o3.A0B(num3, 1);
                A0S = AbstractC001800i.A0S(A0c, AbstractC001800i.A0T(new C45016Jw6(c45051Jwg2, num3), A0d));
            } else {
                A0S = AbstractC001800i.A0S(AbstractC001800i.A0S(A0i, AbstractC166987dD.A1J(c45016Jw6)), ((C45118Jxn) c05a2.getValue()).A06);
            }
            do {
                value2 = c05a2.getValue();
                c45118Jxn2 = (C45118Jxn) value2;
                A0X2 = AbstractC001800i.A0X(A0S);
                MUD mud3 = c45118Jxn2.A01;
                if (mud3 != null) {
                    str3 = mud3.A02;
                } else {
                    str3 = null;
                }
            } while (!c05a2.AIi(value2, C45118Jxn.A00(new MUD(Boolean.valueOf(c45074Jx3.A06), c45074Jx3.A00.A00, str3, 9), c45118Jxn2, null, C05F.A0C, A0X2, 671, false, false, false, c45074Jx3.A08)));
            return;
        }
        ArrayList A0S4 = AbstractC001800i.A0S(A0i, AbstractC166987dD.A1J(c45016Jw6));
        C05A c05a3 = kzx.A07;
        ArrayList A0S5 = AbstractC001800i.A0S(((C45118Jxn) c05a3.getValue()).A06, A0S4);
        do {
            value = c05a3.getValue();
            c45118Jxn = (C45118Jxn) value;
            A0X = AbstractC001800i.A0X(A0S5);
            str = c45074Jx3.A00.A01;
            MUD mud4 = c45118Jxn.A01;
            if (mud4 != null) {
                str2 = mud4.A01;
                obj = mud4.A00;
            } else {
                str2 = null;
                obj = null;
            }
        } while (!c05a3.AIi(value, C45118Jxn.A00(new MUD(obj, str2, str, 9), c45118Jxn, null, C05F.A0C, A0X, 671, false, false, false, c45074Jx3.A08)));
    }

    public static final void A02(KZX kzx, String str) {
        Object value;
        C05A c05a = kzx.A07;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C45118Jxn.A00(null, (C45118Jxn) value, null, C05F.A0N, null, 1019, false, false, C14360o3.A0K(str, "geoblock_required"), false)));
    }

    public static final ArrayList A00(KZX kzx, String str, List list, boolean z) {
        ArrayList A1E = AbstractC166987dD.A1E();
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        for (C45016Jw6 c45016Jw6 : ((C45118Jxn) kzx.A07.getValue()).A06) {
            ArrayList A1E2 = AbstractC166987dD.A1E();
            C45051Jwg c45051Jwg = c45016Jw6.A00;
            for (C45072Jx1 c45072Jx1 : c45051Jwg.A05) {
                MRM mrm = c45072Jx1.A02;
                if (C14360o3.A0K(mrm.getId(), str)) {
                    if (AbstractC166987dD.A1b(list)) {
                        A1E2.addAll(list);
                    } else {
                        LineType lineType = c45072Jx1.A00;
                        ThreadItemType threadItemType = c45072Jx1.A01;
                        List list2 = c45072Jx1.A06;
                        User user = c45072Jx1.A03;
                        boolean z2 = c45072Jx1.A0A;
                        boolean z3 = c45072Jx1.A07;
                        String str2 = c45072Jx1.A05;
                        Boolean bool = c45072Jx1.A04;
                        boolean z4 = c45072Jx1.A09;
                        boolean z5 = c45072Jx1.A0B;
                        AbstractC167017dG.A1N(lineType, threadItemType);
                        C14360o3.A0B(list2, 3);
                        A1E2.add(new C45072Jx1(lineType, threadItemType, mrm, user, bool, str2, list2, z2, z3, z, z4, z5));
                    }
                } else {
                    A1E2.add(c45072Jx1);
                }
            }
            String str3 = c45051Jwg.A04;
            String str4 = c45051Jwg.A03;
            ThreadHeaderStyle threadHeaderStyle = c45051Jwg.A01;
            ThreadContainerType threadContainerType = c45051Jwg.A00;
            C38615GyI c38615GyI = c45051Jwg.A02;
            AbstractC167007dF.A1F(str3, 0, threadContainerType);
            C45051Jwg c45051Jwg2 = new C45051Jwg(threadContainerType, threadHeaderStyle, c38615GyI, str3, str4, A1E2);
            Integer num = c45016Jw6.A01;
            C14360o3.A0B(num, 1);
            A1E.add(new C45016Jw6(c45051Jwg2, num));
            Iterator it = A1E2.iterator();
            while (it.hasNext()) {
                A0l.add(((C45072Jx1) it.next()).A02.getId());
            }
        }
        return A1E;
    }

    @Override // X.C4A7, X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        Object value;
        C16930sl c16930sl;
        Integer num;
        close();
        C05A c05a = this.A07;
        do {
            value = c05a.getValue();
            c16930sl = C16930sl.A00;
            num = C05F.A00;
        } while (!c05a.AIi(value, new C45118Jxn(null, null, null, null, num, num, c16930sl, false, false, false, false)));
    }
}
