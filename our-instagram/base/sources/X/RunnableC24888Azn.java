package X;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.Azn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24888Azn implements Runnable {
    public final /* synthetic */ C179987yo A00;
    public final /* synthetic */ C22813A4g A01;
    public final /* synthetic */ C176877tj A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ byte[] A06;

    public RunnableC24888Azn(C179987yo c179987yo, C22813A4g c22813A4g, C176877tj c176877tj, File file, byte[] bArr, boolean z, boolean z2) {
        this.A00 = c179987yo;
        this.A04 = z;
        this.A06 = bArr;
        this.A03 = file;
        this.A02 = c176877tj;
        this.A05 = z2;
        this.A01 = c22813A4g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        Exception e;
        boolean z = this.A04;
        byte[] bArr = this.A06;
        if (z) {
            file = this.A03;
            if (!AbstractC23117AKb.A03()) {
                e = null;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(bArr, 0, bArr.length);
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException unused) {
                            throw th;
                        }
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                throw AbstractC166987dD.A18("Method processJpegToJpegFile must be invoked on a background thread");
            }
        } else {
            C176877tj c176877tj = this.A02;
            boolean z2 = this.A05;
            file = this.A03;
            if (!AbstractC23117AKb.A03()) {
                Bitmap A01 = AbstractC23117AKb.A01(null, c176877tj, bArr, z2);
                if (A01 == null) {
                    e = AbstractC166987dD.A18("Failed to generate bitmap.");
                } else {
                    e = AbstractC23117AKb.A02(A01, file);
                }
            } else {
                throw AbstractC166987dD.A18("Method processJpegToBitmapFile must be invoked on a background thread");
            }
        }
        APL.A05(this.A01, file, e);
    }
}
