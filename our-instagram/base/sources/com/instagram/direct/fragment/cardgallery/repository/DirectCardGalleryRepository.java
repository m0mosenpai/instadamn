package com.instagram.direct.fragment.cardgallery.repository;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31180DnO;
import X.AbstractC35247Fgg;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C0eB;
import X.C10E;
import X.C14360o3;
import X.C16930sl;
import X.C1DV;
import X.C1DY;
import X.C1JX;
import X.C2JD;
import X.C32048E6a;
import X.C32050E6c;
import X.C32054E6g;
import X.C37761pD;
import X.C3DC;
import X.C50679MYx;
import X.C81663kb;
import X.C83403nh;
import X.C83473no;
import X.C910143t;
import X.E6A;
import X.E6P;
import X.E6Q;
import X.E6X;
import X.EnumC33345Eoe;
import X.EnumC33398EpV;
import X.EnumC40111tc;
import X.GWH;
import X.InterfaceC13000lm;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class DirectCardGalleryRepository implements InterfaceC13000lm {
    public final UserSession A00;
    public final C05A A01;
    public final C05A A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final C0UO A0G;
    public final C0UO A0H;
    public final C0UO A0I;
    public final C0UO A0J;
    public final C0UO A0K;
    public final C0UO A0L;
    public final C0UO A0M;
    public final C0UO A0N;
    public final C0UO A0O;
    public final C0UO A0P;
    public final C0UO A0Q;
    public final C0UO A0R;
    public final C0UO A0S;
    public final C0UO A0T;
    public final C0UO A0U;
    public final C0UO A0V;
    public final C0UO A0W;
    public final C05A A0X;
    public final C05A A0Y;

    public DirectCardGalleryRepository(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A07 = A0o;
        this.A0M = AbstractC208910l.A02(A0o);
        C008002u A00 = C10E.A00(null);
        this.A01 = A00;
        this.A0G = AbstractC208910l.A02(A00);
        C008002u A002 = C10E.A00(null);
        this.A03 = A002;
        this.A0I = AbstractC208910l.A02(A002);
        C008002u A003 = C10E.A00(null);
        this.A02 = A003;
        this.A0H = AbstractC208910l.A02(A003);
        C008002u A1H = AbstractC25225BEi.A1H(EnumC33398EpV.A08);
        this.A04 = A1H;
        this.A0J = AbstractC208910l.A02(A1H);
        C008002u A004 = C10E.A00(null);
        this.A0A = A004;
        this.A0P = AbstractC208910l.A02(A004);
        C008002u A005 = C10E.A00(null);
        this.A0C = A005;
        this.A0R = AbstractC208910l.A02(A005);
        C008002u A006 = C10E.A00(null);
        this.A0E = A006;
        this.A0V = AbstractC208910l.A02(A006);
        C008002u A007 = C10E.A00(null);
        this.A0Y = A007;
        this.A0U = AbstractC208910l.A02(A007);
        C008002u A008 = C10E.A00(null);
        this.A0B = A008;
        this.A0Q = AbstractC208910l.A02(A008);
        C008002u A1H2 = AbstractC25225BEi.A1H(0);
        this.A05 = A1H2;
        this.A0K = AbstractC208910l.A02(A1H2);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A08 = A1A;
        this.A0N = AbstractC208910l.A02(A1A);
        C008002u A009 = C10E.A00(null);
        this.A0X = A009;
        this.A0T = AbstractC208910l.A02(A009);
        C008002u A0010 = C10E.A00(null);
        this.A06 = A0010;
        this.A0L = AbstractC208910l.A02(A0010);
        C008002u A0011 = C10E.A00(null);
        this.A09 = A0011;
        this.A0O = AbstractC208910l.A02(A0011);
        C008002u A0012 = C10E.A00(null);
        this.A0D = A0012;
        this.A0S = AbstractC208910l.A02(A0012);
        C008002u A0013 = C10E.A00(null);
        this.A0F = A0013;
        this.A0W = AbstractC208910l.A02(A0013);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, X.InterfaceC23621Ds r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A01(com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    public static final void A02(DirectCardGalleryRepository directCardGalleryRepository) {
        C05A c05a = directCardGalleryRepository.A07;
        Iterable<C32050E6c> A0w = AbstractC31172DnG.A0w(c05a);
        ArrayList A0q = AbstractC167017dG.A0q(A0w);
        for (C32050E6c c32050E6c : A0w) {
            UserSession userSession = directCardGalleryRepository.A00;
            EnumC33398EpV enumC33398EpV = (EnumC33398EpV) directCardGalleryRepository.A04.getValue();
            C14360o3.A0B(enumC33398EpV, 0);
            A0q.add(AbstractC35247Fgg.A01(userSession, c32050E6c, enumC33398EpV.A00));
        }
        c05a.Egh(A0q);
    }

    private final void A03(String str) {
        this.A0Y.Egh(str);
        C05A c05a = this.A0F;
        AbstractCollection abstractCollection = (AbstractCollection) c05a.getValue();
        if (abstractCollection != null && abstractCollection.contains(str)) {
            ArrayList A1E = AbstractC166987dD.A1E();
            RandomAccess randomAccess = (ArrayList) c05a.getValue();
            if (randomAccess == null) {
                randomAccess = C16930sl.A00;
            }
            A1E.addAll(randomAccess);
            A1E.remove(str);
            c05a.Egh(A1E);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(com.instagram.model.direct.DirectThreadKey r7, com.instagram.model.direct.messageid.MessageIdentifier r8, X.InterfaceC23621Ds r9, X.InterfaceC16820sZ r10) {
        /*
            r6 = this;
            r3 = 9
            boolean r0 = X.MAK.A01(r9, r3)
            if (r0 == 0) goto L78
            r4 = r9
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r2 = r4.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L50
            if (r0 != r3) goto L83
            java.lang.Object r10 = r4.A02
            X.0sZ r10 = (X.InterfaceC16820sZ) r10
            java.lang.Object r1 = r4.A01
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.AbstractC09560e7.A00(r2)
        L2c:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L47
            r10.invoke()
            X.3NX r2 = X.AbstractC25227BEk.A0i()
        L37:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L44
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L7e
            X.05A r0 = r1.A0C
            X.AbstractC166997dE.A1Y(r0, r3)
        L44:
            X.0eB r5 = X.C0eB.A00
        L46:
            return r5
        L47:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L37
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L50:
            X.AbstractC09560e7.A00(r2)
            com.instagram.common.session.UserSession r2 = r6.A00
            X.0sl r1 = X.C16930sl.A00
            java.lang.String r0 = X.AbstractC68470VSb.A00()
            X.1Ms r2 = X.AbstractC47995LLh.A04(r2, r7, r8, r0, r1)
            java.lang.Class<X.EDg> r1 = X.C32207EDg.class
            java.lang.Class<X.FUv> r0 = X.C34793FUv.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r4.A01 = r6
            r4.A02 = r10
            r4.A00 = r3
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r2 = r1.A00(r0, r4)
            if (r2 == r5) goto L46
            r1 = r6
            goto L2c
        L78:
            X.MAK r4 = new X.MAK
            r4.<init>(r6, r9, r3)
            goto L16
        L7e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L83:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A04(com.instagram.model.direct.DirectThreadKey, com.instagram.model.direct.messageid.MessageIdentifier, X.1Ds, X.0sZ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(com.instagram.model.direct.DirectThreadKey r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, X.InterfaceC23621Ds r16) {
        /*
            r11 = this;
            r3 = 10
            r5 = r16
            boolean r0 = X.MAK.A01(r5, r3)
            if (r0 == 0) goto L82
            r4 = r5
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r5 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L52
            if (r0 != r2) goto L8d
            java.lang.Object r15 = r4.A02
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r1 = r4.A01
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.AbstractC09560e7.A00(r5)
        L2e:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L49
            r1.A03(r15)
            X.3NX r5 = X.AbstractC25227BEk.A0i()
        L39:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 != 0) goto L46
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 == 0) goto L88
            X.05A r0 = r1.A0C
            X.AbstractC166997dE.A1Y(r0, r2)
        L46:
            X.0eB r3 = X.C0eB.A00
        L48:
            return r3
        L49:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto L39
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L52:
            X.AbstractC09560e7.A00(r5)
            com.instagram.common.session.UserSession r5 = r11.A00
            java.lang.Integer r8 = X.C05F.A01
            java.util.List r10 = X.AbstractC166987dD.A1J(r15)
            com.instagram.model.direct.messageid.MessageIdentifier r7 = new com.instagram.model.direct.messageid.MessageIdentifier
            r7.<init>(r14, r13)
            r9 = 0
            r6 = r12
            X.1Ms r6 = X.AbstractC47995LLh.A03(r5, r6, r7, r8, r9, r10)
            java.lang.Class<X.EDg> r5 = X.C32207EDg.class
            java.lang.Class<X.FUv> r1 = X.C34793FUv.class
            r0 = 0
            X.1ON r1 = X.AbstractC31172DnG.A0R(r9, r6, r5, r1, r0)
            r4.A01 = r11
            r4.A02 = r15
            r4.A00 = r2
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r5 = r1.A00(r0, r4)
            if (r5 == r3) goto L48
            r1 = r11
            goto L2e
        L82:
            X.MAK r4 = new X.MAK
            r4.<init>(r11, r5, r3)
            goto L18
        L88:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A05(com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(com.instagram.model.direct.DirectThreadKey r15, java.lang.String r16, java.lang.String r17, X.InterfaceC23621Ds r18, X.InterfaceC16660sJ r19, int r20) {
        /*
            r14 = this;
            r4 = r16
            r2 = r19
            r5 = r20
            r6 = 4
            r7 = r18
            boolean r0 = X.MAI.A01(r7, r6)
            if (r0 == 0) goto Lc9
            r8 = r7
            X.MAI r8 = (X.MAI) r8
            int r3 = r8.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lc9
            int r3 = r3 - r1
            r8.A01 = r3
        L1d:
            java.lang.Object r7 = r8.A05
            X.1JX r6 = X.C1JX.A02
            int r0 = r8.A01
            r3 = 1
            if (r0 == 0) goto L9f
            if (r0 != r3) goto Ld5
            int r5 = r8.A00
            java.lang.Object r2 = r8.A04
            X.0sJ r2 = (X.InterfaceC16660sJ) r2
            java.lang.Object r4 = r8.A03
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r8.A02
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.AbstractC09560e7.A00(r7)
        L39:
            boolean r0 = r7 instanceof X.C3NX
            if (r0 == 0) goto L96
            r1.A03(r4)
            X.05A r4 = r1.A0B
            X.Eoe r0 = X.EnumC33345Eoe.A04
            r4.Egh(r0)
            r0 = 154(0x9a, float:2.16E-43)
            if (r5 == r0) goto L4f
            r0 = 162(0xa2, float:2.27E-43)
            if (r5 != r0) goto L72
        L4f:
            X.05A r4 = r1.A0E
            java.lang.Object r0 = r4.getValue()
            X.Gks r0 = (X.C37838Gks) r0
            if (r0 == 0) goto L94
            java.lang.Boolean r13 = X.AbstractC166997dE.A0a()
            java.lang.Object r8 = r0.A02
            java.lang.Object r9 = r0.A03
            java.lang.Object r10 = r0.A04
            java.lang.Object r7 = r0.A01
            java.lang.Object r11 = r0.A05
            java.lang.Object r12 = r0.A06
            r6 = 3
            X.Gks r5 = new X.Gks
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
        L6f:
            r4.Egh(r5)
        L72:
            X.AbstractC25227BEk.A1Q(r2, r3)
            X.3NX r7 = X.AbstractC25227BEk.A0i()
        L79:
            boolean r0 = r7 instanceof X.C3NX
            if (r0 != 0) goto L91
            boolean r0 = r7 instanceof X.C194848jk
            if (r0 == 0) goto Ld0
            X.05A r0 = r1.A0C
            X.AbstractC166997dE.A1Y(r0, r3)
            X.05A r1 = r1.A0B
            X.Eoe r0 = X.EnumC33345Eoe.A04
            r1.Egh(r0)
            r0 = 0
            X.AbstractC25227BEk.A1Q(r2, r0)
        L91:
            X.0eB r6 = X.C0eB.A00
        L93:
            return r6
        L94:
            r5 = 0
            goto L6f
        L96:
            boolean r0 = r7 instanceof X.C194848jk
            if (r0 != 0) goto L79
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L9f:
            X.AbstractC09560e7.A00(r7)
            X.05A r1 = r14.A0B
            X.Eoe r0 = X.EnumC33345Eoe.A02
            r1.Egh(r0)
            r1 = r17
            if (r17 == 0) goto L91
            com.instagram.common.session.UserSession r0 = r14.A00
            X.1ON r1 = com.instagram.direct.request.DirectThreadApi.A01(r0, r15, r1, r4, r5)
            r8.A02 = r14
            r8.A03 = r4
            r8.A04 = r2
            r8.A00 = r5
            r8.A01 = r3
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r7 = r1.A00(r0, r8)
            if (r7 == r6) goto L93
            r1 = r14
            goto L39
        Lc9:
            X.MAI r8 = new X.MAI
            r8.<init>(r14, r7, r6)
            goto L1d
        Ld0:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A06(com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, X.1Ds, X.0sJ, int):java.lang.Object");
    }

    public final Object A07(Integer num, String str, String str2, String str3, String str4, String str5, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        EnumC33345Eoe enumC33345Eoe;
        List list;
        C32048E6a c32048E6a;
        String str6;
        int i;
        List list2;
        List list3;
        String str7;
        Integer num2;
        if (z) {
            A0A();
        }
        AbstractC166997dE.A1Y(this.A0C, false);
        C05A c05a = this.A0B;
        if (z2) {
            enumC33345Eoe = EnumC33345Eoe.A05;
        } else if (str5 == null) {
            enumC33345Eoe = EnumC33345Eoe.A02;
        } else {
            enumC33345Eoe = EnumC33345Eoe.A03;
        }
        c05a.Egh(enumC33345Eoe);
        if (str2 != null) {
            UserSession userSession = this.A00;
            C81663kb C76 = C2JD.A00(userSession).C76(str4);
            if (C76 != null) {
                C83403nh BSh = C2JD.A00(userSession).BSh(C76.BKb(), str2);
                if (BSh != null && BSh.A1S()) {
                    GWH gwh = new GWH(this, 19);
                    Object obj = BSh.A1T;
                    if ((obj instanceof List) && (list = (List) obj) != null) {
                        C83473no c83473no = BSh.A0m;
                        if (c83473no == null) {
                            c83473no = new C83473no();
                            BSh.A0m = c83473no;
                        }
                        ArrayList A0i = AbstractC167007dF.A0i(list);
                        for (Object obj2 : list) {
                            if (obj2 instanceof C910143t) {
                                C910143t c910143t = (C910143t) obj2;
                                ExtendedImageUrl extendedImageUrl = c910143t.A0X;
                                String valueOf = String.valueOf(c910143t.A0D);
                                HashMap A1G = AbstractC166987dD.A1G();
                                User A10 = AbstractC166987dD.A10(userSession);
                                Iterator A13 = AbstractC166997dE.A13(c83473no.A00);
                                while (true) {
                                    if (!A13.hasNext()) {
                                        break;
                                    }
                                    E6A e6a = (E6A) AbstractC166997dE.A0l(A13);
                                    if (C14360o3.A0K(e6a.A00, valueOf)) {
                                        ArrayList arrayList = e6a.A01;
                                        if (arrayList != null) {
                                            Iterator it = arrayList.iterator();
                                            str6 = null;
                                            while (it.hasNext()) {
                                                C50679MYx c50679MYx = (C50679MYx) it.next();
                                                String str8 = c50679MYx.A00;
                                                if (str8 != null) {
                                                    AbstractC166997dE.A1U(str8, A1G, AbstractC167017dG.A0K(AbstractC31171DnF.A0W(str8, A1G)) + 1);
                                                    if (AbstractC31171DnF.A1W(userSession, c50679MYx.A01)) {
                                                        str6 = c50679MYx.A00;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                str6 = null;
                                GifUrlImpl gifUrlImpl = c910143t.A0Z;
                                if (gifUrlImpl != null) {
                                    i = EnumC40111tc.A0a.A00;
                                    list2 = AbstractC166987dD.A1J(new E6Q(null, Integer.valueOf((int) gifUrlImpl.A02.floatValue()), Integer.valueOf(i), Integer.valueOf((int) gifUrlImpl.A03.floatValue()), AbstractC167007dF.A0d(), String.valueOf(c910143t.A0D), gifUrlImpl.A09));
                                } else {
                                    i = EnumC40111tc.A0Q.A00;
                                    list2 = null;
                                }
                                new C1DY((C1DV) new C37761pD(null), 6, false);
                                if (extendedImageUrl != null) {
                                    list3 = AbstractC166987dD.A1J(new ExtendedImageUrl(extendedImageUrl));
                                } else {
                                    list3 = null;
                                }
                                Integer num3 = null;
                                ImageInfoImpl imageInfoImpl = new ImageInfoImpl(null, null, null, list3, null);
                                Integer valueOf2 = Integer.valueOf(i);
                                if (extendedImageUrl != null) {
                                    str7 = extendedImageUrl.A0A;
                                    num3 = Integer.valueOf(extendedImageUrl.getHeight());
                                    num2 = Integer.valueOf(extendedImageUrl.getWidth());
                                } else {
                                    str7 = null;
                                    num2 = null;
                                }
                                E6P e6p = new E6P(num3, null, num2, null, null, null, str7);
                                String str9 = c910143t.A0z;
                                Integer valueOf3 = Integer.valueOf(AbstractC167007dF.A1W(str9) ? 1 : 0);
                                ArrayList arrayList2 = null;
                                AbstractC31180DnO.A0w(6);
                                if (list2 != null) {
                                    arrayList2 = AbstractC167007dF.A0i(list2);
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(it2.next());
                                    }
                                }
                                E6X e6x = new E6X(e6p, imageInfoImpl, A10, valueOf3, valueOf2, null, valueOf, str9, arrayList2);
                                AbstractC31180DnO.A0w(6);
                                Long valueOf4 = Long.valueOf(TimeUnit.MICROSECONDS.toSeconds(BSh.C8i()));
                                AbstractC31180DnO.A0w(6);
                                c32048E6a = new C32048E6a(e6x, null, A10, null, null, null, valueOf4, valueOf, str6, new HashMap(A1G));
                            } else {
                                c32048E6a = null;
                            }
                            A0i.add(c32048E6a);
                        }
                        List A0X = AbstractC001800i.A0X(A0i);
                        ArrayList A1E = AbstractC166987dD.A1E();
                        AbstractC001800i.A0r(A0X, A1E);
                        gwh.invoke(A1E);
                    }
                }
            }
            Object A01 = A01(this, num, str, str2, str3, str4, str5, interfaceC23621Ds, z2);
            if (A01 == C1JX.A02) {
                return A01;
            }
        }
        return C0eB.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(java.lang.String r8, java.lang.String r9, java.lang.String r10, X.InterfaceC23621Ds r11, boolean r12) {
        /*
            r7 = this;
            r4 = 27
            boolean r0 = X.MAF.A01(r11, r4)
            if (r0 == 0) goto L90
            r3 = r11
            X.MAF r3 = (X.MAF) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r5 = r3.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r3.A00
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L4e
            if (r0 == r2) goto L9b
            if (r0 != r6) goto L96
            java.lang.Object r1 = r3.A01
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.AbstractC09560e7.A00(r5)
        L2b:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L45
            X.05A r0 = r1.A0A
            X.AbstractC166997dE.A1Y(r0, r2)
            X.3NX r5 = X.AbstractC25227BEk.A0i()
        L38:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 != 0) goto Lcc
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto Lc6
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L45:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto L38
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4e:
            X.AbstractC09560e7.A00(r5)
            r7.A0A()
            if (r12 == 0) goto L79
            com.instagram.common.session.UserSession r0 = r7.A00
            X.C14360o3.A0B(r8, r2)
            X.1Ms r1 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "direct_v2/threads/broadcast/delete_recurring_roll_call/"
            r1.A0B(r0)
            java.lang.String r0 = "thread_id"
            X.1ON r1 = X.AbstractC31178DnM.A0K(r1, r0, r8)
            r3.A01 = r7
            r3.A00 = r2
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r5 = r1.A00(r0, r3)
            if (r5 == r4) goto Lc5
            r1 = r7
            goto La2
        L79:
            if (r9 == 0) goto Lcc
            com.instagram.common.session.UserSession r0 = r7.A00
            X.1ON r1 = com.instagram.direct.request.DirectThreadApi.A0A(r0, r8, r9, r10)
            r3.A01 = r7
            r3.A00 = r6
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r5 = r1.A00(r0, r3)
            if (r5 == r4) goto Lc5
            r1 = r7
            goto L2b
        L90:
            X.MAF r3 = new X.MAF
            r3.<init>(r7, r11, r4)
            goto L16
        L96:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L9b:
            java.lang.Object r1 = r3.A01
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.AbstractC09560e7.A00(r5)
        La2:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto Lbc
            X.05A r0 = r1.A0A
            X.AbstractC166997dE.A1Y(r0, r2)
            X.3NX r5 = X.AbstractC25227BEk.A0i()
        Laf:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 != 0) goto Lcc
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto Lc6
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lbc:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto Laf
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc5:
            return r4
        Lc6:
            X.05A r1 = r1.A0A
            r0 = 0
            X.AbstractC166997dE.A1Y(r1, r0)
        Lcc:
            X.0eB r0 = X.C0eB.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A08(java.lang.String, java.lang.String, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 28
            boolean r0 = X.MAF.A01(r9, r3)
            if (r0 == 0) goto L86
            r4 = r9
            X.MAF r4 = (X.MAF) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r2 = r4.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L54
            if (r0 != r3) goto L91
            java.lang.Object r1 = r4.A01
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.AbstractC09560e7.A00(r2)
        L28:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L4b
            X.05A r0 = r1.A0A
            X.AbstractC166997dE.A1Y(r0, r3)
            X.3NX r2 = X.AbstractC25227BEk.A0i()
        L35:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L48
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L8c
            X.05A r0 = r1.A0C
            X.AbstractC166997dE.A1Y(r0, r3)
            X.05A r1 = r1.A0A
            r0 = 0
            X.AbstractC166997dE.A1Y(r1, r0)
        L48:
            X.0eB r5 = X.C0eB.A00
        L4a:
            return r5
        L4b:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L35
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L54:
            X.AbstractC09560e7.A00(r2)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC31173DnH.A0M(r0)
            r0 = 935(0x3a7, float:1.31E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.AbstractC31173DnH.A1P(r2, r0, r7)
            r0 = 291(0x123, float:4.08E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r2.A9s(r0, r8)
            java.lang.Class<X.EDg> r1 = X.C32207EDg.class
            java.lang.Class<X.FUv> r0 = X.C34793FUv.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r4.A01 = r6
            r4.A00 = r3
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r2 = r1.A00(r0, r4)
            if (r2 == r5) goto L4a
            r1 = r6
            goto L28
        L86:
            X.MAF r4 = new X.MAF
            r4.<init>(r6, r9, r3)
            goto L16
        L8c:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L91:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A09(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public final void A0A() {
        this.A07.Egh(C16930sl.A00);
        this.A01.Egh(null);
        this.A03.Egh(null);
        this.A0A.Egh(null);
        this.A0C.Egh(null);
        this.A0E.Egh(null);
        this.A0Y.Egh(null);
        this.A0B.Egh(null);
        this.A04.Egh(EnumC33398EpV.A08);
        this.A05.Egh(AbstractC25227BEk.A0p());
        this.A0X.Egh(null);
        this.A06.Egh(null);
        this.A0D.Egh(null);
        this.A09.Egh(null);
        this.A0F.Egh(AbstractC166987dD.A1E());
    }

    public final void A0B(String str, String str2) {
        C05A c05a = this.A07;
        ArrayList A0U = AbstractC001800i.A0U((Collection) c05a.getValue());
        int size = A0U.size();
        for (int i = 0; i < size; i++) {
            C32050E6c c32050E6c = (C32050E6c) A0U.get(i);
            if (str.equals(c32050E6c.A05)) {
                A0U.set(i, AbstractC35247Fgg.A01(this.A00, c32050E6c, str2));
                c05a.Egh(A0U);
                return;
            }
        }
    }

    public static C32054E6g A00(C3DC c3dc) {
        return (C32054E6g) c3dc.F7f();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A0A();
    }
}
