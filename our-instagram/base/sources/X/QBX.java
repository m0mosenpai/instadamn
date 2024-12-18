package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class QBX extends TIW implements Cloneable {
    public static final QBW A0D = (QBW) new TIW().A0E(S9K.A01).A07(EnumC61107RfN.LOW).A03();
    public QBX A00;
    public TIV A01;
    public Object A02;
    public List A03;
    public boolean A04 = true;
    public boolean A05;
    public QBX A06;
    public boolean A07;
    public final Context A08;
    public final Q20 A09;
    public final Sv5 A0A;
    public final Class A0B;
    public final ComponentCallbacks2C63416Sju A0C;

    public static void A02(QBX qbx, TIW tiw, InterfaceC65634Tpv interfaceC65634Tpv, Executor executor) {
        Rs8.A00(interfaceC65634Tpv);
        if (qbx.A07) {
            Object A0b = AbstractC58318PtA.A0b();
            InterfaceC65582TnL A01 = qbx.A01(tiw.A0B, qbx.A01, tiw, null, interfaceC65634Tpv, A0b, executor, tiw.A05, tiw.A04);
            InterfaceC65582TnL Bnz = interfaceC65634Tpv.Bnz();
            if (!A01.CTx(Bnz) || (!tiw.A0I && Bnz.isComplete())) {
                Sv5 sv5 = qbx.A0A;
                sv5.A00(interfaceC65634Tpv);
                interfaceC65634Tpv.Ecl(A01);
                synchronized (sv5) {
                    sv5.A07.A00.add(interfaceC65634Tpv);
                    SLS sls = sv5.A06;
                    sls.A02.add(A01);
                    if (!sls.A00) {
                        A01.ADM();
                    } else {
                        A01.clear();
                        android.util.Log.isLoggable("RequestTracker", 2);
                        sls.A01.add(A01);
                    }
                }
                return;
            }
            Rs8.A00(Bnz);
            if (!Bnz.isRunning()) {
                Bnz.ADM();
                return;
            }
            return;
        }
        throw AbstractC166987dD.A12("You must call #load() before calling #into()");
    }

    public static QBX A00(QBX qbx, Object obj) {
        if (qbx.A0H) {
            return A00(qbx.clone(), obj);
        }
        qbx.A02 = obj;
        qbx.A07 = true;
        qbx.A0G();
        return qbx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InterfaceC65582TnL A01(EnumC61107RfN enumC61107RfN, TIV tiv, TIW tiw, InterfaceC65580TnH interfaceC65580TnH, InterfaceC65634Tpv interfaceC65634Tpv, Object obj, Executor executor, int i, int i2) {
        C63877SvB c63877SvB;
        C63876SvA c63876SvA;
        EnumC61107RfN enumC61107RfN2;
        InterfaceC65580TnH interfaceC65580TnH2 = interfaceC65580TnH;
        if (this.A06 != null) {
            c63877SvB = new C63877SvB(interfaceC65580TnH2, obj);
            interfaceC65580TnH2 = c63877SvB;
        } else {
            c63877SvB = null;
        }
        QBX qbx = this.A00;
        if (qbx != null) {
            if (!this.A05) {
                TIV tiv2 = qbx.A01;
                if (qbx.A04) {
                    tiv2 = tiv;
                }
                if ((((TIW) qbx).A03 & 8) != 0) {
                    enumC61107RfN2 = ((TIW) qbx).A0B;
                } else {
                    int[] iArr = AbstractC68623VXz.A00;
                    int ordinal = enumC61107RfN.ordinal();
                    if (ordinal != 3) {
                        if (ordinal != 2) {
                            if (ordinal != 1 && ordinal != 0) {
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                A1C.append("unknown priority: ");
                                throw AbstractC43594JPz.A0n(super.A0B, A1C);
                            }
                            enumC61107RfN2 = EnumC61107RfN.IMMEDIATE;
                        } else {
                            enumC61107RfN2 = EnumC61107RfN.HIGH;
                        }
                    } else {
                        enumC61107RfN2 = EnumC61107RfN.NORMAL;
                    }
                }
                int i3 = ((TIW) qbx).A05;
                int i4 = ((TIW) qbx).A04;
                if (C63375Sim.A05(i, i2) && !C63375Sim.A05(i3, i4)) {
                    i3 = tiw.A05;
                    i4 = tiw.A04;
                }
                C63878SvC c63878SvC = new C63878SvC(interfaceC65580TnH2, obj);
                Context context = this.A08;
                Q20 q20 = this.A09;
                Object obj2 = this.A02;
                C63876SvA c63876SvA2 = new C63876SvA(context, q20, enumC61107RfN, q20.A03, tiw, c63878SvC, interfaceC65634Tpv, tiv.A00, this.A0B, obj, obj2, this.A03, executor, i, i2);
                this.A05 = true;
                QBX qbx2 = this.A00;
                InterfaceC65582TnL A01 = qbx2.A01(enumC61107RfN2, tiv2, qbx2, c63878SvC, interfaceC65634Tpv, obj, executor, i3, i4);
                this.A05 = false;
                c63878SvC.A05 = c63876SvA2;
                c63878SvC.A06 = A01;
                c63876SvA = c63878SvC;
            } else {
                throw AbstractC166987dD.A14("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
        } else {
            Context context2 = this.A08;
            Q20 q202 = this.A09;
            Object obj3 = this.A02;
            InterfaceC65580TnH interfaceC65580TnH3 = interfaceC65580TnH2;
            c63876SvA = new C63876SvA(context2, q202, enumC61107RfN, q202.A03, tiw, interfaceC65580TnH3, interfaceC65634Tpv, tiv.A00, this.A0B, obj, obj3, this.A03, executor, i, i2);
        }
        if (c63877SvB == null) {
            return c63876SvA;
        }
        QBX qbx3 = this.A06;
        int i5 = ((TIW) qbx3).A05;
        int i6 = ((TIW) qbx3).A04;
        if (C63375Sim.A05(i, i2) && !C63375Sim.A05(i5, i6)) {
            i5 = tiw.A05;
            i6 = tiw.A04;
        }
        InterfaceC65582TnL A012 = qbx3.A01(((TIW) qbx3).A0B, qbx3.A01, qbx3, c63877SvB, interfaceC65634Tpv, obj, executor, i5, i6);
        c63877SvB.A05 = c63876SvA;
        c63877SvB.A04 = A012;
        return c63877SvB;
    }

    public final QBX A0J() {
        if (this.A0H) {
            return clone().A0J();
        }
        A0G();
        return this;
    }

    public final QBX A0L(TIV tiv) {
        if (this.A0H) {
            return clone().A0L(tiv);
        }
        Rs8.A00(tiv);
        this.A01 = tiv;
        this.A04 = false;
        A0G();
        return this;
    }

    @Override // X.TIW
    public final boolean equals(Object obj) {
        if (!(obj instanceof QBX)) {
            return false;
        }
        QBX qbx = (QBX) obj;
        if (!super.equals(qbx) || !C2I7.A00(this.A0B, qbx.A0B) || !this.A01.equals(qbx.A01) || !C2I7.A00(this.A02, qbx.A02) || !C2I7.A00(this.A03, qbx.A03) || !C2I7.A00(this.A00, qbx.A00) || !C2I7.A00(this.A06, qbx.A06) || this.A04 != qbx.A04 || this.A07 != qbx.A07) {
            return false;
        }
        return true;
    }

    public QBX(Context context, ComponentCallbacks2C63416Sju componentCallbacks2C63416Sju, Sv5 sv5, Class cls) {
        QBW qbw;
        this.A0C = componentCallbacks2C63416Sju;
        this.A0A = sv5;
        this.A0B = cls;
        this.A08 = context;
        Map map = sv5.A02.A00.A07;
        TIV tiv = (TIV) map.get(cls);
        if (tiv == null) {
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (((Class) A1K.getKey()).isAssignableFrom(cls)) {
                    tiv = (TIV) A1K.getValue();
                }
            }
            if (tiv == null) {
                tiv = Q20.A0A;
            }
        }
        this.A01 = tiv;
        this.A09 = componentCallbacks2C63416Sju.A00;
        Iterator it = sv5.A09.iterator();
        while (it.hasNext()) {
            it.next();
            A0J();
        }
        synchronized (sv5) {
            qbw = sv5.A00;
        }
        A0I(qbw);
    }

    @Override // X.TIW
    /* renamed from: A0K, reason: merged with bridge method [inline-methods] */
    public final QBX clone() {
        QBX qbx = (QBX) super.clone();
        qbx.A01 = qbx.A01.clone();
        List list = qbx.A03;
        if (list != null) {
            qbx.A03 = AbstractC166987dD.A1F(list);
        }
        QBX qbx2 = qbx.A00;
        if (qbx2 != null) {
            qbx.A00 = qbx2.clone();
        }
        QBX qbx3 = qbx.A06;
        if (qbx3 != null) {
            qbx.A06 = qbx3.clone();
        }
        return qbx;
    }

    @Override // X.TIW
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final QBX A0I(TIW tiw) {
        Rs8.A00(tiw);
        return (QBX) super.A0I(tiw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.Tpt] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.Tpt] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.Tpt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0N(android.widget.ImageView r4) {
        /*
            r3 = this;
            X.C63375Sim.A04()
            X.Rs8.A00(r4)
            r1 = 2048(0x800, float:2.87E-42)
            int r0 = r3.A03
            r0 = r0 & r1
            if (r0 != 0) goto L24
            boolean r0 = r3.A0L
            if (r0 == 0) goto L24
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L24
            int[] r1 = X.AbstractC68623VXz.A00
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            int r0 = X.AbstractC58318PtA.A06(r0, r1)
            switch(r0) {
                case 1: goto L48;
                case 2: goto L58;
                case 3: goto L6b;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L58;
                default: goto L24;
            }
        L24:
            r1 = r3
        L25:
            java.lang.Class r2 = r3.A0B
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3a
            X.QBa r2 = new X.QBa
            r2.<init>(r4)
        L34:
            java.util.concurrent.Executor r0 = X.S8T.A01
            A02(r3, r1, r2, r0)
            return
        L3a:
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L7e
            X.QBb r2 = new X.QBb
            r2.<init>(r4)
            goto L34
        L48:
            X.QBX r2 = r3.clone()
            X.SNC r1 = X.SNC.A02
            com.bumptech.glide.load.resource.bitmap.CenterCrop r0 = new com.bumptech.glide.load.resource.bitmap.CenterCrop
            r0.<init>()
            X.TIW r1 = r2.A0A(r0, r1)
            goto L25
        L58:
            X.QBX r2 = r3.clone()
            X.SNC r1 = X.SNC.A01
            com.bumptech.glide.load.resource.bitmap.CenterInside r0 = new com.bumptech.glide.load.resource.bitmap.CenterInside
            r0.<init>()
            X.TIW r1 = r2.A0A(r0, r1)
            r0 = 1
            r1.A0K = r0
            goto L25
        L6b:
            X.QBX r2 = r3.clone()
            X.SNC r1 = X.SNC.A04
            com.bumptech.glide.load.resource.bitmap.FitCenter r0 = new com.bumptech.glide.load.resource.bitmap.FitCenter
            r0.<init>()
            X.TIW r1 = r2.A0A(r0, r1)
            r0 = 1
            r1.A0K = r0
            goto L25
        L7e:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Unhandled class: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", try .as*(Class).transcode(ResourceTranscoder)"
            java.lang.IllegalArgumentException r0 = X.AbstractC58320PtC.A0m(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QBX.A0N(android.widget.ImageView):void");
    }

    @Override // X.TIW
    public final int hashCode() {
        int hashCode = (((((((((super.hashCode() * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00);
        return (((((hashCode * 31) + AbstractC167017dG.A0M(this.A06)) * 31 * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0);
    }
}
