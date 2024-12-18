package X;

import java.util.BitSet;

/* loaded from: classes5.dex */
public final class BOO extends AbstractC77733dx {
    public C2XE A00;
    public C51632Yl A01;
    public final BitSet A02;
    public final String[] A03;

    public BOO(C2XE c2xe, C51632Yl c51632Yl) {
        super(c51632Yl, c2xe, 0);
        this.A03 = new String[]{"childComponent"};
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = c51632Yl;
        this.A00 = c2xe;
        bitSet.clear();
    }

    public final void A0A(AbstractC50812Vc abstractC50812Vc) {
        this.A01.A02 = abstractC50812Vc.A0P();
        this.A02.set(0);
    }
}
