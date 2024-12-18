package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.react.bridge.Callback;

/* renamed from: X.T0f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64139T0f implements InterfaceC65362Tit {
    public final int A00;
    public final Callback A01;
    public final /* synthetic */ SZN A02;

    @Override // X.InterfaceC65362Tit
    public final void ATI() {
        try {
            SZN szn = this.A02;
            C63309ShF c63309ShF = szn.A0L;
            int i = this.A00;
            int[] iArr = szn.A0P;
            synchronized (c63309ShF) {
                View A00 = C63309ShF.A00(c63309ShF, i);
                if (A00 != null) {
                    A00.getLocationOnScreen(iArr);
                    Rect A0U = AbstractC166987dD.A0U();
                    A00.getWindowVisibleDisplayFrame(A0U);
                    iArr[0] = iArr[0] - A0U.left;
                    iArr[1] = iArr[1] - A0U.top;
                    iArr[2] = A00.getWidth();
                    iArr[3] = A00.getHeight();
                } else {
                    String A0c = AnonymousClass001.A0c("No native view for ", " currently exists", i);
                    C14360o3.A0B(A0c, 1);
                    throw new RuntimeException(A0c);
                }
            }
            this.A01.invoke(Float.valueOf(AbstractC58321PtD.A04(iArr, 0)), Float.valueOf(AbstractC58321PtD.A04(iArr, 1)), Float.valueOf(AbstractC58321PtD.A04(iArr, 2)), Float.valueOf(AbstractC58321PtD.A04(iArr, 3)));
        } catch (R5M unused) {
            this.A01.invoke(new Object[0]);
        }
    }

    public C64139T0f(Callback callback, SZN szn, int i) {
        this.A02 = szn;
        this.A00 = i;
        this.A01 = callback;
    }
}
