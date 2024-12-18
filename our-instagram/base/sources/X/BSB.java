package X;

import java.util.BitSet;

/* loaded from: classes5.dex */
public final class BSB extends AbstractC77733dx {
    public C2XE A00;
    public BSA A01;
    public final BitSet A02;
    public final String[] A03;

    public BSB(C2XE c2xe, BSA bsa) {
        super(bsa, c2xe, 0);
        this.A03 = new String[]{"content"};
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = bsa;
        this.A00 = c2xe;
        bitSet.clear();
    }

    public static void A01(AbstractC50812Vc abstractC50812Vc, BSB bsb) {
        AbstractC50812Vc A0P;
        BSA bsa = bsb.A01;
        if (abstractC50812Vc == null) {
            A0P = null;
        } else {
            A0P = abstractC50812Vc.A0P();
        }
        bsa.A07 = A0P;
        BitSet bitSet = bsb.A02;
        bitSet.set(0);
        AbstractC77733dx.A00(bitSet, bsb.A03, 1);
        bsb.A03();
    }
}
