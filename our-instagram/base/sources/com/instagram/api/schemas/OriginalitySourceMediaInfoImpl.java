package com.instagram.api.schemas;

import X.AbstractC40130Hqx;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes3.dex */
public final class OriginalitySourceMediaInfoImpl extends C0T6 implements Parcelable, OriginalitySourceMediaInfo {
    public static final Parcelable.Creator CREATOR = new C206159Ax(79);
    public final User A00;
    public final String A01;

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final OriginalitySourceMediaInfo E9X(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final OriginalitySourceMediaInfoImpl Exn(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final OriginalitySourceMediaInfoImpl Exo(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OriginalitySourceMediaInfoImpl) {
                OriginalitySourceMediaInfoImpl originalitySourceMediaInfoImpl = (OriginalitySourceMediaInfoImpl) obj;
                if (!C14360o3.A0K(this.A01, originalitySourceMediaInfoImpl.A01) || !C14360o3.A0K(this.A00, originalitySourceMediaInfoImpl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        User user = this.A00;
        return hashCode + (user != null ? user.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final User CDj() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTROriginalitySourceMediaInfo", AbstractC40130Hqx.A00(this));
    }

    @Override // com.instagram.api.schemas.OriginalitySourceMediaInfo
    public final String getPk() {
        return this.A01;
    }

    public OriginalitySourceMediaInfoImpl(User user, String str) {
        this.A01 = str;
        this.A00 = user;
    }
}
