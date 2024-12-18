package X;

import android.os.SystemClock;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.0Mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04670Mj {
    public long A00;
    public String A04;
    public volatile File A09;
    public String A03 = "unknown";
    public String A02 = "unknown";
    public final java.util.Set A08 = new HashSet();
    public final StringBuilder A06 = new StringBuilder();
    public final C0AE A07 = new Object() { // from class: X.0AE
        public final Map A00 = new HashMap();
    };
    public C04280Ku A01 = new C04280Ku(0);
    public boolean A05 = false;

    public final void A00() {
        final String replace = "vma_webview_reserved_freed".replace(',', '_');
        StringBuilder sb = this.A06;
        synchronized (sb) {
            java.util.Set set = this.A08;
            if (!set.contains(replace)) {
                if (!set.isEmpty()) {
                    sb.append(',');
                }
                sb.append(replace);
                set.add(replace);
                if (this.A09 != null) {
                    C04590Mb.A02().execute(new Runnable() { // from class: X.0OC
                        @Override // java.lang.Runnable
                        public final void run() {
                            C04670Mj c04670Mj = C04670Mj.this;
                            String str = replace;
                            File file = new File(c04670Mj.A09, "navmodules.txt");
                            boolean exists = file.exists();
                            try {
                                FileWriter fileWriter = new FileWriter(file, true);
                                if (exists) {
                                    try {
                                        fileWriter.write(44);
                                    } finally {
                                    }
                                }
                                fileWriter.write(str);
                                fileWriter.close();
                            } catch (IOException e) {
                                C0K8.A0H("lacrima", "Saving granular exposures failed", e);
                                C0PC.A00().DEh("StartupConfigGEWriting", e, null);
                            }
                        }
                    });
                }
            }
        }
        SystemClock.uptimeMillis();
    }
}
