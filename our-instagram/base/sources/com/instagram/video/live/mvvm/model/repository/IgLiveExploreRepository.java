package com.instagram.video.live.mvvm.model.repository;

import X.AbstractC167007dF;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C16930sl;
import X.C21B;
import X.C21C;
import X.JWd;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveExploreLiveApi;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class IgLiveExploreRepository {
    public boolean A00;
    public final UserSession A01;
    public final C21C A02;
    public final IgLiveExploreLiveApi A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;
    public final C0UO A09;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
    
        if (A00(r11, r3, r6, !r13) == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.user.model.UpcomingEvent r11, X.InterfaceC23621Ds r12, boolean r13) {
        /*
            r10 = this;
            r3 = 4
            boolean r0 = X.C57142PWu.A01(r12, r3)
            if (r0 == 0) goto Lbf
            r6 = r12
            X.PWu r6 = (X.C57142PWu) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbf
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r2 = r6.A04
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r7 = 3
            r1 = 2
            r4 = 0
            r8 = 1
            if (r0 == 0) goto L44
            if (r0 == r8) goto L32
            if (r0 == r1) goto L95
            if (r0 != r7) goto Lc6
            java.lang.Object r1 = r6.A01
            X.AbstractC09560e7.A00(r2)
        L2c:
            X.8jk r2 = new X.8jk
            r2.<init>(r1)
        L31:
            return r2
        L32:
            boolean r13 = r6.A05
            java.lang.Object r9 = r6.A03
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r11 = r6.A02
            com.instagram.user.model.UpcomingEvent r11 = (com.instagram.user.model.UpcomingEvent) r11
            java.lang.Object r3 = r6.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r3 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r3
            X.AbstractC09560e7.A00(r2)
            goto L5e
        L44:
            X.AbstractC09560e7.A00(r2)
            java.lang.String r9 = r11.getId()
            if (r9 == 0) goto Ld0
            r6.A01 = r10
            r6.A02 = r11
            r6.A03 = r9
            r6.A05 = r13
            r6.A00 = r8
            java.lang.Object r0 = A00(r11, r10, r6, r13)
            if (r0 == r5) goto Lbe
            r3 = r10
        L5e:
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveExploreLiveApi r0 = r3.A03
            r6.A01 = r3
            r6.A02 = r11
            r6.A03 = r4
            r6.A05 = r13
            r6.A00 = r1
            com.instagram.common.session.UserSession r0 = r0.A00
            X.C14360o3.A0B(r9, r8)
            if (r13 == 0) goto L92
            java.lang.String r1 = "upcoming_events/set_reminder/"
        L73:
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            r0 = 47
            java.lang.String r0 = X.AnonymousClass001.A0S(r1, r9, r0)
            r2.A0B(r0)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            X.1ON r1 = X.AbstractC31172DnG.A0R(r4, r2, r1, r0, r8)
            r0 = 548510594(0x20b19b82, float:3.0087873E-19)
            java.lang.Object r2 = r1.A00(r0, r6)
            if (r2 != r5) goto La2
            return r5
        L92:
            java.lang.String r1 = "upcoming_events/unset_reminder/"
            goto L73
        L95:
            boolean r13 = r6.A05
            java.lang.Object r11 = r6.A02
            com.instagram.user.model.UpcomingEvent r11 = (com.instagram.user.model.UpcomingEvent) r11
            java.lang.Object r3 = r6.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r3 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r3
            X.AbstractC09560e7.A00(r2)
        La2:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L31
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto Lcb
            X.8jk r2 = (X.C194848jk) r2
            java.lang.Object r1 = r2.A00
            r0 = r13 ^ 1
            r6.A01 = r1
            r6.A02 = r4
            r6.A00 = r7
            java.lang.Object r0 = A00(r11, r3, r6, r0)
            if (r0 != r5) goto L2c
        Lbe:
            return r5
        Lbf:
            X.PWu r6 = new X.PWu
            r6.<init>(r10, r12, r3)
            goto L15
        Lc6:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lcb:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository.A01(com.instagram.user.model.UpcomingEvent, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r10) {
        /*
            r9 = this;
            r5 = 3
            boolean r0 = X.C57147PWz.A02(r10, r5)
            if (r0 == 0) goto La2
            r4 = r10
            X.PWz r4 = (X.C57147PWz) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La2
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r2 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r8 = 2
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 == r1) goto L2b
            if (r0 == r8) goto L7c
            if (r0 != r5) goto La9
            X.AbstractC09560e7.A00(r2)
        L28:
            X.0eB r3 = X.C0eB.A00
        L2a:
            return r3
        L2b:
            java.lang.Object r7 = r4.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r7 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r7
            X.AbstractC09560e7.A00(r2)
            goto L43
        L33:
            X.AbstractC09560e7.A00(r2)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveExploreLiveApi r0 = r9.A03
            r4.A01 = r9
            r4.A00 = r1
            java.lang.Object r2 = r0.A00(r4, r1)
            if (r2 == r3) goto L2a
            r7 = r9
        L43:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L99
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r6 = r2.A00
            X.HAZ r6 = (X.HAZ) r6
            java.util.List r0 = r6.A00
            java.util.Iterator r2 = r0.iterator()
        L55:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r1 = r2.next()
            X.4pt r1 = (X.C105824pt) r1
            com.instagram.common.session.UserSession r0 = r7.A01
            com.instagram.reels.store.ReelStore r0 = X.C1OU.A04(r0)
            r0.A0G(r1)
            goto L55
        L6b:
            X.05A r1 = r7.A05
            java.util.List r0 = r6.A00
            r4.A01 = r7
            r4.A02 = r6
            r4.A00 = r8
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L87
            return r3
        L7c:
            java.lang.Object r6 = r4.A02
            X.HAZ r6 = (X.HAZ) r6
            java.lang.Object r7 = r4.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r7 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r7
            X.AbstractC09560e7.A00(r2)
        L87:
            X.05A r2 = r7.A04
            java.util.List r1 = r6.A01
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A00 = r5
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r3) goto L28
            return r3
        L99:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L28
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La2:
            X.PWz r4 = new X.PWz
            r4.<init>(r9, r10, r5)
            goto L15
        La9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository.A02(X.1Ds):java.lang.Object");
    }

    public /* synthetic */ IgLiveExploreRepository(UserSession userSession) {
        IgLiveExploreLiveApi igLiveExploreLiveApi = new IgLiveExploreLiveApi(userSession);
        C21C A00 = C21B.A00(userSession);
        AbstractC167007dF.A1E(userSession, 1, A00);
        this.A01 = userSession;
        this.A03 = igLiveExploreLiveApi;
        this.A02 = A00;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A1H = AbstractC25225BEi.A1H(new JWd((List) c16930sl, true, (String) null, 4, (DefaultConstructorMarker) null, 19));
        this.A06 = A1H;
        this.A09 = AbstractC208910l.A02(A1H);
        C008002u A002 = C10E.A00(c16930sl);
        this.A05 = A002;
        this.A08 = AbstractC208910l.A02(A002);
        C008002u A003 = C10E.A00(c16930sl);
        this.A04 = A003;
        this.A07 = AbstractC208910l.A02(A003);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.user.model.UpcomingEvent r12, com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r13, X.InterfaceC23621Ds r14, boolean r15) {
        /*
            boolean r0 = r14 instanceof X.C43163J6a
            if (r0 == 0) goto Lb3
            r7 = r14
            X.J6a r7 = (X.C43163J6a) r7
            int r2 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb3
            int r2 = r2 - r1
            r7.A01 = r2
        L12:
            java.lang.Object r1 = r7.A07
            X.1JX r8 = X.C1JX.A02
            int r0 = r7.A01
            r6 = 1
            if (r0 == 0) goto L9e
            if (r0 != r6) goto Lbd
            int r3 = r7.A00
            boolean r15 = r7.A06
            java.lang.Object r10 = r7.A05
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r0 = r7.A04
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r12 = r7.A03
            com.instagram.user.model.UpcomingEvent r12 = (com.instagram.user.model.UpcomingEvent) r12
            java.lang.Object r13 = r7.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r13 = (com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository) r13
            X.AbstractC09560e7.A00(r1)
        L34:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Lba
            java.lang.Object r1 = r10.next()
            int r9 = r3 + 1
            if (r3 >= 0) goto L4a
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L4a:
            com.instagram.user.model.UpcomingEvent r1 = (com.instagram.user.model.UpcomingEvent) r1
            java.lang.String r2 = r12.getId()
            java.lang.String r1 = r1.getId()
            boolean r1 = X.C14360o3.A0K(r2, r1)
            if (r1 == 0) goto L9c
            X.IMc r1 = new X.IMc
            r1.<init>(r12)
            r1.A0E = r15
            com.instagram.user.model.UpcomingEvent r1 = r1.A00()
            java.util.ArrayList r2 = X.AbstractC001800i.A0U(r0)
            r2.remove(r3)
            r2.add(r3, r1)
            X.05A r11 = r13.A06
            java.lang.Object r1 = r11.getValue()
            X.JWd r1 = (X.JWd) r1
            java.util.List r5 = X.AbstractC001800i.A0a(r2)
            boolean r4 = r1.A02
            java.lang.String r3 = r1.A01
            r2 = 19
            X.JWd r1 = new X.JWd
            r1.<init>(r5, r4, r3, r2)
            r7.A02 = r13
            r7.A03 = r12
            r7.A04 = r0
            r7.A05 = r10
            r7.A06 = r15
            r7.A00 = r9
            r7.A01 = r6
            java.lang.Object r1 = r11.emit(r1, r7)
            if (r1 == r8) goto Lbc
            r3 = r9
            goto L34
        L9c:
            r3 = r9
            goto L34
        L9e:
            X.AbstractC09560e7.A00(r1)
            X.05A r0 = r13.A06
            java.lang.Object r0 = r0.getValue()
            X.JWd r0 = (X.JWd) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            java.util.Iterator r10 = r0.iterator()
            goto L34
        Lb3:
            X.J6a r7 = new X.J6a
            r7.<init>(r13, r14)
            goto L12
        Lba:
            X.0eB r8 = X.C0eB.A00
        Lbc:
            return r8
        Lbd:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository.A00(com.instagram.user.model.UpcomingEvent, com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository.A03(X.1Ds):java.lang.Object");
    }
}
