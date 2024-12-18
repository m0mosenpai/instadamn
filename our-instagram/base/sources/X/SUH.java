package X;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class SUH {
    public static final C62807SSb A00 = new Object();

    public static HashMap A00(Context context) {
        HashMap A1G = AbstractC166987dD.A1G();
        try {
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                int blockSize = new StatFs(filesDir.getPath()).getBlockSize();
                AbstractC58318PtA.A1R("internal_total_space_in_mb", A1G, filesDir.getTotalSpace() / 1048576);
                AbstractC58318PtA.A1R("internal_usable_space_in_mb", A1G, filesDir.getUsableSpace() / 1048576);
                C62807SSb c62807SSb = A00;
                AbstractC58318PtA.A1R("internal_used_in_mb", A1G, C62807SSb.A00(c62807SSb, filesDir, blockSize) / 1048576);
                AbstractC58318PtA.A1R("internal_cache_used_in_mb", A1G, C62807SSb.A00(c62807SSb, context.getCacheDir(), blockSize) / 1048576);
                AbstractC58318PtA.A1R("app_used_in_mb", A1G, C62807SSb.A00(c62807SSb, AbstractC166987dD.A11(context.getApplicationInfo().publicSourceDir), blockSize) / 1048576);
            }
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                int blockSize2 = new StatFs(externalCacheDir.getPath()).getBlockSize();
                AbstractC58318PtA.A1R("external_total_space_in_mb", A1G, externalCacheDir.getTotalSpace() / 1048576);
                AbstractC58318PtA.A1R("external_usable_space_in_mb", A1G, externalCacheDir.getUsableSpace() / 1048576);
                AbstractC58318PtA.A1R("external_file_used_in_mb", A1G, C62807SSb.A00(A00, externalCacheDir, blockSize2) / 1048576);
                return A1G;
            }
        } catch (IllegalArgumentException e) {
            String simpleName = SUH.class.getSimpleName();
            C14360o3.A07(simpleName);
            C0w9.A06(simpleName, "Unable to get storage info", e);
        }
        return A1G;
    }
}
