package com.instagram.video.live.mvvm.model.repository;

import X.AbstractC07080Za;
import X.AbstractC09440dt;
import X.AbstractC09560e7;
import X.AbstractC109714wx;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC42021ws;
import X.AbstractC50102Ry;
import X.AnonymousClass057;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C06160Ug;
import X.C0UO;
import X.C10E;
import X.C10M;
import X.C14360o3;
import X.C171547kk;
import X.C18U;
import X.C19L;
import X.C24721Ip;
import X.C26087BgG;
import X.C42201xA;
import X.C42221xC;
import X.C50526MSf;
import X.C51745MtU;
import X.C55811OqM;
import X.C56803PIu;
import X.C57541PgF;
import X.EnumC142806cg;
import X.InterfaceC06180Ui;
import X.InterfaceC09390do;
import X.InterfaceC15070pN;
import X.InterfaceC19390xP;
import X.InterfaceC24731Iq;
import X.MSY;
import X.N3I;
import X.OQR;
import X.OQS;
import X.PUC;
import X.PXA;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.requeststream.GraphQLSubscriptionRequestStub;
import com.instagram.realtimeclient.requeststream.IGGraphQLSubscriptionRequestStringStub;
import com.instagram.realtimeclient.requeststream.IGRealtimeGraphQLObserverHolder;
import com.instagram.realtimeclient.requeststream.SubscriptionHandler;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes9.dex */
public final class IgLiveCommentsRepository {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public SubscriptionHandler A05;
    public SubscriptionHandler A06;
    public String A07;
    public List A08;
    public boolean A09;
    public final UserSession A0A;
    public final Set A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC24731Iq A0D;
    public final InterfaceC19390xP A0E;
    public final InterfaceC19390xP A0F;
    public final C05A A0G;
    public final C05A A0H;
    public final InterfaceC15070pN A0I;
    public final C0UO A0J;
    public final C0UO A0K;
    public final C0UO A0L;
    public final C42201xA A0M;
    public final C42221xC A0N;
    public final IgLiveCommentsApi A0O;
    public final EnumC142806cg A0P;
    public final IgLiveBroadcastInfoManager A0Q;
    public final Comparator A0R;
    public final List A0S;
    public final Set A0T;
    public final InterfaceC06180Ui A0U;
    public final InterfaceC06180Ui A0V;
    public final C05A A0W;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.N3I r6, com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 2
            boolean r0 = X.C57147PWz.A02(r8, r3)
            if (r0 == 0) goto L4f
            r5 = r8
            X.PWz r5 = (X.C57147PWz) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L41
            if (r0 != r3) goto L58
            java.lang.Object r2 = r5.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r7 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r7 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r7
            X.AbstractC09560e7.A00(r1)
        L2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r1 = r2.next()
            X.1Iq r0 = r7.A0D
            X.C57147PWz.A00(r7, r2, r5, r3)
            java.lang.Object r0 = r0.EMz(r1, r5)
            if (r0 != r4) goto L2b
            return r4
        L41:
            X.AbstractC09560e7.A00(r1)
            java.util.List r0 = r6.A07
            java.util.List r0 = X.MSY.A0m(r0)
            java.util.Iterator r2 = r0.iterator()
            goto L2b
        L4f:
            X.PWz r5 = new X.PWz
            r5.<init>(r7, r8, r3)
            goto L15
        L55:
            X.0eB r4 = X.C0eB.A00
            return r4
        L58:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A01(X.N3I, com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r10, java.util.List r11, X.InterfaceC23621Ds r12, boolean r13) {
        /*
            r3 = 2
            boolean r0 = X.C57142PWu.A01(r12, r3)
            if (r0 == 0) goto Lc0
            r7 = r12
            X.PWu r7 = (X.C57142PWu) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc0
            int r2 = r2 - r1
            r7.A00 = r2
        L15:
            java.lang.Object r1 = r7.A04
            X.1JX r8 = X.C1JX.A02
            int r0 = r7.A00
            r6 = 1
            r5 = 3
            if (r0 == 0) goto L68
            if (r0 != r6) goto Lca
            boolean r13 = r7.A05
            java.lang.Object r3 = r7.A03
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r7.A02
            java.lang.Object r10 = r7.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r10 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r10
            X.AbstractC09560e7.A00(r1)
        L30:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r2 = r3.next()
            X.PIt r2 = (X.C56802PIt) r2
            X.Nh2 r1 = r2.BO3()
            X.Nh2 r0 = X.EnumC53264Nh2.A0L
            if (r1 != r0) goto L4d
            com.instagram.user.model.User r1 = r2.A04
            if (r1 == 0) goto L4d
            java.util.Set r0 = r10.A0T
            r0.add(r1)
        L4d:
            if (r13 == 0) goto L55
            java.util.List r0 = r10.A0S
            r0.add(r2)
            goto L30
        L55:
            X.0Ui r0 = r10.A0U
            r7.A01 = r10
            r7.A02 = r4
            r7.A03 = r3
            r7.A05 = r13
            r7.A00 = r6
            java.lang.Object r0 = r0.emit(r2, r7)
            if (r0 != r8) goto L30
            return r8
        L68:
            java.util.ArrayList r4 = X.MSY.A0i(r1)
            java.util.Iterator r9 = r11.iterator()
        L70:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r3 = r9.next()
            r2 = r3
            X.PIt r2 = (X.C56802PIt) r2
            X.Nh2 r0 = r2.BO3()
            int r1 = r0.ordinal()
            if (r1 == r5) goto La0
            r0 = 4
            if (r1 == r0) goto La0
            r0 = 12
            if (r1 == r0) goto Laf
            r0 = 13
            if (r1 == r0) goto L99
            r0 = 0
            if (r1 == r0) goto L70
        L95:
            r4.add(r3)
            goto L70
        L99:
            X.6cg r1 = r10.A0P
            X.6cg r0 = X.EnumC142806cg.A05
            if (r1 != r0) goto L70
            goto L95
        La0:
            com.instagram.user.model.User r2 = r2.A04
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r10.A0A
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = X.C14360o3.A0K(r2, r0)
            goto Lb7
        Laf:
            java.util.Set r1 = r10.A0T
            com.instagram.user.model.User r0 = r2.A04
            boolean r0 = X.AbstractC001800i.A0u(r1, r0)
        Lb7:
            if (r0 != 0) goto L70
            goto L95
        Lba:
            java.util.Iterator r3 = r4.iterator()
            goto L30
        Lc0:
            X.PWu r7 = new X.PWu
            r7.<init>(r10, r12, r3)
            goto L15
        Lc7:
            X.0eB r8 = X.C0eB.A00
            return r8
        Lca:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A02(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, java.util.List, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0C(X.C56803PIu r10, java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r9 = this;
            r6 = 3
            boolean r0 = X.C57142PWu.A01(r12, r6)
            if (r0 == 0) goto L97
            r5 = r12
            X.PWu r5 = (X.C57142PWu) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A04
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r8 = 2
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L3c
            if (r0 == r7) goto L2a
            if (r0 == r8) goto L2a
            if (r0 != r6) goto L9e
            X.AbstractC09560e7.A00(r1)
        L29:
            return r1
        L2a:
            boolean r2 = r5.A05
            java.lang.Object r10 = r5.A03
            X.PIu r10 = (X.C56803PIu) r10
            java.lang.Object r11 = r5.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r8 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r8
            X.AbstractC09560e7.A00(r1)
            goto L68
        L3c:
            X.AbstractC09560e7.A00(r1)
            java.lang.Boolean r0 = r10.A09
            if (r0 == 0) goto L94
            boolean r2 = r0.booleanValue()
        L47:
            X.3qh r1 = r10.A07
            X.3qh r0 = X.EnumC84933qh.A09
            if (r1 != r0) goto Lbb
            java.lang.String r1 = r10.getPk()
            if (r1 == 0) goto Lab
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r0 = r9.A0O
            r5.A01 = r9
            r5.A02 = r11
            r5.A03 = r10
            r5.A05 = r2
            if (r2 == 0) goto L89
            r5.A00 = r7
            java.lang.Object r1 = r0.A02(r11, r1, r5)
            if (r1 == r4) goto L85
            r8 = r9
        L68:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto Lb5
            java.lang.Boolean r0 = r10.A09
            if (r0 == 0) goto L86
            boolean r0 = r0.booleanValue()
        L74:
            if (r2 == r0) goto La3
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A03 = r0
            r5.A00 = r6
            java.lang.Object r1 = r8.A0C(r10, r11, r5)
            if (r1 != r4) goto L29
        L85:
            return r4
        L86:
            boolean r0 = r10.A0F
            goto L74
        L89:
            r5.A00 = r8
            java.lang.Object r1 = r0.A03(r11, r1, r5)
            if (r1 == r4) goto L85
            r8 = r9
            r2 = 0
            goto L68
        L94:
            boolean r2 = r10.A0F
            goto L47
        L97:
            X.PWu r5 = new X.PWu
            r5.<init>(r9, r12, r6)
            goto L15
        L9e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        La3:
            r0 = 19
            X.MSf r1 = new X.MSf
            r1.<init>(r7, r2, r0)
            return r1
        Lab:
            r1 = r2 ^ 1
            r0 = 19
            X.MSf r4 = new X.MSf
            r4.<init>(r3, r1, r0)
            return r4
        Lb5:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lc3
            r2 = r2 ^ 1
        Lbb:
            r0 = 19
            X.MSf r4 = new X.MSf
            r4.<init>(r3, r2, r0)
            return r4
        Lc3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0C(X.PIu, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0D(X.C56803PIu r12, java.lang.String r13, X.InterfaceC23621Ds r14, long r15) {
        /*
            r11 = this;
            r3 = 0
            boolean r0 = X.C57147PWz.A02(r14, r3)
            if (r0 == 0) goto L67
            r8 = r14
            X.PWz r8 = (X.C57147PWz) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r8.A00 = r2
        L15:
            java.lang.Object r5 = r8.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r8.A00
            r4 = 1
            if (r0 == 0) goto L45
            if (r0 != r4) goto L80
            java.lang.Object r1 = r8.A02
            java.lang.Object r2 = r8.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r2 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r2
            X.AbstractC09560e7.A00(r5)
        L29:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L3c
            X.3NX r5 = X.AbstractC25235BEs.A0f(r4)
        L33:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L6d
            X.3NX r5 = (X.C3NX) r5
            java.lang.Object r0 = r5.A00
            return r0
        L3c:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto L33
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L45:
            X.AbstractC09560e7.A00(r5)
            X.0UO r0 = r11.A0L
            java.lang.Object r1 = r0.getValue()
            X.05A r0 = r11.A0H
            r0.Egh(r12)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r5 = r11.A0O
            java.lang.String r6 = r12.getPk()
            X.C57147PWz.A00(r11, r1, r8, r4)
            r7 = r13
            r9 = r15
            java.lang.Object r5 = r5.A05(r6, r7, r8, r9)
            if (r5 != r2) goto L65
            return r2
        L65:
            r2 = r11
            goto L29
        L67:
            X.PWz r8 = new X.PWz
            r8.<init>(r11, r14, r3)
            goto L15
        L6d:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 == 0) goto L7b
            X.05A r0 = r2.A0H
            r0.Egh(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L7b:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L80:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0D(X.PIu, java.lang.String, X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0E(X.C56803PIu r12, java.lang.String r13, X.InterfaceC23621Ds r14, long r15) {
        /*
            r11 = this;
            r3 = 1
            boolean r0 = X.C57147PWz.A02(r14, r3)
            if (r0 == 0) goto L70
            r8 = r14
            X.PWz r8 = (X.C57147PWz) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r8.A00 = r2
        L15:
            java.lang.Object r5 = r8.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r8.A00
            if (r0 == 0) goto L44
            if (r0 != r3) goto L89
            java.lang.Object r2 = r8.A02
            java.lang.Object r1 = r8.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r1
            X.AbstractC09560e7.A00(r5)
        L28:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L3b
            X.3NX r5 = X.AbstractC25235BEs.A0f(r3)
        L32:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L76
            X.3NX r5 = (X.C3NX) r5
            java.lang.Object r0 = r5.A00
            return r0
        L3b:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto L32
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L44:
            X.AbstractC09560e7.A00(r5)
            X.0UO r0 = r11.A0L
            java.lang.Object r2 = r0.getValue()
            if (r12 == r2) goto L56
            java.lang.String r1 = "live_comments"
            java.lang.String r0 = "Tried to unpin not currently pinned comment."
            X.C0w9.A03(r1, r0)
        L56:
            X.05A r1 = r11.A0H
            r0 = 0
            r1.Egh(r0)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r5 = r11.A0O
            java.lang.String r6 = r12.getPk()
            X.C57147PWz.A00(r11, r2, r8, r3)
            r7 = r13
            r9 = r15
            java.lang.Object r5 = r5.A06(r6, r7, r8, r9)
            if (r5 != r4) goto L6e
            return r4
        L6e:
            r1 = r11
            goto L28
        L70:
            X.PWz r8 = new X.PWz
            r8.<init>(r11, r14, r3)
            goto L15
        L76:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 == 0) goto L84
            X.05A r0 = r1.A0H
            r0.Egh(r2)
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        L84:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L89:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0E(X.PIu, java.lang.String, X.1Ds, long):java.lang.Object");
    }

    public final void A0J(String str, C19L c19l) {
        C14360o3.A0B(str, 1);
        if (this.A06 == null) {
            GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub = new GraphQLSubscriptionRequestStub(new IGGraphQLSubscriptionRequestStringStub("ig_live_video_comment_create_subscribe", GraphQLSubscriptionID.IGLIVE_COMMENT_QUERY_ID), OQS.class);
            graphQLSubscriptionRequestStub.addQueryParameter(TraceFieldType.BroadcastId, str);
            this.A06 = ((IGRealtimeGraphQLObserverHolder) this.A0C.getValue()).subscribe(graphQLSubscriptionRequestStub, new C55811OqM(2, this, c19l), null);
        }
        if (this.A05 == null) {
            GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub2 = new GraphQLSubscriptionRequestStub(new IGGraphQLSubscriptionRequestStringStub("live_comment_like_subscribe", GraphQLSubscriptionID.IGLIVE_COMMENT_LIKE_QUERY_ID), OQR.class);
            graphQLSubscriptionRequestStub2.addQueryParameter(TraceFieldType.BroadcastId, str);
            this.A05 = ((IGRealtimeGraphQLObserverHolder) this.A0C.getValue()).subscribe(graphQLSubscriptionRequestStub2, new C55811OqM(3, this, c19l), null);
        }
    }

    public static IgLiveCommentsRepository A00(Object obj, PXA pxa) {
        IgLiveCommentsRepository igLiveCommentsRepository = (IgLiveCommentsRepository) pxa.A01;
        AbstractC09560e7.A00(obj);
        return igLiveCommentsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r9, java.util.List r10, X.InterfaceC23621Ds r11, boolean r12) {
        /*
            r3 = 23
            boolean r0 = X.PX6.A02(r11, r3)
            if (r0 == 0) goto L7c
            r7 = r11
            X.PX6 r7 = (X.PX6) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A04
            X.1JX r8 = X.C1JX.A02
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L44
            if (r0 != r6) goto L82
            java.lang.Object r2 = r7.A03
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r7.A02
            java.lang.Object r9 = r7.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r9 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r9
            X.AbstractC09560e7.A00(r1)
        L2e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r2.next()
            X.0Ui r0 = r9.A0U
            X.PX6.A00(r9, r5, r2, r7, r6)
            java.lang.Object r0 = r0.emit(r1, r7)
            if (r0 != r8) goto L2e
            return r8
        L44:
            java.util.ArrayList r5 = X.MSY.A0i(r1)
            java.util.Iterator r4 = r10.iterator()
        L4c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.PIs r0 = (X.C56801PIs) r0
            com.instagram.user.model.User r2 = r0.A01
            if (r2 == 0) goto L4c
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r9.A0A
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = r2.equals(r0)
            X.AbstractC25228BEl.A1Q(r3, r5, r0)
            goto L4c
        L6d:
            if (r12 == 0) goto L77
            java.util.List r0 = r9.A0S
            r0.addAll(r5)
        L74:
            X.0eB r8 = X.C0eB.A00
            return r8
        L77:
            java.util.Iterator r2 = r5.iterator()
            goto L2e
        L7c:
            X.PX6 r7 = new X.PX6
            r7.<init>(r9, r11, r3)
            goto L16
        L82:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A03(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, java.util.List, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r14, java.util.List r15, X.InterfaceC23621Ds r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A04(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, java.util.List, X.1Ds, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r21, X.InterfaceC23621Ds r22) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A05(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0055 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0064 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 49
            boolean r0 = X.PXA.A03(r8, r3)
            if (r0 == 0) goto L71
            r5 = r8
            X.PXA r5 = (X.PXA) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L67
            if (r0 == r3) goto L44
            if (r0 != r4) goto L76
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r7 = A00(r1, r5)
        L28:
            java.util.List r1 = r7.A0S
            boolean r0 = X.AbstractC166987dD.A1b(r1)
            if (r0 == 0) goto L7b
            java.util.Iterator r0 = r1.iterator()
            X.0Ui r2 = r7.A0U
            java.lang.Object r1 = r0.next()
            X.PXA.A01(r7, r0, r5, r3)
            java.lang.Object r1 = r2.emit(r1, r5)
            if (r1 != r6) goto L4c
            return r6
        L44:
            java.lang.Object r0 = r5.A02
            java.util.Iterator r0 = (java.util.Iterator) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r7 = A00(r1, r5)
        L4c:
            r0.remove()
            X.05A r0 = r7.A0W
            boolean r0 = X.AbstractC31176DnK.A1b(r0)
            if (r0 != 0) goto L28
            long r1 = r7.A01
            r5.A01 = r7
            r0 = 0
            r5.A02 = r0
            r5.A00 = r4
            java.lang.Object r0 = X.AbstractC89993zf.A01(r5, r1)
            if (r0 != r6) goto L28
            return r6
        L67:
            X.AbstractC09560e7.A00(r1)
            boolean r0 = r7.A09
            if (r0 != 0) goto L7e
            r7.A09 = r3
            goto L28
        L71:
            X.PXA r5 = X.PXA.A00(r7, r8, r3)
            goto L16
        L76:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L7b:
            r0 = 0
            r7.A09 = r0
        L7e:
            X.0eB r6 = X.C0eB.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A06(com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository, X.1Ds):java.lang.Object");
    }

    public static final void A07(UserSession userSession, C56803PIu c56803PIu, IgLiveCommentsRepository igLiveCommentsRepository, HashMap hashMap, HashMap hashMap2, List list) {
        C51745MtU c51745MtU;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C56803PIu c56803PIu2 = (C56803PIu) it.next();
                User user = c56803PIu2.A08;
                if (user != null) {
                    c56803PIu2.A06 = AbstractC109714wx.A00(AbstractC31171DnF.A0h(user.getId(), hashMap));
                    C51745MtU c51745MtU2 = (C51745MtU) hashMap2.get(user.getId());
                    if (c51745MtU2 != null) {
                        int i = c51745MtU2.A00;
                        c56803PIu2.A01 = i;
                        if (i >= AbstractC25225BEi.A07(C06090Tz.A06, userSession, 36593671117800921L)) {
                            if (igLiveCommentsRepository.A0P == EnumC142806cg.A03) {
                                if (c51745MtU2.A02) {
                                    c56803PIu2.A0H = true;
                                }
                            } else if (C18U.A06(C06090Tz.A05, userSession, 36312196141024243L)) {
                                c56803PIu2.A0H = true;
                            }
                        }
                    }
                }
            }
        }
        if (c56803PIu != null && (c51745MtU = c56803PIu.A05) != null) {
            int i2 = c51745MtU.A00;
            c56803PIu.A01 = i2;
            c56803PIu.A06 = (LiveUserPaySupportTier) c51745MtU.A01;
            if (i2 >= AbstractC25225BEi.A07(C06090Tz.A06, userSession, 36593671117800921L)) {
                if (igLiveCommentsRepository.A0P == EnumC142806cg.A03) {
                    if (!c51745MtU.A02) {
                        return;
                    }
                } else if (!C18U.A06(C06090Tz.A05, userSession, 36312196141024243L)) {
                    return;
                }
                c56803PIu.A0H = true;
            }
        }
    }

    private final void A08(N3I n3i) {
        C26087BgG c26087BgG = n3i.A01;
        if (c26087BgG != null) {
            UserSession userSession = this.A0A;
            List A0m = MSY.A0m(n3i.A04);
            A07(userSession, n3i.A03, this, (HashMap) c26087BgG.A01, (HashMap) c26087BgG.A02, A0m);
        }
    }

    public static final void A09(C56803PIu c56803PIu, IgLiveCommentsRepository igLiveCommentsRepository, boolean z) {
        C05A c05a;
        if (z) {
            if (igLiveCommentsRepository.A0P.ordinal() == 0) {
                c05a = igLiveCommentsRepository.A0H;
                C56803PIu c56803PIu2 = (C56803PIu) c05a.getValue();
                if ((c56803PIu2 == null || !AbstractC50102Ry.A00(c56803PIu.getPk(), c56803PIu2.getPk()) || (AbstractC50102Ry.A00(Integer.valueOf(c56803PIu.A01), Integer.valueOf(c56803PIu2.A01)) && AbstractC50102Ry.A00(c56803PIu.A06, c56803PIu2.A06))) && (!c56803PIu.A0G || !AbstractC31176DnK.A1b(igLiveCommentsRepository.A0W))) {
                    return;
                }
            } else {
                String pk = c56803PIu.getPk();
                if (!c56803PIu.A07.A00() || c56803PIu.A0E || pk == null || C171547kk.A03.A00(igLiveCommentsRepository.A0A).A00.getBoolean(pk, false)) {
                    return;
                } else {
                    c05a = igLiveCommentsRepository.A0H;
                }
            }
            c05a.Egh(c56803PIu);
            return;
        }
        C05A c05a2 = igLiveCommentsRepository.A0H;
        if (!C14360o3.A0K(c05a2.getValue(), c56803PIu)) {
            return;
        }
        c05a2.Egh(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(com.instagram.api.schemas.LiveUserPaySupportTier r19, java.lang.String r20, java.lang.String r21, X.InterfaceC23621Ds r22, int r23, int r24, long r25, long r27, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0A(com.instagram.api.schemas.LiveUserPaySupportTier, java.lang.String, java.lang.String, X.1Ds, int, int, long, long, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0B(X.C56803PIu r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = this;
            r3 = 46
            boolean r0 = X.PXA.A03(r8, r3)
            if (r0 == 0) goto L60
            r4 = r8
            X.PXA r4 = (X.PXA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A03
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L4f
            if (r0 != r2) goto L73
            java.lang.Object r6 = r4.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r1 = A00(r3, r4)
        L27:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L46
            X.05A r1 = r1.A0H
            java.lang.Object r0 = r1.getValue()
            if (r0 != r6) goto L39
            r0 = 0
            r1.Egh(r0)
        L39:
            X.3NX r3 = X.AbstractC25235BEs.A0f(r2)
        L3d:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L65
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            return r0
        L46:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L3d
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4f:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r0 = r5.A0O
            X.PXA.A01(r5, r6, r4, r2)
            java.lang.Object r3 = r0.A00(r6, r7, r4)
            if (r3 != r1) goto L5e
            return r1
        L5e:
            r1 = r5
            goto L27
        L60:
            X.PXA r4 = X.PXA.A00(r5, r8, r3)
            goto L16
        L65:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L6e
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        L6e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L73:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0B(X.PIu, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0F(java.lang.String r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = this;
            r3 = 23
            boolean r0 = X.PX4.A02(r8, r3)
            if (r0 == 0) goto L4e
            r4 = r8
            X.PX4 r4 = (X.PX4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L40
            if (r0 != r1) goto L61
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L37
            X.3NX r3 = X.AbstractC25235BEs.A0f(r1)
        L2e:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L53
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            return r0
        L37:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L2e
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L40:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi r0 = r5.A0O
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r6, r7, r4)
            if (r3 != r2) goto L24
            return r2
        L4e:
            X.PX4 r4 = X.PX4.A00(r5, r8, r3)
            goto L16
        L53:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L5c
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        L5c:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L61:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0F(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0G(java.lang.String r22, X.InterfaceC23621Ds r23) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0G(java.lang.String, X.1Ds):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0064 -> B:12:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1JX A0H(X.InterfaceC23621Ds r12) {
        /*
            r11 = this;
            r3 = 20
            boolean r0 = X.C57146PWy.A01(r12, r3)
            if (r0 == 0) goto L80
            r5 = r12
            X.PWy r5 = (X.C57146PWy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L67
            if (r0 == r2) goto L48
            if (r0 == r3) goto L48
            if (r0 != r4) goto L86
            java.lang.Object r9 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r9 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r9
            X.AbstractC09560e7.A00(r1)
        L2e:
            java.util.List r0 = r9.A0S
            int r0 = r0.size()
            r5.A01 = r9
            if (r0 > r2) goto L41
            r5.A00 = r2
            java.lang.Object r0 = A05(r9, r5)
        L3e:
            if (r0 != r6) goto L4f
            return r6
        L41:
            r5.A00 = r3
            java.lang.Object r0 = A06(r9, r5)
            goto L3e
        L48:
            java.lang.Object r9 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r9 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r9
            X.AbstractC09560e7.A00(r1)
        L4f:
            com.instagram.common.session.UserSession r8 = r9.A0A
            X.0Tz r7 = X.C06090Tz.A05
            r0 = 36592807829308119(0x8200f7000002d7, double:3.2047772464401013E-306)
            long r0 = X.C18U.A01(r7, r8, r0)
            r5.A01 = r9
            r5.A00 = r4
            java.lang.Object r0 = X.AbstractC89993zf.A01(r5, r0)
            if (r0 != r6) goto L2e
            return r6
        L67:
            X.AbstractC09560e7.A00(r1)
            long r9 = java.lang.System.currentTimeMillis()
            long r0 = r11.A02
            long r9 = r9 - r0
            r7 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 < 0) goto L7e
            r0 = 0
            r11.A02 = r0
            r0 = 0
            r11.A07 = r0
        L7e:
            r9 = r11
            goto L2e
        L80:
            X.PWy r5 = new X.PWy
            r5.<init>(r11, r12, r3)
            goto L16
        L86:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository.A0H(X.1Ds):X.1JX");
    }

    public final void A0I() {
        this.A0H.Egh(null);
        this.A0G.Egh(new C50526MSf(false, false, 18));
        this.A02 = 0L;
        this.A07 = null;
        this.A03 = 0L;
        this.A00 = 0;
        this.A04 = 0L;
        this.A01 = C18U.A01(C06090Tz.A05, this.A0A, 36592807829308119L);
        AbstractC166997dE.A1Y(this.A0W, true);
        this.A09 = false;
        this.A0T.clear();
        this.A0B.clear();
        this.A0S.clear();
    }

    public IgLiveCommentsRepository(UserSession userSession, IgLiveCommentsApi igLiveCommentsApi, EnumC142806cg enumC142806cg, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager) {
        boolean A1V = AbstractC167007dF.A1V(igLiveBroadcastInfoManager);
        this.A0A = userSession;
        this.A0Q = igLiveBroadcastInfoManager;
        this.A0P = enumC142806cg;
        this.A0O = igLiveCommentsApi;
        this.A0C = AbstractC09440dt.A01(C57541PgF.A01(this, 4));
        this.A01 = C18U.A01(C06090Tz.A05, userSession, 36592807829308119L);
        this.A08 = AbstractC166987dD.A1E();
        C008002u A1A = AbstractC25235BEs.A1A(A1V);
        this.A0W = A1A;
        this.A0K = AbstractC208910l.A02(A1A);
        this.A0T = AbstractC31171DnF.A0l();
        this.A0B = AbstractC31171DnF.A0l();
        this.A0S = AbstractC166987dD.A1E();
        this.A0R = PUC.A00;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A0U = A00;
        this.A0E = new C06160Ug(null, A00);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A0D = A12;
        this.A0F = AbstractC07080Za.A03(A12);
        C008002u A002 = C10E.A00(null);
        this.A0H = A002;
        this.A0L = AbstractC208910l.A02(A002);
        AnonymousClass057 A003 = C10M.A00(num, 0, 0);
        this.A0V = A003;
        this.A0I = new C06160Ug(null, A003);
        C42201xA A004 = AbstractC42021ws.A00();
        this.A0M = A004;
        this.A0N = A004;
        C008002u A1H = AbstractC25225BEi.A1H(new C50526MSf(false, false, 18));
        this.A0G = A1H;
        this.A0J = AbstractC208910l.A02(A1H);
    }
}
