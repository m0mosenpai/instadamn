package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1AF, reason: invalid class name */
/* loaded from: classes.dex */
public class C1AF extends C1A1 implements InterfaceC10260gi {
    public C1AJ A00;
    public C1AJ A01;
    public final C1AG A02;
    public final AbstractC226118l A03;
    public final AbstractC225918h A04;
    public final InterfaceC08830cm A05;

    @Override // X.C1A1, X.C1A2
    public final String Bo0() {
        int A02;
        try {
            C1AG c1ag = this.A02;
            if (c1ag == null || (A02 = c1ag.A02(44)) == 0) {
                return null;
            }
            return c1ag.A05(A02 + ((C1AI) c1ag).A00);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // X.C1A1, X.C1A2
    public final String Bo8() {
        int A02;
        try {
            C1AG c1ag = this.A02;
            if (c1ag == null || (A02 = c1ag.A02(46)) == 0) {
                return null;
            }
            return c1ag.A05(A02 + ((C1AI) c1ag).A00);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public C1AF(AbstractC226118l abstractC226118l, AbstractC225918h abstractC225918h, C0U0 c0u0, InterfaceC228919r interfaceC228919r) {
        super(c0u0, interfaceC228919r);
        C1AJ c1aj;
        ByteBuffer javaByteBuffer;
        int i;
        int i2;
        int A02;
        int A022;
        int i3;
        int i4;
        short s;
        short s2;
        this.A04 = abstractC225918h;
        this.A03 = abstractC226118l;
        C1AG c1ag = null;
        if (abstractC226118l != null && (javaByteBuffer = abstractC226118l.getJavaByteBuffer()) != null && javaByteBuffer.capacity() > 0) {
            C1AG c1ag2 = new C1AG();
            javaByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            ((C1AI) c1ag2).A00 = javaByteBuffer.getInt(javaByteBuffer.position()) + javaByteBuffer.position();
            ((C1AI) c1ag2).A01 = javaByteBuffer;
            try {
                int A023 = c1ag2.A02(28);
                if (A023 == 0 || ((C1AI) c1ag2).A01.getInt(A023 + ((C1AI) c1ag2).A00) != 123456 || (((A02 = c1ag2.A02(34)) == 0 || ((C1AI) c1ag2).A01.getInt(A02 + ((C1AI) c1ag2).A00) != 123456) && (A022 = c1ag2.A02(34)) != 0 && ((C1AI) c1ag2).A01.getInt(A022 + ((C1AI) c1ag2).A00) != 0)) {
                    int A024 = c1ag2.A02(28);
                    if (A024 != 0) {
                        i = ((C1AI) c1ag2).A01.getInt(A024 + ((C1AI) c1ag2).A00);
                    } else {
                        i = 0;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    int A025 = c1ag2.A02(34);
                    if (A025 != 0) {
                        i2 = ((C1AI) c1ag2).A01.getInt(A025 + ((C1AI) c1ag2).A00);
                    } else {
                        i2 = 0;
                    }
                    C1AO.A00("FBMobileConfigTableOptimized::getRootAsFBMobileConfigTableOptimized", StringFormatUtil.formatStrLocaleSafe("Magic number does not match!  Got magic:%s magic2:%s", valueOf, Integer.valueOf(i2)));
                } else {
                    c1ag2.A01 = c1ag2.A02(6);
                    c1ag2.A00 = c1ag2.A02(8);
                    c1ag2.A06 = c1ag2.A02(10);
                    c1ag2.A05 = c1ag2.A02(12);
                    c1ag2.A02(14);
                    c1ag2.A02(16);
                    c1ag2.A03 = c1ag2.A02(18);
                    c1ag2.A02 = c1ag2.A02(20);
                    c1ag2.A08 = c1ag2.A02(22);
                    c1ag2.A07 = c1ag2.A02(24);
                    c1ag2.A04 = c1ag2.A02(26);
                    c1ag2.A09 = c1ag2.A02(42);
                    int A026 = c1ag2.A02(32);
                    if (A026 != 0) {
                        int A04 = c1ag2.A04(A026);
                        if (A04 > 65536) {
                            C1AO.A00("FBMobileConfigTableOptimized::initilizeOffsets", StringFormatUtil.formatStrLocaleSafe("Probably corrupted mctable data, epInfoLen:%s maximum allowed length %s", Integer.valueOf(A04), Integer.valueOf(Constants.LOAD_RESULT_PGO_ATTEMPTED)));
                        } else {
                            for (int i5 = 0; i5 < A04; i5++) {
                                int A027 = c1ag2.A02(32);
                                if (A027 != 0) {
                                    int A03 = c1ag2.A03(A027) + (i5 * 4);
                                    int i6 = A03 + ((C1AI) c1ag2).A01.getInt(A03);
                                    ByteBuffer byteBuffer = ((C1AI) c1ag2).A01;
                                    Map map = c1ag2.A0A;
                                    int i7 = i6 - byteBuffer.getInt(i6);
                                    if (8 < byteBuffer.getShort(i7) && (s2 = byteBuffer.getShort(i7 + 8)) != 0) {
                                        i3 = byteBuffer.getInt(s2 + i6);
                                    } else {
                                        i3 = 0;
                                    }
                                    Integer valueOf2 = Integer.valueOf(i3);
                                    int i8 = i6 - byteBuffer.getInt(i6);
                                    if (6 < byteBuffer.getShort(i8) && (s = byteBuffer.getShort(i8 + 6)) != 0) {
                                        i4 = byteBuffer.getInt(s + i6);
                                    } else {
                                        i4 = 0;
                                    }
                                    map.put(valueOf2, Integer.valueOf(i4));
                                }
                            }
                        }
                    }
                    c1ag = c1ag2;
                }
            } catch (IndexOutOfBoundsException e) {
                C1AO.A00("FBMobileConfigTableOptimized::getRootAsFBMobileConfigTableOptimized", StringFormatUtil.formatStrLocaleSafe("IndexOutOfBoundsException: Corrupted file, unexpected fbs offset %s", e));
            }
        }
        this.A02 = c1ag;
        int i9 = 0;
        if (c1ag != null) {
            try {
                int A028 = c1ag.A02(26);
                if (A028 != 0) {
                    i9 = c1ag.A04(A028);
                }
            } catch (IndexOutOfBoundsException | BufferUnderflowException unused) {
                this.A01 = new C1AJ(i9);
                c1aj = new C1AJ(i9);
            } catch (Throwable th) {
                this.A01 = new C1AJ(i9);
                this.A00 = new C1AJ(i9);
                throw th;
            }
        }
        this.A01 = new C1AJ(i9);
        c1aj = new C1AJ(i9);
        this.A00 = c1aj;
        final InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.1AK
            @Override // X.InterfaceC08830cm
            public final Object get() {
                int i10;
                String str;
                C1AF c1af = C1AF.this;
                ArrayList arrayList = new ArrayList();
                C1AG c1ag3 = c1af.A02;
                if (c1ag3 != null) {
                    int i11 = 0;
                    while (true) {
                        int A029 = c1ag3.A02(42);
                        if (A029 != 0) {
                            i10 = c1ag3.A04(A029);
                        } else {
                            i10 = 0;
                        }
                        if (i11 >= i10) {
                            break;
                        }
                        int i12 = c1ag3.A09;
                        if (i12 != 0) {
                            str = c1ag3.A05(c1ag3.A03(i12) + (i11 * 4));
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                        i11++;
                    }
                }
                return arrayList;
            }
        };
        this.A05 = new InterfaceC08830cm(interfaceC08830cm) { // from class: X.1AL
            public final InterfaceC08830cm A00;
            public volatile Object A01 = null;

            @Override // X.InterfaceC08830cm
            public final Object get() {
                if (this.A01 != null) {
                    return this.A01;
                }
                synchronized (this) {
                    if (this.A01 != null) {
                        return this.A01;
                    }
                    this.A01 = this.A00.get();
                    return this.A01;
                }
            }

            {
                this.A00 = interfaceC08830cm;
            }
        };
    }

    private int A00(long j) {
        int i = (int) ((j >>> 48) & 63);
        int i2 = (int) (j & 65535);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C1AG c1ag = this.A02;
                            int i3 = c1ag.A02;
                            if (i3 != 0) {
                                return ((C1AI) c1ag).A01.getInt(c1ag.A03(i3) + (i2 * 4));
                            }
                            return 0;
                        }
                        C0K8.A0C("MobileConfigContextV2Impl", String.format("Fail to get meta for spec: %d", Long.valueOf(j)));
                        return -256;
                    }
                    C1AG c1ag2 = this.A02;
                    int i4 = c1ag2.A07;
                    if (i4 != 0) {
                        return ((C1AI) c1ag2).A01.getInt(c1ag2.A03(i4) + (i2 * 4));
                    }
                    return 0;
                }
                C1AG c1ag3 = this.A02;
                int i5 = c1ag3.A05;
                if (i5 != 0) {
                    return ((C1AI) c1ag3).A01.getInt(c1ag3.A03(i5) + (i2 * 4));
                }
                return 0;
            }
            C1AG c1ag4 = this.A02;
            int i6 = c1ag4.A00;
            if (i6 != 0) {
                return ((C1AI) c1ag4).A01.getInt(c1ag4.A03(i6) + (i2 * 4));
            }
            return 0;
        }
        C0K8.A0C("MobileConfigContextV2Impl", String.format("Null type specifier is given: %d", Long.valueOf(j)));
        return -256;
    }

