package com.instagram.comments.request;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C26065Bft;
import X.EnumC166477cG;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.request.CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1", f = "CommentsFetcher.kt", i = {}, l = {422}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C26065Bft A02;
    public final /* synthetic */ CommentsFetcher A03;
    public final /* synthetic */ EnumC166477cG A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1(C26065Bft c26065Bft, CommentsFetcher commentsFetcher, EnumC166477cG enumC166477cG, InterfaceC23621Ds interfaceC23621Ds, long j, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A03 = commentsFetcher;
        this.A04 = enumC166477cG;
        this.A02 = c26065Bft;
        this.A06 = z;
        this.A05 = z2;
        this.A01 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        CommentsFetcher commentsFetcher = this.A03;
        EnumC166477cG enumC166477cG = this.A04;
        return new CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1(this.A02, commentsFetcher, enumC166477cG, interfaceC23621Ds, this.A01, this.A06, this.A05);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            CommentsFetcher commentsFetcher = this.A03;
            EnumC166477cG enumC166477cG = this.A04;
            C26065Bft c26065Bft = this.A02;
            boolean z = this.A06;
            boolean z2 = this.A05;
            long j = this.A01;
            this.A00 = 1;
            if (CommentsFetcher.A00(c26065Bft, commentsFetcher, enumC166477cG, this, j, z, z2) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
