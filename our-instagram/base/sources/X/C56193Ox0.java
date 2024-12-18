package X;

/* renamed from: X.Ox0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56193Ox0 implements InterfaceC13380mO {
    public final /* synthetic */ C54814OKp A00;
    public final /* synthetic */ boolean A01;

    public C56193Ox0(C54814OKp c54814OKp, boolean z) {
        this.A00 = c54814OKp;
        this.A01 = z;
    }

    @Override // X.InterfaceC13380mO
    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        OKv oKv = (OKv) obj;
        C14360o3.A0B(oKv, 0);
        InterfaceC58056Poh interfaceC58056Poh = this.A00.A00;
        if (interfaceC58056Poh != null) {
            boolean z = this.A01;
            int length = oKv.A01.length();
            if (z) {
                if (length > 2) {
                    return;
                }
            } else if (length <= 2) {
                return;
            }
            if (length == 0) {
                interfaceC58056Poh.DDP();
            } else {
                interfaceC58056Poh.DVe(oKv);
            }
        }
    }
}
