package X;

import android.os.SystemClock;

/* renamed from: X.2pn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC60642pn implements Runnable {
    public float A00;
    public C3FQ A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ ViewOnTouchListenerC60632pm A04;

    public RunnableC60642pn(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm) {
        this.A04 = viewOnTouchListenerC60632pm;
    }

    public final C3FQ A00() {
        C3FQ c3fq = this.A01;
        if (c3fq != null) {
            return c3fq;
        }
        C14360o3.A0F("view");
        throw C00O.createAndThrow();
    }

    public final boolean getShouldShow() {
        return this.A03;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC72173Lq interfaceC72173Lq;
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A04;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        int i2 = (int) (uptimeMillis - viewOnTouchListenerC60632pm.A05);
        if (A00().BM3() == A00().getCount() - 1 && A00().AnU(A00().AnZ() - 1) != null && A00().AnU(A00().AnZ() - 1).getBottom() == A00().CFj().getBottom()) {
            InterfaceC72173Lq interfaceC72173Lq2 = viewOnTouchListenerC60632pm.A06;
            if (interfaceC72173Lq2 != null) {
                if (interfaceC72173Lq2.Eih(A00())) {
                    this.A00 = viewOnTouchListenerC60632pm.A00;
                    this.A03 = true;
                }
                this.A02 = true;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        int round = Math.round(Math.abs((viewOnTouchListenerC60632pm.A00 - viewOnTouchListenerC60632pm.A01) - this.A00));
        int i3 = (int) (i2 * viewOnTouchListenerC60632pm.A0G);
        if (round < i3 && ((interfaceC72173Lq = viewOnTouchListenerC60632pm.A06) == null || !interfaceC72173Lq.E5B())) {
            i3 = round;
        }
        if (round != 0) {
            viewOnTouchListenerC60632pm.A05 = uptimeMillis;
            viewOnTouchListenerC60632pm.A0H.postDelayed(this, 5L);
        }
        if (this.A03) {
            i3 = -i3;
        }
        if (!this.A02) {
            InterfaceC72173Lq interfaceC72173Lq3 = viewOnTouchListenerC60632pm.A06;
            if (interfaceC72173Lq3 != null) {
                if (!interfaceC72173Lq3.Eif()) {
                    boolean CXX = A00().CXX();
                    C3FQ A00 = A00();
                    if (!CXX) {
                        A00.CFj().scrollBy(0, i3);
                        return;
                    } else {
                        A00.EdZ(A00().B6q(), A00().AnU(0).getTop() - i3);
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        ViewOnTouchListenerC60632pm.A00(viewOnTouchListenerC60632pm, i3);
        A00().CFj().requestLayout();
    }
}
