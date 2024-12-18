package X;

import com.instagram.debug.quickexperiment.MobileConfigBisection;
import java.io.File;

/* renamed from: X.5NX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5NX {
    public static File A00(String str) {
        File file = new File(str);
        if (file.isDirectory()) {
            File file2 = new File(str, "id_name_mapping.json");
            if (!file2.exists()) {
                return new File(new File(str, MobileConfigBisection.BISECT_DIR), "id_name_mapping.json");
            }
            return file2;
        }
        return file;
    }
}
