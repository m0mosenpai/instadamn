package X;

/* renamed from: X.Np2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53713Np2 {
    public static String A00(String str, boolean z) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (str.startsWith("/")) {
            A1C.append("file://");
        }
        A1C.append(str);
        if (z && !str.endsWith("/")) {
            A1C.append("/");
        }
        return A1C.toString();
    }
}
