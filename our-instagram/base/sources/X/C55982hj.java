package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.2hj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55982hj {
    public static int A0E;
    public double A01;
    public double A03;
    public C55942hf A05;
    public boolean A06;
    public C55952hg A08;
    public final String A0C;
    public final C55992hk A09 = new Object();
    public final C55992hk A0A = new Object();
    public final C55992hk A0B = new Object();
    public boolean A07 = true;
    public double A02 = 0.005d;
    public double A00 = 0.005d;
    public double A04 = 0.0d;
    public final CopyOnWriteArraySet A0D = new CopyOnWriteArraySet();

    public final void A05(double d) {
        A08(d, true);
    }

    public final void A00() {
        if (this.A08 != null) {
            this.A0D.clear();
            C55952hg c55952hg = this.A08;
            c55952hg.A03.remove(this);
            c55952hg.A02.remove(this.A0C);
            this.A08 = null;
            A01();
        }
    }

    public final void A01() {
        C55992hk c55992hk = this.A09;
        double d = c55992hk.A00;
        this.A01 = d;
        this.A0B.A00 = d;
        c55992hk.A01 = 0.0d;
    }

    public final void A02() {
        A08(1.0d, true);
    }

    public final void A03() {
        A06(1.0d);
    }

    public final void A04() {
        A06(0.0d);
    }

    public final void A06(double d) {
        C55952hg c55952hg;
        if ((this.A01 != d || !A0C()) && (c55952hg = this.A08) != null) {
            this.A03 = this.A09.A00;
            this.A01 = d;
            c55952hg.A03(this.A0C);
            Iterator it = this.A0D.iterator();
            while (it.hasNext()) {
                ((InterfaceC55932he) it.next()).Dnl(this);
            }
        }
    }

    public final void A07(double d) {
        C55952hg c55952hg;
        C55992hk c55992hk = this.A09;
        if (d != c55992hk.A01 && (c55952hg = this.A08) != null) {
            c55992hk.A01 = d;
            c55952hg.A03(this.A0C);
        }
    }

    public final void A08(double d, boolean z) {
        C55952hg c55952hg = this.A08;
        if (c55952hg != null) {
            this.A03 = d;
            this.A09.A00 = d;
            c55952hg.A03(this.A0C);
            Iterator it = this.A0D.iterator();
            while (it.hasNext()) {
                ((InterfaceC55932he) it.next()).Dnm(this);
            }
            if (z) {
                A01();
            }
        }
    }

    public final void A09(C55942hf c55942hf) {
        if (c55942hf != null) {
            this.A05 = c55942hf;
            return;
        }
        throw new IllegalArgumentException("springConfig is required");
    }

    public final void A0A(InterfaceC55932he interfaceC55932he) {
        if (interfaceC55932he != null) {
            this.A0D.add(interfaceC55932he);
            return;
        }
        throw new IllegalArgumentException("newListener is required");
    }

    public final void A0B(InterfaceC55932he interfaceC55932he) {
        if (interfaceC55932he != null) {
            this.A0D.remove(interfaceC55932he);
            return;
        }
        throw new IllegalArgumentException("listenerToRemove is required");
    }

    public final boolean A0C() {
        C55992hk c55992hk = this.A09;
        if (Math.abs(c55992hk.A01) <= this.A02) {
            if (Math.abs(this.A01 - c55992hk.A00) <= this.A00 || this.A05.A01 == 0.0d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0D() {
        if (this.A05.A01 > 0.0d) {
            double d = this.A03;
            double d2 = this.A01;
            if (d >= d2 || this.A09.A00 <= d2) {
                if (d > d2 && this.A09.A00 < d2) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0E(double d) {
        if (Math.abs(this.A09.A00 - d) > this.A00) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2hk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2hk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2hk, java.lang.Object] */
    public C55982hj(C55952hg c55952hg) {
        this.A08 = c55952hg;
        int i = A0E;
        A0E = i + 1;
        this.A0C = AnonymousClass001.A0O("spring:", i);
        A09(C55942hf.A02);
    }
}
