package X;

/* loaded from: classes5.dex */
public abstract class CBP {
    public static final int A00(AbstractC122975hY abstractC122975hY, C59V c59v) {
        C59V A0V;
        if (c59v instanceof C59U) {
            A0V = ((C59U) c59v).A06;
        } else {
            C59U c59u = ((AbstractC137606Lg) c59v).A04.A06;
            if (c59u != null) {
                A0V = c59u.A0V();
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Child of ");
            A1C.append(c59v);
            AbstractC28290Cdc.A01(AbstractC166997dE.A0x(" cannot be null when calculating alignment line", A1C));
            throw C00O.createAndThrow();
        }
        if (A0V != null) {
            if (c59v.A0N().Aaw().containsKey(abstractC122975hY)) {
                return AbstractC25227BEk.A06((Number) c59v.A0N().Aaw().get(abstractC122975hY), Integer.MIN_VALUE);
            }
            int AX8 = A0V.AX8(abstractC122975hY);
            if (AX8 == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            A0V.A03 = true;
            c59v.A02 = true;
            c59v.A0O();
            A0V.A03 = false;
            c59v.A02 = false;
            return AX8 + ((int) AbstractC25236BEt.A07(abstractC122975hY instanceof C122965hX ? 1 : 0, A0V.A0M()));
        }
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append("Child of ");
        A1C2.append(c59v);
        AbstractC28290Cdc.A01(AbstractC166997dE.A0x(" cannot be null when calculating alignment line", A1C2));
        throw C00O.createAndThrow();
    }
}
