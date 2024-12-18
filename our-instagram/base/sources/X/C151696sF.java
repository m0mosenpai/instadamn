package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.6sF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151696sF implements InterfaceC65626Tpm {
    public AvatarCoinFlipConfig A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final View A05;
    public final ProfileCoinFlipView A06;
    public final C53O A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;
    public final InterfaceC56392iX A0A;
    public final C151706sG A0B;
    public final WeakReference A0C;
    public final WeakReference A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC16820sZ A0F;
    public final InterfaceC16660sJ A0G;
    public final C3PE A0H;
    public final InterfaceC16820sZ A0I;
    public final InterfaceC16820sZ A0J;
    public final InterfaceC16820sZ A0K;
    public final InterfaceC16820sZ A0L;

    public C151696sF(Context context, View view, ProfileCoinFlipView profileCoinFlipView, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC56392iX interfaceC56392iX, C151706sG c151706sG, WeakReference weakReference, WeakReference weakReference2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(userSession, 1);
        this.A09 = userSession;
        this.A04 = context;
        this.A0C = weakReference;
        this.A0D = weakReference2;
        this.A08 = interfaceC11380iw;
        this.A05 = view;
        this.A06 = profileCoinFlipView;
        this.A0A = interfaceC56392iX;
        this.A0B = c151706sG;
        this.A0I = interfaceC16820sZ;
        this.A0K = interfaceC16820sZ2;
        this.A0G = interfaceC16660sJ;
        this.A0F = interfaceC16820sZ3;
        this.A0J = interfaceC16820sZ4;
        this.A0L = interfaceC16820sZ5;
        this.A0E = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EY(this, 13));
        this.A02 = true;
        this.A0H = new C3PE() { // from class: X.6sH
            @Override // X.C3PE
            public final void DQY(View view2) {
            }

            @Override // X.C3PE
            public final boolean DsE(View view2) {
                C151696sF.this.A03();
                return true;
            }
        };
        this.A07 = new C53O() { // from class: X.6sI
            @Override // X.C53O
            public final /* synthetic */ void Cyb() {
            }

            @Override // X.C53O
            public final void CyY() {
                Fragment fragment;
                C151696sF c151696sF = C151696sF.this;
                InterfaceC09390do interfaceC09390do = c151696sF.A0E;
                C143266dR c143266dR = (C143266dR) interfaceC09390do.getValue();
                if (c143266dR != null && c143266dR.A02()) {
                    C36721GGq c36721GGq = new C36721GGq(c151696sF);
                    Object obj = c151696sF.A0D.get();
                    if ((obj instanceof AbstractC59962oe) && (fragment = (Fragment) obj) != null) {
                        C07S c07s = C07S.STARTED;
                        C07X viewLifecycleOwner = fragment.getViewLifecycleOwner();
                        AbstractC23641Du.A05(AnonymousClass191.A00, new C57169PZn(viewLifecycleOwner, c07s, c36721GGq, c151696sF, null, 13), C07Y.A00(viewLifecycleOwner));
                    }
                    C143266dR c143266dR2 = (C143266dR) interfaceC09390do.getValue();
                    if (c143266dR2 != null) {
                        c143266dR2.A00();
                        return;
                    }
                    return;
                }
                c151696sF.A0G.invoke(true);
                c151696sF.A02();
                c151696sF.A03 = true;
            }

            @Override // X.C53O
            public final void Cya() {
                C151696sF c151696sF = C151696sF.this;
                c151696sF.A0F.invoke();
                c151696sF.A02();
            }

            @Override // X.C53O
            public final void Cym() {
                C151696sF.this.A0G.invoke(false);
            }
        };
    }

    public final List A01(AvatarCoinFlipConfig avatarCoinFlipConfig) {
        C14360o3.A0B(avatarCoinFlipConfig, 0);
        return AbstractC16960so.A1Q(A00(this, avatarCoinFlipConfig.A06.A03, r3.A02 / r3.A01), A00(this, avatarCoinFlipConfig.A05.A03, r3.A02 / r3.A01));
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        if (this.A03) {
            this.A03 = false;
            Activity activity = (Activity) this.A0C.get();
            if (activity != null) {
                String moduleName = this.A08.getModuleName();
                C14360o3.A0B(moduleName, 0);
                KDX kdx = new KDX();
                kdx.setArguments(AbstractC61636Rr0.A00(new C09530e4("args_previous_module_name", moduleName), new C09530e4(AbstractC43591JPw.A00(68), "ig_edit_profile")));
                C189448aO c189448aO = new C189448aO(this.A09);
                c189448aO.A0U = kdx;
                C189478aR A00 = c189448aO.A00();
                kdx.A0E = A00;
                kdx.A01 = activity;
                A00.A02(activity, kdx);
            }
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public static final C74O A00(C151696sF c151696sF, String str, float f) {
        int A0H;
        int i;
        UserSession userSession = c151696sF.A09;
        boolean A01 = AbstractC31248DoW.A01(userSession);
        Context context = c151696sF.A04;
        if (A01) {
            A0H = R.color.fds_transparent;
        } else {
            A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_progress_bar_on_media);
        }
        int color = context.getColor(A0H);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width);
        if (AbstractC31248DoW.A01(userSession)) {
            i = (int) (dimensionPixelSize * 1.1d);
        } else {
            i = dimensionPixelSize;
        }
        Drawable A012 = C74N.A01(context, userSession, new C36494G7s(c151696sF), str, null, null, null, i, dimensionPixelSize, false, true, false, true, false);
        C14360o3.A0C(A012, "null cannot be cast to non-null type com.instagram.giphy.AnimatedAvatarDrawable");
        C74O c74o = (C74O) A012;
        c74o.A0a.A01(color, color);
        ((C74P) c74o).A01 = f;
        return c74o;
    }

    public final void A02() {
        int A0H;
        ProfileCoinFlipView profileCoinFlipView = this.A06;
        if (profileCoinFlipView != null) {
            profileCoinFlipView.A0F(EnumC152426tV.A02);
            UserSession userSession = this.A09;
            boolean A04 = AbstractC31248DoW.A04(userSession);
            Context context = profileCoinFlipView.getContext();
            if (A04) {
                A0H = R.color.grey_1;
            } else {
                A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_elevated_highlight_background);
            }
            profileCoinFlipView.setCircleBackgroundColor(context.getColor(A0H));
            ((ImageView) profileCoinFlipView.findViewById(R.id.avatar)).setScaleType(ImageView.ScaleType.CENTER);
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36322409573263579L);
            int i = R.drawable.instagram_facebook_avatars_pano_outline_24;
            if (A06) {
                i = R.drawable.instagram_avatars_pano_outline_24;
            }
            profileCoinFlipView.setAvatarImageDrawable(context.getDrawable(i));
            profileCoinFlipView.setContentDescription(context.getString(2131956940));
            C3P9 c3p9 = new C3P9(profileCoinFlipView);
            c3p9.A0D = true;
            c3p9.A07 = true;
            c3p9.A04 = this.A0H;
            c3p9.A00();
        }
    }

    public final void A03() {
        View view;
        UserSession userSession = this.A09;
        if (AbstractC1565371b.A00(userSession)) {
            AbstractC35176FfT.A02(this.A04, userSession, "edit_photo_and_avatar");
            return;
        }
        Activity activity = (Activity) this.A0C.get();
        if (activity == null) {
            return;
        }
        if (A06()) {
            InterfaceC56392iX interfaceC56392iX = this.A0A;
            if (interfaceC56392iX != null) {
                view = interfaceC56392iX.getView();
            } else {
                view = null;
            }
            A05(view, false);
            A04(activity);
            return;
        }
        new C189448aO(userSession).A00().A02(activity, AbstractC33775Ew1.A00(UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A03, userSession, "ig_edit_profile", this.A01, this.A02, true));
    }

    public final void A04(Activity activity) {
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A00;
        if (avatarCoinFlipConfig != null) {
            new C189448aO(this.A09).A00().A02(activity, AbstractC33780Ew6.A00(avatarCoinFlipConfig, this.A08.getModuleName()));
        }
        InterfaceC16820sZ interfaceC16820sZ = this.A0K;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }

    public final void A05(View view, boolean z) {
        if (!AbstractC31248DoW.A05(this.A09)) {
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[1];
            float[] fArr = {1.0f, 0.0f};
            if (z) {
                // fill-array-data instruction
                fArr[0] = 0.0f;
                fArr[1] = 1.0f;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", fArr), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
                C14360o3.A07(ofPropertyValuesHolder);
                animatorArr[0] = ofPropertyValuesHolder;
                animatorSet.playTogether(animatorArr);
            } else {
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", fArr), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
                C14360o3.A07(ofPropertyValuesHolder2);
                animatorArr[0] = ofPropertyValuesHolder2;
                animatorSet.playTogether(animatorArr);
                animatorSet.addListener(new AN7(animatorSet, view));
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(200L);
            animatorSet.start();
        }
    }

    public final boolean A06() {
        AvatarCoinFlipConfig avatarCoinFlipConfig;
        AvatarCoinFlipSticker avatarCoinFlipSticker;
        String str;
        AvatarCoinFlipSticker avatarCoinFlipSticker2;
        String str2;
        InterfaceC16820sZ interfaceC16820sZ;
        InterfaceC16820sZ interfaceC16820sZ2;
        if (C14360o3.A0K(C20Y.A00(this.A09).A01.A00, C125535lz.A00) && ((Boolean) this.A0J.invoke()).booleanValue() && (avatarCoinFlipConfig = this.A00) != null && (avatarCoinFlipSticker = avatarCoinFlipConfig.A06) != null && (str = avatarCoinFlipSticker.A03) != null && str.length() != 0 && (avatarCoinFlipSticker2 = avatarCoinFlipConfig.A05) != null && (str2 = avatarCoinFlipSticker2.A03) != null && str2.length() != 0 && !this.A01 && (interfaceC16820sZ = this.A0I) != null && !((Boolean) interfaceC16820sZ.invoke()).booleanValue() && (interfaceC16820sZ2 = this.A0L) != null && !((Boolean) interfaceC16820sZ2.invoke()).booleanValue()) {
            return true;
        }
        return false;
    }
}
