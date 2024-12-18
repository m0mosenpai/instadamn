package X;

/* loaded from: classes10.dex */
public abstract class S3H {
    public static C58526Pwu A00(C58556PxX c58556PxX, Integer num) {
        SY3 sy3 = c58556PxX.A01;
        if (sy3 == SY3.A02) {
            return AbstractC62333S7d.A00;
        }
        if (sy3 == SY3.A01) {
            return AbstractC58319PtB.A0b(num);
        }
        if (sy3 == SY3.A03) {
            return AbstractC58319PtB.A0c(num);
        }
        throw AbstractC43594JPz.A0o(sy3, "Unknown AesSivParameters.Variant: ", AbstractC166987dD.A1C());
    }
}
