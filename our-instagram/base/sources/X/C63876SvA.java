package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.SvA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63876SvA implements InterfaceC65582TnL {
    public static final boolean A0R = android.util.Log.isLoggable("GlideRequest", 2);
    public int A00;
    public int A01;
    public long A02;
    public Drawable A03;
    public Drawable A04;
    public SFU A05;
    public InterfaceC65558Tme A06;
    public Integer A07;
    public boolean A08;
    public Drawable A09;
    public RuntimeException A0A;
    public final Q20 A0B;
    public final TIW A0C;
    public final InterfaceC65580TnH A0D;
    public final InterfaceC65634Tpv A0E;
    public final InterfaceC65329TiA A0F;
    public final SKF A0G;
    public final Object A0H;
    public final Object A0I;
    public final List A0J;
    public final int A0K;
    public final int A0L;
    public final Context A0M;
    public final EnumC61107RfN A0N;
    public final Class A0O;
    public final Executor A0P;
    public volatile C63182Seh A0Q;

    private Drawable A00() {
        int i;
        Drawable drawable = this.A09;
        if (drawable == null) {
            TIW tiw = this.A0C;
            Drawable drawable2 = tiw.A0A;
            this.A09 = drawable2;
            if (drawable2 == null && (i = tiw.A06) > 0) {
                Drawable A01 = A01(i);
                this.A09 = A01;
                return A01;
            }
            return drawable2;
        }
        return drawable;
    }

    private Drawable A01(int i) {
        Resources.Theme theme = this.A0C.A07;
        if (theme == null) {
            theme = this.A0M.getTheme();
        }
        Q20 q20 = this.A0B;
        return S6A.A00(q20, q20, theme, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (r1 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.RkJ r5, X.C63876SvA r6, int r7) {
        /*
            X.SKF r0 = r6.A0G
            r0.A00()
            java.lang.Object r2 = r6.A0I
            monitor-enter(r2)
            java.lang.RuntimeException r0 = r6.A0A     // Catch: java.lang.Throwable -> Ld3
            r5.A02 = r0     // Catch: java.lang.Throwable -> Ld3
            X.Q20 r0 = r6.A0B     // Catch: java.lang.Throwable -> Ld3
            int r0 = r0.A01     // Catch: java.lang.Throwable -> Ld3
            if (r0 > r7) goto L53
            java.lang.String r3 = "Glide"
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = "Load failed for ["
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r0 = r6.A0H     // Catch: java.lang.Throwable -> Ld3
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = "] with dimensions ["
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld3
            int r0 = r6.A01     // Catch: java.lang.Throwable -> Ld3
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = "x"
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld3
            int r0 = r6.A00     // Catch: java.lang.Throwable -> Ld3
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = X.AbstractC58319PtB.A0w(r1)     // Catch: java.lang.Throwable -> Ld3
            android.util.Log.w(r3, r0, r5)     // Catch: java.lang.Throwable -> Ld3
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()     // Catch: java.lang.Throwable -> Ld3
            X.RkJ.A00(r5, r5, r4)     // Catch: java.lang.Throwable -> Ld3
            int r3 = r4.size()     // Catch: java.lang.Throwable -> Ld3
            r1 = 0
        L4a:
            if (r1 >= r3) goto L53
            int r0 = r1 + 1
            r4.get(r1)     // Catch: java.lang.Throwable -> Ld3
            r1 = r0
            goto L4a
        L53:
            r0 = 0
            r6.A05 = r0     // Catch: java.lang.Throwable -> Ld3
            java.lang.Integer r0 = X.C05F.A0Y     // Catch: java.lang.Throwable -> Ld3
            r6.A07 = r0     // Catch: java.lang.Throwable -> Ld3
            X.TnH r4 = r6.A0D     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto L61
            r4.Dfu(r6)     // Catch: java.lang.Throwable -> Ld3
        L61:
            r0 = 1
            r6.A08 = r0     // Catch: java.lang.Throwable -> Ld3
            r3 = 0
            java.util.List r0 = r6.A0J     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto L86
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lcf
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto L86
            r1.next()     // Catch: java.lang.Throwable -> Lcf
            if (r4 == 0) goto L7f
            X.TnH r0 = r4.BpV()     // Catch: java.lang.Throwable -> Lcf
            r0.CPw()     // Catch: java.lang.Throwable -> Lcf
        L7f:
            java.lang.String r0 = "onLoadFailed"
            java.lang.NullPointerException r0 = X.AbstractC166987dD.A15(r0)     // Catch: java.lang.Throwable -> Lcf
            throw r0     // Catch: java.lang.Throwable -> Lcf
        L86:
            if (r4 == 0) goto L8e
            boolean r0 = r4.AFp(r6)     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lcb
        L8e:
            java.lang.Object r0 = r6.A0H     // Catch: java.lang.Throwable -> Lcf
            if (r0 != 0) goto Laa
            android.graphics.drawable.Drawable r1 = r6.A04     // Catch: java.lang.Throwable -> Lcf
            if (r1 != 0) goto La8
            X.TIW r0 = r6.A0C     // Catch: java.lang.Throwable -> Lcf
            android.graphics.drawable.Drawable r1 = r0.A09     // Catch: java.lang.Throwable -> Lcf
            r6.A04 = r1     // Catch: java.lang.Throwable -> Lcf
            if (r1 != 0) goto La8
            int r0 = r0.A02     // Catch: java.lang.Throwable -> Lcf
            if (r0 <= 0) goto La8
            android.graphics.drawable.Drawable r1 = r6.A01(r0)     // Catch: java.lang.Throwable -> Lcf
            r6.A04 = r1     // Catch: java.lang.Throwable -> Lcf
        La8:
            if (r1 != 0) goto Lc6
        Laa:
            android.graphics.drawable.Drawable r1 = r6.A03     // Catch: java.lang.Throwable -> Lcf
            if (r1 != 0) goto Lc0
            X.TIW r0 = r6.A0C     // Catch: java.lang.Throwable -> Lcf
            android.graphics.drawable.Drawable r1 = r0.A08     // Catch: java.lang.Throwable -> Lcf
            r6.A03 = r1     // Catch: java.lang.Throwable -> Lcf
            if (r1 != 0) goto Lc0
            int r0 = r0.A01     // Catch: java.lang.Throwable -> Lcf
            if (r0 <= 0) goto Lc0
            android.graphics.drawable.Drawable r1 = r6.A01(r0)     // Catch: java.lang.Throwable -> Lcf
            r6.A03 = r1     // Catch: java.lang.Throwable -> Lcf
        Lc0:
            if (r1 != 0) goto Lc6
            android.graphics.drawable.Drawable r1 = r6.A00()     // Catch: java.lang.Throwable -> Lcf
        Lc6:
            X.Tpv r0 = r6.A0E     // Catch: java.lang.Throwable -> Lcf
            r0.DPi(r1)     // Catch: java.lang.Throwable -> Lcf
        Lcb:
            r6.A08 = r3     // Catch: java.lang.Throwable -> Ld3
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld3
            return
        Lcf:
            r0 = move-exception
            r6.A08 = r3     // Catch: java.lang.Throwable -> Ld3
            throw r0     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63876SvA.A02(X.RkJ, X.SvA, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00dd, code lost:
    
        if (r2 != null) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0 A[Catch: all -> 0x01f7, TryCatch #1 {, blocks: (B:67:0x0093, B:68:0x0095, B:73:0x00b8, B:74:0x00b9, B:75:0x00bb, B:80:0x00d2, B:81:0x00d3, B:83:0x00d7, B:85:0x00db, B:87:0x00df, B:89:0x00f0, B:90:0x00f3, B:92:0x00e6, B:96:0x00fd, B:112:0x01f6, B:102:0x00b1, B:104:0x00b4, B:111:0x01f5, B:24:0x0100, B:26:0x0104, B:27:0x0106, B:29:0x010e, B:31:0x01df, B:32:0x01e2, B:33:0x01e7, B:40:0x0116, B:41:0x0124, B:43:0x0133, B:44:0x0134, B:46:0x01ad, B:47:0x01af, B:48:0x01b5, B:58:0x01dc, B:64:0x01b7, B:65:0x0113, B:70:0x0096, B:100:0x00a1, B:109:0x00b0, B:42:0x0125, B:50:0x01ba, B:54:0x01c6, B:56:0x01ca, B:57:0x01d9, B:59:0x01cd, B:61:0x01d1, B:62:0x01d4, B:63:0x01d7, B:106:0x00a9, B:77:0x00bc, B:93:0x00c8), top: B:66:0x0093, outer: #4, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63876SvA.A03(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r5.BpV().CPw() == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.InterfaceC65558Tme r8, java.lang.Integer r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63876SvA.A04(X.Tme, java.lang.Integer):void");
    }

    @Override // X.InterfaceC65582TnL
    public final void ADM() {
        InterfaceC65580TnH interfaceC65580TnH;
        int i;
        synchronized (this.A0I) {
            if (!this.A08) {
                this.A0G.A00();
                this.A02 = SystemClock.elapsedRealtimeNanos();
                if (this.A0H == null) {
                    int i2 = this.A0L;
                    int i3 = this.A0K;
                    if (C63375Sim.A05(i2, i3)) {
                        this.A01 = i2;
                        this.A00 = i3;
                    }
                    Drawable drawable = this.A04;
                    if (drawable == null) {
                        TIW tiw = this.A0C;
                        drawable = tiw.A09;
                        this.A04 = drawable;
                        if (drawable == null && (i = tiw.A02) > 0) {
                            drawable = A01(i);
                            this.A04 = drawable;
                        }
                    }
                    int i4 = 3;
                    if (drawable == null) {
                        i4 = 5;
                    }
                    A02(new RkJ("Received null model", Collections.emptyList()), this, i4);
                } else {
                    Integer num = this.A07;
                    Integer num2 = C05F.A01;
                    if (num != num2) {
                        if (num == C05F.A0N) {
                            A04(this.A06, C05F.A0Y);
                        } else {
                            List list = this.A0J;
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                            Integer num3 = C05F.A0C;
                            this.A07 = num3;
                            int i5 = this.A0L;
                            int i6 = this.A0K;
                            if (C63375Sim.A05(i5, i6)) {
                                A03(i5, i6);
                            } else {
                                this.A0E.Bxb(this);
                            }
                            Integer num4 = this.A07;
                            if ((num4 == num2 || num4 == num3) && ((interfaceC65580TnH = this.A0D) == null || interfaceC65580TnH.AFp(this))) {
                                this.A0E.DPu(A00());
                            }
                            if (A0R) {
                                SystemClock.elapsedRealtimeNanos();
                            }
                        }
                    } else {
                        throw AbstractC166987dD.A12("Cannot restart a running request");
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC65582TnL
    public final boolean CPw() {
        boolean A1X;
        synchronized (this.A0I) {
            A1X = AbstractC167007dF.A1X(this.A07, C05F.A0N);
        }
        return A1X;
    }

    @Override // X.InterfaceC65582TnL
    public final boolean CRK() {
        boolean A1X;
        synchronized (this.A0I) {
            A1X = AbstractC167007dF.A1X(this.A07, C05F.A0j);
        }
        return A1X;
    }

    @Override // X.InterfaceC65582TnL
    public final boolean CTx(InterfaceC65582TnL interfaceC65582TnL) {
        int i;
        int i2;
        Object obj;
        Class cls;
        TIW tiw;
        EnumC61107RfN enumC61107RfN;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class cls2;
        TIW tiw2;
        EnumC61107RfN enumC61107RfN2;
        int i6;
        if (interfaceC65582TnL instanceof C63876SvA) {
            synchronized (this.A0I) {
                i = this.A0L;
                i2 = this.A0K;
                obj = this.A0H;
                cls = this.A0O;
                tiw = this.A0C;
                enumC61107RfN = this.A0N;
                List list = this.A0J;
                if (list != null) {
                    i3 = list.size();
                } else {
                    i3 = 0;
                }
            }
            C63876SvA c63876SvA = (C63876SvA) interfaceC65582TnL;
            synchronized (c63876SvA.A0I) {
                i4 = c63876SvA.A0L;
                i5 = c63876SvA.A0K;
                obj2 = c63876SvA.A0H;
                cls2 = c63876SvA.A0O;
                tiw2 = c63876SvA.A0C;
                enumC61107RfN2 = c63876SvA.A0N;
                List list2 = c63876SvA.A0J;
                if (list2 != null) {
                    i6 = list2.size();
                } else {
                    i6 = 0;
                }
            }
            if (i == i4 && i2 == i5 && (obj != null ? obj.equals(obj2) : obj2 == null) && cls.equals(cls2) && tiw.equals(tiw2) && enumC61107RfN == enumC61107RfN2 && i3 == i6) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC65582TnL
    public final void clear() {
        synchronized (this.A0I) {
            if (!this.A08) {
                SKF skf = this.A0G;
                skf.A00();
                Integer num = this.A07;
                Integer num2 = C05F.A0j;
                if (num == num2) {
                    return;
                }
                if (!this.A08) {
                    skf.A00();
                    InterfaceC65634Tpv interfaceC65634Tpv = this.A0E;
                    interfaceC65634Tpv.EF5(this);
                    SFU sfu = this.A05;
                    if (sfu != null) {
                        synchronized (sfu.A02) {
                            try {
                                sfu.A00.A03(sfu.A01);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        this.A05 = null;
                    }
                    InterfaceC65558Tme interfaceC65558Tme = this.A06;
                    if (interfaceC65558Tme != null) {
                        this.A06 = null;
                    } else {
                        interfaceC65558Tme = null;
                    }
                    InterfaceC65580TnH interfaceC65580TnH = this.A0D;
                    if (interfaceC65580TnH == null || interfaceC65580TnH.AFo(this)) {
                        interfaceC65634Tpv.DPb(A00());
                    }
                    this.A07 = num2;
                    if (interfaceC65558Tme != null) {
                        C63182Seh.A00(interfaceC65558Tme);
                        return;
                    }
                    return;
                }
                throw AbstractC166987dD.A14("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            throw AbstractC166987dD.A14("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // X.InterfaceC65582TnL
    public final boolean isComplete() {
        boolean A1X;
        synchronized (this.A0I) {
            A1X = AbstractC167007dF.A1X(this.A07, C05F.A0N);
        }
        return A1X;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r2 == X.C05F.A0C) goto L8;
     */
    @Override // X.InterfaceC65582TnL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isRunning() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0I
            monitor-enter(r3)
            java.lang.Integer r2 = r4.A07     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> L11
            if (r2 == r0) goto Le
            java.lang.Integer r1 = X.C05F.A0C     // Catch: java.lang.Throwable -> L11
            r0 = 0
            if (r2 != r1) goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63876SvA.isRunning():boolean");
    }

    @Override // X.InterfaceC65582TnL
    public final void pause() {
        synchronized (this.A0I) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.A0I) {
            obj = this.A0H;
            cls = this.A0O;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append("[model=");
        A1C.append(obj);
        A1C.append(", transcodeClass=");
        A1C.append(cls);
        return AbstractC58319PtB.A0w(A1C);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.SKF, java.lang.Object] */
    public C63876SvA(Context context, Q20 q20, EnumC61107RfN enumC61107RfN, C63182Seh c63182Seh, TIW tiw, InterfaceC65580TnH interfaceC65580TnH, InterfaceC65634Tpv interfaceC65634Tpv, InterfaceC65329TiA interfaceC65329TiA, Class cls, Object obj, Object obj2, List list, Executor executor, int i, int i2) {
        if (A0R) {
            super.hashCode();
        }
        this.A0G = new Object();
        this.A0I = obj;
        this.A0M = context;
        this.A0B = q20;
        this.A0H = obj2;
        this.A0O = cls;
        this.A0C = tiw;
        this.A0L = i;
        this.A0K = i2;
        this.A0N = enumC61107RfN;
        this.A0E = interfaceC65634Tpv;
        this.A0J = list;
        this.A0D = interfaceC65580TnH;
        this.A0Q = c63182Seh;
        this.A0F = interfaceC65329TiA;
        this.A0P = executor;
        this.A07 = C05F.A00;
        if (this.A0A == null && q20.A02.A00.containsKey(C61677Rrr.class)) {
            this.A0A = AbstractC166987dD.A18("Glide request origin trace");
        }
    }
}
