package X;

/* loaded from: classes10.dex */
public final class PxI extends AbstractC58533Px1 implements InterfaceC65280ThD {
    public static final PxI DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    public static volatile InterfaceC65281ThE PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public int bitField0_;
    public PxG keyData_;
    public int keyId_;
    public int outputPrefixType_;
    public int status_;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.PxI, X.Px1] */
    static {
        ?? abstractC58533Px1 = new AbstractC58533Px1();
        DEFAULT_INSTANCE = abstractC58533Px1;
        AbstractC58533Px1.A0A(abstractC58533Px1, PxI.class);
    }

    public final EnumC61237Riz A0G() {
        int i = this.status_;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return EnumC61237Riz.UNRECOGNIZED;
                    }
                    return EnumC61237Riz.DESTROYED;
                }
                return EnumC61237Riz.DISABLED;
            }
            return EnumC61237Riz.ENABLED;
        }
        return EnumC61237Riz.UNKNOWN_STATUS;
    }
}
