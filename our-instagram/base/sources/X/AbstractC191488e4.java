package X;

import android.os.Environment;
import android.os.StatFs;
import android.util.LruCache;
import com.instagram.common.gallery.Medium;
import java.io.File;

/* renamed from: X.8e4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191488e4 {
    /* JADX WARN: Type inference failed for: r0v7, types: [X.8e5] */
    public static final C191498e5 A00() {
        if (new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes() / 10 > 10000000) {
            long availableBytes = new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes() / 10;
            if (availableBytes > 100000000) {
                availableBytes = 100000000;
            }
            final int i = (int) availableBytes;
            return new LruCache(i) { // from class: X.8e5
                @Override // android.util.LruCache
                public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
                    Medium medium = (Medium) obj2;
                    if (z && medium != null && medium.A06()) {
                        File file = new File(medium.A0X);
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }

                @Override // android.util.LruCache
                public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
                    Medium medium = (Medium) obj2;
                    if (medium == null || !medium.A06()) {
                        return 0;
                    }
                    File file = new File(medium.A0X);
                    if (!file.exists()) {
                        return 0;
                    }
                    return (int) file.length();
                }
            };
        }
        return null;
    }
}
