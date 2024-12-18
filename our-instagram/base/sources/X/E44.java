package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class E44 extends C3OO {
    public final InterfaceC37145GYg A00;
    public final IgdsPeopleCell A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E44(InterfaceC37145GYg interfaceC37145GYg, IgdsPeopleCell igdsPeopleCell) {
        super(igdsPeopleCell);
        C14360o3.A0B(interfaceC37145GYg, 2);
        this.A01 = igdsPeopleCell;
        this.A00 = interfaceC37145GYg;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, X.3sV, com.instagram.igds.components.button.IgdsButton] */
    public static final InterfaceC85983sV A00(Fragment fragment, E44 e44, InterfaceC11380iw interfaceC11380iw, C5QE c5qe, UserSession userSession, EnumC99704do enumC99704do, User user, Integer num, Integer num2) {
        GSg gSg;
        FollowButtonBase followButtonBase;
        Context requireContext = fragment.requireContext();
        if (num2.intValue() != 0) {
            gSg = new GSg(e44.A00, 3);
        } else {
            gSg = new GSg(e44.A00, 2);
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue != 1) {
                    if (intValue != 3) {
                        return null;
                    }
                    String obj = BHX.A00(requireContext, c5qe).toString();
                    C14360o3.A0B(obj, 2);
                    ?? igdsButton = new IgdsButton(requireContext, enumC99704do, EnumC99714dp.A04, obj, 0, false);
                    ViewOnClickListenerC35683FpI.A00(igdsButton, 8, gSg, user);
                    return igdsButton;
                }
                View inflate = LayoutInflater.from(requireContext).inflate(R.layout.user_follow_button_medium, (ViewGroup) e44.A01, false);
                if (!(inflate instanceof FollowButton) || (followButtonBase = (FollowButtonBase) inflate) == null) {
                    return null;
                }
                followButtonBase.setBaseStyle(EnumC77553df.A0C);
                user.A0k(AbstractC31174DnI.A0j(userSession, user));
                if (user.B7L() == FollowStatus.A08) {
                    AbstractC129875tr.A00(userSession).A0G(user, false);
                }
                followButtonBase.A0J.A04(interfaceC11380iw, userSession, user);
                return followButtonBase;
            }
            return new EZM(requireContext, new ViewOnClickListenerC35683FpI(7, gSg, user), C05F.A01, C05F.A0C, AbstractC53242c7.A08(requireContext));
        }
        Integer num3 = C05F.A00;
        return new EZM(requireContext, new ViewOnClickListenerC35683FpI(6, gSg, user), num3, num3, AbstractC53242c7.A0B(requireContext));
    }
}
