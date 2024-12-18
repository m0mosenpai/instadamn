package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class AvatarStatusImpl extends C0T6 implements Parcelable, AvatarStatus {
    public static final Parcelable.Creator CREATOR = new C206149Aw(51);
    public final boolean A00;

    @Override // com.instagram.api.schemas.AvatarStatus
    public final AvatarStatusImpl Er9() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AvatarStatusImpl) && this.A00 == ((AvatarStatusImpl) obj).A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    @Override // com.instagram.api.schemas.AvatarStatus
    public final boolean BB9() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.AvatarStatus
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_avatar", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTAvatarStatus", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public AvatarStatusImpl(boolean z) {
        this.A00 = z;
    }
}
