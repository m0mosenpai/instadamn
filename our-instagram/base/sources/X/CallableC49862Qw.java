package X;

import android.util.Pair;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.2Qw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC49862Qw implements Callable {
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int length;
        Object obj;
        String[] list = new File("/proc/self/task").list();
        if (list != null && (length = list.length) != 0) {
            StringBuilder sb = new StringBuilder(length * 16);
            for (String str : list) {
                try {
                    Pair A00 = C0JC.A00(AnonymousClass001.A0g("/proc/self/task/", str, "/comm"));
                    if (((Integer) A00.second).intValue() == 0 && (obj = A00.first) != null) {
                        String str2 = (String) obj;
                        if (str2.length() != 0) {
                            if (str2.startsWith("X.")) {
                                sb.append(str2);
                            } else {
                                boolean z = false;
                                for (int i = 0; i < str2.length(); i++) {
                                    char charAt = str2.charAt(i);
                                    if (charAt >= '0') {
                                        if (charAt <= '9') {
                                            if (!z) {
                                                sb.append("###");
                                                z = true;
                                            }
                                        }
                                    } else if (charAt == ' ') {
                                        charAt = '_';
                                    }
                                    sb.append(charAt);
                                    z = false;
                                }
                            }
                            sb.append(',');
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return sb.substring(0, sb.length() - 1);
        }
        return null;
    }
}
