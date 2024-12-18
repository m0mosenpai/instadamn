package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import java.io.IOException;

/* renamed from: X.HGr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39041HGr extends AbstractC65806TuP {
    public InterfaceC41501vz A00;
    public InterfaceC41501vz A01;
    public InterfaceC41501vz A02;
    public C41219IMi A03;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.IMi, java.lang.Object] */
    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        ProductFeedItem productFeedItem;
        ProductTile productTile;
        ImageUrl imageUrl;
        String A0L;
        UserSession A01 = AbstractC03270Dk.A01(C6BQ.A0A(c6fg));
        if (A01 == null) {
            AbstractC25241Le.A02(AbstractC111324zv.A00(158), AbstractC111324zv.A00(589));
        } else {
            this.A03 = new Object();
            C66479UJd c66479UJd = (C66479UJd) view.getTag();
            if (c66479UJd == null) {
                c66479UJd = new C66479UJd(view, false);
                view.setTag(c66479UJd);
            }
            C102884kP A08 = c102884kP.A08(35);
            if (A08 != null && (productTile = (productFeedItem = new ProductFeedItem(AbstractC41287IPc.A01(A08))).A02) != null) {
                productTile.A04 = new RankingInfo(c102884kP.A0L(48), c102884kP.A0L(49), null);
                C42914IyS A00 = AbstractC41674Id3.A00(c6fg, c102884kP, A01, false);
                AbstractC41674Id3.A02(c102884kP, productFeedItem);
                try {
                    A0L = c102884kP.A0L(53);
                } catch (IOException unused) {
                }
                if (A0L != null) {
                    C38321qM A0C = C38321qM.A0h.A0C(C07950bF.A04.A01(A01, A0L), true, false);
                    if (A0C != null && A0C.A1t() != null && productFeedItem.A02() != null && productFeedItem.A02 != null) {
                        imageUrl = A0C.A1S();
                        ProductTile productTile2 = productFeedItem.A02;
                        productTile2.A05 = A0C;
                        productTile2.A06 = new ProductTileMedia(A0C.A1t(), productFeedItem.A02().A0B, A0C.getId(), A0C.BU6());
                        AbstractC41674Id3.A01(A00, c102884kP, A01, imageUrl, this.A03, productFeedItem, c66479UJd, false);
                        this.A01 = new C42273Inx(this, A00, c6fg, c102884kP, A01, imageUrl, productFeedItem, c66479UJd);
                        this.A02 = new C42266Inq(1, new IMC(c6fg, c102884kP, c102884kP.A0B(74), c102884kP.A0B(73), c102884kP.A0B(77), c102884kP.A0B(76)), this);
                        this.A00 = new C42270Inu(1, this, c102884kP, c6fg);
                        C25671My A002 = AbstractC25651Mw.A00(A01);
                        A002.A01(this.A01, C3HW.class);
                        A002.A01(this.A02, C42257Inh.class);
                        A002.A01(this.A00, C42253Ind.class);
                        return null;
                    }
                }
                imageUrl = null;
                AbstractC41674Id3.A01(A00, c102884kP, A01, imageUrl, this.A03, productFeedItem, c66479UJd, false);
                this.A01 = new C42273Inx(this, A00, c6fg, c102884kP, A01, imageUrl, productFeedItem, c66479UJd);
                this.A02 = new C42266Inq(1, new IMC(c6fg, c102884kP, c102884kP.A0B(74), c102884kP.A0B(73), c102884kP.A0B(77), c102884kP.A0B(76)), this);
                this.A00 = new C42270Inu(1, this, c102884kP, c6fg);
                C25671My A0022 = AbstractC25651Mw.A00(A01);
                A0022.A01(this.A01, C3HW.class);
                A0022.A01(this.A02, C42257Inh.class);
                A0022.A01(this.A00, C42253Ind.class);
                return null;
            }
        }
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        if (this.A01 == null && this.A02 == null && this.A00 == null) {
            return;
        }
        UserSession A01 = AbstractC03270Dk.A01(C6BQ.A0A(c6fg));
        if (A01 == null) {
            AbstractC25241Le.A02(AbstractC111324zv.A00(158), AbstractC111324zv.A00(589));
            return;
        }
        InterfaceC41501vz interfaceC41501vz = this.A01;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(A01).A02(interfaceC41501vz, C3HW.class);
        }
        InterfaceC41501vz interfaceC41501vz2 = this.A02;
        if (interfaceC41501vz2 != null) {
            AbstractC25651Mw.A00(A01).A02(interfaceC41501vz2, C42257Inh.class);
        }
        InterfaceC41501vz interfaceC41501vz3 = this.A00;
        if (interfaceC41501vz3 == null) {
            return;
        }
        AbstractC25651Mw.A00(A01).A02(interfaceC41501vz3, C42253Ind.class);
    }

    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        return AbstractC31172DnG.A0A(LayoutInflater.from(context), null, R.layout.product_tile_grid_item);
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }

    public C39041HGr(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
