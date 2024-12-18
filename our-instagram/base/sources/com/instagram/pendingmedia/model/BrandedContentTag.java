package com.instagram.pendingmedia.model;

import X.AbstractC25231BEo;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class BrandedContentTag implements Parcelable {
    public static final C37324GcR CREATOR = new C37324GcR(2);
    public User A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandedContentTag)) {
            return false;
        }
        BrandedContentTag brandedContentTag = (BrandedContentTag) obj;
        return C14360o3.A0K(this.A01, brandedContentTag.A01) && C14360o3.A0K(this.A02, brandedContentTag.A02) && this.A04 == brandedContentTag.A04 && this.A03 == brandedContentTag.A03;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(String.valueOf(this.A04));
        parcel.writeString(String.valueOf(this.A03));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, Boolean.valueOf(this.A04), Boolean.valueOf(this.A03)});
    }

    public BrandedContentTag(User user, boolean z, boolean z2) {
        this.A02 = "";
        this.A01 = AbstractC25231BEo.A0t(user);
        this.A02 = user != null ? user.getUsername() : "";
        this.A04 = z;
        this.A03 = z2;
        this.A00 = user;
    }

    public BrandedContentTag(BrandedContentTag brandedContentTag) {
        C14360o3.A0B(brandedContentTag, 1);
        this.A02 = "";
        this.A01 = brandedContentTag.A01;
        this.A02 = brandedContentTag.A02;
        this.A04 = brandedContentTag.A04;
        this.A03 = brandedContentTag.A03;
    }

    public BrandedContentTag(User user) {
        this.A02 = "";
        this.A01 = user.getId();
        this.A02 = user.getUsername();
        this.A00 = user;
    }

    public BrandedContentTag() {
        this.A02 = "";
    }
}
