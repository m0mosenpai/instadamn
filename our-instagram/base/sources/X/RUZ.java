package X;

/* loaded from: classes10.dex */
public final class RUZ extends PxQ implements InterfaceC65280ThD {
    public RUZ() {
        super(RVD.DEFAULT_INSTANCE);
    }

    public final void A05(PxH value) {
        RVD rvd = (RVD) PxQ.A00(this);
        int i = RVD.OUTPUT_PREFIX_TYPE_FIELD_NUMBER;
        rvd.outputPrefixType_ = value.A01();
    }

    public final void A06(AbstractC58536Px4 value) {
        RVD rvd = (RVD) PxQ.A00(this);
        int i = RVD.OUTPUT_PREFIX_TYPE_FIELD_NUMBER;
        value.getClass();
        rvd.value_ = value;
    }

    public final void A07(String value) {
        RVD rvd = (RVD) PxQ.A00(this);
        int i = RVD.OUTPUT_PREFIX_TYPE_FIELD_NUMBER;
        value.getClass();
        rvd.typeUrl_ = value;
    }

    @Override // X.T9B
    public final /* bridge */ /* synthetic */ Object clone() {
        return A01();
    }
}
