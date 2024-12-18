package X;

/* loaded from: classes10.dex */
public final class RTG extends RTJ {
    public final RTP A00;
    public final C58526Pwu A01;
    public final Integer A02;

    public static RTG A00(RTP parameters, Integer idRequirement) {
        C58526Pwu A0c;
        SXu sXu = parameters.A01;
        if (sXu == SXu.A01) {
            if (idRequirement == null) {
                A0c = AbstractC62333S7d.A00;
            } else {
                throw AbstractC58318PtA.A0x("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (sXu == SXu.A02) {
            if (idRequirement != null) {
                A0c = AbstractC58319PtB.A0c(idRequirement);
            } else {
                throw AbstractC58318PtA.A0x("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else {
            throw AbstractC58320PtC.A19(sXu, "Unknown Variant: ", AbstractC166987dD.A1C());
        }
        return new RTG(parameters, A0c, idRequirement);
    }

    public RTG(RTP parameters, C58526Pwu outputPrefix, Integer idRequirement) {
        this.A00 = parameters;
        this.A01 = outputPrefix;
        this.A02 = idRequirement;
    }
}
