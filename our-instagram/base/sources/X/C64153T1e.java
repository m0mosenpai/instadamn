package X;

/* renamed from: X.T1e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64153T1e implements InterfaceC08100bW {
    public C42X A00;

    @Override // X.InterfaceC08100bW
    public final void EH9(String str) {
        this.A00 = new C42X(str, C05F.A04);
    }

    @Override // X.InterfaceC08100bW
    public final void EHA(String str, String str2, Throwable th) {
        C42X c42x;
        Integer num = C05F.A04;
        if (th != null) {
            c42x = new C42X(num, str2, th);
        } else {
            c42x = new C42X(str2, num);
        }
        this.A00 = c42x;
    }
}
