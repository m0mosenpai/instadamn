package X;

/* renamed from: X.OvR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56107OvR implements InterfaceC66482zP {
    public final int A00;
    public final InterfaceC190658cN A01;
    public final boolean A02;
    public final boolean A03;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56107OvR c56107OvR = (C56107OvR) obj;
        C14360o3.A0B(c56107OvR, 0);
        if (this.A00 == c56107OvR.A00 && AbstractC50102Ry.A00(Boolean.valueOf(this.A03), Boolean.valueOf(c56107OvR.A03))) {
            return true;
        }
        return false;
    }

    public C56107OvR(InterfaceC190658cN interfaceC190658cN, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = interfaceC190658cN;
        this.A02 = z;
        this.A03 = z2;
    }
}
