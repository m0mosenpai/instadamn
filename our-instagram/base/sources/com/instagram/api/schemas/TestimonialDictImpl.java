package com.instagram.api.schemas;

import X.AbstractC27530CDa;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes2.dex */
public final class TestimonialDictImpl extends C0T6 implements Parcelable, TestimonialDict {
    public static final Parcelable.Creator CREATOR = new C206139Av(29);
    public final User A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.TestimonialDict
    public final TestimonialDict EB1(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final TestimonialDictImpl F2r(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final TestimonialDictImpl F2s(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TestimonialDictImpl) {
                TestimonialDictImpl testimonialDictImpl = (TestimonialDictImpl) obj;
                if (!C14360o3.A0K(this.A00, testimonialDictImpl.A00) || !C14360o3.A0K(this.A01, testimonialDictImpl.A01) || !C14360o3.A0K(this.A02, testimonialDictImpl.A02) || !C14360o3.A0K(this.A03, testimonialDictImpl.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        User user = this.A00;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        Long l = this.A01;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.A02;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A03;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Long l = this.A01;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final User Ae9() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final Long Asa() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final String BQz() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTestimonialDict", AbstractC27530CDa.A00(this));
    }

    @Override // com.instagram.api.schemas.TestimonialDict
    public final String getText() {
        return this.A03;
    }

    public TestimonialDictImpl(User user, Long l, String str, String str2) {
        this.A00 = user;
        this.A01 = l;
        this.A02 = str;
        this.A03 = str2;
    }
}
