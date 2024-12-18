package androidx.work.multiprocess.parcelable;

import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;

/* loaded from: classes10.dex */
public class ParcelableRemoteWorkRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(72);
    public final ParcelableWorkerParameters A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        this.A00.writeToParcel(parcel, i);
    }

    public ParcelableRemoteWorkRequest(WorkerParameters workerParameters, String str) {
        this.A01 = str;
        this.A00 = new ParcelableWorkerParameters(workerParameters);
    }

    public ParcelableRemoteWorkRequest(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = new ParcelableWorkerParameters(parcel);
    }
}
