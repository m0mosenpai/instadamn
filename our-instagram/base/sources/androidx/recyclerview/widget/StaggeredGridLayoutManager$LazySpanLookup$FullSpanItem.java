package androidx.recyclerview.widget;

import X.AbstractC166987dD;
import X.AbstractC167027dH;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(63);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        int[] iArr = this.A03;
        if (iArr != null && (length = iArr.length) > 0) {
            parcel.writeInt(length);
            parcel.writeIntArray(this.A03);
        } else {
            parcel.writeInt(0);
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FullSpanItem{mPosition=");
        A1C.append(this.A01);
        A1C.append(", mGapDir=");
        A1C.append(this.A00);
        A1C.append(", mHasUnwantedGapAfter=");
        A1C.append(this.A02);
        A1C.append(", mGapPerSpan=");
        A1C.append(Arrays.toString(this.A03));
        return AbstractC167027dH.A0R(A1C);
    }
}
