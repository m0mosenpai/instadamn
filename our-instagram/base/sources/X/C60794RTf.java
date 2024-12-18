package X;

import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;

/* renamed from: X.RTf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60794RTf extends RT3 {
    public final C60789RTa A00;
    public final C58526Pwu A01;
    public final C58526Pwu A02;
    public final Integer A03;

    public static C60794RTf A00(C60789RTa parameters, C58526Pwu publicKeyBytes, Integer idRequirement) {
        ECParameterSpec eCParameterSpec;
        C58526Pwu A0c;
        SY6 sy6 = parameters.A03;
        SY6 sy62 = SY6.A02;
        if (!sy6.equals(sy62) && idRequirement == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("'idRequirement' must be non-null for ");
            A1C.append(sy6);
            throw AbstractC58318PtA.A0x(AbstractC166997dE.A0x(" variant.", A1C));
        }
        if (sy6.equals(sy62) && idRequirement != null) {
            throw AbstractC58318PtA.A0x("'idRequirement' must be null for NO_PREFIX variant.");
        }
        RTZ rtz = parameters.A02;
        int length = publicKeyBytes.A00.length;
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append("Encoded public key byte length for ");
        A1C2.append(rtz);
        String A12 = AbstractC58320PtC.A12(" must be %d, not ", A1C2, length);
        RTZ rtz2 = RTZ.A00;
        if (rtz == rtz2) {
            if (length != 65) {
                throw AbstractC58319PtB.A0z(A12, AbstractC25228BEl.A1Y(65));
            }
        } else if (rtz == RTZ.A01) {
            if (length != 97) {
                throw AbstractC58319PtB.A0z(A12, AbstractC25228BEl.A1Y(97));
            }
        } else if (rtz == RTZ.A02) {
            if (length != 133) {
                throw AbstractC58319PtB.A0z(A12, AbstractC25228BEl.A1Y(133));
            }
        } else if (rtz == RTZ.A03) {
            if (length != 32) {
                throw AbstractC58319PtB.A0z(A12, AbstractC25228BEl.A1Y(32));
            }
        } else {
            throw AbstractC58320PtC.A19(rtz, "Unable to validate public key length for ", AbstractC166987dD.A1C());
        }
        if (rtz == rtz2 || rtz == RTZ.A01 || rtz == RTZ.A02) {
            if (rtz == rtz2) {
                eCParameterSpec = AbstractC63391SjD.A00;
            } else if (rtz == RTZ.A01) {
                eCParameterSpec = AbstractC63391SjD.A01;
            } else if (rtz == RTZ.A02) {
                eCParameterSpec = AbstractC63391SjD.A02;
            } else {
                throw AbstractC37303Gc4.A0M(rtz, "Unable to determine NIST curve type for ", AbstractC166987dD.A1C());
            }
            EllipticCurve curve = eCParameterSpec.getCurve();
            AbstractC63391SjD.A07(AbstractC63316ShO.A01(curve, publicKeyBytes.A01()), curve);
        }
        if (sy6 == sy62) {
            A0c = AbstractC62333S7d.A00;
        } else if (idRequirement != null) {
            if (sy6 == SY6.A01) {
                A0c = AbstractC58319PtB.A0b(idRequirement);
            } else if (sy6 == SY6.A03) {
                A0c = AbstractC58319PtB.A0c(idRequirement);
            } else {
                throw AbstractC43594JPz.A0o(sy6, "Unknown HpkeParameters.Variant: ", AbstractC166987dD.A1C());
            }
        } else {
            throw AbstractC43594JPz.A0o(sy6, "idRequirement must be non-null for HpkeParameters.Variant ", AbstractC166987dD.A1C());
        }
        return new C60794RTf(parameters, publicKeyBytes, A0c, idRequirement);
    }

    public C60794RTf(C60789RTa parameters, C58526Pwu publicKeyBytes, C58526Pwu outputPrefix, Integer idRequirement) {
        this.A00 = parameters;
        this.A02 = publicKeyBytes;
        this.A01 = outputPrefix;
        this.A03 = idRequirement;
    }
}
