package X;

/* renamed from: X.2VV, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2VV {
    public static String A00(int i, boolean z, boolean z2) {
        return z ? "missing_config" : z2 ? "always_on" : i != 1 ? i != 2 ? i != 3 ? "unknown" : "per_user" : "per_session" : "random_sampling";
    }
}
