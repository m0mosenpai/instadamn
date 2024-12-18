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
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.TEc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64444TEc implements InterfaceC65567Tmt {
    public final S99 A00;
    public final int[] A01;
    public final int A02;
    public final int A03;
    public final TEY A04;
    public final C62234S3f A05;
    public final C62235S3g A06;
    public final C62236S3h A07;
    public final C62238S3j A08;
    public final int[] A09;
    public final Object[] A0A;
    public static final int[] A0C = new int[0];
    public static final Unsafe A0B = C63388Sj4.A03();

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b2, code lost:
    
        if (r27 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x026d, code lost:
    
        if (r14.charAt(r0) >= 55296) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x026f, code lost:
    
        r0 = r14.charAt(r3);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0276, code lost:
    
        if (r0 < 55296) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0279, code lost:
    
        r2 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x027f, code lost:
    
        if (r14.charAt(r3) < 55296) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0281, code lost:
    
        r0 = r14.charAt(r2);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0288, code lost:
    
        if (r0 < 55296) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x028b, code lost:
    
        r0 = r2 + 1;
        r7 = r14.charAt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0291, code lost:
    
        if (r7 < 55296) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0293, code lost:
    
        r7 = r7 & 8191;
        r2 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0297, code lost:
    
        r1 = r0 + 1;
        r0 = r14.charAt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x029d, code lost:
    
        if (r0 < 55296) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x029f, code lost:
    
        r7 = X.AbstractC58318PtA.A03(r0, r2, r7);
        r2 = r2 + 13;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02a7, code lost:
    
        r7 = r7 | (r0 << r2);
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02aa, code lost:
    
        r3 = r0 + 1;
        r5 = r14.charAt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02b0, code lost:
    
        if (r5 < 55296) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02b2, code lost:
    
        r5 = r5 & 8191;
        r2 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02b6, code lost:
    
        r1 = r3 + 1;
        r0 = r14.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02bc, code lost:
    
        if (r0 < 55296) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02be, code lost:
    
        r5 = X.AbstractC58318PtA.A03(r0, r2, r5);
        r2 = r2 + 13;
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02c6, code lost:
    
        r5 = r5 | (r0 << r2);
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02c9, code lost:
    
        r0 = r3 + 1;
        r10 = r14.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02cf, code lost:
    
        if (r10 < 55296) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02d1, code lost:
    
        r10 = r10 & 8191;
        r2 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02d5, code lost:
    
        r1 = r0 + 1;
        r0 = r14.charAt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02db, code lost:
    
        if (r0 < 55296) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02dd, code lost:
    
        r10 = X.AbstractC58318PtA.A03(r0, r2, r10);
        r2 = r2 + 13;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02e5, code lost:
    
        r10 = r10 | (r0 << r2);
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02e8, code lost:
    
        r6 = r0 + 1;
        r3 = r14.charAt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ee, code lost:
    
        if (r3 < 55296) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02f0, code lost:
    
        r3 = r3 & 8191;
        r2 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02f4, code lost:
    
        r1 = r6 + 1;
        r0 = r14.charAt(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02fa, code lost:
    
        if (r0 < 55296) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02fc, code lost:
    
        r3 = X.AbstractC58318PtA.A03(r0, r2, r3);
        r2 = r2 + 13;
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0304, code lost:
    
        r3 = r3 | (r0 << r2);
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0307, code lost:
    
        r25 = new int[(r3 + r5) + r10];
        r0 = (r4 * 2) + r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C64444TEc A00(X.C62234S3f r38, X.S99 r39, X.C62235S3g r40, X.C62236S3h r41, X.SHr r42, X.C62238S3j r43) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64444TEc.A00(X.S3f, X.S99, X.S3g, X.S3h, X.SHr, X.S3j):X.TEc");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0022. Please report as an issue. */
    private boolean A02(Object obj, int i) {
        Object A06;
        AbstractC64535TIr abstractC64535TIr;
        boolean isEmpty;
        int[] iArr = this.A01;
        int i2 = iArr[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = i3 & 1048575;
            switch (AbstractC58318PtA.A02(i3)) {
                case 0:
                    if (Double.doubleToRawLongBits(C63388Sj4.A01.A01(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C63388Sj4.A01.A02(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C63388Sj4.A01.A05(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                    if (C63388Sj4.A01.A04(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return C63388Sj4.A01.A0H(obj, j2);
                case 8:
                    A06 = C63388Sj4.A01.A06(obj, j2);
                    if (A06 instanceof String) {
                        isEmpty = ((String) A06).isEmpty();
                        return !isEmpty;
                    }
                    if (A06 instanceof AbstractC64535TIr) {
                        abstractC64535TIr = AbstractC64535TIr.A01;
                        isEmpty = abstractC64535TIr.equals(A06);
                        return !isEmpty;
                    }
                    throw AbstractC58318PtA.A0Y();
                case 9:
                case 17:
                    if (C63388Sj4.A01.A06(obj, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    abstractC64535TIr = AbstractC64535TIr.A01;
                    A06 = C63388Sj4.A01.A06(obj, j2);
                    isEmpty = abstractC64535TIr.equals(A06);
                    return !isEmpty;
                default:
                    throw AbstractC58318PtA.A0Y();
            }
        } else {
            if ((C63388Sj4.A01.A04(obj, j) & (1 << (i2 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean A03(Object obj, int i, int i2) {
        return AbstractC167007dF.A1P(C63388Sj4.A01.A04(obj, AbstractC58319PtB.A03(i2, this.A01)), i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0016 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // X.InterfaceC65567Tmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AT0(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A01
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L5:
            if (r5 >= r6) goto Lcb
            int r0 = r5 + 1
            r2 = r7[r0]
            long r0 = X.AbstractC58318PtA.A0A(r2)
            int r2 = X.AbstractC58318PtA.A02(r2)
            switch(r2) {
                case 0: goto L19;
                case 1: goto L36;
                case 2: goto L53;
                case 3: goto L53;
                case 4: goto L6c;
                case 5: goto L53;
                case 6: goto L6c;
                case 7: goto L81;
                case 8: goto L99;
                case 9: goto L99;
                case 10: goto L99;
                case 11: goto L6c;
                case 12: goto L6c;
                case 13: goto L6c;
                case 14: goto L53;
                case 15: goto L6c;
                case 16: goto L53;
                case 17: goto L99;
                case 18: goto Lb3;
                case 19: goto Lb3;
                case 20: goto Lb3;
                case 21: goto Lb3;
                case 22: goto Lb3;
                case 23: goto Lb3;
                case 24: goto Lb3;
                case 25: goto Lb3;
                case 26: goto Lb3;
                case 27: goto Lb3;
                case 28: goto Lb3;
                case 29: goto Lb3;
                case 30: goto Lb3;
                case 31: goto Lb3;
                case 32: goto Lb3;
                case 33: goto Lb3;
                case 34: goto Lb3;
                case 35: goto Lb3;
                case 36: goto Lb3;
                case 37: goto Lb3;
                case 38: goto Lb3;
                case 39: goto Lb3;
                case 40: goto Lb3;
                case 41: goto Lb3;
                case 42: goto Lb3;
                case 43: goto Lb3;
                case 44: goto Lb3;
                case 45: goto Lb3;
                case 46: goto Lb3;
                case 47: goto Lb3;
                case 48: goto Lb3;
                case 49: goto Lb3;
                case 50: goto Lb3;
                case 51: goto La2;
                case 52: goto La2;
                case 53: goto La2;
                case 54: goto La2;
                case 55: goto La2;
                case 56: goto La2;
                case 57: goto La2;
                case 58: goto La2;
                case 59: goto La2;
                case 60: goto La2;
                case 61: goto La2;
                case 62: goto La2;
                case 63: goto La2;
                case 64: goto La2;
                case 65: goto La2;
                case 66: goto La2;
                case 67: goto La2;
                case 68: goto La2;
                default: goto L16;
            }
        L16:
            int r5 = r5 + 3
            goto L5
        L19:
            boolean r3 = r10.A02(r11, r5)
            boolean r2 = r10.A02(r12, r5)
            if (r3 != r2) goto Lda
            X.SQH r8 = X.C63388Sj4.A01
            double r2 = r8.A01(r11, r0)
            long r3 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r8.A01(r12, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L67
        L36:
            boolean r3 = r10.A02(r11, r5)
            boolean r2 = r10.A02(r12, r5)
            if (r3 != r2) goto Lda
            X.SQH r4 = X.C63388Sj4.A01
            float r2 = r4.A02(r11, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r4.A02(r12, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L95
        L53:
            boolean r3 = r10.A02(r11, r5)
            boolean r2 = r10.A02(r12, r5)
            if (r3 != r2) goto Lda
            X.SQH r2 = X.C63388Sj4.A01
            long r3 = r2.A05(r11, r0)
            long r1 = r2.A05(r12, r0)
        L67:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lda
            goto L16
        L6c:
            boolean r3 = r10.A02(r11, r5)
            boolean r2 = r10.A02(r12, r5)
            if (r3 != r2) goto Lda
            X.SQH r2 = X.C63388Sj4.A01
            int r3 = r2.A04(r11, r0)
            int r0 = r2.A04(r12, r0)
            goto L95
        L81:
            boolean r3 = r10.A02(r11, r5)
            boolean r2 = r10.A02(r12, r5)
            if (r3 != r2) goto Lda
            X.SQH r2 = X.C63388Sj4.A01
            boolean r3 = r2.A0H(r11, r0)
            boolean r0 = r2.A0H(r12, r0)
        L95:
            if (r3 != r0) goto Lda
            goto L16
        L99:
            boolean r8 = r10.A02(r11, r5)
            boolean r2 = r10.A02(r12, r5)
            goto Lb1
        La2:
            int r2 = X.AbstractC58319PtB.A03(r5, r7)
            long r2 = (long) r2
            X.SQH r4 = X.C63388Sj4.A01
            int r8 = r4.A04(r11, r2)
            int r2 = r4.A04(r12, r2)
        Lb1:
            if (r8 != r2) goto Lda
        Lb3:
            X.SQH r3 = X.C63388Sj4.A01
            java.lang.Object r2 = r3.A06(r11, r0)
            java.lang.Object r1 = r3.A06(r12, r0)
            X.S3j r0 = X.SV3.A02
            if (r2 == r1) goto L16
            if (r2 == 0) goto Lda
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto Lda
            goto L16
        Lcb:
            X.RaB r11 = (X.RaB) r11
            X.SZh r1 = r11.unknownFields
            X.RaB r12 = (X.RaB) r12
            X.SZh r0 = r12.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lda
            r9 = 1
        Lda:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64444TEc.AT0(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0017. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65567Tmt
    public final int CME(Object obj) {
        int i;
        double A01;
        float A02;
        long A05;
        int A04;
        int i2;
        int[] iArr = this.A01;
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
                    A01 = C63388Sj4.A01.A01(obj, A0A);
                    A05 = Double.doubleToLongBits(A01);
                    Charset charset = SVC.A04;
                    A04 = AbstractC25228BEl.A03(A05);
                    i3 = i + A04;
                    break;
                case 1:
                    i = i3 * 53;
                    A02 = C63388Sj4.A01.A02(obj, A0A);
                    A04 = Float.floatToIntBits(A02);
                    i3 = i + A04;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i3 * 53;
                    A05 = C63388Sj4.A01.A05(obj, A0A);
                    Charset charset2 = SVC.A04;
                    A04 = AbstractC25228BEl.A03(A05);
                    i3 = i + A04;
                    break;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                    i = i3 * 53;
                    A04 = C63388Sj4.A01.A04(obj, A0A);
                    i3 = i + A04;
                    break;
                case 7:
                    i = i3 * 53;
                    i2 = C63388Sj4.A01.A0H(obj, A0A);
                    Charset charset3 = SVC.A04;
                    A04 = AbstractC58322PtE.A02(i2);
                    i3 = i + A04;
                    break;
                case 8:
                    i = i3 * 53;
                    A04 = ((String) C63388Sj4.A01.A06(obj, A0A)).hashCode();
                    i3 = i + A04;
                    break;
                case 9:
                case 17:
                    Object A06 = C63388Sj4.A01.A06(obj, A0A);
                    if (A06 != null) {
                        i7 = A06.hashCode();
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
                    A04 = C63388Sj4.A01.A06(obj, A0A).hashCode();
                    i3 = i + A04;
                    break;
                case 51:
                    if (A03(obj, i6, i4)) {
                        i = i3 * 53;
                        A01 = MSW.A00(C63388Sj4.A01.A06(obj, A0A));
                        A05 = Double.doubleToLongBits(A01);
                        Charset charset22 = SVC.A04;
                        A04 = AbstractC25228BEl.A03(A05);
                        i3 = i + A04;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (A03(obj, i6, i4)) {
                        i = i3 * 53;
                        A02 = AbstractC166987dD.A09(C63388Sj4.A01.A06(obj, A0A));
                        A04 = Float.floatToIntBits(A02);
                        i3 = i + A04;
                        break;
                    } else {
                        break;
                    }
                case 53:
                case 54:
                case 56:
                case 65:
                case 67:
                    if (A03(obj, i6, i4)) {
                        i = i3 * 53;
                        A05 = AbstractC166987dD.A0N(C63388Sj4.A01.A06(obj, A0A));
                        Charset charset222 = SVC.A04;
                        A04 = AbstractC25228BEl.A03(A05);
                        i3 = i + A04;
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
                    if (A03(obj, i6, i4)) {
                        i = i3 * 53;
                        A04 = AbstractC166987dD.A0H(C63388Sj4.A01.A06(obj, A0A));
                        i3 = i + A04;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (A03(obj, i6, i4)) {
                        i = i3 * 53;
                        i2 = AbstractC166987dD.A1a(C63388Sj4.A01.A06(obj, A0A));
                        Charset charset32 = SVC.A04;
                        A04 = AbstractC58322PtE.A02(i2);
                        i3 = i + A04;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!A03(obj, i6, i4)) {
                        break;
                    }
                    i = i3 * 53;
                    A04 = ((String) C63388Sj4.A01.A06(obj, A0A)).hashCode();
                    i3 = i + A04;
                    break;
                case 60:
                case 61:
                case 68:
                    if (!A03(obj, i6, i4)) {
                        break;
                    }
                    i = i3 * 53;
                    A04 = C63388Sj4.A01.A06(obj, A0A).hashCode();
                    i3 = i + A04;
                    break;
            }
        }
        return AbstractC166987dD.A0I(((RaB) obj).unknownFields, i3 * 53);
    }

    @Override // X.InterfaceC65567Tmt
    public final void Cmk(Object obj) {
        int i;
        Object unmodifiableList;
        int i2 = this.A02;
        while (true) {
            i = this.A03;
            if (i2 >= i) {
                break;
            }
            long A0A = AbstractC58318PtA.A0A(this.A01[this.A09[i2] + 1]);
            Object A06 = C63388Sj4.A01.A06(obj, A0A);
            if (A06 != null) {
                ((C64914TZo) A06).A00 = false;
                C63388Sj4.A04(obj, A0A, A06);
            }
            i2++;
        }
        int[] iArr = this.A09;
        int length = iArr.length;
        while (i < length) {
            S99 s99 = this.A00;
            long j = iArr[i];
            boolean z = s99 instanceof RaC;
            Object A062 = C63388Sj4.A01.A06(obj, j);
            if (z) {
                ((TZA) ((InterfaceC65692TsE) A062)).A00 = false;
            } else {
                List list = (List) A062;
                if (list instanceof InterfaceC65683Ts5) {
                    unmodifiableList = ((InterfaceC65683Ts5) list).CCp();
                } else if (!AbstractC58321PtD.A1W(RaD.A00, list)) {
                    unmodifiableList = Collections.unmodifiableList(list);
                }
                C63388Sj4.A04(obj, j, unmodifiableList);
            }
            i++;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x001e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.LinkedHashMap, X.TZo] */
    @Override // X.InterfaceC65567Tmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CpL(java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64444TEc.CpL(java.lang.Object, java.lang.Object):void");
    }

    public C64444TEc(TEY tey, C62234S3f c62234S3f, S99 s99, C62235S3g c62235S3g, C62236S3h c62236S3h, C62238S3j c62238S3j, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2) {
        this.A01 = iArr;
        this.A0A = objArr;
        this.A09 = iArr2;
        this.A02 = i;
        this.A03 = i2;
        this.A07 = c62236S3h;
        this.A00 = s99;
        this.A08 = c62238S3j;
        this.A05 = c62234S3f;
        this.A04 = tey;
        this.A06 = c62235S3g;
    }

    public static Field A01(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw AbstractC58321PtD.A0r(cls, str, declaredFields);
        }
    }
}
