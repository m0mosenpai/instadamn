package X;

import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes10.dex */
public final class SYE {
    public static final byte[] A01;
    public static final byte[] A02;
    public static final byte[] A03;
    public static final byte[] A06;
    public static final byte[] A07;
    public static final byte[][] A0A;
    public static final int A0B;
    public final int A00;
    public static final byte[] A08 = {-1, -40, -1};
    public static final byte[] A09 = {-119, 80, 78, 71, DalvikInternals.IOPRIO_CLASS_SHIFT, 10, 26, 10};
    public static final byte[] A04 = AbstractC62782SRa.A01("GIF87a");
    public static final byte[] A05 = AbstractC62782SRa.A01("GIF89a");

    static {
        byte[] A012 = AbstractC62782SRa.A01("BM");
        A01 = A012;
        A0B = A012.length;
        A07 = new byte[]{0, 0, 1, 0};
        A06 = AbstractC62782SRa.A01("ftyp");
        A0A = new byte[][]{AbstractC62782SRa.A01("heic"), AbstractC62782SRa.A01("heix"), AbstractC62782SRa.A01("hevc"), AbstractC62782SRa.A01("hevx"), AbstractC62782SRa.A01("mif1"), AbstractC62782SRa.A01("msf1")};
        A02 = new byte[]{73, 73, 42, 0};
        A03 = new byte[]{77, 77, 0, 42};
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e2, code lost:
    
        if (X.AbstractC62782SRa.A00(r7, r0, 0) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0077, code lost:
    
        if (r8 < 6) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C62993SaH A00(byte[] r7, int r8) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SYE.A00(byte[], int):X.SaH");
    }

    public SYE() {
        Integer[] numArr = {21, 20, 3, 8, 6, Integer.valueOf(A0B), 4, 12};
        int i = 1;
        Integer num = numArr[0];
        while (true) {
            Integer num2 = numArr[i];
            num = num.compareTo(num2) < 0 ? num2 : num;
            if (i == 7) {
                break;
            } else {
                i++;
            }
        }
        if (num != null) {
            this.A00 = num.intValue();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
