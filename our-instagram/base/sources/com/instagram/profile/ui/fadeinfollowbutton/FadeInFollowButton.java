package com.instagram.profile.ui.fadeinfollowbutton;

import X.AbstractC13880nE;
import X.AbstractC35271Fh6;
import X.AbstractC77473dX;
import X.AnonymousClass001;
import X.C0f9;
import X.C14360o3;
import X.C19260xA;
import X.C1QI;
import X.C38321qM;
import X.C3K8;
import X.C70R;
import X.InterfaceC77483dY;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes3.dex */
public class FadeInFollowButton extends ViewSwitcher {
    public int A00;
    public ViewStub A01;
    public TextView A02;
    public UserSession A03;
    public C38321qM A04;
    public UserDetailEntryInfo A05;
    public C70R A06;
    public InterfaceC77483dY A07;
    public User A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public int A0C;
    public final AlphaAnimation A0D;
    public final AlphaAnimation A0E;
    public final InterfaceC77483dY A0F;

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        getChildAt(0).setContentDescription(charSequence);
    }

    public static void A02(FadeInFollowButton fadeInFollowButton) {
        C19260xA c19260xA;
        Context context = fadeInFollowButton.getContext();
        UserSession userSession = fadeInFollowButton.A03;
        userSession.getClass();
        User user = fadeInFollowButton.A08;
        user.getClass();
        InterfaceC77483dY interfaceC77483dY = fadeInFollowButton.A0F;
        String str = fadeInFollowButton.A0A;
        String str2 = fadeInFollowButton.A09;
        UserDetailEntryInfo userDetailEntryInfo = fadeInFollowButton.A05;
        C38321qM c38321qM = fadeInFollowButton.A04;
        if (c38321qM != null) {
            c19260xA = new C19260xA();
            C19260xA.A00(c19260xA, c38321qM.getId(), "starting_clips_media_id");
            C19260xA.A00(c19260xA, fadeInFollowButton.A04.A0C.getLoggingInfoToken(), "starting_clips_ranking_info_token");
        } else {
            c19260xA = null;
        }
        C14360o3.A0B(context, 0);
        AbstractC35271Fh6.A07(context, c19260xA, null, userSession, c38321qM, null, userDetailEntryInfo, null, interfaceC77483dY, null, user, null, null, null, "user_profile_top_bar", str, str2, null, null, null, null, null);
    }

    private FollowStatus getOptimisticFollowStatus() {
        User user = this.A08;
        user.getClass();
        int intValue = user.A0M().intValue();
        if (intValue != 0 && intValue != 2) {
            return FollowStatus.A05;
        }
        return FollowStatus.A07;
    }

    public final void A04(boolean z, UserSession userSession) {
        if (!this.A0B) {
            this.A02.setText(this.A00);
            A01();
            if (C3K8.A01(userSession)) {
                setSelected(true);
            }
            AlphaAnimation alphaAnimation = this.A0D;
            setInAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = this.A0E;
            setOutAnimation(alphaAnimation2);
            setId(R.id.follow_button);
            if (C1QI.A0E().A00) {
                Context context = getContext();
                setPadding(0, 0, (int) AbstractC13880nE.A04(context, 12), (int) AbstractC13880nE.A04(context, 8));
            }
            if (z) {
                setInAnimation(null);
                setOutAnimation(null);
            }
            setDisplayedChild(1);
            if (z) {
                setInAnimation(alphaAnimation);
                setOutAnimation(alphaAnimation2);
            }
        }
    }

    @Override // android.widget.ViewAnimator
    @Deprecated
    public void setDisplayedChild(int i) {
        if (!this.A0B) {
            super.setDisplayedChild(i);
        }
    }

    public void setFollowText(int i) {
        this.A00 = i;
        if (getDisplayedChild() == 1) {
            A03(this);
        }
    }

    public void setFollowingText(int i) {
        this.A0C = i;
        if (getDisplayedChild() == 1) {
            A03(this);
        }
    }

    public FadeInFollowButton(Context context) {
        super(context);
        this.A0F = new AbstractC77473dX() { // from class: X.6rG
            @Override // X.AbstractC77473dX, X.InterfaceC77483dY
            public final void D3u(FollowStatus followStatus, User user) {
                C70R c70r = FadeInFollowButton.this.A06;
                if (c70r != null) {
                    c70r.D3X(user);
                }
            }

            @Override // X.AbstractC77473dX, X.InterfaceC77483dY
            public final void DHr(User user) {
                InterfaceC77483dY interfaceC77483dY = FadeInFollowButton.this.A07;
                if (interfaceC77483dY != null) {
                    interfaceC77483dY.DHr(user);
                }
            }

            @Override // X.AbstractC77473dX, X.InterfaceC77483dY
            public final void DHs(User user) {
                InterfaceC77483dY interfaceC77483dY = FadeInFollowButton.this.A07;
                if (interfaceC77483dY != null) {
                    interfaceC77483dY.DHs(user);
                }
            }
        };
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A0D = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.A0E = alphaAnimation2;
        this.A00 = 2131962758;
        this.A0C = 2131962762;
        alphaAnimation.setStartOffset(200L);
        alphaAnimation.setDuration(200L);
        alphaAnimation2.setDuration(200L);
        A00();
    }

    private void A00() {
        int A03 = C0f9.A03(737597827);
        View.inflate(getContext(), R.layout.navbar_overflow_view_switcher_with_follow_button, this);
        this.A02 = (TextView) requireViewById(R.id.action_bar_overflow_text);
        this.A01 = (ViewStub) requireViewById(R.id.action_bar_view_stub);
        C0f9.A0A(792004905, A03);
    }

    private void A01() {
        if (C1QI.A0E().A00) {
            Context context = getContext();
            this.A02.setTextSize(14.0f);
            int A04 = (int) AbstractC13880nE.A04(context, 16);
            int A042 = (int) AbstractC13880nE.A04(context, 8);
            this.A02.setPadding(A04, A042, A04, A042);
            TextView textView = this.A02;
            C1QI.A0H(textView, textView);
            this.A02.invalidate();
        }
    }

    public static void A03(FadeInFollowButton fadeInFollowButton) {
        int i;
        FollowStatus optimisticFollowStatus = fadeInFollowButton.getOptimisticFollowStatus();
        int ordinal = fadeInFollowButton.getOptimisticFollowStatus().ordinal();
        if (ordinal != 4) {
            if (ordinal == 5) {
                i = 2131962771;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0R("FadeInFollowButton doesn't support expected follow state ", optimisticFollowStatus.name()));
            }
        } else {
            i = fadeInFollowButton.A0C;
        }
        fadeInFollowButton.A02.setText(i);
        fadeInFollowButton.A01();
    }

    public FadeInFollowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0F = new AbstractC77473dX() { // from class: X.6rG
            @Override // X.AbstractC77473dX, X.InterfaceC77483dY
            public final void D3u(FollowStatus followStatus, User user) {
                C70R c70r = FadeInFollowButton.this.A06;
                if (c70r != null) {
                    c70r.D3X(user);
                }
            }

            @Override // X.AbstractC77473dX, X.InterfaceC77483dY
            public final void DHr(User user) {
                InterfaceC77483dY interfaceC77483dY = FadeInFollowButton.this.A07;
                if (interfaceC77483dY != null) {
                    interfaceC77483dY.DHr(user);
                }
            }

            @Override // X.AbstractC77473dX, X.InterfaceC77483dY
            public final void DHs(User user) {
                InterfaceC77483dY interfaceC77483dY = FadeInFollowButton.this.A07;
                if (interfaceC77483dY != null) {
                    interfaceC77483dY.DHs(user);
                }
            }
        };
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A0D = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.A0E = alphaAnimation2;
        this.A00 = 2131962758;
        this.A0C = 2131962762;
        alphaAnimation.setStartOffset(200L);
        alphaAnimation.setDuration(200L);
        alphaAnimation2.setDuration(200L);
        A00();
    }
}
