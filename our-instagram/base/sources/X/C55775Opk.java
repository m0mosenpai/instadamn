package X;

import java.io.File;

/* renamed from: X.Opk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55775Opk implements X9U {
    public final File A00;

    @Override // X.X9U
    public final File createTempFile(String str, String str2) {
        return File.createTempFile(str, str2, this.A00);
    }

    public C55775Opk(File file) {
        this.A00 = file;
    }

    public C55775Opk() {
        this.A00 = null;
    }
}
