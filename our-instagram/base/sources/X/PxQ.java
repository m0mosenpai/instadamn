package X;

/* loaded from: classes10.dex */
public abstract class PxQ extends T9B {
    public AbstractC58533Px1 A00;
    public final AbstractC58533Px1 A01;

    public final PxQ A01() {
        PxQ pxQ = (PxQ) this.A01.A0F(C05F.A0Y);
        pxQ.A00 = A03();
        return pxQ;
    }

    public final AbstractC58533Px1 A03() {
        AbstractC58533Px1 abstractC58533Px1 = this.A00;
        if ((abstractC58533Px1.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            AbstractC58320PtC.A0d(abstractC58533Px1).Cmk(abstractC58533Px1);
            abstractC58533Px1.memoizedSerializedSize &= Integer.MAX_VALUE;
        }
        return this.A00;
    }

    public final void A04() {
        if ((this.A00.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            AbstractC58533Px1 abstractC58533Px1 = (AbstractC58533Px1) this.A01.A0F(C05F.A0N);
            AbstractC58320PtC.A0d(abstractC58533Px1).CpL(abstractC58533Px1, this.A00);
            this.A00 = abstractC58533Px1;
        }
    }

    public PxQ(AbstractC58533Px1 defaultInstance) {
        this.A01 = defaultInstance;
        if ((defaultInstance.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            throw AbstractC166987dD.A12("Default instance must be immutable.");
        }
        this.A00 = (AbstractC58533Px1) defaultInstance.A0F(C05F.A0N);
    }

    public static AbstractC58533Px1 A00(PxQ pxQ) {
        pxQ.A04();
        return pxQ.A00;
    }

    public final AbstractC58533Px1 A02() {
        AbstractC58533Px1 A03 = A03();
        if (AbstractC58533Px1.A0B(A03)) {
            return A03;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
