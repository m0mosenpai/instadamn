package X;

/* loaded from: classes10.dex */
public final class RTA extends AbstractC61590RqE {
    public final T91 A00;

    public final String toString() {
        String str;
        RVD rvd = this.A00.A00;
        String str2 = rvd.typeUrl_;
        int ordinal = rvd.A0G().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str2, str);
    }

    public final boolean equals(Object o) {
        if (!(o instanceof RTA)) {
            return false;
        }
        T91 t91 = ((RTA) o).A00;
        RVD rvd = this.A00.A00;
        PxH A0G = rvd.A0G();
        RVD rvd2 = t91.A00;
        if (!A0G.equals(rvd2.A0G()) || !rvd.typeUrl_.equals(rvd2.typeUrl_)) {
            return false;
        }
        return AbstractC58320PtC.A1X(rvd.value_, rvd2.value_);
    }

    public final int hashCode() {
        T91 t91 = this.A00;
        return AbstractC37301Gc2.A02(t91.A00, t91.A01);
    }

    public RTA(T91 serialization) {
        this.A00 = serialization;
    }
}
