package X;

/* renamed from: X.1x4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42141x4 {
    public static final InterfaceC42161x6 A00 = new Object();

    public static void A00(int i, String str) {
        if (i > 0) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0b(str, " > 0 required but it was ", i));
        }
    }

    public static void A01(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }
}
