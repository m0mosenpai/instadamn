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
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.T6d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64254T6d implements InterfaceC65591TnW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final SZR A04;
    public final AbstractC63296Sgx A05;
    public final SSO A06;
    public final InterfaceC65665Tqv A07;
    public final C62221S2r A08;
    public final C63031Sb3 A09;
    public final int[] A0A;
    public final int[] A0B;
    public final Object[] A0C;
    public static final int[] A0E = new int[0];
    public static final Unsafe A0D = C63409Sjj.A09();

    public C64254T6d(SZR szr, AbstractC63296Sgx abstractC63296Sgx, SSO sso, InterfaceC65665Tqv interfaceC65665Tqv, C62221S2r c62221S2r, C63031Sb3 c63031Sb3, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A0A = iArr;
        this.A0C = objArr;
        this.A00 = i;
        this.A01 = i2;
        this.A0B = iArr2;
        this.A02 = i3;
        this.A03 = i4;
        this.A08 = c62221S2r;
        this.A05 = abstractC63296Sgx;
        this.A09 = c63031Sb3;
        this.A04 = szr;
        this.A07 = interfaceC65665Tqv;
        this.A06 = sso;
    }

    public static int A02(int i) {
        return (i >>> 20) & 255;
    }

    public static Field A0E(Class cls, String str) {
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
    @Override // X.InterfaceC65591TnW
    public final int FFn(Object obj) {
        int i;
        double A00;
        int floatToIntBits;
        long A04;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.A0A;
            if (i2 < iArr.length) {
                int A042 = A04(i2);
                int i4 = 1048575 & A042;
                int A02 = A02(A042);
                int i5 = iArr[i2];
                long j = i4;
                int i6 = 37;
                switch (A02) {
                    case 0:
                        i = i3 * 53;
                        A00 = C63409Sjj.A00(obj, j);
                        A04 = Double.doubleToLongBits(A00);
                        Charset charset = AbstractC63328Shc.A02;
                        i3 = AbstractC58321PtD.A08(A04, i);
                        break;
                    case 1:
                        i6 = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(C63409Sjj.A01(obj, j));
                        i3 = floatToIntBits + i6;
                        break;
                    case 2:
                    case 3:
                    case 5:
                    case 14:
                    case 16:
                        i = i3 * 53;
                        A04 = C63409Sjj.A04(obj, j);
                        Charset charset2 = AbstractC63328Shc.A02;
                        i3 = AbstractC58321PtD.A08(A04, i);
                        break;
                    case 4:
                    case 6:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case Process.SIGTERM /* 15 */:
                        i6 = i3 * 53;
                        floatToIntBits = C63409Sjj.A03(obj, j);
                        i3 = floatToIntBits + i6;
                        break;
                    case 7:
                        i6 = i3 * 53;
                        floatToIntBits = AbstractC63328Shc.A00(C63409Sjj.A0R(obj, j));
                        i3 = floatToIntBits + i6;
                        break;
                    case 8:
                        i6 = i3 * 53;
                        floatToIntBits = ((String) C63409Sjj.A06(obj, j)).hashCode();
                        i3 = floatToIntBits + i6;
                        break;
                    case 9:
                    case 17:
                        floatToIntBits = i3 * 53;
                        Object A06 = C63409Sjj.A06(obj, j);
                        if (A06 != null) {
                            i6 = A06.hashCode();
                        }
                        i3 = floatToIntBits + i6;
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
                        i6 = i3 * 53;
                        floatToIntBits = C63409Sjj.A06(obj, j).hashCode();
                        i3 = floatToIntBits + i6;
                        break;
                    case 51:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        } else {
                            i = i3 * 53;
                            A00 = A00(obj, j);
                            A04 = Double.doubleToLongBits(A00);
                            Charset charset22 = AbstractC63328Shc.A02;
                            i3 = AbstractC58321PtD.A08(A04, i);
                            break;
                        }
                    case 52:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        } else {
                            i6 = i3 * 53;
                            floatToIntBits = Float.floatToIntBits(A01(obj, j));
                            i3 = floatToIntBits + i6;
                            break;
                        }
                    case 53:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i = i3 * 53;
                        A04 = A07(obj, j);
                        Charset charset222 = AbstractC63328Shc.A02;
                        i3 = AbstractC58321PtD.A08(A04, i);
                        break;
                    case 54:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i = i3 * 53;
                        A04 = A07(obj, j);
                        Charset charset2222 = AbstractC63328Shc.A02;
                        i3 = AbstractC58321PtD.A08(A04, i);
                        break;
                    case 55:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i6 = i3 * 53;
                        floatToIntBits = A06(obj, j);
                        i3 = floatToIntBits + i6;
                        break;
                    case 56:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i = i3 * 53;
                        A04 = A07(obj, j);
                        Charset charset22222 = AbstractC63328Shc.A02;
                        i3 = AbstractC58321PtD.A08(A04, i);
                        break;
                    case 57:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i6 = i3 * 53;
                        floatToIntBits = A06(obj, j);
                        i3 = floatToIntBits + i6;
                        break;
                    case 58:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        } else {
                            i6 = i3 * 53;
                            floatToIntBits = AbstractC63328Shc.A00(A0T(obj, j));
                            i3 = floatToIntBits + i6;
                            break;
                        }
                    case 59:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i6 = i3 * 53;
                        floatToIntBits = ((String) C63409Sjj.A06(obj, j)).hashCode();
                        i3 = floatToIntBits + i6;
                        break;
                    case 60:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i6 = i3 * 53;
                        floatToIntBits = C63409Sjj.A06(obj, j).hashCode();
                        i3 = floatToIntBits + i6;
                        break;
                    case 61:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i6 = i3 * 53;
                        floatToIntBits = C63409Sjj.A06(obj, j).hashCode();
                        i3 = floatToIntBits + i6;
                        break;
                    case 62:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i6 = i3 * 53;
                        floatToIntBits = A06(obj, j);
                        i3 = floatToIntBits + i6;
                        break;
                    case StringTreeSet.PAYLOAD_MASK /* 63 */:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i6 = i3 * 53;
                        floatToIntBits = A06(obj, j);
                        i3 = floatToIntBits + i6;
                        break;
                    case 64:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i6 = i3 * 53;
                        floatToIntBits = A06(obj, j);
                        i3 = floatToIntBits + i6;
                        break;
                    case 65:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i = i3 * 53;
                        A04 = A07(obj, j);
                        Charset charset222222 = AbstractC63328Shc.A02;
                        i3 = AbstractC58321PtD.A08(A04, i);
                        break;
                    case 66:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i6 = i3 * 53;
                        floatToIntBits = A06(obj, j);
                        i3 = floatToIntBits + i6;
                        break;
                    case 67:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i = i3 * 53;
                        A04 = A07(obj, j);
                        Charset charset2222222 = AbstractC63328Shc.A02;
                        i3 = AbstractC58321PtD.A08(A04, i);
                        break;
                    case 68:
                        if (!A0R(obj, i5, i2)) {
                            break;
                        }
                        i6 = i3 * 53;
                        floatToIntBits = C63409Sjj.A06(obj, j).hashCode();
                        i3 = floatToIntBits + i6;
                        break;
                }
                i2 += 3;
            } else {
                return AbstractC166987dD.A0I(this.A09.A02(obj), i3 * 53);
            }
        }
    }

    @Override // X.InterfaceC65591TnW
    public final void FGa(C62905SWm c62905SWm, Object obj, byte[] bArr, int i, int i2) {
        A0U(c62905SWm, obj, bArr, i, i2, 0);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0018 A[SYNTHETIC] */
    @Override // X.InterfaceC65591TnW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean FGh(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            r7 = 0
            r4 = 0
        L2:
            int[] r0 = r8.A0A
            int r0 = r0.length
            if (r4 >= r0) goto L91
            int r0 = r8.A04(r4)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r0 & r5
            int r0 = A02(r0)
            long r2 = (long) r1
            switch(r0) {
                case 0: goto L76;
                case 1: goto L5d;
                case 2: goto L4e;
                case 3: goto L4e;
                case 4: goto L3f;
                case 5: goto L4e;
                case 6: goto L3f;
                case 7: goto L30;
                case 8: goto L1b;
                case 9: goto L1b;
                case 10: goto L1b;
                case 11: goto L3f;
                case 12: goto L3f;
                case 13: goto L3f;
                case 14: goto L4e;
                case 15: goto L3f;
                case 16: goto L4e;
                case 17: goto L1b;
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
                case 51: goto La3;
                case 52: goto La3;
                case 53: goto La3;
                case 54: goto La3;
                case 55: goto La3;
                case 56: goto La3;
                case 57: goto La3;
                case 58: goto La3;
                case 59: goto La3;
                case 60: goto La3;
                case 61: goto La3;
                case 62: goto La3;
                case 63: goto La3;
                case 64: goto La3;
                case 65: goto La3;
                case 66: goto La3;
                case 67: goto La3;
                case 68: goto La3;
                default: goto L18;
            }
        L18:
            int r4 = r4 + 3
            goto L2
        L1b:
            boolean r0 = r8.A0N(r4, r9, r10)
            if (r0 == 0) goto Lc1
            java.lang.Object r1 = X.C63409Sjj.A06(r9, r2)
            java.lang.Object r0 = X.C63409Sjj.A06(r10, r2)
            boolean r0 = X.AbstractC63410Sjl.A0V(r1, r0)
            if (r0 == 0) goto Lc1
            goto L18
        L30:
            boolean r0 = r8.A0N(r4, r9, r10)
            if (r0 == 0) goto Lc1
            boolean r1 = X.C63409Sjj.A0R(r9, r2)
            boolean r0 = X.C63409Sjj.A0R(r10, r2)
            goto L73
        L3f:
            boolean r0 = r8.A0N(r4, r9, r10)
            if (r0 == 0) goto Lc1
            int r1 = X.C63409Sjj.A03(r9, r2)
            int r0 = X.C63409Sjj.A03(r10, r2)
            goto L73
        L4e:
            boolean r0 = r8.A0N(r4, r9, r10)
            if (r0 == 0) goto Lc1
            long r5 = X.C63409Sjj.A04(r9, r2)
            long r1 = X.C63409Sjj.A04(r10, r2)
            goto L8c
        L5d:
            boolean r0 = r8.A0N(r4, r9, r10)
            if (r0 == 0) goto Lc1
            float r0 = X.C63409Sjj.A01(r9, r2)
            int r1 = java.lang.Float.floatToIntBits(r0)
            float r0 = X.C63409Sjj.A01(r10, r2)
            int r0 = java.lang.Float.floatToIntBits(r0)
        L73:
            if (r1 != r0) goto Lc1
            goto L18
        L76:
            boolean r0 = r8.A0N(r4, r9, r10)
            if (r0 == 0) goto Lc1
            double r0 = X.C63409Sjj.A00(r9, r2)
            long r5 = java.lang.Double.doubleToLongBits(r0)
            double r0 = X.C63409Sjj.A00(r10, r2)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L8c:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc1
            goto L18
        L91:
            X.Sb3 r0 = r8.A09
            X.Sid r1 = r0.A02(r9)
            X.Sid r0 = r0.A02(r10)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc1
            r7 = 1
            return r7
        La3:
            int r0 = r8.A03(r4)
            r0 = r0 & r5
            long r0 = (long) r0
            int r5 = X.C63409Sjj.A03(r9, r0)
            int r0 = X.C63409Sjj.A03(r10, r0)
            if (r5 != r0) goto Lc1
        Lb3:
            java.lang.Object r1 = X.C63409Sjj.A06(r9, r2)
            java.lang.Object r0 = X.C63409Sjj.A06(r10, r2)
            boolean r0 = X.AbstractC63410Sjl.A0V(r1, r0)
            if (r0 != 0) goto L18
        Lc1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64254T6d.FGh(java.lang.Object, java.lang.Object):boolean");
    }

    private final int A03(int i) {
        return this.A0A[i + 2];
    }

    private final int A04(int i) {
        return this.A0A[i + 1];
    }

    private final int A05(int i, int i2) {
        int[] iArr = this.A0A;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final InterfaceC65420Tjr A08(int i) {
        int i2 = i / 3;
        return (InterfaceC65420Tjr) this.A0C[i2 + i2 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c6, code lost:
    
        if (r12 == 0) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C64254T6d A09(X.SZR r39, X.AbstractC63296Sgx r40, X.SSO r41, X.TmQ r42, X.C62221S2r r43, X.C63031Sb3 r44) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64254T6d.A09(X.SZR, X.Sgx, X.SSO, X.TmQ, X.S2r, X.Sb3):X.T6d");
    }

    private final InterfaceC65591TnW A0A(int i) {
        Object[] objArr = this.A0C;
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC65591TnW interfaceC65591TnW = (InterfaceC65591TnW) objArr[i3];
        if (interfaceC65591TnW == null) {
            InterfaceC65591TnW A01 = C63168SeS.A00().A01((Class) objArr[i3 + 1]);
            objArr[i3] = A01;
            return A01;
        }
        return interfaceC65591TnW;
    }

    public static C63372Sid A0B(Object obj) {
        RO8 ro8 = (RO8) obj;
        C63372Sid c63372Sid = ro8.zzc;
        if (c63372Sid == C63372Sid.A00()) {
            C63372Sid A01 = C63372Sid.A01();
            ro8.zzc = A01;
            return A01;
        }
        return c63372Sid;
    }

    private final void A0F(int i, int i2, Object obj, Object obj2) {
        A0D.putObject(obj, AbstractC58318PtA.A0A(A04(i2)), obj2);
        A0L(obj, i, i2);
    }

    private final void A0H(int i, Object obj, Object obj2) {
        int[] iArr = this.A0A;
        int i2 = iArr[i];
        if (A0R(obj2, i2, i)) {
            int A04 = A04(i) & 1048575;
            Unsafe unsafe = A0D;
            long j = A04;
            Object object = unsafe.getObject(obj2, j);
            if (object != null) {
                InterfaceC65591TnW A0A = A0A(i);
                if (!A0R(obj, i2, i)) {
                    if (!A0P(object)) {
                        unsafe.putObject(obj, j, object);
                    } else {
                        RO8 FGC = A0A.FGC();
                        A0A.FGS(FGC, object);
                        unsafe.putObject(obj, j, FGC);
                    }
                    A0L(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j);
                if (!A0P(object2)) {
                    RO8 FGC2 = A0A.FGC();
                    A0A.FGS(FGC2, object2);
                    unsafe.putObject(obj, j, FGC2);
                    object2 = FGC2;
                }
                A0A.FGS(object2, object);
                return;
            }
            throw AbstractC58323PtF.A0i(obj2, iArr, i);
        }
    }

    public static final void A0I(InterfaceC65599Tno interfaceC65599Tno, Object obj, int i) {
        if (obj instanceof String) {
            interfaceC65599Tno.FFO(i, (String) obj);
        } else {
            interfaceC65599Tno.FG9((AbstractC64539TIv) obj, i);
        }
    }

    private final void A0M(Object obj, int i, Object obj2) {
        A0D.putObject(obj, AbstractC58318PtA.A0A(A04(i)), obj2);
        A0K(obj, i);
    }

    public static boolean A0P(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof RO8) {
            return ((RO8) obj).A0S();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x076b, code lost:
    
        throw X.C61035Re7.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0785, code lost:
    
        throw X.C61035Re7.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0766, code lost:
    
        throw X.C61035Re7.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x071f, code lost:
    
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0724, code lost:
    
        if (r0 == 1048575) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0726, code lost:
    
        r14.putInt(r39, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x072a, code lost:
    
        r4 = r37.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x072e, code lost:
    
        if (r4 >= r37.A03) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0730, code lost:
    
        r3 = r37.A0B[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x073e, code lost:
    
        if (X.C63409Sjj.A06(r39, A04(r3) & 1048575) == null) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0744, code lost:
    
        if (A08(r3) != null) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0746, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x076e, code lost:
    
        if (r43 != 0) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0770, code lost:
    
        if (r5 != r42) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0772, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0780, code lost:
    
        throw X.C61035Re7.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0773, code lost:
    
        if (r5 > r42) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0779, code lost:
    
        if (r21 != r43) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x077b, code lost:
    
        return r5;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:137:0x02e9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x05ae. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:373:0x008d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x06f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x071a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x070b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0U(X.C62905SWm r38, java.lang.Object r39, byte[] r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 2070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64254T6d.A0U(X.SWm, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x003b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04e8  */
    @Override // X.InterfaceC65591TnW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int FFX(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64254T6d.FFX(java.lang.Object):int");
    }

    @Override // X.InterfaceC65591TnW
    public final RO8 FGC() {
        return ((RO8) this.A07).A0M();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003a. Please report as an issue. */
    @Override // X.InterfaceC65591TnW
    public final void FGe(InterfaceC65599Tno interfaceC65599Tno, Object obj) {
        int i;
        int[] iArr = this.A0A;
        Unsafe unsafe = A0D;
        int i2 = 1048575;
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4 += 3) {
            int A04 = A04(i4);
            int A02 = A02(A04);
            int i5 = iArr[i4];
            boolean z = true;
            if (A02 <= 17) {
                int i6 = iArr[i4 + 2];
                int i7 = i6 & 1048575;
                if (i7 != i2) {
                    if (i7 == 1048575) {
                        i3 = 0;
                    } else {
                        i3 = unsafe.getInt(obj, i7);
                    }
                    i2 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            long j = A04 & 1048575;
            switch (A02) {
                case 0:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FGL(i5, C63409Sjj.A00(obj, j));
                    }
                case 1:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FGt(i5, C63409Sjj.A01(obj, j));
                    }
                case 2:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FGy(i5, unsafe.getLong(obj, j));
                    }
                case 3:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FFS(i5, unsafe.getLong(obj, j));
                    }
                case 4:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FGw(i5, unsafe.getInt(obj, j));
                    }
                case 5:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FGq(i5, unsafe.getLong(obj, j));
                    }
                case 6:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FGk(i5, unsafe.getInt(obj, j));
                    }
                case 7:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FFs(i5, C63409Sjj.A0R(obj, j));
                    }
                case 8:
                    if (A0S(obj, i4, i2, i3, i)) {
                        A0I(interfaceC65599Tno, unsafe.getObject(obj, j), i5);
                    }
                case 9:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FH1(A0A(i4), unsafe.getObject(obj, j), i5);
                    }
                case 10:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FG9((AbstractC64539TIv) unsafe.getObject(obj, j), i5);
                    }
                case 11:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FFQ(i5, unsafe.getInt(obj, j));
                    }
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FGc(i5, unsafe.getInt(obj, j));
                    }
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FH2(i5, unsafe.getInt(obj, j));
                    }
                case 14:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FH5(i5, unsafe.getLong(obj, j));
                    }
                case Process.SIGTERM /* 15 */:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FFJ(i5, unsafe.getInt(obj, j));
                    }
                case 16:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FFL(i5, unsafe.getLong(obj, j));
                    }
                case 17:
                    if (A0S(obj, i4, i2, i3, i)) {
                        interfaceC65599Tno.FGv(A0A(i4), unsafe.getObject(obj, j), i5);
                    }
                case 18:
                    z = false;
                    AbstractC63410Sjl.A0M(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case Process.SIGSTOP /* 19 */:
                    z = false;
                    AbstractC63410Sjl.A0Q(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 20:
                    z = false;
                    AbstractC63410Sjl.A0S(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 21:
                    z = false;
                    AbstractC63410Sjl.A0K(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 22:
                    z = false;
                    AbstractC63410Sjl.A0R(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 23:
                    z = false;
                    AbstractC63410Sjl.A0P(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 24:
                    z = false;
                    AbstractC63410Sjl.A0O(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 25:
                    AbstractC63410Sjl.A0L(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], false);
                case 26:
                    int i8 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    C63031Sb3 c63031Sb3 = AbstractC63410Sjl.A01;
                    if (list != null && !list.isEmpty()) {
                        interfaceC65599Tno.FFP(i8, list);
                    }
                    break;
                case 27:
                    int i9 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    InterfaceC65591TnW A0A = A0A(i4);
                    C63031Sb3 c63031Sb32 = AbstractC63410Sjl.A01;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i10 = 0; i10 < list2.size(); i10++) {
                            ((C64256T6f) interfaceC65599Tno).FH1(A0A, list2.get(i10), i9);
                        }
                    }
                    break;
                case 28:
                    int i11 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    C63031Sb3 c63031Sb33 = AbstractC63410Sjl.A01;
                    if (list3 != null && !list3.isEmpty()) {
                        interfaceC65599Tno.FGE(i11, list3);
                    }
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    z = false;
                    AbstractC63410Sjl.A0J(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 30:
                    z = false;
                    AbstractC63410Sjl.A0N(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 31:
                    z = false;
                    AbstractC63410Sjl.A0T(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 32:
                    z = false;
                    AbstractC63410Sjl.A0G(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 33:
                    z = false;
                    AbstractC63410Sjl.A0H(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 34:
                    AbstractC63410Sjl.A0I(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], false);
                case 35:
                    AbstractC63410Sjl.A0M(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 36:
                    AbstractC63410Sjl.A0Q(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 37:
                    AbstractC63410Sjl.A0S(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 38:
                    AbstractC63410Sjl.A0K(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 39:
                    AbstractC63410Sjl.A0R(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 40:
                    AbstractC63410Sjl.A0P(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case Seq.NULL_REFNUM /* 41 */:
                    AbstractC63410Sjl.A0O(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case Seq.RefTracker.REF_OFFSET /* 42 */:
                    AbstractC63410Sjl.A0L(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], true);
                case 43:
                    AbstractC63410Sjl.A0J(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 44:
                    AbstractC63410Sjl.A0N(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 45:
                    AbstractC63410Sjl.A0T(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    AbstractC63410Sjl.A0G(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 47:
                    AbstractC63410Sjl.A0H(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], z);
                case 48:
                    AbstractC63410Sjl.A0I(interfaceC65599Tno, (List) unsafe.getObject(obj, j), iArr[i4], true);
                case 49:
                    int i12 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    InterfaceC65591TnW A0A2 = A0A(i4);
                    C63031Sb3 c63031Sb34 = AbstractC63410Sjl.A01;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i13 = 0; i13 < list4.size(); i13++) {
                            ((C64256T6f) interfaceC65599Tno).FGv(A0A2, list4.get(i13), i12);
                        }
                    }
                    break;
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                case 51:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FGL(i5, A00(obj, j));
                    }
                case 52:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FGt(i5, A01(obj, j));
                    }
                case 53:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FGy(i5, A07(obj, j));
                    }
                case 54:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FFS(i5, A07(obj, j));
                    }
                case 55:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FGw(i5, A06(obj, j));
                    }
                case 56:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FGq(i5, A07(obj, j));
                    }
                case 57:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FGk(i5, A06(obj, j));
                    }
                case 58:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FFs(i5, A0T(obj, j));
                    }
                case 59:
                    if (A0R(obj, i5, i4)) {
                        A0I(interfaceC65599Tno, unsafe.getObject(obj, j), i5);
                    }
                case 60:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FH1(A0A(i4), unsafe.getObject(obj, j), i5);
                    }
                case 61:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FG9((AbstractC64539TIv) unsafe.getObject(obj, j), i5);
                    }
                case 62:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FFQ(i5, A06(obj, j));
                    }
                case StringTreeSet.PAYLOAD_MASK /* 63 */:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FGc(i5, A06(obj, j));
                    }
                case 64:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FH2(i5, A06(obj, j));
                    }
                case 65:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FH5(i5, A07(obj, j));
                    }
                case 66:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FFJ(i5, A06(obj, j));
                    }
                case 67:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FFL(i5, A07(obj, j));
                    }
                case 68:
                    if (A0R(obj, i5, i4)) {
                        interfaceC65599Tno.FGv(A0A(i4), unsafe.getObject(obj, j), i5);
                    }
                default:
            }
        }
        C63031Sb3 c63031Sb35 = this.A09;
        c63031Sb35.A05(interfaceC65599Tno, c63031Sb35.A02(obj));
    }

    public static double A00(Object obj, long j) {
        return MSW.A00(C63409Sjj.A06(obj, j));
    }

    public static float A01(Object obj, long j) {
        return AbstractC166987dD.A09(C63409Sjj.A06(obj, j));
    }

    public static int A06(Object obj, long j) {
        return AbstractC166987dD.A0H(C63409Sjj.A06(obj, j));
    }

    public static long A07(Object obj, long j) {
        return AbstractC166987dD.A0N(C63409Sjj.A06(obj, j));
    }

    private final Object A0C(int i, int i2, Object obj) {
        InterfaceC65591TnW A0A = A0A(i2);
        if (!A0R(obj, i, i2)) {
            return A0A.FGC();
        }
        Object object = A0D.getObject(obj, AbstractC58318PtA.A0A(A04(i2)));
        if (A0P(object)) {
            return object;
        }
        RO8 FGC = A0A.FGC();
        if (object != null) {
            A0A.FGS(FGC, object);
        }
        return FGC;
    }

    private final Object A0D(Object obj, int i) {
        InterfaceC65591TnW A0A = A0A(i);
        int A04 = A04(i) & 1048575;
        if (!A0Q(obj, i)) {
            return A0A.FGC();
        }
        Object object = A0D.getObject(obj, A04);
        if (A0P(object)) {
            return object;
        }
        RO8 FGC = A0A.FGC();
        if (object != null) {
            A0A.FGS(FGC, object);
        }
        return FGC;
    }

    private final void A0G(int i, Object obj, Object obj2) {
        if (A0Q(obj2, i)) {
            int A04 = A04(i) & 1048575;
            Unsafe unsafe = A0D;
            long j = A04;
            Object object = unsafe.getObject(obj2, j);
            if (object != null) {
                InterfaceC65591TnW A0A = A0A(i);
                if (!A0Q(obj, i)) {
                    if (!A0P(object)) {
                        unsafe.putObject(obj, j, object);
                    } else {
                        RO8 FGC = A0A.FGC();
                        A0A.FGS(FGC, object);
                        unsafe.putObject(obj, j, FGC);
                    }
                    A0K(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j);
                if (!A0P(object2)) {
                    RO8 FGC2 = A0A.FGC();
                    A0A.FGS(FGC2, object2);
                    unsafe.putObject(obj, j, FGC2);
                    object2 = FGC2;
                }
                A0A.FGS(object2, object);
                return;
            }
            throw AbstractC58323PtF.A0i(obj2, this.A0A, i);
        }
    }

    public static void A0J(Object obj) {
        if (A0P(obj)) {
        } else {
            throw AbstractC166987dD.A12("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void A0K(Object obj, int i) {
        int A03 = A03(i);
        long j = 1048575 & A03;
        if (j != 1048575) {
            C63409Sjj.A0H(obj, j, (1 << (A03 >>> 20)) | C63409Sjj.A03(obj, j));
        }
    }

    private final void A0L(Object obj, int i, int i2) {
        C63409Sjj.A0H(obj, AbstractC58318PtA.A0A(A03(i2)), i);
    }

    private final boolean A0N(int i, Object obj, Object obj2) {
        return AbstractC167007dF.A1P(A0Q(obj, i) ? 1 : 0, A0Q(obj2, i) ? 1 : 0);
    }

    public static boolean A0O(InterfaceC65591TnW interfaceC65591TnW, Object obj, int i) {
        return interfaceC65591TnW.FGl(C63409Sjj.A06(obj, AbstractC58318PtA.A0A(i)));
    }

    private final boolean A0Q(Object obj, int i) {
        int A03 = A03(i);
        long j = A03 & 1048575;
        if (j == 1048575) {
            int A04 = A04(i);
            long j2 = 1048575 & A04;
            switch (A02(A04)) {
                case 0:
                    if (Double.doubleToRawLongBits(C63409Sjj.A00(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C63409Sjj.A01(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C63409Sjj.A04(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                    if (C63409Sjj.A03(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return C63409Sjj.A0R(obj, j2);
                case 8:
                    Object A06 = C63409Sjj.A06(obj, j2);
                    if (A06 instanceof String) {
                        if (!((String) A06).isEmpty()) {
                            return true;
                        }
                    } else if (A06 instanceof AbstractC64539TIv) {
                        if (!AbstractC64539TIv.A01.equals(A06)) {
                            return true;
                        }
                    } else {
                        throw AbstractC58318PtA.A0Y();
                    }
                    break;
                case 9:
                case 17:
                    if (C63409Sjj.A06(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!AbstractC64539TIv.A01.equals(C63409Sjj.A06(obj, j2))) {
                        return true;
                    }
                    break;
                default:
                    throw AbstractC58318PtA.A0Y();
            }
        } else {
            if ((C63409Sjj.A03(obj, j) & (1 << (A03 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0R(Object obj, int i, int i2) {
        return AbstractC167007dF.A1P(C63409Sjj.A03(obj, AbstractC58318PtA.A0A(A03(i2))), i);
    }

    private final boolean A0S(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return A0Q(obj, i);
        }
        return AbstractC167007dF.A1M(i3 & i4);
    }

    public static boolean A0T(Object obj, long j) {
        return AbstractC166987dD.A1a(C63409Sjj.A06(obj, j));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0034. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037 A[SYNTHETIC] */
    @Override // X.InterfaceC65591TnW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FGM(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = A0P(r7)
            if (r0 == 0) goto L70
            boolean r0 = r7 instanceof X.RO8
            r5 = 0
            if (r0 == 0) goto L16
            r0 = r7
            X.RO8 r0 = (X.RO8) r0
            r0.A0Q()
            r0.zza = r5
            r0.A0P()
        L16:
            int[] r4 = r6.A0A
        L18:
            int r0 = r4.length
            if (r5 >= r0) goto L6b
            int r1 = r6.A04(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            int r1 = A02(r1)
            long r2 = (long) r0
            r0 = 9
            if (r1 == r0) goto L50
            r0 = 60
            if (r1 == r0) goto L55
            r0 = 68
            if (r1 == r0) goto L55
            switch(r1) {
                case 17: goto L50;
                case 18: goto L4a;
                case 19: goto L4a;
                case 20: goto L4a;
                case 21: goto L4a;
                case 22: goto L4a;
                case 23: goto L4a;
                case 24: goto L4a;
                case 25: goto L4a;
                case 26: goto L4a;
                case 27: goto L4a;
                case 28: goto L4a;
                case 29: goto L4a;
                case 30: goto L4a;
                case 31: goto L4a;
                case 32: goto L4a;
                case 33: goto L4a;
                case 34: goto L4a;
                case 35: goto L4a;
                case 36: goto L4a;
                case 37: goto L4a;
                case 38: goto L4a;
                case 39: goto L4a;
                case 40: goto L4a;
                case 41: goto L4a;
                case 42: goto L4a;
                case 43: goto L4a;
                case 44: goto L4a;
                case 45: goto L4a;
                case 46: goto L4a;
                case 47: goto L4a;
                case 48: goto L4a;
                case 49: goto L4a;
                case 50: goto L3a;
                default: goto L37;
            }
        L37:
            int r5 = r5 + 3
            goto L18
        L3a:
            sun.misc.Unsafe r0 = X.C64254T6d.A0D
            java.lang.Object r0 = r0.getObject(r7, r2)
            if (r0 == 0) goto L37
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AbstractC166987dD.A15(r0)
            throw r0
        L4a:
            X.Sgx r0 = r6.A05
            r0.A02(r7, r2)
            goto L37
        L50:
            boolean r0 = r6.A0Q(r7, r5)
            goto L5b
        L55:
            r0 = r4[r5]
            boolean r0 = r6.A0R(r7, r0, r5)
        L5b:
            if (r0 == 0) goto L37
            X.TnW r1 = r6.A0A(r5)
            sun.misc.Unsafe r0 = X.C64254T6d.A0D
            java.lang.Object r0 = r0.getObject(r7, r2)
            r1.FGM(r0)
            goto L37
        L6b:
            X.Sb3 r0 = r6.A09
            r0.A06(r7)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64254T6d.FGM(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001b. Please report as an issue. */
    @Override // X.InterfaceC65591TnW
    public final void FGS(Object obj, Object obj2) {
        A0J(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.A0A;
            if (i < iArr.length) {
                int A04 = A04(i);
                int i2 = 1048575 & A04;
                int A02 = A02(A04);
                int i3 = iArr[i];
                long j = i2;
                switch (A02) {
                    case 0:
                        if (!A0Q(obj2, i)) {
                            i += 3;
                        } else {
                            C63409Sjj.A0F(obj, j, C63409Sjj.A00(obj2, j));
                            A0K(obj, i);
                            i += 3;
                        }
                    case 1:
                        if (!A0Q(obj2, i)) {
                            i += 3;
                        } else {
                            C63409Sjj.A0G(obj, j, C63409Sjj.A01(obj2, j));
                            A0K(obj, i);
                            i += 3;
                        }
                    case 2:
                    case 3:
                    case 5:
                    case 14:
                    case 16:
                        if (!A0Q(obj2, i)) {
                            i += 3;
                        } else {
                            C63409Sjj.A0I(obj, j, C63409Sjj.A04(obj2, j));
                            A0K(obj, i);
                            i += 3;
                        }
                    case 4:
                    case 6:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case Process.SIGTERM /* 15 */:
                        if (!A0Q(obj2, i)) {
                            i += 3;
                        } else {
                            C63409Sjj.A0H(obj, j, C63409Sjj.A03(obj2, j));
                            A0K(obj, i);
                            i += 3;
                        }
                    case 7:
                        if (!A0Q(obj2, i)) {
                            i += 3;
                        } else {
                            C63409Sjj.A0K(obj, j, C63409Sjj.A0R(obj2, j));
                            A0K(obj, i);
                            i += 3;
                        }
                    case 8:
                    case 10:
                        if (!A0Q(obj2, i)) {
                            i += 3;
                        } else {
                            C63409Sjj.A0J(obj, j, C63409Sjj.A06(obj2, j));
                            A0K(obj, i);
                            i += 3;
                        }
                    case 9:
                    case 17:
                        A0G(i, obj, obj2);
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
                        this.A05.A03(obj, j, obj2);
                        i += 3;
                    case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                        C63031Sb3 c63031Sb3 = AbstractC63410Sjl.A01;
                        C63409Sjj.A06(obj, j);
                        C63409Sjj.A06(obj2, j);
                        SSO.A00();
                        throw C00O.createAndThrow();
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!A0R(obj2, i3, i)) {
                            i += 3;
                        }
                        C63409Sjj.A0J(obj, j, C63409Sjj.A06(obj2, j));
                        A0L(obj, i3, i);
                        i += 3;
                    case 60:
                    case 68:
                        A0H(i, obj, obj2);
                        i += 3;
                    case 61:
                    case 62:
                    case StringTreeSet.PAYLOAD_MASK /* 63 */:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!A0R(obj2, i3, i)) {
                            i += 3;
                        }
                        C63409Sjj.A0J(obj, j, C63409Sjj.A06(obj2, j));
                        A0L(obj, i3, i);
                        i += 3;
                    default:
                        i += 3;
                }
            } else {
                AbstractC63410Sjl.A0F(this.A09, obj, obj2);
                return;
            }
        }
    }

    @Override // X.InterfaceC65591TnW
    public final boolean FGl(Object obj) {
        boolean A0S;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A02) {
            int[] iArr = this.A0B;
            int[] iArr2 = this.A0A;
            int i4 = iArr[i3];
            int i5 = iArr2[i4];
            int A04 = A04(i4);
            int i6 = iArr2[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i2 = A0D.getInt(obj, i7);
                }
            } else {
                i7 = i;
            }
            if ((268435456 & A04) == 0 || A0S(obj, i4, i7, i2, i8)) {
                int A02 = A02(A04);
                if (A02 != 9 && A02 != 17) {
                    if (A02 != 27) {
                        if (A02 != 60 && A02 != 68) {
                            if (A02 != 49) {
                                if (A02 == 50) {
                                    C63409Sjj.A06(obj, A04 & 1048575);
                                    throw AbstractC166987dD.A15("isEmpty");
                                }
                                i3++;
                                i = i7;
                            }
                        } else {
                            A0S = A0R(obj, i5, i4);
                        }
                    }
                    List list = (List) C63409Sjj.A06(obj, A04 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC65591TnW A0A = A0A(i4);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (A0A.FGl(list.get(i9))) {
                            }
                        }
                    }
                    i3++;
                    i = i7;
                } else {
                    A0S = A0S(obj, i4, i7, i2, i8);
                }
                if (A0S && !A0O(A0A(i4), obj, A04)) {
                }
                i3++;
                i = i7;
            }
            return false;
        }
        return true;
    }
}
