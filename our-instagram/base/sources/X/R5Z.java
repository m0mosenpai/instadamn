package X;

import android.util.SparseBooleanArray;
import android.view.View;
import com.facebook.react.bridge.ReactSoftExceptionLogger;

/* loaded from: classes10.dex */
public final class R5Z extends T0b {
    public final /* synthetic */ SZN A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5Z(SZN szn, int i) {
        super(szn, i);
        this.A00 = szn;
    }

    @Override // X.InterfaceC65362Tit
    public final void ATI() {
        C63309ShF c63309ShF = this.A00.A0L;
        int i = super.A00;
        synchronized (c63309ShF) {
            SparseBooleanArray sparseBooleanArray = c63309ShF.A04;
            if (!sparseBooleanArray.get(i)) {
                String A0c = AnonymousClass001.A0c("View with tag ", " is not registered as a root view", i);
                C14360o3.A0B(A0c, 0);
                ReactSoftExceptionLogger.logSoftException("SoftAssertions", new RuntimeException(A0c));
            }
            View A00 = C63309ShF.A00(c63309ShF, i);
            c63309ShF.A08(A00);
            sparseBooleanArray.delete(i);
            if (A00 != null) {
                A00.setId(-1);
            }
        }
    }
}
