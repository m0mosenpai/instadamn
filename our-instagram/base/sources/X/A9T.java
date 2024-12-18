package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* loaded from: classes4.dex */
public final class A9T {
    public A78 A00;
    public final InterfaceC58362lv A01;
    public final InterfaceC58362lv A02;
    public final ClipsCreationViewModel A03;
    public final C1828989k A04;

    public A9T(AbstractC59962oe abstractC59962oe, UserSession userSession, A78 a78) {
        this.A00 = a78;
        C208309Jp c208309Jp = new C208309Jp(this, 4);
        this.A02 = c208309Jp;
        C208309Jp c208309Jp2 = new C208309Jp(this, 3);
        this.A01 = c208309Jp2;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        C1828989k c1828989k = (C1828989k) new C52942bb(requireActivity).A00(C1828989k.class);
        this.A04 = c1828989k;
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, requireActivity), requireActivity).A00(ClipsCreationViewModel.class);
        this.A03 = clipsCreationViewModel;
        c1828989k.A06.A06(abstractC59962oe, c208309Jp);
        clipsCreationViewModel.A0K.A06.A06(abstractC59962oe, c208309Jp2);
    }
}
