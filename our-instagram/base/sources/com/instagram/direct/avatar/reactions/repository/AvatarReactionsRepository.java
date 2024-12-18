package com.instagram.direct.avatar.reactions.repository;

import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC25651Mw;
import X.AbstractC40691uc;
import X.AnonymousClass191;
import X.C008002u;
import X.C05A;
import X.C06090Tz;
import X.C0UO;
import X.C10E;
import X.C12L;
import X.C12W;
import X.C14090nZ;
import X.C14360o3;
import X.C16930sl;
import X.C18U;
import X.C19L;
import X.C1M7;
import X.C1MR;
import X.C20Y;
import X.C25671My;
import X.C27180Byz;
import X.C440921r;
import X.C441021s;
import X.C441221u;
import X.C45059Jwo;
import X.C4A7;
import X.C4A8;
import X.C7UM;
import X.C7UQ;
import X.C7UY;
import X.D53;
import X.InterfaceC41501vz;
import X.MHS;
import com.facebook.stash.core.FileStash;
import com.facebook.ui.emoji.model.Emoji;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.reactions.api.AvatarReactionsApi;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class AvatarReactionsRepository extends C4A7 {
    public final FileStash A00;
    public final AvatarStore A01;
    public final InterfaceC41501vz A02;
    public final InterfaceC41501vz A03;
    public final InterfaceC41501vz A04;
    public final UserSession A05;
    public final C7UQ A06;
    public final AvatarReactionsApi A07;
    public final C7UM A08;
    public final C7UY A09;
    public final C12W A0A;
    public final C05A A0B;
    public final C0UO A0C;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository r10, X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository.A01(com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository, X.1Ds):java.lang.Object");
    }

    public final C45059Jwo A02(String str) {
        C14360o3.A0B(str, 0);
        Object obj = null;
        if (!C18U.A06(C06090Tz.A05, this.A08.A00, 36322568487053634L)) {
            return null;
        }
        Iterator it = ((Iterable) this.A0C.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str2 = ((C45059Jwo) next).A05;
            int[] A02 = Emoji.A02();
            String str3 = new String(A02, 0, Emoji.A01(A02, Emoji.A00(str2, A02), false));
            Emoji.A01.EE6(A02);
            if (str3.equals(str)) {
                obj = next;
                break;
            }
        }
        return (C45059Jwo) obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(4:19|(1:21)(1:25)|22|(1:24))|12|13|14))|30|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        X.C0K8.A0F("AvatarReactionsRepository", "Failed to download avatar reactions assets", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r10 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        X.LET.A00(r10, com.instagram.realtimeclient.RealtimeConstants.SEND_FAIL);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository r13, java.util.List r14, X.InterfaceC23621Ds r15) {
        /*
            r3 = 24
            r4 = r15
            boolean r0 = X.MAF.A01(r15, r3)
            r9 = r13
            if (r0 == 0) goto L28
            r6 = r4
            X.MAF r6 = (X.MAF) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.A00 = r2
        L18:
            java.lang.Object r1 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L3a
            if (r0 != r4) goto L32
            java.lang.Object r10 = r6.A01
            X.LET r10 = (X.LET) r10
            goto L2e
        L28:
            X.MAF r6 = new X.MAF
            r6.<init>(r13, r15, r3)
            goto L18
        L2e:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Exception -> L76
            goto L85
        L32:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L3a:
            X.AbstractC09560e7.A00(r1)
            X.7UY r8 = r13.A09
            java.lang.Integer r7 = X.C05F.A01
            boolean r0 = r8.A00
            if (r0 != 0) goto L47
            r10 = 0
            goto L60
        L47:
            X.02i r3 = r8.A01
            r2 = 125763585(0x77f0001, float:1.9184069E-34)
            r0 = 773(0x305, float:1.083E-42)
            java.lang.String r1 = X.AbstractC43591JPw.A00(r0)
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            r3.markerPoint(r2, r0)
            X.LET r10 = new X.LET
            r10.<init>(r8, r7)
        L60:
            X.12W r0 = r13.A0A     // Catch: java.lang.Exception -> L76
            r12 = 0
            r13 = 15
            X.MCM r8 = new X.MCM     // Catch: java.lang.Exception -> L76
            r11 = r14
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L76
            r6.A01 = r10     // Catch: java.lang.Exception -> L76
            r6.A00 = r4     // Catch: java.lang.Exception -> L76
            java.lang.Object r0 = X.AbstractC23641Du.A00(r6, r0, r8)     // Catch: java.lang.Exception -> L76
            if (r0 != r5) goto L85
            return r5
        L76:
            r2 = move-exception
            java.lang.String r1 = "AvatarReactionsRepository"
            java.lang.String r0 = "Failed to download avatar reactions assets"
            X.C0K8.A0F(r1, r0, r2)
            if (r10 == 0) goto L85
            java.lang.String r0 = "fail"
            X.LET.A00(r10, r0)
        L85:
            X.0eB r5 = X.C0eB.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository.A00(com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository, java.util.List, X.1Ds):java.lang.Object");
    }

    public final void A03() {
        if (C18U.A06(C06090Tz.A05, this.A08.A00, 36322568487053634L)) {
            C7UY c7uy = this.A09;
            c7uy.A00(C27180Byz.A00);
            c7uy.A01.markerStart(125763585);
            c7uy.A00 = true;
            C19L c19l = super.A01;
            AbstractC23641Du.A05(AnonymousClass191.A00, new D53(this, null, 38), c19l);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarReactionsRepository(UserSession userSession) {
        super("Direct", C4A8.A01(972087568, 3));
        AvatarReactionsApi avatarReactionsApi = new AvatarReactionsApi(userSession, AbstractC40691uc.A01(userSession));
        C7UM c7um = new C7UM(userSession);
        AvatarStore A00 = C20Y.A00(userSession);
        C1MR A05 = C1M7.A01().A05(1924902396);
        C7UQ c7uq = new C7UQ(A05);
        C14090nZ CPG = C12L.A00.CPG(480314591, 3);
        C14360o3.A0B(userSession, 0);
        C7UY c7uy = (C7UY) userSession.A01(C7UY.class, new MHS(userSession, 39));
        C25671My A002 = AbstractC25651Mw.A00(userSession);
        this.A05 = userSession;
        this.A07 = avatarReactionsApi;
        this.A08 = c7um;
        this.A01 = A00;
        this.A00 = A05;
        this.A06 = c7uq;
        this.A0A = CPG;
        this.A09 = c7uy;
        C008002u A003 = C10E.A00(C16930sl.A00);
        this.A0B = A003;
        this.A0C = AbstractC208910l.A02(A003);
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.7UZ
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1558854641);
                int A032 = C0f9.A03(-506748220);
                AvatarReactionsRepository.this.A03();
                C0f9.A0A(1369147382, A032);
                C0f9.A0A(859373206, A03);
            }
        };
        this.A04 = interfaceC41501vz;
        InterfaceC41501vz interfaceC41501vz2 = new InterfaceC41501vz() { // from class: X.7Ua
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-129537345);
                int A032 = C0f9.A03(442568190);
                AvatarReactionsRepository.this.A03();
                C0f9.A0A(-1044437717, A032);
                C0f9.A0A(-858457246, A03);
            }
        };
        this.A02 = interfaceC41501vz2;
        InterfaceC41501vz interfaceC41501vz3 = new InterfaceC41501vz() { // from class: X.7Ub
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(489824334);
                int A032 = C0f9.A03(-1019002732);
                AvatarReactionsRepository.this.A0B.Egh(C16930sl.A00);
                C0f9.A0A(474898893, A032);
                C0f9.A0A(1419293952, A03);
            }
        };
        this.A03 = interfaceC41501vz3;
        A002.A01(interfaceC41501vz, C440921r.class);
        A002.A01(interfaceC41501vz3, C441021s.class);
        A002.A01(interfaceC41501vz2, C441221u.class);
    }

    @Override // X.C4A7, X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        close();
        this.A0B.Egh(C16930sl.A00);
    }
}
