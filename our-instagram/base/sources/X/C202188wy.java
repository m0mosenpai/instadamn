package X;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.8wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202188wy {
    public static final Charset A04;
    public static final byte[] A06;
    public static final C202198wz[][] A0A;
    public static final HashMap A0B;
    public static final HashSet A0C;
    public static final C202198wz[] A0D;
    public static final C202198wz[] A0E;
    public static final C202198wz[] A0F;
    public static final HashMap[] A0G;
    public int A00;
    public ByteOrder A01;
    public final HashMap[] A02 = new HashMap[3];
    public final java.util.Set A03 = new HashSet(3);
    public static final byte[] A07 = {-1, -40, -1};
    public static final String[] A09 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final int[] A08 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] A05 = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        C202198wz[] c202198wzArr = {new C202198wz("Orientation", 274, 3), new C202198wz("SubIFDPointer", 330, 4), new C202198wz("ExifIFDPointer", 34665, 4)};
        A0F = c202198wzArr;
        C202198wz[] c202198wzArr2 = {new C202198wz("ExposureTime", 33434, 5), new C202198wz("PhotographicSensitivity", 34855, 3), new C202198wz("ShutterSpeedValue", 37377, 10), new C202198wz("ApertureValue", 37378, 5), new C202198wz("FocalLength", 37386, 5), new C202198wz("WhiteBalance", 41987, 3), new C202198wz("DigitalZoomRatio", 41988, 5), new C202198wz("FocalLengthIn35mmFilm", 41989, 3)};
        A0E = c202198wzArr2;
        A0A = new C202198wz[][]{c202198wzArr, c202198wzArr2, c202198wzArr};
        A0D = new C202198wz[]{new C202198wz("SubIFDPointer", 330, 4), new C202198wz("ExifIFDPointer", 34665, 4)};
        A0G = new HashMap[3];
        A0C = new HashSet(Arrays.asList("DigitalZoomRatio", "ExposureTime"));
        A0B = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        A04 = forName;
        A06 = "Exif\u0000\u0000".getBytes(forName);
        int i = 0;
        while (true) {
            C202198wz[][] c202198wzArr3 = A0A;
            if (i < 3) {
                HashMap[] hashMapArr = A0G;
                hashMapArr[i] = new HashMap();
                for (C202198wz c202198wz : c202198wzArr3[i]) {
                    hashMapArr[i].put(Integer.valueOf(c202198wz.A00), c202198wz);
                }
                i++;
            } else {
                A0B.put(Integer.valueOf(A0D[1].A00), 1);
                return;
            }
        }
    }

    public final int A02(String str, int i) {
        int i2 = 0;
        do {
            C202218x1 c202218x1 = (C202218x1) this.A02[i2].get(str);
            if (c202218x1 == null) {
                i2++;
            } else {
                try {
                    Object A00 = C202218x1.A00(c202218x1, this.A01);
                    if (A00 != null) {
                        if (A00 instanceof String) {
                            return Integer.parseInt((String) A00);
                        }
                        if (A00 instanceof long[]) {
                            long[] jArr = (long[]) A00;
                            if (jArr.length == 1) {
                                return (int) jArr[0];
                            }
                            throw new NumberFormatException("There are more than one component");
                        }
                        if (A00 instanceof int[]) {
                            int[] iArr = (int[]) A00;
                            if (iArr.length == 1) {
                                return iArr[0];
                            }
                            throw new NumberFormatException("There are more than one component");
                        }
                        throw new NumberFormatException(AbstractC111324zv.A00(1563));
                    }
                    throw new NumberFormatException(AbstractC111324zv.A00(1699));
                } catch (NumberFormatException unused) {
                    return i;
                }
            }
        } while (i2 < 3);
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r12 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
    
        if (r22.A00 != r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0067, code lost:
    
        if (r12 == 7) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(X.C202208x0 r22, int r23) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202188wy.A00(X.8x0, int):void");
    }

    public final double A01(String str) {
        int i = 0;
        do {
            C202218x1 c202218x1 = (C202218x1) this.A02[i].get(str);
            if (c202218x1 == null) {
                i++;
            } else {
                try {
                    Object A00 = C202218x1.A00(c202218x1, this.A01);
                    if (A00 != null) {
                        if (A00 instanceof String) {
                            return Double.parseDouble((String) A00);
                        }
                        if (A00 instanceof long[]) {
                            if (((long[]) A00).length == 1) {
                                return r6[0];
                            }
                            throw new NumberFormatException("There are more than one component");
                        }
                        if (A00 instanceof int[]) {
                            if (((int[]) A00).length == 1) {
                                return r6[0];
                            }
                            throw new NumberFormatException("There are more than one component");
                        }
                        if (A00 instanceof double[]) {
                            double[] dArr = (double[]) A00;
                            if (dArr.length == 1) {
                                return dArr[0];
                            }
                            throw new NumberFormatException("There are more than one component");
                        }
                        if (A00 instanceof C202228x2[]) {
                            C202228x2[] c202228x2Arr = (C202228x2[]) A00;
                            if (c202228x2Arr.length == 1) {
                                C202228x2 c202228x2 = c202228x2Arr[0];
                                return c202228x2.A01 / c202228x2.A00;
                            }
                            throw new NumberFormatException("There are more than one component");
                        }
                        throw new NumberFormatException(AbstractC111324zv.A00(1562));
                    }
                    throw new NumberFormatException(AbstractC111324zv.A00(1698));
                } catch (NumberFormatException unused) {
                    return -1.0d;
                }
            }
        } while (i < 3);
        return -1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        throw new java.io.IOException("This EXIF util only supports JPEG");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        throw new java.io.IOException(X.AnonymousClass001.A0O(X.AbstractC111324zv.A00(1671), r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C202188wy(java.io.InputStream r15) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202188wy.<init>(java.io.InputStream):void");
    }
}
