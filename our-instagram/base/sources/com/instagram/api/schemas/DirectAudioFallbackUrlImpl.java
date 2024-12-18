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
public final class DirectAudioFallbackUrlImpl extends C0T6 implements Parcelable, DirectAudioFallbackUrl {
    public static final Parcelable.Creator CREATOR = new C206149Aw(85);
    public final String A00;

    public DirectAudioFallbackUrlImpl(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // com.instagram.api.schemas.DirectAudioFallbackUrl
    public final DirectAudioFallbackUrlImpl Et6() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DirectAudioFallbackUrlImpl) && C14360o3.A0K(this.A00, ((DirectAudioFallbackUrlImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    @Override // com.instagram.api.schemas.DirectAudioFallbackUrl
    public final String Ae1() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.DirectAudioFallbackUrl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("audio_src", str);
        }
        return new TreeUpdaterJNI("XDTDirectAudioFallbackUrl", AbstractC06930Yk.A0B(linkedHashMap));
    }
}
