package X;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;

/* loaded from: classes10.dex */
public final class R5d extends T0b {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final /* synthetic */ SZN A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5d(SZN szn, int i, int i2, boolean z, boolean z2) {
        super(szn, i);
        this.A03 = szn;
        this.A00 = i2;
        this.A02 = z;
        this.A01 = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65362Tit
    public final void ATI() {
        T0X t0x;
        ViewParent parent;
        boolean z = this.A02;
        C63309ShF c63309ShF = this.A03.A0L;
        if (!z) {
            int i = super.A00;
            int i2 = this.A00;
            boolean z2 = this.A01;
            synchronized (c63309ShF) {
                if (!z2) {
                    t0x = c63309ShF.A05;
                    parent = null;
                } else {
                    View A00 = C63309ShF.A00(c63309ShF, i);
                    if (i2 != i && (A00 instanceof ViewParent)) {
                        t0x = c63309ShF.A05;
                        parent = (ViewParent) A00;
                    } else {
                        if (c63309ShF.A04.get(i)) {
                            String A0c = AnonymousClass001.A0c("Cannot block native responder on ", " that is a root view", i);
                            C14360o3.A0B(A0c, 0);
                            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new RuntimeException(A0c));
                        }
                        t0x = c63309ShF.A05;
                        parent = A00.getParent();
                    }
                }
                t0x.A01 = i2;
                ViewParent viewParent = t0x.A00;
                if (viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(false);
                }
                t0x.A00 = null;
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    t0x.A00 = parent;
                }
            }
        }
        synchronized (c63309ShF) {
            T0X t0x2 = c63309ShF.A05;
            t0x2.A01 = -1;
            ViewParent viewParent2 = t0x2.A00;
            if (viewParent2 != null) {
                viewParent2.requestDisallowInterceptTouchEvent(false);
            }
            t0x2.A00 = null;
        }
    }
}
