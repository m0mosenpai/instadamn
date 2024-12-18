package X;

import com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mgy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51046Mgy extends AbstractC52922bZ {
    public String A00;
    public String A01;
    public final C1DX A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final InterfaceC06180Ui A06;
    public final C05A A07;
    public final InterfaceC15070pN A08;
    public final C149766oT A09;
    public final StoryCommentsDashboardRepository A0A;
    public final List A0B;

    public C51046Mgy(C1DX c1dx, C149766oT c149766oT, StoryCommentsDashboardRepository storyCommentsDashboardRepository, String str, String str2) {
        AbstractC25233BEq.A0w(2, c1dx, str, str2);
        this.A0A = storyCommentsDashboardRepository;
        this.A02 = c1dx;
        this.A04 = str;
        this.A03 = str2;
        this.A09 = c149766oT;
        this.A05 = AbstractC166987dD.A1E();
        this.A0B = AbstractC166987dD.A1E();
        C16930sl c16930sl = C16930sl.A00;
        this.A07 = AbstractC25225BEi.A1H(new C51726Mt3(c16930sl, c16930sl, c16930sl));
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A06 = A00;
        this.A08 = new C06160Ug(null, A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.C51046Mgy r12, X.InterfaceC23621Ds r13) {
        /*
            r3 = 0
            boolean r0 = r13 instanceof X.PWM
            if (r0 == 0) goto L8f
            r5 = r13
            X.PWM r5 = (X.PWM) r5
            int r0 = r5.A03
            if (r0 != r3) goto L8f
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L7b
            if (r0 != r3) goto L95
            java.lang.Object r12 = r5.A01
            X.Mgy r12 = (X.C51046Mgy) r12
            X.AbstractC09560e7.A00(r1)
        L29:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L76
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r4 = r1.A00
            X.N33 r4 = (X.N33) r4
            java.lang.String r0 = r4.A00
            r12.A01 = r0
            java.util.List r1 = r4.A01
            java.util.List r0 = r12.A0B
            r0.addAll(r1)
            boolean r0 = r4.A02
            A04(r12, r0)
            X.05A r2 = r12.A07
            java.lang.Object r1 = A00(r12)
            X.Mt3 r1 = (X.C51726Mt3) r1
            boolean r0 = r4.A02
            if (r0 == 0) goto L79
            java.lang.String r4 = "has_more_items"
        L53:
            boolean r8 = r1.A06
            java.lang.Object r5 = r1.A03
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r1.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.A02
            java.util.List r7 = (java.util.List) r7
            boolean r9 = r1.A05
            boolean r10 = r1.A08
            boolean r11 = r1.A07
            boolean r12 = r1.A0A
            boolean r13 = r1.A09
            X.AbstractC25233BEq.A0v(r3, r5, r6, r7)
            X.Mt3 r3 = new X.Mt3
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2.Egh(r3)
        L76:
            X.0eB r4 = X.C0eB.A00
            return r4
        L79:
            r4 = 0
            goto L53
        L7b:
            X.AbstractC09560e7.A00(r1)
            com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository r2 = r12.A0A
            java.lang.String r1 = r12.A03
            java.lang.String r0 = r12.A01
            r5.A01 = r12
            r5.A00 = r3
            java.lang.Object r1 = r2.A00(r1, r0, r5)
            if (r1 != r4) goto L29
            return r4
        L8f:
            X.PWM r5 = new X.PWM
            r5.<init>(r12, r13, r3)
            goto L17
        L95:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51046Mgy.A02(X.Mgy, X.1Ds):java.lang.Object");
    }

    public static Object A00(C51046Mgy c51046Mgy) {
        C05A c05a = c51046Mgy.A07;
        C0UL c0ul = new C0UL(new PXT(c51046Mgy, null, 21), c05a);
        return AbstractC208910l.A01(c05a.getValue(), AbstractC141776au.A00(c51046Mgy), c0ul, C10I.A01).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C51046Mgy r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51046Mgy.A01(X.Mgy, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r0.intValue() <= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        if (r7 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        if (r7 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List A03(java.util.List r20) {
        /*
            r19 = this;
            r2 = r19
            X.1DX r1 = r2.A02
            java.lang.String r0 = r2.A03
            X.1qM r7 = r1.A02(r0)
            java.util.ArrayList r1 = X.AbstractC167017dG.A0q(r20)
            java.util.Iterator r6 = r20.iterator()
            r4 = 0
        L13:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lce
            java.lang.Object r3 = r6.next()
            int r5 = r4 + 1
            if (r4 >= 0) goto L29
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L29:
            X.1rP r3 = (X.InterfaceC38901rP) r3
            java.lang.String r12 = r3.getPk()
            if (r12 != 0) goto L37
            java.lang.String r0 = "comment"
            java.lang.String r12 = X.AnonymousClass001.A0O(r0, r4)
        L37:
            com.instagram.user.model.User r0 = r3.CDj()
            r10 = 0
            if (r0 == 0) goto Lcb
            com.instagram.common.typedurl.ImageUrl r9 = r0.Bhu()
        L42:
            com.instagram.user.model.User r0 = r3.CDj()
            if (r0 == 0) goto Lc9
            java.lang.String r13 = r0.getUsername()
        L4c:
            java.lang.Long r11 = r3.Asc()
            java.lang.String r14 = r3.getText()
            X.6oT r0 = r2.A09
            boolean r16 = r0.A00()
            if (r7 == 0) goto Lc0
            java.util.List r0 = X.MSW.A17(r7)
            if (r0 == 0) goto Lc0
            java.util.Map r4 = X.AbstractC50567MTy.A02(r0)
            java.lang.String r0 = r3.getPk()
            java.lang.Object r0 = r4.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto Lc0
            boolean r17 = r0.booleanValue()
        L76:
            java.util.List r0 = X.MSW.A17(r7)
            if (r0 == 0) goto Lc5
            java.util.Map r4 = X.AbstractC50567MTy.A01(r0)
            java.lang.String r0 = r3.getPk()
            java.lang.Number r0 = X.AbstractC37300Gc1.A0Q(r0, r4)
            if (r0 == 0) goto Lc5
            int r15 = r0.intValue()
        L8e:
            java.util.List r0 = X.MSW.A17(r7)
            if (r0 == 0) goto Laa
            java.util.Map r4 = X.AbstractC50567MTy.A01(r0)
            java.lang.String r0 = r3.getPk()
            java.lang.Number r0 = X.AbstractC37300Gc1.A0Q(r0, r4)
            if (r0 == 0) goto Laa
            int r0 = r0.intValue()
            r18 = 1
            if (r0 > 0) goto Lac
        Laa:
            r18 = 0
        Lac:
            boolean r0 = r3 instanceof X.C38891rO
            if (r0 == 0) goto Lb5
            X.3qg r10 = new X.3qg
            r10.<init>(r3)
        Lb5:
            X.MrX r8 = new X.MrX
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.add(r8)
            r4 = r5
            goto L13
        Lc0:
            r17 = 0
            if (r7 == 0) goto Lc5
            goto L76
        Lc5:
            r15 = 0
            if (r7 == 0) goto Laa
            goto L8e
        Lc9:
            r13 = r10
            goto L4c
        Lcb:
            r9 = r10
            goto L42
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51046Mgy.A03(java.util.List):java.util.List");
    }

    public static final void A04(C51046Mgy c51046Mgy, boolean z) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (InterfaceC38901rP interfaceC38901rP : c51046Mgy.A05) {
            if (AbstractC166997dE.A1Z(interfaceC38901rP.CRq(), true)) {
                A1E2.add(interfaceC38901rP);
            } else {
                A1E.add(interfaceC38901rP);
            }
        }
        List A03 = c51046Mgy.A03(A1E);
        List A032 = c51046Mgy.A03(A1E2);
        List A033 = c51046Mgy.A03(c51046Mgy.A0B);
        boolean z2 = true;
        if (!(!A1E2.isEmpty()) || z) {
            z2 = false;
        }
        boolean z3 = true;
        if (!(!r1.isEmpty()) || z) {
            z3 = false;
        }
        C05A c05a = c51046Mgy.A07;
        C51726Mt3 c51726Mt3 = (C51726Mt3) A00(c51046Mgy);
        boolean A1b = AbstractC166987dD.A1b(A03);
        boolean z4 = c51726Mt3.A06;
        String str = c51726Mt3.A04;
        boolean z5 = c51726Mt3.A07;
        boolean z6 = c51726Mt3.A09;
        AbstractC167017dG.A1R(A032, A033);
        c05a.Egh(new C51726Mt3(str, A03, A032, A033, z4, A1b, z2, z5, z3, z6));
    }
}
