package X;

/* loaded from: classes10.dex */
public abstract class S3F {
    public static C58526Pwu A00(C58529Pwx c58529Pwx, Integer num) {
        SXz sXz = c58529Pwx.A03;
        if (sXz == SXz.A02) {
            return AbstractC62333S7d.A00;
        }
        if (sXz == SXz.A01) {
            return AbstractC58319PtB.A0b(num);
        }
        if (sXz == SXz.A03) {
            return AbstractC58319PtB.A0c(num);
        }
        throw AbstractC43594JPz.A0o(sXz, "Unknown AesGcmParameters.Variant: ", AbstractC166987dD.A1C());
    }
}
