package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes9.dex */
public final class N51 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FxIgUnifiedACUpsellBottomSheet";
    public IgLinearLayout A00;
    public IgLinearLayout A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgImageView A08;
    public IgImageView A09;
    public RoundedCornerImageView A0A;
    public AbstractC1564470p A0B;
    public IgdsButton A0C;
    public IgdsButton A0D;
    public String A0E;
    public final InterfaceC09390do A0F = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fx_ig_unified_ac_upsell_bottom_sheet";
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N51.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00(IgImageView igImageView, String str, String str2) {
        BSU bsu;
        Integer A04;
        int intValue;
        if (str != null && str2 != null) {
            XNQ A03 = AbstractC65877Tvg.A03(str);
            if (str2.equals("outline")) {
                bsu = BSU.OUTLINE;
            } else {
                bsu = BSU.FILLED;
            }
            if (A03 != null && (A04 = AbstractC65877Tvg.A04(A03, BSV.SIZE_24, bsu)) != null && (intValue = A04.intValue()) != 0) {
                Drawable drawable = requireContext().getDrawable(intValue);
                if (igImageView != null) {
                    igImageView.setImageDrawable(drawable);
                }
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0F);
    }

    public final void A01(InterfaceC58134Ppx interfaceC58134Ppx, Activity activity) {
        InterfaceC19610xo A0e;
        String str;
        C3DN A0r = AbstractC31172DnG.A0r(activity);
        if (A0r != null && ((C3DP) A0r).A0h) {
            Bundle requireArguments = requireArguments();
            requireArguments.putString("bottom_sheet_content_fragment", "unlinked_user_upsell_bottom_sheet");
            AbstractC50524MSc.A0C(activity, requireArguments, AbstractC166987dD.A0o(this.A0F));
            return;
        }
        InterfaceC09390do interfaceC09390do = this.A0F;
        C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do);
        A0g.A0U = new C56758PHa(3, this, interfaceC58134Ppx);
        AbstractC25225BEi.A1Q(A0g, false);
        AbstractC31173DnH.A0w(activity, this, A0g);
        IgdsButton igdsButton = this.A0C;
        if (igdsButton != null) {
            ViewOnClickListenerC55465OkK.A01(igdsButton, 32, interfaceC58134Ppx, this);
        }
        IgdsButton igdsButton2 = this.A0D;
        if (igdsButton2 != null) {
            ViewOnClickListenerC55465OkK.A01(igdsButton2, 33, interfaceC58134Ppx, this);
        }
        if (this.A0E == null) {
            return;
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        String valueOf = String.valueOf(this.A0E);
        C14360o3.A0B(A0o, 0);
        C14360o3.A0B(valueOf, 1);
        C35191Ffj.A00(A0o, "upsell_screen_shown", valueOf);
        if (C14360o3.A0K(this.A0E, "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL") && AbstractC53981Nts.A00(AbstractC166987dD.A0o(interfaceC09390do)).booleanValue()) {
            new MWX(AbstractC166987dD.A0r(interfaceC09390do)).A01(String.valueOf(this.A0E));
            return;
        }
        MWX mwx = new MWX(AbstractC166987dD.A0r(interfaceC09390do));
        String valueOf2 = String.valueOf(this.A0E);
        C14360o3.A0B(valueOf2, 0);
        int hashCode = valueOf2.hashCode();
        if (hashCode != -1574224499) {
            if (hashCode != -773734548) {
                if (hashCode != 1949671265 || !valueOf2.equals("IG_LOGOUT_UPSELL")) {
                    return;
                }
                A0e = AbstractC31176DnK.A0e(mwx.A00);
                str = "fx_cal_right_before_logout_sso_upsell_seen";
            } else {
                if (!valueOf2.equals("IG_PROFILE_PHOTO_CHANGE_CHAINING")) {
                    return;
                }
                A0e = AbstractC31176DnK.A0e(mwx.A00);
                str = "fx_cal_profile_photo_chaining_ac_upsell_seen";
            }
        } else {
            if (!valueOf2.equals("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
                return;
            }
            A0e = AbstractC31176DnK.A0e(mwx.A00);
            str = "fx_cal_ig_fb_feed_crosspost_after_share_ac_upsell_seen";
        }
        A0e.E77(str, true);
        A0e.apply();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1564470p A00;
        int A02 = C0f9.A02(1228644605);
        C14360o3.A0B(layoutInflater, 0);
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A0E = string;
        if (string != null) {
            UserSession A0r = AbstractC166987dD.A0r(this.A0F);
            Context requireContext = requireContext();
            String valueOf = String.valueOf(this.A0E);
            AbstractC167007dF.A1D(A0r, 0, valueOf);
            switch (valueOf.hashCode()) {
                case -1574224499:
                    if (valueOf.equals("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
                        A00 = AbstractC53978Ntp.A00(AbstractC166987dD.A0O(requireContext), A0r, valueOf);
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unknown entry point '", valueOf, '\''));
                case -789610632:
                    if (valueOf.equals("IG_FB_STORY_CROSS_POSTING_AFTER_SHARE_UPSELL")) {
                        A00 = AbstractC53979Ntq.A00(AbstractC166987dD.A0O(requireContext), A0r, valueOf);
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unknown entry point '", valueOf, '\''));
                case -614788096:
                    if (valueOf.equals("IG_DEFAULT")) {
                        A00 = (NLx) A0r.A01(NLx.class, new C57262Pbk(AbstractC166987dD.A0O(requireContext), A0r, valueOf, 17));
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unknown entry point '", valueOf, '\''));
                case 1949671265:
                    if (valueOf.equals("IG_LOGOUT_UPSELL")) {
                        A00 = C1564370n.A00(A0r, AbstractC166987dD.A0O(requireContext), valueOf);
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unknown entry point '", valueOf, '\''));
                default:
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unknown entry point '", valueOf, '\''));
            }
            this.A0B = A00;
        }
        View inflate = layoutInflater.inflate(R.layout.fx_ig_unified_ac_upsell_bottom_sheet, viewGroup, false);
        C0f9.A09(1026237514, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(612376717);
        super.onDestroyView();
        this.A0C = null;
        this.A0D = null;
        this.A06 = null;
        this.A02 = null;
        this.A05 = null;
        this.A00 = null;
        this.A01 = null;
        this.A08 = null;
        this.A09 = null;
        this.A03 = null;
        this.A04 = null;
        C0f9.A09(-1060500529, A02);
    }
}
