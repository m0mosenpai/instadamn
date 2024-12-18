package X;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.UJn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66485UJn extends C3OO {
    public final Context A00;
    public final View A01;
    public final CheckBox A02;
    public final ImageView A03;
    public final TextView A04;
    public final IgdsButton A05;
    public final IgdsButton A06;
    public final FollowButton A07;
    public final ImageView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final GradientSpinnerAvatarView A0C;

    public static final void A02(InterfaceC11380iw interfaceC11380iw, GZU gzu, InterfaceC71994XEi interfaceC71994XEi, C66485UJn c66485UJn, C70792Wh5 c70792Wh5) {
        int intValue = c70792Wh5.A00.intValue();
        if (intValue != 11 && intValue != 5) {
            ImageView imageView = c66485UJn.A03;
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
            ImageView imageView2 = c66485UJn.A08;
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(null);
            return;
        }
        ImageView imageView3 = c66485UJn.A03;
        imageView3.setVisibility(0);
        WNX.A00(imageView3, interfaceC71994XEi, c70792Wh5, gzu, 59);
        if (c70792Wh5.A03) {
            ImageView imageView4 = c66485UJn.A08;
            C0fQ.A00(new WNR(26, interfaceC11380iw, c66485UJn, interfaceC71994XEi, c70792Wh5), imageView4);
            imageView4.setVisibility(0);
        } else {
            ImageView imageView5 = c66485UJn.A08;
            imageView5.setVisibility(8);
            imageView5.setOnClickListener(null);
        }
    }

    public final void A04(InterfaceC11380iw interfaceC11380iw, GZU gzu, InterfaceC71994XEi interfaceC71994XEi, C70792Wh5 c70792Wh5) {
        EnumC99704do enumC99704do;
        Context context;
        int i;
        String string;
        C14360o3.A0B(interfaceC11380iw, 1);
        A03(interfaceC11380iw, this, c70792Wh5);
        A02(interfaceC11380iw, gzu, interfaceC71994XEi, this, c70792Wh5);
        Integer num = c70792Wh5.A00;
        if (num != C05F.A01 && num != C05F.A0C && num != C05F.A0Y && num != C05F.A0u && num != C05F.A15 && num != C05F.A1I) {
            IgdsButton igdsButton = this.A06;
            igdsButton.setVisibility(8);
            igdsButton.setOnClickListener(null);
            return;
        }
        switch (num.intValue()) {
            case 1:
            case 4:
            case 6:
            case 7:
            case 9:
                enumC99704do = EnumC99704do.A03;
                this.A06.setStyle(enumC99704do);
                break;
            case 2:
                enumC99704do = EnumC99704do.A06;
                this.A06.setStyle(enumC99704do);
                break;
            case 3:
            case 5:
            case 8:
            default:
                C0w9.A03("IgLiveUserRowHolder", AnonymousClass001.A0R("Illegal participant role for removeCancelButtonStyle: ", AbstractC34345FCn.A00(num)));
                break;
        }
        IgdsButton igdsButton2 = this.A06;
        Integer num2 = c70792Wh5.A00;
        switch (num2.intValue()) {
            case 1:
            case 4:
                context = this.A00;
                i = 2131964098;
                string = context.getString(i);
                break;
            case 2:
                context = this.A00;
                i = 2131964095;
                string = context.getString(i);
                break;
            case 3:
            case 5:
            case 8:
            default:
                C0w9.A03("IgLiveUserRowHolder", AnonymousClass001.A0R("Illegal participant role for removeCancelButtonText: ", AbstractC34345FCn.A00(num2)));
                string = null;
                break;
            case 6:
                context = this.A00;
                i = 2131964093;
                string = context.getString(i);
                break;
            case 7:
                context = this.A00;
                i = 2131964096;
                string = context.getString(i);
                break;
            case 9:
                context = this.A00;
                i = 2131964094;
                string = context.getString(i);
                break;
        }
        igdsButton2.setText(string);
        C0fQ.A00(new WMj(4, interfaceC11380iw, interfaceC71994XEi, this, gzu, c70792Wh5), igdsButton2);
        Integer num3 = c70792Wh5.A00;
        if (num3 != C05F.A15 && num3 != C05F.A0u) {
            igdsButton2.setEnabled(true);
        } else {
            igdsButton2.setEnabled(c70792Wh5.A03);
        }
        igdsButton2.setVisibility(0);
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC71994XEi interfaceC71994XEi, C66485UJn c66485UJn, C70792Wh5 c70792Wh5, InterfaceC16660sJ interfaceC16660sJ) {
        User user = c70792Wh5.A01;
        if (user.B7L() != FollowStatus.A08 && user.B7L() != FollowStatus.A04) {
            ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = c66485UJn.A07.A0J;
            viewOnAttachStateChangeListenerC110564yT.A08(new C65713Tsm(2, interfaceC71994XEi, c70792Wh5, interfaceC16660sJ));
            viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, user);
            return;
        }
        c66485UJn.A07.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r7.length() == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.InterfaceC11380iw r8, X.C66485UJn r9, X.C70792Wh5 r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66485UJn.A03(X.0iw, X.UJn, X.Wh5):void");
    }

    public C66485UJn(View view) {
        super(view);
        this.A01 = view;
        this.A00 = view.getContext();
        this.A0C = (GradientSpinnerAvatarView) AbstractC166987dD.A0c(view, R.id.user_profile_picture);
        this.A0B = AbstractC25230BEn.A0Q(view, R.id.user_title);
        this.A09 = AbstractC25230BEn.A0Q(view, R.id.user_subtitle);
        this.A0A = AbstractC25230BEn.A0Q(view, R.id.user_social_context);
        this.A07 = (FollowButton) AbstractC166987dD.A0c(view, R.id.user_follow_button);
        this.A05 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.user_friend_chat_leave_button);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.viewer_wave_button);
        this.A06 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.user_room_action_button);
        this.A03 = (ImageView) AbstractC166987dD.A0c(view, R.id.user_more_button);
        this.A08 = (ImageView) AbstractC166987dD.A0c(view, R.id.user_invite_button);
        this.A02 = (CheckBox) AbstractC166987dD.A0c(view, R.id.user_checkbox);
    }

    public static final Integer A00(InterfaceC11380iw interfaceC11380iw) {
        if (C14360o3.A0K(interfaceC11380iw.getModuleName(), MSV.A00(790))) {
            return C05F.A01;
        }
        if (C14360o3.A0K(interfaceC11380iw.getModuleName(), MSV.A00(791))) {
            return C05F.A0N;
        }
        if (C14360o3.A0K(interfaceC11380iw.getModuleName(), MSV.A00(1385))) {
            return C05F.A04;
        }
        return C05F.A06;
    }
}
