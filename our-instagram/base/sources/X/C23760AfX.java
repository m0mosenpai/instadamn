package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.AfX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23760AfX implements InterfaceC195318kX {
    public final View A00;
    public final ViewGroup A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final UserSession A05;
    public final A5S A06;

    public final void A00(CameraAREffect cameraAREffect) {
        InterfaceC09390do interfaceC09390do = this.A02;
        ((C195328kY) interfaceC09390do.getValue()).A0E();
        ((C195328kY) interfaceC09390do.getValue()).setHorizontalMargin(0);
        ((C195328kY) interfaceC09390do.getValue()).setBookmarkIconExpanded(cameraAREffect.CcN());
        ((C195328kY) interfaceC09390do.getValue()).setCurrentTitle(new C174587ps(cameraAREffect.A0S, AbstractC167007dF.A0f(this.A00.getContext(), cameraAREffect.A0C, 2131953236), false, cameraAREffect.CcN(), true, true, true));
    }

    @Override // X.InterfaceC195318kX
    public final void D5X() {
    }

    @Override // X.InterfaceC195318kX
    public final void DD0() {
        A5S a5s = this.A06;
        CameraAREffect cameraAREffect = (CameraAREffect) AbstractC191638eL.A03.getValue();
        if (cameraAREffect != null && cameraAREffect.A0D()) {
            ALt aLt = a5s.A00;
            C9U6 c9u6 = aLt.A00;
            Activity activity = aLt.A01;
            String A0j = AbstractC167017dG.A0j();
            UserSession userSession = c9u6.A07;
            String str = cameraAREffect.A0B;
            if (str == null) {
                str = "";
            }
            String str2 = cameraAREffect.A0C;
            if (str2 == null) {
                str2 = "";
            }
            ImageUrl imageUrl = cameraAREffect.A07;
            String str3 = cameraAREffect.A0K;
            String str4 = cameraAREffect.A0M;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = cameraAREffect.A0S;
            C14360o3.A07(str5);
            EffectsPageModel effectsPageModel = new EffectsPageModel(null, imageUrl, null, null, null, null, str, str2, str3, null, str4, str5, "", null, false, false, cameraAREffect.CcN(), true, true, true, true, false);
            EnumC223429tZ enumC223429tZ = EnumC223429tZ.EFFECT_FOOTER;
            Bundle A00 = EffectsPageFragment.A00(enumC223429tZ, null, effectsPageModel, null, null, A0j, null, null, null);
            String moduleName = XkZ.A04.getModuleName();
            AbstractC40465Hwu.A00(activity, A00, EnumC114925Hg.CLIPS, enumC223429tZ, c9u6.A01, EnumC50631MWs.A0I, userSession, C05F.A01, moduleName);
        }
    }

    @Override // X.InterfaceC195318kX
    public final void Di8() {
        int i;
        A5S a5s = this.A06;
        CameraAREffect cameraAREffect = (CameraAREffect) AbstractC191638eL.A03.getValue();
        if (cameraAREffect != null) {
            boolean CcN = cameraAREffect.CcN();
            C9U6 c9u6 = a5s.A00.A00;
            C141796aw A00 = AbstractC141776au.A00(c9u6);
            if (CcN) {
                i = 15;
            } else {
                i = 14;
            }
            AbstractC166987dD.A1Z(new C25023B5e(cameraAREffect, c9u6, null, i), A00);
            ((C195328kY) this.A02.getValue()).setBookmarkIconExpanded(!CcN);
        }
    }

    public C23760AfX(View view, UserSession userSession, A5S a5s) {
        this.A05 = userSession;
        this.A00 = view;
        this.A06 = a5s;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = B8T.A01(this, enumC09460dv, 12);
        InterfaceC09390do A01 = B8T.A01(this, enumC09460dv, 11);
        this.A03 = A01;
        this.A01 = (ViewGroup) AbstractC166997dE.A0R(AbstractC166987dD.A0d(A01), R.id.post_capture_effect_mini_gallery_footer);
        this.A02 = C1XM.A00(new B8T(this, 10));
    }
}
