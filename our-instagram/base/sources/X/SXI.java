package X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class SXI {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public SXI(Parcel parcel) {
        this.A04 = parcel.readLong();
        this.A0A = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A08 = AbstractC58323PtF.A1X(parcel);
        this.A09 = AbstractC58323PtF.A1X(parcel);
        int readInt = parcel.readInt();
        ArrayList A17 = AbstractC25225BEi.A17(readInt);
        for (int i = 0; i < readInt; i++) {
            A17.add(new SEL(parcel.readInt(), parcel.readLong()));
        }
        this.A06 = Collections.unmodifiableList(A17);
        this.A05 = parcel.readLong();
        this.A07 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public SXI(List list, int i, int i2, int i3, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z4;
        this.A03 = j3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
