package com.google.android.exoplayer2.util;

import X.AnonymousClass001;
import X.C4B2;
import X.C93194Fv;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.forker.Process;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class Util {
    public static final int A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final Pattern A05;
    public static final byte[] A06;
    public static final Pattern A07;
    public static final Pattern A08;
    public static final Pattern A09;

    public static int A01(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case Process.SIGTERM /* 15 */:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int A02(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int A03(int i, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 268435456) {
                        if (i != 536870912) {
                            if (i != 805306368) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            return i2 * 3;
                        }
                    }
                }
                return i2 * 4;
            }
            return i2;
        }
        return i2 * 2;
    }

    public static long A07(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static boolean A0G(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        A00 = i;
        String str = Build.DEVICE;
        A01 = str;
        String str2 = Build.MANUFACTURER;
        A03 = str2;
        String str3 = Build.MODEL;
        A04 = str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        A02 = sb.toString();
        A06 = new byte[0];
        A09 = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        A05 = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        A07 = Pattern.compile("%([A-Fa-f0-9]{2})");
        A08 = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
    }

    public static int A00(int i) {
        if (i == 12) {
            if (A00 >= 32) {
                return 743676;
            }
        } else {
            switch (i) {
                case 1:
                    return 4;
                case 2:
                    return 12;
                case 3:
                    return 28;
                case 4:
                    return 204;
                case 5:
                    return 220;
                case 6:
                    return 252;
                case 7:
                    return 1276;
                case 8:
                    return 6396;
            }
        }
        return 0;
    }

    public static long A05(float f, long j) {
        if (f != 1.0f) {
            return Math.round(j * f);
        }
        return j;
    }

    public static long A09(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (j * (j2 / j3));
    }

    public static long A0A(String str) {
        Matcher matcher = A09.matcher(str);
        if (matcher.matches()) {
            int i = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i = -i;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal(AnonymousClass001.A0R("0.", matcher.group(8))).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i != 0) {
                return timeInMillis - (i * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            }
            return timeInMillis;
        }
        throw C93194Fv.A00(AnonymousClass001.A0R("Invalid date/time format: ", str), null);
    }

    public static String A0B(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    public static String A0C(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return C4B2.A00(str);
        }
    }

    public static boolean A0I(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A04(long[] r4, long r5, boolean r7) {
        /*
            int r3 = java.util.Arrays.binarySearch(r4, r5)
            if (r3 >= 0) goto L11
            int r0 = r3 + 2
            int r1 = -r0
        L9:
            if (r7 == 0) goto L10
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
        L10:
            return r1
        L11:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L1c
            r1 = r4[r3]
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L1c
            goto L11
        L1c:
            int r1 = r3 + 1
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.Util.A04(long[], long, boolean):int");
    }

    public static String A0D(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 != 0) {
            int i4 = length - (i2 * 2);
            StringBuilder sb = new StringBuilder(i4);
            Matcher matcher = A07.matcher(str);
            while (i2 > 0 && matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                char parseInt = (char) Integer.parseInt(group, 16);
                sb.append((CharSequence) str, i, matcher.start());
                sb.append(parseInt);
                i = matcher.end();
                i2--;
            }
            if (i < length) {
                sb.append((CharSequence) str, i, length);
            }
            if (sb.length() != i4) {
                return null;
            }
            return sb.toString();
        }
        return str;
    }

    public static void A0E(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void A0F(long[] jArr, long j) {
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j2;
                i++;
            }
            return;
        }
        if (j < 1000000 && 1000000 % j == 0) {
            long j3 = 1000000 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
            return;
        }
        double d = 1000000.0d / j;
        while (i < jArr.length) {
            jArr[i] = (long) (jArr[i] * d);
            i++;
        }
    }

    public static boolean A0H(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long A06(long j) {
        if (j == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    public static long A08(long j) {
        if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            return j / 1000;
        }
        return j;
    }
}
