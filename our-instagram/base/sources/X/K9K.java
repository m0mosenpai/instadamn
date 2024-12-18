package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.Collection;

/* loaded from: classes8.dex */
public final class K9K extends AbstractC45514KDf {
    public static final C46615Kjs A03 = new Object();
    public static final String __redex_internal_original_name = "GreenscreenCameraRollTabFragment";
    public Folder A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "GREEN_SCREEN_CAMERA_ROLL_TAB_FRAGMENT";
    }

    @Override // X.AbstractC45514KDf, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C44470Jlc) this.A02.getValue()).A00.A07();
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCQ(viewLifecycleOwner, c07s, this, null, 16), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new KI5(new C47246KuJ(this), (C8SF) this.A01.getValue(), AbstractC167027dH.A01(super.A01)));
    }

    public K9K() {
        C50250MHf A01 = C50250MHf.A01(this, 41);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C50250MHf.A01(C50250MHf.A01(this, 37), 38));
        this.A02 = AbstractC25225BEi.A0a(C50250MHf.A01(A00, 39), A01, new C29897DGl(39, null, A00), AbstractC25225BEi.A1D(C44470Jlc.class));
        this.A01 = C50250MHf.A00(this, 40);
        this.A00 = new Folder("Gallery", null, -1, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1544615319);
        super.onPause();
        ((C44470Jlc) this.A02.getValue()).A00.A08();
        C0f9.A09(1927366979, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-528725387);
        super.onResume();
        ((C44470Jlc) this.A02.getValue()).A00.A09();
        C0f9.A09(-156829926, A02);
    }
}
