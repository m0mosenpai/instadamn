package X;

import java.io.File;

/* renamed from: X.WYx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70490WYx implements X9U {
    public final File A00;

    public C70490WYx(File file) {
        this.A00 = file;
    }

    @Override // X.X9U
    public final File createTempFile(String str, String str2) {
        return this.A00;
    }
}
