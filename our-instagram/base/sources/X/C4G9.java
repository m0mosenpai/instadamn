package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.debug.quickexperiment.MobileConfigBisection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.regex.Pattern;

/* renamed from: X.4G9, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4G9 {
    public static final Pattern A00 = Pattern.compile("(\\d+)\\.mctable");

    public static String A01(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                } finally {
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            C0K8.A0L("MobileConfigFilesOnDiskUtils", "Failed to read file %s", e, file);
        }
        return sb.toString();
    }

    public static String A02(File file, int i) {
        String str;
        String A0R;
        if (i != 1) {
            str = "";
        } else {
            str = "qce";
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            if (!canonicalPath.endsWith("/")) {
                canonicalPath = AnonymousClass001.A0R(canonicalPath, "/");
            }
            if (str.isEmpty()) {
                A0R = "";
            } else {
                A0R = AnonymousClass001.A0R("_", str);
            }
            return AnonymousClass001.A0u(canonicalPath, MobileConfigBisection.BISECT_DIR, A0R, "/");
        } catch (IOException e) {
            C0K8.A0O("MobileConfigFilesOnDiskUtils", "In getBufferPath, failed to get canonical path for data dir %s: %s", file, e);
            return "";
        }
    }

    public static String A03(File file, int i) {
        String A0g;
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        String str = "/";
        if (file.getName().endsWith("/")) {
            str = "";
        }
        sb.append(str);
        if (i <= 2) {
            A0g = "params_map_v4_u0.txt";
        } else {
            A0g = AnonymousClass001.A0g("params_map_v4_u", String.valueOf(i), OptSvcAnalyticsStore.FILE_SUFFIX);
        }
        sb.append(A0g);
        String obj = sb.toString();
        if (!new File(obj).exists()) {
            return null;
        }
        return obj;
    }

    public static String A04(String str) {
        int i;
        File[] listFiles = new File(str).listFiles(new FilenameFilter() { // from class: X.4GA
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(".mctable");
            }
        });
        String str2 = "";
        if (listFiles != null) {
            int i2 = -1;
            for (File file : listFiles) {
                try {
                    i = Integer.parseInt(file.getName().substring(0, r1.length() - 8));
                } catch (NumberFormatException e) {
                    C0K8.A0M("MobileConfigFilesOnDiskUtils", "Unexpected mctable file: %s", e, file);
                    i = -1;
                }
                if (i > i2) {
                    try {
                        str2 = file.getCanonicalPath();
                        i2 = i;
                    } catch (IOException e2) {
                        C0K8.A0M("MobileConfigFilesOnDiskUtils", "In  findLatestFlatbufferUnderDir, fail to get canonical path for %s: %s", e2, file, e2);
                    }
                }
            }
        }
        return str2;
    }

    public static String A00(int i, String str, String str2) {
        String A0R;
        if (str2.isEmpty()) {
            A0R = "";
        } else {
            A0R = AnonymousClass001.A0R("_", str2);
        }
        String A0g = AnonymousClass001.A0g(A0R, ".data", "/");
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("u");
                if (i != 7) {
                    sb.append(i);
                    sb.append("_");
                    sb.append(str);
                } else {
                    sb.append(i);
                }
                str = sb.toString();
            }
        } else {
            str = "sessionless";
        }
        return AnonymousClass001.A0R(str, A0g);
    }

    public static boolean A05(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            boolean z = true;
            for (File file2 : listFiles) {
                if (z) {
                    z = true;
                    if (A05(file2)) {
                    }
                }
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        if (!file.delete()) {
            return false;
        }
        return true;
    }
}
