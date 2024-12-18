package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.1F2, reason: invalid class name */
/* loaded from: classes.dex */
public class C1F2 extends File implements C1F3 {
    @Override // X.C1F3
    public void AIh() {
    }

    @Override // X.C1F3
    public OutputStream CHy() {
        return new FileOutputStream((File) this, false);
    }

    @Override // X.C1F3
    public final void FEV(InputStream inputStream) {
        OutputStream CHy = CHy();
        try {
            C1FH.A00(inputStream, CHy);
            CHy.close();
        } catch (Throwable th) {
            try {
                CHy.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }
}
