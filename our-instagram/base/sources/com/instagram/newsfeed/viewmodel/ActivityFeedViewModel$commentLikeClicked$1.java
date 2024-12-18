package com.instagram.newsfeed.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC43591JPw;
import X.C09530e4;
import X.C0eB;
import X.C14360o3;
import X.C1JX;
import X.C51693MsO;
import X.C5HW;
import X.EnumC33370Ep3;
import X.InterfaceC11380iw;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.MCB;
import X.MUD;
import com.instagram.newsfeed.data.ActivityFeedRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$commentLikeClicked$1", f = "ActivityFeedViewModel.kt", i = {}, l = {665}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class ActivityFeedViewModel$commentLikeClicked$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MUD A02;
    public final /* synthetic */ C5HW A03;
    public final /* synthetic */ ActivityFeedViewModel A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityFeedViewModel$commentLikeClicked$1(MUD mud, C5HW c5hw, ActivityFeedViewModel activityFeedViewModel, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A06 = z;
        this.A03 = c5hw;
        this.A05 = z2;
        this.A04 = activityFeedViewModel;
        this.A01 = i;
        this.A02 = mud;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z = this.A06;
        C5HW c5hw = this.A03;
        boolean z2 = this.A05;
        return new ActivityFeedViewModel$commentLikeClicked$1(this.A02, c5hw, this.A04, interfaceC23621Ds, this.A01, z, z2);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            if (this.A06) {
                C5HW c5hw = this.A03;
                boolean z = this.A05;
                c5hw.A04.A04 = Boolean.valueOf(z);
                this.A04.A0F();
            }
            String str = this.A03.A04.A0b;
            if (str != null) {
                ActivityFeedViewModel activityFeedViewModel = this.A04;
                boolean z2 = this.A05;
                ActivityFeedRepository activityFeedRepository = activityFeedViewModel.A08;
                InterfaceC11380iw interfaceC11380iw = activityFeedViewModel.A03;
                this.A00 = 1;
                if (activityFeedRepository.A02(interfaceC11380iw, str, this, z2) == c1jx) {
                    return c1jx;
                }
            }
        }
        ActivityFeedViewModel activityFeedViewModel2 = this.A04;
        C5HW c5hw2 = this.A03;
        int i = this.A01;
        C09530e4 A1L = AbstractC166987dD.A1L(AbstractC43591JPw.A00(216), "ufi_like");
        C51693MsO c51693MsO = new C51693MsO(this.A02, EnumC33370Ep3.A06, null, i);
        C14360o3.A0B(c5hw2, 0);
        AbstractC166987dD.A1Z(new MCB(activityFeedViewModel2, c5hw2, c51693MsO, A1L, null, i, 6), AbstractC141776au.A00(activityFeedViewModel2));
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ActivityFeedViewModel$commentLikeClicked$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
