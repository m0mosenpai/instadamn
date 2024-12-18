package X;

/* loaded from: classes9.dex */
public final class OyF implements C8FI {
    public final /* synthetic */ C52692NTd A00;

    @Override // X.C8FI
    public final /* synthetic */ void DDA(C88X c88x) {
    }

    @Override // X.C8FJ
    public final /* synthetic */ void DNh(InterfaceC120325cX interfaceC120325cX, int i) {
    }

    public OyF(C52692NTd c52692NTd) {
        this.A00 = c52692NTd;
    }

    @Override // X.C8FJ
    public final /* bridge */ /* synthetic */ void DDC(InterfaceC120325cX interfaceC120325cX, String str, int i, boolean z) {
        C88X c88x = (C88X) interfaceC120325cX;
        C14360o3.A0B(c88x, 0);
        boolean z2 = c88x.A0N;
        C52692NTd c52692NTd = this.A00;
        if (!z2) {
            C55210OeT A0q = MSW.A0q(c52692NTd.A0S);
            if (!c88x.equals(A0q.A0I.get(A0q.A02))) {
                if (c52692NTd.A03.A06 != null && C14360o3.A0K(c88x.A00(), c52692NTd.A03.A06)) {
                    return;
                }
            } else {
                return;
            }
        }
        C52692NTd.A01(c88x, c52692NTd, false);
    }
}
