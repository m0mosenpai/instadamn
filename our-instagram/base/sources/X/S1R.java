package X;

import android.os.StatFs;
import java.io.File;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S1R {
    public static final void A00(File file, String str, Map map) {
        if (file != null && file.exists()) {
            StatFs statFs = new StatFs(file.getPath());
            map.put(str, new C64167T1w(statFs.getAvailableBytes(), statFs.getFreeBytes(), statFs.getTotalBytes()));
        }
    }
}
