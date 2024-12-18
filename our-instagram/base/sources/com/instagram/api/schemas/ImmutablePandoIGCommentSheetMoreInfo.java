package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGCommentSheetMoreInfo extends C17T implements IGCommentSheetMoreInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(98);

    @Override // com.instagram.api.schemas.IGCommentSheetMoreInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getText() != null) {
            AbstractC37300Gc1.A15(getText(), A1I);
        }
        if (C6l() != null) {
            A1I.put("text_source", C6l());
        }
        return AbstractC25234BEr.A0P(this, AbstractC06930Yk.A0B(A1I));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGCommentSheetMoreInfo
    public final String C6l() {
        return A0i(-692624531);
    }

    @Override // com.instagram.api.schemas.IGCommentSheetMoreInfo
    public final IGCommentSheetMoreInfoImpl Euc() {
        return new IGCommentSheetMoreInfoImpl(A0X(), A0i(-692624531));
    }

    @Override // com.instagram.api.schemas.IGCommentSheetMoreInfo
    public final String getText() {
        return A0X();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
