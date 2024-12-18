package X;

/* renamed from: X.Pyk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58616Pyk implements InterfaceC23811Eo {
    public final byte[] A00;

    @Override // X.InterfaceC23811Eo
    public final boolean isStreaming() {
        return true;
    }

    @Override // X.InterfaceC23811Eo
    public final void AAc(C58613Pyh c58613Pyh, String str) {
        c58613Pyh.A00(new C58615Pyj(str, this.A00), str);
    }

    public C58616Pyk(byte[] bArr) {
        this.A00 = bArr;
    }
}
