package com.facebook.voltron.metadata;

import X.C0K8;

/* loaded from: classes.dex */
public class VoltronModuleMetadataHelper {
    public static int getModuleRangeIndexForRedexClassName(int i, int[] iArr, int i2, int i3) {
        int i4;
        if (i2 > i3) {
            return -1;
        }
        int i5 = (i2 + i3) / 2;
        int i6 = i5 * 2;
        int i7 = i6 + 1;
        int i8 = iArr[i6];
        if (i8 != -1 && (i4 = iArr[i7]) != -1) {
            if (i > i4) {
                return getModuleRangeIndexForRedexClassName(i, iArr, i5 + 1, i3);
            }
            if (i < i8) {
                return getModuleRangeIndexForRedexClassName(i, iArr, i2, i5 - 1);
            }
            return i5;
        }
        C0K8.A0D("VoltronModuleMetadataHelper", "Invalid range in module range index");
        return -1;
    }

    public static int getBase62ClassName(String str) {
        int i;
        int i2 = 0;
        for (int lastIndexOf = str.lastIndexOf(46) + 1; lastIndexOf < str.length(); lastIndexOf++) {
            i2 *= 62;
            char charAt = str.charAt(lastIndexOf);
            if (charAt >= '0') {
                if (charAt <= '9') {
                    i = charAt - '0';
                } else if (charAt >= 'A') {
                    if (charAt <= 'Z') {
                        i = (charAt - 'A') + 10;
                    } else if (charAt >= 'a' && charAt <= 'z') {
                        i = (charAt - 'a') + 10 + 26;
                    }
                }
                i2 += i;
            }
        }
        return i2;
    }

    public static String getPackageNameForClass(String str) {
        if (!str.isEmpty()) {
            if (str.startsWith("X.")) {
                return "X";
            }
            if (Character.isLowerCase(str.codePointAt(0))) {
                int length = str.length() - 1;
                int indexOf = str.indexOf(46);
                while (indexOf > 0 && indexOf < length) {
                    int i = indexOf + 1;
                    if (!Character.isLowerCase(str.codePointAt(i))) {
                        return str.substring(0, indexOf);
                    }
                    indexOf = str.indexOf(46, i);
                }
            }
            return "";
        }
        throw new IllegalArgumentException("Class name is empty");
    }

    public static String getShortNameForClass(String str, String str2) {
        if (!str2.isEmpty()) {
            return str.substring(str2.length() + 1);
        }
        return str;
    }

    public static int getModuleRangeIndexForRedexClassName(String str, int[] iArr) {
        return getModuleRangeIndexForRedexClassName(getBase62ClassName(str), iArr, 0, (iArr.length / 2) - 1);
    }
}
