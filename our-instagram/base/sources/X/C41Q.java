package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.41Q, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41Q extends BaseAdapter {
    public C3W4 A00;
    public C41S A01;
    public C904341d A02;
    public C904741h A03;
    public C41X A04;
    public C75113Zb A05;
    public C33P A06;
    public int A07;
    public Integer A08;
    public final UserSession A09;
    public final C3VU A0A;
    public final C38321qM A0B;
    public final C57332k8 A0C;
    public final InterfaceC09390do A0D = AbstractC09440dt.A01(new C206889Dt(this, 19));
    public final Context A0E;
    public final C62862tP A0F;
    public final ReboundViewPager A0G;
    public final C41R A0H;
    public final InterfaceC60442pS A0I;
    public final Float A0J;
    public final boolean A0K;
    public final boolean A0L;

    public C41Q(Context context, C62862tP c62862tP, C3W4 c3w4, UserSession userSession, ReboundViewPager reboundViewPager, C3VU c3vu, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C57332k8 c57332k8, C33P c33p, Float f, Integer num, int i, boolean z, boolean z2) {
        this.A0E = context;
        this.A0C = c57332k8;
        this.A0K = z;
        this.A0B = c38321qM;
        this.A0A = c3vu;
        this.A09 = userSession;
        this.A0L = z2;
        this.A0I = interfaceC60442pS;
        this.A0F = c62862tP;
        this.A08 = num;
        this.A0J = f;
        this.A0G = reboundViewPager;
        this.A0H = new C41R(context, userSession);
        A03(c3w4, userSession, c3vu, c75113Zb, c33p, this.A08, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0235, code lost:
    
        if (r0 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x04c1, code lost:
    
        if (r1 != null) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020f A[LOOP:0: B:73:0x0209->B:75:0x020f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0498  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(android.view.View r46, int r47) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41Q.A01(android.view.View, int):void");
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        if (view == null) {
            view = A00(i, viewGroup);
        }
        try {
            A01(view, i);
        } catch (ClassCastException unused) {
            view = A00(i, viewGroup);
            A01(view, i);
        }
        this.A0A.EDw(view, this.A0B, A02(), i);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if (r0 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.view.View A00(int r16, android.view.ViewGroup r17) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41Q.A00(int, android.view.ViewGroup):android.view.View");
    }

    public final C75113Zb A02() {
        C75113Zb c75113Zb = this.A05;
        if (c75113Zb != null) {
            return c75113Zb;
        }
        C14360o3.A0F("mediaState");
        throw C00O.createAndThrow();
    }

    public final void A03(C3W4 c3w4, UserSession userSession, C3VU c3vu, C75113Zb c75113Zb, C33P c33p, Integer num, int i) {
        this.A05 = c75113Zb;
        this.A07 = i;
        this.A08 = num;
        this.A01 = new C41S(userSession);
        Context context = this.A0E;
        this.A04 = new C41X(context, userSession, null, c3vu.AmT(), this.A0K, this.A0L);
        InterfaceC60442pS interfaceC60442pS = this.A0I;
        this.A02 = new C904341d(context, userSession, c3vu.AmA(), interfaceC60442pS);
        this.A03 = new C904741h(context, this.A0F, userSession, c3vu.AmN(), interfaceC60442pS);
        this.A06 = c33p;
        this.A00 = c3w4;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A0B.A0p();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A0B.A1e(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        int i2;
        Object item = getItem(i);
        if (item != null) {
            i2 = item.hashCode();
        } else {
            i2 = -1;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0015, code lost:
    
        if (r2 != null) goto L5;
     */
    @Override // android.widget.BaseAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r6) {
        /*
            r5 = this;
            java.lang.Object r2 = r5.getItem(r6)
            X.1qM r2 = (X.C38321qM) r2
            com.instagram.common.session.UserSession r4 = r5.A09
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36325695223379220(0x810e0700023514, double:3.0358541588745335E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 == 0) goto L82
            if (r2 == 0) goto L7f
        L17:
            X.1tc r1 = r2.BRp()
            X.1qM r0 = r5.A0B
            boolean r0 = X.AbstractC905141m.A00(r4, r0, r1)
            if (r0 == 0) goto L2e
            java.lang.Integer r0 = X.C05F.A01
        L25:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L8c;
                case 1: goto L90;
                case 2: goto L8e;
                default: goto L2c;
            }
        L2c:
            r0 = 4
            return r0
        L2e:
            X.1tc r0 = X.EnumC40111tc.A04
            if (r1 != r0) goto L35
            java.lang.Integer r0 = X.C05F.A0C
            goto L25
        L35:
            X.1tc r0 = X.EnumC40111tc.A0Q
            if (r1 == r0) goto L3d
            X.1tc r0 = X.EnumC40111tc.A0V
            if (r1 != r0) goto L7f
        L3d:
            X.1rF r0 = r2.A0C
            X.4nl r0 = r0.Aso()
            if (r0 != 0) goto L55
            X.1rF r0 = r2.A0C
            X.JM9 r0 = r0.CDS()
            if (r0 != 0) goto L55
            X.1rF r0 = r2.A0C
            X.4oG r0 = r0.CDT()
            if (r0 == 0) goto L7f
        L55:
            r0 = 36313222638864207(0x8102af000a074f, double:3.0279664462041726E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 == 0) goto L7f
            r4 = 817890849(0x30c00621, float:1.3971581E-9)
            r3 = 0
            java.lang.String r2 = r2.getId()
            if (r2 != 0) goto L6c
            java.lang.String r2 = ""
        L6c:
            java.lang.String r1 = "media_id"
            X.0e4 r0 = new X.0e4
            r0.<init>(r1, r2)
            java.util.Map r1 = X.AbstractC16850sd.A0M(r0)
            java.lang.String r0 = "Feed Carousel ShowReel Native Card Rendering"
            X.AbstractC12120kG.A0J(r0, r3, r1, r4)
            java.lang.Integer r0 = X.C05F.A0N
            goto L25
        L7f:
            java.lang.Integer r0 = X.C05F.A00
            goto L25
        L82:
            if (r2 != 0) goto L17
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L8c:
            r0 = 1
            return r0
        L8e:
            r0 = 3
            return r0
        L90:
            r0 = 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41Q.getItemViewType(int):int");
    }
}
