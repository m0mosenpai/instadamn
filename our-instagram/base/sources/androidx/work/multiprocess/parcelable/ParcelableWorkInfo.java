package androidx.work.multiprocess.parcelable;

import X.AbstractC166987dD;
import X.AbstractC25233BEq;
import X.AbstractC58319PtB;
import X.C14360o3;
import X.C2VW;
import X.C48532Kv;
import X.C48562Ky;
import X.EnumC48482Kp;
import X.Py5;
import X.SPO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes10.dex */
public class ParcelableWorkInfo implements Parcelable {
    public static final String[] A01 = new String[0];
    public static final Parcelable.Creator CREATOR = Py5.A00(77);
    public final SPO A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SPO spo = this.A00;
        parcel.writeString(spo.A07.toString());
        parcel.writeInt(C2VW.A00(spo.A05));
        new ParcelableData(spo.A03).writeToParcel(parcel, i);
        parcel.writeStringArray((String[]) AbstractC166987dD.A1F(spo.A06).toArray(A01));
        new ParcelableData(spo.A04).writeToParcel(parcel, i);
        parcel.writeInt(spo.A01);
        parcel.writeInt(spo.A00);
    }

    public ParcelableWorkInfo(Parcel parcel) {
        UUID fromString = UUID.fromString(parcel.readString());
        EnumC48482Kp A04 = C2VW.A04(parcel.readInt());
        C48532Kv c48532Kv = new ParcelableData(parcel).A00;
        HashSet A13 = AbstractC58319PtB.A13(parcel.createStringArray());
        C48532Kv c48532Kv2 = new ParcelableData(parcel).A00;
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        C14360o3.A0B(fromString, 1);
        AbstractC25233BEq.A0x(2, A04, c48532Kv, c48532Kv2);
        this.A00 = new SPO(C48562Ky.A08, c48532Kv, c48532Kv2, null, A04, A13, fromString, readInt, readInt2, -256, 0L, Long.MAX_VALUE);
    }

    public ParcelableWorkInfo(SPO spo) {
        this.A00 = spo;
    }
}
