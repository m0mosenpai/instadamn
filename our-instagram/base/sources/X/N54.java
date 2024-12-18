package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes9.dex */
public final class N54 extends AbstractC59962oe {
    public ImageView A00;
    public ImageView A01;
    public C22879A6z A02;
    public boolean A03;
    public boolean A04;
    public C1NJ A05;
    public final InterfaceC09390do A06 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43205J8c(this, 12));
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public static final String __redex_internal_original_name = "QuickCaptureAddToStoryDualDestinationFragment";
    public static final CallerContext A08 = CallerContext.A01(__redex_internal_original_name);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quick_capture_add_to_story_dual_destination_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31173DnH.A0I(view, R.id.my_story_avatar);
        ((C64P) AbstractC166997dE.A0R(view, R.id.action_button)).setPrimaryActionOnClickListener(new ViewOnClickListenerC23249ASk(this, 61));
        AbstractC010103p.A0G(AbstractC166997dE.A0S(view, R.id.your_instagram_story_row), view.getContext().getString(2131961193));
        View A0R = AbstractC166997dE.A0R(view, R.id.your_facebook_story_row);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.add_to_story_dual_destination_share_sheet_fb_story_row_subtitle);
        this.A01 = AbstractC31173DnH.A0I(view, R.id.share_to_fb_check);
        A01(this);
        MSX.A12(A0R, 7);
        boolean z = this.A04;
        Context context = A0R.getContext();
        int i = 2131961195;
        if (z) {
            i = 2131961194;
        }
        AbstractC010103p.A0G(A0R, context.getString(i));
        if (this.A03) {
            C131995xZ A00 = ((C196058lv) this.A06.getValue()).A00(A08);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(view, R.id.fb_profile_avatar);
            View A0R2 = AbstractC166997dE.A0R(view, R.id.fb_icon);
            TextView A0N2 = AbstractC167007dF.A0N(view, R.id.add_to_story_dual_destination_share_sheet_fb_story_row_title);
            TextView A0N3 = AbstractC167007dF.A0N(view, R.id.add_to_story_dual_destination_share_sheet_fb_story_row_subtitle);
            String str = A00.A04;
            String str2 = A00.A05;
            InterfaceC09390do interfaceC09390do = this.A07;
            String A002 = AbstractC200008t4.A00(getContext(), AbstractC166987dD.A0r(interfaceC09390do), A00);
            boolean z2 = true;
            if (A002 == null || A002.length() == 0) {
                AbstractC50522MSa.A1I(C82G.A0n, EnumC201098ur.SUPPRESS, C82H.A08, AbstractC166987dD.A0r(interfaceC09390do), "empty_audience");
            }
            if (str != null && str.length() != 0) {
                String str3 = null;
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36329741082444296L)) {
                    String username = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do).getUsername();
                    if (username.length() != 0) {
                        AbstractC167007dF.A0N(view, R.id.add_to_story_dual_destination_share_sheet_ig_story_row_title).setText(username);
                    }
                    A0N2.setText(str);
                    Context context2 = getContext();
                    if (A002 != null) {
                        if (context2 != null) {
                            str3 = AbstractC167007dF.A0f(context2, A002, 2131952400);
                        }
                    } else if (context2 != null) {
                        str3 = context2.getString(2131955791);
                    }
                    A0N3.setText(str3);
                } else {
                    if (A002 != null) {
                        Context context3 = getContext();
                        if (context3 != null) {
                            str = AbstractC31174DnI.A0t(context3, str, A002, 2131952402);
                        } else {
                            str = null;
                        }
                    }
                    A0N3.setText(str);
                }
                A0N3.setVisibility(0);
            } else {
                AbstractC50522MSa.A1I(C82G.A0n, EnumC201098ur.SUPPRESS, C82H.A08, AbstractC166987dD.A0r(interfaceC09390do), "empty_name");
            }
            if (str2.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                A0R2.setVisibility(8);
                AbstractC76713cJ.A00(getContext(), this, gradientSpinnerAvatarView, str2);
            } else {
                gradientSpinnerAvatarView.setVisibility(8);
            }
            C0fQ.A00(new ViewOnClickListenerC55468OkN(15, A0R, this), A0R);
            A00(MU0.VIEW, this, this.A04);
        } else {
            A0R.setAlpha(0.5f);
            A0N.setVisibility(0);
            A0N.setText(2131952403);
            A00(MU0.UNAVAILABLE, this, false);
            AbstractC166997dE.A0S(view, R.id.fb_profile_avatar).setVisibility(8);
        }
        this.A05 = new C23596Acq(this, 7);
        C1OG A0J = C25821No.A00().A0J(AbstractC31176DnK.A0g(C17060sy.A01, this.A07).Bhu(), null);
        A0J.A02(this.A05);
        A0J.A01();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.MnJ] */
    public static final void A00(MU0 mu0, N54 n54, boolean z) {
        ?? c0Zx = new C0Zx();
        c0Zx.A03("is_xpost_enabled", Boolean.valueOf(z));
        UserSession A0r = AbstractC166987dD.A0r(n54.A07);
        AbstractC50568MTz.A00(mu0, MU1.STORY, C82G.A0p, c0Zx, A0r);
    }

    public static final void A01(N54 n54) {
        ImageView imageView;
        Context requireContext;
        int i;
        if (!n54.A03) {
            ImageView imageView2 = n54.A01;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
        } else {
            boolean z = n54.A04;
            ImageView imageView3 = n54.A01;
            if (z) {
                if (imageView3 != null) {
                    AbstractC166997dE.A19(n54.requireContext(), imageView3, R.drawable.instagram_circle_check_pano_filled_24);
                    imageView = n54.A01;
                    if (imageView != null) {
                        requireContext = n54.requireContext();
                        i = R.color.badge_color;
                        AbstractC31173DnH.A11(requireContext, imageView, i);
                        return;
                    }
                }
            } else if (imageView3 != null) {
                AbstractC166997dE.A19(n54.requireContext(), imageView3, R.drawable.instagram_circle_outline_24);
                imageView = n54.A01;
                if (imageView != null) {
                    requireContext = n54.requireContext();
                    i = R.color.grey_2;
                    AbstractC31173DnH.A11(requireContext, imageView, i);
                    return;
                }
            }
        }
        C14360o3.A0F("shareToFacebookCheck");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-973631129);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Boolean bool = null;
        if (bundle2 != null) {
            bool = AbstractC31174DnI.A0n(bundle2, "is_sharing_to_fb");
        }
        if (bool != null) {
            this.A04 = bool.booleanValue();
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                boolean z = bundle3.getBoolean("can_share_to_fb");
                if (Boolean.valueOf(z) != null) {
                    this.A03 = z;
                    C0f9.A09(133186714, A02);
                    return;
                }
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1527373469;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 980792819;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1996233163);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_add_to_story_dual_destination, viewGroup, false);
        C0f9.A09(-217746698, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-860741814);
        super.onDestroy();
        this.A02 = null;
        C0f9.A09(-932907829, A02);
    }
}
