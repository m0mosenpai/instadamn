package X;

/* loaded from: classes10.dex */
public abstract class S3Q {
    public static C60800RTl A00(SYC syc, SY9 sy9, Integer num, Integer num2) {
        if (num != null) {
            if (num2 != null) {
                if (syc != null) {
                    if (sy9 != null) {
                        int intValue = num.intValue();
                        if (intValue >= 16) {
                            int intValue2 = num2.intValue();
                            if (intValue2 >= 10) {
                                if (syc == SYC.A01) {
                                    if (intValue2 > 20) {
                                        throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", AbstractC25228BEl.A1Y(intValue2));
                                    }
                                } else if (syc == SYC.A02) {
                                    if (intValue2 > 28) {
                                        throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", AbstractC25228BEl.A1Y(intValue2));
                                    }
                                } else if (syc == SYC.A03) {
                                    if (intValue2 > 32) {
                                        throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", AbstractC25228BEl.A1Y(intValue2));
                                    }
                                } else if (syc == SYC.A04) {
                                    if (intValue2 > 48) {
                                        throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", AbstractC25228BEl.A1Y(intValue2));
                                    }
                                } else if (syc == SYC.A05) {
                                    if (intValue2 > 64) {
                                        throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", AbstractC25228BEl.A1Y(intValue2));
                                    }
                                } else {
                                    throw AbstractC58318PtA.A0x("unknown hash type; must be SHA256, SHA384 or SHA512");
                                }
                                return new C60800RTl(syc, sy9, intValue, intValue2);
                            }
                            throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; must be at least 10 bytes", AbstractC25228BEl.A1Y(intValue2));
                        }
                        throw AbstractC58319PtB.A10("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{num});
                    }
                    throw AbstractC58318PtA.A0x("variant is not set");
                }
                throw AbstractC58318PtA.A0x("hash type is not set");
            }
            throw AbstractC58318PtA.A0x("tag size is not set");
        }
        throw AbstractC58318PtA.A0x("key size is not set");
    }
}
