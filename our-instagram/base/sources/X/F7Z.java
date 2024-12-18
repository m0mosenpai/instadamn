package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F7Z {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38O c38o, C34644FOb c34644FOb, InterfaceC37216GaR interfaceC37216GaR, C47P c47p, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        int i2;
        CircularImageView circularImageView;
        TextView textView;
        IgSimpleImageView igSimpleImageView;
        View.OnClickListener viewOnClickListenerC35618Fo9;
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A13(userSession, interfaceC11380iw, c34644FOb);
        C14360o3.A0B(c47p, 5);
        AbstractC25229BEm.A1L(interfaceC37216GaR, 11, c38o);
        Resources resources = context.getResources();
        int i3 = R.dimen.abc_button_padding_horizontal_material;
        if (i == 0) {
            i3 = R.dimen.account_discovery_bottom_gap;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i3);
        View view = c34644FOb.A03;
        AbstractC13880nE.A0d(view, dimensionPixelSize);
        Integer AvK = interfaceC37216GaR.AvK(AbstractC31173DnH.A0p(c47p));
        if (AvK != null) {
            i2 = AvK.intValue();
        } else {
            i2 = i;
        }
        interfaceC37216GaR.Dhu(c47p, str2, i2);
        view.setBackgroundColor(0);
        ViewOnClickListenerC55453Ok7 viewOnClickListenerC55453Ok7 = new ViewOnClickListenerC55453Ok7(c47p, interfaceC37216GaR, str2, i, 3);
        Reel BlO = c47p.BlO(userSession);
        GradientSpinner gradientSpinner = c34644FOb.A0F;
        ViewGroup.LayoutParams layoutParams = gradientSpinner.getLayoutParams();
        Resources resources2 = gradientSpinner.getResources();
        layoutParams.height = AbstractC31171DnF.A02(resources2, R.dimen.action_button_settings_height);
        layoutParams.width = AbstractC31171DnF.A02(resources2, R.dimen.action_button_settings_height);
        if (BlO != null && (!BlO.A15(userSession) || !BlO.A0z(userSession))) {
            c34644FOb.A02 = BlO.getId();
            if (BlO.A16(userSession)) {
                gradientSpinner.A04();
            } else {
                gradientSpinner.A02();
            }
            gradientSpinner.setVisibility(0);
            circularImageView = c34644FOb.A0E;
            circularImageView.setClickable(false);
            C3PF c3pf = c34644FOb.A0D;
            if (c3pf != null) {
                c34644FOb.A05.setOnTouchListener(c3pf);
            }
        } else {
            c34644FOb.A02 = null;
            gradientSpinner.setVisibility(8);
            circularImageView = c34644FOb.A0E;
            C0fQ.A00(viewOnClickListenerC55453Ok7, circularImageView);
            c34644FOb.A05.setOnTouchListener(null);
        }
        C3PF c3pf2 = c34644FOb.A0D;
        if (c3pf2 != null) {
            c3pf2.A02();
        }
        C140626Xq c140626Xq = c34644FOb.A01;
        if (c140626Xq != null) {
            c140626Xq.A05(C05F.A0C);
        }
        c34644FOb.A01 = null;
        c34644FOb.A00 = new C34553FKn(c34644FOb, interfaceC37216GaR, i);
        User CDj = c47p.CDj();
        AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView, CDj);
        ViewGroup.LayoutParams layoutParams2 = circularImageView.getLayoutParams();
        Resources resources3 = circularImageView.getResources();
        layoutParams2.height = AbstractC31171DnF.A02(resources3, R.dimen.action_button_settings_height);
        layoutParams2.width = AbstractC31171DnF.A02(resources3, R.dimen.action_button_settings_height);
        TextView textView2 = c34644FOb.A09;
        AbstractC31173DnH.A1F(textView2, CDj);
        C85963sQ.A0B(textView2, CDj.isVerified());
        c34644FOb.A04.setVisibility(AbstractC167007dF.A05(C6XI.A02(CDj) ? 1 : 0));
        boolean A0K = C14360o3.A0K(CDj.B8y(), CDj.getUsername());
        TextView textView3 = c34644FOb.A07;
        if (!A0K) {
            textView3.setText(CDj.B8y());
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        LinearLayout linearLayout = c34644FOb.A06;
        AbstractC13880nE.A0a(linearLayout, linearLayout.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap));
        String ByJ = c47p.ByJ();
        if (ByJ.length() > 0 && z) {
            textView = c34644FOb.A08;
            textView.setText(ByJ);
            textView.setMaxLines(1);
            textView.setVisibility(0);
        } else {
            textView = c34644FOb.A08;
            textView.setVisibility(8);
        }
        String moduleName = interfaceC11380iw.getModuleName();
        ImmutableList socialContextFacepileUsers = c47p.getSocialContextFacepileUsers();
        if (z2) {
            if (!z4) {
                textView2.setText(c47p.CDj().B8y());
            }
            textView3.setVisibility(8);
            if (socialContextFacepileUsers != null && !socialContextFacepileUsers.isEmpty()) {
                textView.setMaxLines(2);
                IgSimpleImageView igSimpleImageView2 = c34644FOb.A0A;
                Context context2 = igSimpleImageView2.getContext();
                C14360o3.A0A(context2);
                igSimpleImageView2.setImageDrawable(AbstractC89513yr.A00(context2, null, Float.valueOf(0.67f), C05F.A01, null, Integer.valueOf(AbstractC166987dD.A0C(context2, 1)), null, null, moduleName, socialContextFacepileUsers, AbstractC166987dD.A0C(context2, z4 ? 18 : 23), C18U.A06(C06090Tz.A05, userSession, 36325428935275586L), true, false, true, false));
                igSimpleImageView2.setVisibility(0);
            } else {
                IgSimpleImageView igSimpleImageView3 = c34644FOb.A0A;
                igSimpleImageView3.setVisibility(8);
                igSimpleImageView3.setImageDrawable(null);
            }
        }
        FollowButton followButton = c34644FOb.A0G;
        followButton.setVisibility(0);
        if (z5) {
            followButton.setMinWidth(AbstractC31171DnF.A02(context.getResources(), R.dimen.cutout_anything_sticker_animation_margin));
        }
        followButton.setMaxWidth(AbstractC166987dD.A0C(context, AbstractC31171DnF.A02(context.getResources(), R.dimen.ab_test_media_thumbnail_preview_item_width)));
        ((FollowButtonBase) followButton).A0A = z6;
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
        viewOnAttachStateChangeListenerC110564yT.A08(new C33273EnU(interfaceC37216GaR, c47p, str2, i, 1));
        viewOnAttachStateChangeListenerC110564yT.A0K = str;
        viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, CDj);
        AbstractC99834e5.A02(followButton, userSession, AbstractC31173DnH.A0p(c47p));
        boolean z7 = AbstractC167007dF.A0K(context).widthPixels <= 1000;
        FollowStatus A0j = AbstractC31174DnI.A0j(userSession, CDj);
        if (!z3 || A0j == FollowStatus.A05 || A0j == FollowStatus.A07) {
            c34644FOb.A0B.setVisibility(8);
            c34644FOb.A0C.setVisibility(8);
        } else {
            if (z7) {
                igSimpleImageView = c34644FOb.A0C;
                igSimpleImageView.setVisibility(0);
                viewOnClickListenerC35618Fo9 = new ViewOnClickListenerC35640Foa(context, c38o, interfaceC37216GaR, CDj, c47p, str2, new CharSequence[]{context.getString(2131960998)}, i);
            } else {
                igSimpleImageView = c34644FOb.A0B;
                igSimpleImageView.setVisibility(0);
                if (z5) {
                    ViewGroup.MarginLayoutParams A0H = AbstractC31177DnL.A0H(igSimpleImageView);
                    A0H.setMarginStart(AbstractC31171DnF.A02(context.getResources(), R.dimen.abc_button_padding_horizontal_material));
                    igSimpleImageView.setLayoutParams(A0H);
                }
                viewOnClickListenerC35618Fo9 = new ViewOnClickListenerC35618Fo9(interfaceC37216GaR, c47p, CDj, str2, i, 2);
            }
            C0fQ.A00(viewOnClickListenerC35618Fo9, igSimpleImageView);
        }
        C0fQ.A00(viewOnClickListenerC55453Ok7, view);
    }
}
