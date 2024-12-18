package X;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.4yT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC110564yT implements View.OnAttachStateChangeListener {
    public View.OnClickListener A00;
    public View.OnLongClickListener A01;
    public C110974z9 A02;
    public C19260xA A03;
    public C38321qM A04;
    public C75113Zb A05;
    public UserDetailEntryInfo A06;
    public SearchContext A07;
    public InterfaceC77503da A08;
    public InterfaceC77483dY A09;
    public InterfaceC77543de A0A;
    public InterfaceC77523dc A0B;
    public EnumC77563dg A0C;
    public User A0D;
    public C1M1 A0E;
    public Long A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public InterfaceC16820sZ A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final FollowButtonBase A0R;
    public final C110574yU A0T = new Object();
    public boolean A0Q = true;
    public final InterfaceC09390do A0S = C1XM.A00(C110584yV.A00);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4yU, java.lang.Object] */
    public ViewOnAttachStateChangeListenerC110564yT(FollowButtonBase followButtonBase) {
        this.A0R = followButtonBase;
    }

    public static final FollowStatus A00(UserSession userSession, User user) {
        C14360o3.A0B(userSession, 0);
        return C57582kX.A00(userSession).A0N(user);
    }

    public static final void A03(UserSession userSession, ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT, User user) {
        FollowStatus A0N = C57582kX.A00(userSession).A0N(user);
        FollowButtonBase followButtonBase = viewOnAttachStateChangeListenerC110564yT.A0R;
        followButtonBase.A05(userSession, A0N, user, viewOnAttachStateChangeListenerC110564yT.A0Q, C3K8.A01(userSession));
        followButtonBase.A06(A0N);
    }

    public final void A04(final InterfaceC11380iw interfaceC11380iw, final UserSession userSession, final User user) {
        boolean z;
        if (userSession != null) {
            if (user != null && interfaceC11380iw != null) {
                this.A0D = user;
                final FollowStatus A0N = C57582kX.A00(userSession).A0N(user);
                FollowButtonBase followButtonBase = this.A0R;
                followButtonBase.A06(A0N);
                if (C2TN.A04(userSession, user)) {
                    followButtonBase.setVisibility(8);
                    return;
                }
                followButtonBase.setVisibility(0);
                followButtonBase.A05(userSession, A0N, user, this.A0Q, C3K8.A01(userSession));
                View.OnClickListener onClickListener = this.A00;
                if (onClickListener == null) {
                    onClickListener = new View.OnClickListener() { // from class: X.4yq
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int A05 = C0f9.A05(-1320354648);
                            ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = this;
                            FollowButtonBase followButtonBase2 = viewOnAttachStateChangeListenerC110564yT.A0R;
                            followButtonBase2.setEnabled(false);
                            User user2 = user;
                            if (user2.CQf()) {
                                UserSession userSession2 = userSession;
                                String str = viewOnAttachStateChangeListenerC110564yT.A0I;
                                if (str == null) {
                                    str = interfaceC11380iw.getModuleName();
                                }
                                AbstractC35271Fh6.A02(null, userSession2, followButtonBase2, viewOnAttachStateChangeListenerC110564yT.A09, user2, str);
                            } else {
                                if (viewOnAttachStateChangeListenerC110564yT.A0M) {
                                    UserSession userSession3 = userSession;
                                    EnumC33402EpZ enumC33402EpZ = EnumC33402EpZ.A06;
                                    Integer num = C05F.A0N;
                                    String str2 = viewOnAttachStateChangeListenerC110564yT.A0H;
                                    C38321qM c38321qM = viewOnAttachStateChangeListenerC110564yT.A04;
                                    InterfaceC11380iw interfaceC11380iw2 = interfaceC11380iw;
                                    AbstractC129875tr.A01(null, userSession3, c38321qM, null, null, viewOnAttachStateChangeListenerC110564yT.A0C, enumC33402EpZ, user2, null, num, viewOnAttachStateChangeListenerC110564yT.A0F, str2, null, null, interfaceC11380iw2.getModuleName(), null, viewOnAttachStateChangeListenerC110564yT.A0G);
                                    InterfaceC77503da interfaceC77503da = viewOnAttachStateChangeListenerC110564yT.A08;
                                    if (interfaceC77503da != null && interfaceC77503da.Eie()) {
                                        ViewOnAttachStateChangeListenerC110564yT.A01(interfaceC11380iw2, userSession3, viewOnAttachStateChangeListenerC110564yT, A0N, user2);
                                    }
                                    InterfaceC77503da interfaceC77503da2 = viewOnAttachStateChangeListenerC110564yT.A08;
                                    if (interfaceC77503da2 != null) {
                                        interfaceC77503da2.DWl();
                                    }
                                } else if (viewOnAttachStateChangeListenerC110564yT.A0O) {
                                    UserSession userSession4 = userSession;
                                    EnumC33402EpZ enumC33402EpZ2 = EnumC33402EpZ.A06;
                                    Integer num2 = C05F.A0N;
                                    String str3 = viewOnAttachStateChangeListenerC110564yT.A0H;
                                    AbstractC129875tr.A01(null, userSession4, viewOnAttachStateChangeListenerC110564yT.A04, null, null, viewOnAttachStateChangeListenerC110564yT.A0C, enumC33402EpZ2, user2, null, num2, viewOnAttachStateChangeListenerC110564yT.A0F, str3, null, null, interfaceC11380iw.getModuleName(), null, viewOnAttachStateChangeListenerC110564yT.A0G);
                                    InterfaceC77523dc interfaceC77523dc = viewOnAttachStateChangeListenerC110564yT.A0B;
                                    if (interfaceC77523dc != null) {
                                        interfaceC77523dc.DWr();
                                    }
                                } else if (viewOnAttachStateChangeListenerC110564yT.A0N) {
                                    UserSession userSession5 = userSession;
                                    EnumC33402EpZ enumC33402EpZ3 = EnumC33402EpZ.A06;
                                    Integer num3 = C05F.A0N;
                                    String str4 = viewOnAttachStateChangeListenerC110564yT.A0H;
                                    AbstractC129875tr.A01(null, userSession5, viewOnAttachStateChangeListenerC110564yT.A04, null, null, viewOnAttachStateChangeListenerC110564yT.A0C, enumC33402EpZ3, user2, null, num3, null, str4, null, null, interfaceC11380iw.getModuleName(), null, null);
                                    InterfaceC77543de interfaceC77543de = viewOnAttachStateChangeListenerC110564yT.A0A;
                                    if (interfaceC77543de != null) {
                                        interfaceC77543de.DWp();
                                    }
                                } else {
                                    ViewOnAttachStateChangeListenerC110564yT.A01(interfaceC11380iw, userSession, viewOnAttachStateChangeListenerC110564yT, A0N, user2);
                                }
                                followButtonBase2.setEnabled(true);
                            }
                            C0f9.A0C(-1242158427, A05);
                        }
                    };
                }
                C0fQ.A00(onClickListener, followButtonBase);
                followButtonBase.setOnLongClickListener(this.A01);
                return;
            }
            z = false;
        } else {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        boolean z2 = false;
        if (user == null) {
            z2 = true;
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Required params must not be null. Is userSession null: %b, is user null: %b, is analyticsModule null: %b", valueOf, Boolean.valueOf(z2), Boolean.valueOf(interfaceC11380iw == null));
        C14360o3.A07(formatStrLocaleSafe);
        C0w9.A03("FollowButtonHelper", formatStrLocaleSafe);
    }

    public final void A05(C19260xA c19260xA, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, SearchContext searchContext, InterfaceC77483dY interfaceC77483dY, User user, C1M1 c1m1, Double d, String str) {
        C19270xB c19270xB;
        C14360o3.A0B(userSession, 0);
        FollowStatus A0N = C57582kX.A00(userSession).A0N(user);
        FollowButtonBase followButtonBase = this.A0R;
        followButtonBase.A06(A0N);
        if (A0N == FollowStatus.A06) {
            Integer B7J = user.A03.B7J();
            if (B7J != null && B7J.intValue() > 0) {
                if (str != null) {
                    c19270xB = new C19270xB(str);
                } else {
                    c19270xB = null;
                }
                DialogInterfaceOnClickListenerC41817IfX dialogInterfaceOnClickListenerC41817IfX = new DialogInterfaceOnClickListenerC41817IfX(c19260xA, userSession, c38321qM, c75113Zb, searchContext, interfaceC77483dY, this, user, c1m1, d, str);
                IA6.A00(userSession, user, MSV.A00(263));
                Context context = followButtonBase.getRootView().requireViewById(R.id.content).getContext();
                C14360o3.A07(context);
                AbstractC35271Fh6.A05(context, dialogInterfaceOnClickListenerC41817IfX, new DialogInterfaceOnClickListenerC41804IfK(userSession, this, user), c19270xB, this.A09, user);
                return;
            }
            InterfaceC09390do interfaceC09390do = this.A0S;
            C34698FQj c34698FQj = (C34698FQj) interfaceC09390do.getValue();
            Integer num = C05F.A0C;
            if (c34698FQj.A01(userSession, user, num)) {
                C34698FQj c34698FQj2 = (C34698FQj) interfaceC09390do.getValue();
                Context context2 = followButtonBase.getRootView().requireViewById(R.id.content).getContext();
                C14360o3.A07(context2);
                c34698FQj2.A00(context2, userSession, user, num, "");
                return;
            }
        }
        A02(c19260xA, userSession, c38321qM, c75113Zb, searchContext, interfaceC77483dY, this, user, d, str);
    }

    public final void A06(UserSession userSession, User user) {
        FollowButtonBase followButtonBase = this.A0R;
        FollowStatus followStatus = FollowStatus.A06;
        followButtonBase.A06(followStatus);
        followButtonBase.setVisibility(0);
        followButtonBase.A05(userSession, followStatus, user, true, C3K8.A01(userSession));
    }

    public final void A07(UserSession userSession, User user) {
        C14360o3.A0B(userSession, 0);
        FollowStatus A0N = C57582kX.A00(userSession).A0N(user);
        FollowButtonBase followButtonBase = this.A0R;
        followButtonBase.A06(A0N);
        if (C2TN.A04(userSession, user)) {
            followButtonBase.setVisibility(8);
        } else {
            followButtonBase.setVisibility(0);
            followButtonBase.A05(userSession, A0N, user, this.A0Q, C3K8.A01(userSession));
        }
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT, FollowStatus followStatus, User user) {
        InterfaceC16820sZ interfaceC16820sZ = viewOnAttachStateChangeListenerC110564yT.A0L;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        Double d = null;
        if (followStatus == FollowStatus.A05 && user.A0M() != C05F.A01) {
            InterfaceC77483dY interfaceC77483dY = viewOnAttachStateChangeListenerC110564yT.A09;
            C38321qM c38321qM = viewOnAttachStateChangeListenerC110564yT.A04;
            C75113Zb c75113Zb = viewOnAttachStateChangeListenerC110564yT.A05;
            C19260xA c19260xA = viewOnAttachStateChangeListenerC110564yT.A03;
            C1M1 c1m1 = viewOnAttachStateChangeListenerC110564yT.A0E;
            String str = viewOnAttachStateChangeListenerC110564yT.A0K;
            SearchContext searchContext = viewOnAttachStateChangeListenerC110564yT.A07;
            C110974z9 c110974z9 = viewOnAttachStateChangeListenerC110564yT.A02;
            if (c110974z9 != null) {
                d = c110974z9.A0B;
            }
            DialogInterfaceOnClickListenerC41818IfY dialogInterfaceOnClickListenerC41818IfY = new DialogInterfaceOnClickListenerC41818IfY(c19260xA, userSession, c38321qM, c75113Zb, searchContext, interfaceC77483dY, viewOnAttachStateChangeListenerC110564yT, user, c1m1, d, str);
            Context context = viewOnAttachStateChangeListenerC110564yT.A0R.getRootView().requireViewById(R.id.content).getContext();
            C14360o3.A07(context);
            AbstractC35271Fh6.A06(context, dialogInterfaceOnClickListenerC41818IfY, new DialogInterfaceOnClickListenerC35316Fhr(viewOnAttachStateChangeListenerC110564yT), interfaceC11380iw, viewOnAttachStateChangeListenerC110564yT.A09, user);
            return;
        }
        InterfaceC77483dY interfaceC77483dY2 = viewOnAttachStateChangeListenerC110564yT.A09;
        C38321qM c38321qM2 = viewOnAttachStateChangeListenerC110564yT.A04;
        C75113Zb c75113Zb2 = viewOnAttachStateChangeListenerC110564yT.A05;
        C19260xA c19260xA2 = viewOnAttachStateChangeListenerC110564yT.A03;
        C1M1 c1m12 = viewOnAttachStateChangeListenerC110564yT.A0E;
        String str2 = viewOnAttachStateChangeListenerC110564yT.A0K;
        SearchContext searchContext2 = viewOnAttachStateChangeListenerC110564yT.A07;
        C110974z9 c110974z92 = viewOnAttachStateChangeListenerC110564yT.A02;
        if (c110974z92 != null) {
            d = c110974z92.A0B;
        }
        viewOnAttachStateChangeListenerC110564yT.A05(c19260xA2, userSession, c38321qM2, c75113Zb2, searchContext2, interfaceC77483dY2, user, c1m12, d, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C19260xA r21, com.instagram.common.session.UserSession r22, X.C38321qM r23, X.C75113Zb r24, com.instagram.search.common.analytics.SearchContext r25, X.InterfaceC77483dY r26, X.ViewOnAttachStateChangeListenerC110564yT r27, com.instagram.user.model.User r28, java.lang.Double r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnAttachStateChangeListenerC110564yT.A02(X.0xA, com.instagram.common.session.UserSession, X.1qM, X.3Zb, com.instagram.search.common.analytics.SearchContext, X.3dY, X.4yT, com.instagram.user.model.User, java.lang.Double, java.lang.String):void");
    }

    public final void A08(InterfaceC77483dY interfaceC77483dY) {
        this.A09 = interfaceC77483dY;
        if (interfaceC77483dY != null) {
            interfaceC77483dY.DHt(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A0T.A04 = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C110574yU c110574yU = this.A0T;
        c110574yU.A04 = false;
        C5SW c5sw = c110574yU.A01;
        if (c5sw != null && c5sw.A09()) {
            Runnable runnable = c110574yU.A03;
            Handler handler = c110574yU.A00;
            if (handler != null && runnable != null) {
                handler.removeCallbacks(runnable);
            }
            c5sw.A08(false);
        }
        c110574yU.A01 = null;
    }
}
