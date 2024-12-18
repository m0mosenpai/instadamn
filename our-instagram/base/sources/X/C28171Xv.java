package X;

/* renamed from: X.1Xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28171Xv implements InterfaceC28011Xf {
    public final boolean A00;
    public final boolean A01;

    @Override // X.InterfaceC28011Xf
    public final /* synthetic */ boolean AC7(C108104tt c108104tt) {
        return true;
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        C38321qM c38321qM;
        InterfaceC38381qS interfaceC38381qS;
        C38321qM A02;
        C3XG c3xg = (C3XG) obj;
        if (c3xg != null) {
            c38321qM = C3XH.A02(c3xg.A05);
        } else {
            c38321qM = null;
        }
        if (c38321qM != null && ((A02 = C3XH.A02((interfaceC38381qS = c3xg.A05))) == null || !A02.CdW())) {
            C1XV c1xv = c3xg.A06;
            if (c1xv != C1XV.A0Y) {
                if (!this.A01 || c1xv != C1XV.A0H) {
                    if (this.A00 && C3YV.A09(C3XH.A02(interfaceC38381qS))) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public C28171Xv(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
