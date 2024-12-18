package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ivm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42748Ivm implements InterfaceC65342xW {
    public InterfaceC61752rc A00;
    public List A01;
    public int A02;
    public final UserSession A03;
    public final List A04;
    public final java.util.Set A05;
    public final boolean A06;
    public final InterfaceC11380iw A07;
    public final IER A08;
    public final C155376yQ A09;
    public final InterfaceC60442pS A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C42748Ivm r14, java.lang.Object r15, java.util.List r16, int r17) {
        /*
            r2 = r15
            boolean r0 = r15 instanceof X.C38321qM
            r4 = r16
            r1 = r17
            if (r0 == 0) goto L32
            r8 = r2
            X.1qM r8 = (X.C38321qM) r8
            java.lang.String r0 = r8.getId()
            if (r0 == 0) goto L31
            java.util.Set r7 = r14.A05
            java.lang.String r0 = r8.getId()
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L8b
            java.lang.String r0 = r8.getId()
        L22:
            r7.add(r0)
        L25:
            java.util.List r0 = r14.A04
            r0.add(r1, r15)
            X.2rc r0 = r14.A00
            if (r0 == 0) goto L31
            r0.DNG(r15, r1)
        L31:
            return
        L32:
            boolean r0 = r15 instanceof X.C40971v4
            if (r0 == 0) goto L6c
            r0 = r2
            X.1v4 r0 = (X.C40971v4) r0
            X.1qM r6 = r0.A0K
            java.lang.String r0 = r6.getId()
            if (r0 == 0) goto L31
            java.util.Set r7 = r14.A05
            java.lang.String r0 = r6.getId()
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L67
            boolean r0 = r14.A0C
            if (r0 != 0) goto L67
            com.instagram.common.session.UserSession r3 = r14.A03
            X.1Ai r0 = X.AbstractC23021Ah.A00(r3)
            boolean r0 = X.AbstractC61652rS.A08(r3, r0)
            if (r0 != 0) goto L67
            boolean r0 = X.C5SG.A00(r3, r6)
            if (r0 != 0) goto L67
            r4.add(r6)
            return
        L67:
            java.lang.String r0 = r6.getId()
            goto L22
        L6c:
            boolean r0 = r15 instanceof X.C47K
            if (r0 == 0) goto L25
            int r0 = r14.A02
            if (r0 == 0) goto L78
            boolean r0 = r14.A0B
            if (r0 != 0) goto L31
        L78:
            java.util.List r0 = r14.A04
            r0.add(r1, r15)
            X.2rc r0 = r14.A00
            if (r0 == 0) goto L84
            r0.DNG(r15, r1)
        L84:
            int r0 = r14.A02
            int r0 = r0 + 1
            r14.A02 = r0
            return
        L8b:
            boolean r0 = r8.CdW()
            if (r0 != 0) goto Le2
            boolean r0 = r14.A06
            if (r0 == 0) goto Le2
            com.instagram.common.session.UserSession r0 = r14.A03
            X.3YO r7 = X.C3YM.A00(r0)
            r6 = 0
            java.util.List r5 = r14.A04
            int r3 = r5.size()
        La2:
            if (r6 >= r3) goto Le2
            java.lang.Object r0 = r5.get(r6)
            boolean r0 = r0 instanceof X.C38321qM
            if (r0 == 0) goto Ldf
            java.lang.String r10 = r8.getId()
            java.lang.Object r9 = r5.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.media.Media"
            X.C14360o3.A0C(r9, r0)
            java.lang.String r0 = X.AbstractC37300Gc1.A0V(r9)
            boolean r0 = X.C14360o3.A0K(r10, r0)
            if (r0 == 0) goto Ldf
            X.3YP r10 = X.C3YP.A03
            java.lang.Integer r11 = X.C05F.A00
            r14 = 0
            java.lang.String r17 = r8.getId()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            X.BUc r9 = new X.BUc
            r15 = r14
            r16 = r14
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r7.A07(r9)
        Ldf:
            int r6 = r6 + 1
            goto La2
        Le2:
            r4.add(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42748Ivm.A00(X.Ivm, java.lang.Object, java.util.List, int):void");
    }

    public final boolean A04(String str) {
        C38321qM c38321qM;
        for (Object obj : this.A01) {
            if (obj instanceof C38321qM) {
                c38321qM = (C38321qM) obj;
            } else if (obj instanceof C40971v4) {
                c38321qM = ((C40971v4) obj).A0K;
            } else {
                continue;
            }
            if (C14360o3.A0K(c38321qM.getId(), str)) {
                return true;
            }
        }
        return false;
    }

    public static final void A01(C42748Ivm c42748Ivm, List list) {
        IER ier = c42748Ivm.A08;
        if (ier != null && AbstractC166987dD.A1b(list)) {
            UserSession userSession = ier.A00;
            list.size();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C38321qM A0i = AbstractC31172DnG.A0i(it);
                if (A0i.CdW()) {
                    C32U.A0O(userSession, new C5SE(userSession, A0i), A0i, ier.A01, Integer.valueOf(A0i.A0n()), "duplicate_ad_received", A0i.A2w(), AbstractC166987dD.A1J("duplicate_ad_inserted"), AbstractC166987dD.A1J("duplicate_ad_received"));
                }
            }
        }
    }

    public final void A02() {
        List list = this.A04;
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        for (Object obj : list) {
            if (obj instanceof C38321qM) {
                if (this.A09.EjD((C38321qM) obj)) {
                    A0q.add(obj);
                }
            } else if (obj instanceof C40971v4) {
                C38321qM c38321qM = ((C40971v4) obj).A0K;
                if (this.A09.EjD(c38321qM)) {
                    A0q.add(obj);
                } else {
                    AbstractC75103Za.A0D(this.A03, c38321qM, this.A0A, this.A0C);
                }
            } else {
                if (obj instanceof C99134ca) {
                    C99134ca c99134ca = (C99134ca) obj;
                    String str = c99134ca.A07;
                    String str2 = c99134ca.A06;
                    if (str != null && str2 != null) {
                        C38801rC c38801rC = C38321qM.A0h;
                        String A0p = AbstractC37301Gc2.A0p(str, str2);
                        if (A0p != null && C3YS.A00(this.A03).A00.getBoolean(A0p, false)) {
                        }
                    }
                }
                A0q.add(obj);
            }
        }
        this.A01 = A0q;
    }

    @Override // X.InterfaceC65342xW
    public final Iterator EWm(InterfaceC61752rc interfaceC61752rc) {
        this.A00 = interfaceC61752rc;
        return this.A04.iterator();
    }

    public C42748Ivm(InterfaceC11380iw interfaceC11380iw, UserSession userSession, IER ier, InterfaceC60442pS interfaceC60442pS, boolean z) {
        AbstractC167017dG.A1Q(userSession, interfaceC11380iw);
        C14360o3.A0B(interfaceC60442pS, 5);
        this.A03 = userSession;
        this.A0B = z;
        this.A07 = interfaceC11380iw;
        this.A08 = ier;
        this.A0A = interfaceC60442pS;
        this.A04 = AbstractC166987dD.A1E();
        this.A09 = new C155376yQ(userSession);
        this.A01 = AbstractC166987dD.A1E();
        this.A05 = AbstractC166987dD.A1H();
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0C = C18U.A06(c06090Tz, userSession, 36312866156053852L);
        this.A06 = C18U.A06(c06090Tz, userSession, 36317006504399633L);
    }

    public final void A03(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A00(this, it.next(), A1E, this.A04.size());
        }
        A01(this, A1E);
    }
}
