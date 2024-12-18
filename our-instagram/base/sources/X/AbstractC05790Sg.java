package X;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05790Sg {
    public static final Map A00 = Collections.synchronizedMap(new HashMap());

    public static int A00(C09330di c09330di, String str, int i) {
        boolean exists;
        FileInputStream openFileInput;
        DataInputStream dataInputStream;
        Map map = A00;
        Number number = (Number) map.get(str);
        if (number != null) {
            return number.intValue();
        }
        try {
            exists = A01(c09330di, str).exists();
        } catch (IOException unused) {
        }
        try {
            try {
                if (!exists) {
                    if (new File(c09330di.A00.getFilesDir(), str).exists()) {
                        openFileInput = c09330di.A00.openFileInput(str);
                    }
                    map.put(str, Integer.valueOf(i));
                    return i;
                }
                openFileInput = new FileInputStream(A01(c09330di, str));
                int readInt = dataInputStream.readInt();
                if (!exists) {
                    A03(c09330di, str, readInt);
                }
                dataInputStream.close();
                if (!exists) {
                    try {
                        c09330di.A00.deleteFile(str);
                    } catch (SecurityException unused2) {
                    }
                }
                i = readInt;
                map.put(str, Integer.valueOf(i));
                return i;
            } finally {
            }
            dataInputStream = new DataInputStream(openFileInput);
        } catch (Throwable th) {
            if (!exists) {
                try {
                    c09330di.A00.deleteFile(str);
                } catch (SecurityException unused3) {
                }
            }
            throw th;
        }
    }

    public static File A01(C09330di c09330di, String str) {
        return new File(new File(c09330di.A00.getFilesDir(), "GkBootstrap"), str);
    }

    public static void A03(C09330di c09330di, String str, int i) {
        try {
            File file = new File(c09330di.A00.getFilesDir(), "GkBootstrap");
            if (!file.exists()) {
                if (!file.mkdir()) {
                    return;
                }
            }
            File A01 = A01(c09330di, str);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(A01));
                try {
                    dataOutputStream.writeInt(i);
                    dataOutputStream.close();
                } catch (Throwable th) {
                    try {
                        dataOutputStream.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException | SecurityException e) {
                C0K8.A0M("GkBootstrap", "Unable to persist GK value to %s", e, A01);
            }
        } catch (SecurityException e2) {
            C0K8.A0L("GkBootstrap", "Unable to create %s directory", e2, "GkBootstrap");
        }
    }

    @Deprecated
    public static void A02(C09330di c09330di, String str) {
        File file;
        if (A01(c09330di, str).exists()) {
            file = A01(c09330di, str);
        } else {
            file = new File(c09330di.A00.getFilesDir(), str);
        }
        if (!file.delete()) {
            if (!file.exists()) {
                return;
            }
            C0K8.A0P("GkBootstrap", "Unable to clean up GK file %s", str);
        }
    }
}
