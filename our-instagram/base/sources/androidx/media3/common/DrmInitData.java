package androidx.media3.common;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC58321PtD;
import X.Py5;
import X.VZa;
import X.WEI;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class DrmInitData implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(16);
    public int A00;
    public final int A01;
    public final String A02;
    public final SchemeData[] A03;

    /* loaded from: classes10.dex */
    public final class SchemeData implements Parcelable {
        public static final Parcelable.Creator CREATOR = Py5.A00(17);
        public int A00;
        public final String A01;
        public final String A02;
        public final UUID A03;
        public final byte[] A04;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!Util.A0F(this.A01, schemeData.A01) || !Util.A0F(this.A02, schemeData.A02) || !Util.A0F(this.A03, schemeData.A03) || !Arrays.equals(this.A04, schemeData.A04)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.A00;
            if (i == 0) {
                int A0E = AbstractC58321PtD.A0E(this.A04, AbstractC166997dE.A0K(this.A02, (AbstractC166987dD.A0G(this.A03) + AbstractC167017dG.A0O(this.A01)) * 31));
                this.A00 = A0E;
                return A0E;
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.A03;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeByteArray(this.A04);
        }

        public SchemeData(Parcel parcel) {
            this.A03 = new UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A02 = parcel.readString();
            this.A04 = parcel.createByteArray();
        }

        public SchemeData(String str, UUID uuid, byte[] bArr) {
            uuid.getClass();
            this.A03 = uuid;
            this.A01 = null;
            this.A02 = WEI.A02(str);
            this.A04 = bArr;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DrmInitData drmInitData = (DrmInitData) obj;
            if (!Util.A0F(this.A02, drmInitData.A02) || !Arrays.equals(this.A03, drmInitData.A03)) {
                return false;
            }
        }
        return true;
    }

    public final DrmInitData A00(String str) {
        if (Util.A0F(this.A02, str)) {
            return this;
        }
        return new DrmInitData(str, this.A03, false);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        UUID uuid = VZa.A03;
        UUID uuid2 = ((SchemeData) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((SchemeData) obj2).A03;
        if (equals) {
            if (!uuid.equals(uuid3)) {
                return 1;
            }
            return 0;
        }
        return uuid2.compareTo(uuid3);
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int A0O = (AbstractC167017dG.A0O(this.A02) * 31) + Arrays.hashCode(this.A03);
            this.A00 = A0O;
            return A0O;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }

    public DrmInitData(Parcel parcel) {
        this.A02 = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
    }

    public DrmInitData(String str, SchemeData[] schemeDataArr, boolean z) {
        this.A02 = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }
}
