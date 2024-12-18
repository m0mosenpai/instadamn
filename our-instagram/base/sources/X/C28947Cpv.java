package X;

/* renamed from: X.Cpv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28947Cpv implements InterfaceC73603YNf {
    public final int A00;
    public final Object A01;

    public C28947Cpv(C51762Yz c51762Yz, int i) {
        this.A00 = i;
        this.A01 = c51762Yz;
    }

    @Override // X.InterfaceC73603YNf
    public final void DH5(boolean z) {
        EnumC27381C6k enumC27381C6k;
        int i = this.A00;
        C51762Yz c51762Yz = (C51762Yz) this.A01;
        if (i != 0) {
            enumC27381C6k = EnumC27381C6k.A02;
        } else {
            enumC27381C6k = EnumC27381C6k.A04;
        }
        c51762Yz.A01(enumC27381C6k);
    }
}
