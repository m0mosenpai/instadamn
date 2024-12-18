package X;

/* renamed from: X.07R, reason: invalid class name */
/* loaded from: classes.dex */
public enum C07R {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final C07P Companion = new Object();

    public final C07S A00() {
        switch (this) {
            case ON_CREATE:
            case ON_STOP:
                return C07S.CREATED;
            case ON_START:
            case ON_PAUSE:
                return C07S.STARTED;
            case ON_RESUME:
                return C07S.RESUMED;
            case ON_DESTROY:
                return C07S.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" has no target state");
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
