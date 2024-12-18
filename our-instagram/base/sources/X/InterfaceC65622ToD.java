package X;

/* renamed from: X.ToD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC65622ToD {
    void reject(String str, String str2);

    void reject(Throwable th);

    void resolve(Object obj);

    static void A00(InterfaceC65622ToD interfaceC65622ToD, String str, String str2, String str3, Throwable th) {
        interfaceC65622ToD.reject(new RuntimeException(AnonymousClass001.A0u(str, str2, str3, th.getMessage())));
    }

    static void A01(String str, String str2, InterfaceC65622ToD interfaceC65622ToD) {
        interfaceC65622ToD.reject(new RuntimeException(AnonymousClass001.A0R(str, str2)));
    }
}
