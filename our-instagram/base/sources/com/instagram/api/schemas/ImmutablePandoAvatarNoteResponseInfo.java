package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC39763HkZ;
import X.C14360o3;
import X.C17T;
import X.C39306HXx;
import X.J96;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class ImmutablePandoAvatarNoteResponseInfo extends C17T implements AvatarNoteResponseInfo {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(16);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.AvatarNoteResponseInfo
    public final MediaType Aef() {
        return (MediaType) A0M(1356310429, J96.A00);
    }

    @Override // com.instagram.api.schemas.AvatarNoteResponseInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC39763HkZ.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AvatarNoteResponseInfo
    public final String Aeg() {
        return A0h(858994456);
    }

    @Override // com.instagram.api.schemas.AvatarNoteResponseInfo
    public final String Amg() {
        return A0i(635999837);
    }

    @Override // com.instagram.api.schemas.AvatarNoteResponseInfo
    public final AvatarNoteResponseInfoImpl Er8() {
        return new AvatarNoteResponseInfoImpl(Aef(), A0h(858994456), A0i(635999837));
    }
}
