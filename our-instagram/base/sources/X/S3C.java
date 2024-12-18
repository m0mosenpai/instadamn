package X;

/* loaded from: classes10.dex */
public abstract class S3C {
    public static C58526Pwu A00(RTQ rtq, Integer num) {
        C62930SXx c62930SXx = rtq.A05;
        if (c62930SXx == C62930SXx.A02) {
            return AbstractC62333S7d.A00;
        }
        if (c62930SXx == C62930SXx.A01) {
            return AbstractC58319PtB.A0b(num);
        }
        if (c62930SXx == C62930SXx.A03) {
            return AbstractC58319PtB.A0c(num);
        }
        throw AbstractC43594JPz.A0o(c62930SXx, "Unknown AesCtrHmacAeadParameters.Variant: ", AbstractC166987dD.A1C());
    }
}
