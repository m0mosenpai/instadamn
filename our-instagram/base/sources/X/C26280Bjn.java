package X;

import java.util.BitSet;

/* renamed from: X.Bjn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26280Bjn extends AbstractC77733dx {
    public C2XE A00;
    public C26658Bpt A01;
    public final BitSet A02;
    public final String[] A03;

    public C26280Bjn(C2XE c2xe, C26658Bpt c26658Bpt) {
        super(c26658Bpt, c2xe, 0);
        this.A03 = new String[]{"color"};
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = c26658Bpt;
        this.A00 = c2xe;
        bitSet.clear();
    }

    public final C26658Bpt A0A() {
        AbstractC77733dx.A00(this.A02, this.A03, 1);
        A03();
        return this.A01;
    }

    public final void A0B(int i) {
        this.A01.A00 = i;
        this.A02.set(0);
    }
}
