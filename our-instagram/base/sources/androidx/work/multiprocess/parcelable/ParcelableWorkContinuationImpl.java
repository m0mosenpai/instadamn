package androidx.work.multiprocess.parcelable;

import X.AbstractC58318PtA;
import X.C05F;
import X.C2L0;
import X.C62895SWb;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes10.dex */
public class ParcelableWorkContinuationImpl implements Parcelable {
    public static final Integer[] A01 = C05F.A00(4);
    public static final Parcelable.Creator CREATOR = Py5.A00(76);
    public C62895SWb A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.os.Parcelable, java.lang.Object, androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C62895SWb c62895SWb = this.A00;
        String str = c62895SWb.A02;
        int i2 = 1;
        int i3 = !TextUtils.isEmpty(str) ? 1 : 0;
        parcel.writeInt(i3);
        if (i3 != 0) {
            parcel.writeString(str);
        }
        AbstractC58318PtA.A1H(parcel, c62895SWb.A01);
        List list = c62895SWb.A03;
        parcel.writeInt(list.size());
        if (!list.isEmpty()) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                parcel.writeParcelable(new ParcelableWorkRequest((C2L0) list.get(i4)), i);
            }
        }
        List list2 = c62895SWb.A00;
        if (list2 == null || list2.isEmpty()) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (i2 != 0) {
            parcel.writeInt(list2.size());
            for (int i5 = 0; i5 < list2.size(); i5++) {
                C62895SWb c62895SWb2 = (C62895SWb) list2.get(i5);
                ?? obj = new Object();
                obj.A00 = c62895SWb2;
                parcel.writeParcelable(obj, i);
            }
        }
    }
}
