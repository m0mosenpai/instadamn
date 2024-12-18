package X;

import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* renamed from: X.RTg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60795RTg extends RT3 {
    public final C60790RTb A00;
    public final C58526Pwu A01;
    public final C58526Pwu A02;
    public final Integer A03;
    public final ECPoint A04;

    public static C60795RTg A00(C60790RTb parameters, C58526Pwu publicPointBytes, Integer idRequirement) {
        if (parameters.A01.equals(SY7.A04)) {
            SY5 sy5 = parameters.A04;
            A03(sy5, idRequirement);
            if (publicPointBytes.A00.length == 32) {
                return new C60795RTg(parameters, publicPointBytes, A02(sy5, idRequirement), idRequirement, null);
            }
            throw AbstractC58318PtA.A0x("Encoded public point byte length for X25519 curve must be 32");
        }
        throw AbstractC58318PtA.A0x("createForCurveX25519 may only be called with parameters for curve X25519");
    }

    public static C60795RTg A01(C60790RTb parameters, Integer publicPoint, ECPoint idRequirement) {
        ECParameterSpec eCParameterSpec;
        SY7 sy7 = parameters.A01;
        if (!sy7.equals(SY7.A04)) {
            SY5 sy5 = parameters.A04;
            A03(sy5, publicPoint);
            if (sy7 == SY7.A01) {
                eCParameterSpec = AbstractC63391SjD.A00;
            } else if (sy7 == SY7.A02) {
                eCParameterSpec = AbstractC63391SjD.A01;
            } else if (sy7 == SY7.A03) {
                eCParameterSpec = AbstractC63391SjD.A02;
            } else {
                throw AbstractC37303Gc4.A0M(sy7, "Unable to determine NIST curve type for ", AbstractC166987dD.A1C());
            }
            AbstractC63391SjD.A07(idRequirement, eCParameterSpec.getCurve());
            return new C60795RTg(parameters, null, A02(sy5, publicPoint), publicPoint, idRequirement);
        }
        throw AbstractC58318PtA.A0x("createForNistCurve may only be called with parameters for NIST curve");
    }

    public static C58526Pwu A02(SY5 variant, Integer idRequirement) {
        if (variant == SY5.A02) {
            return AbstractC62333S7d.A00;
        }
        if (idRequirement != null) {
            if (variant == SY5.A01) {
                return AbstractC58319PtB.A0b(idRequirement);
            }
            if (variant == SY5.A03) {
                return AbstractC58319PtB.A0c(idRequirement);
            }
            throw AbstractC43594JPz.A0o(variant, "Unknown EciesParameters.Variant: ", AbstractC166987dD.A1C());
        }
        throw AbstractC43594JPz.A0o(variant, "idRequirement must be non-null for EciesParameters.Variant: ", AbstractC166987dD.A1C());
    }

    public static void A03(SY5 variant, Integer idRequirement) {
        SY5 sy5 = SY5.A02;
        if (!variant.equals(sy5) && idRequirement == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("'idRequirement' must be non-null for ");
            A1C.append(variant);
            throw AbstractC58318PtA.A0x(AbstractC166997dE.A0x(" variant.", A1C));
        }
        if (variant.equals(sy5) && idRequirement != null) {
            throw AbstractC58318PtA.A0x("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    public C60795RTg(C60790RTb parameters, C58526Pwu nistPublicPoint, C58526Pwu x25519PublicPointBytes, Integer outputPrefix, ECPoint idRequirement) {
        this.A00 = parameters;
        this.A04 = idRequirement;
        this.A02 = nistPublicPoint;
        this.A01 = x25519PublicPointBytes;
        this.A03 = outputPrefix;
    }
}
