package X;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.neko.playables.activity.PlayableAdWebView;
import com.instagram.neko.playables.activity.PlayableProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class Rb4 extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PlayableAdFragment";
    public C18920wW A00;
    public PlayableAdWebView A01;
    public PlayableProgressBar A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public String A07;
    public final String A08 = "https://play.google.com/store/apps";
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Ehk(this.A07);
        interfaceC56362iU.EkG(false);
        interfaceC56362iU.EkF(true);
        interfaceC56362iU.EPD(new ColorDrawable(AbstractC53242c7.A0F(requireContext(), R.attr.igds_color_elevated_background)));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "playable_ad";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X.0bW, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        String A01 = AbstractC153636vY.A01(requireArguments, "media_id");
        InterfaceC09390do interfaceC09390do = this.A09;
        C79623hD c79623hD = new C79623hD(null, (UserSession) interfaceC09390do.getValue(), AbstractC25229BEm.A0h((UserSession) interfaceC09390do.getValue(), A01), this);
        this.A00 = AbstractC12220kQ.A01(this, AbstractC166987dD.A0o(interfaceC09390do));
        this.A04 = AbstractC166997dE.A0o();
        this.A03 = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A05 = c79623hD.AWz();
        C71313Hs.A00(AbstractC166987dD.A0o(interfaceC09390do)).A0A(view, c79623hD);
        ViewOnClickListenerC63507Soa.A00(AbstractC166997dE.A0S(view, R.id.playable_native_cta_button), 11, this);
        this.A02 = (PlayableProgressBar) view.requireViewById(R.id.playable_progress_bar);
        String A012 = AbstractC153636vY.A01(requireArguments, MSV.A00(1493));
        this.A01 = (PlayableAdWebView) view.requireViewById(R.id.playable_web_view);
        this.A07 = requireArguments.getString("playable_title");
        C14360o3.A0B(A012, 0);
        PlayableAdWebView playableAdWebView = this.A01;
        if (playableAdWebView != null) {
            playableAdWebView.setBackgroundColor(0);
            C64157T1i c64157T1i = new C64157T1i(this);
            PlayableAdWebView playableAdWebView2 = this.A01;
            if (playableAdWebView2 != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                ArrayList A1E2 = AbstractC166987dD.A1E();
                ArrayList A17 = AbstractC25225BEi.A17(4);
                List asList = Arrays.asList("http", "https");
                if (!asList.isEmpty()) {
                    A17.add(new R7S(asList));
                    A17.add(new R7T(new String[]{"fbsbx.com"}));
                    AbstractC08800ci A00 = S1J.A00(A17);
                    C14360o3.A07(A00);
                    A1E2.add(A00);
                    A1E.add(new InterfaceC65234TgQ[]{c64157T1i}[0]);
                    playableAdWebView2.A01 = new C62732SNx(new Object(), new S1I(), A1E, A1E2);
                    C62449SCc c62449SCc = new C62449SCc(this);
                    C62449SCc c62449SCc2 = new C62449SCc(this);
                    R7O r7o = new R7O(this);
                    PlayableAdWebView playableAdWebView3 = this.A01;
                    if (playableAdWebView3 != null) {
                        playableAdWebView3.A02(r7o);
                        SQ4 sq4 = new SQ4(c62449SCc);
                        PlayableAdWebView playableAdWebView4 = this.A01;
                        if (playableAdWebView4 != null) {
                            playableAdWebView4.addJavascriptInterface(sq4, "FbPlayableAd");
                            SQ4 sq42 = new SQ4(c62449SCc2);
                            PlayableAdWebView playableAdWebView5 = this.A01;
                            if (playableAdWebView5 != null) {
                                playableAdWebView5.addJavascriptInterface(sq42, "SecureFbPlayableAd");
                                R7J r7j = new R7J(this);
                                PlayableAdWebView playableAdWebView6 = this.A01;
                                if (playableAdWebView6 != null) {
                                    playableAdWebView6.A01(r7j);
                                    PlayableAdWebView playableAdWebView7 = this.A01;
                                    if (playableAdWebView7 != null) {
                                        ViewOnTouchListenerC63511Soe.A00(playableAdWebView7, 9, this);
                                        PlayableAdWebView playableAdWebView8 = this.A01;
                                        if (playableAdWebView8 != null) {
                                            playableAdWebView8.getSettings().setLoadWithOverviewMode(true);
                                            PlayableAdWebView playableAdWebView9 = this.A01;
                                            if (playableAdWebView9 != null) {
                                                playableAdWebView9.getSettings().setUseWideViewPort(true);
                                                PlayableAdWebView playableAdWebView10 = this.A01;
                                                if (playableAdWebView10 != null) {
                                                    playableAdWebView10.setVisibility(0);
                                                    PlayableAdWebView playableAdWebView11 = this.A01;
                                                    if (playableAdWebView11 != null) {
                                                        playableAdWebView11.loadUrl(A012);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    throw AbstractC166987dD.A12("Cannot set 0 schemes");
                }
            }
        }
        C14360o3.A0F("playableAdWebView");
        throw C00O.createAndThrow();
    }

    public final void A00() {
        C71313Hs A00 = C71313Hs.A00(AbstractC166987dD.A0o(this.A09));
        View view = this.mView;
        if (view != null) {
            A00.A07(view, EnumC71343Hv.A0H, new String[0], 1);
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("playable_result_key", "playable_result_open_cta");
            getParentFragmentManager().A0y("playable_request_key", A0b);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1366201587);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.playable_ad_fragment, viewGroup, false);
        C0f9.A09(-933157717, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1617767161);
        super.onDestroy();
        PlayableAdWebView playableAdWebView = this.A01;
        if (playableAdWebView == null) {
            C14360o3.A0F("playableAdWebView");
            throw C00O.createAndThrow();
        }
        playableAdWebView.destroy();
        C0f9.A09(1327148665, A02);
    }
}
