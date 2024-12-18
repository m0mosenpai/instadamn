package X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Xnd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72814Xnd {
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

    public C72814Xnd(Parcel parcel) {
        this.A04 = parcel.readLong();
        this.A0A = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A08 = AbstractC167007dF.A1P(parcel.readByte(), 1);
        this.A09 = AbstractC167007dF.A1P(parcel.readByte(), 1);
        int readInt = parcel.readInt();
        ArrayList A17 = AbstractC25225BEi.A17(readInt);
        for (int i = 0; i < readInt; i++) {
            A17.add(new C72708Xlg(parcel.readInt(), parcel.readLong()));
        }
        this.A06 = Collections.unmodifiableList(A17);
        this.A05 = parcel.readLong();
        this.A07 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }
}
