package X;

import java.io.File;

/* renamed from: X.0Gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03440Gx {
    public static void A00(InterfaceC03450Gy interfaceC03450Gy, File file) {
        interfaceC03450Gy.E54(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A00(interfaceC03450Gy, file2);
                } else {
                    interfaceC03450Gy.FDl(file2);
                }
            }
        }
        interfaceC03450Gy.E4z(file);
    }

    public static void A01(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                A02(file2);
            }
        }
    }

    public static boolean A02(File file) {
        if (file.isDirectory()) {
            A01(file);
        }
        return file.delete();
    }
}
