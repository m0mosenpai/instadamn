package X;

/* renamed from: X.IlG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42106IlG implements InterfaceC08100bW {
    public final int A00;

    public C42106IlG(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC08100bW
    public final void EHA(String str, String str2, Throwable th) {
        int i;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                boolean A1a = AbstractC167017dG.A1a(str, str2);
                i = A1a;
                if (th == null) {
                    C0w9.A04(str, str2, A1a ? 1 : 0);
                    return;
                }
                C0w9.A05(str, str2, i, th);
                return;
            case 2:
                i = AbstractC167017dG.A1a(str, str2);
                if (th == null) {
                    return;
                }
                C0w9.A05(str, str2, i, th);
                return;
            case 3:
                th.getClass();
                i = 1;
                C0w9.A05(str, str2, i, th);
                return;
            default:
                boolean A1a2 = AbstractC167017dG.A1a(str, str2);
                C14360o3.A0A(th);
                i = A1a2;
                C0w9.A05(str, str2, i, th);
                return;
        }
    }

    @Override // X.InterfaceC08100bW
    public final void EH9(String str) {
    }
}
