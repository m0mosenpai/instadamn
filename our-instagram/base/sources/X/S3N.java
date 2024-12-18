package X;

/* loaded from: classes10.dex */
public abstract class S3N {
    public static C58526Pwu A00(C60799RTk c60799RTk, Integer num) {
        SY8 sy8 = c60799RTk.A02;
        if (sy8 == SY8.A03) {
            return AbstractC62333S7d.A00;
        }
        if (sy8 != SY8.A02 && sy8 != SY8.A01) {
            if (sy8 == SY8.A04) {
                return AbstractC58319PtB.A0c(num);
            }
            throw AbstractC43594JPz.A0o(sy8, "Unknown AesCmacParametersParameters.Variant: ", AbstractC166987dD.A1C());
        }
        return AbstractC58319PtB.A0b(num);
    }
}
