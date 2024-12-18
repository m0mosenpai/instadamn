package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class WEJ {
    public static final WEJ A00 = new Object();
    public static final InterfaceC11380iw A01 = new C19270xB("bloks_follow_button");

    public static final void A00(C6FG c6fg, C102884kP c102884kP, UserSession userSession, FollowButton followButton, User user) {
        InterfaceC11380iw interfaceC11380iw;
        InterfaceC11380iw interfaceC11380iw2;
        boolean z = c6fg.A02 instanceof C62862tP;
        if (z) {
            interfaceC11380iw = C6BQ.A07(c6fg);
        } else {
            interfaceC11380iw = A01;
        }
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
        if (z) {
            interfaceC11380iw2 = C6BQ.A07(c6fg);
        } else {
            interfaceC11380iw2 = A01;
        }
        viewOnAttachStateChangeListenerC110564yT.A08(new VBS(interfaceC11380iw2, c6fg, c102884kP, userSession, followButton));
        viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, user);
    }

    public static final void A01(C102884kP c102884kP, FollowButton followButton) {
        Typeface typeface;
        if (c102884kP.A0S(46, false)) {
            followButton.setPrismButtonVariant(C1QL.A03);
        }
        String A0F = c102884kP.A0F();
        if (A0F != null) {
            int hashCode = A0F.hashCode();
            if (hashCode != -838103385) {
                if (hashCode == 3556653 && A0F.equals("text")) {
                    typeface = Typeface.DEFAULT;
                } else {
                    return;
                }
            } else if (!A0F.equals("bold_text")) {
                return;
            } else {
                typeface = Typeface.DEFAULT_BOLD;
            }
            C14360o3.A08(typeface);
            C14360o3.A0B(followButton, 0);
            followButton.setGravity(19);
            followButton.setPadding(0, 0, 0, 0);
            followButton.setMinHeight(0);
            followButton.setBackground(null);
            Context context = followButton.getContext();
            followButton.setTextSize(0, AbstractC31173DnH.A00(context, R.dimen.abc_text_size_menu_header_material));
            followButton.setTypeface(typeface);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC53242c7.A0F(context, R.attr.inverseUpdatableSecondaryLighterButtonStyle), new int[]{android.R.attr.textColor});
            C14360o3.A07(obtainStyledAttributes);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null) {
                followButton.setTextColor(colorStateList);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
