package androidx.media3.common.util;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC31171DnF;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC62862SUj;
import X.AbstractC63330She;
import X.AnonymousClass001;
import X.C2I7;
import X.C4B2;
import X.C8S8;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.tigon.tigonhuc.HucClient;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class Util {
    public static HashMap A00;
    public static final int A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Pattern A06;
    public static final byte[] A07;
    public static final int[] A08;
    public static final int[] A09;
    public static final int[] A0A;
    public static final String[] A0B;
    public static final String[] A0C;
    public static final Pattern A0D;
    public static final Pattern A0E;
    public static final Pattern A0F;

    public static int A00(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    public static long A03(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long A05(long j, int i) {
        return A08(RoundingMode.FLOOR, j, 1000000L, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (java.lang.Math.abs(r4 - r2) == 0.5d) goto L52;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x007b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A09(java.math.RoundingMode r13, long r14, long r16, long r18) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.A09(java.math.RoundingMode, long, long, long):long");
    }

    public static String A0B(byte[] bArr) {
        int length = bArr.length;
        StringBuilder A0q = AbstractC58318PtA.A0q(length * 2);
        for (int i = 0; i < length; i++) {
            A0q.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
            A0q.append(Character.forDigit(bArr[i] & 15, 16));
        }
        return A0q.toString();
    }

    public static boolean A0E(SparseArray sparseArray, SparseArray sparseArray2) {
        if (A01 >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!C2I7.A00(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        A01 = i;
        String str = Build.DEVICE;
        A02 = str;
        String str2 = Build.MANUFACTURER;
        A04 = str2;
        String str3 = Build.MODEL;
        A05 = str3;
        StringBuilder A11 = AbstractC166997dE.A11(str);
        A11.append(", ");
        AbstractC58320PtC.A1N(str3, ", ", str2, A11);
        A03 = AbstractC58320PtC.A12(", ", A11, i);
        A07 = new byte[0];
        A0E = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        A0F = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        A0D = Pattern.compile("%([A-Fa-f0-9]{2})");
        A06 = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        String[] strArr = new String[88];
        System.arraycopy(new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn"}, 0, strArr, 54, 27);
        System.arraycopy(new String[]{"zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"}, 0, strArr, 81, 7);
        A0B = strArr;
        A0C = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        A09 = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        A08 = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        A0A = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, AbstractC62862SUj.MAX_FACTORIAL, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, StringTreeSet.MAX_SYMBOL_COUNT, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};
    }

    public static int A01(SparseArray sparseArray) {
        if (A01 >= 31) {
            return sparseArray.contentHashCode();
        }
        int i = 17;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            i = (((i * 31) + sparseArray.keyAt(i2)) * 31) + AbstractC167017dG.A0M(sparseArray.valueAt(i2));
        }
        return i;
    }

    public static long A07(long j, long j2, long j3) {
        return A08(RoundingMode.FLOOR, j, j2, j3);
    }

    public static long A08(RoundingMode roundingMode, long j, long j2, long j3) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return AbstractC63330She.A03(roundingMode, j, AbstractC63330She.A03(RoundingMode.UNNECESSARY, j3, j2));
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return AbstractC63330She.A02(j, AbstractC63330She.A03(RoundingMode.UNNECESSARY, j2, j3));
        }
        if (j3 >= j && j3 % j == 0) {
            return AbstractC63330She.A03(roundingMode, j2, AbstractC63330She.A03(RoundingMode.UNNECESSARY, j3, j));
        }
        if (j3 < j && j % j3 == 0) {
            return AbstractC63330She.A02(j2, AbstractC63330She.A03(RoundingMode.UNNECESSARY, j, j3));
        }
        return A09(roundingMode, j, j2, j3);
    }

    public static String A0A(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String A002 = C4B2.A00(str);
        String str2 = A002.split("-", 2)[0];
        HashMap hashMap = A00;
        if (hashMap == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = A0B;
            hashMap = new HashMap(length + 88);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i = 0; i < 88; i += 2) {
                hashMap.put(strArr[i], strArr[i + 1]);
            }
            A00 = hashMap;
        }
        String A0h = AbstractC31171DnF.A0h(str2, hashMap);
        if (A0h != null) {
            A002 = AnonymousClass001.A0R(A0h, A002.substring(str2.length()));
            str2 = A0h;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return A002;
        }
        int i2 = 0;
        while (true) {
            String[] strArr2 = A0C;
            if (i2 >= 18) {
                return A002;
            }
            String str4 = strArr2[i2];
            if (A002.startsWith(str4)) {
                return AnonymousClass001.A0R(strArr2[i2 + 1], A002.substring(str4.length()));
            }
            i2 += 2;
        }
    }

    public static boolean A0F(Object obj, Object obj2) {
        if (obj == null) {
            return AbstractC25229BEm.A1Z(obj2);
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A02(long[] r4, long r5, boolean r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.A02(long[], long, boolean):int");
    }

    public static long A06(long j, long j2) {
        return A07(j, 1000000L, j2);
    }

    public static void A0C(long[] jArr, long j) {
        long A092;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long A032 = AbstractC63330She.A03(RoundingMode.UNNECESSARY, j, 1000000L);
            while (i < jArr.length) {
                jArr[i] = AbstractC63330She.A03(roundingMode, jArr[i], A032);
                i++;
            }
            return;
        }
        if (j < 1000000 && 1000000 % j == 0) {
            long A033 = AbstractC63330She.A03(RoundingMode.UNNECESSARY, 1000000L, j);
            while (i < jArr.length) {
                jArr[i] = AbstractC63330She.A02(jArr[i], A033);
                i++;
            }
            return;
        }
        while (i < jArr.length) {
            long j2 = jArr[i];
            if (j2 != 0) {
                if (j >= j2 && j % j2 == 0) {
                    A092 = AbstractC63330She.A03(roundingMode, 1000000L, AbstractC63330She.A03(RoundingMode.UNNECESSARY, j, j2));
                } else if (j < j2 && j2 % j == 0) {
                    A092 = AbstractC63330She.A02(1000000L, AbstractC63330She.A03(RoundingMode.UNNECESSARY, j2, j));
                } else {
                    A092 = A09(roundingMode, j2, 1000000L, j);
                }
                jArr[i] = A092;
            }
            i++;
        }
    }

    public static boolean A0D(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long A04(long j) {
        if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            return AbstractC166987dD.A0L(j);
        }
        return j;
    }
}
