package X;

import android.content.Context;
import com.facebook.litho.ComponentsSystrace;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50812Vc implements C2VB, Cloneable {
    public static final InterfaceC50872Vi A06 = new Object();
    public static final Map A07 = new HashMap();
    public static final AtomicInteger A08 = new AtomicInteger();
    public static final AtomicInteger A09 = new AtomicInteger(1);
    public int A00 = A09.getAndIncrement();
    public C51322Xf A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final int A05;

    public abstract C78063eY A0F(BB3 bb3, C76133bI c76133bI, C2Y5 c2y5, int i, int i2);

    public final void A0J(C2XE c2xe, C2Vj c2Vj, int i, int i2) {
        A0K(c2xe, c2Vj, i, i2, true);
    }

    public boolean A0M(AbstractC50812Vc abstractC50812Vc) {
        if (this == abstractC50812Vc) {
            return true;
        }
        if (abstractC50812Vc != null && getClass() == abstractC50812Vc.getClass()) {
            if (this.A00 != abstractC50812Vc.A00) {
                return C51372Xk.A05(this, abstractC50812Vc);
            }
            return true;
        }
        return false;
    }

    public final boolean A0N(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, C2XE c2xe, C2XE c2xe2) {
        AbstractC50922Vo abstractC50922Vo;
        AbstractC50922Vo abstractC50922Vo2 = null;
        if (c2xe == null) {
            abstractC50922Vo = null;
        } else {
            C2Y5 c2y5 = c2xe.A05;
            c2y5.getClass();
            C77083cu c77083cu = c2y5.A02;
            if (c77083cu != null) {
                abstractC50922Vo = c77083cu.A01;
            } else {
                abstractC50922Vo = null;
            }
        }
        if (c2xe2 != null) {
            C2Y5 c2y52 = c2xe2.A05;
            c2y52.getClass();
            C77083cu c77083cu2 = c2y52.A02;
            if (c77083cu2 != null) {
                abstractC50922Vo2 = c77083cu2.A01;
            } else {
                abstractC50922Vo2 = null;
            }
        }
        boolean A0V = A0V(abstractC50812Vc, abstractC50812Vc2, abstractC50922Vo, abstractC50922Vo2);
        if (!A0U()) {
            if (!A0V) {
                if (c2xe != null && c2xe2 != null && abstractC50812Vc != null && !abstractC50812Vc.A0W(c2xe, c2xe2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return A0V;
    }

    public boolean A0S() {
        return false;
    }

    public boolean A0T() {
        return false;
    }

    public boolean A0U() {
        return false;
    }

    public boolean A0W(C2XE c2xe, C2XE c2xe2) {
        return true;
    }

    public Object[] A0X() {
        return null;
    }

    public static String A01(Context context) {
        if (context == null) {
            return "null";
        }
        return AnonymousClass001.A07(context.hashCode(), "<cls>", context.getClass().getName(), "</cls>@");
    }

    public final Object A0G(Context context) {
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            ComponentsSystrace.A02(AnonymousClass001.A0R("createMountContent:", A0H()));
        }
        try {
            return A0R(context);
        } finally {
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    public final String A0I() {
        String str = this.A03;
        if (str == null) {
            if (!this.A04) {
                String num = Integer.toString(this.A05);
                this.A03 = num;
                return num;
            }
            throw new IllegalStateException(AnonymousClass001.A0g("Should not have null manual key! (", A0H(), ")"));
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0062, code lost:
    
        if (X.C51312Xe.A00(r9.A00, r35, r5.getHeight()) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(X.C2XE r32, X.C2Vj r33, int r34, int r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50812Vc.A0K(X.2XE, X.2Vj, int, int, boolean):void");
    }

    public Integer A0Q() {
        return C05F.A00;
    }

    public Object A0R(Context context) {
        throw new RuntimeException("Trying to mount a MountSpec that doesn't implement @OnCreateMountContent");
    }

    public AbstractC50812Vc() {
        int incrementAndGet;
        Class<?> cls = getClass();
        Map map = A07;
        synchronized (map) {
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = A08.incrementAndGet();
                map.put(cls, Integer.valueOf(incrementAndGet));
            }
        }
        this.A05 = incrementAndGet;
    }

    public static C51422Xp A00(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, int i) {
        String A082;
        String A0I = abstractC50812Vc.A0I();
        C51322Xf c51322Xf = abstractC50812Vc.A01;
        if (c2xe.A01 == null) {
            A082 = "";
        } else {
            A082 = c2xe.A08();
        }
        return new C51422Xp(c51322Xf, A082, A0I, i);
    }

    public static boolean A02(AbstractC50812Vc abstractC50812Vc) {
        if (abstractC50812Vc.A0Q() == C05F.A00 && abstractC50812Vc.A0S()) {
            return true;
        }
        return false;
    }

    public String A0H() {
        return AbstractC75733ae.A00(getClass());
    }

    @Override // X.C2VB
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public boolean CTz(AbstractC50812Vc abstractC50812Vc) {
        return A0M(abstractC50812Vc);
    }

    @Deprecated
    public boolean A0O(AbstractC50812Vc abstractC50812Vc, boolean z) {
        return CTz(abstractC50812Vc);
    }

    public AbstractC50812Vc A0P() {
        try {
            return (AbstractC50812Vc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean A0V(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, AbstractC50922Vo abstractC50922Vo, AbstractC50922Vo abstractC50922Vo2) {
        if (!A0T() || !C51372Xk.A04(abstractC50812Vc, abstractC50812Vc2, false)) {
            return true;
        }
        if (abstractC50922Vo == null) {
            if (abstractC50922Vo2 != null) {
                return true;
            }
        } else if (abstractC50922Vo2 == null || !C51372Xk.A05(abstractC50922Vo, abstractC50922Vo2)) {
            return true;
        }
        return false;
    }

    public final Object clone() {
        return super.clone();
    }

    public final String toString() {
        return A0H();
    }
}
