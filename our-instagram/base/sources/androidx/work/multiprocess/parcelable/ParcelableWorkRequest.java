package androidx.work.multiprocess.parcelable;

import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.AbstractC37304Gc5;
import X.AbstractC58320PtC;
import X.C2L0;
import X.C2VW;
import X.C48412Ki;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes10.dex */
public class ParcelableWorkRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(80);
    public final C2L0 A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C2L0 c2l0 = this.A00;
        parcel.writeString(AbstractC166987dD.A19(c2l0.A02));
        parcel.writeStringList(AbstractC166987dD.A1F(c2l0.A01));
        C48412Ki c48412Ki = c2l0.A00;
        parcel.writeString(c48412Ki.A0I);
        parcel.writeString(c48412Ki.A0H);
        parcel.writeInt(C2VW.A00(c48412Ki.A0E));
        new ParcelableData(c48412Ki.A0C).writeToParcel(parcel, i);
        new ParcelableData(c48412Ki.A0D).writeToParcel(parcel, i);
        parcel.writeLong(c48412Ki.A05);
        parcel.writeLong(c48412Ki.A06);
        parcel.writeLong(c48412Ki.A04);
        parcel.writeInt(c48412Ki.A02);
        parcel.writeParcelable(new ParcelableConstraints(c48412Ki.A0B), i);
        parcel.writeInt(C2VW.A01(c48412Ki.A0F));
        parcel.writeLong(c48412Ki.A03);
        parcel.writeLong(c48412Ki.A08);
        parcel.writeLong(c48412Ki.A0A);
        parcel.writeInt(c48412Ki.A0J ? 1 : 0);
        parcel.writeInt(C2VW.A03(c48412Ki.A0G));
    }

    public ParcelableWorkRequest(Parcel parcel) {
        String readString = parcel.readString();
        HashSet A0k = AbstractC31171DnF.A0k(parcel.createStringArrayList());
        C48412Ki c48412Ki = new C48412Ki(readString, parcel.readString());
        c48412Ki.A0H = parcel.readString();
        c48412Ki.A0E = C2VW.A04(parcel.readInt());
        c48412Ki.A0C = new ParcelableData(parcel).A00;
        c48412Ki.A0D = new ParcelableData(parcel).A00;
        c48412Ki.A05 = parcel.readLong();
        c48412Ki.A06 = parcel.readLong();
        c48412Ki.A04 = parcel.readLong();
        c48412Ki.A02 = parcel.readInt();
        c48412Ki.A0B = ((ParcelableConstraints) AbstractC37304Gc5.A04(parcel, getClass())).A00;
        c48412Ki.A0F = C2VW.A05(parcel.readInt());
        c48412Ki.A03 = parcel.readLong();
        c48412Ki.A08 = parcel.readLong();
        c48412Ki.A0A = parcel.readLong();
        c48412Ki.A0J = AbstractC58320PtC.A1T(parcel);
        c48412Ki.A0G = C2VW.A07(parcel.readInt());
        this.A00 = new C2L0(c48412Ki, A0k, UUID.fromString(readString));
    }

    public ParcelableWorkRequest(C2L0 c2l0) {
        this.A00 = c2l0;
    }
}
