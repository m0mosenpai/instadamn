package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.1KA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KA {
    public static final C1KA A01;
    public static final C1KA A02 = new C1KA("APP_START", 0, String.valueOf(15335435));
    public static final C1KA A03 = new C1KA("SCROLL", 1, String.valueOf(23592980));
    public String A00;

    static {
        new C1KA("FEED_NETWORK_REQUEST", 2, "IN_FLIGHT_FEED_NETWORK_REQUEST");
        A01 = new C1KA("ALL", 3, "all");
    }

    public C1KA(String str, int i, String str2) {
        this.A00 = str2;
    }
}
