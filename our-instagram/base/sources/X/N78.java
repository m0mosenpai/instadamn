package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class N78 extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "NewUserActivationLoginFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "new_user_activation_login";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        Integer num;
        C3DN A0l = AbstractC43593JPy.A0l(this, C3DN.A00);
        if (A0l != null) {
            num = ((C3DP) A0l).A0K;
        } else {
            num = null;
        }
        if (num != C05F.A00) {
            InterfaceC09390do interfaceC09390do = this.A00;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            String A0B = AbstractC50524MSc.A0B(interfaceC09390do);
            EnumC53354Nj4 enumC53354Nj4 = EnumC53354Nj4.PROFILE_LOGIN;
            C55192Ody.A01(EnumC53337Nin.A02, EnumC53361NjC.EXIT, null, EnumC53344Niu.DISMISS, null, null, enumC53354Nj4, A0r, A0B);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Drawable drawable;
        Bitmap bitmap;
        int A02 = C0f9.A02(-1625697316);
        C14360o3.A0B(layoutInflater, 0);
        InterfaceC09390do interfaceC09390do = this.A00;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String A0B = AbstractC50524MSc.A0B(interfaceC09390do);
        C55192Ody.A02(EnumC53337Nin.A02, null, EnumC53354Nj4.PROFILE_LOGIN, A0r, A0B);
        User A0g = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do);
        View inflate = layoutInflater.inflate(R.layout.new_user_activation_login, viewGroup, false);
        ViewStub A07 = AbstractC31171DnF.A07(inflate, R.id.login_button_view_stub);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, A0o, 36324037366263640L);
        int i2 = R.layout.threads_login_button;
        if (A06) {
            i2 = R.layout.threads_login_button_with_chevron;
        }
        View A0E = AbstractC31173DnH.A0E(A07, i2);
        if ((A0E instanceof ConstraintLayout) && A0E != null) {
            TextView A0e = AbstractC166987dD.A0e(inflate, R.id.not_now_button);
            boolean A062 = C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36324037366329177L);
            Context requireContext = requireContext();
            int i3 = R.color.default_cta_dominant_color;
            if (A062) {
                i3 = R.color.igds_primary_text;
            }
            AbstractC166987dD.A1O(requireContext, A0e, i3);
            AbstractC31173DnH.A1F(AbstractC166987dD.A0e(A0E, R.id.login_button_username), A0g);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) A0E.findViewById(R.id.login_button_profile_image);
            gradientSpinnerAvatarView.A05();
            if (AbstractC72723Nt.A00(requireContext())) {
                Context requireContext2 = requireContext();
                float A04 = AbstractC13880nE.A04(requireContext2, 16);
                float A042 = AbstractC13880nE.A04(requireContext2, 12);
                float A043 = AbstractC13880nE.A04(requireContext2, 2);
                int i4 = (int) A04;
                Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                C14360o3.A07(createBitmap);
                Paint A0R = AbstractC166987dD.A0R();
                AbstractC166987dD.A1N(requireContext2, A0R, R.color.grey_9);
                A0R.setAntiAlias(true);
                A0R.setStyle(Paint.Style.FILL);
                Paint A0R2 = AbstractC166987dD.A0R();
                A0R2.setAntiAlias(true);
                A0R2.setColorFilter(new PorterDuffColorFilter(requireContext2.getColor(R.color.design_dark_default_color_on_background), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = requireContext2.getDrawable(R.drawable.instagram_app_instagram_pano_outline_24);
                if (drawable2 != null) {
                    int i5 = (int) A042;
                    if ((drawable2 instanceof BitmapDrawable) && ((BitmapDrawable) drawable2).getBitmap() == null) {
                        bitmap = null;
                    } else {
                        bitmap = AbstractC27488CBj.A00(drawable2, i5, i5);
                    }
                } else {
                    bitmap = null;
                }
                Canvas A063 = AbstractC43592JPx.A06(createBitmap);
                float f = A04 / 2.0f;
                A063.drawCircle(f, f, f, A0R);
                if (bitmap != null) {
                    A063.drawBitmap(bitmap, A043, A043, A0R2);
                }
                drawable = new BitmapDrawable(AbstractC166997dE.A0M(requireContext2), createBitmap);
            } else {
                drawable = requireContext().getDrawable(R.drawable.ig_badge_color_logo);
            }
            gradientSpinnerAvatarView.setBottomBadgeDrawable(drawable);
            gradientSpinnerAvatarView.A0F(null, this, A0g.Bhu());
            gradientSpinnerAvatarView.A00 = AbstractC13880nE.A04(requireContext(), 4);
            gradientSpinnerAvatarView.A01 = AbstractC13880nE.A04(requireContext(), 4);
            ViewOnClickListenerC55462OkH.A01(A0E, 0, this);
            ViewOnClickListenerC55462OkH.A01(A0e, 1, this);
            i = -600096601;
        } else {
            i = 1094703388;
        }
        C0f9.A09(i, A02);
        return inflate;
    }
}
