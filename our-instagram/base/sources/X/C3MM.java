package X;

import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: X.3MM, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3MM {
    public static final File A00;
    public static final String A01;
    public static final String A02;
    public static final Pattern A03;
    public static final String[] A04;

    static {
        File file;
        StringBuilder sb = new StringBuilder();
        sb.append(C0eT.A00(Environment.DIRECTORY_DCIM));
        String str = File.separator;
        sb.append(str);
        sb.append("Screenshots");
        sb.append(str);
        String obj = sb.toString();
        A01 = obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C0eT.A00(Environment.DIRECTORY_PICTURES));
        sb2.append(str);
        sb2.append("Screenshots");
        sb2.append(str);
        String obj2 = sb2.toString();
        A02 = obj2;
        A04 = new String[]{obj, obj2};
        if (Build.VERSION.SDK_INT >= 29) {
            file = C0eT.A00(Environment.DIRECTORY_SCREENSHOTS);
        } else {
            file = null;
        }
        A00 = file;
        Pattern compile = Pattern.compile(".*([\\d]{4}).?([\\d]{2}).?([\\d]{2}).?([\\d]{2}).?([\\d]{2}).?([\\d]{2}).*\\.[0-9a-zA-Z]{1,5}", 2);
        C14360o3.A07(compile);
        A03 = compile;
    }
}
