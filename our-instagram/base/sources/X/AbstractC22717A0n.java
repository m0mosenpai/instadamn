package X;

/* renamed from: X.A0n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22717A0n {
    public static final Boolean A00(String str) {
        boolean z = true;
        if (!"true".equalsIgnoreCase(str)) {
            if ("false".equalsIgnoreCase(str)) {
                z = false;
            } else {
                return null;
            }
        }
        return Boolean.valueOf(z);
    }
}
