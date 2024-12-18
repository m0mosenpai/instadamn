package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.os.Build;

/* loaded from: classes.dex */
public class StringTreeSet {
    public static final int BITS_PER_PAYLOAD_UNIT = 6;
    public static final int CHILDREN_SIZE = 4;
    public static final int FLAG_NONTERMINAL = 16;
    public static final int FLAG_NO_PAYLOAD = 8;
    public static final int FLAG_PAYLOAD_UNIT = 64;
    public static final boolean IS_OS_VERSION_CHAOTIC;
    public static final int MAX_SYMBOL_COUNT = 127;
    public static final int PAYLOAD_MASK = 63;
    public static final int PAYLOAD_UNITS_MASK = 7;
    public static final int SINGLE_SYMBOL_MIN_VALUE = 32;
    public static final String TAG = "StringTreeSet";
    public static volatile Logger sLogger;

    /* loaded from: classes.dex */
    public interface Logger {
        void onStringTreeLookup(String str);
    }

    public static boolean search(String str, String str2) {
        return searchMap(str, str2, 1) != 1;
    }

    public static int searchMap(String str, String str2, int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 3;
            if (i3 < str.length()) {
                char charAt = str.charAt(i3);
                int i6 = i4 + 1;
                char charAt2 = str2.charAt(i4);
                if (charAt2 < ' ') {
                    int i7 = i6 + (charAt2 & 7);
                    int i8 = i7 + 1;
                    int charAt3 = str2.charAt(i7) - 1;
                    if (charAt3 < 1) {
                        break;
                    }
                    int i9 = i8 + 1;
                    int i10 = charAt3 - 1;
                    if (str2.charAt(i8) == charAt) {
                        i6 = i9 + (i10 * 4);
                    } else {
                        int binarySearch = binarySearch(charAt, str2, i9, i10);
                        if (binarySearch == -1) {
                            break;
                        }
                        int i11 = i9 + (binarySearch * 4);
                        i6 = 0;
                        do {
                            i6 = ((i6 * MAX_SYMBOL_COUNT) + str2.charAt(i11 + i5)) - 1;
                            i5--;
                        } while (i5 > 0);
                    }
                } else if (charAt2 != charAt) {
                    return i;
                }
                i4 = i6;
                i3++;
            } else {
                int i12 = i4 + 1;
                char charAt4 = str2.charAt(i4);
                if (charAt4 < ' ' && (charAt4 & 16) != 16) {
                    if ((charAt4 & '\b') == 8) {
                        return 0;
                    }
                    int i13 = charAt4 & 7;
                    i = 0;
                    while (i2 < i13) {
                        int i14 = i12 + 1;
                        char charAt5 = str2.charAt(i12);
                        if ((charAt5 & '@') == 64) {
                            int i15 = charAt5 & '?';
                            if (i2 == 5) {
                                if (i15 <= 3) {
                                    i |= i15 << (i2 * 6);
                                    i2++;
                                    i12 = i14;
                                } else {
                                    throw new ArithmeticException("overflow");
                                }
                            } else {
                                if (i2 == 6 && i15 != 0) {
                                    throw new ArithmeticException("overflow");
                                }
                                i |= i15 << (i2 * 6);
                                i2++;
                                i12 = i14;
                            }
                        } else {
                            throw new IllegalStateException(AnonymousClass001.A0O("Bad data at ", i14 - 1));
                        }
                    }
                }
            }
        }
        return i;
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 30) {
            z = true;
        }
        IS_OS_VERSION_CHAOTIC = z;
    }

    public static int binarySearch(char c, String str, int i, int i2) {
        int i3;
        int i4 = i2 - 1;
        int i5 = 0;
        while (true) {
            i3 = -1;
            if (i5 > i4) {
                break;
            }
            i3 = (i5 + i4) >> 1;
            char charAt = str.charAt((i3 * 4) + i);
            if (charAt == c) {
                break;
            }
            if (charAt > c) {
                i4 = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        return i3;
    }

    public static Logger getLogger() {
        return sLogger;
    }

    public static int searchMapStringify(Object obj, String str, int i) {
        String obj2;
        String obj3;
        int searchMap;
        Logger logger = sLogger;
        if (obj == null) {
            if (logger != null) {
                logger.onStringTreeLookup(null);
            }
            return i;
        }
        if (IS_OS_VERSION_CHAOTIC) {
            synchronized (StringTreeSet.class) {
                if (obj instanceof Class) {
                    obj3 = ((Class) obj).getName();
                } else {
                    obj3 = obj.toString();
                }
                if (logger != null) {
                    logger.onStringTreeLookup(obj3);
                }
                searchMap = searchMap(obj3, str, i);
            }
            return searchMap;
        }
        if (obj instanceof Class) {
            obj2 = ((Class) obj).getName();
        } else {
            obj2 = obj.toString();
        }
        if (logger != null) {
            logger.onStringTreeLookup(obj2);
        }
        return searchMap(obj2, str, i);
    }

    public static void setLogger(Logger logger) {
        sLogger = logger;
    }
}
