package com.instagram.feed.opencarousel.reviewpage.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC2044893h;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C154796xU;
import X.C38290GsZ;
import X.C38333GtS;
import X.C41627IbI;
import X.C42342Ip4;
import X.EnumC46210Kcm;
import X.HGR;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.feed.opencarousel.reviewpage.viewmodel.OpenCarouselReviewPageRepository$fetchSubmissions$1", f = "OpenCarouselReviewPageRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class OpenCarouselReviewPageRepository$fetchSubmissions$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ HGR A00;
    public final /* synthetic */ C154796xU A01;
    public final /* synthetic */ EnumC46210Kcm A02;
    public final /* synthetic */ C42342Ip4 A03;
    public final /* synthetic */ C38333GtS A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenCarouselReviewPageRepository$fetchSubmissions$1(HGR hgr, C154796xU c154796xU, EnumC46210Kcm enumC46210Kcm, C42342Ip4 c42342Ip4, C38333GtS c38333GtS, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A06 = z;
        this.A03 = c42342Ip4;
        this.A01 = c154796xU;
        this.A04 = c38333GtS;
        this.A05 = str;
        this.A02 = enumC46210Kcm;
        this.A00 = hgr;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z = this.A06;
        C42342Ip4 c42342Ip4 = this.A03;
        C154796xU c154796xU = this.A01;
        C38333GtS c38333GtS = this.A04;
        String str = this.A05;
        return new OpenCarouselReviewPageRepository$fetchSubmissions$1(this.A00, c154796xU, this.A02, c42342Ip4, c38333GtS, str, interfaceC23621Ds, z);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OpenCarouselReviewPageRepository$fetchSubmissions$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        if (this.A06) {
            C42342Ip4 c42342Ip4 = this.A03;
            if (AbstractC166987dD.A1b(c42342Ip4.A01)) {
                List list = c42342Ip4.A01;
                this.A01.A03(AbstractC2044893h.A01(c42342Ip4.A02, list, false, false), new C38290GsZ(1, this.A04, true));
                return C0eB.A00;
            }
        }
        C42342Ip4 c42342Ip42 = this.A03;
        C41627IbI c41627IbI = c42342Ip42.A03;
        String str = this.A05;
        c41627IbI.A02(this.A00, this.A02, str, c42342Ip42.A00);
        return C0eB.A00;
    }
}
