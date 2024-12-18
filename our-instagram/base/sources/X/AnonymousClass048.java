package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.048, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass048 implements C0LR {
    public final File A00;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A1C;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        File file = new File(this.A00, "tls_report.txt");
        if (file.exists()) {
            byte[] bArr = new byte[8];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    int read = fileInputStream.read(bArr);
                    fileInputStream.close();
                    if (read != 8) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("bytes_read", Integer.toString(read));
                        C0PC.A00().D2z(C0LX.A00(C05F.A1C), hashMap);
                    } else {
                        c024209q.A01(C0LK.A3C, (bArr[3] << 24) | bArr[0] | (bArr[1] << 8) | (bArr[2] << 16));
                        c024209q.A01(C0LK.A3D, (bArr[7] << 24) | bArr[4] | (bArr[5] << 8) | (bArr[6] << 16));
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException | IOException e) {
                C0PC.A00().DEh(C0LX.A00(C05F.A1C), e, null);
            }
        }
    }

    public AnonymousClass048(File file) {
        this.A00 = file;
    }
}
