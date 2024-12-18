package X;

import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.feed.media.ReelCTA;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ReelProductLinkIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ABw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22997ABw {
    public ShoppingSwipeUpCTATextIcon A00;
    public EffectPreviewIntf A01;
    public ProductCollectionLinkIntf A02;
    public ProfileShopLinkIntf A03;
    public ReelMultiProductLinkIntf A04;
    public ReelProductLinkIntf A05;
    public Boolean A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public List A0E;
    public final ReelCTAIntf A0F;

    public final ReelCTA A00() {
        EffectPreview effectPreview;
        ArrayList arrayList;
        ReelMultiProductLink reelMultiProductLink;
        ArrayList arrayList2;
        ProductCollectionLink productCollectionLink;
        ReelProductLink reelProductLink;
        C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
        ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon = this.A00;
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A09;
        EffectPreviewIntf effectPreviewIntf = this.A01;
        if (effectPreviewIntf != null) {
            effectPreview = effectPreviewIntf.F4a();
        } else {
            effectPreview = null;
        }
        String str4 = this.A0A;
        String str5 = this.A0B;
        Boolean bool = this.A06;
        List list = this.A0D;
        if (list != null) {
            arrayList = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AndroidLink) it.next()).F53());
            }
        } else {
            arrayList = null;
        }
        ReelMultiProductLinkIntf reelMultiProductLinkIntf = this.A04;
        if (reelMultiProductLinkIntf != null) {
            reelMultiProductLink = reelMultiProductLinkIntf.F6Q(c1dy);
        } else {
            reelMultiProductLink = null;
        }
        String str6 = this.A0C;
        List list2 = this.A0E;
        if (list2 != null) {
            arrayList2 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AndroidLink) it2.next()).F53());
            }
        } else {
            arrayList2 = null;
        }
        ProductCollectionLinkIntf productCollectionLinkIntf = this.A02;
        if (productCollectionLinkIntf != null) {
            productCollectionLink = productCollectionLinkIntf.F6H();
        } else {
            productCollectionLink = null;
        }
        ReelProductLinkIntf reelProductLinkIntf = this.A05;
        if (reelProductLinkIntf != null) {
            reelProductLink = reelProductLinkIntf.F6R(c1dy);
        } else {
            reelProductLink = null;
        }
        ProfileShopLinkIntf profileShopLinkIntf = this.A03;
        return new ReelCTA(shoppingSwipeUpCTATextIcon, effectPreview, productCollectionLink, profileShopLinkIntf != null ? profileShopLinkIntf.F6P() : null, reelMultiProductLink, reelProductLink, bool, str, str2, str3, str4, str5, str6, arrayList, arrayList2);
    }

    public C22997ABw(ReelCTA reelCTA) {
        this.A0F = reelCTA;
        this.A00 = reelCTA.Ath();
        this.A07 = reelCTA.Ati();
        this.A08 = reelCTA.Atj();
        this.A09 = reelCTA.Ats();
        this.A01 = reelCTA.B0a();
        this.A0A = reelCTA.B64();
        this.A0B = reelCTA.B65();
        this.A06 = reelCTA.BBv();
        this.A0D = reelCTA.BNi();
        this.A04 = reelCTA.BVO();
        this.A0C = reelCTA.BYV();
        this.A0E = reelCTA.Bgp();
        this.A02 = reelCTA.Bgs();
        this.A05 = reelCTA.BhC();
        this.A03 = reelCTA.Bi5();
    }
}
