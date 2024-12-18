package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39927HnI;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoFileCandidate extends C17T implements FileCandidate {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(70);

    @Override // com.instagram.api.schemas.FileCandidate
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39927HnI.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String B4U() {
        return A0i(243764420);
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String B6C() {
        return A0i(1376149820);
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String B6G() {
        return A0i(-1316310812);
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String Bdq() {
        return A0i(752641086);
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final Long Bdr() {
        return A0L(-1618220034);
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String Bds() {
        return A0i(-1755162173);
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final String C93() {
        return A0i(-1773366604);
    }

    @Override // com.instagram.api.schemas.FileCandidate
    public final FileCandidateImpl Ete() {
        return new FileCandidateImpl(A0L(-1618220034), A0i(243764420), A0i(1376149820), A0i(-1316310812), A0i(752641086), A0i(-1755162173), A0i(-1773366604));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
