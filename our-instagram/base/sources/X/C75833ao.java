package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75833ao extends C07T implements C07X {
    public C07X A00;
    public final java.util.Set A03 = new HashSet();
    public C07S A01 = C07S.RESUMED;
    public final C07T A02 = this;

    @Override // X.C07T
    public final synchronized C07S A07() {
        C07S c07s;
        C07T lifecycle;
        C07X c07x = this.A00;
        if (c07x != null && (lifecycle = c07x.getLifecycle()) != null) {
            c07s = lifecycle.A07();
        } else {
            c07s = this.A01;
        }
        return c07s;
    }

    @Override // X.C07T
    public final synchronized void A09(C07W c07w) {
        C07T lifecycle;
        C14360o3.A0B(c07w, 0);
        this.A03.add(c07w);
        C07X c07x = this.A00;
        if (c07x != null && (lifecycle = c07x.getLifecycle()) != null) {
            lifecycle.A09(c07w);
        }
    }

    @Override // X.C07T
    public final synchronized void A0A(C07W c07w) {
        C07T lifecycle;
        C14360o3.A0B(c07w, 0);
        C07X c07x = this.A00;
        if (c07x != null && (lifecycle = c07x.getLifecycle()) != null) {
            lifecycle.A0A(c07w);
        }
        this.A03.remove(c07w);
    }

    public final synchronized void A0B(C07X c07x) {
        if (!C14360o3.A0K(c07x, this)) {
            C07X c07x2 = this.A00;
            if (c07x != c07x2) {
                if (c07x2 != null) {
                    Iterator it = this.A03.iterator();
                    while (it.hasNext()) {
                        c07x2.getLifecycle().A0A((C07W) it.next());
                    }
                }
                C07T lifecycle = c07x.getLifecycle();
                if (lifecycle != null) {
                    Iterator it2 = this.A03.iterator();
                    while (it2.hasNext()) {
                        lifecycle.A09((C07W) it2.next());
                    }
                }
                this.A00 = c07x;
            }
        } else {
            throw new IllegalArgumentException("Cannot set a LifecycleOwnerWrapper as its own delegate");
        }
    }

    @Override // X.C07X
    public final C07T getLifecycle() {
        return this.A02;
    }

    public C75833ao(C07X c07x) {
        this.A00 = c07x;
    }
}
