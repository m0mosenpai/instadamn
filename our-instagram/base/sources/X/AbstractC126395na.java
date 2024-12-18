package X;

import com.facebook.msys.mci.Execution;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: X.5na, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126395na {
    public static final void A00(C69224Vjs c69224Vjs, InputStream inputStream, OutputStream outputStream) {
        byte[] bArr;
        try {
            synchronized (C126405nb.class) {
                int i = C126405nb.A00 + 1;
                C126405nb.A00 = i;
                if (i > 10) {
                    C0K8.A0P("ByteArrayPool", "Too many byte array objects allocated: %,d", Integer.valueOf(i));
                }
                ArrayList arrayList = C126405nb.A01;
                if (!arrayList.isEmpty()) {
                    bArr = (byte[]) arrayList.remove(arrayList.size() - 1);
                } else {
                    bArr = new byte[1024];
                }
            }
            long j = 0;
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    j += read;
                    if (c69224Vjs != null) {
                        long j2 = j - c69224Vjs.A00;
                        c69224Vjs.A00 = j;
                        Execution.executeAsync(new USK(c69224Vjs, j2, j), null, 3);
                    }
                } catch (Throwable th) {
                    th = th;
                    C126405nb.A00(bArr);
                    throw th;
                }
            }
            if (c69224Vjs != null) {
                long j3 = j - c69224Vjs.A00;
                c69224Vjs.A00 = j;
                Execution.executeAsync(new USK(c69224Vjs, j3, j), null, 3);
            }
            C126405nb.A00(bArr);
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }
}
