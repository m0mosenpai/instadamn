package X;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Deprecated;

@Deprecated(message = "Do not use this. This is a clone of LiveData. Use LiveData for Java use cases, and Flow for Kotlin use cases.")
/* renamed from: X.81v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1811981v {
    public Object A00;
    public final java.util.Set A01 = new HashSet();

    public final void A00(AnonymousClass822 anonymousClass822) {
        C14360o3.A0B(anonymousClass822, 0);
        java.util.Set set = this.A01;
        synchronized (set) {
            set.add(anonymousClass822);
        }
    }

    public final void A01(AnonymousClass822 anonymousClass822) {
        C14360o3.A0B(anonymousClass822, 0);
        java.util.Set set = this.A01;
        synchronized (set) {
            set.remove(anonymousClass822);
        }
    }

    public final void A02(final Object obj) {
        synchronized (this.A01) {
            this.A00 = obj;
            C11T.A03(new Runnable() { // from class: X.8Zl
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.Set set = C1811981v.this.A01;
                    Object obj2 = obj;
                    synchronized (set) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((AnonymousClass822) it.next()).onChanged(obj2);
                        }
                    }
                }
            });
        }
    }

    public final void A03(final Object obj) {
        java.util.Set set = this.A01;
        synchronized (set) {
            this.A00 = obj;
            final HashSet hashSet = new HashSet(set);
            C11T.A02(new Runnable() { // from class: X.82S
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.Set set2 = hashSet;
                    Object obj2 = obj;
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        ((AnonymousClass822) it.next()).onChanged(obj2);
                    }
                }
            });
        }
    }

    public C1811981v(Object obj) {
        this.A00 = obj;
    }
}
