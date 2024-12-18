package X;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class RTF extends RTJ {
    public final RTN A00;
    public final C58526Pwu A01;
    public final Integer A02;

    public static RTF A00(RTN parameters, Integer idRequirement) {
        byte[] bArr;
        SXt sXt = parameters.A00;
        if (sXt == SXt.A02) {
            if (idRequirement != null) {
                ByteBuffer allocate = ByteBuffer.allocate(5);
                allocate.put((byte) 1);
                bArr = AbstractC58320PtC.A1Y(idRequirement, allocate);
            } else {
                throw AbstractC58318PtA.A0x("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (sXt == SXt.A01) {
            if (idRequirement == null) {
                bArr = new byte[0];
            } else {
                throw AbstractC58318PtA.A0x("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else {
            throw AbstractC58320PtC.A19(sXt, "Unknown Variant: ", AbstractC166987dD.A1C());
        }
        return new RTF(parameters, C58526Pwu.A00(bArr), idRequirement);
    }

    public RTF(RTN parameters, C58526Pwu outputPrefix, Integer idRequirement) {
        this.A00 = parameters;
        this.A01 = outputPrefix;
        this.A02 = idRequirement;
    }
}
