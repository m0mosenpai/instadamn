package X;

import android.util.SparseArray;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;

/* renamed from: X.4aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98044aj implements InterfaceC98054ak {
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public long A07;
    public android.net.Uri A09;
    public C4B6 A0A;
    public C4B6 A0B;
    public C5T9 A0C;
    public InterfaceC71864X7x A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public C4B6 A0P;
    public final C4XY A0R;
    public final C4XR A0S;
    public final C98064al A0T;
    public final C98084an A0V = new Object();
    public int A01 = 1000;
    public int[] A0L = new int[1000];
    public long[] A0M = new long[1000];
    public long[] A0N = new long[1000];
    public int[] A0J = new int[1000];
    public int[] A0K = new int[1000];
    public C98094ao[] A0O = new C98094ao[1000];
    public final C98124ar A0U = new C98124ar(new InterfaceC98114aq() { // from class: X.4ap
        @Override // X.InterfaceC98114aq
        public final void accept(Object obj) {
            ((C98634bi) obj).A01.release();
        }
    });
    public long A08 = Long.MIN_VALUE;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public boolean A0I = true;
    public boolean A0Q = true;

    private int A00(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.A0N[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.A0J[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.A01) {
                i = 0;
            }
        }
        return i3;
    }

    public final synchronized int A03(long j, boolean z) {
        int A00;
        int i = this.A03;
        int i2 = this.A04 + i;
        int i3 = this.A01;
        if (i2 >= i3) {
            i2 -= i3;
        }
        int i4 = this.A02;
        boolean z2 = false;
        if (i != i4) {
            z2 = true;
        }
        if (z2 && j >= this.A0N[i2]) {
            if (j <= this.A06 || !z) {
                A00 = A00(i2, i4 - i, j, true);
                if (A00 == -1) {
                }
            } else {
                A00 = i4 - i;
            }
            return A00;
        }
        return 0;
    }

    public final synchronized long A05() {
        return this.A06;
    }

    public final void A09() {
        A0C(true);
        C5T9 c5t9 = this.A0C;
        if (c5t9 != null) {
            c5t9.EE2(this.A0R);
            this.A0C = null;
            this.A0A = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0009, code lost:
    
        if ((r3.A03 + r4) > r3.A02) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0A(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 < 0) goto Lb
            int r2 = r3.A03     // Catch: java.lang.Throwable -> L16
            int r2 = r2 + r4
            int r1 = r3.A02     // Catch: java.lang.Throwable -> L16
            r0 = 1
            if (r2 <= r1) goto Lc
        Lb:
            r0 = 0
        Lc:
            X.C4B8.A03(r0)     // Catch: java.lang.Throwable -> L16
            int r0 = r3.A03     // Catch: java.lang.Throwable -> L16
            int r0 = r0 + r4
            r3.A03 = r0     // Catch: java.lang.Throwable -> L16
            monitor-exit(r3)
            return
        L16:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98044aj.A0A(int):void");
    }

    public final void A0B(long j, boolean z, boolean z2) {
        long j2;
        int i;
        C98064al c98064al = this.A0T;
        synchronized (this) {
            int i2 = this.A02;
            if (i2 != 0) {
                long[] jArr = this.A0N;
                int i3 = this.A04;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.A03) != i2) {
                        i2 = i + 1;
                    }
                    int A00 = A00(i3, i2, j, z);
                    if (A00 != -1) {
                        j2 = A01(this, A00);
                    }
                }
            }
            j2 = -1;
        }
        c98064al.A05(j2);
    }

    public final synchronized boolean A0D(long j, boolean z) {
        int A00;
        this.A03 = 0;
        C98064al c98064al = this.A0T;
        c98064al.A02 = c98064al.A01;
        int i = this.A04;
        int i2 = this.A01;
        if (i >= i2) {
            i -= i2;
        }
        int i3 = this.A02;
        if (0 == i3 || j < this.A0N[i] || ((j > this.A06 && !z) || (A00 = A00(i, i3, j, true)) == -1)) {
            return false;
        }
        this.A08 = j;
        this.A03 = A00;
        return true;
    }

    public final synchronized boolean A0E(boolean z) {
        boolean z2;
        int i = this.A03;
        boolean z3 = false;
        if (i != this.A02) {
            z3 = true;
        }
        z2 = true;
        if (!z3) {
            if (!z) {
                if (!this.A0E) {
                    C4B6 c4b6 = this.A0B;
                    if (c4b6 != null && c4b6 != this.A0A) {
                    }
                    z2 = false;
                }
            }
        } else if (((C98634bi) this.A0U.A00(this.A00 + i)).A00 == this.A0A) {
            int i2 = this.A04 + this.A03;
            int i3 = this.A01;
            if (i2 >= i3) {
                i2 -= i3;
            }
            C5T9 c5t9 = this.A0C;
            if (c5t9 != null && c5t9.Bzy() != 4) {
                if ((this.A0J[i2] & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) == 0) {
                    this.A0C.E4V();
                }
                z2 = false;
            } else {
                z2 = true;
            }
        }
        return z2;
    }

    @Override // X.InterfaceC98054ak
    public final void AWa(C4B6 c4b6) {
        boolean z;
        C4B6 c4b62 = c4b6;
        long j = this.A07;
        if (j != 0) {
            long j2 = c4b6.A0M;
            if (j2 != Long.MAX_VALUE) {
                C4B3 c4b3 = new C4B3(c4b6);
                c4b3.A0K = j2 + j;
                c4b62 = new C4B6(c4b3);
            }
        }
        this.A0H = false;
        this.A0P = c4b6;
        synchronized (this) {
            this.A0I = false;
            if (Util.A0I(c4b62, this.A0B)) {
                z = false;
            } else {
                SparseArray sparseArray = this.A0U.A01;
                if (sparseArray.size() != 0 && ((C98634bi) sparseArray.valueAt(sparseArray.size() - 1)).A00.equals(c4b62)) {
                    c4b62 = ((C98634bi) sparseArray.valueAt(sparseArray.size() - 1)).A00;
                }
                this.A0B = c4b62;
                this.A0G = C2IH.A07(c4b62.A0W, c4b62.A0R);
                this.A0F = false;
                z = true;
            }
        }
        InterfaceC71864X7x interfaceC71864X7x = this.A0D;
        if (interfaceC71864X7x != null && z) {
            C65771Ttm c65771Ttm = (C65771Ttm) interfaceC71864X7x;
            c65771Ttm.A0L.post(c65771Ttm.A0T);
        }
    }

    @Override // X.InterfaceC98054ak
    public final /* synthetic */ void ELN(C97974ac c97974ac, int i) {
        ELO(c97974ac, i, 0);
    }

    @Override // X.InterfaceC98054ak
    public final void ELT(C98094ao c98094ao, int i, int i2, int i3, long j) {
        InterfaceC98614bg interfaceC98614bg;
        if (this.A0H) {
            C4B6 c4b6 = this.A0P;
            C4B8.A01(c4b6);
            AWa(c4b6);
        }
        int i4 = i & 1;
        boolean z = false;
        if (i4 != 0) {
            z = true;
        }
        if (this.A0Q) {
            if (z) {
                this.A0Q = false;
            } else {
                return;
            }
        }
        long j2 = this.A07 + j;
        if (this.A0G) {
            if (j2 >= this.A08) {
                if (i4 == 0) {
                    if (!this.A0F) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(AbstractC111324zv.A00(1705));
                        sb.append(this.A0B);
                        AbstractC46512Bo.A04(AbstractC111324zv.A00(1791), sb.toString());
                        this.A0F = true;
                    }
                    i |= 1;
                }
            } else {
                return;
            }
        }
        long j3 = (this.A0T.A00 - i2) - i3;
        synchronized (this) {
            int i5 = this.A02;
            if (i5 > 0) {
                int i6 = this.A04 + (i5 - 1);
                int i7 = this.A01;
                if (i6 >= i7) {
                    i6 -= i7;
                }
                boolean z2 = false;
                if (this.A0M[i6] + this.A0K[i6] <= j3) {
                    z2 = true;
                }
                C4B8.A03(z2);
            }
            boolean z3 = false;
            if ((536870912 & i) != 0) {
                z3 = true;
            }
            this.A0E = z3;
            this.A06 = Math.max(this.A06, j2);
            int i8 = this.A04 + this.A02;
            int i9 = this.A01;
            if (i8 >= i9) {
                i8 -= i9;
            }
            this.A0N[i8] = j2;
            this.A0M[i8] = j3;
            this.A0K[i8] = i2;
            this.A0J[i8] = i;
            this.A0O[i8] = c98094ao;
            this.A0L[i8] = 0;
            C98124ar c98124ar = this.A0U;
            SparseArray sparseArray = c98124ar.A01;
            if (sparseArray.size() == 0 || !((C98634bi) sparseArray.valueAt(sparseArray.size() - 1)).A00.equals(this.A0B)) {
                C4XR c4xr = this.A0S;
                if (c4xr != null) {
                    interfaceC98614bg = c4xr.E55(this.A0B, this.A0R);
                } else {
                    interfaceC98614bg = InterfaceC98614bg.A00;
                }
                int i10 = this.A00 + this.A02;
                C4B6 c4b62 = this.A0B;
                c4b62.getClass();
                C98634bi c98634bi = new C98634bi(c4b62, interfaceC98614bg);
                boolean z4 = false;
                if (c98124ar.A00 == -1) {
                    boolean z5 = false;
                    if (sparseArray.size() == 0) {
                        z5 = true;
                    }
                    C4B8.A04(z5);
                    c98124ar.A00 = 0;
                }
                if (sparseArray.size() > 0) {
                    int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i10 >= keyAt) {
                        z4 = true;
                    }
                    C4B8.A03(z4);
                    if (keyAt == i10) {
                        c98124ar.A02.accept(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i10, c98634bi);
            }
            int i11 = this.A02 + 1;
            this.A02 = i11;
            int i12 = this.A01;
            if (i11 == i12) {
                int i13 = i12 + 1000;
                int[] iArr = new int[i13];
                long[] jArr = new long[i13];
                long[] jArr2 = new long[i13];
                int[] iArr2 = new int[i13];
                int[] iArr3 = new int[i13];
                C98094ao[] c98094aoArr = new C98094ao[i13];
                int i14 = this.A04;
                int i15 = i12 - i14;
                System.arraycopy(this.A0M, i14, jArr, 0, i15);
                System.arraycopy(this.A0N, this.A04, jArr2, 0, i15);
                System.arraycopy(this.A0J, this.A04, iArr2, 0, i15);
                System.arraycopy(this.A0K, this.A04, iArr3, 0, i15);
                System.arraycopy(this.A0O, this.A04, c98094aoArr, 0, i15);
                System.arraycopy(this.A0L, this.A04, iArr, 0, i15);
                int i16 = this.A04;
                System.arraycopy(this.A0M, 0, jArr, i15, i16);
                System.arraycopy(this.A0N, 0, jArr2, i15, i16);
                System.arraycopy(this.A0J, 0, iArr2, i15, i16);
                System.arraycopy(this.A0K, 0, iArr3, i15, i16);
                System.arraycopy(this.A0O, 0, c98094aoArr, i15, i16);
                System.arraycopy(this.A0L, 0, iArr, i15, i16);
                this.A0M = jArr;
                this.A0N = jArr2;
                this.A0J = iArr2;
                this.A0K = iArr3;
                this.A0O = c98094aoArr;
                this.A0L = iArr;
                this.A04 = 0;
                this.A01 = i13;
            }
        }
    }

    public static long A01(C98044aj c98044aj, int i) {
        c98044aj.A05 = Math.max(c98044aj.A05, A02(c98044aj, i));
        c98044aj.A02 -= i;
        int i2 = c98044aj.A00 + i;
        c98044aj.A00 = i2;
        int i3 = c98044aj.A04 + i;
        c98044aj.A04 = i3;
        int i4 = c98044aj.A01;
        if (i3 >= i4) {
            c98044aj.A04 = i3 - i4;
        }
        int i5 = c98044aj.A03 - i;
        c98044aj.A03 = i5;
        if (i5 < 0) {
            c98044aj.A03 = 0;
        }
        C98124ar c98124ar = c98044aj.A0U;
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = c98124ar.A01;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            c98124ar.A02.accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = c98124ar.A00;
            if (i8 > 0) {
                c98124ar.A00 = i8 - 1;
            }
            i6 = i7;
        }
        if (c98044aj.A02 == 0) {
            int i9 = c98044aj.A04;
            if (i9 == 0) {
                i9 = c98044aj.A01;
            }
            return c98044aj.A0M[i9 - 1] + c98044aj.A0K[r1];
        }
        return c98044aj.A0M[c98044aj.A04];
    }

    public static long A02(C98044aj c98044aj, int i) {
        long j = Long.MIN_VALUE;
        if (i != 0) {
            int i2 = c98044aj.A04 + (i - 1);
            int i3 = c98044aj.A01;
            if (i2 >= i3) {
                i2 -= i3;
            }
            for (int i4 = 0; i4 < i; i4++) {
                j = Math.max(j, c98044aj.A0N[i2]);
                if ((c98044aj.A0J[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = i3 - 1;
                }
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        if (r5 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0086, code lost:
    
        if (r6 != r10.A0A) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[Catch: all -> 0x010b, TryCatch #0 {, blocks: (B:7:0x000b, B:9:0x0013, B:11:0x0022, B:13:0x0026, B:15:0x002f, B:16:0x0030, B:18:0x0034, B:20:0x003b, B:22:0x0044, B:23:0x0049, B:27:0x004e, B:29:0x0060, B:30:0x0065, B:47:0x0088, B:50:0x0091, B:52:0x0099, B:53:0x00a9, B:56:0x00b6, B:59:0x00bd, B:61:0x00c3, B:63:0x00d1, B:67:0x008f, B:69:0x007a, B:71:0x007e, B:74:0x0084, B:76:0x00da), top: B:6:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1 A[Catch: all -> 0x010b, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000b, B:9:0x0013, B:11:0x0022, B:13:0x0026, B:15:0x002f, B:16:0x0030, B:18:0x0034, B:20:0x003b, B:22:0x0044, B:23:0x0049, B:27:0x004e, B:29:0x0060, B:30:0x0065, B:47:0x0088, B:50:0x0091, B:52:0x0099, B:53:0x00a9, B:56:0x00b6, B:59:0x00bd, B:61:0x00c3, B:63:0x00d1, B:67:0x008f, B:69:0x007a, B:71:0x007e, B:74:0x0084, B:76:0x00da), top: B:6:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008f A[Catch: all -> 0x010b, TryCatch #0 {, blocks: (B:7:0x000b, B:9:0x0013, B:11:0x0022, B:13:0x0026, B:15:0x002f, B:16:0x0030, B:18:0x0034, B:20:0x003b, B:22:0x0044, B:23:0x0049, B:27:0x004e, B:29:0x0060, B:30:0x0065, B:47:0x0088, B:50:0x0091, B:52:0x0099, B:53:0x00a9, B:56:0x00b6, B:59:0x00bd, B:61:0x00c3, B:63:0x00d1, B:67:0x008f, B:69:0x007a, B:71:0x007e, B:74:0x0084, B:76:0x00da), top: B:6:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A04(X.C96084Tr r11, X.C96094Ts r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98044aj.A04(X.4Tr, X.4Ts, int, boolean):int");
    }

    public final void A06() {
        long A01;
        C98064al c98064al = this.A0T;
        synchronized (this) {
            int i = this.A02;
            if (i != 0) {
                A01 = A01(this, i);
            } else {
                A01 = -1;
            }
        }
        c98064al.A05(A01);
    }

    public final void A07() {
        C5T9 c5t9 = this.A0C;
        if (c5t9 != null && c5t9.Bzy() == 1) {
            C5PN B2Y = this.A0C.B2Y();
            B2Y.getClass();
            throw B2Y;
        }
    }

    public final void A0C(boolean z) {
        SparseArray sparseArray;
        C98064al c98064al = this.A0T;
        C98064al.A04(c98064al.A01, c98064al);
        C98074am c98074am = c98064al.A01;
        boolean z2 = false;
        if (c98074am.A03 == null) {
            z2 = true;
        }
        C4B8.A04(z2);
        c98074am.A01 = 0L;
        c98074am.A00 = OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
        c98064al.A02 = c98074am;
        c98064al.A03 = c98074am;
        c98064al.A00 = 0L;
        c98064al.A04.F8c();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0Q = true;
        this.A08 = Long.MIN_VALUE;
        this.A05 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A0E = false;
        C98124ar c98124ar = this.A0U;
        int i = 0;
        while (true) {
            sparseArray = c98124ar.A01;
            if (i >= sparseArray.size()) {
                break;
            }
            c98124ar.A02.accept(sparseArray.valueAt(i));
            i++;
        }
        c98124ar.A00 = -1;
        sparseArray.clear();
        if (z) {
            this.A0P = null;
            this.A0B = null;
            this.A0I = true;
        }
    }

    @Override // X.InterfaceC98054ak
    public final void ELO(C97974ac c97974ac, int i, int i2) {
        C98064al c98064al = this.A0T;
        while (i > 0) {
            int A00 = C98064al.A00(c98064al, i);
            C98074am c98074am = c98064al.A03;
            c97974ac.A0J(c98074am.A03.A00, (int) (c98064al.A00 - c98074am.A01), A00);
            i -= A00;
            long j = c98064al.A00 + A00;
            c98064al.A00 = j;
            C98074am c98074am2 = c98064al.A03;
            if (j == c98074am2.A00) {
                c98064al.A03 = c98074am2.A02;
            }
        }
    }

    @Override // X.InterfaceC98054ak
    public final int ELR(InterfaceC92364Br interfaceC92364Br, int i, int i2, boolean z) {
        C98064al c98064al = this.A0T;
        int A00 = C98064al.A00(c98064al, i);
        C98074am c98074am = c98064al.A03;
        int read = interfaceC92364Br.read(c98074am.A03.A00, (int) (c98064al.A00 - c98074am.A01), A00);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = c98064al.A00 + read;
        c98064al.A00 = j;
        C98074am c98074am2 = c98064al.A03;
        if (j != c98074am2.A00) {
            return read;
        }
        c98064al.A03 = c98074am2.A02;
        return read;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4an, java.lang.Object] */
    public C98044aj(C4XY c4xy, C4XR c4xr, InterfaceC96344Us interfaceC96344Us) {
        this.A0S = c4xr;
        this.A0R = c4xy;
        this.A0T = new C98064al(interfaceC96344Us);
    }

    public final void A08() {
        A06();
        C5T9 c5t9 = this.A0C;
        if (c5t9 != null) {
            c5t9.EE2(this.A0R);
            this.A0C = null;
            this.A0A = null;
        }
    }

    @Override // X.InterfaceC98054ak
    public final void FDI(android.net.Uri uri) {
        this.A09 = uri;
    }
}
