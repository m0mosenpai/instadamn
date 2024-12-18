package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.LDv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47901LDv {
    public static ImmutableMap A00;
    public static ImmutableMap A01;
    public static String A02;
    public static String A03;

    static {
        ImmutableMap immutableMap = RegularImmutableMap.A02;
        C14360o3.A07(immutableMap);
        A00 = immutableMap;
        A01 = immutableMap;
    }

    public static final DirectThreadThemeInfo A00(String str) {
        if (str == null) {
            return null;
        }
        DirectThreadThemeInfo directThreadThemeInfo = (DirectThreadThemeInfo) AbstractC125795mU.A0f.get(str);
        if (directThreadThemeInfo != null) {
            return directThreadThemeInfo;
        }
        return (DirectThreadThemeInfo) AbstractC125795mU.A00.get(str);
    }
}
