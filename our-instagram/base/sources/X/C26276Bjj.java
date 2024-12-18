package X;

import java.util.BitSet;

/* renamed from: X.Bjj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26276Bjj extends AbstractC77733dx {
    public C26655Bpq A00;
    public C2XE A01;
    public final BitSet A02;
    public final String[] A03;

    public C26276Bjj(C26655Bpq c26655Bpq, C2XE c2xe) {
        super(c26655Bpq, c2xe, 0);
        this.A03 = new String[]{"fadeTransitionMs", "photoTransitionMs"};
        BitSet bitSet = new BitSet(2);
        this.A02 = bitSet;
        this.A00 = c26655Bpq;
        this.A01 = c2xe;
        bitSet.clear();
    }
}
