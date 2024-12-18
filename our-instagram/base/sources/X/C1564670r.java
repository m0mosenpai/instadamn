package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.70r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1564670r {
    public View A00;
    public C55982hj A01;
    public EnumC1564770s A02;
    public User A03;
    public final InterfaceC55932he A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C23031Ai A07;
    public final List A08;

    public C1564670r(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A08 = AbstractC16960so.A1Q("app_background_detector", "login");
        this.A02 = EnumC1564770s.A03;
        this.A07 = AbstractC23021Ah.A00(userSession);
        this.A04 = new C668630d() { // from class: X.70t
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                int i = 0;
                C14360o3.A0B(c55982hj, 0);
                float f = (float) c55982hj.A09.A00;
                C1564670r c1564670r = C1564670r.this;
                View view = c1564670r.A00;
                if (view != null) {
                    view.setScaleX(f);
                }
                View view2 = c1564670r.A00;
                if (view2 != null) {
                    view2.setScaleY(f);
                }
                View view3 = c1564670r.A00;
                if (view3 != null) {
                    view3.setAlpha(f);
                }
                View view4 = c1564670r.A00;
                if (f > 0.0f) {
                    if (view4 == null) {
                        return;
                    }
                } else if (view4 == null) {
                    return;
                } else {
                    i = 8;
                }
                view4.setVisibility(i);
            }
        };
    }

    public static final void A00(C1564670r c1564670r, User user, String str, String str2) {
        UserSession userSession = c1564670r.A06;
        InterfaceC11380iw interfaceC11380iw = c1564670r.A05;
        String id = user.getId();
        C1571673v.A06(interfaceC11380iw, userSession, AbstractC50626MWn.A00(userSession, user.B7L(), user.A0M(), id), str, user.getId(), str2);
    }

    public final void A01(Context context, View view, boolean z) {
        if (view != null && context != null) {
            EnumC1564770s enumC1564770s = this.A02;
            EnumC1564770s enumC1564770s2 = EnumC1564770s.A02;
            if (enumC1564770s != enumC1564770s2) {
                View findViewById = view.findViewById(R.id.profile_upsell_container);
                C14360o3.A0C(findViewById, "null cannot be cast to non-null type android.view.View");
                if (findViewById.getVisibility() == 0) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.upsell_banner_fade_out);
                    C14360o3.A07(loadAnimation);
                    loadAnimation.setAnimationListener(new AnimationAnimationListenerC55510Ol3(findViewById));
                    findViewById.startAnimation(loadAnimation);
                    if (z) {
                        User user = this.A03;
                        if (user != null) {
                            A00(this, user, "dismiss_profile_upsell_banner", "profile_upsell_banner");
                        } else {
                            return;
                        }
                    }
                }
                this.A02 = enumC1564770s2;
            }
        }
    }

    public final void A02(Context context, View view, boolean z) {
        if (view != null && context != null) {
            if (z) {
                View view2 = this.A00;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                C55982hj c55982hj = this.A01;
                if (c55982hj != null) {
                    c55982hj.A06(1.0d);
                }
                User user = this.A03;
                if (user != null) {
                    A00(this, user, "impression_profile_upsell_floating_button", "profile_upsell_banner_follow_button");
                    return;
                }
                return;
            }
            C55982hj c55982hj2 = this.A01;
            if (c55982hj2 != null) {
                c55982hj2.A06(0.0d);
            }
            View view3 = this.A00;
            if (view3 == null) {
                return;
            }
            view3.setVisibility(8);
        }
    }

    public final boolean A03() {
        Integer BQb;
        FriendshipStatus B8n;
        User user;
        FriendshipStatus B8n2;
        User user2;
        Boolean bool;
        User user3 = this.A03;
        if (user3 == null || (BQb = user3.A03.BQb()) == null || BQb.intValue() <= 0 || user3.B7L() != FollowStatus.A06) {
            return false;
        }
        UserSession userSession = this.A06;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36325476179915873L)) {
            User user4 = this.A03;
            if (user4 == null || (B8n = user4.A03.B8n()) == null || !C14360o3.A0K(B8n.Bvc(), true) || (user = this.A03) == null || (B8n2 = user.A03.B8n()) == null || B8n2.CQV() == null || (user2 = this.A03) == null) {
                return false;
            }
            FriendshipStatus B8n3 = user2.A03.B8n();
            if (B8n3 != null) {
                bool = B8n3.CQV();
            } else {
                bool = null;
            }
            if (!C14360o3.A0K(bool, true)) {
                return false;
            }
        }
        if (TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - this.A07.A01.getLong("third_party_profile_upsell_last_seen_timestamp_ms", 0L)) < C18U.A00(c06090Tz, userSession, 37169901110166018L)) {
            return false;
        }
        return true;
    }
}
