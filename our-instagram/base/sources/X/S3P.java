package X;

/* loaded from: classes10.dex */
public abstract class S3P {
    public static C58526Pwu A00(C60800RTl c60800RTl, Integer num) {
        SY9 sy9 = c60800RTl.A03;
        if (sy9 == SY9.A03) {
            return AbstractC62333S7d.A00;
        }
        if (sy9 != SY9.A02 && sy9 != SY9.A01) {
            if (sy9 == SY9.A04) {
                return AbstractC58319PtB.A0c(num);
            }
            throw AbstractC43594JPz.A0o(sy9, "Unknown HmacParameters.Variant: ", AbstractC166987dD.A1C());
        }
        return AbstractC58319PtB.A0b(num);
    }
}
