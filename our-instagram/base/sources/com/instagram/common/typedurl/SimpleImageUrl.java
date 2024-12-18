package com.instagram.common.typedurl;

import X.AnonymousClass001;
import X.C0w9;
import X.C206139Av;
import X.C223116k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public class SimpleImageUrl extends ImageUrlBase {
    public static C223116k A03 = C223116k.A04;
    public static final Parcelable.Creator CREATOR = new C206139Av(60);
    public final int A00;
    public final int A01;
    public final String A02;

    @Override // com.instagram.common.typedurl.ImageUrl
    public final List B2e() {
        return null;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final Boolean BJa() {
        return null;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final ImageLoggingData BOm() {
        return null;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final List BxS() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final String getScansProfile() {
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimpleImageUrl(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L13
            X.16k r1 = com.instagram.common.typedurl.SimpleImageUrl.A03
            boolean r0 = r1.A03
            if (r0 == 0) goto L11
            int r2 = r1.A01
            java.lang.String r1 = "SimpleImageUrl"
            java.lang.String r0 = "SimpleImageUrl created with null URL. Use a null ImageUrl instead."
            X.C0w9.A04(r1, r0, r2)
        L11:
            java.lang.String r4 = ""
        L13:
            r0 = -1
            r3.<init>(r4, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.typedurl.SimpleImageUrl.<init>(java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SimpleImageUrl simpleImageUrl = (SimpleImageUrl) obj;
            if (this.A01 == simpleImageUrl.A01 && this.A00 == simpleImageUrl.A00) {
                return this.A02.equals(simpleImageUrl.A02);
            }
        }
        return false;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final int getHeight() {
        return this.A00;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final String getUrl() {
        return this.A02;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final int getWidth() {
        return this.A01;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0y("ImageUrl: mUrl = ", this.A02, ", width/height = ", "/", this.A01, this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public SimpleImageUrl(String str, int i, int i2) {
        if (str == null) {
            C223116k c223116k = A03;
            if (c223116k.A03) {
                C0w9.A04("SimpleImageUrl", "SimpleImageUrl created with null URL. Use a null ImageUrl instead.", c223116k.A01);
            }
            str = "";
        }
        C223116k c223116k2 = A03;
        if (str.isEmpty() && c223116k2.A02) {
            C0w9.A04("SimpleImageUrl", "SimpleImageUrl created with empty URL. Use a null ImageUrl instead.", c223116k2.A00);
        }
        this.A02 = str.startsWith("data:image/jpeg;base64,") ? AnonymousClass001.A0R("base64:/", str.substring(23)) : str;
        this.A01 = i;
        this.A00 = i2;
    }

    public SimpleImageUrl(ImageUrl imageUrl) {
        this(imageUrl.getUrl(), imageUrl.getWidth(), imageUrl.getHeight());
    }
}
