package X;

import java.io.File;
import java.io.InputStream;

/* renamed from: X.1Mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25611Mr implements C1EY {
    public final File A00;

    @Override // X.C1EY
    public final void onFinish() {
    }

    @Override // X.C1EY
    public final InputStream FEF(C23781El c23781El, InputStream inputStream) {
        File file = this.A00;
        if (file != null) {
            return new C53095Ne8(file, inputStream);
        }
        return inputStream;
    }

    public C25611Mr(File file) {
        this.A00 = file;
    }
}
