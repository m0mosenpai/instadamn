package com.instagram.feed.media;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37382GdO;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.api.schemas.ImmutablePandoAttributionUser;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import com.instagram.model.shopping.ImmutablePandoEffectThumbnailImageDict;

/* loaded from: classes7.dex */
public final class ImmutablePandoEffectPreview extends C17T implements EffectPreviewIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(35);

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final AttributionUser AdP() {
        return (AttributionUser) A04(115051403, ImmutablePandoAttributionUser.class);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final EffectActionSheetIntf B0O() {
        return (EffectActionSheetIntf) A05(-1579695612, ImmutablePandoEffectActionSheet.class);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final EffectThumbnailImageDictIntf C84() {
        return (EffectThumbnailImageDictIntf) A05(2074606664, ImmutablePandoEffectThumbnailImageDict.class);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37382GdO.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String AxJ() {
        return A0i(1977249010);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final ImageUrl BEx() {
        return A0A(-737588055);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final Boolean CPi() {
        return getOptionalBooleanValueByHashCode(1258407760);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final EffectPreview F4a() {
        EffectActionSheet effectActionSheet;
        AttributionUserImpl Eqz = AdP().Eqz();
        String A0i = A0i(1977249010);
        EffectActionSheetIntf B0O = B0O();
        EffectThumbnailImageDict effectThumbnailImageDict = null;
        if (B0O != null) {
            effectActionSheet = B0O.F4Z();
        } else {
            effectActionSheet = null;
        }
        String A0j = A0j(-1468661111);
        String A0i2 = A0i(-190801022);
        String A0i3 = A0i(1743941273);
        String A0i4 = A0i(1181455637);
        ImageUrl A0A = A0A(-737588055);
        String A0g = A0g();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1258407760);
        String A0Q = A0Q();
        String A0h = A0h(841995508);
        EffectThumbnailImageDictIntf C84 = C84();
        if (C84 != null) {
            effectThumbnailImageDict = C84.F5t();
        }
        return new EffectPreview(Eqz, A0A, effectActionSheet, effectThumbnailImageDict, optionalBooleanValueByHashCode, A0i, A0j, A0i2, A0i3, A0i4, A0g, A0Q, A0h, A0Y());
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getEffectId() {
        return A0j(-1468661111);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getFailureCode() {
        return A0i(-190801022);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getFailureReason() {
        return A0i(1743941273);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getFormattedClipsMediaCount() {
        return A0i(1181455637);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getId() {
        return A0g();
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getName() {
        return A0Q();
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getSaveStatus() {
        return A0h(841995508);
    }

    @Override // com.instagram.feed.media.EffectPreviewIntf
    public final String getTitle() {
        return A0Y();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
