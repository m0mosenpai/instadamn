package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class K9J extends AbstractC45514KDf {
    public static final C46616Kjt A01 = new Object();
    public static final String __redex_internal_original_name = "GreenscreenSceneTabFragment";
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "GREEN_SCREEN_SCENE_TAB_FRAGMENT";
    }

    @Override // X.AbstractC45514KDf, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Map map = (Map) ((C44493Jlz) this.A00.getValue()).A03.getValue();
        ArrayList A17 = AbstractC25225BEi.A17(map.size());
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            int hashCode = A1K.hashCode();
            A17.add(new LZX((C3PR) A1K.getValue(), AbstractC31172DnG.A17(A1K), hashCode));
        }
        A0B(A17);
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new C45631KHu(new C47247KuK(this), AbstractC167027dH.A01(this.A01)));
    }

    public K9J() {
        C50250MHf A012 = C50250MHf.A01(this, 49);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C50250MHf.A01(C50250MHf.A01(this, 46), 47));
        this.A00 = AbstractC25225BEi.A0a(C50250MHf.A01(A00, 48), A012, new C29897DGl(41, null, A00), AbstractC25225BEi.A1D(C44493Jlz.class));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1119983081);
        super.onResume();
        C44493Jlz c44493Jlz = (C44493Jlz) this.A00.getValue();
        Iterator A15 = AbstractC166997dE.A15(AbstractC43592JPx.A15(c44493Jlz.A02));
        while (A15.hasNext()) {
            ((Drawable) AbstractC31176DnK.A0j(A15)).setVisible(true, false);
        }
        Iterator A152 = AbstractC166997dE.A15(AbstractC43592JPx.A15(c44493Jlz.A01));
        while (A152.hasNext()) {
            ((Drawable) AbstractC31176DnK.A0j(A152)).setVisible(true, false);
        }
        C0f9.A09(-1258751402, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1009349980);
        super.onStop();
        C44493Jlz c44493Jlz = (C44493Jlz) this.A00.getValue();
        Iterator A15 = AbstractC166997dE.A15(AbstractC43592JPx.A15(c44493Jlz.A02));
        while (A15.hasNext()) {
            ((Drawable) AbstractC31176DnK.A0j(A15)).setVisible(false, false);
        }
        Iterator A152 = AbstractC166997dE.A15(AbstractC43592JPx.A15(c44493Jlz.A01));
        while (A152.hasNext()) {
            ((Drawable) AbstractC31176DnK.A0j(A152)).setVisible(false, false);
        }
        C0f9.A09(-375130474, A02);
    }
}
