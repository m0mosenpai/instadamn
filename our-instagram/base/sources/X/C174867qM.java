package X;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;

/* renamed from: X.7qM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174867qM {
    public WeakReference A00;
    public AbstractC2039690j A01;

    public final synchronized void A00(AbstractC2039690j abstractC2039690j) {
        this.A01 = abstractC2039690j;
        if (abstractC2039690j != null) {
            abstractC2039690j.A02(this.A00);
        }
    }

    public final void A01(WeakReference weakReference) {
        boolean z = false;
        if (weakReference != this.A00) {
            this.A00 = weakReference;
            z = true;
        }
        synchronized (this) {
            if (z) {
                AbstractC2039690j abstractC2039690j = this.A01;
                if (abstractC2039690j != null) {
                    abstractC2039690j.A02(this.A00);
                }
            }
        }
    }

    public final synchronized boolean A02(MotionEvent motionEvent) {
        boolean A03;
        AbstractC2039690j abstractC2039690j = this.A01;
        if (abstractC2039690j != null) {
            A03 = abstractC2039690j.A03(motionEvent, 0);
        } else {
            A03 = false;
        }
        return A03;
    }
}
