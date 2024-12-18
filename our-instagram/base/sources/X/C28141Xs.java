package X;

/* renamed from: X.1Xs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28141Xs implements InterfaceC28011Xf {
    public final C28091Xn A00;

    @Override // X.InterfaceC28011Xf
    public final boolean AC7(C108104tt c108104tt) {
        C14360o3.A0B(c108104tt, 0);
        return !this.A00.A03(c108104tt.A04);
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        C38321qM c38321qM;
        C28091Xn c28091Xn;
        C38321qM A02;
        String BPW;
        C3XG c3xg = (C3XG) obj;
        String str = null;
        if (c3xg != null) {
            c38321qM = C3XH.A02(c3xg.A05);
        } else {
            c38321qM = null;
        }
        if (c38321qM != null) {
            InterfaceC38381qS interfaceC38381qS = c3xg.A05;
            C38321qM A022 = C3XH.A02(interfaceC38381qS);
            if (A022 != null && A022.A5M() && (A02 = C3XH.A02(interfaceC38381qS)) != null && (BPW = A02.A0C.BPW()) != null && BPW.length() != 0) {
                C38321qM A023 = C3XH.A02(interfaceC38381qS);
                if (A023 != null && !A023.A66()) {
                    c28091Xn = this.A00;
                    C38321qM A024 = C3XH.A02(interfaceC38381qS);
                    if (A024 != null) {
                        str = A024.A0C.BPW();
                    }
                } else {
                    return false;
                }
            } else {
                C38321qM A025 = C3XH.A02(interfaceC38381qS);
                if (A025 != null && !A025.A66()) {
                    c28091Xn = this.A00;
                    C38321qM A026 = C3XH.A02(interfaceC38381qS);
                    if (A026 != null) {
                        str = A026.getId();
                    }
                } else {
                    return false;
                }
            }
            if (c28091Xn.A03(str)) {
                return false;
            }
        }
        return true;
    }

    public C28141Xs(C28091Xn c28091Xn) {
        this.A00 = c28091Xn;
    }
}
