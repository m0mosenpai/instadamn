package X;

/* renamed from: X.16E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16E {
    public static final C16F A00;
    public static final ThreadLocal A01;

    static {
        C16F c16f;
        if ("true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"))) {
            c16f = C72924Xr5.A00;
            A00 = c16f;
            A01 = new ThreadLocal();
        }
        c16f = null;
        A00 = c16f;
        A01 = new ThreadLocal();
    }
}
