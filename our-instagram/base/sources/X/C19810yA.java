package X;

import android.content.Context;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0yA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19810yA {
    public static final long A02 = TimeUnit.HOURS.toMillis(2);
    public final Context A00;
    public final File A01;

    public static boolean A00(C19810yA c19810yA, boolean z) {
        String str;
        long currentTimeMillis = System.currentTimeMillis() - AbstractC19730y1.A00(AbstractC12960li.A00).A00.getLong("loom_config_last_sync_timestamp", 0L);
        boolean z2 = false;
        if (currentTimeMillis > A02) {
            z2 = true;
        }
        C06570Wi.A00().A02(Boolean.valueOf(z2), Long.valueOf(currentTimeMillis), "IgProfiloConfigStore", "isConfigStale: %b (time since last sync = %d ms)");
        if (!z2) {
            Context context = c19810yA.A00;
            File file = new File(context.getFilesDir(), "profilo");
            File file2 = new File(file, "ProfiloInitFileConfig.json.bak");
            if (!file2.exists() || !file2.renameTo(new File(file, "ProfiloInitFileConfig.json"))) {
                C06570Wi.A00().A04("IgProfiloConfigStore", "No backup config file on disk");
                if (z) {
                    if (!new File(AbstractC23881Ey.A00().AXd(null, 1764852134), "profilo_config.json").exists()) {
                        C06570Wi.A00().A04("IgProfiloConfigStore", "No config in Cask cache");
                    } else {
                        if (!new File(new File(context.getFilesDir(), "profilo"), "ProfiloInitFileConfig.json").exists()) {
                            try {
                                C06570Wi.A00().A04("IgProfiloConfigStore", "Restoring the config from Cask cache");
                                File file3 = new File(AbstractC23881Ey.A00().AXd(null, 1764852134), "profilo_config.json");
                                File file4 = c19810yA.A01;
                                Files.A01(file3, file4);
                                C18790w7 c18790w7 = new C18790w7(context);
                                c18790w7.A00 = file4;
                                c18790w7.A02 = C05F.A01;
                                C20020yW.A00().A06(c18790w7);
                                return false;
                            } catch (IOException e) {
                                C10V A00 = C06570Wi.A00();
                                if (e.getMessage() != null) {
                                    str = e.getMessage();
                                } else {
                                    str = "n/a";
                                }
                                A00.A03("IgProfiloConfigStore", str, "Failed to restore config from Cask cache. Exception: %s");
                                return true;
                            }
                        }
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public C19810yA(Context context) {
        this.A01 = new File(context.getFilesDir(), "profilo_config_temp");
        this.A00 = context.getApplicationContext();
    }
}
