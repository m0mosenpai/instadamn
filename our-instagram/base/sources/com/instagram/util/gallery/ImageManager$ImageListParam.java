package com.instagram.util.gallery;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C14360o3;
import X.C55344OhA;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes9.dex */
public final class ImageManager$ImageListParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(27);
    public int A00;
    public int A01;
    public Uri A02;
    public Integer A03;
    public String A04;
    public boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Integer num = this.A03;
        if (num != null) {
            parcel.writeInt(num.intValue());
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01);
            parcel.writeString(this.A04);
            parcel.writeParcelable(this.A02, i);
            parcel.writeInt(this.A05 ? 1 : 0);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImageListParam{loc=");
        Integer num = this.A03;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "INTERNAL";
                    break;
                case 2:
                    str = "EXTERNAL";
                    break;
                case 3:
                    str = "ALL";
                    break;
                default:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
            }
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(",inc=");
        A1C.append(this.A00);
        A1C.append(",sort=");
        A1C.append(this.A01);
        A1C.append(",bucket=");
        A1C.append(this.A04);
        A1C.append(",empty=");
        A1C.append(this.A05);
        A1C.append(",single=");
        A1C.append(this.A02);
        return AbstractC167027dH.A0R(A1C);
    }
}
