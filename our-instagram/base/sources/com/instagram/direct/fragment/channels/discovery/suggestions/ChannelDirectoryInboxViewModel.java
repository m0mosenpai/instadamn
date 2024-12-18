package com.instagram.direct.fragment.channels.discovery.suggestions;

import X.AbstractC121115e3;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC25230BEn;
import X.AbstractC25231BEo;
import X.AbstractC25651Mw;
import X.AbstractC32730Eaw;
import X.AnonymousClass195;
import X.C008002u;
import X.C05A;
import X.C06090Tz;
import X.C0UO;
import X.C10E;
import X.C10I;
import X.C10Q;
import X.C12L;
import X.C14360o3;
import X.C16930sl;
import X.C18U;
import X.C1GJ;
import X.C31650DvG;
import X.C48062It;
import X.C5e4;
import X.EZ9;
import X.EnumC33329EoO;
import X.EnumC33356Eop;
import X.FIV;
import X.GSR;
import X.GSY;
import X.InterfaceC23621Ds;
import X.InterfaceC41501vz;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class ChannelDirectoryInboxViewModel extends AbstractC32730Eaw {
    public C5e4 A00;
    public AnonymousClass195 A01;
    public AnonymousClass195 A02;
    public boolean A03;
    public final UserSession A04;
    public final EnumC33329EoO A05;
    public final List A06;
    public final C05A A07;
    public final C0UO A08;
    public final boolean A09;
    public final InterfaceC41501vz A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelDirectoryInboxViewModel(UserSession userSession, EnumC33329EoO enumC33329EoO) {
        super(userSession, enumC33329EoO);
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A05 = enumC33329EoO;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A07 = A00;
        this.A08 = AbstractC208910l.A01(new FIV(EnumC33356Eop.A02, c16930sl), AbstractC141776au.A00(this), C10Q.A01(new GSY(this, 0), super.A07, ((AbstractC32730Eaw) this).A00, A00, super.A08), C10I.A01);
        C31650DvG A002 = C31650DvG.A00(this, 20);
        this.A0A = A002;
        boolean z = !C18U.A06(C06090Tz.A05, userSession, 36317908449564343L);
        this.A09 = z;
        this.A06 = AbstractC166987dD.A1E();
        if (z) {
            UserSession userSession2 = this.A04;
            EZ9 ez9 = new EZ9(this, 2);
            C14360o3.A0B(userSession2, 0);
            C1GJ.A06(AbstractC121115e3.A01(userSession2, ez9), 1967622104, 2, false, false);
            AbstractC25651Mw.A00(userSession).A01(A002, C48062It.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(X.EnumC33424Epv r30, com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel r31, X.InterfaceC23621Ds r32) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel.A05(X.Epv, com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        if (r0 == r5) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(X.EnumC33424Epv r7, com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 14
            boolean r0 = X.MAK.A01(r9, r3)
            if (r0 == 0) goto Laa
            r6 = r9
            X.MAK r6 = (X.MAK) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r0 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r1 = r6.A00
            r4 = 1
            if (r1 == 0) goto L92
            if (r1 != r4) goto Lb6
            java.lang.Object r7 = r6.A02
            X.Epv r7 = (X.EnumC33424Epv) r7
            java.lang.Object r8 = r6.A01
            com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r8 = (com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel) r8
            X.AbstractC09560e7.A00(r0)
        L2c:
            r5 = r0
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L78
            X.3NX r5 = (X.C3NX) r5
            java.lang.Object r0 = r5.A00
            X.EAi r0 = (X.C32135EAi) r0
            X.Gak r0 = r0.A00
            if (r0 != 0) goto L45
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L45:
            X.E7b r0 = (X.E7b) r0
            java.util.List r0 = r0.A02
            java.util.ArrayList r4 = X.AbstractC167017dG.A0q(r0)
            r1 = 0
            java.util.Iterator r3 = r0.iterator()
        L52:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r3.next()
            int r2 = r1 + 1
            if (r1 >= 0) goto L68
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L68:
            X.44Q r0 = (X.C44Q) r0
            X.2zP r1 = r8.A08(r0, r7, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.channels.discovery.model.ChannelDiscoveryInvitesRowViewModel"
            X.C14360o3.A0C(r1, r0)
            r4.add(r1)
            r1 = r2
            goto L52
        L78:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto L85
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L81:
            X.3NX r5 = X.AbstractC25225BEi.A0z(r4)
        L85:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 != 0) goto La9
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 == 0) goto Lb1
            X.8jk r5 = X.AbstractC25227BEk.A0h()
            return r5
        L92:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r3 = r8.A04
            r2 = 3
            int r1 = r7.A00
            r0 = 0
            X.1ON r1 = com.instagram.direct.request.DirectThreadApi.A03(r3, r0, r0, r2, r1)
            X.AbstractC31172DnG.A1V(r8, r7, r6, r4)
            r0 = -5
            java.lang.Object r0 = r1.A00(r0, r6)
            if (r0 != r5) goto L2c
        La9:
            return r5
        Laa:
            X.MAK r6 = new X.MAK
            r6.<init>(r8, r9, r3)
            goto L16
        Lb1:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb6:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel.A06(X.Epv, com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r13 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel r27) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel.A07(com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel):void");
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        if (this.A09) {
            AbstractC25651Mw.A00(this.A04).A02(this.A0A, C48062It.class);
        }
    }

    @Override // com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel
    public final void A0E() {
        super.A0E();
        if (this.A09) {
            A07(this);
            return;
        }
        InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A01);
        this.A01 = AbstractC23641Du.A04(AbstractC25231BEo.A0e(C12L.A00), new GSR(this, A0s, 4), AbstractC141776au.A00(this));
    }

    @Override // com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel
    public final void A0F(String str) {
        super.A0F(str);
        if (!this.A09) {
            InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A01);
            this.A01 = AbstractC23641Du.A04(AbstractC25231BEo.A0e(C12L.A00), new GSR(this, A0s, 6), AbstractC141776au.A00(this));
        }
        this.A06.add(str);
    }
}
