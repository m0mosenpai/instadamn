package com.instagram.comments.mvvm.data;

import X.AbstractC001800i;
import X.AbstractC06950Ym;
import X.AbstractC166327c1;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC50567MTy;
import X.AnonymousClass139;
import X.AnonymousClass191;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0UO;
import X.C0eB;
import X.C10E;
import X.C115925Mi;
import X.C115935Mj;
import X.C14360o3;
import X.C166007bS;
import X.C166027bU;
import X.C166047bW;
import X.C166057bY;
import X.C166137bh;
import X.C166157bj;
import X.C166187bm;
import X.C166217bp;
import X.C167297di;
import X.C168567fq;
import X.C169307h4;
import X.C19L;
import X.C1JX;
import X.C206329Bp;
import X.C206409Bx;
import X.C206749Df;
import X.C206999Ee;
import X.C26025BfE;
import X.C38321qM;
import X.C43211J8i;
import X.C4A7;
import X.C4A8;
import X.C50125MBz;
import X.C50154MDh;
import X.C50371MLy;
import X.C50533MSm;
import X.C51618MrB;
import X.C57682kh;
import X.C69613Av;
import X.C92674Dc;
import X.C92694De;
import X.C9BH;
import X.C9D3;
import X.C9FO;
import X.C9GD;
import X.D50;
import X.EnumC166147bi;
import X.EnumC166167bk;
import X.EnumC168507fk;
import X.InterfaceC16600sD;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.InterfaceC30934Dio;
import X.InterfaceC38371qR;
import X.InterfaceC60442pS;
import X.JRM;
import X.JWL;
import X.MBT;
import X.MBY;
import X.MBm;
import X.MC8;
import X.MCK;
import X.MOF;
import X.MTJ;
import X.N2C;
import X.OW1;
import X.PXZ;
import X.PYX;
import X.PZW;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class MediaCommentListRepository extends C4A7 {
    public String A00;
    public final C166187bm A01;
    public final C166057bY A02;
    public final N2C A03;
    public final C26025BfE A04;
    public final C166027bU A05;
    public final C166007bS A06;
    public final C92694De A07;
    public final C92694De A08;
    public final C92694De A09;
    public final C92694De A0A;
    public final UserSession A0B;
    public final InterfaceC60442pS A0C;
    public final String A0D;
    public final Map A0E;
    public final C05A A0F;
    public final C05A A0G;
    public final C05A A0H;
    public final C0UO A0I;
    public final C0UO A0J;
    public final C0UO A0K;
    public final C0UO A0L;
    public final C0UO A0M;
    public final C92694De A0N;
    public final C05A A0O;
    public final C05A A0P;
    public final AnonymousClass139 A0Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCommentListRepository(C166057bY c166057bY, N2C n2c, C26025BfE c26025BfE, C166027bU c166027bU, C166007bS c166007bS, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        super("MediaCommentListRepository", C4A8.A01(722993640, 3));
        FollowStatus followStatus;
        User user;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        this.A0B = userSession;
        this.A0D = str;
        this.A04 = c26025BfE;
        this.A05 = c166027bU;
        this.A03 = n2c;
        this.A02 = c166057bY;
        this.A06 = c166007bS;
        this.A0C = interfaceC60442pS;
        this.A0Q = new AnonymousClass139();
        C008002u A00 = C10E.A00(A00(this));
        this.A0H = A00;
        this.A0L = AbstractC208910l.A02(A00);
        C008002u c008002u = new C008002u(new C166157bj(EnumC166147bi.A04, null, false, false, false));
        this.A0P = c008002u;
        this.A0M = AbstractC208910l.A02(c008002u);
        C008002u c008002u2 = new C008002u(new C206409Bx(EnumC166167bk.A03, (String) null));
        this.A0G = c008002u2;
        this.A0J = AbstractC208910l.A02(c008002u2);
        C166047bW c166047bW = (C166047bW) c166027bU.A03.getValue();
        if (c166047bW != null && (user = c166047bW.A0A) != null) {
            followStatus = user.B7L();
        } else {
            followStatus = FollowStatus.A04;
        }
        C008002u c008002u3 = new C008002u(new C9BH(followStatus));
        this.A0F = c008002u3;
        this.A0I = AbstractC208910l.A02(c008002u3);
        C008002u A002 = C10E.A00(null);
        this.A0O = A002;
        this.A0K = AbstractC208910l.A02(A002);
        this.A0E = new LinkedHashMap();
        C92674Dc c92674Dc = C92674Dc.A00;
        this.A09 = new C92694De(c92674Dc);
        this.A01 = (C166187bm) userSession.A01(C166187bm.class, new C50154MDh(userSession, 15));
        this.A0N = new C92694De(c92674Dc);
        this.A08 = new C92694De(c92674Dc);
        this.A0A = new C92694De(c92674Dc);
        this.A07 = new C92694De(c92674Dc);
    }

    public static final Object A02(MediaCommentListRepository mediaCommentListRepository, C169307h4 c169307h4, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        Object A09 = A09(mediaCommentListRepository, interfaceC23621Ds, new C9GD(c169307h4, str2, str, 0));
        if (A09 != C1JX.A02) {
            return C0eB.A00;
        }
        return A09;
    }

    public static final Object A06(MediaCommentListRepository mediaCommentListRepository, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        Object A09 = A09(mediaCommentListRepository, interfaceC23621Ds, new C43211J8i(str, z, 2));
        if (A09 != C1JX.A02) {
            return C0eB.A00;
        }
        return A09;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A07(com.instagram.comments.mvvm.data.MediaCommentListRepository r12, java.util.Set r13, java.util.Set r14, X.InterfaceC23621Ds r15, X.InterfaceC16820sZ r16, X.InterfaceC16600sD r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A07(com.instagram.comments.mvvm.data.MediaCommentListRepository, java.util.Set, java.util.Set, X.1Ds, X.0sZ, X.0sD, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A09(com.instagram.comments.mvvm.data.MediaCommentListRepository r7, X.InterfaceC23621Ds r8, X.InterfaceC16660sJ r9) {
        /*
            r3 = 7
            boolean r0 = X.C206489Cf.A00(r8, r3)
            if (r0 == 0) goto L31
            r6 = r8
            X.9Cf r6 = (X.C206489Cf) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r5 = r6.A04
            X.1JX r4 = X.C1JX.A02
            int r1 = r6.A00
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L3f
            if (r1 != r0) goto L37
            java.lang.Object r2 = r6.A03
            X.139 r2 = (X.AnonymousClass139) r2
            java.lang.Object r9 = r6.A02
            X.0sJ r9 = (X.InterfaceC16660sJ) r9
            java.lang.Object r7 = r6.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r7 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r7
            X.AbstractC09560e7.A00(r5)
            goto L53
        L31:
            X.9Cf r6 = new X.9Cf
            r6.<init>(r7, r8, r3)
            goto L15
        L37:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L3f:
            X.AbstractC09560e7.A00(r5)
            X.139 r2 = r7.A0Q
            r6.A01 = r7
            r6.A02 = r9
            r6.A03 = r2
            r6.A00 = r0
            java.lang.Object r0 = X.AnonymousClass139.A00(r6, r2)
            if (r0 != r4) goto L53
            return r4
        L53:
            X.05A r1 = r7.A0H     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Throwable -> L68
            X.7bh r0 = (X.C166137bh) r0     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L68
            r1.Egh(r0)     // Catch: java.lang.Throwable -> L68
            X.0eB r4 = X.C0eB.A00     // Catch: java.lang.Throwable -> L68
            r2.A04(r3)
            return r4
        L68:
            r0 = move-exception
            r2.A04(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(com.instagram.comments.mvvm.data.MediaCommentListRepository, X.1Ds, X.0sJ):java.lang.Object");
    }

    public final void A0G(CommentGiphyMediaInfo commentGiphyMediaInfo, MOF mof, InterfaceC30934Dio interfaceC30934Dio, C51618MrB c51618MrB, C115925Mi c115925Mi, C115935Mj c115935Mj, InterfaceC38371qR interfaceC38371qR, String str) {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new MBm(commentGiphyMediaInfo, mof, interfaceC30934Dio, this, c51618MrB, c115925Mi, c115935Mj, interfaceC38371qR, str, null), c19l);
    }

    public final void A0H(MOF mof, InterfaceC30934Dio interfaceC30934Dio, InterfaceC38371qR interfaceC38371qR, String str, String str2) {
        C167297di A02 = AbstractC166327c1.A02((C166137bh) this.A0L.getValue(), str, str2);
        if (A02 != null) {
            C19L c19l = super.A01;
            AbstractC23641Du.A05(AnonymousClass191.A00, new JWL(mof, interfaceC30934Dio, this, A02, interfaceC38371qR, null), c19l);
        }
    }

    public final void A0I(InterfaceC38371qR interfaceC38371qR, String str, String str2, boolean z, boolean z2) {
        C14360o3.A0B(str, 0);
        C19L c19l = super.A01;
        MediaCommentListRepository$likeCommentAction$1 mediaCommentListRepository$likeCommentAction$1 = new MediaCommentListRepository$likeCommentAction$1(this, interfaceC38371qR, str, str2, null, z, z2);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, mediaCommentListRepository$likeCommentAction$1, c19l);
    }

    public final void A0L(Integer num, Integer num2, String str, String str2) {
        C14360o3.A0B(num, 1);
        C19L c19l = super.A01;
        C206749Df c206749Df = new C206749Df(this, num, num2, str2, str, null, 0);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206749Df, c19l);
    }

    public final void A0M(String str, String str2) {
        C14360o3.A0B(str, 0);
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new C50125MBz(this, str, str2, (InterfaceC23621Ds) null, 4), c19l);
    }

    public final void A0N(String str, String str2) {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new MBY(this, str, str2, null, 3), c19l);
    }

    public final void A0O(String str, String str2) {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new MBY(this, str, str2, null, 4), c19l);
    }

    public final void A0P(String str, String str2, String str3) {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new D50(this, str, str2, str3, null), c19l);
    }

    public final void A0Q(String str, String str2, boolean z) {
        C19L c19l = super.A01;
        MediaCommentListRepository$updateCommentRowSelection$1 mediaCommentListRepository$updateCommentRowSelection$1 = new MediaCommentListRepository$updateCommentRowSelection$1(this, str, str2, null, z);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, mediaCommentListRepository$updateCommentRowSelection$1, c19l);
    }

    public final void A0R(String str, boolean z) {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new PXZ(this, str, null, 2, z), c19l);
    }

    public final void A0S(Set set, Set set2) {
        C38321qM BQN;
        InterfaceC38371qR interfaceC38371qR;
        C38321qM BQN2;
        C14360o3.A0B(set, 0);
        C14360o3.A0B(set2, 1);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C57682kh A00 = C57682kh.A00(this.A0B);
            if (A00.A0J(str)) {
                A00.A0F(str);
            }
            C166027bU c166027bU = this.A05;
            InterfaceC38371qR interfaceC38371qR2 = c166027bU.A00;
            if (interfaceC38371qR2 != null && (BQN = interfaceC38371qR2.BQN()) != null && BQN.A6F() && (interfaceC38371qR = c166027bU.A00) != null && (BQN2 = interfaceC38371qR.BQN()) != null) {
                AbstractC50567MTy.A03(BQN2, str);
            }
        }
        AbstractC23641Du.A05(AnonymousClass191.A00, new MC8(set, this, set2, null, 19), super.A01);
    }

    public final void A0T(Set set, Set set2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16600sD interfaceC16600sD) {
        C14360o3.A0B(set, 0);
        C14360o3.A0B(set2, 1);
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new JRM(this, set, set2, interfaceC16600sD, interfaceC16820sZ, null, 1, true), c19l);
    }

    public final void A0U(Set set, Set set2, boolean z) {
        C14360o3.A0B(set, 0);
        C14360o3.A0B(set2, 1);
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new C50533MSm(set, set2, this, null, 4, z), c19l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (X.C18U.A06(r3, r4, 36323264271887486L) == false) goto L19;
     */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.7bg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C166137bh A00(com.instagram.comments.mvvm.data.MediaCommentListRepository r23) {
        /*
            X.0sl r9 = X.C16930sl.A00
            r2 = r23
            X.BfE r0 = r2.A04
            java.lang.String r15 = r0.A0F
            java.lang.String r6 = r0.A0K
            java.lang.Integer r1 = r0.A06
            if (r1 == 0) goto La3
            int r18 = r1.intValue()
        L12:
            java.lang.Integer r1 = r0.A04
            if (r1 == 0) goto L9f
            int r19 = r1.intValue()
        L1a:
            java.lang.String r5 = r0.A0A
            com.instagram.common.session.UserSession r4 = r2.A0B
            X.0Tz r3 = X.C06090Tz.A05
            r1 = 36321967191631788(0x810aa3000027ac, double:3.0334965365858786E-306)
            boolean r1 = X.C18U.A06(r3, r4, r1)
            if (r1 != 0) goto L3a
            boolean r1 = r0.A0b
            if (r1 == 0) goto L9c
            r1 = 36321967191828399(0x810aa3000327af, double:3.033496536710216E-306)
            boolean r1 = X.C18U.A06(r3, r4, r1)
            if (r1 == 0) goto L9c
        L3a:
            r22 = 1
        L3c:
            r1 = 36318741672171973(0x8107b4000f19c5, double:3.031456705091367E-306)
            boolean r1 = X.C18U.A06(r3, r4, r1)
            if (r1 == 0) goto L54
            r1 = 36323264271887486(0x810bd100022c7e, double:3.034316815362505E-306)
            boolean r1 = X.C18U.A06(r3, r4, r1)
            r23 = 1
            if (r1 != 0) goto L56
        L54:
            r23 = 0
        L56:
            r3 = 0
            java.lang.Integer r14 = X.C05F.A0u
            X.7ba r13 = X.EnumC166067ba.A04
            r11 = 0
            X.7bb r12 = new X.7bb
            r17 = r5
            r20 = r11
            r21 = r11
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 1
            X.7bc r5 = new X.7bc
            r16 = r5
            r17 = r12
            r18 = r3
            r19 = r2
            r16.<init>(r17, r18, r19, r20, r21)
            X.9Bp r1 = new X.9Bp
            r1.<init>(r15, r11)
            X.7bf r4 = new X.7bf
            r4.<init>(r1, r3, r2)
            X.9Bp r1 = new X.9Bp
            r1.<init>(r15, r2)
            X.7bg r6 = new X.7bg
            r6.<init>(r1)
            java.lang.String r8 = r0.A09
            java.lang.Integer r7 = r0.A03
            boolean r13 = r0.A0c
            boolean r14 = r0.A0Y
            X.7bh r2 = new X.7bh
            r10 = r9
            r12 = r11
            r15 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        L9c:
            r22 = 0
            goto L3c
        L9f:
            r19 = 0
            goto L1a
        La3:
            r18 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A00(com.instagram.comments.mvvm.data.MediaCommentListRepository):X.7bh");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C45127Jxw r33, X.InterfaceC30934Dio r34, com.instagram.comments.mvvm.data.MediaCommentListRepository r35, java.lang.String r36, java.lang.String r37, java.util.List r38, X.InterfaceC23621Ds r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A01(X.Jxw, X.Dio, com.instagram.comments.mvvm.data.MediaCommentListRepository, java.lang.String, java.lang.String, java.util.List, X.1Ds, boolean):java.lang.Object");
    }

    public static final Object A03(MediaCommentListRepository mediaCommentListRepository, EnumC168507fk enumC168507fk, Integer num, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        Object A09 = A09(mediaCommentListRepository, interfaceC23621Ds, new C50371MLy(num, enumC168507fk, str2, str, 15));
        if (A09 != C1JX.A02) {
            return C0eB.A00;
        }
        return A09;
    }

    public static final Object A04(MediaCommentListRepository mediaCommentListRepository, C168567fq c168567fq, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        InterfaceC16660sJ c206999Ee;
        Object value;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        C69613Av c69613Av;
        if (z) {
            N2C n2c = mediaCommentListRepository.A03;
            if (n2c != null && (c69613Av = ((MTJ) n2c).A00) != null) {
                c69613Av.A05();
            }
            C05A c05a = mediaCommentListRepository.A0P;
            do {
                value = c05a.getValue();
                z2 = !c168567fq.A09;
                z3 = c168567fq.A0A;
                List list = c168567fq.A06;
                if (list != null) {
                    arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C206329Bp) it.next()).A01);
                    }
                } else {
                    arrayList = null;
                }
            } while (!c05a.AIi(value, new C166157bj(c168567fq.A01, arrayList, z2, z3, c168567fq.A07)));
            C57682kh A00 = C57682kh.A00(mediaCommentListRepository.A0B);
            String str = mediaCommentListRepository.A04.A0F;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = A00.A07().iterator();
            while (it2.hasNext()) {
                OW1 ow1 = (OW1) it2.next();
                if (str.equals(ow1.A00().A0E)) {
                    arrayList2.add(ow1.A00());
                }
            }
            c206999Ee = new C9FO(7, mediaCommentListRepository, AbstractC001800i.A0X(arrayList2), c168567fq);
        } else {
            c206999Ee = new C206999Ee(c168567fq, 42);
        }
        Object A09 = A09(mediaCommentListRepository, interfaceC23621Ds, c206999Ee);
        if (A09 != C1JX.A02) {
            return C0eB.A00;
        }
        return A09;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(com.instagram.comments.mvvm.data.MediaCommentListRepository r7, java.lang.String r8, java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 37
            boolean r0 = X.MAO.A02(r10, r3)
            if (r0 == 0) goto L74
            r6 = r10
            X.MAO r6 = (X.MAO) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 != r4) goto L7a
            java.lang.Object r8 = r6.A02
            java.lang.Object r7 = r6.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r7 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r7
            X.AbstractC09560e7.A00(r1)
        L2a:
            java.util.Map r0 = r7.A0E
            r0.remove(r8)
        L2f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L34:
            X.AbstractC09560e7.A00(r1)
            java.util.Map r1 = r7.A0E
            boolean r0 = r1.containsKey(r8)
            if (r0 == 0) goto L72
            java.lang.Object r1 = r1.get(r8)
            X.195 r1 = (X.AnonymousClass195) r1
            if (r1 == 0) goto L4b
            r0 = 0
            r1.AGH(r0)
        L4b:
            java.util.Set r3 = java.util.Collections.singleton(r8)
            X.C14360o3.A07(r3)
            if (r9 == 0) goto L6f
            java.util.Set r2 = java.util.Collections.singleton(r9)
            X.C14360o3.A07(r2)
        L5b:
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r4
            r1 = 25
            X.MLw r0 = new X.MLw
            r0.<init>(r1, r3, r2)
            java.lang.Object r0 = A09(r7, r6, r0)
            if (r0 != r5) goto L2a
            return r5
        L6f:
            X.0sj r2 = X.C16910sj.A00
            goto L5b
        L72:
            r4 = 0
            goto L2f
        L74:
            X.MAO r6 = new X.MAO
            r6.<init>(r7, r10, r3)
            goto L16
        L7a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A05(com.instagram.comments.mvvm.data.MediaCommentListRepository, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A08(com.instagram.comments.mvvm.data.MediaCommentListRepository r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 25
            boolean r0 = X.MAG.A01(r6, r3)
            if (r0 == 0) goto L43
            r4 = r6
            X.MAG r4 = (X.MAG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L49
            java.lang.Object r5 = r4.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            X.AbstractC09560e7.A00(r1)
        L28:
            r0 = 0
            r5.A00 = r0
            X.0eB r3 = X.C0eB.A00
            return r3
        L2e:
            X.AbstractC09560e7.A00(r1)
            r1 = 23
            X.MLv r0 = new X.MLv
            r0.<init>(r5, r1)
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r0 = A09(r5, r4, r0)
            if (r0 != r3) goto L28
            return r3
        L43:
            X.MAG r4 = new X.MAG
            r4.<init>(r5, r6, r3)
            goto L16
        L49:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A08(com.instagram.comments.mvvm.data.MediaCommentListRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(X.C84923qg r13, java.lang.String r14, X.InterfaceC23621Ds r15) {
        /*
            r12 = this;
            r3 = 35
            boolean r0 = X.MAO.A02(r15, r3)
            if (r0 == 0) goto Lb2
            r5 = r15
            X.MAO r5 = (X.MAO) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb2
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r2 = r5.A03
            X.1JX r6 = X.C1JX.A02
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L87
            if (r1 != r0) goto Lbf
            java.lang.Object r13 = r5.A02
            X.3qg r13 = (X.C84923qg) r13
            java.lang.Object r3 = r5.A01
            X.4A7 r3 = (X.C4A7) r3
            X.AbstractC09560e7.A00(r2)
        L2c:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L7d
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.EC0 r0 = (X.EC0) r0
            java.lang.String r0 = r0.A00
            X.3NX r2 = new X.3NX
            r2.<init>(r0)
        L3f:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L55
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto Lb9
            java.lang.String r1 = "MediaCommentListRepository"
            java.lang.String r0 = "Error loading permalink for media"
            X.C0K8.A0C(r1, r0)
            X.0eB r0 = X.C0eB.A00
            X.8jk r2 = new X.8jk
            r2.<init>(r0)
        L55:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L7a
            java.lang.String r7 = r13.A0e
            X.0sl r9 = X.C16930sl.A00
            r4 = 0
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r8 = r2.A00
            java.lang.String r8 = (java.lang.String) r8
            r0 = 0
            com.instagram.api.schemas.MediaGenAIDetectionMethod r6 = com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B
            X.MrA r5 = new X.MrA
            r10 = r9
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.19L r2 = r3.A01
            X.B5g r1 = new X.B5g
            r1.<init>(r5, r3, r4, r0)
            X.191 r0 = X.AnonymousClass191.A00
            X.AbstractC23641Du.A05(r0, r1, r2)
        L7a:
            X.0eB r0 = X.C0eB.A00
            return r0
        L7d:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L3f
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L87:
            X.AbstractC09560e7.A00(r2)
            if (r14 == 0) goto L7a
            r5.A01 = r12
            r5.A02 = r13
            r5.A00 = r0
            com.instagram.common.session.UserSession r4 = r12.A0B
            X.1qM r3 = r13.A07
            if (r3 == 0) goto Lc7
            r2 = 0
            java.lang.Integer r1 = X.C05F.A07
            X.2pS r0 = r12.A0C
            java.lang.String r0 = r0.getModuleName()
            X.1ON r1 = X.AbstractC35242Fgb.A00(r4, r3, r2, r1, r0)
            r0 = 749780342(0x2cb0bd76, float:5.0232552E-12)
            java.lang.Object r2 = r1.A00(r0, r5)
            if (r2 != r6) goto Laf
            return r6
        Laf:
            r3 = r12
            goto L2c
        Lb2:
            X.MAO r5 = new X.MAO
            r5.<init>(r12, r15, r3)
            goto L16
        Lb9:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lbf:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lc7:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A0A(X.3qg, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0B(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A0B(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0C(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r3 = 21
            boolean r0 = X.MAS.A03(r6, r3)
            if (r0 == 0) goto L54
            r4 = r6
            X.MAS r4 = (X.MAS) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L46
            if (r0 != r1) goto L5c
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L3c
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.EBZ r0 = (X.EBZ) r0
            boolean r0 = r0.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.3NX r3 = new X.3NX
            r3.<init>(r0)
        L3b:
            return r3
        L3c:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L3b
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L46:
            X.AbstractC09560e7.A00(r3)
            com.instagram.common.session.UserSession r0 = r5.A0B
            r4.A00 = r1
            java.lang.Object r3 = com.instagram.comments.mvvm.data.network.DeleteCommentUpsellRequestsKt.A00(r0, r4)
            if (r3 != r2) goto L24
            return r2
        L54:
            r0 = 42
            X.MAS r4 = new X.MAS
            r4.<init>(r5, r6, r3, r0)
            goto L16
        L5c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A0C(X.1Ds):java.lang.Object");
    }

    public final void A0D() {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new PYX(this, null, 0), c19l);
    }

    public final void A0E() {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new MBT(this, null, 18), c19l);
    }

    public final void A0F() {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new MBT(this, null, 20), c19l);
    }

    public final void A0J(C166217bp c166217bp) {
        C19L c19l = super.A01;
        C9D3 c9d3 = new C9D3(this, c166217bp, (InterfaceC23621Ds) null, 22);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, c19l);
    }

    public final void A0K(Integer num) {
        if (((C166137bh) this.A0L.getValue()).A03.A00.A03 != num) {
            C19L c19l = super.A01;
            AbstractC23641Du.A05(AnonymousClass191.A00, new MCK(num, this, (InterfaceC23621Ds) null, 26), c19l);
        }
    }

    public final void A0V(UUID uuid) {
        C19L c19l = super.A01;
        C9D3 c9d3 = new C9D3(this, uuid, (InterfaceC23621Ds) null, 23);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, c19l);
    }

    public final void A0W(InterfaceC16820sZ interfaceC16820sZ) {
        C19L c19l = super.A01;
        C9D3 c9d3 = new C9D3(this, interfaceC16820sZ, (InterfaceC23621Ds) null, 21);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, c19l);
    }

    public final void A0X(InterfaceC16660sJ interfaceC16660sJ) {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new MC8((InterfaceC23621Ds) null, interfaceC16660sJ, this, 18), c19l);
    }

    public final void A0Y(boolean z) {
        C19L c19l = super.A01;
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZW(this, (InterfaceC23621Ds) null, 14, z), c19l);
    }
}
