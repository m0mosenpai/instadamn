package com.instagram.feed.media;

import X.AbstractC06950Ym;
import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37356Gcy;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.ImmutablePandoAttributionUser;
import com.instagram.api.schemas.ImmutablePandoGenAIToolInfoDict;
import com.instagram.model.shopping.ImmutablePandoProductItemWithAR;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreativeConfig extends C17T implements CreativeConfigIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(33);
    public ProductItemWithARIntf A00;

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final AttributionUser AdP() {
        return (AttributionUser) A05(115051403, ImmutablePandoAttributionUser.class);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final List Asl() {
        return A08(95981973, ImmutablePandoCameraToolInfo.class);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final List B0S() {
        return A08(1616979139, ImmutablePandoEffectPreview.class);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final EffectPreviewIntf B0a() {
        return (EffectPreviewIntf) A05(347677466, ImmutablePandoEffectPreview.class);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final ProductItemWithARIntf B0b() {
        ProductItemWithARIntf productItemWithARIntf = this.A00;
        if (productItemWithARIntf == null) {
            return (ProductItemWithARIntf) A05(356387905, ImmutablePandoProductItemWithAR.class);
        }
        return productItemWithARIntf;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final List B9a() {
        return A08(1337664557, ImmutablePandoGenAIToolInfoDict.class);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final CreativeConfig F4X(C1DY c1dy) {
        AttributionUserImpl attributionUserImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        EffectPreview effectPreview;
        ProductItemWithAR productItemWithAR;
        AttributionUser AdP = AdP();
        ArrayList arrayList3 = null;
        if (AdP != null) {
            attributionUserImpl = AdP.Eqz();
        } else {
            attributionUserImpl = null;
        }
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(-590004159);
        String A0i = A0i(767106195);
        List Asl = Asl();
        if (Asl != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(Asl, 10));
            Iterator it = Asl.iterator();
            while (it.hasNext()) {
                arrayList.add(((CameraToolInfoIntf) it.next()).F4T());
            }
        } else {
            arrayList = null;
        }
        String A0i2 = A0i(1246001165);
        String A0j = A0j(-564585278);
        List B0S = B0S();
        if (B0S != null) {
            arrayList2 = new ArrayList(AbstractC06950Ym.A1E(B0S, 10));
            Iterator it2 = B0S.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((EffectPreviewIntf) it2.next()).F4a());
            }
        } else {
            arrayList2 = null;
        }
        EffectPreviewIntf B0a = B0a();
        if (B0a != null) {
            effectPreview = B0a.F4a();
        } else {
            effectPreview = null;
        }
        ProductItemWithARIntf B0b = B0b();
        if (B0b != null) {
            productItemWithAR = B0b.F5v(c1dy);
        } else {
            productItemWithAR = null;
        }
        String A0i3 = A0i(-1061995346);
        String A0j2 = A0j(1705526055);
        String A0i4 = A0i(1743941273);
        String A0i5 = A0i(-1792227267);
        List B9a = B9a();
        if (B9a != null) {
            arrayList3 = new ArrayList(AbstractC06950Ym.A1E(B9a, 10));
            Iterator it3 = B9a.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((GenAIToolInfoDictIntf) it3.next()).Etq());
            }
        }
        return new CreativeConfig(attributionUserImpl, effectPreview, productItemWithAR, A0i, A0i2, A0j, A0i3, A0j2, A0i4, A0i5, A0i(777500950), optionalStringListByHashCode, arrayList, arrayList2, arrayList3);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37356Gcy.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final List Ak7() {
        return getOptionalStringListByHashCode(-590004159);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String AzG() {
        return A0i(1246001165);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String AzH() {
        return A0j(-564585278);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String B3R() {
        return A0i(-1061995346);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String B3z() {
        return A0j(1705526055);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String B85() {
        return A0i(-1792227267);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String BcZ() {
        return A0i(777500950);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final CreativeConfigIntf EBM(C1DY c1dy) {
        ProductItemWithARIntf B0b = B0b();
        if (B0b != null) {
            B0b.EBl(c1dy);
        } else {
            B0b = null;
        }
        this.A00 = B0b;
        return this;
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final CreativeConfig F4Y(C1DV c1dv) {
        return F4X(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String getCaptureType() {
        return A0i(767106195);
    }

    @Override // com.instagram.feed.media.CreativeConfigIntf
    public final String getFailureReason() {
        return A0i(1743941273);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
