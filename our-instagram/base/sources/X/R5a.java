package X;

import android.view.View;
import com.facebook.react.bridge.ReactSoftExceptionLogger;

/* loaded from: classes10.dex */
public final class R5a extends T0b {
    public final int A00;
    public final /* synthetic */ SZN A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5a(SZN szn, int i, int i2) {
        super(szn, i);
        this.A01 = szn;
        this.A00 = i2;
    }

    @Override // X.InterfaceC65362Tit
    public final void ATI() {
        try {
            C63309ShF c63309ShF = this.A01.A0L;
            int i = super.A00;
            int i2 = this.A00;
            synchronized (c63309ShF) {
                View A00 = C63309ShF.A00(c63309ShF, i);
                if (A00 != null) {
                    A00.sendAccessibilityEvent(i2);
                } else {
                    throw new RuntimeException(AnonymousClass001.A0O("Could not find view with tag ", i));
                }
            }
        } catch (TXD e) {
            ReactSoftExceptionLogger.logSoftException("UIViewOperationQueue", e);
        }
    }
}
