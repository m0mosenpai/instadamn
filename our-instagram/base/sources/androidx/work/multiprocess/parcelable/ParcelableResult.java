package androidx.work.multiprocess.parcelable;

import X.AbstractC1114350h;
import X.AbstractC166987dD;
import X.AbstractC31175DnJ;
import X.AbstractC43594JPz;
import X.C1114250g;
import X.C48532Kv;
import X.C51A;
import X.Py5;
import X.QA1;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ParcelableResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(73);
    public final AbstractC1114350h A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        AbstractC1114350h abstractC1114350h = this.A00;
        if (abstractC1114350h instanceof QA1) {
            i2 = 1;
        } else if (abstractC1114350h instanceof C51A) {
            i2 = 2;
        } else if (abstractC1114350h instanceof C1114250g) {
            i2 = 3;
        } else {
            throw AbstractC43594JPz.A0o(abstractC1114350h, "Unknown Result ", AbstractC166987dD.A1C());
        }
        parcel.writeInt(i2);
        new ParcelableData(abstractC1114350h.A00()).writeToParcel(parcel, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParcelableResult(Parcel parcel) {
        AbstractC1114350h abstractC1114350h;
        int readInt = parcel.readInt();
        C48532Kv c48532Kv = new ParcelableData(parcel).A00;
        if (readInt == 1) {
            abstractC1114350h = new Object();
        } else if (readInt == 2) {
            abstractC1114350h = new C51A(c48532Kv);
        } else if (readInt == 3) {
            abstractC1114350h = new C1114250g(c48532Kv);
        } else {
            throw AbstractC31175DnJ.A0U("Unknown result type ", readInt);
        }
        this.A00 = abstractC1114350h;
    }
}
