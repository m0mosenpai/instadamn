package X;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.Util;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ttm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65771Ttm implements C4Z0, C4XF, C4YW, C4YX, InterfaceC71864X7x {
    public static final C4B6 A0d;
    public static final Map A0e;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public InterfaceC98454bO A05;
    public InterfaceC96664Wb A06;
    public C66005Ty0 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public C66002Txx[] A0G;
    public C98044aj[] A0H;
    public long A0I;
    public boolean A0J;
    public boolean A0K;
    public final Handler A0L;
    public final C4XY A0M;
    public final C4XR A0N;
    public final C4XX A0O;
    public final InterfaceC71906X9q A0P;
    public final InterfaceC96344Us A0Q;
    public final C4XO A0R;
    public final String A0V;
    public final boolean A0W;
    public final android.net.Uri A0X;
    public final InterfaceC71863X7w A0Y;
    public final InterfaceC92354Bq A0Z;
    public final boolean A0b;
    public final boolean A0c;
    public final C98004af A0S = new C98004af("Loader:ProgressiveMediaPeriod");
    public final C4UP A0a = new C4UP();
    public final Runnable A0T = new Runnable() { // from class: X.Txs
        @Override // java.lang.Runnable
        public final void run() {
            C65771Ttm.A02(C65771Ttm.this);
        }
    };
    public final Runnable A0U = new Runnable() { // from class: X.Txr
        @Override // java.lang.Runnable
        public final void run() {
            C65771Ttm c65771Ttm = C65771Ttm.this;
            if (!c65771Ttm.A0F) {
                InterfaceC96664Wb interfaceC96664Wb = c65771Ttm.A06;
                interfaceC96664Wb.getClass();
                interfaceC96664Wb.D7l(c65771Ttm);
            }
        }
    };

    private void A01() {
        C65994Txp c65994Txp = new C65994Txp(this.A0X, this, this.A0Y, this, this.A0Z, this.A0a);
        if (this.A0E) {
            C4B8.A04(A05(this));
            long j = this.A03;
            if (j != -9223372036854775807L && this.A0I >= j) {
                this.A0B = true;
                this.A0I = -9223372036854775807L;
                return;
            }
            InterfaceC98454bO interfaceC98454bO = this.A05;
            interfaceC98454bO.getClass();
            long j2 = interfaceC98454bO.Bs5(this.A0I).A00.A00;
            long j3 = this.A0I;
            c65994Txp.A04.A00 = j2;
            c65994Txp.A00 = j3;
            c65994Txp.A02 = true;
            for (C98044aj c98044aj : this.A0H) {
                c98044aj.A08 = j3;
            }
            this.A0I = -9223372036854775807L;
        }
        int i = 0;
        for (C98044aj c98044aj2 : this.A0H) {
            i += c98044aj2.A00 + c98044aj2.A02;
        }
        this.A02 = i;
        C98004af c98004af = this.A0S;
        C4XO c4xo = this.A0R;
        int i2 = this.A00;
        int i3 = ((C4XN) c4xo).A00;
        if (i3 == -1) {
            i3 = 3;
            if (i2 == 7) {
                i3 = 6;
            }
        }
        c98004af.A02(this, c65994Txp, i3);
        C4C7 c4c7 = c65994Txp.A01;
        if (!this.A0W) {
            this.A0O.A04(null, new C98264b5(c4c7), null, 1, -1, 0, c65994Txp.A00, this.A03);
        } else {
            this.A0O.A02(null, new C98264b5(c4c7), null, 1, -1, 0, 0, c65994Txp.A00, this.A03);
        }
    }

    @Override // X.C4Z1
    public final void AGb(long j) {
    }

    @Override // X.C4XF
    public final void ASd() {
        this.A0J = true;
        this.A0L.post(this.A0T);
    }

    @Override // X.C4Z0
    public final long E53(long j) {
        return 0L;
    }

    @Override // X.C4Z0, X.C4Z1
    public final void ECm(long j) {
    }

    @Override // X.C4Z1
    public final void Eax(boolean z) {
    }

    @Override // X.C4Z1
    public final void FBK(byte b, boolean z) {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0e = Collections.unmodifiableMap(hashMap);
        C4B3 c4b3 = new C4B3();
        c4b3.A0R = "icy";
        c4b3.A0U = "application/x-icy";
        A0d = new C4B6(c4b3);
    }

    private void A00() {
        C4B8.A04(this.A0E);
        this.A07.getClass();
        this.A05.getClass();
    }

    public static void A02(C65771Ttm c65771Ttm) {
        C4B6 c4b6;
        boolean z;
        C4B6 c4b62;
        if (!c65771Ttm.A0F && !c65771Ttm.A0E && c65771Ttm.A0J && c65771Ttm.A05 != null) {
            for (C98044aj c98044aj : c65771Ttm.A0H) {
                synchronized (c98044aj) {
                    if (!c98044aj.A0I) {
                        c4b62 = c98044aj.A0B;
                    } else {
                        c4b62 = null;
                    }
                }
                if (c4b62 == null) {
                    return;
                }
            }
            c65771Ttm.A0a.A01();
            int length = c65771Ttm.A0H.length;
            C4WV[] c4wvArr = new C4WV[length];
            boolean[] zArr = new boolean[length];
            for (int i = 0; i < length; i++) {
                C98044aj c98044aj2 = c65771Ttm.A0H[i];
                synchronized (c98044aj2) {
                    if (!c98044aj2.A0I) {
                        c4b6 = c98044aj2.A0B;
                    } else {
                        c4b6 = null;
                    }
                }
                c4b6.getClass();
                String str = c4b6.A0W;
                if (!C2IH.A04(str)) {
                    boolean A06 = C2IH.A06(str);
                    z = false;
                    if (!A06) {
                        zArr[i] = z;
                        c65771Ttm.A08 = z | c65771Ttm.A08;
                        c4wvArr[i] = new C4WV("", c4b6);
                    }
                }
                z = true;
                zArr[i] = z;
                c65771Ttm.A08 = z | c65771Ttm.A08;
                c4wvArr[i] = new C4WV("", c4b6);
            }
            c65771Ttm.A07 = new C66005Ty0(new C4WU(c4wvArr), zArr);
            c65771Ttm.A0E = true;
            InterfaceC96664Wb interfaceC96664Wb = c65771Ttm.A06;
            interfaceC96664Wb.getClass();
            interfaceC96664Wb.DaW(c65771Ttm);
        }
    }

    public static boolean A05(C65771Ttm c65771Ttm) {
        if (c65771Ttm.A0I == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public final void A06() {
        C98004af c98004af = this.A0S;
        C4XO c4xo = this.A0R;
        int i = this.A00;
        int i2 = ((C4XN) c4xo).A00;
        if (i2 == -1) {
            i2 = 3;
            if (i == 7) {
                i2 = 6;
            }
        }
        IOException iOException = c98004af.A02;
        if (iOException == null) {
            HandlerC98524bV handlerC98524bV = c98004af.A01;
            if (handlerC98524bV != null) {
                if (i2 == Integer.MIN_VALUE) {
                    i2 = handlerC98524bV.A06;
                }
                IOException iOException2 = handlerC98524bV.A02;
                if (iOException2 != null && handlerC98524bV.A00 > i2) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean AJq(long j, long j2) {
        if (!this.A0B) {
            C98004af c98004af = this.A0S;
            if (c98004af.A02 == null && !this.A0D && (!this.A0E || this.A01 != 0)) {
                boolean A02 = this.A0a.A02();
                if (c98004af.A01 != null) {
                    return A02;
                }
                A01();
                return true;
            }
        }
        return false;
    }

    @Override // X.C4Z0, X.C4Z1
    public final /* synthetic */ boolean AJr(C69080VhW c69080VhW) {
        return AJq(c69080VhW.A01, -9223372036854775807L);
    }

    @Override // X.C4Z1
    public final long Aii(long j) {
        long Aik;
        if (this.A0c && !this.A0E) {
            return 0L;
        }
        if (this.A0B) {
            Aik = this.A03;
        } else {
            Aik = Aik();
        }
        return Aik - j;
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPZ(InterfaceC98244b3 interfaceC98244b3, long j, long j2, boolean z) {
        C65994Txp c65994Txp = (C65994Txp) interfaceC98244b3;
        C98254b4 c98254b4 = c65994Txp.A05;
        this.A0O.A03(null, new C98264b5(c98254b4.A01, c65994Txp.A01, c98254b4.A02), null, 1, -1, 0, c65994Txp.A00, this.A03);
        if (!z) {
            for (C98044aj c98044aj : this.A0H) {
                c98044aj.A0C(false);
            }
            if (this.A01 > 0) {
                InterfaceC96664Wb interfaceC96664Wb = this.A06;
                interfaceC96664Wb.getClass();
                interfaceC96664Wb.D7l(this);
            }
        }
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPd(InterfaceC98244b3 interfaceC98244b3, long j, long j2) {
        InterfaceC98454bO interfaceC98454bO;
        long j3;
        C65994Txp c65994Txp = (C65994Txp) interfaceC98244b3;
        if (this.A03 == -9223372036854775807L && (interfaceC98454bO = this.A05) != null) {
            boolean Cca = interfaceC98454bO.Cca();
            long j4 = Long.MIN_VALUE;
            int i = 0;
            while (true) {
                C98044aj[] c98044ajArr = this.A0H;
                if (i >= c98044ajArr.length) {
                    break;
                }
                j4 = Math.max(j4, c98044ajArr[i].A05());
                i++;
            }
            if (j4 == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = j4 + 10000;
            }
            this.A03 = j3;
            this.A0P.DnN(j3, Cca, this.A0A);
        }
        C98254b4 c98254b4 = c65994Txp.A05;
        this.A0O.A05(null, new C98264b5(c98254b4.A01, c65994Txp.A01, c98254b4.A02), null, c65994Txp, null, 1, -1, 0, c65994Txp.A00, this.A03);
        this.A0B = true;
        InterfaceC96664Wb interfaceC96664Wb = this.A06;
        interfaceC96664Wb.getClass();
        interfaceC96664Wb.D7l(this);
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ C98014ag DPf(InterfaceC98244b3 interfaceC98244b3, IOException iOException, int i, long j, long j2) {
        C98014ag c98014ag;
        InterfaceC98454bO interfaceC98454bO;
        C65994Txp c65994Txp = (C65994Txp) interfaceC98244b3;
        C98254b4 c98254b4 = c65994Txp.A05;
        C98264b5 c98264b5 = new C98264b5(c98254b4.A01, c65994Txp.A01, c98254b4.A02);
        long Boy = this.A0R.Boy(new C65878Tvh(c98264b5, new C98534bW(null, null, 1, -1, 0, Util.A08(c65994Txp.A00), Util.A08(this.A03)), iOException, i));
        if (Boy == -9223372036854775807L) {
            c98014ag = C98004af.A05;
        } else {
            C98044aj[] c98044ajArr = this.A0H;
            int i2 = 0;
            for (C98044aj c98044aj : c98044ajArr) {
                i2 += c98044aj.A00 + c98044aj.A02;
            }
            boolean A1S = AbstractC25230BEn.A1S(i2, this.A02);
            if (this.A09 || ((interfaceC98454bO = this.A05) != null && interfaceC98454bO.Azt() != -9223372036854775807L)) {
                this.A02 = i2;
            } else {
                boolean z = this.A0E;
                if (z && !this.A0C && !A05(this)) {
                    this.A0D = true;
                    c98014ag = C98004af.A04;
                } else {
                    this.A0C = z;
                    this.A04 = 0L;
                    this.A02 = 0;
                    for (C98044aj c98044aj2 : c98044ajArr) {
                        c98044aj2.A0C(false);
                    }
                    c65994Txp.A04.A00 = 0L;
                    c65994Txp.A00 = 0L;
                    c65994Txp.A02 = true;
                }
            }
            c98014ag = new C98014ag(A1S ? 1 : 0, Boy);
        }
        int i3 = c98014ag.A00;
        boolean z2 = true;
        if (i3 != 0 && i3 != 1) {
            z2 = false;
        }
        this.A0O.A01(null, c98264b5, iOException, null, 1, -1, 0, c65994Txp.A00, this.A03, !z2);
        return c98014ag;
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPv(InterfaceC98244b3 interfaceC98244b3, int i, long j, long j2) {
        C65994Txp c65994Txp = (C65994Txp) interfaceC98244b3;
        if (this.A0W && i > 0) {
            C98254b4 c98254b4 = c65994Txp.A05;
            this.A0O.A02(null, new C98264b5(c98254b4.A01, c65994Txp.A01, c98254b4.A02), null, 1, -1, 0, i, c65994Txp.A00, this.A03);
        }
    }

    @Override // X.C4YX
    public final void DQ5() {
        for (C98044aj c98044aj : this.A0H) {
            c98044aj.A09();
        }
        C65995Txq c65995Txq = (C65995Txq) this.A0Y;
        if (c65995Txq.A00 != null) {
            c65995Txq.A00 = null;
        }
        c65995Txq.A01 = null;
    }

    @Override // X.C4Z0
    public final void E5S(InterfaceC96664Wb interfaceC96664Wb, long j) {
        this.A06 = interfaceC96664Wb;
        this.A0a.A02();
        A01();
    }

    @Override // X.C4Z0
    public final long E7z() {
        if (this.A0C) {
            if (!this.A0B) {
                int i = 0;
                for (C98044aj c98044aj : this.A0H) {
                    i += c98044aj.A00 + c98044aj.A02;
                }
                if (i <= this.A02) {
                    return -9223372036854775807L;
                }
            }
            this.A0C = false;
            return this.A04;
        }
        return -9223372036854775807L;
    }

    @Override // X.C4XF
    public final void EMf(final InterfaceC98454bO interfaceC98454bO) {
        this.A0L.post(new Runnable() { // from class: X.Txz
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
            
                if (r3 != (-9223372036854775807L)) goto L6;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r8 = this;
                    X.Ttm r7 = r2
                    X.4bO r6 = r1
                    r7.A05 = r6
                    long r3 = r6.Azt()
                    r7.A03 = r3
                    boolean r0 = r7.A09
                    r5 = 1
                    if (r0 != 0) goto L1b
                    r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    r2 = 1
                    if (r0 == 0) goto L1c
                L1b:
                    r2 = 0
                L1c:
                    r7.A0A = r2
                    if (r2 == 0) goto L21
                    r5 = 7
                L21:
                    r7.A00 = r5
                    X.X9q r1 = r7.A0P
                    boolean r0 = r6.Cca()
                    r1.DnN(r3, r0, r2)
                    boolean r0 = r7.A0E
                    if (r0 != 0) goto L33
                    X.C65771Ttm.A02(r7)
                L33:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC66004Txz.run():void");
            }
        });
    }

    @Override // X.C4Z0
    public final long EMx(InterfaceC97394Yz[] interfaceC97394YzArr, C4WE[] c4weArr, boolean[] zArr, boolean[] zArr2, long j) {
        int length;
        boolean z;
        C4WE c4we;
        long j2 = j;
        A00();
        C66005Ty0 c66005Ty0 = this.A07;
        C4WU c4wu = c66005Ty0.A00;
        boolean[] zArr3 = c66005Ty0.A01;
        int i = this.A01;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = c4weArr.length;
            if (i4 >= length) {
                break;
            }
            InterfaceC97394Yz interfaceC97394Yz = interfaceC97394YzArr[i4];
            if (interfaceC97394Yz != null && (c4weArr[i4] == null || !zArr[i4])) {
                int i5 = ((C65772Ttn) interfaceC97394Yz).A00;
                C4B8.A04(zArr3[i5]);
                i2--;
                this.A01 = i2;
                zArr3[i5] = false;
                interfaceC97394YzArr[i4] = null;
            }
            i4++;
        }
        if (!this.A0K ? j != 0 : i == 0) {
            z = true;
        } else {
            z = false;
        }
        for (int i6 = 0; i6 < length; i6++) {
            if (interfaceC97394YzArr[i6] == null && (c4we = c4weArr[i6]) != null) {
                boolean z2 = false;
                if (c4we.length() == 1) {
                    z2 = true;
                }
                C4B8.A04(z2);
                boolean z3 = false;
                if (c4we.BHT(0) == 0) {
                    z3 = true;
                }
                C4B8.A04(z3);
                int indexOf = c4wu.A02.indexOf(c4we.CAE());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                C4B8.A04(!zArr3[indexOf]);
                this.A01++;
                zArr3[indexOf] = true;
                interfaceC97394YzArr[i6] = new C65772Ttn(this, indexOf);
                zArr2[i6] = true;
                if (!z) {
                    C98044aj c98044aj = this.A0H[indexOf];
                    if (!c98044aj.A0D(j2, true)) {
                        z = true;
                        if (c98044aj.A00 + c98044aj.A03 != 0) {
                        }
                    }
                    z = false;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0D = false;
            this.A0C = false;
            C98004af c98004af = this.A0S;
            boolean A1W = AbstractC167007dF.A1W(c98004af.A01);
            C98044aj[] c98044ajArr = this.A0H;
            int length2 = c98044ajArr.length;
            if (A1W) {
                while (i3 < length2) {
                    c98044ajArr[i3].A06();
                    i3++;
                }
                c98004af.A00();
            } else {
                while (i3 < length2) {
                    c98044ajArr[i3].A0C(false);
                    i3++;
                }
            }
        } else if (z) {
            j2 = EMn(j2, false);
            while (i3 < interfaceC97394YzArr.length) {
                if (interfaceC97394YzArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.A0K = true;
        return j2;
    }

    @Override // X.C4XF
    public final InterfaceC98054ak F88(int i, int i2) {
        C66002Txx c66002Txx = new C66002Txx(i);
        C98044aj[] c98044ajArr = this.A0H;
        int length = c98044ajArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (c66002Txx.equals(this.A0G[i3])) {
                return c98044ajArr[i3];
            }
        }
        InterfaceC96344Us interfaceC96344Us = this.A0Q;
        C4XR c4xr = this.A0N;
        C4XY c4xy = this.A0M;
        c4xy.getClass();
        C98044aj c98044aj = new C98044aj(c4xy, c4xr, interfaceC96344Us);
        c98044aj.A0D = this;
        int i4 = length + 1;
        Object[] copyOf = Arrays.copyOf(this.A0G, i4);
        copyOf[length] = c66002Txx;
        this.A0G = (C66002Txx[]) copyOf;
        Object[] copyOf2 = Arrays.copyOf(this.A0H, i4);
        copyOf2[length] = c98044aj;
        this.A0H = (C98044aj[]) copyOf2;
        return c98044aj;
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean isLoading() {
        return AbstractC167007dF.A1W(this.A0S.A01);
    }

    public C65771Ttm(android.net.Uri uri, C4XY c4xy, C4XR c4xr, C4XX c4xx, InterfaceC71863X7w interfaceC71863X7w, InterfaceC71906X9q interfaceC71906X9q, InterfaceC96344Us interfaceC96344Us, InterfaceC92354Bq interfaceC92354Bq, C4XO c4xo, String str) {
        this.A0X = uri;
        this.A0Z = interfaceC92354Bq;
        this.A0N = c4xr;
        this.A0M = c4xy;
        this.A0R = c4xo;
        this.A0O = c4xx;
        this.A0P = interfaceC71906X9q;
        this.A0Q = interfaceC96344Us;
        this.A0V = str;
        this.A0Y = interfaceC71863X7w;
        Looper myLooper = Looper.myLooper();
        C4B8.A01(myLooper);
        this.A0L = new Handler(myLooper, null);
        this.A0G = new C66002Txx[0];
        this.A0H = new C98044aj[0];
        this.A0I = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
        this.A0c = C2C5.A02(C2C1.A0V) || C2C5.A02(C2C1.A0W) || C2C5.A02(C2C1.A1F);
        this.A0W = C2C5.A02(C2C1.A0l);
        this.A0b = C2C5.A02(C2C1.A0Y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(C65771Ttm c65771Ttm, int i) {
        c65771Ttm.A00();
        C66005Ty0 c66005Ty0 = c65771Ttm.A07;
        boolean[] zArr = c66005Ty0.A03;
        if (!zArr[i]) {
            C4B6 c4b6 = ((C4WV) c66005Ty0.A00.A02.get(i)).A04[0];
            c65771Ttm.A0O.A06(c4b6, null, C2IH.A00(c4b6.A0W), 0, c65771Ttm.A04);
            zArr[i] = true;
        }
    }

    public static void A04(C65771Ttm c65771Ttm, int i) {
        c65771Ttm.A00();
        boolean[] zArr = c65771Ttm.A07.A02;
        if (c65771Ttm.A0D && zArr[i]) {
            if (!c65771Ttm.A0H[i].A0E(false)) {
                c65771Ttm.A0I = 0L;
                c65771Ttm.A0D = false;
                c65771Ttm.A0C = true;
                c65771Ttm.A04 = 0L;
                c65771Ttm.A02 = 0;
                for (C98044aj c98044aj : c65771Ttm.A0H) {
                    c98044aj.A0C(false);
                }
                InterfaceC96664Wb interfaceC96664Wb = c65771Ttm.A06;
                interfaceC96664Wb.getClass();
                interfaceC96664Wb.D7l(c65771Ttm);
            }
        }
    }

    @Override // X.C4Z0
    public final void APa(long j, boolean z) {
        A00();
        if (!A05(this)) {
            boolean[] zArr = this.A07.A01;
            int length = this.A0H.length;
            for (int i = 0; i < length; i++) {
                this.A0H[i].A0B(j, z, zArr[i]);
            }
        }
    }

    @Override // X.C4Z0
    public final long AZz(C4TT c4tt, long j) {
        A00();
        InterfaceC98454bO interfaceC98454bO = this.A05;
        if (!interfaceC98454bO.Cca()) {
            return 0L;
        }
        C69745Vuf Bs5 = interfaceC98454bO.Bs5(j);
        return c4tt.A00(j, Bs5.A00.A01, Bs5.A01.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        if (r2 == Long.MAX_VALUE) goto L30;
     */
    @Override // X.C4Z0, X.C4Z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Aik() {
        /*
            r10 = this;
            r10.A00()
            boolean r0 = r10.A0B
            r4 = -9223372036854775808
            if (r0 != 0) goto L15
            int r0 = r10.A01
            if (r0 == 0) goto L15
            boolean r0 = A05(r10)
            if (r0 == 0) goto L16
            long r4 = r10.A0I
        L15:
            return r4
        L16:
            boolean r0 = r10.A08
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L58
            X.4aj[] r0 = r10.A0H
            int r7 = r0.length
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 0
        L28:
            if (r6 >= r7) goto L54
            X.Ty0 r1 = r10.A07
            boolean[] r0 = r1.A02
            boolean r0 = r0[r6]
            if (r0 == 0) goto L4e
            boolean[] r0 = r1.A01
            boolean r0 = r0[r6]
            if (r0 == 0) goto L4e
            X.4aj[] r0 = r10.A0H
            r1 = r0[r6]
            monitor-enter(r1)
            boolean r0 = r1.A0E     // Catch: java.lang.Throwable -> L51
            monitor-exit(r1)
            if (r0 != 0) goto L4e
            X.4aj[] r0 = r10.A0H
            r0 = r0[r6]
            long r0 = r0.A05()
            long r2 = java.lang.Math.min(r2, r0)
        L4e:
            int r6 = r6 + 1
            goto L28
        L51:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L54:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L7a
        L58:
            r2 = -9223372036854775808
            r6 = 0
        L5b:
            X.4aj[] r0 = r10.A0H
            int r0 = r0.length
            if (r6 >= r0) goto L7a
            X.Ty0 r0 = r10.A07
            r0.getClass()
            boolean[] r0 = r0.A01
            boolean r0 = r0[r6]
            if (r0 == 0) goto L77
            X.4aj[] r0 = r10.A0H
            r0 = r0[r6]
            long r0 = r0.A05()
            long r2 = java.lang.Math.max(r2, r0)
        L77:
            int r6 = r6 + 1
            goto L5b
        L7a:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L80
            long r2 = r10.A04
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65771Ttm.Aik():long");
    }

    @Override // X.C4Z0, X.C4Z1
    public final long BWx() {
        return Aik();
    }

    @Override // X.C4Z0
    public final C4WU CAF() {
        A00();
        return this.A07.A00;
    }

    @Override // X.C4Z0
    public final void Coz() {
        String str;
        A06();
        if (this.A0B && !this.A0E) {
            if (this.A0b) {
                str = AnonymousClass001.A0R("Loading finished before preparation is complete. URI: ", this.A0X.toString());
            } else {
                str = "Loading finished before preparation is complete.";
            }
            throw C93194Fv.A00(str, null);
        }
    }

    @Override // X.C4Z0
    public final long EMn(long j, boolean z) {
        A00();
        boolean[] zArr = this.A07.A02;
        if (!this.A05.Cca()) {
            j = 0;
        }
        int i = 0;
        this.A0C = false;
        this.A04 = j;
        if (A05(this)) {
            this.A0I = j;
        } else {
            if (this.A00 != 7) {
                int length = this.A0H.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.A0H[i2].A0D(j, false) || (!zArr[i2] && this.A08)) {
                    }
                }
            }
            this.A0D = false;
            this.A0I = j;
            this.A0B = false;
            C98004af c98004af = this.A0S;
            if (c98004af.A01 != null) {
                C98044aj[] c98044ajArr = this.A0H;
                int length2 = c98044ajArr.length;
                while (i < length2) {
                    c98044ajArr[i].A06();
                    i++;
                }
                c98004af.A00();
                return j;
            }
            c98004af.A02 = null;
            C98044aj[] c98044ajArr2 = this.A0H;
            int length3 = c98044ajArr2.length;
            while (i < length3) {
                c98044ajArr2[i].A0C(false);
                i++;
            }
        }
        return j;
    }
}
