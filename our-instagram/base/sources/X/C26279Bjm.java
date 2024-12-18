package X;

import java.util.BitSet;

/* renamed from: X.Bjm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26279Bjm extends AbstractC77733dx {
    public C26651Bpm A00;
    public C2XE A01;
    public final BitSet A02;
    public final String[] A03;

    public C26279Bjm(C26651Bpm c26651Bpm, C2XE c2xe) {
        super(c26651Bpm, c2xe, 0);
        this.A03 = new String[]{"color", "diameter"};
        BitSet bitSet = new BitSet(2);
        this.A02 = bitSet;
        this.A00 = c26651Bpm;
        this.A01 = c2xe;
        bitSet.clear();
    }

    public final void A0A(float f) {
        this.A00.A01 = super.A02.A00(f);
        this.A02.set(1);
    }
}
