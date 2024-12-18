package X;

import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import com.facebook.secure.fileprovider.common.FileStatHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: X.0b6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07870b6 {
    public static void A01(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        fileInputStream.close();
                        return;
                    } finally {
                        fileOutputStream.close();
                    }
                }
            }
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            fileInputStream.close();
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream == null) {
                throw th;
            }
        }
        if (fileOutputStream != null) {
            throw th;
        }
    }

    public static long A00() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return -1L;
        }
        ParcelFileDescriptor open = ParcelFileDescriptor.open(externalStorageDirectory, 268435456);
        try {
            FileStatHelper fileStatHelper = FileStatHelper.$redex_init_class;
            return FileStatHelper.statOpenFile(open.getFd()).device;
        } finally {
            open.close();
        }
    }

    public static boolean A02(ParcelFileDescriptor parcelFileDescriptor) {
        int myUid = Process.myUid();
        FileStatHelper fileStatHelper = FileStatHelper.$redex_init_class;
        if (myUid != FileStatHelper.statOpenFile(parcelFileDescriptor.getFd()).ownerUid) {
            return false;
        }
        return true;
    }
}
