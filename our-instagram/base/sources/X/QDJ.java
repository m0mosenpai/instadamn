package X;

import android.os.Process;
import java.io.File;
import java.util.List;

/* loaded from: classes10.dex */
public final class QDJ extends AbstractC100174ef {
    public final java.util.Set A01 = AbstractC166987dD.A1H();
    public final List A00 = AbstractC58318PtA.A11();

    public static void A00(QDJ qdj) {
        File[] listFiles;
        File A11 = AbstractC166987dD.A11(AnonymousClass001.A0c("/proc/", "/task/", Process.myPid()));
        if (A11.exists() && A11.canRead() && (listFiles = A11.listFiles()) != null) {
            for (File file : listFiles) {
                try {
                    int parseInt = Integer.parseInt(file.getName());
                    if (parseInt != -1) {
                        java.util.Set set = qdj.A01;
                        Integer valueOf = Integer.valueOf(parseInt);
                        if (!set.contains(valueOf)) {
                            set.add(valueOf);
                            qdj.A00.add(new C100164ee(parseInt));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
