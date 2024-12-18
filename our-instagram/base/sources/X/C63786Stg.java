package X;

/* renamed from: X.Stg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63786Stg implements InterfaceC65558Tme {
    public final byte[] A00;

    @Override // X.InterfaceC65558Tme
    public final void recycle() {
    }

    @Override // X.InterfaceC65558Tme
    public final Class BoY() {
        return byte[].class;
    }

    @Override // X.InterfaceC65558Tme
    public final /* bridge */ /* synthetic */ Object get() {
        return this.A00;
    }

    @Override // X.InterfaceC65558Tme
    public final int getSize() {
        return this.A00.length;
    }

    public C63786Stg(byte[] bArr) {
        Rs8.A00(bArr);
        this.A00 = bArr;
    }
}
