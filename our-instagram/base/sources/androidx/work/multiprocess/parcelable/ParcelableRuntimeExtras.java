package androidx.work.multiprocess.parcelable;

import X.AbstractC25225BEi;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C1114150f;
import X.Py5;
import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class ParcelableRuntimeExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(74);
    public C1114150f A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r5.isEmpty() != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            X.50f r2 = r7.A00
            android.net.Network r1 = r2.A00
            r6 = 1
            boolean r0 = X.AbstractC167007dF.A1W(r1)
            r8.writeInt(r0)
            if (r0 == 0) goto L11
            r8.writeParcelable(r1, r9)
        L11:
            java.util.List r5 = r2.A02
            java.util.List r4 = r2.A01
            if (r5 == 0) goto L1e
            boolean r1 = r5.isEmpty()
            r0 = 1
            if (r1 == 0) goto L1f
        L1e:
            r0 = 0
        L1f:
            r8.writeInt(r0)
            if (r0 == 0) goto L39
            int r3 = r5.size()
            android.net.Uri[] r2 = new android.net.Uri[r3]
            r1 = 0
        L2b:
            if (r1 >= r3) goto L36
            java.lang.Object r0 = r5.get(r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L2b
        L36:
            r8.writeParcelableArray(r2, r9)
        L39:
            if (r4 == 0) goto L4a
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L4a
        L41:
            r8.writeInt(r6)
            if (r6 == 0) goto L49
            r8.writeStringList(r4)
        L49:
            return
        L4a:
            r6 = 0
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras.writeToParcel(android.os.Parcel, int):void");
    }

    public ParcelableRuntimeExtras(Parcel parcel) {
        Network network;
        ArrayList arrayList;
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        if (AbstractC58320PtC.A1T(parcel)) {
            network = (Network) parcel.readParcelable(A0g);
        } else {
            network = null;
        }
        if (parcel.readInt() == 1) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(A0g);
            arrayList = AbstractC25225BEi.A17(readParcelableArray.length);
            for (Parcelable parcelable : readParcelableArray) {
                arrayList.add(parcelable);
            }
        } else {
            arrayList = null;
        }
        ArrayList<String> createStringArrayList = parcel.readInt() == 1 ? parcel.createStringArrayList() : null;
        C1114150f c1114150f = new C1114150f();
        this.A00 = c1114150f;
        c1114150f.A00 = network;
        if (arrayList != null) {
            c1114150f.A02 = arrayList;
        }
        if (createStringArrayList != null) {
            c1114150f.A01 = createStringArrayList;
        }
    }
}
