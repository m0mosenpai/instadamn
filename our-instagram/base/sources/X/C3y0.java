package X;

import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.io.File;
import java.io.FileFilter;

/* renamed from: X.3y0, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3y0 {
    public static final FileFilter A00 = new FileFilter() { // from class: X.3y1
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            if (!file.isFile()) {
                return false;
            }
            String name = file.getName();
            if (!name.startsWith("batch-") || !name.endsWith(RealtimeLogsProvider.LOG_SUFFIX)) {
                return false;
            }
            return true;
        }
    };
}
