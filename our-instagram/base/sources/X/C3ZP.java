package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3ZP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZP implements C3ZQ {
    public WeakReference A00;
    public final C50525MSe A01;
    public final Map A02;
    public final C0UO A03;
    public final C05A A04;

    @Override // X.C3ZQ
    public final Object Ava() {
        return null;
    }

    @Override // X.C3ZQ
    public final /* synthetic */ boolean DR6(Object obj) {
        return true;
    }

    @Override // X.C3ZQ
    public final /* synthetic */ void DR7(Object obj) {
    }

    public static final Object A00(C3ZP c3zp, Object obj, InterfaceC16820sZ interfaceC16820sZ) {
        Object invoke;
        if (c3zp.A01.A03) {
            return interfaceC16820sZ.invoke();
        }
        synchronized (obj) {
            invoke = interfaceC16820sZ.invoke();
        }
        return invoke;
    }

    public static final void A01(C3ZP c3zp) {
        if (c3zp.A01.A03) {
            c3zp.A04.Egh(new C9BW(c3zp.A00, AbstractC001800i.A0k(c3zp.A02.keySet())));
        }
    }

    @Override // X.C3ZQ
    public final Iterable BWV(C206209Bd c206209Bd, C3AW c3aw, int i) {
        return (Iterable) A00(this, this, new C9E0(this, 18));
    }

    public C3ZP(C50525MSe c50525MSe) {
        this.A01 = c50525MSe;
        C008002u c008002u = new C008002u(new C9BW((WeakReference) null, C16910sj.A00));
        this.A04 = c008002u;
        this.A03 = AbstractC208910l.A02(c008002u);
        this.A02 = new LinkedHashMap();
    }
}
