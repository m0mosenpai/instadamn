package androidx.media3.container;

import X.AnonymousClass001;
import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class XmpData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(24);
    public final byte[] A00;

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void E4j(Y15 y15) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.A00, ((XmpData) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0R("XMP: ", Util.A0B(this.A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.A00);
    }

    public XmpData(Parcel parcel) {
        this.A00 = parcel.createByteArray();
    }
}
