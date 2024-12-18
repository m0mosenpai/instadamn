package X;

/* loaded from: classes4.dex */
public abstract class A1P {
    public static final C3SN A00(C4QF c4qf, String str) {
        float f = c4qf.A00.getFloat(AnonymousClass001.A0T("P_DELAYED_CTA", str, '_'), -1.0f);
        if (f == -1.0f) {
            return new C3SN(Float.valueOf(f), "dwell time not found in shared prefs", false);
        }
        return new C3SN(Float.valueOf(f), null, true);
    }
}
