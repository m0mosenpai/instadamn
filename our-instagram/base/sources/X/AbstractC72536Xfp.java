package X;

/* renamed from: X.Xfp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72536Xfp {
    public static boolean A00(InterfaceC185788Ly interfaceC185788Ly) {
        if (!(interfaceC185788Ly instanceof InterfaceC197918p2)) {
            return false;
        }
        int BqV = ((InterfaceC197918p2) interfaceC185788Ly).BqV();
        if ((BqV & 4) != 4 && (BqV & 16) != 16) {
            return false;
        }
        return true;
    }
}
