package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class G84 implements InterfaceC37126GXn {
    public final /* synthetic */ C31727DwY A00;

    public G84(C31727DwY c31727DwY) {
        this.A00 = c31727DwY;
    }

    @Override // X.InterfaceC37126GXn
    public final void Dhi(View view, int i) {
        C14360o3.A0B(view, 1);
        C31727DwY c31727DwY = this.A00;
        c31727DwY.A00 = i;
        c31727DwY.A01 = view;
        c31727DwY.A02.A0T();
        C32245EIe c32245EIe = c31727DwY.A04;
        ((C50676MYu) c32245EIe.A05.A01.get(c31727DwY.A00)).A0A.onClick(view);
    }
}
