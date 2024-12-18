package X;

import android.content.Context;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.0QJ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0QJ extends AbstractC03210De {
    @Override // X.AbstractC03210De
    public final void A01(boolean z) {
        File file = this.A00;
        AbstractC05810Sj.A00(file);
        C0fY.A01(2147483648L, "AppUnpacker.fsync", -283075799);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                C0fY.A00(2147483648L, -1677413782);
            } finally {
            }
        } catch (Throwable th) {
            C0fY.A00(2147483648L, -1948416264);
            throw th;
        }
    }

    @Override // X.AbstractC03210De
    public final boolean A02(Context context, byte[] bArr) {
        AbstractC05810Sj.A00(this.A00);
        return !r0.exists();
    }
}
