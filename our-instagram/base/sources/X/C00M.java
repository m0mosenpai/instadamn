package X;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: X.00M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00M {
    public C00H A00;
    public boolean A01;
    public OnBackInvokedCallback A02;
    public OnBackInvokedDispatcher A03;
    public boolean A04;
    public final C01U A05;
    public final Runnable A06;

    public final void A06(C00H c00h, C07X c07x) {
        C14360o3.A0B(c07x, 0);
        C14360o3.A0B(c00h, 1);
        C07T lifecycle = c07x.getLifecycle();
        if (lifecycle.A07() != C07S.DESTROYED) {
            c00h.A02.add(new C12610l6(c00h, this, lifecycle));
            A01(this);
            c00h.A00 = new C007602q(this);
        }
    }

    public static final void A00(C00M c00m) {
        Object obj;
        C00H c00h = c00m.A00;
        if (c00h == null) {
            C01U c01u = c00m.A05;
            ListIterator<E> listIterator = c01u.listIterator(c01u.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (((C00H) obj).A01) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c00h = (C00H) obj;
        }
        c00m.A00 = null;
        if (c00h != null) {
            c00h.A00();
        }
    }

    public static final void A01(C00M c00m) {
        boolean z = c00m.A01;
        C01U c01u = c00m.A05;
        boolean z2 = false;
        if (!c01u.isEmpty()) {
            Iterator<E> it = c01u.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C00H) it.next()).A01) {
                    z2 = true;
                    break;
                }
            }
        }
        c00m.A01 = z2;
        if (z2 != z && Build.VERSION.SDK_INT >= 33) {
            c00m.A02(z2);
        }
    }

    private final void A02(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.A03;
        OnBackInvokedCallback onBackInvokedCallback = this.A02;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            boolean z2 = false;
            boolean z3 = this.A04;
            if (z) {
                if (!z3) {
                    C00J.A01(onBackInvokedDispatcher, onBackInvokedCallback);
                    z2 = true;
                } else {
                    return;
                }
            } else if (!z3) {
                return;
            } else {
                C00J.A02(onBackInvokedDispatcher, onBackInvokedCallback);
            }
            this.A04 = z2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.0zC] */
    public final C20360zC A03(final C00H c00h) {
        this.A05.add(c00h);
        ?? r1 = new AnonymousClass003(c00h, this) { // from class: X.0zC
            public final C00H A00;
            public final /* synthetic */ C00M A01;

            {
                this.A01 = this;
                this.A00 = c00h;
            }

            @Override // X.AnonymousClass003
            public final void cancel() {
                C00M c00m = this.A01;
                C01U c01u = c00m.A05;
                C00H c00h2 = this.A00;
                c01u.remove(c00h2);
                if (C14360o3.A0K(c00m.A00, c00h2)) {
                    c00h2.A00();
                    c00m.A00 = null;
                }
                c00h2.A02.remove(this);
                InterfaceC16820sZ interfaceC16820sZ = c00h2.A00;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                c00h2.A00 = null;
            }
        };
        c00h.A02.add(r1);
        A01(this);
        c00h.A00 = new C007502p(this);
        return r1;
    }

    public final void A04() {
        Object obj;
        C00H c00h = this.A00;
        if (c00h == null) {
            C01U c01u = this.A05;
            ListIterator<E> listIterator = c01u.listIterator(c01u.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (((C00H) obj).A01) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c00h = (C00H) obj;
        }
        this.A00 = null;
        if (c00h != null) {
            c00h.A01();
            return;
        }
        Runnable runnable = this.A06;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public final void A05(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.A03 = onBackInvokedDispatcher;
        A02(this.A01);
    }

    public C00M(Runnable runnable) {
        OnBackInvokedCallback A00;
        this.A06 = runnable;
        this.A05 = new C01U();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                A00 = C00L.A00(new C05940Te(this), new C0T9(this), new C05970Tl(this), new C05950Tj(this));
            } else {
                A00 = C00J.A00(new C05830Sl(this));
            }
            this.A02 = A00;
        }
    }

    public C00M() {
        this(null);
    }
}
