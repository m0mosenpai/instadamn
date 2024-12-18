package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2GT, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2GT {
    public static final Object A0A = new Object();
    public int A00;
    public int A01;
    public C58336PtW A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Object A06;
    public final Runnable A07;
    public volatile Object A08;
    public volatile Object A09;

    public void A03() {
    }

    public void A04() {
    }

    private void A00(AbstractC58382lx abstractC58382lx) {
        if (abstractC58382lx.A01) {
            if (!abstractC58382lx.A02()) {
                abstractC58382lx.A01(false);
                return;
            }
            int i = abstractC58382lx.A00;
            int i2 = this.A01;
            if (i >= i2) {
                return;
            }
            abstractC58382lx.A00 = i2;
            abstractC58382lx.A02.onChanged(this.A08);
        }
    }

    public final Object A02() {
        Object obj = this.A08;
        if (obj == A0A) {
            return null;
        }
        return obj;
    }

    public final void A07(AbstractC58382lx abstractC58382lx) {
        if (this.A05) {
            this.A04 = true;
            return;
        }
        this.A05 = true;
        do {
            this.A04 = false;
            if (abstractC58382lx != null) {
                A00(abstractC58382lx);
                abstractC58382lx = null;
            } else {
                C211611s A05 = this.A02.A05();
                while (A05.hasNext()) {
                    A00((AbstractC58382lx) ((Map.Entry) A05.next()).getValue());
                    if (this.A04) {
                        break;
                    }
                }
            }
        } while (this.A04);
        this.A05 = false;
    }

    public final void A0A(Object obj) {
        boolean z;
        synchronized (this.A06) {
            z = false;
            if (this.A09 == A0A) {
                z = true;
            }
            this.A09 = obj;
        }
        if (z) {
            C72051XLs.A00().A02(this.A07);
        }
    }

    public final boolean A0C() {
        if (this.A00 <= 0) {
            return false;
        }
        return true;
    }

    public C2GT(Object obj) {
        this.A06 = new Object();
        this.A02 = new C58336PtW();
        this.A00 = 0;
        this.A09 = A0A;
        this.A07 = new Runnable() { // from class: X.2GU
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                C2GT c2gt = C2GT.this;
                synchronized (c2gt.A06) {
                    obj2 = c2gt.A09;
                    c2gt.A09 = C2GT.A0A;
                }
                c2gt.A0B(obj2);
            }
        };
        this.A08 = obj;
        this.A01 = 0;
    }

    public static void A01(String str) {
        if (C72051XLs.A00().A03()) {
        } else {
            throw new IllegalStateException(AnonymousClass001.A0g("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void A05(C07X c07x) {
        A01("removeObservers");
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((AbstractC58382lx) entry.getValue()).A03(c07x)) {
                A08((InterfaceC58362lv) entry.getKey());
            }
        }
    }

    public void A06(C07X c07x, InterfaceC58362lv interfaceC58362lv) {
        A01("observe");
        if (c07x.getLifecycle().A07() != C07S.DESTROYED) {
            C58372lw c58372lw = new C58372lw(c07x, this, interfaceC58362lv);
            AbstractC58382lx abstractC58382lx = (AbstractC58382lx) this.A02.A07(interfaceC58362lv, c58372lw);
            if (abstractC58382lx != null) {
                if (!abstractC58382lx.A03(c07x)) {
                    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
                }
            } else {
                c07x.getLifecycle().A09(c58372lw);
            }
        }
    }

    public void A08(InterfaceC58362lv interfaceC58362lv) {
        A01("removeObserver");
        AbstractC58382lx abstractC58382lx = (AbstractC58382lx) this.A02.A06(interfaceC58362lv);
        if (abstractC58382lx != null) {
            abstractC58382lx.A00();
            abstractC58382lx.A01(false);
        }
    }

    public final void A09(final InterfaceC58362lv interfaceC58362lv) {
        A01("observeForever");
        AbstractC58382lx abstractC58382lx = new AbstractC58382lx(interfaceC58362lv) { // from class: X.54j
            @Override // X.AbstractC58382lx
            public final boolean A02() {
                return true;
            }
        };
        Object A07 = this.A02.A07(interfaceC58362lv, abstractC58382lx);
        if (!(A07 instanceof C58372lw)) {
            if (A07 == null) {
                abstractC58382lx.A01(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void A0B(Object obj) {
        A01("setValue");
        this.A01++;
        this.A08 = obj;
        A07(null);
    }

    public C2GT() {
        this.A06 = new Object();
        this.A02 = new C58336PtW();
        this.A00 = 0;
        Object obj = A0A;
        this.A09 = obj;
        this.A07 = new Runnable() { // from class: X.2GU
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                C2GT c2gt = C2GT.this;
                synchronized (c2gt.A06) {
                    obj2 = c2gt.A09;
                    c2gt.A09 = C2GT.A0A;
                }
                c2gt.A0B(obj2);
            }
        };
        this.A08 = obj;
        this.A01 = -1;
    }
}
