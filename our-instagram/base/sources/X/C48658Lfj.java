package X;

/* renamed from: X.Lfj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48658Lfj implements MRE {
    public final int A00;
    public final C45322K3z A01;
    public final K41 A02;

    @Override // X.MRE
    public final String BaC() {
        C45322K3z c45322K3z = this.A01;
        String string = c45322K3z.mResultSet.getString(this.A00, 1);
        C14360o3.A07(string);
        return string;
    }

    @Override // X.MRE
    public final byte[] Bbl() {
        C45322K3z c45322K3z = this.A01;
        byte[] blob = c45322K3z.mResultSet.getBlob(this.A00, 4);
        C14360o3.A07(blob);
        return blob;
    }

    @Override // X.MRE
    public final byte[] C46(int i) {
        byte[] blob = this.A02.mResultSet.getBlob(i, 5);
        C14360o3.A07(blob);
        return blob;
    }

    @Override // X.MRE
    public final long C47(int i) {
        return this.A02.mResultSet.getLong(i, 4);
    }

    @Override // X.MRE
    public final int C48() {
        return AbstractC43592JPx.A02(this.A02);
    }

    @Override // X.MRE
    public final long C8g() {
        C45322K3z c45322K3z = this.A01;
        return c45322K3z.mResultSet.getLong(this.A00, 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.69s, X.K41] */
    public C48658Lfj(C45322K3z c45322K3z, int i) {
        this.A01 = c45322K3z;
        this.A00 = i;
        this.A02 = new AbstractC1351869s(c45322K3z.mResultSet.getChildResultSet(i, 5));
    }
}
