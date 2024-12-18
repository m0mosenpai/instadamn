package com.instagram.model.shopping.clips;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.I3P;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoClipsShoppingCTABar extends C17T implements ClipsShoppingCTABarIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(52);

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I3P.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final Float Abx() {
        return A0K(-870720966);
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final Integer Azv() {
        return getOptionalIntValueByHashCode(-1951372724);
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final List BhF() {
        return getOptionalStringListByHashCode(1380866040);
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final ClipsShoppingCTABar F5y() {
        Float A0K = A0K(-870720966);
        String A0i = A0i(-1644797643);
        String A0i2 = A0i(-1429847026);
        String A0i3 = A0i(1714924804);
        return new ClipsShoppingCTABar(A0K, getOptionalIntValueByHashCode(-1951372724), A0i, A0i2, A0i3, A0U(), A0Y(), A0i(1483766239), A0i(1984645353), getOptionalStringListByHashCode(1380866040));
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getCtaBarType() {
        return A0i(-1644797643);
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getDestination() {
        return A0i(-1429847026);
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getDominantColor() {
        return A0i(1714924804);
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getSubtitle() {
        return A0U();
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getTitle() {
        return A0Y();
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getToggledDestination() {
        return A0i(1483766239);
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf
    public final String getToggledTitle() {
        return A0i(1984645353);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
