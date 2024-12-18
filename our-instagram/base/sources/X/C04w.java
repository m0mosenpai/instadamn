package X;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: X.04w, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04w {
    public static final String A02 = C04w.class.getName();
    public AnonymousClass047 A00;
    public boolean A01;

    public static final void A00(Context context, C04w c04w) {
        File file = new File(context.getApplicationInfo().dataDir, "ig_crash_log_session");
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                try {
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            } else {
                                sb.append(readLine);
                            }
                        }
                        String obj = sb.toString();
                        C14360o3.A07(obj);
                        if (obj.length() > 0) {
                            c04w.A00 = new AnonymousClass047(obj);
                        }
                        bufferedReader.close();
                        fileReader.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                C0K8.A0F(A02, "Unable to read session", e);
            }
        }
    }
}
