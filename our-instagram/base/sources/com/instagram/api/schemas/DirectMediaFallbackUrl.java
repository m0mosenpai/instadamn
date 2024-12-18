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
public final class DirectMediaFallbackUrl extends C0T6 implements Parcelable, DirectMediaFallbackUrlIntf {
    public static final Parcelable.Creator CREATOR = new C206149Aw(86);
    public final String A00;

    public DirectMediaFallbackUrl(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // com.instagram.api.schemas.DirectMediaFallbackUrlIntf
    public final DirectMediaFallbackUrl Et7() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DirectMediaFallbackUrl) && C14360o3.A0K(this.A00, ((DirectMediaFallbackUrl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    @Override // com.instagram.api.schemas.DirectMediaFallbackUrlIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("url", str);
        }
        return new TreeUpdaterJNI("XDTDirectMediaFallbackUrl", AbstractC06930Yk.A0B(linkedHashMap));
    }

    @Override // com.instagram.api.schemas.DirectMediaFallbackUrlIntf
    public final String getUrl() {
        return this.A00;
    }
}
