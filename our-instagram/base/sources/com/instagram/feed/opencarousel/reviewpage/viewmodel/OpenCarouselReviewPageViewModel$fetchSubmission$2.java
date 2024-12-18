package com.instagram.feed.opencarousel.reviewpage.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C154796xU;
import X.C16930sl;
import X.C38333GtS;
import X.C42342Ip4;
import X.EnumC46210Kcm;
import X.HGR;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.feed.opencarousel.reviewpage.viewmodel.OpenCarouselReviewPageViewModel$fetchSubmission$2", f = "OpenCarouselReviewPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class OpenCarouselReviewPageViewModel$fetchSubmission$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ C154796xU A00;
    public final /* synthetic */ C38333GtS A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenCarouselReviewPageViewModel$fetchSubmission$2(C154796xU c154796xU, C38333GtS c38333GtS, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A03 = z;
        this.A01 = c38333GtS;
        this.A02 = z2;
        this.A00 = c154796xU;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z = this.A03;
        return new OpenCarouselReviewPageViewModel$fetchSubmission$2(this.A00, this.A01, interfaceC23621Ds, z, this.A02);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OpenCarouselReviewPageViewModel$fetchSubmission$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        if (this.A03) {
            C42342Ip4 c42342Ip4 = this.A01.A02;
            c42342Ip4.A01 = C16930sl.A00;
            c42342Ip4.A00 = null;
        }
        C38333GtS c38333GtS = this.A01;
        C42342Ip4 c42342Ip42 = c38333GtS.A02;
        boolean z = this.A02;
        EnumC46210Kcm A05 = c38333GtS.A05();
        C154796xU c154796xU = this.A00;
        AbstractC167017dG.A1P(A05, c154796xU);
        String str = c42342Ip42.A04;
        if (str != null) {
            HGR hgr = new HGR(0, c154796xU, c38333GtS, c42342Ip42, z);
            AbstractC166987dD.A1Z(new OpenCarouselReviewPageRepository$fetchSubmissions$1(hgr, c154796xU, A05, c42342Ip42, c38333GtS, str, null, z), c42342Ip42.A05);
        }
        return C0eB.A00;
    }
}
