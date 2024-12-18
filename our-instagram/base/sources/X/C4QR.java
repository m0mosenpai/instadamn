package X;

/* renamed from: X.4QR, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4QR {
    public static final InterfaceC38381qS A00(Object obj, int i) {
        InterfaceC38381qS interfaceC38381qS;
        if (obj instanceof C38321qM) {
            C38321qM c38321qM = (C38321qM) obj;
            if (c38321qM.A5M()) {
                interfaceC38381qS = c38321qM.A1e(i);
            } else {
                boolean A5Q = c38321qM.A5Q();
                interfaceC38381qS = c38321qM;
                if (A5Q) {
                    interfaceC38381qS = c38321qM.A1d();
                }
            }
        } else if (obj instanceof C76403bk) {
            interfaceC38381qS = (C76403bk) obj;
        } else {
            interfaceC38381qS = null;
        }
        return interfaceC38381qS;
    }
}
