package X;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes10.dex */
public final class Q9o extends AbstractC63032Sb4 {
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;
    public final Parcel A05;
    public final SparseIntArray A06;
    public final String A07;

    public Q9o(Parcel parcel) {
        this(parcel, new C005001p(0), new C005001p(0), new C005001p(0), "", parcel.dataPosition(), parcel.dataSize());
    }

    public Q9o(Parcel parcel, C005001p c005001p, C005001p c005001p2, C005001p c005001p3, String str, int i, int i2) {
        super(c005001p, c005001p2, c005001p3);
        this.A06 = new SparseIntArray();
        this.A00 = -1;
        this.A01 = -1;
        this.A05 = parcel;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i;
        this.A07 = str;
    }
}
