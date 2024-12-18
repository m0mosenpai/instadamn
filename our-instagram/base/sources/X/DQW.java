package X;

import android.view.animation.AccelerateInterpolator;

/* loaded from: classes5.dex */
public final class DQW extends C0YY implements InterfaceC16660sJ {
    public static final DQW A00 = new DQW();

    public DQW() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C89813zN A002 = AbstractC51432Xq.A00(EnumC76913cd.GLOBAL, "suggestions_visibility");
        InterfaceC79483gv interfaceC79483gv = AbstractC79463gt.A00;
        AbstractC25236BEt.A0i(new AccelerateInterpolator(), A002, interfaceC79483gv, AbstractC25230BEn.A02(A002, interfaceC79483gv), 500);
        return A002;
    }
}
