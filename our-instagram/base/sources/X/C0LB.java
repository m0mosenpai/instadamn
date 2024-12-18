package X;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0LB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0LB {
    public static HashMap A02() {
        HashMap hashMap = new HashMap();
        String A03 = AbstractC02650Ap.A03("ig.ig_server_rev_hash");
        if (TextUtils.isEmpty(A03)) {
            A03 = System.getProperty("ig.ig_server_rev_hash");
        }
        if (!TextUtils.isEmpty(A03)) {
            hashMap.put("ig.ig_server_rev_hash", A03);
        }
        String A032 = AbstractC02650Ap.A03("fb.report_source");
        if (TextUtils.isEmpty(A032)) {
            A032 = System.getProperty("fb.report_source");
        }
        if (!TextUtils.isEmpty(A032)) {
            hashMap.put("fb.report_source", A032);
            String A033 = AbstractC02650Ap.A03("fb.testing.build_target");
            if (TextUtils.isEmpty(A033)) {
                A033 = System.getProperty("fb.testing.build_target");
            }
            if (!TextUtils.isEmpty(A033)) {
                hashMap.put("fb.testing.build_target", A033);
            }
            String A034 = AbstractC02650Ap.A03("fb.test_name");
            if (TextUtils.isEmpty(A034)) {
                A034 = System.getProperty("fb.test_name");
            }
            if (!TextUtils.isEmpty(A034)) {
                hashMap.put("fb.test_name", A034);
            }
            String A035 = AbstractC02650Ap.A03("fb.test_execution_uuid");
            if (TextUtils.isEmpty(A035)) {
                A035 = System.getProperty("fb.test_execution_uuid");
            }
            if (!TextUtils.isEmpty(A035)) {
                hashMap.put("fb.test_execution_uuid", A035);
            }
        }
        return hashMap;
    }

    public static String A00(File file) {
        File file2 = new File(new File(file, "report_source"), "report_source_ref.txt");
        if (file2.exists()) {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append('\n');
                    } else {
                        String obj = sb.toString();
                        bufferedReader.close();
                        return obj;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
            }
        } else {
            return null;
        }
    }

    public static String A01(Map map) {
        String str = (String) map.get("fb.test_name");
        String str2 = (String) map.get("fb.test_execution_uuid");
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return null;
        }
        return AnonymousClass001.A11("{\"test_name\":\"", str, "\",\"test_execution_uuid\":\"", str2, "\"}");
    }
}
