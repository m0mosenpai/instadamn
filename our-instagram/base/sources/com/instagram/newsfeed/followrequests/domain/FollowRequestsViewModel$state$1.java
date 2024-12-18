package com.instagram.newsfeed.followrequests.domain;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16590sC;
import X.InterfaceC23621Ds;
import X.N86;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.newsfeed.followrequests.domain.FollowRequestsViewModel$state$1", f = "FollowRequestsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class FollowRequestsViewModel$state$1 extends AbstractC23611Dp implements InterfaceC16590sC {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;
    public final /* synthetic */ N86 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowRequestsViewModel$state$1(N86 n86, InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
        this.A04 = n86;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1a = AbstractC166987dD.A1a(obj2);
        FollowRequestsViewModel$state$1 followRequestsViewModel$state$1 = new FollowRequestsViewModel$state$1(this.A04, (InterfaceC23621Ds) obj5);
        followRequestsViewModel$state$1.A00 = obj;
        followRequestsViewModel$state$1.A03 = A1a;
        followRequestsViewModel$state$1.A01 = obj3;
        followRequestsViewModel$state$1.A02 = obj4;
        return followRequestsViewModel$state$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x012a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10.A01, 36319497585434077L) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x014f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10.A01, 36319720923733620L) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r7 < r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0273, code lost:
    
        if (r5 == com.instagram.user.model.FollowStatus.A05) goto L108;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.domain.FollowRequestsViewModel$state$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
