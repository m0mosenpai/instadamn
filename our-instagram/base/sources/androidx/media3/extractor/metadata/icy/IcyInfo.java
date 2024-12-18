package androidx.media3.extractor.metadata.icy;

import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(32);
    public final String A00;
    public final String A01;
    public final byte[] A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void E4j(Y15 y15) {
        String str = this.A00;
        if (str != null) {
            y15.A0F = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.A02, ((IcyInfo) obj).A02);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A02);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.A00, this.A01, Integer.valueOf(this.A02.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.A02 = createByteArray;
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
