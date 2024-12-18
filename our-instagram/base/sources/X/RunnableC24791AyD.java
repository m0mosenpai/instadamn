package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.AyD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24791AyD implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ KCD A02;

    public RunnableC24791AyD(Bundle bundle, View view, KCD kcd) {
        this.A02 = kcd;
        this.A01 = view;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        KCD kcd = this.A02;
        if (kcd.mView != null) {
            View view = this.A01;
            Bundle bundle2 = this.A00;
            C81J A01 = C81J.A01();
            C23766Afd c23766Afd = new C23766Afd(kcd, 2);
            c23766Afd.getClass();
            A01.A0l = c23766Afd;
            InterfaceC09390do interfaceC09390do = kcd.A0G;
            C81J.A0L(A01, interfaceC09390do);
            C81J.A03(kcd.getRootActivity(), kcd, A01);
            C81P c81p = C81O.A02;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            boolean z = true;
            C81T c81t = C81T.A00;
            C81J.A0C(A0r, c81p, c81t, A01);
            A01.A3h = true;
            A01.A0R = kcd.volumeKeyPressController;
            C81I c81i = kcd.A01;
            c81i.getClass();
            A01.A0t = c81i;
            C14360o3.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.getClass();
            A01.A09 = viewGroup;
            A01.A0B = C22P.A2T;
            A01.A0O = kcd;
            A01.A0V = C82R.A00(c81t, new C81W[0]);
            A01.A3y = true;
            A01.A3F = false;
            A01.A28 = C05F.A01;
            DirectCameraViewModel directCameraViewModel = kcd.A02;
            if (directCameraViewModel == null) {
                C14360o3.A0F("directCameraViewModel");
                throw C00O.createAndThrow();
            }
            A01.A1I = directCameraViewModel;
            A01.A3s = true;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            C14360o3.A0B(A0o, 0);
            C06090Tz c06090Tz = C06090Tz.A05;
            A01.A32 = C18U.A06(c06090Tz, A0o, 36323560625679734L);
            A01.A3t = true;
            A01.A03 = 7;
            A01.A47 = false;
            A01.A2P = kcd.A06;
            A01.A17 = new C81L(2131975357, 2131975358, false, false, true, true);
            A01.A3J = true;
            A01.A3Q = false;
            if (bundle2 == null || !bundle2.getBoolean("SAVE_INSTANCE_KEY_WAS_SHOWING_MG")) {
                z = false;
            }
            A01.A40 = z;
            AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do);
            C14360o3.A0B(A0o2, 0);
            A01.A48 = C18U.A06(c06090Tz, A0o2, 36323560624631144L);
            A01.A0e = new C172007lV(kcd.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), new C23736Af9(kcd), "stories_precapture_camera");
            kcd.A00 = new C81Y(A01);
        }
        C81Y c81y = kcd.A00;
        if (c81y != null && (bundle = this.A00) != null) {
            c81y.A00.A07 = bundle.getBoolean("SAVE_INSTANCE_KEY_DID_USER_CLOSE_FEED_GALLERY_PICKER");
        }
    }
}
