package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;

/* renamed from: X.8Sb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187338Sb {
    public C189478aR A00;
    public final Fragment A01;
    public final UserSession A02;

    public final void A00(EnumC50631MWs enumC50631MWs, TargetViewSizeProvider targetViewSizeProvider, InterfaceC1119153d interfaceC1119153d, Integer num, boolean z) {
        UserSession userSession = this.A02;
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_TARGET_VIEW_SIZE_PROVIDER", targetViewSizeProvider);
        bundle.putSerializable("ARG_SURFACE", enumC50631MWs);
        if (num != null) {
            bundle.putInt(AbstractC43591JPw.A00(530), num.intValue());
        }
        AbstractC03240Dh.A00(bundle, userSession);
        GiphyClipsBrowserFragment giphyClipsBrowserFragment = new GiphyClipsBrowserFragment();
        giphyClipsBrowserFragment.setArguments(bundle);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = true;
        c189448aO.A03 = 0.9f;
        Fragment fragment = this.A01;
        c189448aO.A06 = fragment.requireContext().getColor(AbstractC53242c7.A0H(fragment.requireContext(), R.attr.igds_color_elevated_background_dark));
        c189448aO.A1O = false;
        c189448aO.A0u = !z;
        if (interfaceC1119153d != null) {
            c189448aO.A0U = interfaceC1119153d;
        }
        C189478aR A00 = c189448aO.A00();
        this.A00 = A00;
        A00.A02(fragment.requireActivity(), giphyClipsBrowserFragment);
    }

    public C187338Sb(Fragment fragment, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = fragment;
    }
}
