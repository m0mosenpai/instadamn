package androidx.work.multiprocess.parcelable;

import X.AbstractC25225BEi;
import X.AbstractC58319PtB;
import X.Py5;
import X.SPO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes10.dex */
public class ParcelableWorkInfos implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(78);
    public final List A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        ParcelableWorkInfo[] parcelableWorkInfoArr = new ParcelableWorkInfo[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcelableWorkInfoArr[i2] = new ParcelableWorkInfo((SPO) list.get(i2));
        }
        parcel.writeParcelableArray(parcelableWorkInfoArr, i);
    }

    public ParcelableWorkInfos(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(AbstractC58319PtB.A0g(this));
        this.A00 = AbstractC25225BEi.A17(readParcelableArray.length);
        for (Parcelable parcelable : readParcelableArray) {
            this.A00.add(((ParcelableWorkInfo) parcelable).A00);
        }
    }

    public ParcelableWorkInfos(List list) {
        this.A00 = list;
    }
}
