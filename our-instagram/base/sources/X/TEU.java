package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes10.dex */
public final class TEU implements InterfaceC65596Tnf {
    public final int A00;
    public final int A01;
    public final TEQ A02;
    public final SK6 A03;
    public final int[] A04;
    public final int[] A05;
    public final Object[] A06;
    public final int A07;
    public final int A08;
    public final C62230S3b A09;
    public final C63074Sbw A0A;
    public final C62232S3d A0B;
    public final SK1 A0C;
    public final boolean A0D;
    public final boolean A0E;
    public static final int[] A0G = new int[0];
    public static final Unsafe A0F = UnsafeUtil.A04();

    private int A00(int i) {
        if (i >= this.A08 && i <= this.A07) {
            int i2 = 0;
            int[] iArr = this.A04;
            int length = (iArr.length / 3) - 1;
            while (i2 <= length) {
                int i3 = (length + i2) >>> 1;
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                if (i != i5) {
                    if (i < i5) {
                        length = i3 - 1;
                    } else {
                        i2 = i3 + 1;
                    }
                } else {
                    return i4;
                }
            }
            return -1;
        }
        return -1;
    }

    private int A01(int i, int i2) {
        if (i >= this.A08 && i <= this.A07) {
            int[] iArr = this.A04;
            int length = (iArr.length / 3) - 1;
            while (i2 <= length) {
                int i3 = (length + i2) >>> 1;
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                if (i != i5) {
                    if (i < i5) {
                        length = i3 - 1;
                    } else {
                        i2 = i3 + 1;
                    }
                } else {
                    return i4;
                }
            }
            return -1;
        }
        return -1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public static int A02(C62906SWn c62906SWn, EnumC61183Rgj enumC61183Rgj, Class cls, byte[] bArr, int i, int i2) {
        Object valueOf;
        Object valueOf2;
        int A06;
        Object valueOf3;
        switch (AbstractC58318PtA.A06(enumC61183Rgj, AbstractC62340S7k.A00)) {
            case 1:
                A06 = AbstractC63383Six.A06(c62906SWn, bArr, i);
                valueOf3 = Boolean.valueOf(AbstractC167007dF.A1M((c62906SWn.A01 > 0L ? 1 : (c62906SWn.A01 == 0L ? 0 : -1))));
                c62906SWn.A02 = valueOf3;
                return A06;
            case 2:
                return AbstractC63383Six.A03(c62906SWn, bArr, i);
            case 3:
                valueOf2 = Double.valueOf(Double.longBitsToDouble(AbstractC58324PtG.A03(bArr, i)));
                c62906SWn.A02 = valueOf2;
                return i + 8;
            case 4:
            case 5:
                valueOf = Integer.valueOf(AbstractC58321PtD.A0F(bArr, i));
                c62906SWn.A02 = valueOf;
                return i + 4;
            case 6:
            case 7:
                valueOf2 = Long.valueOf(AbstractC58324PtG.A03(bArr, i));
                c62906SWn.A02 = valueOf2;
                return i + 8;
            case 8:
                valueOf = Float.valueOf(Float.intBitsToFloat(AbstractC58321PtD.A0F(bArr, i)));
                c62906SWn.A02 = valueOf;
                return i + 4;
            case 9:
            case 10:
            case 11:
                A06 = AbstractC63383Six.A05(c62906SWn, bArr, i);
                valueOf3 = Integer.valueOf(c62906SWn.A00);
                c62906SWn.A02 = valueOf3;
                return A06;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A06 = AbstractC63383Six.A06(c62906SWn, bArr, i);
                valueOf3 = Long.valueOf(c62906SWn.A01);
                c62906SWn.A02 = valueOf3;
                return A06;
            case 14:
                return AbstractC63383Six.A00(c62906SWn, SYX.A02.A00(cls), bArr, i, i2);
            case Process.SIGTERM /* 15 */:
                A06 = AbstractC63383Six.A05(c62906SWn, bArr, i);
                valueOf3 = Integer.valueOf(AbstractC58319PtB.A01(c62906SWn.A00));
                c62906SWn.A02 = valueOf3;
                return A06;
            case 16:
                A06 = AbstractC63383Six.A06(c62906SWn, bArr, i);
                valueOf3 = Long.valueOf(AbstractC58320PtC.A07(c62906SWn.A01));
                c62906SWn.A02 = valueOf3;
                return A06;
            case 17:
                return AbstractC63383Six.A04(c62906SWn, bArr, i);
            default:
                throw AbstractC166987dD.A18("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0021. Please report as an issue. */
    private int A03(C62906SWn c62906SWn, Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        int i9;
        Object valueOf;
        Object obj2;
        Object object;
        Object obj3;
        Object object2;
        Unsafe unsafe = A0F;
        long A03 = AbstractC58319PtB.A03(i8, this.A04);
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(AbstractC58324PtG.A03(bArr, i))));
                    i9 = i + 8;
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(AbstractC58321PtD.A0F(bArr, i))));
                    i9 = i + 4;
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    i9 = AbstractC63383Six.A06(c62906SWn, bArr, i);
                    valueOf = Long.valueOf(c62906SWn.A01);
                    unsafe.putObject(obj, j, valueOf);
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    i9 = AbstractC63383Six.A05(c62906SWn, bArr, i);
                    valueOf = Integer.valueOf(c62906SWn.A00);
                    unsafe.putObject(obj, j, valueOf);
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC58324PtG.A03(bArr, i)));
                    i9 = i + 8;
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC58321PtD.A0F(bArr, i)));
                    i9 = i + 4;
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    i9 = AbstractC63383Six.A06(c62906SWn, bArr, i);
                    valueOf = Boolean.valueOf(AbstractC167007dF.A1M((c62906SWn.A01 > 0L ? 1 : (c62906SWn.A01 == 0L ? 0 : -1))));
                    unsafe.putObject(obj, j, valueOf);
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    i9 = AbstractC63383Six.A05(c62906SWn, bArr, i);
                    int i10 = c62906SWn.A00;
                    if (i10 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0) {
                            if (SU7.A00.A03(bArr, i9, i9 + i10) != 0) {
                                throw AbstractC58320PtC.A0e("Protocol message had invalid UTF-8.");
                            }
                        }
                        unsafe.putObject(obj, j, AbstractC58318PtA.A0n(SVB.A04, bArr, i9, i10));
                        i9 += i10;
                    }
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    i9 = AbstractC63383Six.A00(c62906SWn, A0B(i8), bArr, i, i2);
                    if (unsafe.getInt(obj, A03) == i4 && (object = unsafe.getObject(obj, j)) != null) {
                        obj2 = SVB.A00(object, c62906SWn.A02);
                    } else {
                        obj2 = c62906SWn.A02;
                    }
                    unsafe.putObject(obj, j, obj2);
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    i9 = AbstractC63383Six.A03(c62906SWn, bArr, i);
                    unsafe.putObject(obj, j, c62906SWn.A02);
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                if (i5 == 0) {
                    i9 = AbstractC63383Six.A05(c62906SWn, bArr, i);
                    int i11 = c62906SWn.A00;
                    InterfaceC65444TkG A09 = A09(this, i8);
                    if (A09 != null && !A09.CWL(i11)) {
                        A0C(obj).A01(i3, AbstractC31171DnF.A0V(i11));
                        return i9;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i11));
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    i9 = AbstractC63383Six.A05(c62906SWn, bArr, i);
                    valueOf = Integer.valueOf(AbstractC58319PtB.A01(c62906SWn.A00));
                    unsafe.putObject(obj, j, valueOf);
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    i9 = AbstractC63383Six.A06(c62906SWn, bArr, i);
                    valueOf = Long.valueOf(AbstractC58320PtC.A07(c62906SWn.A01));
                    unsafe.putObject(obj, j, valueOf);
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    i9 = AbstractC63383Six.A01(c62906SWn, A0B(i8), bArr, i, i2, (i3 & (-8)) | 4);
                    if (unsafe.getInt(obj, A03) == i4 && (object2 = unsafe.getObject(obj, j)) != null) {
                        obj3 = SVB.A00(object2, c62906SWn.A02);
                    } else {
                        obj3 = c62906SWn.A02;
                    }
                    unsafe.putObject(obj, j, obj3);
                    unsafe.putInt(obj, A03, i4);
                    return i9;
                }
                return i;
            default:
                return i;
        }
    }

    private int A05(C62906SWn c62906SWn, Object obj, byte[] bArr, int i, int i2, int i3, long j) {
        Unsafe unsafe = A0F;
        Object obj2 = this.A06[(i3 / 3) * 2];
        Object object = unsafe.getObject(obj, j);
        if (!((C64915TZq) object).A00) {
            C64915TZq A01 = C64915TZq.A01.A01();
            C63074Sbw.A01(A01, object);
            unsafe.putObject(obj, j, A01);
            object = A01;
        }
        C62589SHp c62589SHp = ((C62553SGe) obj2).A00;
        AbstractMap abstractMap = (AbstractMap) object;
        int A05 = AbstractC63383Six.A05(c62906SWn, bArr, i);
        int i4 = c62906SWn.A00;
        if (i4 >= 0 && i4 <= i2 - A05) {
            int i5 = A05 + i4;
            Object obj3 = c62589SHp.A02;
            Object obj4 = c62589SHp.A03;
            Object obj5 = obj4;
            while (A05 < i5) {
                int i6 = A05 + 1;
                int i7 = bArr[A05];
                if (i7 < 0) {
                    i6 = AbstractC63383Six.A07(c62906SWn, bArr, i7, i6);
                    i7 = c62906SWn.A00;
                }
                int i8 = i7 >>> 3;
                int i9 = i7 & 7;
                if (i8 != 1) {
                    if (i8 == 2) {
                        EnumC61183Rgj enumC61183Rgj = c62589SHp.A01;
                        if (i9 == enumC61183Rgj.A00) {
                            A05 = A02(c62906SWn, enumC61183Rgj, obj4.getClass(), bArr, i6, i2);
                            obj5 = c62906SWn.A02;
                        }
                    }
                    A05 = AbstractC63383Six.A08(c62906SWn, bArr, i7, i6, i2);
                } else {
                    EnumC61183Rgj enumC61183Rgj2 = c62589SHp.A00;
                    if (i9 == enumC61183Rgj2.A00) {
                        A05 = A02(c62906SWn, enumC61183Rgj2, null, bArr, i6, i2);
                        obj3 = c62906SWn.A02;
                    } else {
                        A05 = AbstractC63383Six.A08(c62906SWn, bArr, i7, i6, i2);
                    }
                }
            }
            if (A05 == i5) {
                abstractMap.put(obj3, obj5);
                return i5;
            }
            throw AbstractC58320PtC.A0e("Failed to parse the message.");
        }
        throw C4L5.A02();
    }

    public static int A06(Object obj) {
        SK1 sk1 = AbstractC63408Sjh.A02;
        return ((List) obj).size();
    }

    public static InterfaceC65444TkG A09(TEU teu, int i) {
        return (InterfaceC65444TkG) teu.A06[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b9, code lost:
    
        if (r43 == false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.TEU A0A(X.C62230S3b r44, X.SK6 r45, X.C63074Sbw r46, X.C62232S3d r47, X.C62590SHq r48, X.SK1 r49) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TEU.A0A(X.S3b, X.SK6, X.Sbw, X.S3d, X.SHq, X.SK1):X.TEU");
    }

    private InterfaceC65596Tnf A0B(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A06;
        InterfaceC65596Tnf interfaceC65596Tnf = (InterfaceC65596Tnf) objArr[i2];
        if (interfaceC65596Tnf == null) {
            InterfaceC65596Tnf A00 = SYX.A02.A00((Class) objArr[i2 + 1]);
            objArr[i2] = A00;
            return A00;
        }
        return interfaceC65596Tnf;
    }

    public static C63022Saq A0C(Object obj) {
        RYn rYn = (RYn) obj;
        C63022Saq c63022Saq = rYn.unknownFields;
        if (c63022Saq == C63022Saq.A05) {
            C63022Saq c63022Saq2 = new C63022Saq();
            rYn.unknownFields = c63022Saq2;
            return c63022Saq2;
        }
        return c63022Saq;
    }

    private final Object A0E(int i, Object obj, Object obj2) {
        int[] iArr = this.A04;
        int i2 = iArr[i];
        Object A0D = A0D(iArr[i + 1], obj);
        if (A0D != null) {
            Object[] objArr = this.A06;
            int i3 = (i / 3) * 2;
            InterfaceC65444TkG interfaceC65444TkG = (InterfaceC65444TkG) objArr[i3 + 1];
            if (interfaceC65444TkG != null) {
                C62589SHp c62589SHp = ((C62553SGe) objArr[i3]).A00;
                Iterator A14 = AbstractC166997dE.A14((AbstractMap) A0D);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    if (!interfaceC65444TkG.CWL(AbstractC43593JPy.A04(A1K))) {
                        if (obj2 == null) {
                            obj2 = new C63022Saq();
                        }
                        Object key = A1K.getKey();
                        Object value = A1K.getValue();
                        EnumC61183Rgj enumC61183Rgj = c62589SHp.A00;
                        int A00 = C63341Shv.A00(enumC61183Rgj, key, 1);
                        EnumC61183Rgj enumC61183Rgj2 = c62589SHp.A01;
                        int A002 = A00 + C63341Shv.A00(enumC61183Rgj2, value, 2);
                        InterfaceC65442TkE interfaceC65442TkE = AbstractC64538TIu.A02;
                        byte[] bArr = new byte[A002];
                        RWN rwn = new RWN(bArr, A002);
                        try {
                            Object key2 = A1K.getKey();
                            Object value2 = A1K.getValue();
                            C63341Shv.A01(rwn, enumC61183Rgj, key2, 1);
                            C63341Shv.A01(rwn, enumC61183Rgj2, value2, 2);
                            if (rwn.A01 - rwn.A00 == 0) {
                                ((C63022Saq) obj2).A01((i2 << 3) | 2, new RWI(bArr));
                                A14.remove();
                            } else {
                                throw AbstractC166987dD.A14("Did not write as much data as expected.");
                            }
                        } catch (IOException e) {
                            throw AbstractC58318PtA.A0f(e);
                        }
                    }
                }
            }
        }
        return obj2;
    }

    public static List A0H(TEU teu, Object obj, int i) {
        return teu.A03.A01(obj, i & 1048575);
    }

    public static List A0I(Object obj, long j) {
        List list = (List) UnsafeUtil.A02.A09(obj, j);
        SK1 sk1 = AbstractC63408Sjh.A02;
        return list;
    }

    private void A0J(C63401SjW c63401SjW, Object obj, int i) {
        long A0A;
        Object A0N;
        if ((536870912 & i) != 0) {
            A0A = AbstractC58318PtA.A0A(i);
            C63401SjW.A0C(c63401SjW, 2);
            A0N = c63401SjW.A03.A0P();
        } else {
            boolean z = this.A0D;
            A0A = AbstractC58318PtA.A0A(i);
            C63401SjW.A0C(c63401SjW, 2);
            AbstractC63036SbB abstractC63036SbB = c63401SjW.A03;
            if (z) {
                A0N = abstractC63036SbB.A0O();
            } else {
                A0N = abstractC63036SbB.A0N();
            }
        }
        UnsafeUtil.A06(obj, A0A, A0N);
    }

    private void A0K(SCD scd, Object obj, int i, int i2) {
        if (obj != null) {
            C62589SHp c62589SHp = ((C62553SGe) this.A06[(i2 / 3) * 2]).A00;
            CodedOutputStream codedOutputStream = scd.A00;
            Iterator A14 = AbstractC166997dE.A14((AbstractMap) obj);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                AbstractC63073Sbv.A06(codedOutputStream, i);
                Object key = A1K.getKey();
                Object value = A1K.getValue();
                EnumC61183Rgj enumC61183Rgj = c62589SHp.A00;
                int A00 = C63341Shv.A00(enumC61183Rgj, key, 1);
                EnumC61183Rgj enumC61183Rgj2 = c62589SHp.A01;
                codedOutputStream.A07(A00 + C63341Shv.A00(enumC61183Rgj2, value, 2));
                Object key2 = A1K.getKey();
                Object value2 = A1K.getValue();
                C63341Shv.A01(codedOutputStream, enumC61183Rgj, key2, 1);
                C63341Shv.A01(codedOutputStream, enumC61183Rgj2, value2, 2);
            }
        }
    }

    private void A0L(Object obj, int i) {
        int i2 = this.A04[i + 2];
        long j = 1048575 & i2;
        if (j != 1048575) {
            UnsafeUtil.A05(obj, j, (1 << (i2 >>> 20)) | UnsafeUtil.A02.A06(obj, j));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0022. Please report as an issue. */
    private boolean A0M(Object obj, int i) {
        Object A00;
        AbstractC64538TIu abstractC64538TIu;
        boolean isEmpty;
        int[] iArr = this.A04;
        int i2 = iArr[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = i3 & 1048575;
            switch (AbstractC58318PtA.A02(i3)) {
                case 0:
                    if (Double.doubleToRawLongBits(UnsafeUtil.A02.A03(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(UnsafeUtil.A02.A04(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (UnsafeUtil.A02.A07(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                    if (UnsafeUtil.A02.A06(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return UnsafeUtil.A02.A0L(obj, j2);
                case 8:
                    A00 = AbstractC63034Sb9.A00(obj, j2);
                    if (A00 instanceof String) {
                        isEmpty = ((String) A00).isEmpty();
                        return !isEmpty;
                    }
                    if (A00 instanceof AbstractC64538TIu) {
                        abstractC64538TIu = AbstractC64538TIu.A01;
                        isEmpty = abstractC64538TIu.equals(A00);
                        return !isEmpty;
                    }
                    throw AbstractC58318PtA.A0Y();
                case 9:
                case 17:
                    if (AbstractC63034Sb9.A00(obj, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    abstractC64538TIu = AbstractC64538TIu.A01;
                    A00 = AbstractC63034Sb9.A00(obj, j2);
                    isEmpty = abstractC64538TIu.equals(A00);
                    return !isEmpty;
                default:
                    throw AbstractC58318PtA.A0Y();
            }
        } else {
            if ((UnsafeUtil.A02.A06(obj, j) & (1 << (i2 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean A0N(Object obj, int i, int i2) {
        return AbstractC167007dF.A1P(A07(obj, this.A04[i2 + 2]), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
    
        if (r2 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        r12.putInt(r40, r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
    
        r2 = null;
        r1 = r38.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
    
        if (r1 >= r38.A01) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        r2 = A0E(r38.A05[r1], r40, r2);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02a9, code lost:
    
        if (r2 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02ab, code lost:
    
        ((X.RYn) r40).unknownFields = (X.C63022Saq) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02b3, code lost:
    
        if (r44 != 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02b5, code lost:
    
        if (r9 != r43) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02b7, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02c5, code lost:
    
        throw X.AbstractC58320PtC.A0e("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02b8, code lost:
    
        if (r9 > r43) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02bc, code lost:
    
        if (r13 != r44) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02be, code lost:
    
        return r9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x00ab. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0O(X.C62906SWn r39, java.lang.Object r40, byte[] r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TEU.A0O(X.SWn, java.lang.Object, byte[], int, int, int):int");
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
    @Override // X.InterfaceC65596Tnf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AT0(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A04
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
            boolean r3 = r10.A0M(r11, r5)
            boolean r2 = r10.A0M(r12, r5)
            if (r3 != r2) goto Lda
            X.Sb9 r8 = com.google.protobuf.UnsafeUtil.A02
            double r2 = r8.A03(r11, r0)
            long r3 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r8.A03(r12, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L67
        L36:
            boolean r3 = r10.A0M(r11, r5)
            boolean r2 = r10.A0M(r12, r5)
            if (r3 != r2) goto Lda
            X.Sb9 r4 = com.google.protobuf.UnsafeUtil.A02
            float r2 = r4.A04(r11, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r4.A04(r12, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L95
        L53:
            boolean r3 = r10.A0M(r11, r5)
            boolean r2 = r10.A0M(r12, r5)
            if (r3 != r2) goto Lda
            X.Sb9 r2 = com.google.protobuf.UnsafeUtil.A02
            long r3 = r2.A07(r11, r0)
            long r1 = r2.A07(r12, r0)
        L67:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lda
            goto L16
        L6c:
            boolean r3 = r10.A0M(r11, r5)
            boolean r2 = r10.A0M(r12, r5)
            if (r3 != r2) goto Lda
            X.Sb9 r2 = com.google.protobuf.UnsafeUtil.A02
            int r3 = r2.A06(r11, r0)
            int r0 = r2.A06(r12, r0)
            goto L95
        L81:
            boolean r3 = r10.A0M(r11, r5)
            boolean r2 = r10.A0M(r12, r5)
            if (r3 != r2) goto Lda
            X.Sb9 r2 = com.google.protobuf.UnsafeUtil.A02
            boolean r3 = r2.A0L(r11, r0)
            boolean r0 = r2.A0L(r12, r0)
        L95:
            if (r3 != r0) goto Lda
            goto L16
        L99:
            boolean r8 = r10.A0M(r11, r5)
            boolean r2 = r10.A0M(r12, r5)
            goto Lb1
        La2:
            int r2 = X.AbstractC58319PtB.A03(r5, r7)
            long r2 = (long) r2
            X.Sb9 r4 = com.google.protobuf.UnsafeUtil.A02
            int r8 = r4.A06(r11, r2)
            int r2 = r4.A06(r12, r2)
        Lb1:
            if (r8 != r2) goto Lda
        Lb3:
            X.Sb9 r3 = com.google.protobuf.UnsafeUtil.A02
            java.lang.Object r2 = r3.A09(r11, r0)
            java.lang.Object r1 = r3.A09(r12, r0)
            X.SK1 r0 = X.AbstractC63408Sjh.A02
            if (r2 == r1) goto L16
            if (r2 == 0) goto Lda
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto Lda
            goto L16
        Lcb:
            X.RYn r11 = (X.RYn) r11
            X.Saq r1 = r11.unknownFields
            X.RYn r12 = (X.RYn) r12
            X.Saq r0 = r12.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lda
            r9 = 1
        Lda:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TEU.AT0(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b9, code lost:
    
        if (r1 >= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0298, code lost:
    
        if (r1 >= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04b7, code lost:
    
        if (r1 >= 0) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0814, code lost:
    
        r2 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04fb, code lost:
    
        if (r1 >= 0) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r1 >= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x029b, code lost:
    
        r1 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x073a, code lost:
    
        if (r1 >= 0) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0811, code lost:
    
        if (r1 >= 0) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c0, code lost:
    
        if (r1 >= 0) goto L114;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:200:0x0479. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0025 A[SYNTHETIC] */
    @Override // X.InterfaceC65596Tnf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int BtW(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TEU.BtW(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0017. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65596Tnf
    public final int CME(Object obj) {
        int i;
        double A03;
        float A04;
        long A07;
        int A06;
        int i2;
        int[] iArr = this.A04;
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
                    A03 = UnsafeUtil.A02.A03(obj, A0A);
                    A07 = Double.doubleToLongBits(A03);
                    Charset charset = SVB.A04;
                    A06 = AbstractC25228BEl.A03(A07);
                    i3 = i + A06;
                    break;
                case 1:
                    i = i3 * 53;
                    A04 = UnsafeUtil.A02.A04(obj, A0A);
                    A06 = Float.floatToIntBits(A04);
                    i3 = i + A06;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i3 * 53;
                    A07 = UnsafeUtil.A02.A07(obj, A0A);
                    Charset charset2 = SVB.A04;
                    A06 = AbstractC25228BEl.A03(A07);
                    i3 = i + A06;
                    break;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                    i = i3 * 53;
                    A06 = UnsafeUtil.A02.A06(obj, A0A);
                    i3 = i + A06;
                    break;
                case 7:
                    i = i3 * 53;
                    i2 = UnsafeUtil.A02.A0L(obj, A0A);
                    Charset charset3 = SVB.A04;
                    A06 = AbstractC58322PtE.A02(i2);
                    i3 = i + A06;
                    break;
                case 8:
                    i = i3 * 53;
                    A06 = ((String) AbstractC63034Sb9.A00(obj, A0A)).hashCode();
                    i3 = i + A06;
                    break;
                case 9:
                case 17:
                    Object A00 = AbstractC63034Sb9.A00(obj, A0A);
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
                    A06 = AbstractC63034Sb9.A00(obj, A0A).hashCode();
                    i3 = i + A06;
                    break;
                case 51:
                    if (A0N(obj, i6, i4)) {
                        i = i3 * 53;
                        A03 = MSW.A00(AbstractC63034Sb9.A00(obj, A0A));
                        A07 = Double.doubleToLongBits(A03);
                        Charset charset22 = SVB.A04;
                        A06 = AbstractC25228BEl.A03(A07);
                        i3 = i + A06;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (A0N(obj, i6, i4)) {
                        i = i3 * 53;
                        A04 = AbstractC166987dD.A09(AbstractC63034Sb9.A00(obj, A0A));
                        A06 = Float.floatToIntBits(A04);
                        i3 = i + A06;
                        break;
                    } else {
                        break;
                    }
                case 53:
                case 54:
                case 56:
                case 65:
                case 67:
                    if (A0N(obj, i6, i4)) {
                        i = i3 * 53;
                        A07 = AbstractC166987dD.A0N(AbstractC63034Sb9.A00(obj, A0A));
                        Charset charset222 = SVB.A04;
                        A06 = AbstractC25228BEl.A03(A07);
                        i3 = i + A06;
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
                    if (A0N(obj, i6, i4)) {
                        i = i3 * 53;
                        A06 = AbstractC166987dD.A0H(AbstractC63034Sb9.A00(obj, A0A));
                        i3 = i + A06;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (A0N(obj, i6, i4)) {
                        i = i3 * 53;
                        i2 = AbstractC166987dD.A1a(AbstractC63034Sb9.A00(obj, A0A));
                        Charset charset32 = SVB.A04;
                        A06 = AbstractC58322PtE.A02(i2);
                        i3 = i + A06;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!A0N(obj, i6, i4)) {
                        break;
                    }
                    i = i3 * 53;
                    A06 = ((String) AbstractC63034Sb9.A00(obj, A0A)).hashCode();
                    i3 = i + A06;
                    break;
                case 60:
                case 61:
                case 68:
                    if (!A0N(obj, i6, i4)) {
                        break;
                    }
                    i = i3 * 53;
                    A06 = AbstractC63034Sb9.A00(obj, A0A).hashCode();
                    i3 = i + A06;
                    break;
            }
        }
        return AbstractC166987dD.A0I(((RYn) obj).unknownFields, i3 * 53);
    }

    @Override // X.InterfaceC65596Tnf
    public final void Cmk(Object obj) {
        int i;
        Object unmodifiableList;
        TZ8 tz8;
        int i2 = this.A00;
        while (true) {
            i = this.A01;
            if (i2 >= i) {
                break;
            }
            long A0A = AbstractC58318PtA.A0A(this.A04[this.A05[i2] + 1]);
            Object A00 = AbstractC63034Sb9.A00(obj, A0A);
            if (A00 != null) {
                ((C64915TZq) A00).A00 = false;
                UnsafeUtil.A06(obj, A0A, A00);
            }
            i2++;
        }
        int[] iArr = this.A05;
        int length = iArr.length;
        while (i < length) {
            SK6 sk6 = this.A03;
            long j = iArr[i];
            boolean z = sk6 instanceof RYp;
            Object A002 = AbstractC63034Sb9.A00(obj, j);
            if (z) {
                tz8 = (TZ8) ((InterfaceC65691TsD) A002);
            } else {
                List list = (List) A002;
                if (list instanceof InterfaceC65687Ts9) {
                    unmodifiableList = ((InterfaceC65687Ts9) list).CCo();
                } else {
                    if (!AbstractC58321PtD.A1W(RYq.A00, list)) {
                        if ((list instanceof InterfaceC65288ThL) && (list instanceof InterfaceC65691TsD)) {
                            tz8 = (TZ8) ((InterfaceC65691TsD) list);
                            if (!tz8.A00) {
                            }
                        } else {
                            unmodifiableList = Collections.unmodifiableList(list);
                        }
                    }
                    i++;
                }
                UnsafeUtil.A06(obj, j, unmodifiableList);
                i++;
            }
            tz8.A00 = false;
            i++;
        }
        ((RYn) obj).unknownFields.A02 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:353:0x0676, code lost:
    
        r11.put(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0679, code lost:
    
        r10.A0R(r8);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0054. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Throwable, java.io.IOException, X.4L5] */
    @Override // X.InterfaceC65596Tnf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CpP(X.C63401SjW r21, X.C63271SgV r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TEU.CpP(X.SjW, X.SgV, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0091. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [int] */
    @Override // X.InterfaceC65596Tnf
    public final void CpQ(C62906SWn c62906SWn, Object obj, byte[] bArr, int i, int i2) {
        long j;
        int i3;
        Object A00;
        int i4 = i;
        if (this.A0E) {
            Unsafe unsafe = A0F;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            int i8 = 1048575;
            while (i4 < i2) {
                int i9 = i4 + 1;
                byte b = bArr[i4];
                if (b < 0) {
                    i9 = AbstractC63383Six.A07(c62906SWn, bArr, b, i9);
                    b = c62906SWn.A00;
                }
                int i10 = b >>> 3;
                int i11 = b & 7;
                if (i10 > i5) {
                    i6 = A01(i10, i6 / 3);
                } else {
                    i6 = A00(i10);
                }
                if (i6 == -1) {
                    i6 = 0;
                } else {
                    int[] iArr = this.A04;
                    int i12 = iArr[i6 + 1];
                    int A02 = AbstractC58318PtA.A02(i12);
                    long j2 = i12 & 1048575;
                    if (A02 <= 17) {
                        int i13 = iArr[i6 + 2];
                        boolean z = true;
                        int i14 = 1 << (i13 >>> 20);
                        int i15 = i13 & 1048575;
                        int i16 = i8;
                        if (i15 != i16) {
                            if (i16 != 1048575) {
                                unsafe.putInt(obj, i16, i7);
                            }
                            if (i15 != 1048575) {
                                i7 = unsafe.getInt(obj, i15);
                            }
                            i8 = i15;
                        }
                        switch (A02) {
                            case 0:
                                if (i11 == 1) {
                                    UnsafeUtil.A02.A0C(obj, j2, Double.longBitsToDouble(AbstractC58324PtG.A03(bArr, i9)));
                                    i4 = i9 + 8;
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                            case 1:
                                if (i11 == 5) {
                                    UnsafeUtil.A02.A0D(obj, j2, Float.intBitsToFloat(AbstractC58321PtD.A0F(bArr, i9)));
                                    i4 = i9 + 4;
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                            case 2:
                            case 3:
                                if (i11 == 0) {
                                    i4 = AbstractC63383Six.A06(c62906SWn, bArr, i9);
                                    j = c62906SWn.A01;
                                    unsafe.putLong(obj, j2, j);
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                            case 4:
                            case 11:
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                if (i11 == 0) {
                                    i4 = AbstractC63383Six.A05(c62906SWn, bArr, i9);
                                    i3 = c62906SWn.A00;
                                    unsafe.putInt(obj, j2, i3);
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                            case 5:
                            case 14:
                                if (i11 == 1) {
                                    unsafe.putLong(obj, j2, AbstractC58324PtG.A03(bArr, i9));
                                    i4 = i9 + 8;
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                            case 6:
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                if (i11 == 5) {
                                    unsafe.putInt(obj, j2, AbstractC58321PtD.A0F(bArr, i9));
                                    i4 = i9 + 4;
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                            case 7:
                                if (i11 == 0) {
                                    i4 = AbstractC63383Six.A06(c62906SWn, bArr, i9);
                                    if (c62906SWn.A01 == 0) {
                                        z = false;
                                    }
                                    UnsafeUtil.A02.A0H(obj, j2, z);
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                            case 8:
                                if (i11 == 2) {
                                    if ((i12 & 536870912) == 0) {
                                        i4 = AbstractC63383Six.A05(c62906SWn, bArr, i9);
                                        int i17 = c62906SWn.A00;
                                        if (i17 >= 0) {
                                            if (i17 == 0) {
                                                c62906SWn.A02 = "";
                                            } else {
                                                c62906SWn.A02 = AbstractC58318PtA.A0n(SVB.A04, bArr, i4, i17);
                                                i4 += i17;
                                            }
                                        } else {
                                            throw C4L5.A01();
                                        }
                                    } else {
                                        i4 = AbstractC63383Six.A04(c62906SWn, bArr, i9);
                                    }
                                    A00 = c62906SWn.A02;
                                    unsafe.putObject(obj, j2, A00);
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                            case 9:
                                if (i11 == 2) {
                                    i4 = AbstractC63383Six.A00(c62906SWn, A0B(i6), bArr, i9, i2);
                                    Object object = unsafe.getObject(obj, j2);
                                    if (object != null) {
                                        A00 = SVB.A00(object, c62906SWn.A02);
                                        unsafe.putObject(obj, j2, A00);
                                        i7 |= i14;
                                        i5 = i10;
                                    }
                                    A00 = c62906SWn.A02;
                                    unsafe.putObject(obj, j2, A00);
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                            case 10:
                                if (i11 == 2) {
                                    i4 = AbstractC63383Six.A03(c62906SWn, bArr, i9);
                                    A00 = c62906SWn.A02;
                                    unsafe.putObject(obj, j2, A00);
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                            case Process.SIGTERM /* 15 */:
                                if (i11 == 0) {
                                    i4 = AbstractC63383Six.A05(c62906SWn, bArr, i9);
                                    i3 = AbstractC58319PtB.A01(c62906SWn.A00);
                                    unsafe.putInt(obj, j2, i3);
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                            case 16:
                                if (i11 == 0) {
                                    i4 = AbstractC63383Six.A06(c62906SWn, bArr, i9);
                                    long j3 = c62906SWn.A01;
                                    j = (-(j3 & 1)) ^ (j3 >>> 1);
                                    unsafe.putLong(obj, j2, j);
                                    i7 |= i14;
                                    i5 = i10;
                                }
                                break;
                        }
                    } else if (A02 == 27) {
                        if (i11 == 2) {
                            InterfaceC65691TsD interfaceC65691TsD = (InterfaceC65691TsD) unsafe.getObject(obj, j2);
                            if (!((TZ8) interfaceC65691TsD).A00) {
                                interfaceC65691TsD = interfaceC65691TsD.Cq5(AbstractC58320PtC.A01(interfaceC65691TsD));
                                unsafe.putObject(obj, j2, interfaceC65691TsD);
                            }
                            InterfaceC65596Tnf A0B = A0B(i6);
                            do {
                                i4 = AbstractC63383Six.A00(c62906SWn, A0B, bArr, i9, i2);
                                interfaceC65691TsD.add(c62906SWn.A02);
                                if (i4 < i2) {
                                    i9 = AbstractC63383Six.A05(c62906SWn, bArr, i4);
                                }
                                i5 = i10;
                            } while (b == c62906SWn.A00);
                            i5 = i10;
                        }
                    } else {
                        if (A02 <= 49) {
                            i4 = A04(c62906SWn, obj, bArr, i9, i2, b, i10, i11, i6, A02, i12, j2);
                        } else if (A02 == 50) {
                            if (i11 == 2) {
                                i4 = A05(c62906SWn, obj, bArr, i9, i2, i6, j2);
                            }
                        } else {
                            i4 = A03(c62906SWn, obj, bArr, i9, i2, b, i10, i11, i12, A02, i6, j2);
                        }
                        if (i4 != i9) {
                            i5 = i10;
                        } else {
                            i9 = i4;
                        }
                    }
                }
                i4 = AbstractC63383Six.A02(c62906SWn, A0C(obj), bArr, b, i9, i2);
                i5 = i10;
            }
            int i18 = i8;
            if (i18 != 1048575) {
                unsafe.putInt(obj, i18, i7);
            }
            if (i4 != i2) {
                throw AbstractC58320PtC.A0e("Failed to parse the message.");
            }
            return;
        }
        A0O(c62906SWn, obj, bArr, i4, i2, 0);
    }

    @Override // X.InterfaceC65596Tnf
    public final Object CsR() {
        return ((RYn) this.A02).A0K(C05F.A0N, null, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:274:0x04d4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x001f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x001f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x001f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x001f A[SYNTHETIC] */
    @Override // X.InterfaceC65596Tnf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FEo(X.SCD r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 2574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TEU.FEo(X.SCD, java.lang.Object):void");
    }

    public TEU(TEQ teq, C62230S3b c62230S3b, SK6 sk6, C63074Sbw c63074Sbw, C62232S3d c62232S3d, SK1 sk1, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A04 = iArr;
        this.A06 = objArr;
        this.A08 = i;
        this.A07 = i2;
        this.A0D = teq instanceof RYn;
        this.A0E = z;
        this.A05 = iArr2;
        this.A00 = i3;
        this.A01 = i4;
        this.A0B = c62232S3d;
        this.A03 = sk6;
        this.A0C = sk1;
        this.A09 = c62230S3b;
        this.A02 = teq;
        this.A0A = c63074Sbw;
    }

    public static int A07(Object obj, int i) {
        return UnsafeUtil.A02.A06(obj, i & 1048575);
    }

    public static long A08(C63401SjW c63401SjW, int i) {
        long j = i & 1048575;
        C63401SjW.A0C(c63401SjW, 0);
        return j;
    }

    public static Object A0D(int i, Object obj) {
        return UnsafeUtil.A02.A09(obj, i & 1048575);
    }

    public static Field A0F(Class cls, String str) {
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

    public static List A0G(int i, Object obj) {
        return (List) UnsafeUtil.A02.A09(obj, i & 1048575);
    }

    @Override // X.InterfaceC65596Tnf
    public final boolean CWb(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A00) {
            int i4 = this.A05[i3];
            int[] iArr = this.A04;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i) {
                if (i8 != 1048575) {
                    i2 = A0F.getInt(obj, i8);
                }
            } else {
                i8 = i;
            }
            if ((268435456 & i6) != 0) {
                if (i8 == 1048575) {
                    if (!A0M(obj, i4)) {
                    }
                } else if ((i2 & i9) == 0) {
                }
                return false;
            }
            int A02 = AbstractC58318PtA.A02(i6);
            if (A02 != 9 && A02 != 17) {
                if (A02 != 27) {
                    if (A02 != 60 && A02 != 68) {
                        if (A02 != 49) {
                            if (A02 == 50) {
                                C64915TZq c64915TZq = (C64915TZq) AbstractC63034Sb9.A00(obj, i6 & 1048575);
                                if (!c64915TZq.isEmpty() && ((C62553SGe) this.A06[(i4 / 3) * 2]).A00.A01.A01 == EnumC61165RgR.MESSAGE) {
                                    InterfaceC65596Tnf interfaceC65596Tnf = null;
                                    Iterator A16 = AbstractC166997dE.A16(c64915TZq);
                                    while (A16.hasNext()) {
                                        Object next = A16.next();
                                        if (interfaceC65596Tnf == null) {
                                            interfaceC65596Tnf = AbstractC58320PtC.A0f(next);
                                        }
                                        if (!interfaceC65596Tnf.CWb(next)) {
                                            return false;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                            i3++;
                            i = i8;
                        }
                    } else {
                        z = A0N(obj, i5, i4);
                    }
                }
                List list = (List) AbstractC63034Sb9.A00(obj, i6 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC65596Tnf A0B = A0B(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!A0B.CWb(list.get(i10))) {
                            return false;
                        }
                    }
                }
                i3++;
                i = i8;
            } else if (i8 == 1048575) {
                z = A0M(obj, i4);
            } else {
                z = i2 & i9;
            }
            if (z && !A0B(i4).CWb(AbstractC63034Sb9.A00(obj, i6 & 1048575))) {
                return false;
            }
            i3++;
            i = i8;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    @Override // X.InterfaceC65596Tnf
    public final void CpL(Object obj, Object obj2) {
        Object A09;
        int i;
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.A04;
            if (i2 < iArr.length) {
                int i3 = iArr[i2 + 1];
                long A0A = AbstractC58318PtA.A0A(i3);
                int i4 = iArr[i2];
                switch (AbstractC58318PtA.A02(i3)) {
                    case 0:
                        if (!A0M(obj2, i2)) {
                            break;
                        } else {
                            AbstractC63034Sb9 abstractC63034Sb9 = UnsafeUtil.A02;
                            abstractC63034Sb9.A0C(obj, A0A, abstractC63034Sb9.A03(obj2, A0A));
                            A0L(obj, i2);
                            break;
                        }
                    case 1:
                        if (!A0M(obj2, i2)) {
                            break;
                        } else {
                            AbstractC63034Sb9 abstractC63034Sb92 = UnsafeUtil.A02;
                            abstractC63034Sb92.A0D(obj, A0A, abstractC63034Sb92.A04(obj2, A0A));
                            A0L(obj, i2);
                            break;
                        }
                    case 2:
                    case 3:
                    case 5:
                    case 14:
                    case 16:
                        if (!A0M(obj2, i2)) {
                            break;
                        } else {
                            AbstractC63034Sb9 abstractC63034Sb93 = UnsafeUtil.A02;
                            abstractC63034Sb93.A0F(obj, A0A, abstractC63034Sb93.A07(obj2, A0A));
                            A0L(obj, i2);
                            break;
                        }
                    case 4:
                    case 6:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case Process.SIGTERM /* 15 */:
                        if (!A0M(obj2, i2)) {
                            break;
                        } else {
                            UnsafeUtil.A05(obj, A0A, UnsafeUtil.A02.A06(obj2, A0A));
                            A0L(obj, i2);
                            break;
                        }
                    case 7:
                        if (!A0M(obj2, i2)) {
                            break;
                        } else {
                            AbstractC63034Sb9 abstractC63034Sb94 = UnsafeUtil.A02;
                            abstractC63034Sb94.A0H(obj, A0A, abstractC63034Sb94.A0L(obj2, A0A));
                            A0L(obj, i2);
                            break;
                        }
                    case 8:
                    case 10:
                        if (!A0M(obj2, i2)) {
                            break;
                        } else {
                            A09 = AbstractC63034Sb9.A00(obj2, A0A);
                            UnsafeUtil.A06(obj, A0A, A09);
                            A0L(obj, i2);
                            break;
                        }
                    case 9:
                    case 17:
                        if (!A0M(obj2, i2)) {
                            break;
                        } else {
                            AbstractC63034Sb9 abstractC63034Sb95 = UnsafeUtil.A02;
                            Object A092 = abstractC63034Sb95.A09(obj, A0A);
                            A09 = abstractC63034Sb95.A09(obj2, A0A);
                            if (A092 != null) {
                                if (A09 == null) {
                                    break;
                                } else {
                                    A09 = SVB.A00(A092, A09);
                                    UnsafeUtil.A06(obj, A0A, A09);
                                }
                            } else {
                                if (A09 == null) {
                                    break;
                                }
                                UnsafeUtil.A06(obj, A0A, A09);
                            }
                            A0L(obj, i2);
                            break;
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
                        if (this.A03 instanceof RYp) {
                            AbstractC63034Sb9 abstractC63034Sb96 = UnsafeUtil.A02;
                            InterfaceC65691TsD interfaceC65691TsD = (InterfaceC65691TsD) abstractC63034Sb96.A09(obj, A0A);
                            List list = (List) abstractC63034Sb96.A09(obj2, A0A);
                            int size = interfaceC65691TsD.size();
                            int size2 = list.size();
                            if (size > 0) {
                                if (size2 > 0) {
                                    if (!((TZ8) interfaceC65691TsD).A00) {
                                        interfaceC65691TsD = interfaceC65691TsD.Cq5(size2 + size);
                                    }
                                    interfaceC65691TsD.addAll(list);
                                }
                                list = interfaceC65691TsD;
                            }
                            UnsafeUtil.A06(obj, A0A, list);
                            break;
                        } else {
                            List list2 = (List) AbstractC63034Sb9.A00(obj2, A0A);
                            List A00 = RYq.A00(obj, list2.size(), A0A);
                            int size3 = A00.size();
                            int size4 = list2.size();
                            if (size3 > 0) {
                                if (size4 > 0) {
                                    A00.addAll(list2);
                                }
                                list2 = A00;
                            }
                            UnsafeUtil.A06(obj, A0A, list2);
                            break;
                        }
                    case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                        SK1 sk1 = AbstractC63408Sjh.A02;
                        AbstractC63034Sb9 abstractC63034Sb97 = UnsafeUtil.A02;
                        UnsafeUtil.A06(obj, A0A, C63074Sbw.A01(abstractC63034Sb97.A09(obj, A0A), abstractC63034Sb97.A09(obj2, A0A)));
                        break;
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
                        if (!A0N(obj2, i4, i2)) {
                            break;
                        } else {
                            UnsafeUtil.A06(obj, A0A, AbstractC63034Sb9.A00(obj2, A0A));
                            i = AbstractC58319PtB.A03(i2, iArr);
                            UnsafeUtil.A05(obj, i, i4);
                            break;
                        }
                    case 60:
                    case 68:
                        if (!A0N(obj2, i4, i2)) {
                            break;
                        } else {
                            Object obj3 = null;
                            if (A0N(obj, i4, i2)) {
                                obj3 = AbstractC63034Sb9.A00(obj, A0A);
                            }
                            Object A002 = AbstractC63034Sb9.A00(obj2, A0A);
                            if (obj3 != null) {
                                if (A002 == null) {
                                    break;
                                } else {
                                    A002 = SVB.A00(obj3, A002);
                                    UnsafeUtil.A06(obj, A0A, A002);
                                    i = iArr[i2 + 2] & 1048575;
                                }
                            } else {
                                if (A002 == null) {
                                    break;
                                }
                                UnsafeUtil.A06(obj, A0A, A002);
                                i = iArr[i2 + 2] & 1048575;
                            }
                            UnsafeUtil.A05(obj, i, i4);
                            break;
                        }
                }
                i2 += 3;
            } else {
                AbstractC63408Sjh.A0R(obj, obj2);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x011a, code lost:
    
        if (r6 == r1) goto L63;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0031. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0304 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A04(X.C62906SWn r17, java.lang.Object r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, long r27, long r29) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TEU.A04(X.SWn, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }
}
