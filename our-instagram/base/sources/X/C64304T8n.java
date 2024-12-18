package X;

/* renamed from: X.T8n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64304T8n implements InterfaceC65429Tk0 {
    public final S3M A00;
    public final S3M A01;
    public final C62916SWx A02;

    public C64304T8n(C62916SWx primitives) {
        this.A02 = primitives;
        if (MSW.A1b(primitives.A01.A00)) {
            SU3.A00(primitives);
        }
        S3M s3m = SU3.A00;
        this.A00 = s3m;
        this.A01 = s3m;
    }

    @Override // X.InterfaceC65429Tk0
    public final byte[] AIv(byte[] bArr) {
        throw C00O.createAndThrow();
    }
}
