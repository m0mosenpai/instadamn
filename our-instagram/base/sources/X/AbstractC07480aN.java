package X;

import android.content.Context;
import android.os.Parcel;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

/* renamed from: X.0aN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07480aN extends C006402e {
    public String[] A00;
    public final Context A01;

    public AbstractC07480aN(Context context, File file) {
        super(file, 1);
        this.A01 = context;
    }

    public abstract AbstractC09260db A0A();

    public static void A00(File file, byte b, boolean z) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e) {
            android.util.Log.w("fb-UnpackingSoSource", "state file sync failed", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    @Override // X.AbstractC09180dS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A08(int r21) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC07480aN.A08(int):void");
    }

    public byte[] A0B() {
        Parcel obtain = Parcel.obtain();
        AbstractC09260db A0A = A0A();
        try {
            C09240dZ[] A02 = A0A.A02();
            obtain.writeInt(A02.length);
            for (C09240dZ c09240dZ : A02) {
                obtain.writeString(c09240dZ.A01);
                obtain.writeString(c09240dZ.A00);
            }
            A0A.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            try {
                A0A.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public C09240dZ[] A0C() {
        AbstractC09260db A0A = A0A();
        try {
            C09240dZ[] A02 = A0A.A02();
            A0A.close();
            return A02;
        } catch (Throwable th) {
            try {
                A0A.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public AbstractC07480aN(Context context, String str, boolean z) {
        super(new File(AnonymousClass001.A0g(context.getApplicationInfo().dataDir, "/", str)), z ? 1 : 0);
        this.A01 = context;
    }
}
