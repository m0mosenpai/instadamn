package X;

/* loaded from: classes10.dex */
public final class RVD extends AbstractC58533Px1 implements InterfaceC65280ThD {
    public static final RVD DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    public static volatile InterfaceC65281ThE PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int outputPrefixType_;
    public String typeUrl_ = "";
    public AbstractC58536Px4 value_ = AbstractC58536Px4.A01;

    static {
        RVD rvd = new RVD();
        DEFAULT_INSTANCE = rvd;
        AbstractC58533Px1.A0A(rvd, RVD.class);
    }

    public final PxH A0G() {
        PxH A00 = PxH.A00(this.outputPrefixType_);
        if (A00 == null) {
            return PxH.UNRECOGNIZED;
        }
        return A00;
    }
}
