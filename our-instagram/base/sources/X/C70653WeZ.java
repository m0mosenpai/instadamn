package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromotionMetric;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WeZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70653WeZ implements InterfaceC72003XEr {
    public XIGIGBoostCallToAction A00;
    public XIGIGBoostDestination A01;
    public InstagramMediaProductType A02;
    public PromotionMetric A03;
    public ImageUrl A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C = new ArrayList();
    public List A0D;

    @Override // X.InterfaceC72003XEr
    public final int BWj() {
        return 0;
    }

    @Override // X.InterfaceC72003XEr
    public final String AdV() {
        String str = this.A05;
        if (str == null) {
            return "--";
        }
        return str;
    }

    @Override // X.InterfaceC72003XEr
    public final XIGIGBoostCallToAction Ax0() {
        return this.A00;
    }

    @Override // X.InterfaceC72003XEr
    public final String B8A() {
        return this.A07;
    }

    @Override // X.InterfaceC72003XEr
    public final String B8I() {
        return this.A08;
    }

    @Override // X.InterfaceC72003XEr
    public final InstagramMediaProductType BIP() {
        InstagramMediaProductType instagramMediaProductType = this.A02;
        if (instagramMediaProductType != null) {
            return instagramMediaProductType;
        }
        C14360o3.A0F("instagramMediaProductType");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72003XEr
    public final List BIS() {
        return this.A0C;
    }

    @Override // X.InterfaceC72003XEr
    public final PromotionMetric BTb() {
        PromotionMetric promotionMetric = this.A03;
        if (promotionMetric != null) {
            return promotionMetric;
        }
        C14360o3.A0F("metric");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72003XEr
    public final String BZY() {
        String str = this.A09;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("organicMediaFbId");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72003XEr
    public final String BZZ() {
        String str = this.A0A;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("organicMediaIgId");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72003XEr
    public final String BeH() {
        return this.A0B;
    }

    @Override // X.InterfaceC72003XEr
    public final ImageUrl C89() {
        ImageUrl imageUrl = this.A04;
        if (imageUrl != null) {
            return imageUrl;
        }
        C14360o3.A0F("thumbnailUrl");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72003XEr
    public final boolean CXK() {
        XIGIGBoostDestination xIGIGBoostDestination = this.A01;
        if (xIGIGBoostDestination != null && xIGIGBoostDestination == XIGIGBoostDestination.A07) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC72003XEr
    public final ImmutableList BzE() {
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        return of;
    }
}
