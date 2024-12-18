package X;

/* renamed from: X.CyZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29459CyZ implements InterfaceC31158Dn2 {
    public final android.net.Uri A00;
    public final CV6 A01;
    public final Integer A02;
    public final Integer A03;

    public C29459CyZ(android.net.Uri uri, CV6 cv6, Integer num, Integer num2) {
        C14360o3.A0B(uri, 1);
        this.A00 = uri;
        this.A03 = num;
        this.A02 = num2;
        this.A01 = cv6;
    }

    @Override // X.InterfaceC31000Djz
    public final String AXy() {
        return null;
    }

    @Override // X.InterfaceC31000Djz
    public final /* bridge */ /* synthetic */ Object CHd(InterfaceC30923Dia interfaceC30923Dia) {
        return new C26400Blj(this.A00, this.A01, this.A03, this.A02);
    }
}
