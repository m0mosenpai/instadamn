package X;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.Ka2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46049Ka2 extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "DirectPendingFilterCustomizationFragment";
    public LEQ A00;
    public C47440KxV A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "pending_filter_customization";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new C35246Fgf(getString(2131960045)));
        if (this.A00 != null) {
            for (EnumC46248KdP enumC46248KdP : LEQ.A02) {
                Integer num = enumC46248KdP.A01;
                if (num != null) {
                    String string = getString(num.intValue());
                    LEQ leq = this.A00;
                    if (leq != null) {
                        A1E.add(new GHZ(new LRF(4, this, enumC46248KdP), string, leq.A01.contains(enumC46248KdP)));
                    }
                }
            }
            setItems(A1E);
            return;
        }
        C14360o3.A0F("controller");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-911669715);
        super.onCreate(bundle);
        AbstractC12990ll A0M = AbstractC31178DnM.A0M(this.A02);
        this.A00 = (LEQ) A0M.A01(LEQ.class, new C50159MDm(A0M, 17));
        C0f9.A09(1293575009, A02);
    }
}
