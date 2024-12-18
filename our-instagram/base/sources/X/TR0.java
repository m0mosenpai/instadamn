package X;

/* loaded from: classes10.dex */
public final class TR0 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C64082Syy A01;
    public final /* synthetic */ C62830STc A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public TR0(C64082Syy c64082Syy, C62830STc c62830STc, String str, byte[] bArr, long j) {
        this.A01 = c64082Syy;
        this.A03 = str;
        this.A04 = bArr;
        this.A00 = j;
        this.A02 = c62830STc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC43661zx interfaceC43661zx = this.A01.A06;
        if (interfaceC43661zx != null) {
            interfaceC43661zx.onMessageArrived(new C5EZ(this.A03, this.A04));
        }
    }
}
