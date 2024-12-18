package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.debughead.data.provider.MobileBoostOptimizationHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1J4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1J4 extends C1J5 implements C1J6 {
    public static C1J4 A0E;
    public C1JB A00;
    public C1JC A01;
    public UserSession A02;
    public MobileBoostOptimizationHelper A03;
    public int[] A04;
    public final Context A05;
    public final C1JD A06;
    public final C1JA A07;
    public final C1J7 A08;
    public final C1J8 A09;
    public final List A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final C1J7 A0D;

    public C1J4(Context context, C1JA c1ja, C1J7 c1j7, C1J8 c1j8) {
        super(c1ja);
        this.A04 = new int[0];
        this.A08 = c1j7;
        this.A09 = c1j8;
        this.A05 = context.getApplicationContext();
        this.A07 = c1ja;
        C1JB.A0A = this;
        this.A01 = new C1JC(context, new SparseArray(), null);
        AnonymousClass155 anonymousClass155 = c1ja.A03;
        super.A00 = anonymousClass155;
        this.A06 = new C1JD(super.A01, C1J9.A01, c1ja, this, anonymousClass155, super.A02);
        this.A0B = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.1JF
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C1J4.A01(C1J4.this, 8);
            }
        });
        this.A0C = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.1JG
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C1J4.A01(C1J4.this, 4);
            }
        });
        this.A0A = new ArrayList();
        this.A0D = c1j7;
        c1j8.A00 = c1j7;
        C1JH.A00 = this;
    }

    @Override // X.C1J6
    public final void ABe() {
        C1JB.A09 = false;
    }

    @Override // X.C1J6
    public final void ABf() {
        C1JB.A09 = true;
    }

    public static synchronized C1J4 A00(Context context) {
        C1J4 c1j4;
        synchronized (C1J4.class) {
            c1j4 = A0E;
            if (c1j4 == null) {
                c1j4 = new C1J4(context, new C1JA(), new C1J7(), new C1J8(context));
                A0E = c1j4;
            }
        }
        return c1j4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r1.A00 < r4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean A01(X.C1J4 r3, int r4) {
        /*
            X.1J8 r0 = r3.A09
            r2 = 5
            X.1J9 r0 = r0.A03
            X.15E r1 = r0.A00(r2)
            if (r1 != 0) goto Lc
            r1 = 0
        Lc:
            X.15R r1 = (X.C15R) r1
            if (r1 == 0) goto L21
            X.1JC r0 = r3.A01
            boolean r0 = r0.A00(r2)
            if (r0 != 0) goto L21
            boolean r0 = r1.A01
            if (r0 == 0) goto L21
            int r1 = r1.A00
            r0 = 1
            if (r1 >= r4) goto L22
        L21:
            r0 = 0
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1J4.A01(X.1J4, int):java.lang.Boolean");
    }

    public static void A02(C1J4 c1j4, List list, int i, boolean z, boolean z2) {
        if (list != null) {
            if (z) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c1j4.A05(((Number) it.next()).intValue(), i);
                }
            } else if (z2) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c1j4.A05(((Number) it2.next()).intValue(), i);
                }
            }
        }
    }

    public final C1JB A07(int i) {
        C95U c95u;
        C1JB c1jb = (C1JB) super.A01.get(i);
        if (c1jb == null) {
            C1JB c1jb2 = this.A00;
            if (c1jb2 == null) {
                C1JA c1ja = this.A07;
                C95T c95t = c1ja.A02;
                AnonymousClass155 anonymousClass155 = c1ja.A03;
                AnonymousClass150 A00 = AnonymousClass150.A00();
                AnonymousClass157 anonymousClass157 = AnonymousClass157.A01;
                if (anonymousClass157 == null) {
                    anonymousClass157 = new AnonymousClass157(A00);
                    AnonymousClass157.A01 = anonymousClass157;
                }
                if (c95t != null) {
                    c95u = c95t.A00;
                } else {
                    c95u = null;
                }
                C1JB c1jb3 = new C1JB(c1ja, c95u, anonymousClass157, anonymousClass155, Integer.MIN_VALUE);
                this.A00 = c1jb3;
                return c1jb3;
            }
            return c1jb2;
        }
        return c1jb;
    }

    public final void A08(Context context, QuickPerformanceLogger quickPerformanceLogger, UserSession userSession) {
        String str;
        String str2;
        C1J7 c1j7 = this.A0D;
        boolean A0W = C17280tP.A01(context).A0W();
        C95S c95s = new C95S(userSession);
        c1j7.A00 = c95s;
        c1j7.A01 = A0W;
        boolean z = c95s.A06;
        c1j7.A02 = z;
        if (z) {
            this.A02 = userSession;
            super.A01.clear();
            C1JA c1ja = this.A07;
            C95S c95s2 = c1j7.A00;
            if (c95s2 != null) {
                str = c95s2.A00;
            } else {
                str = "";
            }
            if (c95s2 != null) {
                str2 = c95s2.A02;
            } else {
                str2 = "";
            }
            c1ja.A02 = new C95T(userSession, str, str2);
            c1ja.A04 = quickPerformanceLogger;
            MobileBoostOptimizationHelper mobileBoostOptimizationHelper = this.A03;
            if (mobileBoostOptimizationHelper != null) {
                mobileBoostOptimizationHelper.onMobileBoostInit(this);
            }
            this.A06.A00(context);
        }
    }
}
