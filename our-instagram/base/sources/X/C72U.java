package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.72U, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C72U {
    public static void A00(final C38321qM c38321qM, final AnonymousClass741 anonymousClass741, final UserDetailEntryInfo userDetailEntryInfo, final FollowButton followButton, User user, final String str, final String str2, final String str3, final String str4) {
        int i;
        int i2;
        Context context = followButton.getContext();
        FollowStatus B7L = user.B7L();
        FollowStatus followStatus = FollowStatus.A05;
        if (B7L == followStatus) {
            boolean A1w = user.A1w();
            i = R.attr.igds_color_primary_text;
            if (A1w) {
                i = R.attr.igds_color_close_friends;
            }
        } else {
            FollowStatus B7L2 = user.B7L();
            C14360o3.A0B(context, 0);
            if (B7L2 == FollowStatus.A06) {
                i2 = R.color.design_dark_default_color_on_background;
            } else if (B7L2 != followStatus && B7L2 != FollowStatus.A07) {
                i2 = -1;
            } else {
                i = R.attr.igds_color_primary_text;
            }
            followButton.setCustomForegroundColor(i2);
            ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
            viewOnAttachStateChangeListenerC110564yT.A00 = new View.OnClickListener() { // from class: X.6rP
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnonymousClass741 anonymousClass7412 = anonymousClass741;
                    FollowButton followButton2 = followButton;
                    String str5 = str;
                    C38321qM c38321qM2 = c38321qM;
                    String str6 = str2;
                    String str7 = str3;
                    UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
                    String str8 = str4;
                    if (anonymousClass7412 != null) {
                        anonymousClass7412.D3w(c38321qM2, userDetailEntryInfo2, followButton2, str5, str6, str7, str8);
                    }
                }
            };
            viewOnAttachStateChangeListenerC110564yT.A01 = new View.OnLongClickListener() { // from class: X.6rQ
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    AnonymousClass741 anonymousClass7412 = anonymousClass741;
                    C38321qM c38321qM2 = c38321qM;
                    String str5 = str;
                    String str6 = str2;
                    String str7 = str3;
                    UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
                    if (anonymousClass7412 != null) {
                        anonymousClass7412.DQf(c38321qM2, userDetailEntryInfo2, str5, str6, str7);
                        return true;
                    }
                    return false;
                }
            };
        }
        i2 = AbstractC53242c7.A0H(context, i);
        followButton.setCustomForegroundColor(i2);
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT2 = followButton.A0J;
        viewOnAttachStateChangeListenerC110564yT2.A00 = new View.OnClickListener() { // from class: X.6rP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnonymousClass741 anonymousClass7412 = anonymousClass741;
                FollowButton followButton2 = followButton;
                String str5 = str;
                C38321qM c38321qM2 = c38321qM;
                String str6 = str2;
                String str7 = str3;
                UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
                String str8 = str4;
                if (anonymousClass7412 != null) {
                    anonymousClass7412.D3w(c38321qM2, userDetailEntryInfo2, followButton2, str5, str6, str7, str8);
                }
            }
        };
        viewOnAttachStateChangeListenerC110564yT2.A01 = new View.OnLongClickListener() { // from class: X.6rQ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                AnonymousClass741 anonymousClass7412 = anonymousClass741;
                C38321qM c38321qM2 = c38321qM;
                String str5 = str;
                String str6 = str2;
                String str7 = str3;
                UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
                if (anonymousClass7412 != null) {
                    anonymousClass7412.DQf(c38321qM2, userDetailEntryInfo2, str5, str6, str7);
                    return true;
                }
                return false;
            }
        };
    }

    public static boolean A01(Context context, UserSession userSession, User user, boolean z) {
        if (user != null) {
            return (C2E7.A01(user) || C4K3.A02(userSession, user)) && AbstractC1567472a.A00(context, userSession, user, false, z) > 0 && user.A1d();
        }
        return false;
    }

    public static boolean A02(UserSession userSession, User user) {
        if (user != null && user.getId().equals(userSession.userId) && user.A0M() != C05F.A0C && !user.A2I() && C18U.A06(C06090Tz.A05, userSession, 36323822617636474L)) {
            return true;
        }
        return false;
    }

    public static boolean A03(UserSession userSession, User user) {
        if (user != null && user.getId().equals(userSession.userId)) {
            if (C2E7.A00(user) || C2E7.A01(user)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
