package X;

import android.os.Bundle;
import android.view.View;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public final class VAL extends AbstractC67878V0j {
    public static final String __redex_internal_original_name = "ClipsSerpGridFragment";
    public C62832tM A01;
    public final InterfaceC09390do A04 = C1XM.A00(new X2z(this, 4));
    public final XB9 A02 = C71016WmX.A00;
    public EnumC38183Gqo A00 = EnumC38183Gqo.A0A;
    public final java.util.Set A03 = new LinkedHashSet();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "serp_reels_subtab";
    }

    @Override // X.AbstractC67878V0j, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), A07().A05, new JEZ(this, 10), 4);
    }

    @Override // X.AbstractC67878V0j, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-143426657);
        super.onCreate(bundle);
        this.A01 = AbstractC62822tL.A00(getSession());
        C0f9.A09(-493913553, A02);
    }

    @Override // X.AbstractC67878V0j, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(997099355);
        super.onDestroy();
        C62832tM c62832tM = this.A01;
        if (c62832tM == null) {
            C14360o3.A0F("clipsGridItemsStore");
            throw C00O.createAndThrow();
        }
        c62832tM.A07(A06().A04());
        C0f9.A09(-901122554, A02);
    }
}
