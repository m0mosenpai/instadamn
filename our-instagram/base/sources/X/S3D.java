package X;

/* loaded from: classes10.dex */
public abstract class S3D {
    public static C58526Pwu A00(RTO rto, Integer num) {
        C62931SXy c62931SXy = rto.A03;
        if (c62931SXy == C62931SXy.A02) {
            return AbstractC62333S7d.A00;
        }
        if (c62931SXy == C62931SXy.A01) {
            return AbstractC58319PtB.A0b(num);
        }
        if (c62931SXy == C62931SXy.A03) {
            return AbstractC58319PtB.A0c(num);
        }
        throw AbstractC43594JPz.A0o(c62931SXy, "Unknown AesEaxParameters.Variant: ", AbstractC166987dD.A1C());
    }
}
