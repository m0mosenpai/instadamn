package X;

/* renamed from: X.OvO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56104OvO implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final InterfaceC16820sZ A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A01(' ', this.A01, this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56104OvO c56104OvO = (C56104OvO) obj;
        if (c56104OvO != null && this.A01 == c56104OvO.A01 && this.A00 == c56104OvO.A00) {
            return true;
        }
        return false;
    }

    public C56104OvO(InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = interfaceC16820sZ;
    }
}
