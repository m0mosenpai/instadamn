package X;

/* loaded from: classes5.dex */
public abstract class CK7 {
    public static final String A00(InterfaceC128105qe interfaceC128105qe) {
        String Bqe = interfaceC128105qe.Bqe();
        if (Bqe == null) {
            Bqe = interfaceC128105qe.Bqd();
        }
        String valueOf = String.valueOf(interfaceC128105qe.BAH());
        C14360o3.A0B(valueOf, 0);
        int length = valueOf.length();
        int i = 2;
        if (2 > length) {
            i = length;
        }
        String substring = valueOf.substring(length - i);
        C14360o3.A07(substring);
        return AnonymousClass001.A0g(Bqe, " '", substring);
    }
}
