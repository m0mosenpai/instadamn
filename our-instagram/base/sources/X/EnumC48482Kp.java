package X;

/* renamed from: X.2Kp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC48482Kp {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean A00() {
        if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
            return false;
        }
        return true;
    }
}
