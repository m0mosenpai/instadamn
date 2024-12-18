package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.1B9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1B9 {
    public final Context A00;
    public final File A01;

    public static String A00(String str, int i) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    str2 = "files";
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0O("Invalid location value provided = ", i));
                }
            } else {
                str3 = "app_";
                sb.append(str3);
                sb.append(str);
                sb.append(File.separator);
                return sb.toString();
            }
        } else {
            str2 = "cache";
        }
        sb.append(str2);
        str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(File.separator);
        return sb.toString();
    }

    public final File A01(String str) {
        File file = this.A01;
        if (file != null) {
            if (!str.isEmpty()) {
                return new File(file, str);
            }
            throw new IllegalArgumentException(AnonymousClass001.A0R("Invalid Relative Path = ", str));
        }
        throw new IllegalStateException(AnonymousClass001.A0R("Uninitialised Factory when using ", str));
    }

    public C1B9(Context context) {
        this.A00 = context.getApplicationContext();
        this.A01 = C23191Ay.A00(context);
    }
}
