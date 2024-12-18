package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.1Fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23901Fa {
    public static final C23901Fa A00 = new Object();
    public static final String[] A02 = {"ASUS_X00GD"};
    public static final Integer[] A01 = {C05F.A00, C05F.A01, C05F.A0C};

    public static final boolean A01(Integer num) {
        if (num != C05F.A0C) {
            String str = Build.MODEL;
            C14360o3.A08(str);
            Locale locale = Locale.getDefault();
            C14360o3.A07(locale);
            String upperCase = str.toUpperCase(locale);
            C14360o3.A07(upperCase);
            if (C14360o3.A0K(A02[0], upperCase)) {
                return false;
            }
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1 || intValue == 2) {
            return true;
        }
        throw new RuntimeException(AnonymousClass001.A0R("Unknown transformer type ", C1FZ.A00(num)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:12|13|14|(2:15|16)|(6:18|(1:20)|41|42|43|(1:48)(2:46|47))(1:(1:54))|21|23|24|25|26|27|28|(1:30)(1:(1:34))|31|41|42|43|(1:48)(1:49)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:12|13|14|15|16|(6:18|(1:20)|41|42|43|(1:48)(2:46|47))(1:(1:54))|21|23|24|25|26|27|28|(1:30)(1:(1:34))|31|41|42|43|(1:48)(1:49)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        X.C0w9.A07("AsymmetricTransformer", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        X.C0w9.A07("AsymmetricTransformer", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
    
        X.C0w9.A07("AsymmetricTransformer", r1);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0037 -> B:21:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC23931Fd A00(final android.content.Context r10, java.lang.Integer r11, final java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23901Fa.A00(android.content.Context, java.lang.Integer, java.lang.String):X.1Fd");
    }
}
