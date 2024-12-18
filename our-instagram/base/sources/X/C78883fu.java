package X;

import android.content.Context;

/* renamed from: X.3fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78883fu extends C2WB {
    public final C2YQ A00;
    public final InterfaceC50822Vd A01;
    public final String A02;

    @Override // X.C2WC
    public final void A08(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        C2WE c2we;
        C14360o3.A0B(c3h5, 3);
        C2YQ c2yq = this.A00;
        Object obj3 = null;
        if ((obj2 instanceof C2WE) && (c2we = (C2WE) obj2) != null) {
            obj3 = c2we.A05;
        }
        c2yq.A08(context, c3h5, c1ll, obj, obj3);
    }

    @Override // X.C2WC
    public final void A09(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        C2WE c2we;
        C14360o3.A0B(c3h5, 3);
        C2YQ c2yq = this.A00;
        Object obj3 = null;
        if ((obj2 instanceof C2WE) && (c2we = (C2WE) obj2) != null) {
            obj3 = c2we.A05;
        }
        c2yq.A09(context, c3h5, c1ll, obj, obj3);
    }

    @Override // X.C2WC
    public final void A0A(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        C2WE c2we;
        C14360o3.A0B(obj, 1);
        C14360o3.A0B(c3h5, 3);
        C2YQ c2yq = this.A00;
        Object obj3 = null;
        if ((obj2 instanceof C2WE) && (c2we = (C2WE) obj2) != null) {
            obj3 = c2we.A05;
        }
        c2yq.A0A(context, c3h5, c1ll, obj, obj3);
    }

    @Override // X.C2WC
    public final void A0B(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        C2WE c2we;
        C14360o3.A0B(c3h5, 3);
        C2YQ c2yq = this.A00;
        Object obj3 = null;
        if ((obj2 instanceof C2WE) && (c2we = (C2WE) obj2) != null) {
            obj3 = c2we.A05;
        }
        c2yq.A0B(context, c3h5, c1ll, obj, obj3);
    }

    @Override // X.C2WC
    public final void A0D(C77843eC c77843eC) {
        C14360o3.A0B(c77843eC, 0);
        this.A00.A0D(c77843eC);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C78883fu(android.util.SparseArray r14, X.AbstractC50812Vc r15, X.C2XE r16, X.C50952Vr r17, X.C2YQ r18, java.lang.String r19, int r20, int r21) {
        /*
            r13 = this;
            r1 = r18
            X.2YP r0 = r1.A01
            long r11 = r0.A00
            java.lang.Integer r7 = r1.A04
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.A00 = r1
            X.2Vd r0 = r0.A01
            r13.A01 = r0
            java.lang.String r0 = r1.A04()
            r13.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78883fu.<init>(android.util.SparseArray, X.2Vc, X.2XE, X.2Vr, X.2YQ, java.lang.String, int, int):void");
    }

    @Override // X.C2WC
    public final InterfaceC77833eB A02(Class cls) {
        return this.A00.A02(C79033gA.class);
    }

    @Override // X.C2WC
    public final String A04() {
        return this.A02;
    }

    @Override // X.C2WC
    public final void A07(Context context, C3h5 c3h5, C79063gD c79063gD, C2WC c2wc, C1LL c1ll, Object obj, Object obj2, Object obj3, boolean z) {
        Object obj4;
        C2WE c2we;
        C2WE c2we2;
        C14360o3.A0B(c2wc, 2);
        C14360o3.A0B(c3h5, 6);
        C2YQ c2yq = this.A00;
        C2YQ c2yq2 = ((C78883fu) c2wc).A00;
        Object obj5 = null;
        if ((obj2 instanceof C2WE) && (c2we2 = (C2WE) obj2) != null) {
            obj4 = c2we2.A05;
        } else {
            obj4 = null;
        }
        if ((obj3 instanceof C2WE) && (c2we = (C2WE) obj3) != null) {
            obj5 = c2we.A05;
        }
        c2yq.A07(context, c3h5, c79063gD, c2yq2, c1ll, obj, obj4, obj5, z);
    }

    @Override // X.C2WC
    public final boolean A0E() {
        return this.A00.A00;
    }

    @Override // X.C2WC
    public final boolean A0F(C77843eC c77843eC) {
        return this.A00.A0F(c77843eC);
    }

    @Override // X.C2WC
    public final boolean A0G(C77843eC c77843eC) {
        return this.A00.A0G(c77843eC);
    }

    @Override // X.C2WC
    public final InterfaceC50822Vd A0I() {
        return this.A01;
    }
}
