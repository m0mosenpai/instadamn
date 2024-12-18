package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: X.15J, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C15J {
    public static int A00 = -1;

    public static int[] A02(int i) {
        try {
            return new int[]{A01(AnonymousClass001.A0c("/sys/devices/system/cpu/cpu", "/cpufreq/cpuinfo_min_freq", i)), A01(AnonymousClass001.A0c("/sys/devices/system/cpu/cpu", "/cpufreq/cpuinfo_max_freq", i))};
        } catch (IOException unused) {
            return new int[]{-1, -1};
        }
    }

    public static int A00() {
        int i = A00;
        if (i == -1 || i == -2) {
            File file = new File("/sys/devices/system/cpu/possible");
            if (!file.exists()) {
                i = -2;
            } else {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    try {
                        String readLine = bufferedReader.readLine();
                        bufferedReader.close();
                        int indexOf = readLine.indexOf(45);
                        if (indexOf != -1) {
                            i = Integer.parseInt(readLine.substring(indexOf + 1)) + 1;
                        } else {
                            i = Integer.parseInt(readLine) + 1;
                        }
                    } catch (Throwable th) {
                        bufferedReader.close();
                        throw th;
                    }
                } catch (Exception unused) {
                    i = -1;
                }
            }
            A00 = i;
        }
        return i;
    }

    public static int A01(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return -2;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                return Integer.parseInt(readLine);
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
