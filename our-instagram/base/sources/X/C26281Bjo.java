package X;

import java.util.BitSet;

/* renamed from: X.Bjo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26281Bjo extends AbstractC77733dx {
    public C2XE A00;
    public BUG A01;
    public final BitSet A02;
    public final String[] A03;

    public C26281Bjo(C2XE c2xe, BUG bug) {
        super(bug, c2xe, 0);
        this.A03 = new String[]{"host", "parseResult"};
        BitSet bitSet = new BitSet(2);
        this.A02 = bitSet;
        this.A01 = bug;
        this.A00 = c2xe;
        bitSet.clear();
    }

    public final BUG A0A() {
        AbstractC77733dx.A00(this.A02, this.A03, 2);
        A03();
        return this.A01;
    }

    public final void A0B(C1338462s c1338462s) {
        this.A01.A01 = c1338462s;
        this.A02.set(1);
    }

    public final void A0C(InterfaceC62872tQ interfaceC62872tQ) {
        this.A01.A02 = interfaceC62872tQ;
        this.A02.set(0);
    }
}
