package com.instagram.model.mediasize;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37357Gcz;
import X.C17T;
import X.C37926GmO;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoAdditionalCandidates extends C17T implements AdditionalCandidates {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(41);

    @Override // com.instagram.model.mediasize.AdditionalCandidates
    public final ExtendedImageUrl B6a() {
        C37926GmO c37926GmO = (C37926GmO) A05(-702473442, C37926GmO.class);
        if (c37926GmO != null) {
            return new ExtendedImageUrl(c37926GmO);
        }
        return null;
    }

    @Override // com.instagram.model.mediasize.AdditionalCandidates
    public final ExtendedImageUrl BGL() {
        C37926GmO c37926GmO = (C37926GmO) A05(-1509059201, C37926GmO.class);
        if (c37926GmO != null) {
            return new ExtendedImageUrl(c37926GmO);
        }
        return null;
    }

    @Override // com.instagram.model.mediasize.AdditionalCandidates
    public final ExtendedImageUrl Bxr() {
        C37926GmO c37926GmO = (C37926GmO) A05(-159946889, C37926GmO.class);
        if (c37926GmO != null) {
            return new ExtendedImageUrl(c37926GmO);
        }
        return null;
    }

    @Override // com.instagram.model.mediasize.AdditionalCandidates
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37357Gcz.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.mediasize.AdditionalCandidates
    public final AdditionalCandidatesImpl F5A() {
        return new AdditionalCandidatesImpl(B6a(), BGL(), Bxr());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
