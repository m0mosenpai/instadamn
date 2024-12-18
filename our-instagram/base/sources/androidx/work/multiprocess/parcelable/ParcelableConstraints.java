package androidx.work.multiprocess.parcelable;

import X.AbstractC001800i;
import X.AbstractC31171DnF;
import X.AbstractC58320PtC;
import X.C14360o3;
import X.C2VW;
import X.C48562Ky;
import X.Py5;
import X.SNU;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class ParcelableConstraints implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(68);
    public final C48562Ky A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableConstraints(Parcel parcel) {
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        Integer A06 = C2VW.A06(parcel.readInt());
        C14360o3.A0B(A06, 0);
        boolean A1T = AbstractC58320PtC.A1T(parcel);
        boolean A1T2 = AbstractC58320PtC.A1T(parcel);
        boolean A1T3 = AbstractC58320PtC.A1T(parcel);
        boolean A1T4 = AbstractC58320PtC.A1T(parcel);
        if (parcel.readInt() == 1) {
            for (SNU snu : C2VW.A08(parcel.createByteArray())) {
                A0l.add(new SNU(snu.A01, snu.A00));
            }
        }
        long readLong = parcel.readLong();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long millis = timeUnit.toMillis(readLong);
        this.A00 = new C48562Ky(A06, AbstractC001800i.A0k(A0l), timeUnit.toMillis(parcel.readLong()), millis, A1T2, A1T4, A1T, A1T3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C48562Ky c48562Ky = this.A00;
        parcel.writeInt(C2VW.A02(c48562Ky.A02));
        parcel.writeInt(c48562Ky.A04 ? 1 : 0);
        parcel.writeInt(c48562Ky.A05 ? 1 : 0);
        parcel.writeInt(c48562Ky.A07 ? 1 : 0);
        parcel.writeInt(c48562Ky.A06 ? 1 : 0);
        int i2 = 1;
        Set set = c48562Ky.A03;
        if (!(!set.isEmpty())) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (i2 != 0) {
            parcel.writeByteArray(C2VW.A09(set));
        }
        parcel.writeLong(c48562Ky.A00);
        parcel.writeLong(c48562Ky.A01);
    }

    public ParcelableConstraints(C48562Ky c48562Ky) {
        this.A00 = c48562Ky;
    }
}
