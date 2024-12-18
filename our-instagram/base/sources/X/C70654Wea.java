package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode;
import com.instagram.business.promote.model.AdsManagerPaymentAnomalyType;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromotionMetric;
import com.instagram.business.promote.model.RejectionReason;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Wea, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70654Wea implements InterfaceC72003XEr {
    public int A00;
    public XIGIGBoostCallToAction A01;
    public XIGIGBoostDestination A02;
    public AdsManagerBoostingStatusErrorCode A03;
    public AdsManagerPaymentAnomalyType A04;
    public InstagramMediaProductType A05;
    public PromotionMetric A06;
    public RejectionReason A07;
    public ImageUrl A08;
    public EnumC68195VFn A09;
    public EnumC68172VEq A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public List A0N = new ArrayList();
    public List A0O;
    public ImmutableList A0P;

    @Override // X.InterfaceC72003XEr
    public final String AdV() {
        String str = this.A0E;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("audienceDisplayNameInAdsManager");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72003XEr
    public final XIGIGBoostCallToAction Ax0() {
        return this.A01;
    }

    @Override // X.InterfaceC72003XEr
    public final String B8A() {
        return this.A0G;
    }

    @Override // X.InterfaceC72003XEr
    public final String B8I() {
        return this.A0H;
    }

    @Override // X.InterfaceC72003XEr
    public final InstagramMediaProductType BIP() {
        InstagramMediaProductType instagramMediaProductType = this.A05;
        if (instagramMediaProductType != null) {
            return instagramMediaProductType;
        }
        C14360o3.A0F("instagramMediaProductType");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72003XEr
    public final List BIS() {
        return this.A0N;
    }

    @Override // X.InterfaceC72003XEr
    public final PromotionMetric BTb() {
        PromotionMetric promotionMetric = this.A06;
        if (promotionMetric != null) {
            return promotionMetric;
        }
        C14360o3.A0F("metric");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72003XEr
    public final int BWj() {
        return this.A00;
    }

    @Override // X.InterfaceC72003XEr
    public final String BZY() {
        String str = this.A0J;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("organicMediaFbId");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72003XEr
    public final String BZZ() {
        String str = this.A0K;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("organicMediaIgId");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72003XEr
    public final String BeH() {
        return this.A0M;
    }

    @Override // X.InterfaceC72003XEr
    public final ImmutableList BzE() {
        Collection collection = this.A0O;
        if (collection == null) {
            collection = ImmutableList.of();
        }
        return AbstractC31173DnH.A0L(collection);
    }

    @Override // X.InterfaceC72003XEr
    public final ImageUrl C89() {
        ImageUrl imageUrl = this.A08;
        if (imageUrl != null) {
            return imageUrl;
        }
        C14360o3.A0F("thumbnailUrl");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72003XEr
    public final boolean CXK() {
        return AbstractC167007dF.A1X(this.A02, XIGIGBoostDestination.A07);
    }

    public C70654Wea() {
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        this.A0P = of;
    }
}
