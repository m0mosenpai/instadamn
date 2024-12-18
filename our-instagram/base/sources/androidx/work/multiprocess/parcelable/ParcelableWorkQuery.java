package androidx.work.multiprocess.parcelable;

import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.C2VW;
import X.C3EE;
import X.EnumC48482Kp;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes10.dex */
public class ParcelableWorkQuery implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(79);
    public final C3EE A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C3EE c3ee = this.A00;
        List list = c3ee.A00;
        parcel.writeInt(list.size());
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().toString());
            }
        }
        parcel.writeStringList(c3ee.A03);
        parcel.writeStringList(c3ee.A02);
        List list2 = c3ee.A01;
        parcel.writeInt(list2.size());
        if (!list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(C2VW.A00((EnumC48482Kp) it2.next()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public ParcelableWorkQuery(Parcel parcel) {
        ?? emptyList = Collections.emptyList();
        int readInt = parcel.readInt();
        int i = 0;
        if (readInt > 0) {
            emptyList = AbstractC25225BEi.A17(readInt);
            int i2 = 0;
            do {
                emptyList.add(UUID.fromString(parcel.readString()));
                i2++;
            } while (i2 < readInt);
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        ?? emptyList2 = Collections.emptyList();
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            emptyList2 = AbstractC25225BEi.A17(readInt2);
            do {
                emptyList2.add(C2VW.A04(parcel.readInt()));
                i++;
            } while (i < readInt2);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList A1E3 = AbstractC166987dD.A1E();
        ArrayList A1E4 = AbstractC166987dD.A1E();
        A1E.addAll(emptyList);
        A1E2.addAll(createStringArrayList);
        A1E3.addAll(createStringArrayList2);
        A1E4.addAll(emptyList2);
        if (A1E.isEmpty() && A1E2.isEmpty() && A1E3.isEmpty() && A1E4.isEmpty()) {
            throw AbstractC166987dD.A12("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
        }
        this.A00 = new C3EE(A1E, A1E4, A1E3, A1E2);
    }
}
