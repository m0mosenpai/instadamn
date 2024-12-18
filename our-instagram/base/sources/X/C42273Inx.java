package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.Inx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42273Inx implements InterfaceC41501vz {
    public final /* synthetic */ C39041HGr A00;
    public final /* synthetic */ C42914IyS A01;
    public final /* synthetic */ C6FG A02;
    public final /* synthetic */ C102884kP A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ ProductFeedItem A06;
    public final /* synthetic */ C66479UJd A07;

    public C42273Inx(C39041HGr c39041HGr, C42914IyS c42914IyS, C6FG c6fg, C102884kP c102884kP, UserSession userSession, ImageUrl imageUrl, ProductFeedItem productFeedItem, C66479UJd c66479UJd) {
        this.A00 = c39041HGr;
        this.A06 = productFeedItem;
        this.A02 = c6fg;
        this.A04 = userSession;
        this.A07 = c66479UJd;
        this.A01 = c42914IyS;
        this.A03 = c102884kP;
        this.A05 = imageUrl;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-761799352);
        C3HW c3hw = (C3HW) obj;
        int A032 = C0f9.A03(499150276);
        ProductFeedItem productFeedItem = this.A06;
        if (productFeedItem.A02() != null && c3hw.A00.BqK().equals(productFeedItem.A02().A0H)) {
            AbstractC41674Id3.A01(this.A01, this.A03, this.A04, this.A05, this.A00.A03, productFeedItem, this.A07, AbstractC166997dE.A0a());
        }
        C0f9.A0A(-1581698848, A032);
        C0f9.A0A(-461567621, A03);
    }
}
