package X;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* loaded from: classes8.dex */
public final class LOU implements View.OnClickListener {
    public final /* synthetic */ C143316dW A00;

    public LOU(C143316dW c143316dW) {
        this.A00 = c143316dW;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IllegalStateException A14;
        int i;
        String str;
        String str2;
        DirectCameraViewModel A01;
        int A05 = C0f9.A05(-1967681946);
        C143316dW c143316dW = this.A00;
        ViewOnKeyListenerC148356m5 viewOnKeyListenerC148356m5 = c143316dW.A0o;
        C41551w4 c41551w4 = c143316dW.A08;
        if (c41551w4 != null) {
            C41181vS c41181vS = c143316dW.A07;
            if (c41181vS != null) {
                if (c143316dW.A0M) {
                    str = "story_remix_reply";
                } else if (c143316dW.A0O) {
                    str = "story_selfie_reply";
                } else {
                    str = "story_camera_reply";
                }
                C14360o3.A0A(view);
                RectF A0G = AbstractC13880nE.A0G(view);
                FragmentActivity activity = viewOnKeyListenerC148356m5.A02.getActivity();
                if (activity != null) {
                    ReelViewerFragment reelViewerFragment = (ReelViewerFragment) viewOnKeyListenerC148356m5.A07;
                    InterfaceC147266kB interfaceC147266kB = reelViewerFragment.mViewPager;
                    if (interfaceC147266kB != null && interfaceC147266kB.isIdle()) {
                        C38321qM c38321qM = c41181vS.A0b;
                        if (c38321qM != null && "story_remix_reply".equals(str)) {
                            C1DW.A00(viewOnKeyListenerC148356m5.A03).A03(c38321qM);
                        }
                        if (c41551w4.A0H.A0W instanceof C6ZI) {
                            A01 = C75653aW.A00(c41181vS, str);
                        } else {
                            A01 = C75653aW.A01(c41551w4, str);
                        }
                        InterfaceC1119353f interfaceC1119353f = viewOnKeyListenerC148356m5.A04;
                        A38.A00(activity, A0G, C22P.A53, viewOnKeyListenerC148356m5.A03, interfaceC1119353f, A01, c41551w4, null, str, r5.BSi(), reelViewerFragment.A2Y);
                    }
                }
                if (c143316dW.A0M) {
                    UserSession userSession = c143316dW.A0e;
                    InterfaceC11380iw interfaceC11380iw = c143316dW.A0d;
                    C41181vS c41181vS2 = c143316dW.A07;
                    if (c41181vS2 != null) {
                        str2 = c41181vS2.A0j;
                    } else {
                        str2 = null;
                    }
                    AbstractC43821JZj.A00(interfaceC11380iw, userSession, null, "entrypoint", "tap", AbstractC111324zv.A00(534), str2, null);
                }
                C0f9.A0C(-1050596828, A05);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1708781886;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -2006603295;
        }
        C0f9.A0C(i, A05);
        throw A14;
    }
}
