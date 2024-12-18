package com.instagram.common.gallery.metadata;

import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class ImmersiveMediaFields extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(57);
    public String A00 = null;
    public boolean A01 = false;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImmersiveMediaFields) {
                ImmersiveMediaFields immersiveMediaFields = (ImmersiveMediaFields) obj;
                if (!C14360o3.A0K(this.A00, immersiveMediaFields.A00) || this.A01 != immersiveMediaFields.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0m("ImmersiveMediaFields(glbUrl=", this.A00, ", enabled3d=", ')', this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }
}
