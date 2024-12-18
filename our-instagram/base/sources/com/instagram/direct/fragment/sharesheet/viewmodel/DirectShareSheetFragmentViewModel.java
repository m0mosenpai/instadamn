package com.instagram.direct.fragment.sharesheet.viewmodel;

import X.AbstractC122135g5;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16830sb;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.AbstractC33785EwB;
import X.AbstractC52922bZ;
import X.AbstractC58232lf;
import X.AnonymousClass191;
import X.C006802i;
import X.C008002u;
import X.C00O;
import X.C05A;
import X.C06090Tz;
import X.C10E;
import X.C14360o3;
import X.C16930sl;
import X.C18A;
import X.C18U;
import X.C2GT;
import X.C32755EbL;
import X.C33089Ein;
import X.C34491FId;
import X.C34586FLv;
import X.C36285Fzc;
import X.C37047GUd;
import X.C38321qM;
import X.C50251MHg;
import X.C5e4;
import X.C70805WhL;
import X.E6G;
import X.EnumC33375Ep8;
import X.FFC;
import X.FI0;
import X.FKR;
import X.G05;
import X.GKP;
import X.InterfaceC11380iw;
import X.InterfaceC23621Ds;
import X.InterfaceC62612t0;
import X.JZ1;
import X.MC9;
import X.MCI;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository;
import com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class DirectShareSheetFragmentViewModel extends AbstractC52922bZ implements InterfaceC62612t0 {
    public int A00;
    public C5e4 A01;
    public InterfaceC11380iw A02;
    public C38321qM A03;
    public C38321qM A04;
    public String A05;
    public String A06;
    public String A07;
    public final C2GT A08;
    public final C2GT A09;
    public final C2GT A0A;
    public final C2GT A0B;
    public final C2GT A0C;
    public final C2GT A0D;
    public final C2GT A0E;
    public final C2GT A0F;
    public final C2GT A0G;
    public final C2GT A0H;
    public final C2GT A0I;
    public final C2GT A0J;
    public final C2GT A0K;
    public final C2GT A0L;
    public final UserSession A0M;
    public final FKR A0N;
    public final DirectShareSheetRecipientRepository A0O;
    public final C33089Ein A0P;
    public final DirectShareSheetApi A0Q;
    public final C34586FLv A0R;
    public final G05 A0S;
    public final C18A A0T;
    public final C70805WhL A0U;
    public final FI0 A0V;
    public final AtomicBoolean A0W;
    public final AtomicBoolean A0X;
    public final AtomicBoolean A0Y;
    public final AtomicReference A0Z;
    public final C05A A0a;
    public final C05A A0b;
    public final C05A A0c;
    public final C05A A0d;
    public final C05A A0e;
    public final C05A A0f;
    public final C05A A0g;
    public final C05A A0h;
    public final C05A A0i;
    public final C05A A0j;
    public final C05A A0k;
    public final C05A A0l;
    public final C05A A0m;
    public final C05A A0n;
    public final C05A A0o;
    public final boolean A0p;
    public final boolean A0q;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.FLv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.FFY] */
    public /* synthetic */ DirectShareSheetFragmentViewModel(UserSession userSession, FKR fkr, DirectShareSheetApi directShareSheetApi, G05 g05, C18A c18a, boolean z, boolean z2) {
        DirectShareSheetRecipientRepository directShareSheetRecipientRepository = new DirectShareSheetRecipientRepository(userSession, directShareSheetApi);
        C33089Ein c33089Ein = new C33089Ein(userSession);
        AbstractC167017dG.A1Q(userSession, c18a);
        AbstractC167007dF.A1G(fkr, 4, g05);
        this.A0M = userSession;
        this.A0Q = directShareSheetApi;
        this.A0T = c18a;
        this.A0N = fkr;
        this.A0S = g05;
        this.A0p = z;
        this.A0q = z2;
        this.A0O = directShareSheetRecipientRepository;
        this.A0P = c33089Ein;
        this.A0W = new AtomicBoolean(false);
        this.A0Y = new AtomicBoolean(false);
        this.A0X = new AtomicBoolean(false);
        this.A0Z = new AtomicReference(null);
        ArrayList A1E = AbstractC166987dD.A1E();
        ?? obj = new Object();
        obj.A00 = null;
        obj.A02 = null;
        obj.A01 = null;
        obj.A03 = A1E;
        this.A0R = obj;
        ?? obj2 = new Object();
        obj2.A00 = false;
        C008002u A1H = AbstractC25225BEi.A1H(obj2);
        this.A0o = A1H;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A0L = AbstractC58232lf.A00(anonymousClass191, A1H);
        C008002u A00 = C10E.A00(null);
        this.A0c = A00;
        this.A09 = AbstractC58232lf.A00(anonymousClass191, A00);
        C008002u A002 = C10E.A00(null);
        this.A0m = A002;
        this.A0J = AbstractC58232lf.A00(anonymousClass191, A002);
        C008002u A003 = C10E.A00(null);
        this.A0a = A003;
        this.A08 = AbstractC58232lf.A00(anonymousClass191, A003);
        C008002u A004 = C10E.A00(null);
        this.A0h = A004;
        this.A0E = AbstractC58232lf.A00(anonymousClass191, A004);
        C008002u A005 = C10E.A00(null);
        this.A0l = A005;
        this.A0I = AbstractC58232lf.A00(anonymousClass191, A005);
        C008002u A006 = C10E.A00(null);
        this.A0k = A006;
        this.A0H = AbstractC58232lf.A00(anonymousClass191, A006);
        C008002u A1H2 = AbstractC25225BEi.A1H("");
        this.A0f = A1H2;
        this.A0C = AbstractC58232lf.A00(anonymousClass191, A1H2);
        C008002u A007 = C10E.A00(null);
        this.A0j = A007;
        this.A0G = AbstractC58232lf.A00(anonymousClass191, A007);
        C008002u A008 = C10E.A00(null);
        this.A0d = A008;
        this.A0A = AbstractC58232lf.A00(anonymousClass191, A008);
        C16930sl c16930sl = C16930sl.A00;
        C008002u A009 = C10E.A00(c16930sl);
        this.A0n = A009;
        this.A0K = AbstractC58232lf.A00(anonymousClass191, A009);
        C008002u A0010 = C10E.A00(null);
        this.A0g = A0010;
        this.A0D = AbstractC58232lf.A00(anonymousClass191, A0010);
        C008002u A0011 = C10E.A00(c16930sl);
        this.A0i = A0011;
        this.A0F = AbstractC58232lf.A00(anonymousClass191, A0011);
        this.A0b = AbstractC25225BEi.A1H(AbstractC166987dD.A1E());
        C008002u A0012 = C10E.A00(c16930sl);
        this.A0e = A0012;
        this.A0B = AbstractC58232lf.A00(anonymousClass191, A0012);
        this.A05 = "forwarding_recipient_sheet";
        this.A06 = "forwarding_recipient_sheet";
        this.A0V = new FI0(userSession);
        this.A0U = (C70805WhL) userSession.A01(C70805WhL.class, C37047GUd.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.FFY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0C(X.EnumC33375Ep8 r14, java.lang.String r15, X.InterfaceC23621Ds r16) {
        /*
            r13 = this;
            r10 = r15
            r7 = r14
            r3 = 39
            r4 = r16
            boolean r0 = X.MAL.A01(r4, r3)
            if (r0 == 0) goto Lc5
            r6 = r4
            X.MAL r6 = (X.MAL) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc5
            int r2 = r2 - r1
            r6.A00 = r2
        L1a:
            java.lang.Object r1 = r6.A04
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r9 = 0
            r4 = 1
            if (r0 == 0) goto L8c
            if (r0 != r4) goto Lcc
            java.lang.Object r7 = r6.A03
            java.lang.Object r10 = r6.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r6.A01
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r8 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r8
            X.AbstractC09560e7.A00(r1)
        L33:
            r9 = r1
            X.5eT r9 = (X.C121305eT) r9
            boolean r1 = r8.A0q
            if (r1 == 0) goto L52
            boolean r0 = A08(r8)
            if (r0 == 0) goto L52
            java.lang.String r2 = r9.A01
            java.util.List r1 = r9.A02
            X.FLv r0 = r8.A0R
            java.util.List r0 = r0.A03
            A06(r8, r2, r1, r0)
        L4b:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.A0Y
            r0 = 0
            r1.set(r0)
        L51:
            return r9
        L52:
            if (r9 == 0) goto L4b
            if (r1 == 0) goto L6e
            java.util.List r0 = r9.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6e
            X.6aw r0 = X.AbstractC141776au.A00(r8)
            r11 = 0
            r12 = 8
            X.MVR r6 = new X.MVR
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.AbstractC166987dD.A1Z(r6, r0)
            goto L4b
        L6e:
            X.2GT r0 = r8.A0E
            java.lang.Object r1 = r0.A02()
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r0 = r9.A02
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            r8.A0G(r1, r0)
            X.05A r1 = r8.A0h
            java.lang.String r0 = r9.A01
            r1.Egh(r0)
            X.05A r0 = r8.A0m
            r0.Egh(r9)
            goto L4b
        L8c:
            X.AbstractC09560e7.A00(r1)
            X.05A r1 = r13.A0o
            X.FFY r0 = new X.FFY
            r0.<init>()
            r0.A00 = r4
            r1.Egh(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.A0Y
            boolean r0 = r0.getAndSet(r4)
            if (r0 != 0) goto L51
            com.instagram.common.session.UserSession r3 = r13.A0M
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36313441681803272(0x8102e200040808, double:3.0281049698408525E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lb3
            r9 = r15
        Lb3:
            r6.A01 = r13
            r6.A02 = r15
            r6.A03 = r14
            r6.A00 = r4
            java.lang.Object r1 = A02(r13, r9, r6)
            if (r1 != r5) goto Lc2
            return r5
        Lc2:
            r8 = r13
            goto L33
        Lc5:
            X.MAL r6 = new X.MAL
            r6.<init>(r13, r4, r3)
            goto L1a
        Lcc:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A0C(X.Ep8, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.FFY] */
    public final void A0E(EnumC33375Ep8 enumC33375Ep8, String str) {
        C14360o3.A0B(str, 0);
        C05A c05a = this.A0o;
        ?? obj = new Object();
        obj.A00 = true;
        c05a.Egh(obj);
        AbstractC166987dD.A1Z(new MC9(this, enumC33375Ep8, str, (InterfaceC23621Ds) null, 37), AbstractC141776au.A00(this));
    }

    public final void A0F(EnumC33375Ep8 enumC33375Ep8, String str, String str2, List list) {
        AbstractC167017dG.A1O(list, str2);
        if (this.A0q && !list.isEmpty()) {
            AbstractC166987dD.A1Z(new JZ1(list, enumC33375Ep8, this, str, str2, null, 5), AbstractC141776au.A00(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r25, java.lang.String r26, java.lang.String r27, X.InterfaceC23621Ds r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A01(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel, java.lang.String, java.lang.String, X.1Ds, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:24|25))(4:26|(2:28|(7:34|(2:47|(1:49)(1:50))(1:38)|39|40|(1:42)|43|(2:45|46)))|14|(2:20|21)(1:18))|12|(1:22)|14|(1:16)|20|21))|54|6|7|(0)(0)|12|(0)|14|(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
    
        r11.A0Z.set(true);
        r3 = X.AbstractC33785EwB.A00(r11.A0M);
        r1 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
    
        if (r3.A03 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
    
        r3.A00 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5 A[Catch: 40k -> 0x00f9, TRY_LEAVE, TryCatch #0 {40k -> 0x00f9, blocks: (B:11:0x00e1, B:12:0x00e4, B:22:0x00f5, B:40:0x00c2, B:42:0x00ce, B:43:0x00d0), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r11, java.lang.String r12, X.InterfaceC23621Ds r13) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A02(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r22, java.lang.String r23, X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A03(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final String A04(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel) {
        C38321qM A1e;
        C38321qM c38321qM = directShareSheetFragmentViewModel.A04;
        if (c38321qM == null) {
            return null;
        }
        if (c38321qM.A5M()) {
            int i = directShareSheetFragmentViewModel.A0N.A00;
            if (i == -1 || (A1e = c38321qM.A1e(i)) == null) {
                return null;
            }
            return A1e.A2u();
        }
        return c38321qM.A2u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
    
        if (r24 != null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0210  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.FFY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r23, X.C60484R0k r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A05(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel, X.R0k, java.lang.String):void");
    }

    public static final void A06(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel, String str, List list, List list2) {
        directShareSheetFragmentViewModel.A0G((String) directShareSheetFragmentViewModel.A0E.A02(), AbstractC166987dD.A1b(list));
        directShareSheetFragmentViewModel.A0h.Egh(str);
        directShareSheetFragmentViewModel.A0c.Egh(new C34491FId(list, list2));
    }

    public static final boolean A07(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel) {
        UserSession userSession = directShareSheetFragmentViewModel.A0M;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36324320834039915L) && !C18U.A06(c06090Tz, userSession, 36324320834236526L) && !C18U.A06(c06090Tz, userSession, 36324320834302063L)) {
            return false;
        }
        return true;
    }

    public static final boolean A08(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel) {
        if (C18U.A06(C06090Tz.A05, directShareSheetFragmentViewModel.A0M, 36313441681868809L)) {
            if (!AbstractC16830sb.A07("forwarding_recipient_sheet", "story_share_sheet").contains(directShareSheetFragmentViewModel.A05)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A09(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel, User user) {
        UserSession userSession = directShareSheetFragmentViewModel.A0M;
        FFC ffc = (FFC) userSession.A01(FFC.class, new C50251MHg(userSession, 43));
        if (user.CQw()) {
            if (C18U.A06(C06090Tz.A05, ffc.A00, 36315520445713770L)) {
                return true;
            }
        }
        return false;
    }

    public final GKP A0A() {
        FKR fkr = this.A0N;
        if (fkr instanceof C32755EbL) {
            return ((C32755EbL) fkr).A00;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36328856319180623L) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0B() {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A0B():java.lang.Object");
    }

    public final String A0D() {
        C38321qM c38321qM;
        int i;
        C38321qM c38321qM2 = this.A04;
        boolean z = true;
        if (c38321qM2 == null || !c38321qM2.A5M()) {
            z = false;
        }
        if (z && (i = this.A0N.A00) != -1) {
            C38321qM c38321qM3 = this.A04;
            if (c38321qM3 == null) {
                return null;
            }
            c38321qM = c38321qM3.A1e(i);
        } else {
            c38321qM = this.A04;
        }
        if (c38321qM == null) {
            return null;
        }
        return c38321qM.A2u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.FFY] */
    public final void A0G(String str, boolean z) {
        C05A c05a = this.A0o;
        ?? obj = new Object();
        obj.A00 = false;
        c05a.Egh(obj);
        G05 g05 = this.A0S;
        boolean z2 = this.A0q;
        UserSession userSession = this.A0M;
        long A01 = C18U.A01(C06090Tz.A06, userSession, 36594916658382826L);
        C006802i c006802i = g05.A0F;
        c006802i.markerAnnotate(13376502, 0, "is_private_share", z2);
        c006802i.markerAnnotate(13376502, 0, "timeout_ms", A01);
        c006802i.markerPoint(13376502, "sharesheet_rendered");
        short s = 3;
        if (z) {
            s = 2;
        }
        c006802i.markerEnd(13376502, s);
        C36285Fzc A00 = AbstractC33785EwB.A00(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A02;
        if (interfaceC11380iw != null) {
            A00.A00(interfaceC11380iw, Boolean.valueOf(z2), (Boolean) this.A0Z.getAndSet(null), str, System.currentTimeMillis(), true);
        } else {
            C14360o3.A0F("analyticsModule");
            throw C00O.createAndThrow();
        }
    }

    public final boolean A0H() {
        C38321qM c38321qM = this.A04;
        if (c38321qM != null && c38321qM.CdW()) {
            return true;
        }
        C38321qM c38321qM2 = this.A04;
        if (c38321qM2 != null && c38321qM2.A5D()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (!this.A0X.getAndSet(true)) {
            AbstractC166987dD.A1Z(new MCI(this, null), AbstractC141776au.A00(this));
        }
    }

    public static final DirectShareTarget A00(User user, List list) {
        Iterator it = list.iterator();
        DirectShareTarget directShareTarget = null;
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            C14360o3.A0B(A0m, 1);
            if (A0m.A0B().size() == 1 && A0m.A0B().contains(user.getId())) {
                it.remove();
                directShareTarget = A0m;
            }
        }
        if (directShareTarget == null) {
            return AbstractC122135g5.A01(user, null, null, null);
        }
        return directShareTarget;
    }

    public final boolean A0I() {
        if (A04(this) != null) {
            for (Object obj : AbstractC31172DnG.A0w(this.A0e)) {
                if (C14360o3.A0K(((E6G) obj).A01, A04(this))) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return true;
    }
}
