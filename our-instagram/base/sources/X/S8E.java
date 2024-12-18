package X;

/* loaded from: classes10.dex */
public abstract class S8E {
    public static final StackTraceElement A00;

    static {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[0];
        A00 = new StackTraceElement(AnonymousClass001.A0T("_COROUTINE", "_BOUNDARY", '.'), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            Class.forName("X.1Dr").getCanonicalName();
        } catch (Throwable th) {
            new C09540e5(th);
        }
        try {
            Class.forName("X.S8E").getCanonicalName();
        } catch (Throwable th2) {
            new C09540e5(th2);
        }
    }
}
