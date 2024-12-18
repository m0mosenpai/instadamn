package X;

import android.content.Context;
import com.facebook.analytics.util.AnalyticsMemoryUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/* renamed from: X.SQe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62767SQe {
    public static HashSet A00() {
        String[] loadedLibraries = AnalyticsMemoryUtil.getLoadedLibraries();
        HashSet A1H = AbstractC166987dD.A1H();
        for (String str : loadedLibraries) {
            if (!str.startsWith("/system") && !str.startsWith("/vendor")) {
                A1H.add(AbstractC166987dD.A11(str).getName());
            }
        }
        return A1H;
    }

    public static HashSet A01(Context context, String[] strArr) {
        HashSet A00 = A00();
        for (String str : strArr) {
            File A0f = AbstractC58322PtE.A0f("libs_", str, MSW.A0w(context.getFilesDir(), "nativemetrics"));
            if (A0f.exists()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(A0f));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            A00.add(readLine);
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                            break;
                        }
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    C0K8.A0M("NativeFilesUtils", "Error reading loaded libraries for process: %s", e, str);
                }
            }
        }
        return A00;
    }
}
