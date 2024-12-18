package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.PxB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58543PxB implements InterfaceC65595Tne {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AbstractC58532Px0 A04;
    public final SK5 A05;
    public final int[] A06;
    public final int[] A07;
    public final Object[] A08;
    public final S3S A09;
    public final SST A0A;
    public final S3U A0B;
    public final SK0 A0C;
    public final boolean A0D;
    public static final int[] A0F = new int[0];
    public static final Unsafe A0E = C58546PxE.A03();

    @Override // X.InterfaceC65595Tne
    public final void CpO(C58548PxL message, Object data, byte[] position, int limit, int registers) {
        A0H(message, data, position, limit, registers, 0);
    }

    private int A00(final int number) {
        if (number >= this.A02 && number <= this.A01) {
            int i = 0;
            int[] iArr = this.A06;
            int length = (iArr.length / 3) - 1;
            while (i <= length) {
                int i2 = (length + i) >>> 1;
                int i3 = i2 * 3;
                int i4 = iArr[i3];
                if (number != i4) {
                    if (number < i4) {
                        length = i2 - 1;
                    } else {
                        i = i2 + 1;
                    }
                } else {
                    return i3;
                }
            }
            return -1;
        }
        return -1;
    }

    public static int A01(List list) {
        SK0 sk0 = PxW.A01;
        return list.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0161, code lost:
    
        if ((r5 & X.C3OO.FLAG_MOVED) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e4, code lost:
    
        if ((r5 & X.C3OO.FLAG_MOVED) == 0) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C58543PxB A02(X.S3S r37, X.SK5 r38, X.SST r39, X.S3U r40, X.C62587SHm r41, X.SK0 r42) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58543PxB.A02(X.S3S, X.SK5, X.SST, X.S3U, X.SHm, X.SK0):X.PxB");
    }

    private InterfaceC65595Tne A03(int pos) {
        int i = (pos / 3) * 2;
        Object[] objArr = this.A08;
        InterfaceC65595Tne interfaceC65595Tne = (InterfaceC65595Tne) objArr[i];
        if (interfaceC65595Tne == null) {
            InterfaceC65595Tne A00 = C58540Px8.A02.A00((Class) objArr[i + 1]);
            objArr[i] = A00;
            return A00;
        }
        return interfaceC65595Tne;
    }

    private void A07(int message, int fieldNumber, Object pos, Object field) {
        Unsafe unsafe = A0E;
        int[] iArr = this.A06;
        unsafe.putObject(pos, iArr[fieldNumber + 1] & 1048575, field);
        C58546PxE.A04(pos, iArr[fieldNumber + 2] & 1048575, message);
    }

    private void A08(C58545PxD message, Object typeAndOffset, int reader) {
        long A0A;
        Object A0M;
        if ((536870912 & reader) != 0) {
            A0A = AbstractC58318PtA.A0A(reader);
            C58545PxD.A02(message, 2);
            A0M = message.A03.A0O();
        } else {
            boolean z = this.A0D;
            A0A = AbstractC58318PtA.A0A(reader);
            C58545PxD.A02(message, 2);
            AbstractC61611Rqa abstractC61611Rqa = message.A03;
            if (z) {
                A0M = abstractC61611Rqa.A0N();
            } else {
                A0M = abstractC61611Rqa.A0M();
            }
        }
        C58546PxE.A05(typeAndOffset, A0A, A0M);
    }

    public static void A09(C62650SKj c62650SKj, InterfaceC65595Tne interfaceC65595Tne, Object obj, int i) {
        C60802RTn c60802RTn = c62650SKj.A00;
        int i2 = i << 3;
        c60802RTn.A04(i2 | 3);
        interfaceC65595Tne.FEp(c60802RTn.A01, obj);
        c60802RTn.A04(i2 | 4);
    }

    private void A0B(Object message, int pos) {
        int i = this.A06[pos + 2];
        long j = 1048575 & i;
        if (j != 1048575) {
            C58546PxE.A04(message, j, (1 << (i >>> 20)) | C58546PxE.A01.A05(message, j));
        }
    }

    private void A0C(Object message, int pos, Object field) {
        A0E.putObject(message, AbstractC58318PtA.A0A(this.A06[pos + 1]), field);
        A0B(message, pos);
    }

    public static boolean A0D(Object message) {
        if (message == null) {
            return false;
        }
        if ((message instanceof AbstractC58533Px1) && (((AbstractC58533Px1) message).memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0023. Please report as an issue. */
    private boolean A0E(Object message, int pos) {
        Object A07;
        AbstractC58536Px4 abstractC58536Px4;
        boolean isEmpty;
        int[] iArr = this.A06;
        int i = iArr[pos + 2];
        long j = 1048575 & i;
        if (j == 1048575) {
            int i2 = iArr[pos + 1];
            long j2 = i2 & 1048575;
            switch ((i2 & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(C58546PxE.A01.A02(message, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C58546PxE.A01.A03(message, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C58546PxE.A01.A06(message, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                    if (C58546PxE.A01.A05(message, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return C58546PxE.A01.A0J(message, j2);
                case 8:
                    A07 = C58546PxE.A01.A07(message, j2);
                    if (A07 instanceof String) {
                        isEmpty = ((String) A07).isEmpty();
                        return !isEmpty;
                    }
                    if (A07 instanceof AbstractC58536Px4) {
                        abstractC58536Px4 = AbstractC58536Px4.A01;
                        isEmpty = abstractC58536Px4.equals(A07);
                        return !isEmpty;
                    }
                    throw new IllegalArgumentException();
                case 9:
                case 17:
                    if (C58546PxE.A01.A07(message, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    abstractC58536Px4 = AbstractC58536Px4.A01;
                    A07 = C58546PxE.A01.A07(message, j2);
                    isEmpty = abstractC58536Px4.equals(A07);
                    return !isEmpty;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((C58546PxE.A01.A05(message, j) & (1 << (i >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean A0F(Object message, int fieldNumber, int pos) {
        return AbstractC167007dF.A1P(C58546PxE.A01.A05(message, AbstractC58319PtB.A03(pos, this.A06)), fieldNumber);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x066d, code lost:
    
        throw X.C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x067b, code lost:
    
        throw X.C61032Re1.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        r1 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r1 == 1048575) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        r11.putInt(r35, r1, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
    
        r6 = r33.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
    
        if (r6 >= r33.A03) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        X.C58546PxE.A01.A07(r35, r33.A06[r33.A07[r6] + 1] & 1048575);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x064f, code lost:
    
        if (r39 != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0651, code lost:
    
        if (r0 != r38) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0653, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x065d, code lost:
    
        r0 = new java.io.IOException("Failed to parse the message.");
        r0.A00 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0666, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0654, code lost:
    
        if (r0 > r38) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x065a, code lost:
    
        if (r19 != r39) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x065c, code lost:
    
        return r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:153:0x0275. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:356:0x04b6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00a5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0649 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x067c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0633  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, X.Re1, java.io.IOException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0H(X.C58548PxL r34, java.lang.Object r35, byte[] r36, int r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58543PxB.A0H(X.PxL, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0018 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // X.InterfaceC65595Tne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AT0(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A06
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L5:
            if (r5 >= r6) goto Ld1
            int r0 = r5 + 1
            r3 = r7[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            long r0 = (long) r0
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r2
            int r2 = r3 >>> 20
            switch(r2) {
                case 0: goto L1b;
                case 1: goto L38;
                case 2: goto L55;
                case 3: goto L55;
                case 4: goto L6e;
                case 5: goto L55;
                case 6: goto L6e;
                case 7: goto L83;
                case 8: goto L9b;
                case 9: goto L9b;
                case 10: goto L9b;
                case 11: goto L6e;
                case 12: goto L6e;
                case 13: goto L6e;
                case 14: goto L55;
                case 15: goto L6e;
                case 16: goto L55;
                case 17: goto L9b;
                case 18: goto Lb9;
                case 19: goto Lb9;
                case 20: goto Lb9;
                case 21: goto Lb9;
                case 22: goto Lb9;
                case 23: goto Lb9;
                case 24: goto Lb9;
                case 25: goto Lb9;
                case 26: goto Lb9;
                case 27: goto Lb9;
                case 28: goto Lb9;
                case 29: goto Lb9;
                case 30: goto Lb9;
                case 31: goto Lb9;
                case 32: goto Lb9;
                case 33: goto Lb9;
                case 34: goto Lb9;
                case 35: goto Lb9;
                case 36: goto Lb9;
                case 37: goto Lb9;
                case 38: goto Lb9;
                case 39: goto Lb9;
                case 40: goto Lb9;
                case 41: goto Lb9;
                case 42: goto Lb9;
                case 43: goto Lb9;
                case 44: goto Lb9;
                case 45: goto Lb9;
                case 46: goto Lb9;
                case 47: goto Lb9;
                case 48: goto Lb9;
                case 49: goto Lb9;
                case 50: goto Lb9;
                case 51: goto La4;
                case 52: goto La4;
                case 53: goto La4;
                case 54: goto La4;
                case 55: goto La4;
                case 56: goto La4;
                case 57: goto La4;
                case 58: goto La4;
                case 59: goto La4;
                case 60: goto La4;
                case 61: goto La4;
                case 62: goto La4;
                case 63: goto La4;
                case 64: goto La4;
                case 65: goto La4;
                case 66: goto La4;
                case 67: goto La4;
                case 68: goto La4;
                default: goto L18;
            }
        L18:
            int r5 = r5 + 3
            goto L5
        L1b:
            boolean r3 = r10.A0E(r11, r5)
            boolean r2 = r10.A0E(r12, r5)
            if (r3 != r2) goto Le0
            X.PxF r8 = X.C58546PxE.A01
            double r2 = r8.A02(r11, r0)
            long r3 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r8.A02(r12, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L69
        L38:
            boolean r3 = r10.A0E(r11, r5)
            boolean r2 = r10.A0E(r12, r5)
            if (r3 != r2) goto Le0
            X.PxF r4 = X.C58546PxE.A01
            float r2 = r4.A03(r11, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r4.A03(r12, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L97
        L55:
            boolean r3 = r10.A0E(r11, r5)
            boolean r2 = r10.A0E(r12, r5)
            if (r3 != r2) goto Le0
            X.PxF r2 = X.C58546PxE.A01
            long r3 = r2.A06(r11, r0)
            long r1 = r2.A06(r12, r0)
        L69:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Le0
            goto L18
        L6e:
            boolean r3 = r10.A0E(r11, r5)
            boolean r2 = r10.A0E(r12, r5)
            if (r3 != r2) goto Le0
            X.PxF r2 = X.C58546PxE.A01
            int r3 = r2.A05(r11, r0)
            int r0 = r2.A05(r12, r0)
            goto L97
        L83:
            boolean r3 = r10.A0E(r11, r5)
            boolean r2 = r10.A0E(r12, r5)
            if (r3 != r2) goto Le0
            X.PxF r2 = X.C58546PxE.A01
            boolean r3 = r2.A0J(r11, r0)
            boolean r0 = r2.A0J(r12, r0)
        L97:
            if (r3 != r0) goto Le0
            goto L18
        L9b:
            boolean r8 = r10.A0E(r11, r5)
            boolean r2 = r10.A0E(r12, r5)
            goto Lb7
        La4:
            int r2 = r5 + 2
            r3 = r7[r2]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r2 = (long) r3
            X.PxF r4 = X.C58546PxE.A01
            int r8 = r4.A05(r11, r2)
            int r2 = r4.A05(r12, r2)
        Lb7:
            if (r8 != r2) goto Le0
        Lb9:
            X.PxF r3 = X.C58546PxE.A01
            java.lang.Object r2 = r3.A07(r11, r0)
            java.lang.Object r1 = r3.A07(r12, r0)
            X.SK0 r0 = X.PxW.A01
            if (r2 == r1) goto L18
            if (r2 == 0) goto Le0
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto Le0
            goto L18
        Ld1:
            X.Px1 r11 = (X.AbstractC58533Px1) r11
            X.PxV r1 = r11.unknownFields
            X.Px1 r12 = (X.AbstractC58533Px1) r12
            X.PxV r0 = r12.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le0
            r9 = 1
        Le0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58543PxB.AT0(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:329:0x0597, code lost:
    
        if (r1 >= 0) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0657, code lost:
    
        if (r1 >= 0) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0147, code lost:
    
        if (r1 < 0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0660, code lost:
    
        r8 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0659, code lost:
    
        r0 = X.C60802RTn.A05;
        r8 = X.AbstractC58321PtD.A06(r1);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x003a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x003d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v46, types: [int] */
    @Override // X.InterfaceC65595Tne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int BtW(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58543PxB.BtW(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0017. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65595Tne
    public final int CME(Object obj) {
        int i;
        double A02;
        float A03;
        long A06;
        int A05;
        int i2;
        int[] iArr = this.A06;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int i5 = iArr[i4 + 1];
            int i6 = iArr[i4];
            long A0A = AbstractC58318PtA.A0A(i5);
            int i7 = 37;
            switch (AbstractC58318PtA.A02(i5)) {
                case 0:
                    i = i3 * 53;
                    A02 = C58546PxE.A01.A02(obj, A0A);
                    A06 = Double.doubleToLongBits(A02);
                    Charset charset = AbstractC62398S9x.A04;
                    A05 = AbstractC25228BEl.A03(A06);
                    i3 = i + A05;
                    break;
                case 1:
                    i = i3 * 53;
                    A03 = C58546PxE.A01.A03(obj, A0A);
                    A05 = Float.floatToIntBits(A03);
                    i3 = i + A05;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i3 * 53;
                    A06 = C58546PxE.A01.A06(obj, A0A);
                    Charset charset2 = AbstractC62398S9x.A04;
                    A05 = AbstractC25228BEl.A03(A06);
                    i3 = i + A05;
                    break;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                    i = i3 * 53;
                    A05 = C58546PxE.A01.A05(obj, A0A);
                    i3 = i + A05;
                    break;
                case 7:
                    i = i3 * 53;
                    i2 = C58546PxE.A01.A0J(obj, A0A);
                    Charset charset3 = AbstractC62398S9x.A04;
                    A05 = AbstractC58322PtE.A02(i2);
                    i3 = i + A05;
                    break;
                case 8:
                    i = i3 * 53;
                    A05 = ((String) PxF.A00(obj, A0A)).hashCode();
                    i3 = i + A05;
                    break;
                case 9:
                case 17:
                    Object A00 = PxF.A00(obj, A0A);
                    if (A00 != null) {
                        i7 = A00.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                case 18:
                case Process.SIGSTOP /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case Seq.NULL_REFNUM /* 41 */:
                case Seq.RefTracker.REF_OFFSET /* 42 */:
                case 43:
                case 44:
                case 45:
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                case 47:
                case 48:
                case 49:
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    i = i3 * 53;
                    A05 = PxF.A00(obj, A0A).hashCode();
                    i3 = i + A05;
                    break;
                case 51:
                    if (A0F(obj, i6, i4)) {
                        i = i3 * 53;
                        A02 = MSW.A00(PxF.A00(obj, A0A));
                        A06 = Double.doubleToLongBits(A02);
                        Charset charset22 = AbstractC62398S9x.A04;
                        A05 = AbstractC25228BEl.A03(A06);
                        i3 = i + A05;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (A0F(obj, i6, i4)) {
                        i = i3 * 53;
                        A03 = AbstractC166987dD.A09(PxF.A00(obj, A0A));
                        A05 = Float.floatToIntBits(A03);
                        i3 = i + A05;
                        break;
                    } else {
                        break;
                    }
                case 53:
                case 54:
                case 56:
                case 65:
                case 67:
                    if (A0F(obj, i6, i4)) {
                        i = i3 * 53;
                        A06 = AbstractC166987dD.A0N(PxF.A00(obj, A0A));
                        Charset charset222 = AbstractC62398S9x.A04;
                        A05 = AbstractC25228BEl.A03(A06);
                        i3 = i + A05;
                        break;
                    } else {
                        break;
                    }
                case 55:
                case 57:
                case 62:
                case StringTreeSet.PAYLOAD_MASK /* 63 */:
                case 64:
                case 66:
                    if (A0F(obj, i6, i4)) {
                        i = i3 * 53;
                        A05 = AbstractC166987dD.A0H(PxF.A00(obj, A0A));
                        i3 = i + A05;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (A0F(obj, i6, i4)) {
                        i = i3 * 53;
                        i2 = AbstractC166987dD.A1a(PxF.A00(obj, A0A));
                        Charset charset32 = AbstractC62398S9x.A04;
                        A05 = AbstractC58322PtE.A02(i2);
                        i3 = i + A05;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!A0F(obj, i6, i4)) {
                        break;
                    }
                    i = i3 * 53;
                    A05 = ((String) PxF.A00(obj, A0A)).hashCode();
                    i3 = i + A05;
                    break;
                case 60:
                case 61:
                case 68:
                    if (!A0F(obj, i6, i4)) {
                        break;
                    }
                    i = i3 * 53;
                    A05 = PxF.A00(obj, A0A).hashCode();
                    i3 = i + A05;
                    break;
            }
        }
        return AbstractC166987dD.A0I(((AbstractC58533Px1) obj).unknownFields, i3 * 53);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0020. Please report as an issue. */
    @Override // X.InterfaceC65595Tne
    public final void CpL(Object message, Object other) {
        A0A(message);
        other.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.A06;
            if (i < iArr.length) {
                int i2 = i + 1;
                int i3 = iArr[i2];
                long j = 1048575 & i3;
                int i4 = iArr[i];
                switch ((i3 & 267386880) >>> 20) {
                    case 0:
                        if (!A0E(other, i)) {
                            i += 3;
                        } else {
                            PxF pxF = C58546PxE.A01;
                            pxF.A0A(message, j, pxF.A02(other, j));
                            A0B(message, i);
                            i += 3;
                        }
                    case 1:
                        if (!A0E(other, i)) {
                            i += 3;
                        } else {
                            PxF pxF2 = C58546PxE.A01;
                            pxF2.A0B(message, j, pxF2.A03(other, j));
                            A0B(message, i);
                            i += 3;
                        }
                    case 2:
                    case 3:
                    case 5:
                    case 14:
                    case 16:
                        if (!A0E(other, i)) {
                            i += 3;
                        } else {
                            PxF pxF3 = C58546PxE.A01;
                            pxF3.A0D(message, j, pxF3.A06(other, j));
                            A0B(message, i);
                            i += 3;
                        }
                    case 4:
                    case 6:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case Process.SIGTERM /* 15 */:
                        if (!A0E(other, i)) {
                            i += 3;
                        } else {
                            C58546PxE.A04(message, j, C58546PxE.A01.A05(other, j));
                            A0B(message, i);
                            i += 3;
                        }
                    case 7:
                        if (!A0E(other, i)) {
                            i += 3;
                        } else {
                            PxF pxF4 = C58546PxE.A01;
                            pxF4.A0F(message, j, pxF4.A0J(other, j));
                            A0B(message, i);
                            i += 3;
                        }
                    case 8:
                    case 10:
                        if (!A0E(other, i)) {
                            i += 3;
                        } else {
                            C58546PxE.A05(message, j, C58546PxE.A01.A07(other, j));
                            A0B(message, i);
                            i += 3;
                        }
                    case 9:
                    case 17:
                        if (A0E(other, i)) {
                            long j2 = iArr[i2] & 1048575;
                            Unsafe unsafe = A0E;
                            Object object = unsafe.getObject(other, j2);
                            if (object != null) {
                                InterfaceC65595Tne A03 = A03(i);
                                if (!A0E(message, i)) {
                                    if (!A0D(object)) {
                                        unsafe.putObject(message, j2, object);
                                    } else {
                                        AbstractC58533Px1 CsQ = A03.CsQ();
                                        A03.CpL(CsQ, object);
                                        unsafe.putObject(message, j2, CsQ);
                                    }
                                    A0B(message, i);
                                } else {
                                    Object object2 = unsafe.getObject(message, j2);
                                    if (!A0D(object2)) {
                                        AbstractC58533Px1 CsQ2 = A03.CsQ();
                                        A03.CpL(CsQ2, object2);
                                        unsafe.putObject(message, j2, CsQ2);
                                        object2 = CsQ2;
                                    }
                                    A03.CpL(object2, object);
                                }
                            } else {
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                A1C.append("Source subfield ");
                                A1C.append(iArr[i]);
                                throw AbstractC43594JPz.A0o(other, " is present but null: ", A1C);
                            }
                        } else {
                            continue;
                        }
                        i += 3;
                    case 18:
                    case Process.SIGSTOP /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case Seq.NULL_REFNUM /* 41 */:
                    case Seq.RefTracker.REF_OFFSET /* 42 */:
                    case 43:
                    case 44:
                    case 45:
                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    case 47:
                    case 48:
                    case 49:
                        if (this.A05 instanceof RVF) {
                            PxF pxF5 = C58546PxE.A01;
                            InterfaceC65690TsC interfaceC65690TsC = (InterfaceC65690TsC) pxF5.A07(message, j);
                            List list = (List) pxF5.A07(other, j);
                            int size = interfaceC65690TsC.size();
                            int size2 = list.size();
                            if (size > 0) {
                                if (size2 > 0) {
                                    if (!((AbstractC58537Px5) interfaceC65690TsC).A00) {
                                        interfaceC65690TsC = interfaceC65690TsC.Cq4(size2 + size);
                                    }
                                    interfaceC65690TsC.addAll(list);
                                }
                                list = interfaceC65690TsC;
                            }
                            C58546PxE.A05(message, j, list);
                        } else {
                            List list2 = (List) PxF.A00(other, j);
                            List A00 = RVG.A00(message, list2.size(), j);
                            int size3 = A00.size();
                            int size4 = list2.size();
                            if (size3 > 0) {
                                if (size4 > 0) {
                                    A00.addAll(list2);
                                }
                                list2 = A00;
                            }
                            C58546PxE.A05(message, j, list2);
                        }
                        i += 3;
                    case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                        SK0 sk0 = PxW.A01;
                        PxF pxF6 = C58546PxE.A01;
                        C58546PxE.A05(message, j, SST.A00(pxF6.A07(message, j), pxF6.A07(other, j)));
                        i += 3;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 61:
                    case 62:
                    case StringTreeSet.PAYLOAD_MASK /* 63 */:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!A0F(other, i4, i)) {
                            i += 3;
                        } else {
                            C58546PxE.A05(message, j, C58546PxE.A01.A07(other, j));
                            C58546PxE.A04(message, iArr[i + 2] & 1048575, i4);
                            i += 3;
                        }
                    case 60:
                    case 68:
                        if (A0F(other, i4, i)) {
                            long j3 = iArr[i2] & 1048575;
                            Unsafe unsafe2 = A0E;
                            Object object3 = unsafe2.getObject(other, j3);
                            if (object3 != null) {
                                InterfaceC65595Tne A032 = A03(i);
                                if (!A0F(message, i4, i)) {
                                    if (!A0D(object3)) {
                                        unsafe2.putObject(message, j3, object3);
                                    } else {
                                        AbstractC58533Px1 CsQ3 = A032.CsQ();
                                        A032.CpL(CsQ3, object3);
                                        unsafe2.putObject(message, j3, CsQ3);
                                    }
                                    C58546PxE.A04(message, iArr[i + 2] & 1048575, i4);
                                } else {
                                    Object object4 = unsafe2.getObject(message, j3);
                                    if (!A0D(object4)) {
                                        AbstractC58533Px1 CsQ4 = A032.CsQ();
                                        A032.CpL(CsQ4, object4);
                                        unsafe2.putObject(message, j3, CsQ4);
                                        object4 = CsQ4;
                                    }
                                    A032.CpL(object4, object3);
                                }
                            } else {
                                StringBuilder A1C2 = AbstractC166987dD.A1C();
                                A1C2.append("Source subfield ");
                                A1C2.append(iArr[i]);
                                throw AbstractC43594JPz.A0o(other, " is present but null: ", A1C2);
                            }
                        } else {
                            continue;
                        }
                        i += 3;
                    default:
                        i += 3;
                }
            } else {
                PxW.A00(message, other);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0489, code lost:
    
        throw X.C61032Re1.A00();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x007d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0035 A[SYNTHETIC] */
    @Override // X.InterfaceC65595Tne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CpN(X.C58545PxD r18, X.C58534Px2 r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58543PxB.CpN(X.PxD, X.Px2, java.lang.Object):void");
    }

    @Override // X.InterfaceC65595Tne
    public final AbstractC58533Px1 CsQ() {
        return (AbstractC58533Px1) ((AbstractC58533Px1) this.A04).A0F(C05F.A0N);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0039. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0302 A[LOOP:3: B:127:0x0302->B:129:0x0308, LOOP_START, PHI: r4
      0x0302: PHI (r4v61 int) = (r4v60 int), (r4v62 int) binds: [B:116:0x02d8, B:129:0x0308] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0356 A[LOOP:6: B:150:0x0356->B:152:0x035c, LOOP_START, PHI: r8
      0x0356: PHI (r8v79 int) = (r8v78 int), (r8v80 int) binds: [B:139:0x0328, B:152:0x035c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ae A[LOOP:9: B:173:0x03ae->B:175:0x03b4, LOOP_START, PHI: r4
      0x03ae: PHI (r4v52 int) = (r4v51 int), (r4v53 int) binds: [B:162:0x0380, B:175:0x03b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0402 A[LOOP:12: B:196:0x0402->B:198:0x0408, LOOP_START, PHI: r4
      0x0402: PHI (r4v47 int) = (r4v46 int), (r4v48 int) binds: [B:185:0x03d4, B:198:0x0408] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0464 A[LOOP:15: B:231:0x0464->B:233:0x046a, LOOP_START, PHI: r4
      0x0464: PHI (r4v42 int) = (r4v41 int), (r4v43 int) binds: [B:208:0x0428, B:233:0x046a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04b4 A[LOOP:18: B:254:0x04b4->B:256:0x04ba, LOOP_START, PHI: r4
      0x04b4: PHI (r4v37 int) = (r4v36 int), (r4v38 int) binds: [B:243:0x048a, B:256:0x04ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC65595Tne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FEp(X.C62650SKj r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 2544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58543PxB.FEp(X.SKj, java.lang.Object):void");
    }

    public C58543PxB(AbstractC58532Px0 abstractC58532Px0, S3S s3s, SK5 sk5, SST sst, S3U s3u, SK0 sk0, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A06 = iArr;
        this.A08 = objArr;
        this.A02 = i;
        this.A01 = i2;
        this.A0D = abstractC58532Px0 instanceof AbstractC58533Px1;
        this.A07 = iArr2;
        this.A00 = i3;
        this.A03 = i4;
        this.A0B = s3u;
        this.A05 = sk5;
        this.A0C = sk0;
        this.A09 = s3s;
        this.A04 = abstractC58532Px0;
        this.A0A = sst;
    }

    private Object A04(int message, int fieldNumber, Object pos) {
        InterfaceC65595Tne A03 = A03(fieldNumber);
        if (!A0F(pos, message, fieldNumber)) {
            return A03.CsQ();
        }
        Object object = A0E.getObject(pos, AbstractC58318PtA.A0A(this.A06[fieldNumber + 1]));
        if (A0D(object)) {
            return object;
        }
        AbstractC58533Px1 CsQ = A03.CsQ();
        if (object != null) {
            A03.CpL(CsQ, object);
        }
        return CsQ;
    }

    private Object A05(Object message, int pos) {
        InterfaceC65595Tne A03 = A03(pos);
        long A0A = AbstractC58318PtA.A0A(this.A06[pos + 1]);
        if (!A0E(message, pos)) {
            return A03.CsQ();
        }
        Object object = A0E.getObject(message, A0A);
        if (A0D(object)) {
            return object;
        }
        AbstractC58533Px1 CsQ = A03.CsQ();
        if (object != null) {
            A03.CpL(CsQ, object);
        }
        return CsQ;
    }

    public static Field A06(Class messageClass, String fieldName) {
        try {
            return messageClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = messageClass.getDeclaredFields();
            for (Field field : declaredFields) {
                if (fieldName.equals(field.getName())) {
                    return field;
                }
            }
            throw AbstractC58321PtD.A0r(messageClass, fieldName, declaredFields);
        }
    }

    public static void A0A(Object message) {
        if (A0D(message)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Mutating immutable message: ");
        sb.append(message);
        throw new IllegalArgumentException(sb.toString());
    }

    private boolean A0G(Object message, int pos, int presenceFieldOffset, int presenceField, int presenceMask) {
        if (presenceFieldOffset == 1048575) {
            return A0E(message, pos);
        }
        return AbstractC167007dF.A1M(presenceField & presenceMask);
    }

    @Override // X.InterfaceC65595Tne
    public final boolean CWb(Object message) {
        boolean A0G;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A00) {
            int i4 = this.A07[i3];
            int[] iArr = this.A06;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i) {
                if (i8 != 1048575) {
                    i2 = A0E.getInt(message, i8);
                }
            } else {
                i8 = i;
            }
            if ((268435456 & i6) == 0 || A0G(message, i4, i8, i2, i9)) {
                int A02 = AbstractC58318PtA.A02(i6);
                if (A02 != 9 && A02 != 17) {
                    if (A02 != 27) {
                        if (A02 != 60 && A02 != 68) {
                            if (A02 != 49) {
                                if (A02 == 50 && !((TZp) PxF.A00(message, i6 & 1048575)).isEmpty()) {
                                    throw AbstractC166987dD.A15("getMetadata");
                                }
                                i3++;
                                i = i8;
                            }
                        } else {
                            A0G = A0F(message, i5, i4);
                        }
                    }
                    List list = (List) PxF.A00(message, i6 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC65595Tne A03 = A03(i4);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (A03.CWb(list.get(i10))) {
                            }
                        }
                    }
                    i3++;
                    i = i8;
                } else {
                    A0G = A0G(message, i4, i8, i2, i9);
                }
                if (A0G && !A03(i4).CWb(PxF.A00(message, i6 & 1048575))) {
                    return false;
                }
                i3++;
                i = i8;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0041 A[SYNTHETIC] */
    @Override // X.InterfaceC65595Tne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cmk(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = A0D(r10)
            if (r0 == 0) goto Laf
            boolean r0 = r10 instanceof X.AbstractC58533Px1
            if (r0 == 0) goto L1e
            r3 = r10
            X.Px1 r3 = (X.AbstractC58533Px1) r3
            int r1 = r3.memoizedSerializedSize
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 | r2
            r3.memoizedSerializedSize = r1
            r0 = 0
            r3.memoizedHashCode = r0
            r1 = r1 & r2
            r3.memoizedSerializedSize = r1
        L1e:
            int[] r8 = r9.A06
            int r7 = r8.length
            r6 = 0
        L22:
            if (r6 >= r7) goto La4
            int r0 = r6 + 1
            r1 = r8[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r2 = (long) r0
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r0
            int r1 = r1 >>> 20
            r0 = 9
            if (r1 == r0) goto L89
            r0 = 60
            if (r1 == r0) goto L8e
            r0 = 68
            if (r1 == r0) goto L8e
            switch(r1) {
                case 17: goto L89;
                case 18: goto L44;
                case 19: goto L44;
                case 20: goto L44;
                case 21: goto L44;
                case 22: goto L44;
                case 23: goto L44;
                case 24: goto L44;
                case 25: goto L44;
                case 26: goto L44;
                case 27: goto L44;
                case 28: goto L44;
                case 29: goto L44;
                case 30: goto L44;
                case 31: goto L44;
                case 32: goto L44;
                case 33: goto L44;
                case 34: goto L44;
                case 35: goto L44;
                case 36: goto L44;
                case 37: goto L44;
                case 38: goto L44;
                case 39: goto L44;
                case 40: goto L44;
                case 41: goto L44;
                case 42: goto L44;
                case 43: goto L44;
                case 44: goto L44;
                case 45: goto L44;
                case 46: goto L44;
                case 47: goto L44;
                case 48: goto L44;
                case 49: goto L44;
                case 50: goto L77;
                default: goto L41;
            }
        L41:
            int r6 = r6 + 3
            goto L22
        L44:
            X.SK5 r0 = r9.A05
            boolean r0 = r0 instanceof X.RVF
            java.lang.Object r1 = X.PxF.A00(r10, r2)
            if (r0 == 0) goto L5a
            X.TsC r1 = (X.InterfaceC65690TsC) r1
            X.Px5 r1 = (X.AbstractC58537Px5) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L41
            r0 = 0
            r1.A00 = r0
            goto L41
        L5a:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof X.InterfaceC65686Ts8
            if (r0 == 0) goto L6a
            X.Ts8 r1 = (X.InterfaceC65686Ts8) r1
            X.Ts8 r0 = r1.CCn()
        L66:
            X.C58546PxE.A05(r10, r2, r0)
            goto L41
        L6a:
            java.lang.Class r0 = X.RVG.A00
            boolean r0 = X.AbstractC58321PtD.A1W(r0, r1)
            if (r0 != 0) goto L41
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L66
        L77:
            sun.misc.Unsafe r5 = X.C58543PxB.A0E
            java.lang.Object r4 = r5.getObject(r10, r2)
            if (r4 == 0) goto L41
            r1 = r4
            X.TZp r1 = (X.TZp) r1
            r0 = 0
            r1.A00 = r0
            r5.putObject(r10, r2, r4)
            goto L41
        L89:
            boolean r0 = r9.A0E(r10, r6)
            goto L94
        L8e:
            r0 = r8[r6]
            boolean r0 = r9.A0F(r10, r0, r6)
        L94:
            if (r0 == 0) goto L41
            X.Tne r1 = r9.A03(r6)
            sun.misc.Unsafe r0 = X.C58543PxB.A0E
            java.lang.Object r0 = r0.getObject(r10, r2)
            r1.Cmk(r0)
            goto L41
        La4:
            X.Px1 r10 = (X.AbstractC58533Px1) r10
            X.PxV r1 = r10.unknownFields
            boolean r0 = r1.A02
            if (r0 == 0) goto Laf
            r0 = 0
            r1.A02 = r0
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58543PxB.Cmk(java.lang.Object):void");
    }
}
