package androidx.media3.extractor.metadata.icy;

import X.AbstractC166987dD;
import X.AbstractC31177DnL;
import X.AbstractC37304Gc5;
import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.JQ0;
import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;

/* loaded from: classes10.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(31);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.A00 != icyHeaders.A00 || !Util.A0F(this.A02, icyHeaders.A02) || !Util.A0F(this.A03, icyHeaders.A03) || !Util.A0F(this.A04, icyHeaders.A04) || this.A05 != icyHeaders.A05 || this.A01 != icyHeaders.A01) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void E4j(Y15 y15) {
        String str = this.A03;
        if (str != null) {
            y15.A0D = str;
        }
        String str2 = this.A02;
        if (str2 != null) {
            y15.A0C = str2;
        }
    }

    public final int hashCode() {
        return ((((((((JQ0.A01(this.A00) + AbstractC31177DnL.A04(this.A02)) * 31) + AbstractC31177DnL.A04(this.A03)) * 31) + AbstractC58321PtD.A0D(this.A04)) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A01);
    }

    public IcyHeaders(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = AbstractC37304Gc5.A1V(parcel);
        this.A01 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IcyHeaders: name=\"");
        A1C.append(this.A03);
        A1C.append("\", genre=\"");
        A1C.append(this.A02);
        A1C.append("\", bitrate=");
        A1C.append(this.A00);
        A1C.append(", metadataInterval=");
        return AbstractC58318PtA.A0l(A1C, this.A01);
    }
}
