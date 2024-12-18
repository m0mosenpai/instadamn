package X;

import java.util.Iterator;

/* renamed from: X.6Vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140176Vv implements InterfaceC136406Ft {
    public static final C140176Vv A00 = new Object();

    @Override // X.InterfaceC136406Ft
    public final void A7j(String str) {
        C14360o3.A0B(str, 0);
        A00().A09(str);
        A01(str);
    }

    public static final C18570vk A00() {
        Object obj = C140186Vw.A00.get();
        if (obj != null) {
            return (C18570vk) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(String str) {
        boolean A04;
        C103054kg A002 = AbstractC103044kf.A00();
        if (A002 != null) {
            C140026Vg c140026Vg = A002.A01;
            C18590vm c18590vm = c140026Vg.A04.A00;
            synchronized (c18590vm) {
                A04 = c18590vm.A04(str);
            }
            if (!A04) {
                synchronized (c18590vm) {
                    c18590vm.A09(str, null);
                }
                c140026Vg.A03.A01(new C6DY(str, null));
            }
        }
    }

    @Override // X.InterfaceC136406Ft
    public final void A7t(Iterable iterable) {
        A00().A08(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A01((String) it.next());
        }
    }
}
