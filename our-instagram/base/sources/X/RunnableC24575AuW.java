package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.AuW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24575AuW implements Runnable {
    public final /* synthetic */ C23485Ab0 A00;
    public final /* synthetic */ Map.Entry A01;

    public RunnableC24575AuW(C23485Ab0 c23485Ab0, Map.Entry entry) {
        this.A00 = c23485Ab0;
        this.A01 = entry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C23485Ab0 c23485Ab0 = this.A00;
        Map.Entry entry = this.A01;
        File file = (File) entry.getKey();
        File file2 = (File) entry.getValue();
        C14360o3.A0B(file, 0);
        C14360o3.A0B(file2, 1);
        int A0I = AbstractC166987dD.A0I(file2, AbstractC166987dD.A0G(file) + 961);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c23485Ab0.A00;
        lightweightQuickPerformanceLogger.markerStart(38469647, A0I, "master", file.getPath());
        lightweightQuickPerformanceLogger.markerAnnotate(38469647, A0I, "slave", file2.getPath());
        try {
            File[] listFiles = file.listFiles();
            File[] listFiles2 = file2.listFiles();
            if (listFiles != null && listFiles2 != null) {
                HashSet hashSet = new HashSet(listFiles.length);
                for (File file3 : listFiles) {
                    hashSet.add(file3.getName());
                }
                i = 0;
                for (File file4 : listFiles2) {
                    if (!hashSet.contains(file4.getName())) {
                        c23485Ab0.A01.A08.A00(file4);
                        i++;
                    }
                }
            } else {
                i = -1;
            }
            lightweightQuickPerformanceLogger.markerAnnotate(38469647, A0I, "removeCount", i);
            lightweightQuickPerformanceLogger.markerEnd(38469647, A0I, (short) 2);
        } catch (Throwable th) {
            lightweightQuickPerformanceLogger.markerEnd(38469647, A0I, (short) 3);
            throw th;
        }
    }
}
