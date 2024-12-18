package X;

import java.util.BitSet;

/* loaded from: classes5.dex */
public final class BUJ extends AbstractC77733dx {
    public C2XE A00;
    public C25339BJi A01;
    public final BitSet A02;
    public final String[] A03;

    public BUJ(C2XE c2xe, C25339BJi c25339BJi) {
        super(c25339BJi, c2xe, 0);
        this.A03 = new String[]{"bloksContext", "bloksResolveResult"};
        BitSet bitSet = new BitSet(2);
        this.A02 = bitSet;
        this.A01 = c25339BJi;
        this.A00 = c2xe;
        bitSet.clear();
    }
}
