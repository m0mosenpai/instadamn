package X;

import java.util.BitSet;
import java.util.List;

/* renamed from: X.91i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2041391i {
    public C2041391i A00;
    public List A01;
    public java.util.Set A02;
    public C2041391i[] A03;
    public final int A04;
    public final int A05;
    public final C2041391i A06;
    public final C2041391i A07;
    public final BitSet A08;

    public final C2041391i A00(int i) {
        List list;
        BitSet bitSet = this.A08;
        if (bitSet.get(i) && (list = this.A01) != null) {
            int i2 = 0;
            for (int nextSetBit = bitSet.nextSetBit(0); nextSetBit < i; nextSetBit = bitSet.nextSetBit(nextSetBit + 1)) {
                i2++;
            }
            return (C2041391i) list.get(i2);
        }
        return null;
    }

    public C2041391i(C2041391i c2041391i, C2041391i c2041391i2, int i, int i2) {
        this.A08 = new BitSet();
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A05 = i;
        this.A06 = c2041391i;
        this.A07 = c2041391i2;
        this.A04 = c2041391i.A04 + i2;
        this.A00 = c2041391i2;
    }

    public C2041391i() {
        this.A08 = new BitSet();
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A05 = -1;
        this.A06 = this;
        this.A07 = this;
        this.A04 = 0;
        this.A00 = this;
    }
}
