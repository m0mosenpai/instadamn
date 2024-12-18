package X;

/* loaded from: classes10.dex */
public final class RTE extends RTJ {
    public final RTQ A00;
    public final C58526Pwu A01;
    public final C58552PxP A02;
    public final C58552PxP A03;
    public final Integer A04;

    public RTE(RTQ parameters, C58526Pwu aesKeyBytes, C58552PxP hmacKeyBytes, C58552PxP outputPrefix, Integer idRequirement) {
        this.A00 = parameters;
        this.A02 = hmacKeyBytes;
        this.A03 = outputPrefix;
        this.A01 = aesKeyBytes;
        this.A04 = idRequirement;
    }
}
