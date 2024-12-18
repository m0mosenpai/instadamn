package X;

/* renamed from: X.SVv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62890SVv {
    public final InterfaceC65621ToC A00;
    public static final C62890SVv A01 = new C62890SVv(new Object());
    public static final C62890SVv A05 = new C62890SVv(new Object());
    public static final C62890SVv A07 = new C62890SVv(new Object());
    public static final C62890SVv A06 = new C62890SVv(new Object());
    public static final C62890SVv A02 = new C62890SVv(new Object());
    public static final C62890SVv A04 = new C62890SVv(new Object());
    public static final C62890SVv A03 = new C62890SVv(new Object());

    public C62890SVv(InterfaceC65433Tk4 instanceBuilder) {
        InterfaceC65621ToC t9i;
        if (C62864SUl.A00.get()) {
            t9i = new T9J(instanceBuilder);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            t9i = new T9H(instanceBuilder);
        } else {
            t9i = new T9I(instanceBuilder);
        }
        this.A00 = t9i;
    }
}
