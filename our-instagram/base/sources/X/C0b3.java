package X;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0b3, reason: invalid class name */
/* loaded from: classes.dex */
public class C0b3 {
    public static C0b3 A0L;
    public static final C0P4 A0M = new C0P4();
    public static final C07970bH A0N = new C07970bH();
    public InterfaceC07800ax A00;
    public C05300Qc A01;
    public C05300Qc A02;
    public C07850b4 A03;
    public C0QX A04;
    public C07780au A05;
    public C07770at A06;
    public C07760as A07;
    public C05480Qx A08;
    public C05330Qg A09;
    public C05290Qb A0A;
    public C0Qa A0B;
    public C0QY A0C;
    public C0QW A0D;
    public C0QV A0E;
    public Map A0F;
    public Map A0G;
    public final List A0H;
    public final java.util.Set A0I;
    public final Map A0J;
    public final Map A0K;

    public static synchronized C0QU A01(C0b3 c0b3, C03190Dc c03190Dc) {
        C0QU c0qu;
        synchronized (c0b3) {
            Map map = c0b3.A0F;
            if (!map.containsKey(c03190Dc)) {
                map.put(c03190Dc, new AbstractC07720ao(A0N, A0M, c03190Dc, "TrustedAppIntentScope"));
            }
            c0qu = (C0QU) map.get(c03190Dc);
        }
        return c0qu;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0b4, X.0OK] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0bI, X.0Qx] */
    public final synchronized C05480Qx A03() {
        C05480Qx c05480Qx;
        C05480Qx c05480Qx2 = this.A08;
        c05480Qx = c05480Qx2;
        if (c05480Qx2 == null) {
            C07850b4 c07850b4 = this.A03;
            C07850b4 c07850b42 = c07850b4;
            if (c07850b4 == null) {
                ?? c0ok = new C0OK(A0N, A0M);
                this.A03 = c0ok;
                c07850b42 = c0ok;
            }
            ?? c07980bI = new C07980bI(c07850b42, null, this.A0H, this.A0I);
            this.A08 = c07980bI;
            c05480Qx = c07980bI;
        }
        return c05480Qx;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0OK, X.0QX] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0bI, X.0Qg] */
    public final synchronized C05330Qg A04() {
        C05330Qg c05330Qg;
        C05330Qg c05330Qg2 = this.A09;
        c05330Qg = c05330Qg2;
        if (c05330Qg2 == null) {
            C0QX c0qx = this.A04;
            C0QX c0qx2 = c0qx;
            if (c0qx == null) {
                ?? c0ok = new C0OK(A0N, A0M);
                this.A04 = c0ok;
                c0qx2 = c0ok;
            }
            ?? c07980bI = new C07980bI(c0qx2, null, this.A0H, this.A0I);
            this.A09 = c07980bI;
            c05330Qg = c07980bI;
        }
        return c05330Qg;
    }

    public final synchronized C05300Qc A05() {
        return A06();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X.0Qc, X.0bI] */
    public final synchronized C05300Qc A06() {
        C05300Qc c05300Qc;
        C05300Qc c05300Qc2 = this.A02;
        c05300Qc = c05300Qc2;
        if (c05300Qc2 == null) {
            ?? c07980bI = new C07980bI(A0C(), null, this.A0H, this.A0I);
            this.A02 = c07980bI;
            c05300Qc = c07980bI;
        }
        c05300Qc.A00 = this.A00;
        return c05300Qc;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0at, X.0OK] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0Qb, X.0bI] */
    public final synchronized C05290Qb A07() {
        C05290Qb c05290Qb;
        C05290Qb c05290Qb2 = this.A0A;
        c05290Qb = c05290Qb2;
        if (c05290Qb2 == null) {
            C07770at c07770at = this.A06;
            C07770at c07770at2 = c07770at;
            if (c07770at == null) {
                ?? c0ok = new C0OK(A0N, A0M);
                this.A06 = c0ok;
                c07770at2 = c0ok;
            }
            ?? c07980bI = new C07980bI(c07770at2, null, this.A0H, this.A0I);
            this.A0A = c07980bI;
            c05290Qb = c07980bI;
        }
        return c05290Qb;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Qb, X.0bI] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0at, X.0OK] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0Qb, X.0bI] */
    public final synchronized C05290Qb A08(String str) {
        C05290Qb c05290Qb;
        C05290Qb c05290Qb2 = this.A0A;
        c05290Qb = c05290Qb2;
        if (c05290Qb2 == null) {
            C07770at c07770at = this.A06;
            C07770at c07770at2 = c07770at;
            if (c07770at == null) {
                ?? c0ok = new C0OK(A0N, A0M);
                this.A06 = c0ok;
                c07770at2 = c0ok;
            }
            ?? c07980bI = new C07980bI(c07770at2, null, this.A0H, this.A0I);
            this.A0A = c07980bI;
            c05290Qb = c07980bI;
        }
        return new C07980bI(c05290Qb.A01, str, c05290Qb.A03, c05290Qb.A04);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0as, X.0OK] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0Qa, X.0bI] */
    public final synchronized C0Qa A09() {
        C0Qa c0Qa;
        C0Qa c0Qa2 = this.A0B;
        c0Qa = c0Qa2;
        if (c0Qa2 == null) {
            C07760as c07760as = this.A07;
            C07760as c07760as2 = c07760as;
            if (c07760as == null) {
                ?? c0ok = new C0OK(A0N, A0M, C05F.A01);
                this.A07 = c0ok;
                c07760as2 = c0ok;
            }
            ?? c07980bI = new C07980bI(c07760as2, null, this.A0H, this.A0I);
            this.A0B = c07980bI;
            c0Qa = c07980bI;
        }
        return c0Qa;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X.0bI, X.0QY] */
    public final synchronized C0QY A0A() {
        C0QY c0qy;
        C0QY c0qy2 = this.A0C;
        c0qy = c0qy2;
        if (c0qy2 == null) {
            ?? c07980bI = new C07980bI(A0D(), null, this.A0H, this.A0I);
            this.A0C = c07980bI;
            c0qy = c07980bI;
        }
        return c0qy;
    }

    public final synchronized C07980bI A0B(C03190Dc c03190Dc) {
        Map map;
        map = this.A0J;
        if (!map.containsKey(c03190Dc)) {
            map.put(c03190Dc, new C07980bI(A01(this, c03190Dc), null, this.A0H, this.A0I));
        }
        return (C07980bI) map.get(c03190Dc);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X.0ao, X.0QW] */
    public synchronized C0QW A0C() {
        C0QW c0qw;
        C0QW c0qw2 = this.A0D;
        c0qw = c0qw2;
        if (c0qw2 == null) {
            C03190Dc c03190Dc = C0QW.A00;
            ?? abstractC07720ao = new AbstractC07720ao(A0N, A0M, C0QW.A00, "FamilyIntentScope");
            this.A0D = abstractC07720ao;
            c0qw = abstractC07720ao;
        }
        return c0qw;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0QV] */
    public synchronized C0QV A0D() {
        C0QV c0qv;
        C0QV c0qv2 = this.A0E;
        c0qv = c0qv2;
        if (c0qv2 == null) {
            final C07970bH c07970bH = A0N;
            final C0P4 c0p4 = A0M;
            final C03190Dc A00 = AbstractC08590cN.A00();
            ?? r3 = new AbstractC07790av(c07970bH, c0p4, A00) { // from class: X.0QV
                public final C03190Dc A00;

                @Override // X.C0OK
                public final boolean A0G() {
                    return false;
                }

                @Override // X.C0OK
                public final Integer A0E() {
                    return C05F.A0u;
                }

                @Override // X.AbstractC07790av
                public final boolean A0I(Context context, ComponentInfo componentInfo) {
                    if (componentInfo.applicationInfo == null) {
                        this.A01.EHA("ThirdPartyIntentScope", "Null application info.", null);
                        return false;
                    }
                    try {
                        return !this.A00.A02(context, r0.uid);
                    } catch (SecurityException e) {
                        this.A01.EHA("ThirdPartyIntentScope", AnonymousClass001.A0R("Unexpected exception in checking trusted app for ", ((PackageItemInfo) componentInfo).packageName), e);
                        return !A0A();
                    }
                }

                {
                    this.A00 = A00;
                }
            };
            this.A0E = r3;
            c0qv = r3;
        }
        return c0qv;
    }

    public static synchronized C0b3 A00() {
        C0b3 c0b3;
        synchronized (C0b3.class) {
            try {
                c0b3 = A0L;
                if (c0b3 == null) {
                    c0b3 = new C0b3();
                    A0L = c0b3;
                }
            } finally {
            }
        }
        return c0b3;
    }

    public static final void A02(Context context, AbstractC07590aY abstractC07590aY) {
        Iterator it = abstractC07590aY.A00.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                Integer A05 = abstractC07590aY.A05();
                if (A05 == C05F.A00) {
                    context.registerReceiver(abstractC07590aY, intentFilter);
                } else {
                    if (A05 != C05F.A01) {
                        z = false;
                    }
                    AbstractC07820az.A00(abstractC07590aY, context, intentFilter, z);
                }
            } else {
                return;
            }
        }
    }

    public C0b3() {
        C07750ar.A00();
        java.util.Set set = AbstractC08010bM.A00;
        C14360o3.A07(set);
        this.A0I = set;
        C07750ar.A00();
        List unmodifiableList = Collections.unmodifiableList(AbstractC08000bK.A00);
        C14360o3.A07(unmodifiableList);
        this.A0H = unmodifiableList;
        this.A06 = null;
        this.A07 = null;
        this.A0D = null;
        this.A05 = null;
        this.A03 = null;
        this.A04 = null;
        this.A0E = null;
        this.A0A = null;
        this.A0B = null;
        this.A02 = null;
        this.A01 = null;
        this.A08 = null;
        this.A09 = null;
        this.A0C = null;
        this.A0F = new HashMap();
        this.A0G = new HashMap();
        this.A0J = new HashMap();
        this.A0K = new HashMap();
        this.A00 = null;
    }
}
