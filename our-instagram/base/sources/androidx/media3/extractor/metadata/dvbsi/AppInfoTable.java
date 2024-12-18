package androidx.media3.extractor.metadata.dvbsi;

import X.AnonymousClass001;
import X.Py5;
import X.Y15;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

/* loaded from: classes10.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = Py5.A00(27);
    public final int A00;
    public final String A01;

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void E4j(Y15 y15) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return AnonymousClass001.A08(this.A00, "Ait(controlCode=", ",url=", this.A01, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public AppInfoTable(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
