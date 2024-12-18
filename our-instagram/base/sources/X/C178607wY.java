package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.7wY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178607wY {
    public static int A00 = 270;
    public static String A01 = "/sdcard/e2e/media/fineYoungGentleman.jpg";
    public static Boolean A02;

    public static boolean A00() {
        boolean booleanValue;
        synchronized (C178607wY.class) {
            Boolean bool = A02;
            if (bool == null) {
                try {
                    Boolean bool2 = (Boolean) Class.forName("com.facebook.endtoend.EndToEnd").getMethod("isRunningEndToEndTest", new Class[0]).invoke(null, new Object[0]);
                    if (bool2 != null && bool2.booleanValue()) {
                        bool = Boolean.valueOf(new File(A01).exists());
                    } else {
                        bool = false;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException unused) {
                    bool = false;
                }
                A02 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    public static byte[] A01() {
        try {
            File file = new File(A01);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream.read(bArr);
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
