package X;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159467Dh extends C04N implements C3I9, C03L {
    public Integer A00;
    public int A01;
    public boolean A02;
    public final View A03;
    public final WeakReference A04;
    public final HashSet A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159467Dh(View view) {
        super(1);
        C14360o3.A0B(view, 1);
        this.A03 = view;
        this.A05 = new HashSet();
        this.A04 = new WeakReference(view);
        C04U.A01(view, this);
        AbstractC008903d.A00(view, this);
    }

    @Override // X.C04N
    public final C011504d A02(C011504d c011504d, List list) {
        C14360o3.A0B(c011504d, 0);
        C14360o3.A0B(list, 1);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if ((((C04U) next).A00.A06() & 8) != 0) {
                if (next != null) {
                    int A00 = A00(c011504d);
                    Iterator it2 = this.A05.iterator();
                    C14360o3.A07(it2);
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        C14360o3.A07(next2);
                        ((InterfaceC60152ox) next2).DOK(A00, false);
                    }
                    this.A01 = A00;
                }
            }
        }
        return c011504d;
    }

    @Override // X.C04N
    public final void A03(C04U c04u) {
        this.A02 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r1 != null) goto L16;
     */
    @Override // X.C04N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.C04U r5) {
        /*
            r4 = this;
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            java.lang.Integer r1 = r4.A00
            if (r1 != 0) goto L43
            java.lang.ref.WeakReference r0 = r4.A04
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L69
            X.04d r2 = X.AbstractC009003e.A00(r0)
            if (r2 == 0) goto L69
            r0 = 8
            X.04b r1 = r2.A00
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L67
            int r2 = A00(r2)
        L26:
            r0 = 2
            X.02I r0 = r1.A05(r0)
            int r1 = r0.A00
            android.view.View r0 = r4.A03
            android.content.Context r0 = r0.getContext()
            X.C14360o3.A07(r0)
            boolean r0 = X.AbstractC13180m4.A02(r0)
            if (r0 != 0) goto L3d
            int r2 = r2 + r1
        L3d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L69
        L43:
            int r0 = r4.A01
            int r2 = r1.intValue()
            if (r2 == r0) goto L69
            java.util.HashSet r0 = r4.A05
            java.util.Iterator r1 = r0.iterator()
            X.C14360o3.A07(r1)
        L54:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r1.next()
            X.C14360o3.A07(r0)
            X.2ox r0 = (X.InterfaceC60152ox) r0
            r0.DOK(r2, r3)
            goto L54
        L67:
            r2 = 0
            goto L26
        L69:
            r4.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159467Dh.A04(X.04U):void");
    }

    @Override // X.C03L
    public final C011504d Cx7(View view, C011504d c011504d) {
        C14360o3.A0B(c011504d, 1);
        int A00 = A00(c011504d);
        this.A00 = Integer.valueOf(A00);
        if (!this.A02) {
            Iterator it = this.A05.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                C14360o3.A07(next);
                ((InterfaceC60152ox) next).DOK(A00, false);
            }
            this.A01 = A00;
        }
        return c011504d;
    }

    @Override // X.C3I9
    public final void DiY() {
    }

    @Override // X.C3I9
    public final void Dnr(Activity activity) {
    }

    @Override // X.C3I9
    public final void Edy(boolean z) {
    }

    @Override // X.C3I9
    public final void Eph(Activity activity) {
    }

    @Override // X.C3I9
    public final void onStop() {
    }

    public static final int A00(C011504d c011504d) {
        C011304b c011304b = c011504d.A00;
        int i = c011304b.A05(8).A00 - c011304b.A05(2).A00;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    @Override // X.C3I9
    public final void A9e(InterfaceC60152ox interfaceC60152ox) {
        if (interfaceC60152ox != null) {
            this.A05.add(interfaceC60152ox);
        }
    }

    @Override // X.C3I9
    public final void EFx(InterfaceC60152ox interfaceC60152ox) {
        if (interfaceC60152ox != null) {
            this.A05.remove(interfaceC60152ox);
        }
    }

    @Override // X.C3I9
    public final boolean isStarted() {
        return false;
    }

    @Override // X.C3I9
    public final void onDestroy() {
        View view = (View) this.A04.get();
        if (view != null) {
            C04U.A01(view, null);
            AbstractC008903d.A00(view, null);
        }
    }
}
