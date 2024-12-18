package X;

/* loaded from: classes10.dex */
public enum PxH implements InterfaceC65279ThC {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public final int A00;

    public static PxH A00(int value) {
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    if (value != 3) {
                        if (value != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    public final int A01() {
        if (this != UNRECOGNIZED) {
            return this.A00;
        }
        throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
    }

    PxH(int value) {
        this.A00 = value;
    }
}
