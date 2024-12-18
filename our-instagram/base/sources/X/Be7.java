package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes5.dex */
public final class Be7 extends Be8 implements InterfaceC31102Dlk {
    public final ViewGroup A00;
    public final AbstractC28368CfU A01;

    public Be7(View view, ViewGroup viewGroup, AbstractC28368CfU abstractC28368CfU, C28165CbC c28165CbC, Integer num) {
        super(viewGroup, abstractC28368CfU, c28165CbC, num == null ? C05F.A00 : num, view);
        this.A01 = abstractC28368CfU;
        this.A00 = viewGroup;
    }

    @Override // X.InterfaceC31102Dlk
    public final C51758Mth BMs() {
        boolean A1Z;
        Object obj = this.A02;
        if (C14360o3.A0K(obj.getClass(), View.class)) {
            View view = (View) obj;
            if (view.getBackground() == null && view.getForeground() == null) {
                A1Z = false;
                View view2 = (View) obj;
                C14360o3.A0B(view2, 0);
                int[] iArr = AbstractC28368CfU.A0B;
                view2.getLocationOnScreen(iArr);
                Rect A0C = AbstractC25236BEt.A0C(view2);
                A0C.offsetTo(iArr[0], iArr[1]);
                return new C51758Mth(1, A0C, A1Z);
            }
        }
        A1Z = AbstractC167007dF.A1Z(this.A07);
        View view22 = (View) obj;
        C14360o3.A0B(view22, 0);
        int[] iArr2 = AbstractC28368CfU.A0B;
        view22.getLocationOnScreen(iArr2);
        Rect A0C2 = AbstractC25236BEt.A0C(view22);
        A0C2.offsetTo(iArr2[0], iArr2[1]);
        return new C51758Mth(1, A0C2, A1Z);
    }
}
