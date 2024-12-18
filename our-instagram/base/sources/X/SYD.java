package X;

/* loaded from: classes10.dex */
public final class SYD {
    public final String A00;
    public static final SYD A03 = new SYD("ASSUME_AES_GCM");
    public static final SYD A06 = new SYD("ASSUME_XCHACHA20POLY1305");
    public static final SYD A05 = new SYD("ASSUME_CHACHA20POLY1305");
    public static final SYD A01 = new SYD("ASSUME_AES_CTR_HMAC");
    public static final SYD A02 = new SYD("ASSUME_AES_EAX");
    public static final SYD A04 = new SYD("ASSUME_AES_GCM_SIV");

    public final String toString() {
        return this.A00;
    }

    public SYD(String name) {
        this.A00 = name;
    }
}
