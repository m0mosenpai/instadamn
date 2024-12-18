package X;

/* renamed from: X.0nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14120nc {
    public static C14130nd A00;
    public static volatile InterfaceC14020nS A01;

    public static InterfaceC14020nS A00() {
        if (A01 == null) {
            synchronized (C14120nc.class) {
                if (A01 == null) {
                    throw new AssertionError("Do not call IgExecutor before it is configured");
                }
                C14130nd c14130nd = new C14130nd();
                A00 = c14130nd;
                A01 = new C18370vO(c14130nd);
            }
        }
        return A01;
    }
}
