package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoFormattedString extends C17T implements FormattedString {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(71);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.FormattedString
    public final FormattedStringImpl Eth() {
        return new FormattedStringImpl(A0P());
    }

    @Override // com.instagram.api.schemas.FormattedString
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (A0P() != null) {
            AbstractC37300Gc1.A15(A0P(), A0X);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // com.instagram.api.schemas.FormattedString
    public final String getText() {
        return A0P();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
