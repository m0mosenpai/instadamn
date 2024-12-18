package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC40049Hpb;
import X.C14360o3;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class ImmutablePandoLocationNoteResponseInfo extends C17T implements LocationNoteResponseInfo {
    public static final AbstractC136426Fv CREATOR = new C39307HXy(13);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.LocationNoteResponseInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC40049Hpb.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.LocationNoteResponseInfo
    public final String BOO() {
        return A0h(552319461);
    }

    @Override // com.instagram.api.schemas.LocationNoteResponseInfo
    public final String BOP() {
        return A0h(-1796793131);
    }

    @Override // com.instagram.api.schemas.LocationNoteResponseInfo
    public final LocationNoteResponseInfoImpl Ew7() {
        return new LocationNoteResponseInfoImpl(A0h(552319461), A0h(-1796793131));
    }
}