    @Override // X.C1A1
    public double A01(double d, long j, boolean z) {
        int i;
        C1AG c1ag = this.A02;
        if (c1ag != null && ((int) ((j >>> 48) & 63)) == 4) {
            int i2 = (int) (j & 65535);
            try {
                int i3 = c1ag.A02;
                if (i3 != 0) {
                    i = ((C1AI) c1ag).A01.getInt(c1ag.A03(i3) + (i2 * 4));
                    if ((((byte) i) & 6) != 0) {
                        if (!z) {
                            A07(i, j);
                        } else {
                            A06(i);
                        }
                    }
                } else {
                    i = 0;
                }
                if (C1AN.A00(i) == MobileConfigValueSource.SERVER) {
                    int i4 = c1ag.A03;
                    if (i4 != 0) {
                        d = ((C1AI) c1ag).A01.getDouble(c1ag.A03(i4) + (i2 * 8));
                        return d;
                    }
                    return 0.0d;
                }
                return d;
            } catch (IndexOutOfBoundsException | BufferUnderflowException unused) {
            }
        }
        return d;
    }

    @Override // X.C1A1
    public long A02(long j, long j2, boolean z) {
        int i;
        C1AG c1ag = this.A02;
        if (c1ag != null && ((int) ((j >>> 48) & 63)) == 2) {
            int i2 = (int) (j & 65535);
            try {
                int i3 = c1ag.A05;
                if (i3 != 0) {
                    i = ((C1AI) c1ag).A01.getInt(c1ag.A03(i3) + (i2 * 4));
                    if ((((byte) i) & 6) != 0) {
                        if (!z) {
                            A07(i, j);
                        } else {
                            A06(i);
                        }
                    }
                } else {
                    i = 0;
                }
                if (C1AN.A00(i) == MobileConfigValueSource.SERVER) {
                    int i4 = c1ag.A06;
                    if (i4 != 0) {
                        j2 = ((C1AI) c1ag).A01.getLong(c1ag.A03(i4) + (i2 * 8));
                        return j2;
                    }
                    return 0L;
                }
                return j2;
            } catch (IndexOutOfBoundsException | BufferUnderflowException unused) {
            }
        }
        return j2;
    }

