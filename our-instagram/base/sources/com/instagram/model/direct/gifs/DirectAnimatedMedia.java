package com.instagram.model.direct.gifs;

import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import X.InterfaceC1121054c;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.GifUrlImpl;

/* loaded from: classes3.dex */
public final class DirectAnimatedMedia extends C0T6 implements Parcelable, InterfaceC1121054c {
    public static final Parcelable.Creator CREATOR = new C9Ay(5);
    public String A00;
    public final DirectAnimatedMediaUser A01;
    public final GifUrlImpl A02;
    public final Boolean A03;
    public final Boolean A04;
    public final String A05;
    public final boolean A06;

    public DirectAnimatedMedia(DirectAnimatedMediaUser directAnimatedMediaUser, GifUrlImpl gifUrlImpl, Boolean bool, Boolean bool2, String str, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(gifUrlImpl, 2);
        this.A05 = str;
        this.A02 = gifUrlImpl;
        this.A04 = bool;
        this.A06 = z;
        this.A01 = directAnimatedMediaUser;
        this.A03 = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectAnimatedMedia) {
                DirectAnimatedMedia directAnimatedMedia = (DirectAnimatedMedia) obj;
                if (!C14360o3.A0K(this.A05, directAnimatedMedia.A05) || !C14360o3.A0K(this.A02, directAnimatedMedia.A02) || !C14360o3.A0K(this.A04, directAnimatedMedia.A04) || this.A06 != directAnimatedMedia.A06 || !C14360o3.A0K(this.A01, directAnimatedMedia.A01) || !C14360o3.A0K(this.A03, directAnimatedMedia.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
        Boolean bool = this.A04;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A06 ? 1 : 0);
        DirectAnimatedMediaUser directAnimatedMediaUser = this.A01;
        if (directAnimatedMediaUser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            directAnimatedMediaUser.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.A03;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    @Override // X.InterfaceC1121054c
    public final DirectAnimatedMediaUser CDi() {
        return this.A01;
    }

    @Override // X.InterfaceC1121054c
    public final Boolean CPm() {
        return this.A03;
    }

    @Override // X.InterfaceC1121054c
    public final boolean Cdi() {
        return this.A06;
    }

    @Override // X.InterfaceC1121054c
    public final String getId() {
        return this.A05;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.A05.hashCode() * 31) + this.A02.hashCode()) * 31;
        Boolean bool = this.A04;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        DirectAnimatedMediaUser directAnimatedMediaUser = this.A01;
        if (directAnimatedMediaUser == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = directAnimatedMediaUser.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        Boolean bool2 = this.A03;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i5 + i;
    }
}
