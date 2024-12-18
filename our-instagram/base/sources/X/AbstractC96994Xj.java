package X;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4Xj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC96994Xj extends C4XV {
    public Handler A00;
    public C2BC A01;
    public final HashMap A02 = new HashMap();

    public C4WX A0D(C4WX c4wx, Object obj) {
        AbstractC96984Xi abstractC96984Xi = (AbstractC96984Xi) this;
        if (abstractC96984Xi instanceof C97004Xl) {
            Object obj2 = c4wx.A04;
            C4YH c4yh = ((C97004Xl) abstractC96984Xi).A01;
            Object obj3 = C4YH.A02;
            Object obj4 = c4yh.A00;
            if (obj4 != null && obj4.equals(obj2)) {
                obj2 = C4YH.A02;
            }
            return c4wx.A00(obj2);
        }
        return c4wx;
    }

    @Override // X.C4XV
    public void A0B() {
        HashMap hashMap = this.A02;
        for (C97044Xp c97044Xp : hashMap.values()) {
            C4XW c4xw = c97044Xp.A02;
            c4xw.EER(c97044Xp.A01);
            C97034Xo c97034Xo = c97044Xp.A00;
            c4xw.EFJ(c97034Xo);
            c4xw.EFC(c97034Xo);
        }
        hashMap.clear();
    }

    @Override // X.C4XV
    public void A0C(C2BC c2bc) {
        this.A01 = c2bc;
        Looper myLooper = Looper.myLooper();
        C4B8.A01(myLooper);
        this.A00 = new Handler(myLooper, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r15 != r5.A01.A0E(r13, 0, 0).A02) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0E(com.google.android.exoplayer2.Timeline r18, X.C4XW r19, java.lang.Object r20) {
        /*
            r17 = this;
            r5 = r17
            X.4Xi r5 = (X.AbstractC96984Xi) r5
            boolean r0 = r5 instanceof X.C97004Xl
            r11 = r18
            if (r0 == 0) goto Lcb
            X.4Xl r5 = (X.C97004Xl) r5
            boolean r0 = r5.A04
            if (r0 == 0) goto L3c
            X.4YH r0 = r5.A01
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A00
            X.4YH r0 = new X.4YH
            r0.<init>(r11, r2, r1)
            r5.A01 = r0
            X.5Py r0 = r5.A00
            if (r0 == 0) goto L26
            long r0 = r0.A00
            X.C97004Xl.A00(r5, r0)
        L26:
            r1 = 0
        L27:
            r0 = 1
            r5.A02 = r0
            r5.A04 = r0
            X.4YH r0 = r5.A01
            r5.A0A(r0)
            if (r1 == 0) goto L3b
            X.5Py r0 = r5.A00
            r0.getClass()
            r0.A00(r1)
        L3b:
            return
        L3c:
            int r0 = r11.A02()
            if (r0 != 0) goto L59
            boolean r0 = r5.A02
            if (r0 == 0) goto L54
            X.4YH r0 = r5.A01
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A00
        L4c:
            X.4YH r0 = new X.4YH
            r0.<init>(r11, r2, r1)
            r5.A01 = r0
            goto L26
        L54:
            java.lang.Object r2 = X.C96604Vv.A0H
            java.lang.Object r1 = X.C4YH.A02
            goto L4c
        L59:
            X.4Vv r13 = r5.A06
            r14 = 0
            r0 = 0
            r11.A0E(r13, r14, r0)
            long r6 = r13.A02
            java.lang.Object r4 = r13.A0C
            X.5Py r8 = r5.A00
            if (r8 == 0) goto Lc9
            long r2 = r8.A04
            X.4YH r10 = r5.A01
            X.4WX r8 = r8.A05
            java.lang.Object r9 = r8.A04
            X.4WJ r8 = r5.A05
            r10.A0B(r8, r9)
            long r15 = r8.A02
            long r15 = r15 + r2
            X.4YH r2 = r5.A01
            X.4Vv r0 = r2.A0E(r13, r14, r0)
            long r0 = r0.A02
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 == 0) goto Lc9
        L85:
            X.4WJ r12 = r5.A05
            android.util.Pair r0 = r11.A09(r12, r13, r14, r15)
            java.lang.Object r3 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            boolean r2 = r5.A02
            if (r2 == 0) goto L9f
            X.4YH r2 = r5.A01
            java.lang.Object r4 = r2.A01
            java.lang.Object r3 = r2.A00
        L9f:
            X.4YH r2 = new X.4YH
            r2.<init>(r11, r4, r3)
            r5.A01 = r2
            X.5Py r2 = r5.A00
            if (r2 == 0) goto L26
            X.C97004Xl.A00(r5, r0)
            X.4WX r2 = r2.A05
            java.lang.Object r1 = r2.A04
            X.4YH r0 = r5.A01
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto Lc3
            java.lang.Object r0 = X.C4YH.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc3
            X.4YH r0 = r5.A01
            java.lang.Object r1 = r0.A00
        Lc3:
            X.4WX r1 = r2.A00(r1)
            goto L27
        Lc9:
            r15 = r6
            goto L85
        Lcb:
            X.4Xh r5 = (X.C96974Xh) r5
            X.5Pc r0 = r5.A00
            if (r0 != 0) goto L3b
            X.C96974Xh.A00(r11, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC96994Xj.A0E(com.google.android.exoplayer2.Timeline, X.4XW, java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.4Xq] */
    public final void A0F(C4XW c4xw, final Object obj) {
        HashMap hashMap = this.A02;
        C4B8.A03(!hashMap.containsKey(obj));
        InterfaceC96694We interfaceC96694We = new InterfaceC96694We() { // from class: X.4Xn
            @Override // X.InterfaceC96694We
            public final void DnO(Timeline timeline, C4XW c4xw2) {
                AbstractC96994Xj.this.A0E(timeline, c4xw2, obj);
            }
        };
        C97034Xo c97034Xo = new C97034Xo(this, obj);
        hashMap.put(obj, new C97044Xp(c97034Xo, interfaceC96694We, c4xw));
        Handler handler = this.A00;
        handler.getClass();
        c4xw.A8U(handler, c97034Xo);
        Handler handler2 = this.A00;
        handler2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = ((C4XV) c4xw).A03.A02;
        ?? obj2 = new Object();
        obj2.A00 = handler2;
        obj2.A01 = c97034Xo;
        copyOnWriteArrayList.add(obj2);
        C2BC c2bc = this.A01;
        C4WZ c4wz = super.A00;
        C4B8.A01(c4wz);
        c4xw.E5p(c4wz, interfaceC96694We, c2bc);
        if (!(!this.A05.isEmpty())) {
            c4xw.APN(interfaceC96694We);
        }
    }

    @Override // X.C4XW
    public void Cp0() {
        Iterator it = this.A02.values().iterator();
        while (it.hasNext()) {
            ((C97044Xp) it.next()).A02.Cp0();
        }
    }
}
