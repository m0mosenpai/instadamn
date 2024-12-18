package X;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.4YP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YP implements C4Z0, InterfaceC96674Wc, C4YQ {
    public static final Pattern A0P = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A0Q = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public int A00;
    public InterfaceC96664Wb A01;
    public C92124As A02;
    public List A03;
    public final int A07;
    public final long A08;
    public final C4V3 A09;
    public final C4WZ A0A;
    public final C4XY A0B;
    public final C4XR A0C;
    public final C4XX A0D;
    public final C4WU A0E;
    public final C4XZ A0F;
    public final C4XD A0G;
    public final C4YR A0H;
    public final InterfaceC96344Us A0I;
    public final C4XO A0J;
    public final InterfaceC96934Xd A0K;
    public final C2BC A0L;
    public final C97164Yb[] A0N;
    public final C4XQ A0O;
    public C4YV[] A04 = new C4YV[0];
    public C4YY[] A06 = new C4YY[0];
    public final IdentityHashMap A0M = new IdentityHashMap();
    public C4Z1 A05 = new C4YZ(this.A04);

    public static C92164Aw A00(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C92164Aw c92164Aw = (C92164Aw) list.get(i);
            if (str.equals(c92164Aw.A01)) {
                return c92164Aw;
            }
        }
        return null;
    }

    @Override // X.C4Z0
    public final long E7z() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed A[Catch: 4YE -> 0x027c, TryCatch #0 {4YE -> 0x027c, blocks: (B:17:0x0061, B:18:0x0091, B:20:0x0098, B:22:0x00b0, B:24:0x00c0, B:25:0x00e3, B:26:0x00e5, B:28:0x00ed, B:34:0x0108, B:38:0x010b, B:40:0x0111, B:42:0x011b, B:45:0x015c, B:46:0x015e, B:47:0x0184, B:51:0x0161, B:53:0x0165, B:55:0x025b, B:56:0x0260, B:62:0x014c, B:63:0x0157, B:64:0x01a7, B:65:0x01cc, B:67:0x01e2, B:69:0x01ea, B:71:0x01f4, B:73:0x0214, B:74:0x0218, B:78:0x022c, B:80:0x0230, B:82:0x0255, B:83:0x0223, B:85:0x0261, B:87:0x0269, B:89:0x026f, B:91:0x0275, B:92:0x0279), top: B:16:0x0061 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C92124As r53, int r54) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YP.A01(X.4As, int):void");
    }

    @Override // X.C4Z1
    public final void AGb(long j) {
        this.A05.AGb(j);
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean AJq(long j, long j2) {
        C4TM c4tm;
        C97934aY c97934aY;
        long A00;
        C4X2 c4x2;
        C4Z1 c4z1 = this.A05;
        long j3 = -9223372036854775807L;
        for (C4YV c4yv : this.A04) {
            if (!c4yv.A04()) {
                AbstractC98474bQ abstractC98474bQ = null;
                if (!C2C5.A02(C2C1.A0y) || !c4yv.A0N.isEmpty()) {
                    abstractC98474bQ = (AbstractC98474bQ) c4yv.A0N.get(r1.size() - 1);
                }
                InterfaceC97914aW interfaceC97914aW = c4yv.A0K;
                long j4 = c4yv.A02;
                C97894aU c97894aU = (C97894aU) interfaceC97914aW;
                if (c97894aU.A0D.A0R && ((abstractC98474bQ != null || j4 != -9223372036854775807L) && (c4tm = c97894aU.A09) != null)) {
                    C97934aY[] c97934aYArr = c97894aU.A0f;
                    if (abstractC98474bQ == null) {
                        c97934aY = c97934aYArr[0];
                        if (c97934aY.A02.BsK(c97934aY.A00) != 0 && c97934aY.A02.BsK(c97934aY.A00) != -1) {
                            A00 = c97934aYArr[c97894aU.A0E.Bsd()].A04(j4);
                        }
                    } else {
                        c97934aY = c97934aYArr[c97894aU.A0E.Bsd()];
                        j4 = abstractC98474bQ.A02;
                        A00 = abstractC98474bQ.A00();
                    }
                    c97934aY.A02.getClass();
                    Pair A03 = c97894aU.A03(c97934aY);
                    long C8V = c97934aY.A02.C8V(((Number) A03.first).longValue() - c97934aY.A01);
                    long A032 = c97934aY.A03(((Number) A03.second).longValue());
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C4WE c4we = c97894aU.A0E;
                    C92124As c92124As = c97894aU.A0D;
                    long BUB = c4we.BUB(c97894aU.A0V, c97894aU, j4, A00, C8V, A032, ((Number) A03.first).longValue(), ((Number) A03.second).longValue(), c4tm.A03.get(), c4tm.A04.get(), c4tm.A05.get(), c92124As.A0R, c92124As.A0S, c97894aU.A0I);
                    if (BUB != -9223372036854775807L && (c4x2 = c4tm.A00) != null) {
                        c4x2.A00.A0O.A02.add(Pair.create(EnumC96884Wy.A03, Long.valueOf(elapsedRealtime)));
                    }
                    if (BUB != -9223372036854775807L) {
                        j3 = Math.max(j3, BUB);
                    }
                }
            }
        }
        return c4z1.AJq(j, j3);
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean AJr(C69080VhW c69080VhW) {
        return this.A05.AJr(c69080VhW);
    }

    @Override // X.C4Z0
    public final void APa(long j, boolean z) {
        AbstractC98514bU abstractC98514bU;
        long j2;
        for (C4YV c4yv : this.A04) {
            if (!c4yv.A04()) {
                C98044aj c98044aj = c4yv.A0I;
                int i = c98044aj.A00;
                c98044aj.A0B(j, z, true);
                int i2 = c98044aj.A00;
                if (i2 > i) {
                    synchronized (c98044aj) {
                        if (c98044aj.A02 != 0) {
                            j2 = c98044aj.A0N[c98044aj.A04];
                        } else {
                            j2 = Long.MIN_VALUE;
                        }
                    }
                    int i3 = 0;
                    while (true) {
                        C98044aj[] c98044ajArr = c4yv.A0U;
                        if (i3 >= c98044ajArr.length) {
                            break;
                        }
                        c98044ajArr[i3].A0B(j2, z, c4yv.A0V[i3]);
                        i3++;
                    }
                }
                int A00 = C4YV.A00(c4yv, i2, 0);
                if (A00 > 0) {
                    ArrayList arrayList = c4yv.A0N;
                    int i4 = A00 - 1;
                    if (((AbstractC98234b2) arrayList.get(i4)).A04 <= j && j <= ((AbstractC98234b2) arrayList.get(i4)).A02) {
                        abstractC98514bU = (AbstractC98514bU) arrayList.get(i4);
                    } else {
                        arrayList.get(i4);
                        abstractC98514bU = null;
                    }
                    c4yv.A05 = abstractC98514bU;
                    if (A00 <= arrayList.size()) {
                        arrayList.subList(0, A00).clear();
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // X.C4Z0
    public final long AZz(C4TT c4tt, long j) {
        for (C4YV c4yv : this.A04) {
            if (c4yv.A0F == 2) {
                return c4yv.A0K.AZz(c4tt, j);
            }
        }
        return j;
    }

    @Override // X.C4Z1
    public final long Aii(long j) {
        return this.A05.Aii(j);
    }

    @Override // X.C4Z0, X.C4Z1
    public final long Aik() {
        return this.A05.Aik();
    }

    @Override // X.C4Z0, X.C4Z1
    public final long BWx() {
        return this.A05.BWx();
    }

    @Override // X.C4Z0
    public final C4WU CAF() {
        return this.A0E;
    }

    @Override // X.C4Z0
    public final void Coz() {
        this.A0K.Coy();
    }

    @Override // X.InterfaceC96674Wc
    public final /* bridge */ /* synthetic */ void D7l(C4Z1 c4z1) {
        InterfaceC96664Wb interfaceC96664Wb = this.A01;
        if (interfaceC96664Wb != null) {
            interfaceC96664Wb.D7l(this);
        }
    }

    @Override // X.C4Z0
    public final long E53(long j) {
        for (C4YV c4yv : this.A04) {
            c4yv.A03 = j;
        }
        return j;
    }

    @Override // X.C4Z0
    public final void E5S(InterfaceC96664Wb interfaceC96664Wb, long j) {
        this.A01 = interfaceC96664Wb;
        interfaceC96664Wb.DaW(this);
    }

    @Override // X.C4Z0, X.C4Z1
    public final void ECm(long j) {
        this.A05.ECm(j);
    }

    @Override // X.C4Z0
    public final long EMn(long j, boolean z) {
        ArrayList arrayList;
        boolean A0D;
        for (C4YV c4yv : this.A04) {
            c4yv.A03 = -1L;
            c4yv.A01 = j;
            if (c4yv.A04()) {
                c4yv.A02 = j;
            } else {
                AbstractC98514bU abstractC98514bU = null;
                int i = 0;
                while (true) {
                    arrayList = c4yv.A0N;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    AbstractC98514bU abstractC98514bU2 = (AbstractC98514bU) arrayList.get(i);
                    long j2 = ((AbstractC98234b2) abstractC98514bU2).A04;
                    if (j2 == j && abstractC98514bU2.A03 == -9223372036854775807L) {
                        abstractC98514bU = abstractC98514bU2;
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                    i++;
                }
                C98044aj c98044aj = c4yv.A0I;
                if (abstractC98514bU != null) {
                    A0D = false;
                    int[] iArr = abstractC98514bU.A01;
                    C4B8.A01(iArr);
                    int i2 = iArr[0];
                    synchronized (c98044aj) {
                        c98044aj.A03 = 0;
                        C98064al c98064al = c98044aj.A0T;
                        c98064al.A02 = c98064al.A01;
                        int i3 = c98044aj.A00;
                        if (i2 >= i3) {
                            if (i2 <= c98044aj.A02 + i3) {
                                c98044aj.A08 = Long.MIN_VALUE;
                                c98044aj.A03 = i2 - i3;
                                A0D = true;
                            }
                        }
                    }
                } else {
                    boolean z2 = false;
                    if (j < c4yv.BWx()) {
                        z2 = true;
                    }
                    A0D = c98044aj.A0D(j, z2);
                }
                if (A0D && (!c4yv.A0C || z)) {
                    for (C98044aj c98044aj2 : c4yv.A0U) {
                        c98044aj2.A0D(j, true);
                    }
                } else {
                    c4yv.A02 = j;
                    c4yv.A0B = false;
                    arrayList.clear();
                    C98004af c98004af = c4yv.A0M;
                    if (c98004af.A01 != null) {
                        c98044aj.A06();
                        for (C98044aj c98044aj3 : c4yv.A0U) {
                            c98044aj3.A06();
                        }
                        c98004af.A00();
                    } else {
                        c98004af.A02 = null;
                        c98044aj.A0C(false);
                        for (C98044aj c98044aj4 : c4yv.A0U) {
                            c98044aj4.A0C(false);
                        }
                    }
                }
            }
            c4yv.A0C = false;
        }
        for (C4YY c4yy : this.A06) {
            c4yy.A00(j);
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C4Z0
    public final long EMx(InterfaceC97394Yz[] interfaceC97394YzArr, C4WE[] c4weArr, boolean[] zArr, boolean[] zArr2, long j) {
        Object obj;
        InterfaceC97394Yz c4yy;
        C4WV c4wv;
        int i;
        boolean z;
        C4WV c4wv2;
        int i2;
        int i3;
        int length = c4weArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            C4WE c4we = c4weArr[i4];
            if (c4we != null) {
                i3 = this.A0E.A02.indexOf(c4we.CAE());
                if (i3 >= 0) {
                    iArr[i4] = i3;
                }
            }
            i3 = -1;
            iArr[i4] = i3;
        }
        for (int i5 = 0; i5 < length; i5++) {
            if (c4weArr[i5] == null || !zArr[i5]) {
                Object[] objArr = interfaceC97394YzArr[i5];
                if (objArr instanceof C4YV) {
                    C4YV c4yv = (C4YV) objArr;
                    c4yv.A07 = this;
                    c4yv.A0I.A08();
                    for (C98044aj c98044aj : c4yv.A0U) {
                        c98044aj.A08();
                    }
                    c4yv.A0M.A03(c4yv);
                } else if (objArr instanceof C97304Yp) {
                    C97304Yp c97304Yp = (C97304Yp) objArr;
                    boolean[] zArr3 = c97304Yp.A04.A0V;
                    int i6 = c97304Yp.A01;
                    C4B8.A04(zArr3[i6]);
                    zArr3[i6] = false;
                }
                interfaceC97394YzArr[i5] = 0;
            }
        }
        for (int i7 = 0; i7 < length; i7++) {
            Object[] objArr2 = interfaceC97394YzArr[i7];
            if ((objArr2 instanceof C97314Yq) || (objArr2 instanceof C97304Yp)) {
                int i8 = iArr[i7];
                if (i8 != -1) {
                    C97164Yb[] c97164YbArr = this.A0N;
                    int i9 = c97164YbArr[i8].A03;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        int i11 = iArr[i10];
                        if (i11 == i9 && c97164YbArr[i11].A04 == 0) {
                            if (i10 != -1) {
                                Object[] objArr3 = interfaceC97394YzArr[i7];
                                if ((objArr3 instanceof C97304Yp) && ((C97304Yp) objArr3).A02 == interfaceC97394YzArr[i10]) {
                                }
                            }
                        } else {
                            i10++;
                        }
                    }
                }
                if (interfaceC97394YzArr[i7] instanceof C97314Yq) {
                }
                Object[] objArr4 = interfaceC97394YzArr[i7];
                if (objArr4 instanceof C97304Yp) {
                    C97304Yp c97304Yp2 = (C97304Yp) objArr4;
                    boolean[] zArr4 = c97304Yp2.A04.A0V;
                    int i12 = c97304Yp2.A01;
                    C4B8.A04(zArr4[i12]);
                    zArr4[i12] = false;
                }
                interfaceC97394YzArr[i7] = 0;
            }
        }
        for (int i13 = 0; i13 < length; i13++) {
            C4WE c4we2 = c4weArr[i13];
            if (c4we2 != null) {
                Object[] objArr5 = interfaceC97394YzArr[i13];
                if (objArr5 == 0) {
                    zArr2[i13] = true;
                    C97164Yb c97164Yb = this.A0N[iArr[i13]];
                    if (c97164Yb.A04 == 0) {
                        int i14 = c97164Yb.A01;
                        boolean z2 = false;
                        if (i14 != -1) {
                            z2 = true;
                        }
                        C122355gV c122355gV = null;
                        if (z2) {
                            c4wv = (C4WV) this.A0E.A02.get(i14);
                            i = 1;
                        } else {
                            c4wv = null;
                            i = 0;
                        }
                        int i15 = c97164Yb.A00;
                        if (i15 != -1) {
                            z = true;
                            c4wv2 = (C4WV) this.A0E.A02.get(i15);
                            i += c4wv2.A01;
                        } else {
                            z = false;
                            c4wv2 = null;
                        }
                        C4B6[] c4b6Arr = new C4B6[i];
                        int[] iArr2 = new int[i];
                        if (z2) {
                            c4b6Arr[0] = c4wv.A04[0];
                            iArr2[0] = 5;
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z) {
                            for (int i16 = 0; i16 < c4wv2.A01; i16++) {
                                C4B6 c4b6 = c4wv2.A04[i16];
                                c4b6Arr[i2] = c4b6;
                                iArr2[i2] = 3;
                                arrayList.add(c4b6);
                                i2++;
                            }
                        }
                        if (this.A02.A0R && (z2 || this.A09.A0J)) {
                            C4YR c4yr = this.A0H;
                            c122355gV = new C122355gV(c4yr, c4yr.A07);
                        }
                        C4XD c4xd = this.A0G;
                        InterfaceC96934Xd interfaceC96934Xd = this.A0K;
                        C92124As c92124As = this.A02;
                        C4XZ c4xz = this.A0F;
                        int i17 = this.A00;
                        int[] iArr3 = c97164Yb.A06;
                        int i18 = c97164Yb.A05;
                        long j2 = this.A08;
                        C2BC c2bc = this.A0L;
                        C4WZ c4wz = this.A0A;
                        C4V3 c4v3 = this.A09;
                        C4YR c4yr2 = this.A0H;
                        C4XX c4xx = this.A0D;
                        c4yy = new C4YV(c4v3, this.A0B, this.A0C, c4xx, this, c4xd.ALw(c4v3, c4wz, c4xx, c4xz, c122355gV, c4yr2, c92124As, c4we2, interfaceC96934Xd, c2bc, arrayList, iArr3, i17, i18, j2, z2), this.A0I, this.A0J, iArr2, c4b6Arr, i18, j);
                        synchronized (this) {
                            this.A0M.put(c4yy, c122355gV);
                        }
                    } else if (c97164Yb.A04 == 2) {
                        c4yy = new C4YY(c4we2.CAE().A04[0], (SMI) this.A03.get(c97164Yb.A02), this.A02.A0R);
                    }
                    interfaceC97394YzArr[i13] = c4yy;
                } else if (objArr5 instanceof C4YV) {
                    ((C97894aU) ((InterfaceC97904aV) ((C4YV) objArr5).A0K)).A0E = c4we2;
                }
            }
        }
        for (int i19 = 0; i19 < length; i19++) {
            if (interfaceC97394YzArr[i19] == 0 && c4weArr[i19] != null) {
                int i20 = iArr[i19];
                C97164Yb[] c97164YbArr2 = this.A0N;
                C97164Yb c97164Yb2 = c97164YbArr2[i20];
                if (c97164Yb2.A04 != 1) {
                    continue;
                } else {
                    int i21 = iArr[i19];
                    if (i21 != -1) {
                        int i22 = c97164YbArr2[i21].A03;
                        int i23 = 0;
                        while (true) {
                            if (i23 >= length) {
                                break;
                            }
                            int i24 = iArr[i23];
                            if (i24 == i22 && c97164YbArr2[i24].A04 == 0) {
                                if (i23 != -1) {
                                    C4YV c4yv2 = (C4YV) interfaceC97394YzArr[i23];
                                    int i25 = c97164Yb2.A05;
                                    int i26 = 0;
                                    while (true) {
                                        C98044aj[] c98044ajArr = c4yv2.A0U;
                                        if (i26 < c98044ajArr.length) {
                                            if (c4yv2.A0S[i26] == i25) {
                                                boolean[] zArr5 = c4yv2.A0V;
                                                C4B8.A04(!zArr5[i26]);
                                                zArr5[i26] = true;
                                                c98044ajArr[i26].A0D(j, true);
                                                obj = new C97304Yp(c98044ajArr[i26], c4yv2, c4yv2, i26);
                                                break;
                                            }
                                            i26++;
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                }
                            } else {
                                i23++;
                            }
                        }
                    }
                    obj = new Object();
                    interfaceC97394YzArr[i19] = obj;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object[] objArr6 : interfaceC97394YzArr) {
            if (objArr6 instanceof C4YV) {
                arrayList2.add(objArr6);
            } else if (objArr6 instanceof C4YY) {
                arrayList3.add(objArr6);
            }
        }
        C4YV[] c4yvArr = new C4YV[arrayList2.size()];
        this.A04 = c4yvArr;
        arrayList2.toArray(c4yvArr);
        C4YY[] c4yyArr = new C4YY[arrayList3.size()];
        this.A06 = c4yyArr;
        arrayList3.toArray(c4yyArr);
        this.A05 = new C4YZ(this.A04);
        return j;
    }

    @Override // X.C4Z1
    public final void Eax(boolean z) {
        this.A05.Eax(z);
    }

    @Override // X.C4Z1
    public final void FBK(byte b, boolean z) {
        this.A05.FBK(b, z);
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean isLoading() {
        return this.A05.isLoading();
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0263 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4YP(X.C4V3 r32, X.C4WZ r33, X.C4XY r34, X.C4XR r35, X.C4XQ r36, X.C4XX r37, X.C4XZ r38, X.C4XD r39, X.InterfaceC96914Xb r40, X.C92124As r41, X.InterfaceC96344Us r42, X.C4XO r43, X.InterfaceC96934Xd r44, X.C2BC r45, int r46, int r47, long r48) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YP.<init>(X.4V3, X.4WZ, X.4XY, X.4XR, X.4XQ, X.4XX, X.4XZ, X.4XD, X.4Xb, X.4As, X.4Us, X.4XO, X.4Xd, X.2BC, int, int, long):void");
    }
}
