package X;

import android.database.sqlite.SQLiteProgram;

/* renamed from: X.1oq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C37531oq implements InterfaceC37541or {
    public final SQLiteProgram A00;

    public C37531oq(SQLiteProgram sQLiteProgram) {
        C14360o3.A0B(sQLiteProgram, 1);
        this.A00 = sQLiteProgram;
    }

    @Override // X.InterfaceC37541or
    public final void ADc(int i, byte[] bArr) {
        C14360o3.A0B(bArr, 1);
        this.A00.bindBlob(i, bArr);
    }

    @Override // X.InterfaceC37541or
    public final void ADp(int i, String str) {
        C14360o3.A0B(str, 1);
        this.A00.bindString(i, str);
    }

    @Override // X.InterfaceC37541or
    public final void ADg(int i, double d) {
        this.A00.bindDouble(i, d);
    }

    @Override // X.InterfaceC37541or
    public final void ADi(int i, long j) {
        this.A00.bindLong(i, j);
    }

    @Override // X.InterfaceC37541or
    public final void ADj(int i) {
        this.A00.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }
}
