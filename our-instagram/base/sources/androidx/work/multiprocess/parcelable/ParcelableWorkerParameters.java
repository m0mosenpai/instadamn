package androidx.work.multiprocess.parcelable;

import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.C1114150f;
import X.C48532Kv;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes10.dex */
public class ParcelableWorkerParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(82);
    public final int A00;
    public final int A01;
    public final C48532Kv A02;
    public final C1114150f A03;
    public final Set A04;
    public final UUID A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05.toString());
        new ParcelableData(this.A02).writeToParcel(parcel, i);
        parcel.writeStringList(AbstractC166987dD.A1F(this.A04));
        C1114150f c1114150f = this.A03;
        ?? obj = new Object();
        obj.A00 = c1114150f;
        obj.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public ParcelableWorkerParameters(Parcel parcel) {
        this.A05 = UUID.fromString(parcel.readString());
        this.A02 = new ParcelableData(parcel).A00;
        this.A04 = AbstractC31171DnF.A0k(parcel.createStringArrayList());
        this.A03 = new ParcelableRuntimeExtras(parcel).A00;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public ParcelableWorkerParameters(WorkerParameters workerParameters) {
        this.A05 = workerParameters.A09;
        this.A02 = workerParameters.A02;
        this.A04 = workerParameters.A08;
        this.A03 = workerParameters.A06;
        this.A01 = workerParameters.A01;
        this.A00 = workerParameters.A00;
    }
}
