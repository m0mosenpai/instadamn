package X;

/* loaded from: classes10.dex */
public abstract class SSR {
    public static RTQ A00(SYA sya, C62930SXx c62930SXx) {
        Integer num = C05F.A08;
        return A01(sya, c62930SXx, num, C05F.A0Q, num, num);
    }

    public static RTQ A01(SYA sya, C62930SXx c62930SXx, Integer num, Integer num2, Integer num3, Integer num4) {
        if (num != null) {
            if (num2 != null) {
                if (num3 != null) {
                    if (num4 != null) {
                        int intValue = num4.intValue();
                        if (sya == SYA.A01) {
                            if (intValue > 20) {
                                throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", AbstractC25228BEl.A1Y(intValue));
                            }
                        } else if (sya == SYA.A02) {
                            if (intValue > 28) {
                                throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", AbstractC25228BEl.A1Y(intValue));
                            }
                        } else if (sya == SYA.A03) {
                            if (intValue > 32) {
                                throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", AbstractC25228BEl.A1Y(intValue));
                            }
                        } else if (sya == SYA.A04) {
                            if (intValue > 48) {
                                throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", AbstractC25228BEl.A1Y(intValue));
                            }
                        } else if (sya == SYA.A05) {
                            if (intValue > 64) {
                                throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", AbstractC25228BEl.A1Y(intValue));
                            }
                        } else {
                            throw AbstractC58318PtA.A0x("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                        }
                        return new RTQ(sya, c62930SXx, num.intValue(), num2.intValue(), num3.intValue(), intValue);
                    }
                    throw AbstractC58318PtA.A0x("tag size is not set");
                }
                throw AbstractC58318PtA.A0x("iv size is not set");
            }
            throw AbstractC58318PtA.A0x("HMAC key size is not set");
        }
        throw AbstractC58318PtA.A0x("AES key size is not set");
    }
}
