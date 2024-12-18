package X;

/* renamed from: X.18W, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C18W {
    public static final void A00(long j) {
        int i;
        try {
            i = AbstractC20120yj.A00(j);
        } catch (C0UI e) {
            C0K8.A0M("ExperimentParameterUtils", "Failed to get config key with specifier:%d", e, Long.valueOf(j));
            i = -1;
        }
        C0w9.A03("QuickExperiment", AnonymousClass001.A0J("QE not initialized before ", ':', i, C0UM.A00(j)));
    }
}