    @Override // X.C1A1
    public C0U5 A03(long j) {
        MobileConfigValueSource mobileConfigValueSource;
        if (this.A02 != null) {
            mobileConfigValueSource = C1AN.A00(A00(j));
            if (mobileConfigValueSource != MobileConfigValueSource.DEFAULT__MISSING_SERVER_VALUE) {
                BoE();
            }
        } else {
            mobileConfigValueSource = MobileConfigValueSource.DEFAULT__NO_DATA_ON_DISK;
        }
        return new C0U5(mobileConfigValueSource);
    }

    @Override // X.C1A1
    public String A04(String str, long j, boolean z) {
        int i;
        String str2;
        C1AG c1ag = this.A02;
        if (c1ag != null && ((int) ((j >>> 48) & 63)) == 3) {
            int i2 = (int) (j & 65535);
            try {
                int i3 = c1ag.A07;
                if (i3 != 0) {
                    i = ((C1AI) c1ag).A01.getInt(c1ag.A03(i3) + (i2 * 4));
                } else {
                    i = 0;
                }
                boolean z2 = false;
                if ((((byte) i) & 6) != 0) {
                    z2 = true;
                }
                if (z2) {
                    if (!z) {
                        A07(i, j);
                    } else {
                        A06(i);
                    }
                }
                boolean z3 = false;
                if (C1AN.A00(i) != MobileConfigValueSource.SERVER) {
                    z3 = true;
                }
                if (z3) {
                    return str;
                }
                int i4 = c1ag.A08;
                if (i4 != 0) {
                    str2 = c1ag.A05(c1ag.A03(i4) + (i2 * 4));
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (IndexOutOfBoundsException | NegativeArraySizeException | OutOfMemoryError | BufferUnderflowException unused) {
            }
        }
        return str;
    }

    @Override // X.C1A1
    public boolean A05(long j, boolean z, boolean z2) {
        byte b;
        C1AG c1ag = this.A02;
        if (c1ag != null && ((int) ((j >>> 48) & 63)) == 1) {
            int i = (int) (j & 65535);
            try {
                int i2 = c1ag.A01;
                if (i2 != 0) {
                    b = ((C1AI) c1ag).A01.get(c1ag.A03(i2) + i);
                    if ((b & 6) != 0) {
                        int i3 = -239;
                        try {
                            int i4 = c1ag.A00;
                            if (i4 != 0) {
                                i3 = ((C1AI) c1ag).A01.getInt(c1ag.A03(i4) + (i * 4));
                            } else {
                                i3 = 0;
                            }
                        } catch (IndexOutOfBoundsException | BufferUnderflowException unused) {
                        }
                        if (!z2) {
                            A07(i3, j);
                        } else {
                            A06(i3);
                        }
                    }
                } else {
                    b = 0;
                }
                if (C1AN.A00(b) == MobileConfigValueSource.SERVER) {
                    z = false;
                    if ((b >>> 7) != 0) {
                        return true;
                    }
                }
            } catch (IndexOutOfBoundsException | BufferUnderflowException unused2) {
            }
        }
        return z;
    }

    public final void A06(int i) {
        int i2;
        AbstractC225918h abstractC225918h = this.A04;
        C1AG c1ag = this.A02;
        if (c1ag != null && (((byte) i) & 6) != 0) {
            int i3 = (i >>> 8) & 16777215;
            try {
                if (this.A00.A00.compareAndSet(i3, 0, 1) && (i2 = c1ag.A04) != 0) {
                    String A05 = c1ag.A05(c1ag.A03(i2) + (i3 * 4));
                    if (!A05.isEmpty()) {
                        String str = "";
                        try {
                            List CCi = CCi();
                            if (!CCi.isEmpty()) {
                                str = (String) CCi.get(0);
                            }
                        } catch (IndexOutOfBoundsException | NegativeArraySizeException | OutOfMemoryError | BufferUnderflowException unused) {
                        }
                        if (str == null) {
                            str = "";
                        }
                        abstractC225918h.logAccessWithoutExposure(A05, str);
                    }
                }
            } catch (IndexOutOfBoundsException | NegativeArraySizeException | OutOfMemoryError | BufferUnderflowException unused2) {
            }
        }
    }

    public final void A07(int i, long j) {
        int i2;
        String str;
        AbstractC225918h abstractC225918h = this.A04;
        C1AG c1ag = this.A02;
        if (c1ag != null && (((byte) i) & 6) != 0) {
            int i3 = (i >>> 8) & 16777215;
            try {
                if (this.A01.A00.compareAndSet(i3, 0, 1) && (i2 = c1ag.A04) != 0) {
                    String A05 = c1ag.A05(c1ag.A03(i2) + (i3 * 4));
                    if (!A05.isEmpty()) {
                        String str2 = "";
                        try {
                            List CCi = CCi();
                            if (!CCi.isEmpty()) {
                                str2 = (String) CCi.get(0);
                            }
                        } catch (IndexOutOfBoundsException | NegativeArraySizeException | OutOfMemoryError | BufferUnderflowException unused) {
                        }
                        if ((i & 8) == 0) {
                            str = "";
                        } else {
                            str = android.util.Log.getStackTraceString(new Throwable());
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        abstractC225918h.logExposure(A05, j, str, str2);
                    }
                }
            } catch (IndexOutOfBoundsException | NegativeArraySizeException | OutOfMemoryError | BufferUnderflowException unused2) {
            }
        }
    }

    @Override // X.C0U1
    public Map B1E() {
        C1AG c1ag = this.A02;
        if (c1ag == null) {
            return new HashMap();
        }
        return c1ag.A0A;
    }

    @Override // X.C1A2
    public String BOq(long j) {
        C1AG c1ag = this.A02;
        if (c1ag == null) {
            return null;
        }
        int A00 = A00(j);
        boolean z = false;
        if ((((byte) A00) & 6) != 0) {
            z = true;
        }
        int i = -1;
        if (z) {
            i = (A00 >>> 8) & 16777215;
        }
        if (i < 0) {
            return null;
        }
        try {
            int i2 = c1ag.A04;
            if (i2 == 0) {
                return null;
            }
            return c1ag.A05(c1ag.A03(i2) + (i * 4));
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | OutOfMemoryError | BufferUnderflowException unused) {
            return null;
        }
    }

    @Override // X.C1A2
    public int BOv(long j) {
        if (this.A02 == null) {
            return 0;
        }
        int A00 = A00(j);
        int i = (A00 & 6) >>> 1;
        if ((A00 & 8) == 0) {
            return i;
        }
        return i | 128;
    }

    @Override // X.C1A1, X.C1A2
    public final long BoE() {
        long j = -1;
        try {
            C1AG c1ag = this.A02;
            if (c1ag == null) {
                return -1L;
            }
            int A02 = c1ag.A02(36);
            if (A02 != 0) {
                j = ((C1AI) c1ag).A01.getLong(A02 + ((C1AI) c1ag).A00);
                return j;
            }
            return 0L;
        } catch (IndexOutOfBoundsException unused) {
            return j;
        }
    }

    @Override // X.C1A2
    public final List CCi() {
        return (List) this.A05.get();
    }

    @Override // X.InterfaceC18540vh
    public final void CjF(long j) {
        if (this.A02 != null) {
            int A00 = A00(j);
            if ((((byte) A00) & 6) != 0) {
                A07(A00, j);
            }
        }
    }
}
