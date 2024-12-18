package androidx.media3.extractor.metadata.scte35;

import X.AbstractC25225BEi;
import X.C72708Xlg;
import X.C72814Xnd;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = new Py5(51);
    public final List A00;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C72814Xnd c72814Xnd = (C72814Xnd) list.get(i2);
            parcel.writeLong(c72814Xnd.A04);
            parcel.writeByte(c72814Xnd.A0A ? (byte) 1 : (byte) 0);
            parcel.writeByte(c72814Xnd.A08 ? (byte) 1 : (byte) 0);
            parcel.writeByte(c72814Xnd.A09 ? (byte) 1 : (byte) 0);
            List list2 = c72814Xnd.A06;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C72708Xlg c72708Xlg = (C72708Xlg) list2.get(i3);
                parcel.writeInt(c72708Xlg.A00);
                parcel.writeLong(c72708Xlg.A01);
            }
            parcel.writeLong(c72814Xnd.A05);
            parcel.writeByte(c72814Xnd.A07 ? (byte) 1 : (byte) 0);
            parcel.writeLong(c72814Xnd.A03);
            parcel.writeInt(c72814Xnd.A02);
            parcel.writeInt(c72814Xnd.A00);
            parcel.writeInt(c72814Xnd.A01);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList A17 = AbstractC25225BEi.A17(readInt);
        for (int i = 0; i < readInt; i++) {
            A17.add(new C72814Xnd(parcel));
        }
        this.A00 = Collections.unmodifiableList(A17);
    }
}
