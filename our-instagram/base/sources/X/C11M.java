package X;

import android.content.Context;
import com.facebook.common.build.BuildConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: X.11M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11M {
    public static C11M A03;
    public String A00;
    public final int A01 = BuildConstants.A01();
    public final File A02;

    public static synchronized C11M A00(Context context) {
        C11M c11m;
        synchronized (C11M.class) {
            c11m = A03;
            if (c11m == null) {
                File A00 = C0eS.A00(context, 998546933);
                A00.mkdirs();
                File file = new File(A00, "ota_version");
                String str = "0";
                if (file.canRead()) {
                    String str2 = null;
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        try {
                            str2 = bufferedReader.readLine();
                            bufferedReader.close();
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                    } catch (IOException unused2) {
                    }
                    String str3 = "-1";
                    if (str2 != null && !str2.isEmpty()) {
                        String[] split = str2.split("-", 2);
                        if (split.length == 2) {
                            if (split[0].equals(Integer.toString(BuildConstants.A01()))) {
                                str3 = split[1];
                            }
                        }
                    }
                    str = str3;
                }
                c11m = new C11M(file, str);
                A03 = c11m;
            }
        }
        return c11m;
    }

    public C11M(File file, String str) {
        this.A02 = file;
        this.A00 = str;
    }
}
