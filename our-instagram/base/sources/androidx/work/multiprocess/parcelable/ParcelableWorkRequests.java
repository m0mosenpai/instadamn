package androidx.work.multiprocess.parcelable;

import X.AbstractC25225BEi;
import X.AbstractC58319PtB;
import X.C2L0;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes10.dex */
public class ParcelableWorkRequests implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(81);
    public final List A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        ParcelableWorkRequest[] parcelableWorkRequestArr = new ParcelableWorkRequest[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcelableWorkRequestArr[i2] = new ParcelableWorkRequest((C2L0) list.get(i2));
        }
        parcel.writeParcelableArray(parcelableWorkRequestArr, i);
    }

    public ParcelableWorkRequests(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(AbstractC58319PtB.A0g(this));
        this.A00 = AbstractC25225BEi.A17(readParcelableArray.length);
        for (Parcelable parcelable : readParcelableArray) {
            this.A00.add(((ParcelableWorkRequest) parcelable).A00);
        }
    }
}
