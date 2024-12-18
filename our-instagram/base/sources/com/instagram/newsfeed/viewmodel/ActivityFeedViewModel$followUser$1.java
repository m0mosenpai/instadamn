package com.instagram.newsfeed.viewmodel;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.MUD;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$followUser$1", f = "ActivityFeedViewModel.kt", i = {0, 0}, l = {467, 504}, m = "invokeSuspend", n = {"userAction", "newFollowStatus"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
public final class ActivityFeedViewModel$followUser$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ MUD A04;
    public final /* synthetic */ ActivityFeedViewModel A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ Integer A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityFeedViewModel$followUser$1(MUD mud, ActivityFeedViewModel activityFeedViewModel, User user, Integer num, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = user;
        this.A05 = activityFeedViewModel;
        this.A03 = i;
        this.A04 = mud;
        this.A07 = num;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        User user = this.A06;
        return new ActivityFeedViewModel$followUser$1(this.A04, this.A05, user, this.A07, interfaceC23621Ds, this.A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$followUser$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ActivityFeedViewModel$followUser$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
