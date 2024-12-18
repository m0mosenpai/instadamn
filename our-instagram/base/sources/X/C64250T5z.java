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
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.T5z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64250T5z implements InterfaceC65579TnE {
    public final int[] A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final S2R A05;
    public final AbstractC62362S8m A06;
    public final S2S A07;
    public final InterfaceC65255Tgl A08;
    public final S2T A09;
    public final S2V A0A;
    public final int[] A0B;
    public final Object[] A0C;
    public static final int[] A0E = new int[0];
    public static final Unsafe A0D = C63405Sja.A03();

    public C64250T5z(S2R s2r, AbstractC62362S8m abstractC62362S8m, S2S s2s, InterfaceC65255Tgl interfaceC65255Tgl, S2T s2t, S2V s2v, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A00 = iArr;
        this.A0C = objArr;
        this.A01 = i;
        this.A02 = i2;
        this.A0B = iArr2;
        this.A03 = i3;
        this.A04 = i4;
        this.A09 = s2t;
        this.A06 = abstractC62362S8m;
        this.A0A = s2v;
        this.A05 = s2r;
        this.A08 = interfaceC65255Tgl;
        this.A07 = s2s;
    }

    public static Field A04(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw AbstractC166987dD.A18(AnonymousClass001.A13("Field ", str, " for ", cls.getName(), " not found. Known fields are ", Arrays.toString(declaredFields)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65579TnE
    public final int FFX(Object obj) {
        int i;
        double A00;
        int floatToIntBits;
        long A01;
        boolean A1M;
        boolean A1M2;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.A00;
            if (i3 < iArr.length) {
                int i5 = iArr[i3 + 1];
                int i6 = 1048575 & i5;
                int i7 = (i5 >>> 20) & 255;
                int i8 = iArr[i3];
                long j = i6;
                int i9 = 37;
                switch (i7) {
                    case 0:
                        i = i4 * 53;
                        A00 = C63405Sja.A00.A00(obj, j);
                        A01 = Double.doubleToLongBits(A00);
                        Charset charset = AbstractC62394S9t.A02;
                        i4 = AbstractC58321PtD.A08(A01, i);
                        break;
                    case 1:
                        i9 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(C63405Sja.A00.A01(obj, j));
                        i4 = floatToIntBits + i9;
                        break;
                    case 2:
                    case 3:
                    case 5:
                    case 14:
                    case 16:
                        i = i4 * 53;
                        A01 = C63405Sja.A01(obj, j);
                        Charset charset2 = AbstractC62394S9t.A02;
                        i4 = AbstractC58321PtD.A08(A01, i);
                        break;
                    case 4:
                    case 6:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case Process.SIGTERM /* 15 */:
                        i9 = i4 * 53;
                        floatToIntBits = C63405Sja.A00(obj, j);
                        i4 = floatToIntBits + i9;
                        break;
                    case 7:
                        i9 = i4 * 53;
                        if (!C63405Sja.A01) {
                            A1M = AbstractC167007dF.A1M(AbstractC58323PtF.A00(C63405Sja.A00.A00.getInt(obj, (-4) & j), j));
                            i2 = A1M;
                        } else {
                            A1M2 = AbstractC167007dF.A1M(AbstractC58323PtF.A00(C63405Sja.A00.A00.getInt(obj, (-4) & j), j ^ (-1)));
                            i2 = A1M2;
                        }
                        Charset charset3 = AbstractC62394S9t.A02;
                        floatToIntBits = AbstractC58322PtE.A02(i2);
                        i4 = floatToIntBits + i9;
                        break;
                    case 8:
                        i9 = i4 * 53;
                        floatToIntBits = ((String) C63405Sja.A02(obj, j)).hashCode();
                        i4 = floatToIntBits + i9;
                        break;
                    case 9:
                    case 17:
                        floatToIntBits = i4 * 53;
                        Object A02 = C63405Sja.A02(obj, j);
                        if (A02 != null) {
                            i9 = A02.hashCode();
                        }
                        i4 = floatToIntBits + i9;
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
                        i9 = i4 * 53;
                        floatToIntBits = C63405Sja.A02(obj, j).hashCode();
                        i4 = floatToIntBits + i9;
                        break;
                    case 51:
                        if (!A08(obj, i8, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            A00 = MSW.A00(C63405Sja.A02(obj, j));
                            A01 = Double.doubleToLongBits(A00);
                            Charset charset22 = AbstractC62394S9t.A02;
                            i4 = AbstractC58321PtD.A08(A01, i);
                            break;
                        }
                    case 52:
                        if (!A08(obj, i8, i3)) {
                            break;
                        } else {
                            i9 = i4 * 53;
                            floatToIntBits = Float.floatToIntBits(AbstractC166987dD.A09(C63405Sja.A02(obj, j)));
                            i4 = floatToIntBits + i9;
                            break;
                        }
                    case 53:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i = i4 * 53;
                        A01 = AbstractC166987dD.A0N(C63405Sja.A02(obj, j));
                        Charset charset222 = AbstractC62394S9t.A02;
                        i4 = AbstractC58321PtD.A08(A01, i);
                        break;
                    case 54:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i = i4 * 53;
                        A01 = AbstractC166987dD.A0N(C63405Sja.A02(obj, j));
                        Charset charset2222 = AbstractC62394S9t.A02;
                        i4 = AbstractC58321PtD.A08(A01, i);
                        break;
                    case 55:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i9 = i4 * 53;
                        floatToIntBits = AbstractC166987dD.A0H(C63405Sja.A02(obj, j));
                        i4 = floatToIntBits + i9;
                        break;
                    case 56:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i = i4 * 53;
                        A01 = AbstractC166987dD.A0N(C63405Sja.A02(obj, j));
                        Charset charset22222 = AbstractC62394S9t.A02;
                        i4 = AbstractC58321PtD.A08(A01, i);
                        break;
                    case 57:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i9 = i4 * 53;
                        floatToIntBits = AbstractC166987dD.A0H(C63405Sja.A02(obj, j));
                        i4 = floatToIntBits + i9;
                        break;
                    case 58:
                        if (!A08(obj, i8, i3)) {
                            break;
                        } else {
                            i9 = i4 * 53;
                            i2 = AbstractC166987dD.A1a(C63405Sja.A02(obj, j));
                            Charset charset32 = AbstractC62394S9t.A02;
                            floatToIntBits = AbstractC58322PtE.A02(i2);
                            i4 = floatToIntBits + i9;
                            break;
                        }
                    case 59:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i9 = i4 * 53;
                        floatToIntBits = ((String) C63405Sja.A02(obj, j)).hashCode();
                        i4 = floatToIntBits + i9;
                        break;
                    case 60:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i9 = i4 * 53;
                        floatToIntBits = C63405Sja.A02(obj, j).hashCode();
                        i4 = floatToIntBits + i9;
                        break;
                    case 61:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i9 = i4 * 53;
                        floatToIntBits = C63405Sja.A02(obj, j).hashCode();
                        i4 = floatToIntBits + i9;
                        break;
                    case 62:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i9 = i4 * 53;
                        floatToIntBits = AbstractC166987dD.A0H(C63405Sja.A02(obj, j));
                        i4 = floatToIntBits + i9;
                        break;
                    case StringTreeSet.PAYLOAD_MASK /* 63 */:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i9 = i4 * 53;
                        floatToIntBits = AbstractC166987dD.A0H(C63405Sja.A02(obj, j));
                        i4 = floatToIntBits + i9;
                        break;
                    case 64:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i9 = i4 * 53;
                        floatToIntBits = AbstractC166987dD.A0H(C63405Sja.A02(obj, j));
                        i4 = floatToIntBits + i9;
                        break;
                    case 65:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i = i4 * 53;
                        A01 = AbstractC166987dD.A0N(C63405Sja.A02(obj, j));
                        Charset charset222222 = AbstractC62394S9t.A02;
                        i4 = AbstractC58321PtD.A08(A01, i);
                        break;
                    case 66:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i9 = i4 * 53;
                        floatToIntBits = AbstractC166987dD.A0H(C63405Sja.A02(obj, j));
                        i4 = floatToIntBits + i9;
                        break;
                    case 67:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i = i4 * 53;
                        A01 = AbstractC166987dD.A0N(C63405Sja.A02(obj, j));
                        Charset charset2222222 = AbstractC62394S9t.A02;
                        i4 = AbstractC58321PtD.A08(A01, i);
                        break;
                    case 68:
                        if (!A08(obj, i8, i3)) {
                            break;
                        }
                        i9 = i4 * 53;
                        floatToIntBits = C63405Sja.A02(obj, j).hashCode();
                        i4 = floatToIntBits + i9;
                        break;
                }
                i3 += 3;
            } else {
                return AbstractC166987dD.A0I(((RLJ) obj).zzc, i4 * 53);
            }
        }
    }

    @Override // X.InterfaceC65579TnE
    public final void FGT(C62904SWl c62904SWl, Object obj, byte[] bArr, int i, int i2) {
        A09(c62904SWl, obj, bArr, i, i2, 0);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0018 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e4 A[SYNTHETIC] */
    @Override // X.InterfaceC65579TnE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean FGZ(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r8 = 0
            r4 = 0
        L2:
            int[] r5 = r9.A00
            int r0 = r5.length
            if (r4 >= r0) goto Ld5
            int r0 = r4 + 1
            r0 = r5[r0]
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r0 & r3
            int r0 = r0 >>> 20
            r2 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r1
            switch(r2) {
                case 0: goto L8d;
                case 1: goto L6e;
                case 2: goto L5b;
                case 3: goto L5b;
                case 4: goto L48;
                case 5: goto L5b;
                case 6: goto L48;
                case 7: goto L25;
                case 8: goto L1b;
                case 9: goto L1b;
                case 10: goto L1b;
                case 11: goto L48;
                case 12: goto L48;
                case 13: goto L48;
                case 14: goto L5b;
                case 15: goto L48;
                case 16: goto L5b;
                case 17: goto L1b;
                case 18: goto Lbf;
                case 19: goto Lbf;
                case 20: goto Lbf;
                case 21: goto Lbf;
                case 22: goto Lbf;
                case 23: goto Lbf;
                case 24: goto Lbf;
                case 25: goto Lbf;
                case 26: goto Lbf;
                case 27: goto Lbf;
                case 28: goto Lbf;
                case 29: goto Lbf;
                case 30: goto Lbf;
                case 31: goto Lbf;
                case 32: goto Lbf;
                case 33: goto Lbf;
                case 34: goto Lbf;
                case 35: goto Lbf;
                case 36: goto Lbf;
                case 37: goto Lbf;
                case 38: goto Lbf;
                case 39: goto Lbf;
                case 40: goto Lbf;
                case 41: goto Lbf;
                case 42: goto Lbf;
                case 43: goto Lbf;
                case 44: goto Lbf;
                case 45: goto Lbf;
                case 46: goto Lbf;
                case 47: goto Lbf;
                case 48: goto Lbf;
                case 49: goto Lbf;
                case 50: goto Lbf;
                case 51: goto Laf;
                case 52: goto Laf;
                case 53: goto Laf;
                case 54: goto Laf;
                case 55: goto Laf;
                case 56: goto Laf;
                case 57: goto Laf;
                case 58: goto Laf;
                case 59: goto Laf;
                case 60: goto Laf;
                case 61: goto Laf;
                case 62: goto Laf;
                case 63: goto Laf;
                case 64: goto Laf;
                case 65: goto Laf;
                case 66: goto Laf;
                case 67: goto Laf;
                case 68: goto Laf;
                default: goto L18;
            }
        L18:
            int r4 = r4 + 3
            goto L2
        L1b:
            boolean r5 = r9.A07(r10, r4)
            boolean r2 = r9.A07(r11, r4)
            goto Lbd
        L25:
            boolean r3 = r9.A07(r10, r4)
            boolean r2 = r9.A07(r11, r4)
            if (r3 != r2) goto Le4
            boolean r3 = X.C63405Sja.A01
            if (r3 == 0) goto L3e
            boolean r2 = X.C63405Sja.A0D(r10, r0)
        L37:
            if (r3 == 0) goto L43
            boolean r0 = X.C63405Sja.A0D(r11, r0)
            goto L8a
        L3e:
            boolean r2 = X.C63405Sja.A0E(r10, r0)
            goto L37
        L43:
            boolean r0 = X.C63405Sja.A0E(r11, r0)
            goto L8a
        L48:
            boolean r3 = r9.A07(r10, r4)
            boolean r2 = r9.A07(r11, r4)
            if (r3 != r2) goto Le4
            int r2 = X.C63405Sja.A00(r10, r0)
            int r0 = X.C63405Sja.A00(r11, r0)
            goto L8a
        L5b:
            boolean r3 = r9.A07(r10, r4)
            boolean r2 = r9.A07(r11, r4)
            if (r3 != r2) goto Le4
            long r6 = X.C63405Sja.A01(r10, r0)
            long r1 = X.C63405Sja.A01(r11, r0)
            goto La9
        L6e:
            boolean r3 = r9.A07(r10, r4)
            boolean r2 = r9.A07(r11, r4)
            if (r3 != r2) goto Le4
            X.SPW r3 = X.C63405Sja.A00
            float r2 = r3.A01(r10, r0)
            int r2 = java.lang.Float.floatToIntBits(r2)
            float r0 = r3.A01(r11, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
        L8a:
            if (r2 != r0) goto Le4
            goto L18
        L8d:
            boolean r3 = r9.A07(r10, r4)
            boolean r2 = r9.A07(r11, r4)
            if (r3 != r2) goto Le4
            X.SPW r5 = X.C63405Sja.A00
            double r2 = r5.A00(r10, r0)
            long r6 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r5.A00(r11, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        La9:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Le4
            goto L18
        Laf:
            int r2 = r4 + 2
            r2 = r5[r2]
            r2 = r2 & r3
            long r2 = (long) r2
            int r5 = X.C63405Sja.A00(r10, r2)
            int r2 = X.C63405Sja.A00(r11, r2)
        Lbd:
            if (r5 != r2) goto Le4
        Lbf:
            java.lang.Object r2 = X.C63405Sja.A02(r10, r0)
            java.lang.Object r1 = X.C63405Sja.A02(r11, r0)
            X.S2V r0 = X.AbstractC62873SUx.A01
            if (r2 == r1) goto L18
            if (r2 == 0) goto Le4
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto Le4
            goto L18
        Ld5:
            X.RLJ r10 = (X.RLJ) r10
            X.Sh4 r1 = r10.zzc
            X.RLJ r11 = (X.RLJ) r11
            X.Sh4 r0 = r11.zzc
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le4
            r8 = 1
        Le4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64250T5z.FGZ(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ce, code lost:
    
        if (r15 == 0) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C64250T5z A00(X.S2R r40, X.AbstractC62362S8m r41, X.S2S r42, X.InterfaceC65254Tgk r43, X.S2T r44, X.S2V r45) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64250T5z.A00(X.S2R, X.S8m, X.S2S, X.Tgk, X.S2T, X.S2V):X.T5z");
    }

    private final InterfaceC65579TnE A01(int i) {
        Object[] objArr = this.A0C;
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC65579TnE interfaceC65579TnE = (InterfaceC65579TnE) objArr[i3];
        if (interfaceC65579TnE == null) {
            InterfaceC65579TnE A00 = SYV.A02.A00((Class) objArr[i3 + 1]);
            objArr[i3] = A00;
            return A00;
        }
        return interfaceC65579TnE;
    }

    private final void A05(Object obj, int i) {
        int i2 = this.A00[i + 2];
        long j = 1048575 & i2;
        if (j != 1048575) {
            C63405Sja.A07(obj, j, (1 << (i2 >>> 20)) | C63405Sja.A00(obj, j));
        }
    }

    public static boolean A06(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof RLJ) {
            return AbstractC167007dF.A1M(((RLJ) obj).zzd & Integer.MIN_VALUE);
        }
        return true;
    }

    private final boolean A07(Object obj, int i) {
        boolean A1M;
        boolean A1M2;
        int[] iArr = this.A00;
        int i2 = iArr[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = 1048575 & i3;
            switch ((i3 >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(C63405Sja.A00.A00(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C63405Sja.A00.A01(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C63405Sja.A01(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                    if (C63405Sja.A00(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    if (!C63405Sja.A01) {
                        A1M = AbstractC167007dF.A1M(AbstractC58323PtF.A00(C63405Sja.A00.A00.getInt(obj, (-4) & j2), j2));
                        return A1M;
                    }
                    A1M2 = AbstractC167007dF.A1M(AbstractC58323PtF.A00(C63405Sja.A00.A00.getInt(obj, (-4) & j2), j2 ^ (-1)));
                    return A1M2;
                case 8:
                    Object A02 = C63405Sja.A02(obj, j2);
                    if (A02 instanceof String) {
                        if (((String) A02).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (A02 instanceof AbstractC64536TIs) {
                        if (AbstractC64536TIs.A01.equals(A02)) {
                            return false;
                        }
                        return true;
                    }
                    throw AbstractC58318PtA.A0Y();
                case 9:
                case 17:
                    if (C63405Sja.A02(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC64536TIs.A01.equals(C63405Sja.A02(obj, j2))) {
                        return false;
                    }
                    return true;
                default:
                    throw AbstractC58318PtA.A0Y();
            }
        }
        if ((C63405Sja.A00(obj, j) & (1 << (i2 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean A08(Object obj, int i, int i2) {
        return AbstractC167007dF.A1P(C63405Sja.A00(obj, AbstractC58319PtB.A03(i2, this.A00)), i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x073f, code lost:
    
        throw X.C61029Rdx.A00("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0767, code lost:
    
        throw X.C61029Rdx.A00("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0738, code lost:
    
        throw X.C61029Rdx.A00("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0731, code lost:
    
        throw X.C61029Rdx.A00("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0759, code lost:
    
        throw X.C61029Rdx.A00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0752, code lost:
    
        throw X.C61029Rdx.A00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a2, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
    
        if (r0 == 1048575) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a9, code lost:
    
        r14.putInt(r36, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ad, code lost:
    
        r3 = r34.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b1, code lost:
    
        if (r3 >= r34.A04) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b3, code lost:
    
        X.C63405Sja.A02(r36, r34.A00[r34.A0B[r3] + 1] & 1048575);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0716, code lost:
    
        if (r40 != 0) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0718, code lost:
    
        if (r5 != r39) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x071a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x072a, code lost:
    
        throw X.C61029Rdx.A00("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x071b, code lost:
    
        if (r5 > r39) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0721, code lost:
    
        if (r17 != r40) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0723, code lost:
    
        return r5;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:274:0x03ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x0107. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:475:0x0092. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0732 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0558 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x05b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x06f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A09(X.C62904SWl r35, java.lang.Object r36, byte[] r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64250T5z.A09(X.SWl, java.lang.Object, byte[], int, int, int):int");
    }

    @Override // X.InterfaceC65579TnE
    public final RLJ FG5() {
        return new RLP();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0025. Please report as an issue. */
    @Override // X.InterfaceC65579TnE
    public final void FGN(Object obj, Object obj2) {
        boolean A1M;
        boolean A1M2;
        AbstractList rlk;
        Object object;
        InterfaceC65579TnE A01;
        Object object2;
        RLJ FG5;
        if (A06(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.A00;
                if (i < iArr.length) {
                    int i2 = iArr[i + 1];
                    int i3 = 1048575 & i2;
                    int i4 = (i2 >>> 20) & 255;
                    int i5 = iArr[i];
                    long j = i3;
                    switch (i4) {
                        case 0:
                            if (!A07(obj2, i)) {
                                i += 3;
                            } else {
                                SPW spw = C63405Sja.A00;
                                spw.A02(obj, j, spw.A00(obj2, j));
                                A05(obj, i);
                                i += 3;
                            }
                        case 1:
                            if (!A07(obj2, i)) {
                                i += 3;
                            } else {
                                SPW spw2 = C63405Sja.A00;
                                spw2.A03(obj, j, spw2.A01(obj2, j));
                                A05(obj, i);
                                i += 3;
                            }
                        case 2:
                        case 3:
                        case 5:
                        case 14:
                        case 16:
                            if (!A07(obj2, i)) {
                                i += 3;
                            } else {
                                C63405Sja.A08(obj, j, C63405Sja.A01(obj2, j));
                                A05(obj, i);
                                i += 3;
                            }
                        case 4:
                        case 6:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        case Process.SIGTERM /* 15 */:
                            if (!A07(obj2, i)) {
                                i += 3;
                            } else {
                                C63405Sja.A07(obj, j, C63405Sja.A00(obj2, j));
                                A05(obj, i);
                                i += 3;
                            }
                        case 7:
                            if (!A07(obj2, i)) {
                                i += 3;
                            } else {
                                if (!C63405Sja.A01) {
                                    A1M = AbstractC167007dF.A1M(AbstractC58323PtF.A00(C63405Sja.A00.A00.getInt(obj2, (-4) & j), j));
                                    C63405Sja.A0B(obj, j, A1M);
                                } else {
                                    A1M2 = AbstractC167007dF.A1M(AbstractC58323PtF.A00(C63405Sja.A00.A00.getInt(obj2, (-4) & j), j ^ (-1)));
                                    C63405Sja.A0A(obj, j, A1M2);
                                }
                                A05(obj, i);
                                i += 3;
                            }
                        case 8:
                        case 10:
                            if (!A07(obj2, i)) {
                                i += 3;
                            } else {
                                C63405Sja.A09(obj, j, C63405Sja.A02(obj2, j));
                                A05(obj, i);
                                i += 3;
                            }
                        case 9:
                        case 17:
                            if (!A07(obj2, i)) {
                                continue;
                                i += 3;
                            } else {
                                int i6 = iArr[i + 1] & 1048575;
                                Unsafe unsafe = A0D;
                                long j2 = i6;
                                object = unsafe.getObject(obj2, j2);
                                if (object != null) {
                                    A01 = A01(i);
                                    if (!A07(obj, i)) {
                                        if (!A06(object)) {
                                            unsafe.putObject(obj, j2, object);
                                        } else {
                                            RLJ FG52 = A01.FG5();
                                            A01.FGN(FG52, object);
                                            unsafe.putObject(obj, j2, FG52);
                                        }
                                        A05(obj, i);
                                        i += 3;
                                    } else {
                                        object2 = unsafe.getObject(obj, j2);
                                        if (!A06(object2)) {
                                            FG5 = A01.FG5();
                                            A01.FGN(FG5, object2);
                                            unsafe.putObject(obj, j2, FG5);
                                            object2 = FG5;
                                        }
                                        A01.FGN(object2, object);
                                        i += 3;
                                    }
                                } else {
                                    throw AbstractC58323PtF.A0i(obj2, iArr, i);
                                }
                            }
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
                            if (this.A06 instanceof RLQ) {
                                InterfaceC65689TsB interfaceC65689TsB = (InterfaceC65689TsB) C63405Sja.A02(obj, j);
                                List list = (List) C63405Sja.A02(obj2, j);
                                int size = interfaceC65689TsB.size();
                                int size2 = list.size();
                                if (size > 0) {
                                    if (size2 > 0) {
                                        if (!((TZ3) interfaceC65689TsB).A00) {
                                            interfaceC65689TsB = interfaceC65689TsB.FG6(size2 + size);
                                        }
                                        interfaceC65689TsB.addAll(list);
                                    }
                                    list = interfaceC65689TsB;
                                }
                                C63405Sja.A09(obj, j, list);
                            } else {
                                List list2 = (List) C63405Sja.A02(obj2, j);
                                int size3 = list2.size();
                                List list3 = (List) C63405Sja.A02(obj, j);
                                if (list3.isEmpty()) {
                                    if (list3 instanceof InterfaceC65682Ts4) {
                                        list3 = new RLK(size3);
                                    } else {
                                        list3 = AbstractC25225BEi.A17(size3);
                                    }
                                    C63405Sja.A09(obj, j, list3);
                                } else {
                                    if (AbstractC58321PtD.A1W(RLR.A00, list3)) {
                                        rlk = AbstractC58322PtE.A0w(list3, size3);
                                        rlk.addAll(list3);
                                    } else if (list3 instanceof TZ4) {
                                        InterfaceC65682Ts4 interfaceC65682Ts4 = RLK.A01;
                                        rlk = new RLK(list3.size() + size3);
                                        rlk.addAll(rlk.size(), list3);
                                    }
                                    C63405Sja.A09(obj, j, rlk);
                                    list3 = rlk;
                                }
                                int size4 = list3.size();
                                int size5 = list2.size();
                                if (size4 > 0) {
                                    if (size5 > 0) {
                                        list3.addAll(list2);
                                    }
                                    list2 = list3;
                                }
                                C63405Sja.A09(obj, j, list2);
                            }
                            i += 3;
                        case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                            S2V s2v = AbstractC62873SUx.A01;
                            C63405Sja.A02(obj, j);
                            C63405Sja.A02(obj2, j);
                            throw AbstractC166987dD.A15("isEmpty");
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (!A08(obj2, i5, i)) {
                                i += 3;
                            }
                            C63405Sja.A09(obj, j, C63405Sja.A02(obj2, j));
                            C63405Sja.A07(obj, iArr[i + 2] & 1048575, i5);
                            i += 3;
                        case 60:
                        case 68:
                            int i7 = iArr[i];
                            if (A08(obj2, i7, i)) {
                                int i8 = iArr[i + 1] & 1048575;
                                Unsafe unsafe2 = A0D;
                                long j3 = i8;
                                object = unsafe2.getObject(obj2, j3);
                                if (object != null) {
                                    A01 = A01(i);
                                    if (!A08(obj, i7, i)) {
                                        if (!A06(object)) {
                                            unsafe2.putObject(obj, j3, object);
                                        } else {
                                            RLJ FG53 = A01.FG5();
                                            A01.FGN(FG53, object);
                                            unsafe2.putObject(obj, j3, FG53);
                                        }
                                        C63405Sja.A07(obj, iArr[i + 2] & 1048575, i7);
                                    } else {
                                        object2 = unsafe2.getObject(obj, j3);
                                        if (!A06(object2)) {
                                            FG5 = A01.FG5();
                                            A01.FGN(FG5, object2);
                                            unsafe2.putObject(obj, j3, FG5);
                                            object2 = FG5;
                                        }
                                        A01.FGN(object2, object);
                                    }
                                } else {
                                    throw AbstractC58323PtF.A0i(obj2, iArr, i);
                                }
                            } else {
                                continue;
                            }
                            i += 3;
                        case 61:
                        case 62:
                        case StringTreeSet.PAYLOAD_MASK /* 63 */:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (!A08(obj2, i5, i)) {
                                i += 3;
                            }
                            C63405Sja.A09(obj, j, C63405Sja.A02(obj2, j));
                            C63405Sja.A07(obj, iArr[i + 2] & 1048575, i5);
                            i += 3;
                        default:
                            i += 3;
                    }
                } else {
                    AbstractC62873SUx.A00(obj, obj2);
                    return;
                }
            }
        } else {
            throw AbstractC166987dD.A12("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final Object A02(int i, int i2, Object obj) {
        InterfaceC65579TnE A01 = A01(i2);
        if (!A08(obj, i, i2)) {
            return A01.FG5();
        }
        Object object = A0D.getObject(obj, AbstractC58318PtA.A0A(this.A00[i2 + 1]));
        if (A06(object)) {
            return object;
        }
        RLJ FG5 = A01.FG5();
        if (object != null) {
            A01.FGN(FG5, object);
        }
        return FG5;
    }

    private final Object A03(Object obj, int i) {
        InterfaceC65579TnE A01 = A01(i);
        int i2 = this.A00[i + 1] & 1048575;
        if (!A07(obj, i)) {
            return A01.FG5();
        }
        Object object = A0D.getObject(obj, i2);
        if (A06(object)) {
            return object;
        }
        RLJ FG5 = A01.FG5();
        if (object != null) {
            A01.FGN(FG5, object);
        }
        return FG5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x003c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003f A[SYNTHETIC] */
    @Override // X.InterfaceC65579TnE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FGG(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = A06(r7)
            if (r0 == 0) goto Lab
            boolean r0 = r7 instanceof X.RLJ
            r5 = 0
            if (r0 == 0) goto L1e
            r2 = r7
            X.RLJ r2 = (X.RLJ) r2
            int r1 = r2.zzd
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 | r0
            r2.zzd = r1
            r2.zza = r5
            r1 = r1 & r0
            r2.zzd = r1
        L1e:
            int[] r4 = r6.A00
        L20:
            int r0 = r4.length
            if (r5 >= r0) goto La0
            int r0 = r5 + 1
            r0 = r4[r0]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            int r0 = r0 >>> 20
            r1 = r0 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r0 = 9
            if (r1 == r0) goto L85
            r0 = 60
            if (r1 == r0) goto L8a
            r0 = 68
            if (r1 == r0) goto L8a
            switch(r1) {
                case 17: goto L85;
                case 18: goto L52;
                case 19: goto L52;
                case 20: goto L52;
                case 21: goto L52;
                case 22: goto L52;
                case 23: goto L52;
                case 24: goto L52;
                case 25: goto L52;
                case 26: goto L52;
                case 27: goto L52;
                case 28: goto L52;
                case 29: goto L52;
                case 30: goto L52;
                case 31: goto L52;
                case 32: goto L52;
                case 33: goto L52;
                case 34: goto L52;
                case 35: goto L52;
                case 36: goto L52;
                case 37: goto L52;
                case 38: goto L52;
                case 39: goto L52;
                case 40: goto L52;
                case 41: goto L52;
                case 42: goto L52;
                case 43: goto L52;
                case 44: goto L52;
                case 45: goto L52;
                case 46: goto L52;
                case 47: goto L52;
                case 48: goto L52;
                case 49: goto L52;
                case 50: goto L42;
                default: goto L3f;
            }
        L3f:
            int r5 = r5 + 3
            goto L20
        L42:
            sun.misc.Unsafe r0 = X.C64250T5z.A0D
            java.lang.Object r0 = r0.getObject(r7, r2)
            if (r0 == 0) goto L3f
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AbstractC166987dD.A15(r0)
            throw r0
        L52:
            X.S8m r0 = r6.A06
            boolean r0 = r0 instanceof X.RLQ
            java.lang.Object r1 = X.C63405Sja.A02(r7, r2)
            if (r0 == 0) goto L68
            X.TsB r1 = (X.InterfaceC65689TsB) r1
            X.TZ3 r1 = (X.TZ3) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L3f
            r0 = 0
            r1.A00 = r0
            goto L3f
        L68:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof X.InterfaceC65682Ts4
            if (r0 == 0) goto L78
            X.Ts4 r1 = (X.InterfaceC65682Ts4) r1
            X.Ts4 r0 = r1.FGB()
        L74:
            X.C63405Sja.A09(r7, r2, r0)
            goto L3f
        L78:
            java.lang.Class r0 = X.RLR.A00
            boolean r0 = X.AbstractC58321PtD.A1W(r0, r1)
            if (r0 != 0) goto L3f
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L74
        L85:
            boolean r0 = r6.A07(r7, r5)
            goto L90
        L8a:
            r0 = r4[r5]
            boolean r0 = r6.A08(r7, r0, r5)
        L90:
            if (r0 == 0) goto L3f
            X.TnE r1 = r6.A01(r5)
            sun.misc.Unsafe r0 = X.C64250T5z.A0D
            java.lang.Object r0 = r0.getObject(r7, r2)
            r1.FGG(r0)
            goto L3f
        La0:
            X.RLJ r7 = (X.RLJ) r7
            X.Sh4 r1 = r7.zzc
            boolean r0 = r1.A01
            if (r0 == 0) goto Lab
            r0 = 0
            r1.A01 = r0
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64250T5z.FGG(java.lang.Object):void");
    }
}
