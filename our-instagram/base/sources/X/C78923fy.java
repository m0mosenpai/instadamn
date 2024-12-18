package X;

import android.content.Context;
import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.3fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78923fy extends C2WB implements InterfaceC50822Vd {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final InterfaceC50822Vd A04;
    public final C2V6 A05;
    public final String A06;
    public static final C78943g0 A07 = new Object();
    public static final InterfaceC77833eB A09 = new InterfaceC77833eB() { // from class: X.3g1
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        
            return null;
         */
        @Override // X.InterfaceC77833eB
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* bridge */ /* synthetic */ java.lang.Object ADU(android.content.Context r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
            /*
                r6 = this;
                X.2WB r9 = (X.C2WB) r9
                r0 = 1
                X.C14360o3.A0B(r8, r0)
                r0 = 2
                X.C14360o3.A0B(r9, r0)
                X.2Vc r5 = r9.A03
                java.lang.String r0 = "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent"
                X.C14360o3.A0C(r5, r0)
                X.2Va r5 = (X.AbstractC50792Va) r5
                X.2XE r4 = r9.A04
                X.3g5 r0 = X.C2WE.A07
                X.2WI r3 = r0.A01(r10)
                if (r4 == 0) goto L21
                java.lang.String r0 = "mount"
                r4.A09 = r0
            L21:
                X.1LL r0 = com.facebook.litho.ComponentsSystrace.A00
                boolean r2 = r0.isTracing()
                if (r2 == 0) goto L36
                java.lang.String r1 = "onMount: "
                java.lang.String r0 = r5.A0H()
                java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
                com.facebook.litho.ComponentsSystrace.A02(r0)
            L36:
                r5.A0u(r4, r3, r8)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L4e
                goto L41
            L3a:
                r0 = move-exception
                if (r4 == 0) goto L4d
                X.C51372Xk.A03(r4, r0)     // Catch: java.lang.Throwable -> L4e
                goto L43
            L41:
                if (r4 == 0) goto L46
            L43:
                r0 = 0
                r4.A09 = r0
            L46:
                if (r2 == 0) goto L4b
                com.facebook.litho.ComponentsSystrace.A01()
            L4b:
                r0 = 0
                return r0
            L4d:
                throw r0     // Catch: java.lang.Throwable -> L4e
            L4e:
                r1 = move-exception
                if (r4 == 0) goto L54
                r0 = 0
                r4.A09 = r0
            L54:
                if (r2 == 0) goto L59
                com.facebook.litho.ComponentsSystrace.A01()
            L59:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C78953g1.ADU(android.content.Context, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
            C78923fy c78923fy = (C78923fy) obj;
            C78923fy c78923fy2 = (C78923fy) obj2;
            C14360o3.A0B(c78923fy, 0);
            C14360o3.A0B(c78923fy2, 1);
            if (((C2WB) c78923fy2).A03 instanceof C50902Vm) {
                return false;
            }
            return C78923fy.A07.A00(c78923fy, c78923fy2, obj3, obj4);
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
            C2WB c2wb = (C2WB) obj2;
            C14360o3.A0B(obj, 1);
            C14360o3.A0B(c2wb, 2);
            AbstractC50812Vc abstractC50812Vc = c2wb.A03;
            C14360o3.A0C(abstractC50812Vc, "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent");
            AbstractC50792Va abstractC50792Va = (AbstractC50792Va) abstractC50812Vc;
            C2XE c2xe = c2wb.A04;
            C2WI A01 = C2WE.A07.A01(obj3);
            if (ComponentsSystrace.A00.isTracing()) {
                ComponentsSystrace.A02(AnonymousClass001.A0R("onUnmount: ", abstractC50792Va.A0H()));
            }
            try {
                try {
                    abstractC50792Va.A0w(c2xe, A01, obj);
                } catch (Exception e) {
                    if (c2xe != null) {
                        C51372Xk.A03(c2xe, e);
                    }
                }
            } finally {
                ComponentsSystrace.A01();
            }
        }

        @Override // X.InterfaceC77833eB
        public final /* synthetic */ Class CBk() {
            return getClass();
        }

        @Override // X.InterfaceC77833eB
        public final /* synthetic */ String getDescription() {
            return AbstractC75733ae.A00(getClass());
        }
    };
    public static final InterfaceC77833eB A08 = new InterfaceC77833eB() { // from class: X.3g2
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return null;
         */
        @Override // X.InterfaceC77833eB
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* bridge */ /* synthetic */ java.lang.Object ADU(android.content.Context r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
            /*
                r6 = this;
                X.2WB r9 = (X.C2WB) r9
                r0 = 1
                X.C14360o3.A0B(r8, r0)
                r0 = 2
                X.C14360o3.A0B(r9, r0)
                boolean r0 = r8 instanceof android.graphics.drawable.Drawable
                if (r0 == 0) goto L40
                r5 = r8
                android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
                android.graphics.drawable.Drawable$Callback r0 = r5.getCallback()
                boolean r0 = r0 instanceof android.view.View
                if (r0 == 0) goto L40
                android.graphics.drawable.Drawable$Callback r4 = r5.getCallback()
                android.view.View r4 = (android.view.View) r4
                X.C14360o3.A0A(r4)
                int r3 = r9.A00
                r0 = 0
                X.C14360o3.A0B(r4, r0)
                r2 = 1
                r1 = 32
                r0 = r3 & 32
                if (r0 == r1) goto L33
                r0 = r3 & 1
                if (r0 != r2) goto L40
            L33:
                boolean r0 = r5.isStateful()
                if (r0 == 0) goto L40
                int[] r0 = r4.getDrawableState()
                r5.setState(r0)
            L40:
                X.2Vc r5 = r9.A03
                java.lang.String r0 = "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent"
                X.C14360o3.A0C(r5, r0)
                X.2Va r5 = (X.AbstractC50792Va) r5
                X.2XE r4 = r9.A04
                X.3g5 r0 = X.C2WE.A07
                X.2WI r3 = r0.A01(r10)
                if (r4 == 0) goto L57
                java.lang.String r0 = "bind"
                r4.A09 = r0
            L57:
                X.1LL r0 = com.facebook.litho.ComponentsSystrace.A00
                boolean r2 = r0.isTracing()
                if (r2 == 0) goto L6c
                java.lang.String r1 = "onBind: "
                java.lang.String r0 = r5.A0H()
                java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
                com.facebook.litho.ComponentsSystrace.A02(r0)
            L6c:
                r5.A0t(r4, r3, r8)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L84
                goto L77
            L70:
                r0 = move-exception
                if (r4 == 0) goto L83
                X.C51372Xk.A03(r4, r0)     // Catch: java.lang.Throwable -> L84
                goto L79
            L77:
                if (r4 == 0) goto L7c
            L79:
                r0 = 0
                r4.A09 = r0
            L7c:
                if (r2 == 0) goto L81
                com.facebook.litho.ComponentsSystrace.A01()
            L81:
                r0 = 0
                return r0
            L83:
                throw r0     // Catch: java.lang.Throwable -> L84
            L84:
                r1 = move-exception
                if (r4 == 0) goto L8a
                r0 = 0
                r4.A09 = r0
            L8a:
                if (r2 == 0) goto L8f
                com.facebook.litho.ComponentsSystrace.A01()
            L8f:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C78963g2.ADU(android.content.Context, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
            C2WB c2wb = (C2WB) obj2;
            C14360o3.A0B(obj, 1);
            C14360o3.A0B(c2wb, 2);
            AbstractC50812Vc abstractC50812Vc = c2wb.A03;
            C14360o3.A0C(abstractC50812Vc, "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent");
            AbstractC50792Va abstractC50792Va = (AbstractC50792Va) abstractC50812Vc;
            C2XE c2xe = c2wb.A04;
            C2WI A01 = C2WE.A07.A01(obj3);
            if (ComponentsSystrace.A00.isTracing()) {
                ComponentsSystrace.A02(AnonymousClass001.A0R("onUnbind: ", abstractC50792Va.A0H()));
            }
            try {
                try {
                    abstractC50792Va.A0v(c2xe, A01, obj);
                } catch (Exception e) {
                    if (c2xe != null) {
                        C51372Xk.A03(c2xe, e);
                    }
                }
            } finally {
                ComponentsSystrace.A01();
            }
        }

        @Override // X.InterfaceC77833eB
        public final /* synthetic */ Class CBk() {
            return getClass();
        }

        @Override // X.InterfaceC77833eB
        public final /* synthetic */ String getDescription() {
            return AbstractC75733ae.A00(getClass());
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
            return true;
        }
    };

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C78923fy(android.util.SparseArray r14, X.AbstractC50812Vc r15, X.C2XE r16, X.C50952Vr r17, java.lang.String r18, int r19, int r20, int r21, long r22) {
        /*
            r13 = this;
            r4 = r15
            java.lang.Integer r0 = r15.A0Q()
            java.lang.Integer r7 = X.C05F.A01
            if (r0 != r7) goto Lb
            java.lang.Integer r7 = X.C05F.A00
        Lb:
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r21
            r13.A03 = r0
            X.3eB r1 = X.C78923fy.A09
            X.3eC r0 = new X.3eC
            r0.<init>(r1, r13)
            r1 = 0
            X.3eC[] r0 = new X.C77843eC[]{r0}
            r0 = r0[r1]
            r13.A0D(r0)
            X.3eB r1 = X.C78923fy.A08
            X.3eC r0 = new X.3eC
            r0.<init>(r1, r13)
            r13.A0C(r0)
            boolean r0 = r15 instanceof X.AbstractC50792Va
            if (r0 == 0) goto L54
            r0 = r4
            X.2Va r0 = (X.AbstractC50792Va) r0
            X.2V6 r0 = r0.BeU()
        L46:
            r13.A05 = r0
            java.lang.String r0 = r15.A0H()
            X.C14360o3.A07(r0)
            r13.A06 = r0
            r13.A04 = r13
            return
        L54:
            X.2V5 r0 = X.C2V5.A00
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78923fy.<init>(android.util.SparseArray, X.2Vc, X.2XE, X.2Vr, java.lang.String, int, int, int, long):void");
    }

    @Override // X.C2WC
    public final void A05() {
        this.A01 = false;
        this.A02 = false;
    }

    @Override // X.C2WC
    public final void A06() {
        this.A01 = true;
    }

    @Override // X.InterfaceC50822Vd
    public final Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        Object A0G = ((C2WB) this).A03.A0G(context);
        C14360o3.A07(A0G);
        return A0G;
    }

    @Override // X.InterfaceC50822Vd
    public final C2Wm D8D(int i) {
        C2Wm c2Wm = null;
        try {
            AbstractC50812Vc abstractC50812Vc = ((C2WB) this).A03;
            if (abstractC50812Vc instanceof AbstractC50792Va) {
                c2Wm = ((AbstractC50792Va) abstractC50812Vc).D8D(i);
                return c2Wm;
            }
        } catch (Exception e) {
            C2XE c2xe = ((C2WB) this).A04;
            if (c2xe != null) {
                C51372Xk.A03(c2xe, e);
            }
        }
        return c2Wm;
    }

    @Override // X.C2WC
    public final String A04() {
        return this.A06;
    }

    @Override // X.C2WC
    public final InterfaceC50822Vd A0I() {
        return this.A04;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ boolean AFr() {
        return false;
    }

    @Override // X.InterfaceC50822Vd
    public final Object BeR() {
        return ((C2WB) this).A03.getClass();
    }

    @Override // X.InterfaceC50822Vd
    public final C2V6 BeU() {
        return this.A05;
    }

    @Override // X.InterfaceC50822Vd
    public final int E4c() {
        AbstractC50812Vc abstractC50812Vc = ((C2WB) this).A03;
        if (abstractC50812Vc instanceof AbstractC50792Va) {
            return ((AbstractC50792Va) abstractC50812Vc).E4c();
        }
        return 3;
    }
}
