package X;

/* loaded from: classes10.dex */
public abstract class S3G {
    public static C58526Pwu A00(RTM rtm, Integer num) {
        SY0 sy0 = rtm.A01;
        if (sy0 == SY0.A02) {
            return AbstractC62333S7d.A00;
        }
        if (sy0 == SY0.A01) {
            return AbstractC58319PtB.A0b(num);
        }
        if (sy0 == SY0.A03) {
            return AbstractC58319PtB.A0c(num);
        }
        throw AbstractC43594JPz.A0o(sy0, "Unknown AesGcmSivParameters.Variant: ", AbstractC166987dD.A1C());
    }
}
