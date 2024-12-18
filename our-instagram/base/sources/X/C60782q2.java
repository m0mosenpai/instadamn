package X;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Pair;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.2q2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60782q2 {
    public static SimpleDateFormat A0J;
    public static SimpleDateFormat A0K;
    public static final Charset A0L;
    public static final Pattern A0M;
    public static final byte[] A0S;
    public static final C60812q5[][] A0n;
    public static final HashMap A0o;
    public static final HashSet A0p;
    public static final Pattern A0s;
    public static final Pattern A0t;
    public static final Pattern A0u;
    public static final byte[] A0v;
    public static final C60812q5[] A0w;
    public static final C60812q5[] A0x;
    public static final C60812q5[] A0y;
    public static final C60812q5[] A0z;
    public static final C60812q5[] A10;
    public static final C60812q5[] A11;
    public static final C60812q5[] A12;
    public static final C60812q5[] A13;
    public static final C60812q5[] A14;
    public static final C60812q5[] A15;
    public static final HashMap[] A16;
    public static final HashMap[] A17;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public AssetManager.AssetInputStream A06;
    public FileDescriptor A07;
    public String A08;
    public ByteOrder A09;
    public java.util.Set A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public byte[] A0F;
    public int A0G;
    public int A0H;
    public final HashMap[] A0I;
    public static final boolean A0N = android.util.Log.isLoggable("ExifInterface", 3);
    public static final List A0r = Arrays.asList(1, 6, 3, 8);
    public static final List A0q = Arrays.asList(2, 7, 4, 5);
    public static final int[] A0k = {8, 8, 8};
    public static final int[] A0j = {8};
    public static final byte[] A0T = {-1, -40, -1};
    public static final byte[] A0R = {102, 116, 121, 112};
    public static final byte[] A0Q = {109, 105, 102, 49};
    public static final byte[] A0P = {104, 101, 105, 99};
    public static final byte[] A0U = {79, 76, 89, 77, 80, 0};
    public static final byte[] A0V = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] A0Z = {-119, 80, 78, 71, DalvikInternals.IOPRIO_CLASS_SHIFT, 10, 26, 10};
    public static final byte[] A0W = {101, 88, 73, 102};
    public static final byte[] A0Y = {73, 72, 68, 82};
    public static final byte[] A0X = {73, 69, 78, 68};
    public static final byte[] A0g = {82, 73, 70, 70};
    public static final byte[] A0h = {87, 69, 66, 80};
    public static final byte[] A0c = {69, 88, 73, 70};
    public static final byte[] A0i = {-99, 1, 42};
    public static final byte[] A0f = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] A0e = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] A0d = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] A0a = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] A0b = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] A0m = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] A0l = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] A0O = {65, 83, 67, 73, 73, 0, 0, 0};

    private void A05() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.A0I;
            if (i < 10) {
                HashMap hashMap = hashMapArr[i];
                hashMap.size();
                for (Map.Entry entry : hashMap.entrySet()) {
                    C61012qP c61012qP = (C61012qP) entry.getValue();
                    entry.getKey();
                    c61012qP.toString();
                    c61012qP.A05(this.A09);
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void A06() {
        A07(0, 5);
        A07(0, 4);
        A07(5, 4);
        HashMap[] hashMapArr = this.A0I;
        Object obj = hashMapArr[1].get("PixelXDimension");
        Object obj2 = hashMapArr[1].get("PixelYDimension");
        if (obj != null && obj2 != null) {
            hashMapArr[0].put("ImageWidth", obj);
            hashMapArr[0].put("ImageLength", obj2);
        }
        if (hashMapArr[4].isEmpty() && A0L(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        A0L(hashMapArr[4]);
        A08(0, "ThumbnailOrientation", "Orientation");
        A08(0, "ThumbnailImageLength", "ImageLength");
        A08(0, "ThumbnailImageWidth", "ImageWidth");
        A08(5, "ThumbnailOrientation", "Orientation");
        A08(5, "ThumbnailImageLength", "ImageLength");
        A08(5, "ThumbnailImageWidth", "ImageWidth");
        A08(4, "Orientation", "ThumbnailOrientation");
        A08(4, "ImageLength", "ThumbnailImageLength");
        A08(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0208 A[Catch: IOException | UnsupportedOperationException -> 0x0457, IOException | UnsupportedOperationException -> 0x0457, all -> 0x0472, TryCatch #10 {IOException | UnsupportedOperationException -> 0x0457, blocks: (B:3:0x0002, B:6:0x0013, B:7:0x0028, B:9:0x002d, B:13:0x0033, B:14:0x003e, B:16:0x0041, B:48:0x00b8, B:48:0x00b8, B:49:0x014c, B:49:0x014c, B:57:0x015d, B:57:0x015d, B:59:0x016a, B:59:0x016a, B:61:0x0178, B:61:0x0178, B:62:0x017b, B:62:0x017b, B:71:0x0189, B:71:0x0189, B:73:0x0199, B:73:0x0199, B:76:0x01d0, B:76:0x01d0, B:77:0x01d3, B:77:0x01d3, B:80:0x01eb, B:80:0x01eb, B:81:0x01fa, B:81:0x01fa, B:83:0x0208, B:83:0x0208, B:85:0x0212, B:85:0x0212, B:87:0x0216, B:87:0x0216, B:89:0x021d, B:89:0x021d, B:91:0x0224, B:91:0x0224, B:93:0x022c, B:93:0x022c, B:94:0x0230, B:94:0x0230, B:95:0x0254, B:95:0x0254, B:96:0x01c8, B:96:0x01c8, B:101:0x0269, B:101:0x0269, B:103:0x0278, B:103:0x0278, B:104:0x0286, B:104:0x0286, B:107:0x029b, B:107:0x029b, B:108:0x02a2, B:108:0x02a2, B:109:0x02a7, B:109:0x02a7, B:240:0x0456, B:240:0x0456, B:111:0x02b0, B:111:0x02b0, B:113:0x02bc, B:113:0x02bc, B:116:0x02c5, B:116:0x02c5, B:118:0x02ce, B:118:0x02ce, B:120:0x02e0, B:120:0x02e0, B:123:0x02e8, B:123:0x02e8, B:135:0x0356, B:135:0x0356, B:125:0x02f0, B:125:0x02f0, B:127:0x02f8, B:127:0x02f8, B:131:0x0300, B:131:0x0300, B:133:0x031b, B:133:0x031b, B:134:0x0334, B:134:0x0334, B:129:0x032d, B:129:0x032d, B:137:0x0357, B:137:0x0357, B:141:0x0364, B:141:0x0364, B:143:0x03b5, B:143:0x03b5, B:147:0x03c1, B:147:0x03c1, B:145:0x03ec, B:145:0x03ec, B:151:0x03f6, B:151:0x03f6, B:153:0x040d, B:153:0x040d, B:168:0x0422, B:168:0x0422, B:155:0x0435, B:155:0x0435, B:157:0x043a, B:157:0x043a, B:158:0x043c, B:158:0x043c, B:162:0x040a, B:162:0x040a, B:169:0x044a, B:169:0x044a, B:164:0x0442, B:164:0x0442, B:165:0x0449, B:165:0x0449, B:182:0x00bf, B:182:0x00bf, B:245:0x00c4, B:245:0x00c4, B:243:0x00c9, B:243:0x00c9, B:192:0x00e7, B:192:0x00e7, B:239:0x0453, B:239:0x0453, B:203:0x0105, B:203:0x0105, B:207:0x010e, B:207:0x010e, B:209:0x0114, B:209:0x0114, B:213:0x011d, B:213:0x011d, B:215:0x0122, B:215:0x0122, B:217:0x0128, B:217:0x0128, B:222:0x012c, B:222:0x012c, B:224:0x0130, B:224:0x0130, B:226:0x013a, B:226:0x013a, B:18:0x0048, B:11:0x004b), top: B:2:0x0002, outer: #7 }] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.4cS, X.2qM] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.4cS, X.2qM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0H(java.io.InputStream r19) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60782q2.A0H(java.io.InputStream):void");
    }

    private void A0J(String str) {
        int i = 0;
        do {
            this.A0I[i].remove(str);
            i++;
        } while (i < 10);
    }

    public static double A00(String str, String str2) {
        try {
            String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static Pair A01(String str) {
        int intValue;
        int i;
        Integer valueOf;
        if (str.contains(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) {
            String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, -1);
            Pair A01 = A01(split[0]);
            if (((Number) A01.first).intValue() != 2) {
                for (int i2 = 1; i2 < split.length; i2++) {
                    Pair A012 = A01(split[i2]);
                    Object obj = A012.first;
                    if (!obj.equals(A01.first) && !A012.second.equals(A01.first)) {
                        intValue = -1;
                    } else {
                        intValue = ((Number) A01.first).intValue();
                    }
                    if (((Number) A01.second).intValue() != -1 && (obj.equals(A01.second) || A012.second.equals(A01.second))) {
                        i = ((Number) A01.second).intValue();
                    } else {
                        i = -1;
                    }
                    if (intValue == -1 && i == -1) {
                        return new Pair(2, -1);
                    }
                    if (intValue == -1) {
                        valueOf = Integer.valueOf(i);
                    } else if (i == -1) {
                        valueOf = Integer.valueOf(intValue);
                    }
                    A01 = new Pair(valueOf, -1);
                }
            }
            return A01;
        }
        if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            }
            return new Pair(2, -1);
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong >= 0 && parseLong <= 65535) {
                return new Pair(3, 4);
            }
            if (parseLong < 0) {
                return new Pair(9, -1);
            }
            return new Pair(4, -1);
        } catch (NumberFormatException unused) {
            Double.parseDouble(str);
            return new Pair(12, -1);
        }
    }

    public static C61012qP A02(C60782q2 c60782q2, String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i = 0;
        do {
            C61012qP c61012qP = (C61012qP) c60782q2.A0I[i].get(str);
            if (c61012qP == null) {
                i++;
            } else {
                return c61012qP;
            }
        } while (i < 10);
        return null;
    }

    private void A04() {
        String A0N2 = A0N("DateTimeOriginal");
        if (A0N2 != null && A0N("DateTime") == null) {
            HashMap hashMap = this.A0I[0];
            byte[] bytes = AnonymousClass001.A0C(A0N2, (char) 0).getBytes(A0L);
            hashMap.put("DateTime", new C61012qP(-1L, bytes, 2, bytes.length));
        }
        if (A0N("ImageWidth") == null) {
            this.A0I[0].put("ImageWidth", C61012qP.A01(this.A09, new long[]{0}));
        }
        if (A0N("ImageLength") == null) {
            this.A0I[0].put("ImageLength", C61012qP.A01(this.A09, new long[]{0}));
        }
        if (A0N("Orientation") == null) {
            this.A0I[0].put("Orientation", C61012qP.A01(this.A09, new long[]{0}));
        }
        if (A0N("LightSource") == null) {
            this.A0I[1].put("LightSource", C61012qP.A01(this.A09, new long[]{0}));
        }
    }

    private void A07(int i, int i2) {
        HashMap[] hashMapArr = this.A0I;
        HashMap hashMap = hashMapArr[i];
        if (!hashMap.isEmpty() && !hashMapArr[i2].isEmpty()) {
            C61012qP c61012qP = (C61012qP) hashMap.get("ImageLength");
            C61012qP c61012qP2 = (C61012qP) hashMapArr[i].get("ImageWidth");
            C61012qP c61012qP3 = (C61012qP) hashMapArr[i2].get("ImageLength");
            C61012qP c61012qP4 = (C61012qP) hashMapArr[i2].get("ImageWidth");
            if (c61012qP != null && c61012qP2 != null && c61012qP3 != null && c61012qP4 != null) {
                int A03 = c61012qP.A03(this.A09);
                int A032 = c61012qP2.A03(this.A09);
                int A033 = c61012qP3.A03(this.A09);
                int A034 = c61012qP4.A03(this.A09);
                if (A03 < A033 && A032 < A034) {
                    HashMap hashMap2 = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap2;
                }
            }
        }
    }

    private void A08(int i, String str, String str2) {
        HashMap[] hashMapArr = this.A0I;
        HashMap hashMap = hashMapArr[i];
        if (!hashMap.isEmpty() && hashMap.get(str) != null) {
            HashMap hashMap2 = hashMapArr[i];
            hashMap2.put(str2, hashMap2.get(str));
            hashMapArr[i].remove(str);
        }
    }

    private void A0A(C60982qM c60982qM) {
        int i;
        int i2;
        long[] jArr;
        long[] jArr2;
        String str;
        int length;
        int length2;
        C61012qP c61012qP;
        HashMap hashMap = this.A0I[4];
        C61012qP c61012qP2 = (C61012qP) hashMap.get("Compression");
        if (c61012qP2 != null) {
            int A03 = c61012qP2.A03(this.A09);
            this.A03 = A03;
            if (A03 != 1) {
                if (A03 != 6) {
                    if (A03 != 7) {
                        return;
                    }
                }
            }
            C61012qP c61012qP3 = (C61012qP) hashMap.get("BitsPerSample");
            if (c61012qP3 == null) {
                return;
            }
            int[] iArr = (int[]) c61012qP3.A04(this.A09);
            int[] iArr2 = A0k;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.A00 != 3 || (c61012qP = (C61012qP) hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int A032 = c61012qP.A03(this.A09);
                if (A032 == 1) {
                    if (!Arrays.equals(iArr, A0j)) {
                        return;
                    }
                } else if (A032 != 6 || !Arrays.equals(iArr, iArr2)) {
                    return;
                }
            }
            C61012qP c61012qP4 = (C61012qP) hashMap.get("StripOffsets");
            C61012qP c61012qP5 = (C61012qP) hashMap.get("StripByteCounts");
            if (c61012qP4 == null || c61012qP5 == null) {
                return;
            }
            Object A04 = c61012qP4.A04(this.A09);
            if (A04 instanceof int[]) {
                int length3 = ((int[]) A04).length;
                jArr = new long[length3];
                for (int i3 = 0; i3 < length3; i3++) {
                    jArr[i3] = r4[i3];
                }
            } else if (A04 instanceof long[]) {
                jArr = (long[]) A04;
            } else {
                jArr = null;
            }
            Object A042 = c61012qP5.A04(this.A09);
            if (A042 instanceof int[]) {
                int length4 = ((int[]) A042).length;
                jArr2 = new long[length4];
                for (int i4 = 0; i4 < length4; i4++) {
                    jArr2[i4] = r4[i4];
                }
            } else if (A042 instanceof long[]) {
                jArr2 = (long[]) A042;
            } else {
                jArr2 = null;
            }
            if (jArr != null && (length = jArr.length) != 0) {
                if (jArr2 != null && (length2 = jArr2.length) != 0) {
                    if (length != length2) {
                        str = "stripOffsets and stripByteCounts should have same length.";
                    } else {
                        long j = 0;
                        int i5 = 0;
                        do {
                            j += jArr2[i5];
                            i5++;
                        } while (i5 < length2);
                        i = (int) j;
                        byte[] bArr = new byte[i];
                        this.A0B = true;
                        this.A0D = true;
                        this.A0C = true;
                        int i6 = 0;
                        int i7 = 0;
                        int i8 = 0;
                        do {
                            int i9 = (int) jArr[i6];
                            int i10 = (int) jArr2[i6];
                            if (i6 < length - 1 && i9 + i10 != jArr[i6 + 1]) {
                                this.A0B = false;
                            }
                            int i11 = i9 - i7;
                            if (i11 < 0) {
                                return;
                            }
                            try {
                                c60982qM.A00(i11);
                                int i12 = i7 + i11;
                                byte[] bArr2 = new byte[i10];
                                c60982qM.readFully(bArr2);
                                i7 = i12 + i10;
                                System.arraycopy(bArr2, 0, bArr, i8, i10);
                                i8 += i10;
                                i6++;
                            } catch (EOFException unused) {
                                return;
                            }
                        } while (i6 < length);
                        this.A0F = bArr;
                        if (!this.A0B) {
                            return;
                        }
                        i2 = (int) jArr[0];
                        this.A05 = i2;
                        this.A04 = i;
                    }
                } else {
                    str = "stripByteCounts should not be null or have zero length.";
                }
            } else {
                str = "stripOffsets should not be null or have zero length.";
            }
            android.util.Log.w("ExifInterface", str);
            return;
        }
        this.A03 = 6;
        C61012qP c61012qP6 = (C61012qP) hashMap.get("JPEGInterchangeFormat");
        C61012qP c61012qP7 = (C61012qP) hashMap.get("JPEGInterchangeFormatLength");
        if (c61012qP6 == null || c61012qP7 == null) {
            return;
        }
        i2 = c61012qP6.A03(this.A09);
        i = c61012qP7.A03(this.A09);
        if (this.A00 == 7) {
            i2 += this.A02;
        }
        if (i2 <= 0 || i <= 0) {
            return;
        }
        this.A0C = true;
        if (this.A08 == null && this.A06 == null && this.A07 == null) {
            byte[] bArr3 = new byte[i];
            c60982qM.A00(i2);
            c60982qM.readFully(bArr3);
            this.A0F = bArr3;
        }
        this.A05 = i2;
        this.A04 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0145, code lost:
    
        r27.A02 = r26.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0149, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0049. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x004c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0B(X.C60982qM r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60782q2.A0B(X.2qM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C(X.C61007Rdb r22) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60782q2.A0C(X.Rdb):void");
    }

    private void A0D(C99054cS c99054cS) {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new Q2W(c99054cS, this));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                boolean equals = "yes".equals(extractMetadata3);
                String str3 = null;
                if (equals) {
                    str3 = mediaMetadataRetriever.extractMetadata(29);
                    str = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str3 = mediaMetadataRetriever.extractMetadata(18);
                    str = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                }
                if (str3 != null) {
                    this.A0I[0].put("ImageWidth", C61012qP.A00(this.A09, new int[]{Integer.parseInt(str3)}));
                }
                if (str != null) {
                    this.A0I[0].put("ImageLength", C61012qP.A00(this.A09, new int[]{Integer.parseInt(str)}));
                }
                if (str2 != null) {
                    int i = 1;
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt != 90) {
                        if (parseInt != 180) {
                            if (parseInt == 270) {
                                i = 8;
                            }
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 6;
                    }
                    this.A0I[0].put("Orientation", C61012qP.A00(this.A09, new int[]{i}));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 > 6) {
                        c99054cS.A01(parseInt2);
                        byte[] bArr = new byte[6];
                        c99054cS.readFully(bArr);
                        int i2 = parseInt2 + 6;
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, A0S)) {
                            byte[] bArr2 = new byte[i3];
                            c99054cS.readFully(bArr2);
                            this.A01 = i2;
                            A0K(bArr2, 0);
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    }
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0075, code lost:
    
        if (r7 != 3) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023c, code lost:
    
        if (r7 == 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r1 != 4) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0232, code lost:
    
        if (r4 == 9) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0234, code lost:
    
        if (r1 == 9) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0238, code lost:
    
        if (r7 == 8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cf, code lost:
    
        if (r33.A01 != r2) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0F(X.C99054cS r33, int r34) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60782q2.A0F(X.4cS, int):void");
    }

    private void A0G(C99054cS c99054cS, int i) {
        StringBuilder sb;
        String arrays;
        C61012qP A00;
        C61012qP A002;
        HashMap[] hashMapArr = this.A0I;
        C61012qP c61012qP = (C61012qP) hashMapArr[i].get("DefaultCropSize");
        C61012qP c61012qP2 = (C61012qP) hashMapArr[i].get("SensorTopBorder");
        C61012qP c61012qP3 = (C61012qP) hashMapArr[i].get("SensorLeftBorder");
        C61012qP c61012qP4 = (C61012qP) hashMapArr[i].get("SensorBottomBorder");
        C61012qP c61012qP5 = (C61012qP) hashMapArr[i].get("SensorRightBorder");
        if (c61012qP != null) {
            int i2 = c61012qP.A00;
            Object A04 = c61012qP.A04(this.A09);
            if (i2 == 5) {
                Q0Y[] q0yArr = (Q0Y[]) A04;
                if (q0yArr != null && q0yArr.length == 2) {
                    A00 = C61012qP.A02(this.A09, new Q0Y[]{q0yArr[0]});
                    A002 = C61012qP.A02(this.A09, new Q0Y[]{q0yArr[1]});
                    hashMapArr[i].put("ImageWidth", A00);
                    hashMapArr[i].put("ImageLength", A002);
                    return;
                }
                sb = new StringBuilder();
                sb.append("Invalid crop size values. cropSize=");
                arrays = Arrays.toString(q0yArr);
                sb.append(arrays);
                android.util.Log.w("ExifInterface", sb.toString());
                return;
            }
            int[] iArr = (int[]) A04;
            if (iArr != null && iArr.length == 2) {
                A00 = C61012qP.A00(this.A09, new int[]{iArr[0]});
                A002 = C61012qP.A00(this.A09, new int[]{iArr[1]});
                hashMapArr[i].put("ImageWidth", A00);
                hashMapArr[i].put("ImageLength", A002);
                return;
            }
            sb = new StringBuilder();
            sb.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(iArr);
            sb.append(arrays);
            android.util.Log.w("ExifInterface", sb.toString());
            return;
        }
        if (c61012qP2 != null && c61012qP3 != null && c61012qP4 != null && c61012qP5 != null) {
            int A03 = c61012qP2.A03(this.A09);
            int A032 = c61012qP4.A03(this.A09);
            int A033 = c61012qP5.A03(this.A09);
            int A034 = c61012qP3.A03(this.A09);
            if (A032 <= A03 || A033 <= A034) {
                return;
            }
            C61012qP A003 = C61012qP.A00(this.A09, new int[]{A032 - A03});
            C61012qP A004 = C61012qP.A00(this.A09, new int[]{A033 - A034});
            hashMapArr[i].put("ImageLength", A003);
            hashMapArr[i].put("ImageWidth", A004);
            return;
        }
        Object obj = hashMapArr[i].get("ImageLength");
        Object obj2 = hashMapArr[i].get("ImageWidth");
        if (obj != null && obj2 != null) {
            return;
        }
        C61012qP c61012qP6 = (C61012qP) hashMapArr[i].get("JPEGInterchangeFormat");
        Object obj3 = hashMapArr[i].get("JPEGInterchangeFormatLength");
        if (c61012qP6 == null || obj3 == null) {
            return;
        }
        int A035 = c61012qP6.A03(this.A09);
        int A036 = c61012qP6.A03(this.A09);
        c99054cS.A01(A035);
        byte[] bArr = new byte[A036];
        c99054cS.readFully(bArr);
        A0B(new C60982qM(bArr), A035, i);
    }

    private void A0I(String str) {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.A06 = null;
            this.A08 = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        Os.lseek(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                        this.A07 = fileInputStream2.getFD();
                    } catch (Exception unused) {
                        this.A07 = null;
                    }
                    A0H(fileInputStream2);
                    AbstractC61052qT.A00(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    AbstractC61052qT.A00(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.4cS, X.2qM] */
    private void A0K(byte[] bArr, int i) {
        ?? c60982qM = new C60982qM(bArr);
        c60982qM.A04.mark(Integer.MAX_VALUE);
        A09(c60982qM);
        A0F(c60982qM, i);
    }

    private boolean A0L(HashMap hashMap) {
        C61012qP c61012qP = (C61012qP) hashMap.get("ImageLength");
        C61012qP c61012qP2 = (C61012qP) hashMap.get("ImageWidth");
        if (c61012qP != null && c61012qP2 != null) {
            int A03 = c61012qP.A03(this.A09);
            int A032 = c61012qP2.A03(this.A09);
            if (A03 <= 512 && A032 <= 512) {
                return true;
            }
        }
        return false;
    }

    public final String A0N(String str) {
        double d;
        StringBuilder sb;
        if (str != null) {
            C61012qP A02 = A02(this, str);
            if (A02 != null) {
                if (!A0p.contains(str)) {
                    return A02.A05(this.A09);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i = A02.A00;
                    if (i != 5 && i != 10) {
                        sb = new StringBuilder();
                        sb.append("GPS Timestamp format is not rational. format=");
                        sb.append(i);
                    } else {
                        Q0Y[] q0yArr = (Q0Y[]) A02.A04(this.A09);
                        if (q0yArr != null && q0yArr.length == 3) {
                            Q0Y q0y = q0yArr[0];
                            Integer valueOf = Integer.valueOf((int) (((float) q0y.A01) / ((float) q0y.A00)));
                            Q0Y q0y2 = q0yArr[1];
                            Integer valueOf2 = Integer.valueOf((int) (((float) q0y2.A01) / ((float) q0y2.A00)));
                            Q0Y q0y3 = q0yArr[2];
                            return String.format(AbstractC43591JPw.A00(100), valueOf, valueOf2, Integer.valueOf((int) (((float) q0y3.A01) / ((float) q0y3.A00))));
                        }
                        sb = new StringBuilder();
                        sb.append("Invalid GPS Timestamp array. array=");
                        sb.append(Arrays.toString(q0yArr));
                    }
                    android.util.Log.w("ExifInterface", sb.toString());
                    return null;
                }
                try {
                    Object A04 = A02.A04(this.A09);
                    if (A04 != null) {
                        if (A04 instanceof String) {
                            d = Double.parseDouble((String) A04);
                        } else if (A04 instanceof long[]) {
                            long[] jArr = (long[]) A04;
                            if (jArr.length == 1) {
                                d = jArr[0];
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else if (A04 instanceof int[]) {
                            int[] iArr = (int[]) A04;
                            if (iArr.length == 1) {
                                d = iArr[0];
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else if (A04 instanceof double[]) {
                            double[] dArr = (double[]) A04;
                            if (dArr.length == 1) {
                                d = dArr[0];
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else if (A04 instanceof Q0Y[]) {
                            Q0Y[] q0yArr2 = (Q0Y[]) A04;
                            if (q0yArr2.length == 1) {
                                Q0Y q0y4 = q0yArr2[0];
                                d = q0y4.A01 / q0y4.A00;
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else {
                            throw new NumberFormatException(AbstractC111324zv.A00(1562));
                        }
                        return Double.toString(d);
                    }
                    throw new NumberFormatException(AbstractC111324zv.A00(1698));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:265:0x047f A[Catch: all -> 0x049b, Exception -> 0x049f, TryCatch #23 {Exception -> 0x049f, all -> 0x049b, blocks: (B:263:0x047b, B:265:0x047f, B:266:0x048f, B:270:0x0495), top: B:262:0x047b }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0495 A[Catch: all -> 0x049b, Exception -> 0x049f, TRY_LEAVE, TryCatch #23 {Exception -> 0x049f, all -> 0x049b, blocks: (B:263:0x047b, B:265:0x047f, B:266:0x048f, B:270:0x0495), top: B:262:0x047b }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04de  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O() {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60782q2.A0O():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0044, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x005f, code lost:
    
        if (r2 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014f, code lost:
    
        if (r7 != 2) goto L116;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x0144. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [long, double] */
    /* JADX WARN: Type inference failed for: r0v72, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0P(java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60782q2.A0P(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] A0Q() {
        /*
            r7 = this;
            boolean r0 = r7.A0C
            r6 = 0
            if (r0 != 0) goto L6
            return r6
        L6:
            byte[] r0 = r7.A0F
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r4 = r7.A06     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L80
            if (r4 == 0) goto L1f
            boolean r0 = r4.markSupported()     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L6c
            if (r0 == 0) goto L19
            r4.reset()     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L6c
            goto L28
        L19:
            X.AbstractC61052qT.A00(r4)
            return r6
        L1d:
            r5 = r6
            goto L84
        L1f:
            java.lang.String r0 = r7.A08     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L80
            if (r0 == 0) goto L2a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L80
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L80
        L28:
            r5 = r6
            goto L3c
        L2a:
            java.io.FileDescriptor r0 = r7.A07     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L80
            java.io.FileDescriptor r5 = android.system.Os.dup(r0)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L80
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L83
            r0 = 0
            android.system.Os.lseek(r5, r0, r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L83
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L83
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L83
        L3c:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L84
            X.2qM r3 = new X.2qM     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L84
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L84
            int r1 = r7.A05     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L84
            int r0 = r7.A01     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L84
            int r1 = r1 + r0
            r3.A00(r1)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L84
            int r0 = r7.A04     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L84
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L84
            r3.readFully(r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L84
            r7.A0F = r2     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L84
            X.AbstractC61052qT.A00(r4)
            if (r5 == 0) goto L64
            java.lang.String r1 = "ExifInterfaceUtils"
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L5f
            return r2
        L5f:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L64:
            return r2
        L65:
            r2 = move-exception
            goto L6e
        L67:
            r2 = move-exception
            goto L6f
        L69:
            r2 = move-exception
            r5 = r6
            goto L6f
        L6c:
            r2 = move-exception
            r5 = r6
        L6e:
            r6 = r4
        L6f:
            X.AbstractC61052qT.A00(r6)
            if (r5 == 0) goto L7f
            java.lang.String r1 = "ExifInterfaceUtils"
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L7a
            throw r2
        L7a:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L7f:
            throw r2
        L80:
            r4 = r6
            r5 = r6
            goto L84
        L83:
            r4 = r6
        L84:
            X.AbstractC61052qT.A00(r4)
            if (r5 == 0) goto L94
            java.lang.String r1 = "ExifInterfaceUtils"
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L8f
            return r6
        L8f:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L94:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60782q2.A0Q():byte[]");
    }

    public C60782q2(FileDescriptor fileDescriptor) {
        FileInputStream fileInputStream;
        this.A0I = new HashMap[10];
        this.A0A = new HashSet(10);
        this.A09 = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.A06 = null;
            this.A08 = null;
            boolean z = false;
            try {
                Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                this.A07 = fileDescriptor;
                try {
                    fileDescriptor = Os.dup(fileDescriptor);
                    z = true;
                } catch (Exception e) {
                    throw new IOException("Failed to duplicate file descriptor", e);
                }
            } catch (Exception unused) {
                this.A07 = null;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    A0H(fileInputStream);
                    AbstractC61052qT.A00(fileInputStream);
                    if (z) {
                        try {
                            Os.close(fileDescriptor);
                        } catch (Exception unused2) {
                            android.util.Log.e("ExifInterfaceUtils", "Error closing fd.");
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    AbstractC61052qT.A00(fileInputStream);
                    if (z) {
                        try {
                            Os.close(fileDescriptor);
                            throw th;
                        } catch (Exception unused3) {
                            android.util.Log.e("ExifInterfaceUtils", "Error closing fd.");
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public static ByteOrder A03(C60982qM c60982qM) {
        short readShort = c60982qM.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException(AnonymousClass001.A0R("Invalid byte order: ", Integer.toHexString(readShort)));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void A09(C60982qM c60982qM) {
        ByteOrder A03 = A03(c60982qM);
        this.A09 = A03;
        c60982qM.A02 = A03;
        int readUnsignedShort = c60982qM.readUnsignedShort();
        int i = this.A00;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException(AnonymousClass001.A0R(AbstractC111324zv.A00(1674), Integer.toHexString(readUnsignedShort)));
        }
        int readInt = c60982qM.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                c60982qM.A00(i2);
                return;
            }
            return;
        }
        throw new IOException(AnonymousClass001.A0O(AbstractC111324zv.A00(1671), readInt));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.4cS, X.2qM] */
    private void A0E(C99054cS c99054cS) {
        A09(c99054cS);
        A0F(c99054cS, 0);
        A0G(c99054cS, 0);
        A0G(c99054cS, 5);
        A0G(c99054cS, 4);
        A06();
        if (this.A00 == 8) {
            HashMap[] hashMapArr = this.A0I;
            C61012qP c61012qP = (C61012qP) hashMapArr[1].get("MakerNote");
            if (c61012qP != null) {
                ?? c60982qM = new C60982qM(c61012qP.A03);
                c60982qM.A04.mark(Integer.MAX_VALUE);
                c60982qM.A02 = this.A09;
                c60982qM.A00(6);
                A0F(c60982qM, 9);
                Object obj = hashMapArr[9].get("ColorSpace");
                if (obj != null) {
                    hashMapArr[1].put("ColorSpace", obj);
                }
            }
        }
    }

    public final int A0M(String str, int i) {
        C61012qP A02 = A02(this, str);
        if (A02 != null) {
            try {
                i = A02.A03(this.A09);
                return i;
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    static {
        C60812q5[] c60812q5Arr = new C60812q5[42];
        System.arraycopy(new C60812q5[]{new C60812q5("NewSubfileType", 254, 4), new C60812q5("SubfileType", 255, 4), new C60812q5("ImageWidth", 256, 3, 4), new C60812q5("ImageLength", 257, 3, 4), new C60812q5("BitsPerSample", 258, 3), new C60812q5("Compression", 259, 3), new C60812q5("PhotometricInterpretation", 262, 3), new C60812q5("ImageDescription", 270, 2), new C60812q5("Make", 271, 2), new C60812q5("Model", 272, 2), new C60812q5("StripOffsets", 273, 3, 4), new C60812q5("Orientation", 274, 3), new C60812q5("SamplesPerPixel", 277, 3), new C60812q5("RowsPerStrip", 278, 3, 4), new C60812q5("StripByteCounts", 279, 3, 4), new C60812q5("XResolution", 282, 5), new C60812q5("YResolution", 283, 5), new C60812q5("PlanarConfiguration", 284, 3), new C60812q5("ResolutionUnit", 296, 3), new C60812q5("TransferFunction", 301, 3), new C60812q5("Software", 305, 2), new C60812q5("DateTime", 306, 2), new C60812q5("Artist", 315, 2), new C60812q5("WhitePoint", 318, 5), new C60812q5("PrimaryChromaticities", 319, 5), new C60812q5("SubIFDPointer", 330, 4), new C60812q5("JPEGInterchangeFormat", 513, 4)}, 0, c60812q5Arr, 0, 27);
        System.arraycopy(new C60812q5[]{new C60812q5("JPEGInterchangeFormatLength", 514, 4), new C60812q5("YCbCrCoefficients", 529, 5), new C60812q5("YCbCrSubSampling", 530, 3), new C60812q5("YCbCrPositioning", 531, 3), new C60812q5("ReferenceBlackWhite", 532, 5), new C60812q5("Copyright", 33432, 2), new C60812q5("ExifIFDPointer", 34665, 4), new C60812q5("GPSInfoIFDPointer", 34853, 4), new C60812q5("SensorTopBorder", 4, 4), new C60812q5("SensorLeftBorder", 5, 4), new C60812q5("SensorBottomBorder", 6, 4), new C60812q5("SensorRightBorder", 7, 4), new C60812q5("ISO", 23, 3), new C60812q5("JpgFromRaw", 46, 7), new C60812q5("Xmp", 700, 1)}, 0, c60812q5Arr, 27, 15);
        A11 = c60812q5Arr;
        C60812q5[] c60812q5Arr2 = new C60812q5[74];
        System.arraycopy(new C60812q5[]{new C60812q5("ExposureTime", 33434, 5), new C60812q5("FNumber", 33437, 5), new C60812q5("ExposureProgram", 34850, 3), new C60812q5("SpectralSensitivity", 34852, 2), new C60812q5("PhotographicSensitivity", 34855, 3), new C60812q5("OECF", 34856, 7), new C60812q5("SensitivityType", 34864, 3), new C60812q5("StandardOutputSensitivity", 34865, 4), new C60812q5("RecommendedExposureIndex", 34866, 4), new C60812q5("ISOSpeed", 34867, 4), new C60812q5("ISOSpeedLatitudeyyy", 34868, 4), new C60812q5("ISOSpeedLatitudezzz", 34869, 4), new C60812q5("ExifVersion", 36864, 2), new C60812q5("DateTimeOriginal", 36867, 2), new C60812q5("DateTimeDigitized", 36868, 2), new C60812q5("OffsetTime", 36880, 2), new C60812q5("OffsetTimeOriginal", 36881, 2), new C60812q5("OffsetTimeDigitized", 36882, 2), new C60812q5("ComponentsConfiguration", 37121, 7), new C60812q5("CompressedBitsPerPixel", 37122, 5), new C60812q5("ShutterSpeedValue", 37377, 10), new C60812q5("ApertureValue", 37378, 5), new C60812q5("BrightnessValue", 37379, 10), new C60812q5("ExposureBiasValue", 37380, 10), new C60812q5("MaxApertureValue", 37381, 5), new C60812q5("SubjectDistance", 37382, 5), new C60812q5("MeteringMode", 37383, 3)}, 0, c60812q5Arr2, 0, 27);
        System.arraycopy(new C60812q5[]{new C60812q5("LightSource", 37384, 3), new C60812q5("Flash", 37385, 3), new C60812q5("FocalLength", 37386, 5), new C60812q5("SubjectArea", 37396, 3), new C60812q5("MakerNote", 37500, 7), new C60812q5("UserComment", 37510, 7), new C60812q5("SubSecTime", 37520, 2), new C60812q5("SubSecTimeOriginal", 37521, 2), new C60812q5("SubSecTimeDigitized", 37522, 2), new C60812q5("FlashpixVersion", 40960, 7), new C60812q5("ColorSpace", 40961, 3), new C60812q5("PixelXDimension", 40962, 3, 4), new C60812q5("PixelYDimension", 40963, 3, 4), new C60812q5("RelatedSoundFile", 40964, 2), new C60812q5("InteroperabilityIFDPointer", 40965, 4), new C60812q5("FlashEnergy", 41483, 5), new C60812q5("SpatialFrequencyResponse", 41484, 7), new C60812q5("FocalPlaneXResolution", 41486, 5), new C60812q5("FocalPlaneYResolution", 41487, 5), new C60812q5("FocalPlaneResolutionUnit", 41488, 3), new C60812q5("SubjectLocation", 41492, 3), new C60812q5("ExposureIndex", 41493, 5), new C60812q5("SensingMethod", 41495, 3), new C60812q5("FileSource", 41728, 7), new C60812q5("SceneType", 41729, 7), new C60812q5("CFAPattern", 41730, 7), new C60812q5("CustomRendered", 41985, 3)}, 0, c60812q5Arr2, 27, 27);
        System.arraycopy(new C60812q5[]{new C60812q5("ExposureMode", 41986, 3), new C60812q5("WhiteBalance", 41987, 3), new C60812q5("DigitalZoomRatio", 41988, 5), new C60812q5("FocalLengthIn35mmFilm", 41989, 3), new C60812q5("SceneCaptureType", 41990, 3), new C60812q5("GainControl", 41991, 3), new C60812q5("Contrast", 41992, 3), new C60812q5("Saturation", 41993, 3), new C60812q5("Sharpness", 41994, 3), new C60812q5("DeviceSettingDescription", 41995, 7), new C60812q5("SubjectDistanceRange", 41996, 3), new C60812q5("ImageUniqueID", 42016, 2), new C60812q5("CameraOwnerName", 42032, 2), new C60812q5("BodySerialNumber", 42033, 2), new C60812q5("LensSpecification", 42034, 5), new C60812q5("LensMake", 42035, 2), new C60812q5("LensModel", 42036, 2), new C60812q5("Gamma", 42240, 5), new C60812q5("DNGVersion", 50706, 1), new C60812q5("DefaultCropSize", 50720, 3, 4)}, 0, c60812q5Arr2, 54, 20);
        A0x = c60812q5Arr2;
        C60812q5[] c60812q5Arr3 = new C60812q5[32];
        System.arraycopy(new C60812q5[]{new C60812q5("GPSVersionID", 0, 1), new C60812q5("GPSLatitudeRef", 1, 2), new C60812q5("GPSLatitude", 2, 5, 10), new C60812q5("GPSLongitudeRef", 3, 2), new C60812q5("GPSLongitude", 4, 5, 10), new C60812q5("GPSAltitudeRef", 5, 1), new C60812q5("GPSAltitude", 6, 5), new C60812q5("GPSTimeStamp", 7, 5), new C60812q5("GPSSatellites", 8, 2), new C60812q5("GPSStatus", 9, 2), new C60812q5("GPSMeasureMode", 10, 2), new C60812q5("GPSDOP", 11, 5), new C60812q5("GPSSpeedRef", 12, 2), new C60812q5("GPSSpeed", 13, 5), new C60812q5("GPSTrackRef", 14, 2), new C60812q5("GPSTrack", 15, 5), new C60812q5("GPSImgDirectionRef", 16, 2), new C60812q5("GPSImgDirection", 17, 5), new C60812q5("GPSMapDatum", 18, 2), new C60812q5("GPSDestLatitudeRef", 19, 2), new C60812q5("GPSDestLatitude", 20, 5), new C60812q5("GPSDestLongitudeRef", 21, 2), new C60812q5("GPSDestLongitude", 22, 5), new C60812q5("GPSDestBearingRef", 23, 2), new C60812q5("GPSDestBearing", 24, 5), new C60812q5("GPSDestDistanceRef", 25, 2), new C60812q5("GPSDestDistance", 26, 5)}, 0, c60812q5Arr3, 0, 27);
        System.arraycopy(new C60812q5[]{new C60812q5("GPSProcessingMethod", 27, 7), new C60812q5("GPSAreaInformation", 28, 7), new C60812q5("GPSDateStamp", 29, 2), new C60812q5("GPSDifferential", 30, 3), new C60812q5("GPSHPositioningError", 31, 5)}, 0, c60812q5Arr3, 27, 5);
        A0y = c60812q5Arr3;
        C60812q5[] c60812q5Arr4 = {new C60812q5("InteroperabilityIndex", 1, 2)};
        A0z = c60812q5Arr4;
        C60812q5[] c60812q5Arr5 = new C60812q5[37];
        System.arraycopy(new C60812q5[]{new C60812q5("NewSubfileType", 254, 4), new C60812q5("SubfileType", 255, 4), new C60812q5("ThumbnailImageWidth", 256, 3, 4), new C60812q5("ThumbnailImageLength", 257, 3, 4), new C60812q5("BitsPerSample", 258, 3), new C60812q5("Compression", 259, 3), new C60812q5("PhotometricInterpretation", 262, 3), new C60812q5("ImageDescription", 270, 2), new C60812q5("Make", 271, 2), new C60812q5("Model", 272, 2), new C60812q5("StripOffsets", 273, 3, 4), new C60812q5("ThumbnailOrientation", 274, 3), new C60812q5("SamplesPerPixel", 277, 3), new C60812q5("RowsPerStrip", 278, 3, 4), new C60812q5("StripByteCounts", 279, 3, 4), new C60812q5("XResolution", 282, 5), new C60812q5("YResolution", 283, 5), new C60812q5("PlanarConfiguration", 284, 3), new C60812q5("ResolutionUnit", 296, 3), new C60812q5("TransferFunction", 301, 3), new C60812q5("Software", 305, 2), new C60812q5("DateTime", 306, 2), new C60812q5("Artist", 315, 2), new C60812q5("WhitePoint", 318, 5), new C60812q5("PrimaryChromaticities", 319, 5), new C60812q5("SubIFDPointer", 330, 4), new C60812q5("JPEGInterchangeFormat", 513, 4)}, 0, c60812q5Arr5, 0, 27);
        System.arraycopy(new C60812q5[]{new C60812q5("JPEGInterchangeFormatLength", 514, 4), new C60812q5("YCbCrCoefficients", 529, 5), new C60812q5("YCbCrSubSampling", 530, 3), new C60812q5("YCbCrPositioning", 531, 3), new C60812q5("ReferenceBlackWhite", 532, 5), new C60812q5("Copyright", 33432, 2), new C60812q5("ExifIFDPointer", 34665, 4), new C60812q5("GPSInfoIFDPointer", 34853, 4), new C60812q5("DNGVersion", 50706, 1), new C60812q5("DefaultCropSize", 50720, 3, 4)}, 0, c60812q5Arr5, 27, 10);
        A10 = c60812q5Arr5;
        C60812q5[] c60812q5Arr6 = {new C60812q5("ThumbnailImage", 256, 7), new C60812q5("CameraSettingsIFDPointer", 8224, 4), new C60812q5("ImageProcessingIFDPointer", 8256, 4)};
        A14 = c60812q5Arr6;
        C60812q5[] c60812q5Arr7 = {new C60812q5("PreviewImageStart", 257, 4), new C60812q5("PreviewImageLength", 258, 4)};
        A12 = c60812q5Arr7;
        C60812q5[] c60812q5Arr8 = {new C60812q5("AspectFrame", 4371, 3)};
        A13 = c60812q5Arr8;
        C60812q5[] c60812q5Arr9 = {new C60812q5("ColorSpace", 55, 3)};
        A15 = c60812q5Arr9;
        A0n = new C60812q5[][]{c60812q5Arr, c60812q5Arr2, c60812q5Arr3, c60812q5Arr4, c60812q5Arr5, c60812q5Arr, c60812q5Arr6, c60812q5Arr7, c60812q5Arr8, c60812q5Arr9};
        A0w = new C60812q5[]{new C60812q5("SubIFDPointer", 330, 4), new C60812q5("ExifIFDPointer", 34665, 4), new C60812q5("GPSInfoIFDPointer", 34853, 4), new C60812q5("InteroperabilityIFDPointer", 40965, 4), new C60812q5("CameraSettingsIFDPointer", 8224, 1), new C60812q5("ImageProcessingIFDPointer", 8256, 1)};
        A16 = new HashMap[10];
        A17 = new HashMap[10];
        A0p = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        A0o = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        A0L = forName;
        A0S = "Exif\u0000\u0000".getBytes(forName);
        A0v = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        A0J = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        A0K = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C60812q5[][] c60812q5Arr10 = A0n;
            if (i < 10) {
                HashMap[] hashMapArr = A16;
                hashMapArr[i] = new HashMap();
                HashMap[] hashMapArr2 = A17;
                hashMapArr2[i] = new HashMap();
                for (C60812q5 c60812q5 : c60812q5Arr10[i]) {
                    hashMapArr[i].put(Integer.valueOf(c60812q5.A00), c60812q5);
                    hashMapArr2[i].put(c60812q5.A03, c60812q5);
                }
                i++;
            } else {
                HashMap hashMap = A0o;
                C60812q5[] c60812q5Arr11 = A0w;
                hashMap.put(Integer.valueOf(c60812q5Arr11[0].A00), 5);
                hashMap.put(Integer.valueOf(c60812q5Arr11[1].A00), 1);
                hashMap.put(Integer.valueOf(c60812q5Arr11[2].A00), 2);
                hashMap.put(Integer.valueOf(c60812q5Arr11[3].A00), 3);
                hashMap.put(Integer.valueOf(c60812q5Arr11[4].A00), 7);
                hashMap.put(Integer.valueOf(c60812q5Arr11[5].A00), 8);
                A0M = Pattern.compile(".*[1-9].*");
                A0u = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                A0s = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                A0t = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C60782q2(InputStream inputStream) {
        this.A0I = new HashMap[10];
        this.A0A = new HashSet(10);
        this.A09 = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.A08 = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.A06 = (AssetManager.AssetInputStream) inputStream;
                this.A07 = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        this.A06 = null;
                        this.A07 = fileInputStream.getFD();
                    } catch (Exception unused) {
                    }
                }
                this.A06 = null;
                this.A07 = null;
            }
            A0H(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public C60782q2(String str) {
        this.A0I = new HashMap[10];
        this.A0A = new HashSet(10);
        this.A09 = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            A0I(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public C60782q2(File file) {
        this.A0I = new HashMap[10];
        this.A0A = new HashSet(10);
        this.A09 = ByteOrder.BIG_ENDIAN;
        A0I(file.getAbsolutePath());
    }
}
