package X;

import android.os.Bundle;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.8a1, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8a1 {
    public static Boolean A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String[] A06 = {"_id", "media_type", "_data", IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.HEIGHT, "orientation", "bucket_id", "bucket_display_name", "datetaken", "date_added", "duration"};
    public static final String[] A07 = {"_id", "media_type", "_data", IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.HEIGHT, "orientation", "bucket_id", "bucket_display_name", "datetaken", "date_added", "duration", "is_favorite"};

    /* JADX WARN: Code restructure failed: missing block: B:121:0x029b, code lost:
    
        if (r3.getInt(r11) == 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02e1, code lost:
    
        if (r3 == null) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A01(android.content.ContentResolver r28, X.EnumC188968Ym r29, java.util.List r30, int r31, int r32, int r33, int r34, long r35, long r37, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8a1.A01(android.content.ContentResolver, X.8Ym, java.util.List, int, int, int, int, long, long, boolean, boolean):java.util.ArrayList");
    }

    static {
        Locale locale = Locale.US;
        String format = String.format(locale, "(%s = %d OR %s = %d) AND (%s > 0 OR %s IS NULL)", Arrays.copyOf(new Object[]{"media_type", 1, "media_type", 3, IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.WIDTH}, 6));
        C14360o3.A07(format);
        A01 = format;
        String format2 = String.format(locale, "(%s = %d OR %s = %d) AND %s != '%s' AND (%s > 0 OR %s IS NULL)", Arrays.copyOf(new Object[]{"media_type", 1, "media_type", 3, "mime_type", "image/svg+xml", IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.WIDTH}, 8));
        C14360o3.A07(format2);
        A02 = format2;
        String format3 = String.format(locale, "%s = %d AND (%s > 0 OR %s IS NULL)", Arrays.copyOf(new Object[]{"media_type", 1, IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.WIDTH}, 4));
        C14360o3.A07(format3);
        A03 = format3;
        String format4 = String.format(locale, "%s = %d AND %s != '%s' AND (%s > 0 OR %s IS NULL)", Arrays.copyOf(new Object[]{"media_type", 1, "mime_type", "image/gif", IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.WIDTH}, 6));
        C14360o3.A07(format4);
        A04 = format4;
        String format5 = String.format(locale, "%s = %d AND (%s > 0 OR %s IS NULL)", Arrays.copyOf(new Object[]{"media_type", 3, IgReactMediaPickerNativeModule.WIDTH, IgReactMediaPickerNativeModule.WIDTH}, 4));
        C14360o3.A07(format5);
        A05 = format5;
    }

    public static final Bundle A00(String str, String str2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putStringArray("android:query-arg-sort-columns", new String[]{str});
        bundle.putInt("android:query-arg-sort-direction", 1);
        bundle.putString("android:query-arg-sql-selection", str2);
        bundle.putStringArray("android:query-arg-sql-selection-args", (String[]) arrayList.toArray(new String[0]));
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x01af, code lost:
    
        if (r3 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0169, code lost:
    
        if (r3.getInt(r11) == 0) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A02(android.content.ContentResolver r38, java.lang.String r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8a1.A02(android.content.ContentResolver, java.lang.String, boolean):java.util.ArrayList");
    }
}
