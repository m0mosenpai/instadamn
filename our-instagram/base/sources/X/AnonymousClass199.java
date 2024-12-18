package X;

/* renamed from: X.199, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass199 {
    public static final C20730zt A02 = new C20730zt("COMPLETING_ALREADY");
    public static final C20730zt A04 = new C20730zt("COMPLETING_WAITING_CHILDREN");
    public static final C20730zt A03 = new C20730zt("COMPLETING_RETRY");
    public static final C20730zt A06 = new C20730zt("TOO_LATE_TO_CANCEL");
    public static final C20730zt A05 = new C20730zt("SEALED");
    public static final C19A A01 = new C19A(false);
    public static final C19A A00 = new C19A(true);

    public static final Object A00(Object obj) {
        C3IF c3if;
        C19B c19b;
        if ((obj instanceof C3IF) && (c3if = (C3IF) obj) != null && (c19b = c3if.A00) != null) {
            return c19b;
        }
        return obj;
    }
}
