package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.venue.Venue;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.6rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151436rl implements InterfaceC151446rm {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final FragmentActivity A04;
    public final BusinessFlowAnalyticsLogger A05;
    public final UserSession A06;
    public final InterfaceC60442pS A07;
    public final UserDetailFragment A08;
    public final MUB A09;
    public final UserDetailLaunchConfig A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final C151456ro A0E;
    public final C156296zz A0F;
    public final AnonymousClass708 A0G;
    public final C154716xM A0H;
    public final String A0I;
    public final String A0J;

    @Override // X.InterfaceC151446rm
    public final void D0l(User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        String id = user.getId();
        String A06 = AbstractC38851rI.A06(user.B7L());
        MUB mub = this.A09;
        User user2 = mub.A03;
        if (user2 != null) {
            bool = Boolean.valueOf(user2.A1d());
        } else {
            bool = null;
        }
        FT3.A01(userSession, bool, str2, "call_phone_number", "business_profile", id, A06);
        Integer num = C05F.A00;
        UserDetailFragment userDetailFragment = this.A08;
        String str3 = this.A0C;
        String str4 = this.A0D;
        AbstractC34022F0b.A00(userSession, userDetailFragment, user, num, str3, str4);
        C1571673v.A08(userDetailFragment, userSession, A00(), "tap_call", mub.A02(), str3, str4, str);
        String Aqd = user.A03.Aqd();
        C14360o3.A0A(Aqd);
        int length = Aqd.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A00 = C14360o3.A00(Aqd.charAt(i2), 32);
            boolean z2 = false;
            if (A00 <= 0) {
                z2 = true;
            }
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!z2) {
                break;
            } else {
                length--;
            }
        }
        String A0R = AnonymousClass001.A0R("tel:", Aqd.subSequence(i, length + 1).toString());
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.addFlags(268435456);
        intent.setData(AbstractC08820cl.A01(this.A0E, A0R));
        C12260kU.A0I(intent, userDetailFragment);
    }

    @Override // X.InterfaceC151446rm
    public final void D0m(User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        String id = user.getId();
        String A06 = AbstractC38851rI.A06(user.B7L());
        MUB mub = this.A09;
        User user2 = mub.A03;
        if (user2 != null) {
            bool = Boolean.valueOf(user2.A1d());
        } else {
            bool = null;
        }
        FT3.A01(userSession, bool, str2, "text_phone_number", "business_profile", id, A06);
        Integer num = C05F.A01;
        UserDetailFragment userDetailFragment = this.A08;
        String str3 = this.A0C;
        String str4 = this.A0D;
        AbstractC34022F0b.A00(userSession, userDetailFragment, user, num, str3, str4);
        C1571673v.A08(userDetailFragment, userSession, A00(), "tap_text", mub.A02(), str3, str4, str);
        String Aqd = user.A03.Aqd();
        C14360o3.A0A(Aqd);
        int length = Aqd.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A00 = C14360o3.A00(Aqd.charAt(i2), 32);
            boolean z2 = false;
            if (A00 <= 0) {
                z2 = true;
            }
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!z2) {
                break;
            } else {
                length--;
            }
        }
        String obj = Aqd.subSequence(i, length + 1).toString();
        C14360o3.A0B(obj, 0);
        C12260kU.A03(AbstractC35101FdC.A00(obj, null), userDetailFragment);
    }

    @Override // X.InterfaceC151446rm
    public final void D0o(ArrayList arrayList) {
        FollowStatus followStatus;
        UserSession userSession = this.A06;
        String str = this.A0I;
        MUB mub = this.A09;
        String A02 = mub.A02();
        Parcelable.Creator creator = User.CREATOR;
        User user = mub.A03;
        Boolean bool = null;
        if (user != null) {
            followStatus = user.B7L();
        } else {
            followStatus = null;
        }
        String A06 = AbstractC38851rI.A06(followStatus);
        User user2 = mub.A03;
        if (user2 != null) {
            bool = Boolean.valueOf(user2.A1d());
        }
        FT3.A01(userSession, bool, str, "tap_contact", "business_profile", A02, A06);
        UserDetailFragment userDetailFragment = this.A08;
        C1571673v.A08(userDetailFragment, userSession, A00(), "tap_contact", mub.A02(), this.A0C, this.A0D, "button_tray");
        User user3 = mub.A03;
        C14360o3.A0A(user3);
        boolean A0C = AbstractC1567472a.A0C(user3);
        C18A A00 = AnonymousClass189.A00(userSession);
        User user4 = mub.A03;
        C14360o3.A0A(user4);
        A00.A01(user4, true, false);
        ImmutableList immutableList = C32363ENk.A02;
        C32363ENk A002 = FAB.A00(userSession, this, mub.A02(), arrayList, A0C);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0d = userDetailFragment.requireContext().getResources().getString(2131956642);
        c189448aO.A00().A03(userDetailFragment.requireContext(), A002);
    }

    @Override // X.InterfaceC151446rm
    public final void D0p(User user) {
        String str;
        UserSession userSession;
        C09530e4 c09530e4;
        C156296zz c156296zz = this.A0F;
        if (c156296zz != null && (c09530e4 = (C09530e4) c156296zz.A00.get(user.getId())) != null) {
            str = (String) c09530e4.A01;
        } else {
            str = null;
        }
        if (user.A02 == C17Q.A03 && str != null && str.length() != 0) {
            userSession = this.A06;
            FragmentActivity fragmentActivity = this.A04;
            C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A20, userSession);
            c116875Qr.A1D = str;
            c116875Qr.A1h = true;
            c116875Qr.A1d = false;
            AbstractC86593tX.A0X(fragmentActivity, c116875Qr.A00(), userSession);
        } else {
            String str2 = this.A0A.A0B;
            if (str2 == null) {
                java.util.Set set = FE3.A00;
                str2 = "profile";
            }
            C1YY A01 = FVI.A01();
            FragmentActivity fragmentActivity2 = this.A04;
            userSession = this.A06;
            A01.A05(fragmentActivity2, userSession, user.getId(), str2);
        }
        C1571673v.A08(this.A08, userSession, A00(), "subscribe_tap", this.A09.A02(), this.A0C, this.A0D, "user_profile_header");
    }

    @Override // X.InterfaceC151446rm
    public final void D0s(User user, String str) {
        String BIO = user.A03.BIO();
        C14360o3.A0A(BIO);
        UserSession userSession = this.A06;
        C1571673v.A08(this.A08, userSession, A00(), "tap_location", this.A09.A02(), this.A0C, this.A0D, str);
        FragmentActivity fragmentActivity = this.A04;
        Venue venue = new Venue();
        venue.A06(BIO);
        AbstractC68491VSw.A00(fragmentActivity, null, null, userSession, venue, null, "", null, false);
    }

    @Override // X.InterfaceC151446rm
    public final void D0y(User user, String str) {
        String str2;
        UserSession userSession = this.A06;
        Integer A0A = AbstractC1566271k.A0A(userSession, user);
        int intValue = A0A.intValue();
        if (intValue != 0 && intValue != 2 && intValue != 1) {
            if (intValue != 3) {
                if (intValue == 4) {
                    str2 = "";
                } else {
                    throw new RuntimeException();
                }
            } else {
                AbstractC1566271k.A0P(this.A04, userSession, this.A08.getModuleName(), "add_shop", false);
                str2 = "tap_add_shop";
            }
        } else {
            if (A0A == C05F.A00) {
                str2 = "tap_shop";
            } else {
                str2 = "tap_empty_shop";
            }
            if (AbstractC1566271k.A0T(userSession, user)) {
                UserDetailFragment userDetailFragment = this.A08;
                String str3 = this.A0B;
                String str4 = this.A0A.A0C;
                String A02 = this.A09.A02();
                C14360o3.A0B(A02, 6);
                AbstractC41775Ier.A02(null, userSession, null, userDetailFragment, str3, str4, null, A02, "mini_shops", null, null, null, null, null, null, null, null);
                C189448aO c189448aO = new C189448aO(userSession);
                c189448aO.A0d = userDetailFragment.requireContext().getString(2131973944);
                C189478aR A00 = c189448aO.A00();
                A00.A03(userDetailFragment.requireContext(), C1XJ.A00.A0T().A0G(userSession, new HZX(A00, this), user, this.A07.getModuleName(), null, this.A0C, this.A0D, null));
            } else {
                User A07 = AbstractC1566271k.A07(userSession, user);
                if (A07 != null) {
                    Agf(this.A07, A07, this.A0B).A05();
                }
            }
        }
        if (AbstractC199308rX.A04(userSession)) {
            C1XJ.A00.A0E(userSession).A00(this.A08, this.A04);
        }
        C1571673v.A08(this.A08, userSession, A00(), str2, this.A09.A02(), this.A0C, this.A0D, str);
    }

    @Override // X.InterfaceC151446rm
    public final void D0z(long j, String str) {
        C14360o3.A0B(str, 1);
        if (!this.A03) {
            C18920wW c18920wW = AbstractC99684dl.A00(this.A06).A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "fan_onboarding_subscription_button");
            A00.AAP("container_module", "profile");
            A00.A9K("creator_igid", Long.valueOf(j));
            A00.A7v("can_viewer_see_button", true);
            A00.AAP("button_type", str);
            A00.Cht();
            this.A03 = true;
        }
    }

    @Override // X.AnonymousClass742
    public final void DSz(String str, boolean z) {
        this.A0G.BiC().DSz(str, false);
    }

    @Override // X.InterfaceC151446rm
    public final void EkW(View view) {
        UserDetailFragment userDetailFragment = this.A08;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(userDetailFragment.A0I);
            if (!C2TN.A04(userDetailFragment.A0I, user)) {
                InterfaceC19630xq interfaceC19630xq = A00.A01;
                if (!interfaceC19630xq.getBoolean("smb_support_button_tooltip", false) && AbstractC152466tZ.A03(view)) {
                    C5SW c5sw = userDetailFragment.A0a;
                    if (c5sw == null) {
                        c5sw = AbstractC152466tZ.A02(userDetailFragment.requireActivity(), view, userDetailFragment.getString(2131974251, user.getUsername()));
                        userDetailFragment.A0a = c5sw;
                    }
                    if (!UserDetailFragment.A0i(userDetailFragment)) {
                        c5sw.A07(userDetailFragment.A0I);
                        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                        ARD.E77("smb_support_button_tooltip", true);
                        ARD.apply();
                    }
                }
            }
        }
        User user2 = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user2 != null) {
            C23031Ai A002 = AbstractC23021Ah.A00(userDetailFragment.A0I);
            if (!C2TN.A04(userDetailFragment.A0I, user2)) {
                InterfaceC16530ry interfaceC16530ry = A002.A52;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (!((Boolean) interfaceC16530ry.CES(A002, c0yrArr[285])).booleanValue() && AbstractC152466tZ.A03(view)) {
                    C5SW c5sw2 = userDetailFragment.A0b;
                    if (c5sw2 == null) {
                        c5sw2 = AbstractC152466tZ.A02(userDetailFragment.requireActivity(), view, userDetailFragment.getString(2131974250));
                        userDetailFragment.A0b = c5sw2;
                    }
                    if (!UserDetailFragment.A0i(userDetailFragment)) {
                        c5sw2.A07(userDetailFragment.A0I);
                        interfaceC16530ry.Egi(A002, true, c0yrArr[285]);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC151446rm
    public final void Ekp(View view) {
        UserDetailFragment userDetailFragment = this.A08;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user != null && !C2TN.A04(userDetailFragment.A0I, user) && WE6.A02(userDetailFragment.A0I)) {
            InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userDetailFragment.A0I).A01;
            if (interfaceC19630xq.getInt("profile_support_nonprofit_button_tooltip", 0) < 2 && AbstractC152466tZ.A03(view)) {
                C5SW c5sw = userDetailFragment.A0d;
                if (c5sw == null) {
                    c5sw = AbstractC152466tZ.A02(userDetailFragment.requireActivity(), view, userDetailFragment.getString(2131975006));
                    userDetailFragment.A0d = c5sw;
                }
                if (!UserDetailFragment.A0i(userDetailFragment)) {
                    c5sw.A07(userDetailFragment.A0I);
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E7D("profile_support_nonprofit_button_tooltip", interfaceC19630xq.getInt("profile_support_nonprofit_button_tooltip", 0) + 1);
                    ARD.apply();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0245, code lost:
    
        if (r13 <= r1.A01) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0264, code lost:
    
        if (r4 <= r1.A01) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020e  */
    @Override // X.InterfaceC151446rm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ekq(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151436rl.Ekq(android.view.View):void");
    }

    @Override // X.InterfaceC151446rm
    public final void ElI(View view) {
        String str;
        InterfaceC19610xo ARD;
        UserDetailFragment userDetailFragment = this.A08;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user != null) {
            boolean A04 = C2TN.A04(userDetailFragment.A0I, user);
            if (AbstractC152466tZ.A03(view) && !userDetailFragment.A1r) {
                UserSession userSession = userDetailFragment.A0I;
                C14360o3.A0B(userSession, 0);
                if (A04) {
                    C41768Iek c41768Iek = C41768Iek.A00;
                    if (!C41768Iek.A02(userSession, c41768Iek).getBoolean("has_shown_mini_shop_self_shop_tooltip", false)) {
                        String string = userDetailFragment.getString(2131966708);
                        C5SW c5sw = userDetailFragment.A0Y;
                        if (c5sw == null) {
                            c5sw = AbstractC152466tZ.A02(userDetailFragment.requireActivity(), view, string);
                            userDetailFragment.A0Y = c5sw;
                        }
                        if (!UserDetailFragment.A0i(userDetailFragment)) {
                            c5sw.A07(userDetailFragment.A0I);
                            UserSession userSession2 = userDetailFragment.A0I;
                            C14360o3.A0B(userSession2, 0);
                            ARD = C41768Iek.A02(userSession2, c41768Iek).ARD();
                            ARD.E77("has_shown_mini_shop_self_shop_tooltip", true);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    C41768Iek c41768Iek2 = C41768Iek.A00;
                    if (C41768Iek.A02(userSession, c41768Iek2).getBoolean("has_shown_mini_shop_other_shop_tooltip", false)) {
                        return;
                    }
                    User user2 = userDetailFragment.A10.A03;
                    if (user2 != null) {
                        str = user2.getUsername();
                    } else {
                        str = "";
                    }
                    String string2 = userDetailFragment.getString(2131966709, str);
                    C5SW c5sw2 = userDetailFragment.A0Y;
                    if (c5sw2 == null) {
                        c5sw2 = AbstractC152466tZ.A02(userDetailFragment.requireActivity(), view, string2);
                        userDetailFragment.A0Y = c5sw2;
                    }
                    if (UserDetailFragment.A0i(userDetailFragment)) {
                        return;
                    }
                    c5sw2.A07(userDetailFragment.A0I);
                    UserSession userSession3 = userDetailFragment.A0I;
                    C14360o3.A0B(userSession3, 0);
                    ARD = C41768Iek.A02(userSession3, c41768Iek2).ARD();
                    ARD.E77("has_shown_mini_shop_other_shop_tooltip", true);
                }
                ARD.apply();
            }
        }
    }

    @Override // X.InterfaceC151446rm
    public final void Elb(final View view) {
        final UserDetailFragment userDetailFragment = this.A08;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user != null) {
            final boolean z = AbstractC23021Ah.A00(userDetailFragment.A0I).A01.getBoolean("has_dismissed_link_sharing_profile_megaphone", false);
            C23031Ai A00 = AbstractC23021Ah.A00(userDetailFragment.A0I);
            UserSession userSession = userDetailFragment.A0I;
            C14360o3.A0B(userSession, 0);
            final boolean z2 = A00.A01.getBoolean("should_show_share_profile_long_press_tooltip", C18U.A06(C06090Tz.A05, userSession, 36330518471590799L));
            if (C2TN.A04(userDetailFragment.A0I, user)) {
                if (z || z2) {
                    view.postDelayed(new Runnable() { // from class: X.D2N
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable;
                            final UserDetailFragment userDetailFragment2 = userDetailFragment;
                            View view2 = view;
                            boolean z3 = z;
                            boolean z4 = z2;
                            if (AbstractC152466tZ.A03(view2)) {
                                if (z3) {
                                    userDetailFragment2.getString(2131973721);
                                    runnable = new Runnable() { // from class: X.D1C
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(UserDetailFragment.this.A0I));
                                            A0w.E77(AbstractC111324zv.A00(4532), false);
                                            A0w.apply();
                                        }
                                    };
                                } else {
                                    if (!z4) {
                                        return;
                                    }
                                    userDetailFragment2.getString(2131965787);
                                    runnable = new Runnable() { // from class: X.D1D
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(UserDetailFragment.this.A0I));
                                            A0w.E77("should_show_share_profile_long_press_tooltip", false);
                                            A0w.apply();
                                        }
                                    };
                                }
                                C5SW c5sw = userDetailFragment2.A0Z;
                                if (c5sw == null) {
                                    c5sw = AbstractC152466tZ.A00(userDetailFragment2.requireActivity(), view2, EnumC58132lV.A03, userDetailFragment2.getString(2131973721));
                                    userDetailFragment2.A0Z = c5sw;
                                }
                                if (!UserDetailFragment.A0i(userDetailFragment2) && c5sw != null) {
                                    c5sw.A07(userDetailFragment2.A0I);
                                    runnable.run();
                                }
                            }
                        }
                    }, 500L);
                }
            }
        }
    }

    @Override // X.InterfaceC151446rm
    public final void Eli(View view) {
        UserDetailFragment userDetailFragment = this.A08;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.getActivity() != null && user != null && !C2TN.A04(userDetailFragment.A0I, user) && AbstractC152466tZ.A03(view) && !UserDetailFragment.A0i(userDetailFragment)) {
            InterfaceC19630xq interfaceC19630xq = AbstractC149676oK.A00(userDetailFragment.A0I).A01;
            int i = interfaceC19630xq.getInt("profile_subscribe_button_tooltip_count_new", 0);
            long j = interfaceC19630xq.getLong("profile_subscribe_button_tooltip_timestamp_new", 0L);
            C16910sj c16910sj = C16910sj.A00;
            java.util.Set stringSet = interfaceC19630xq.getStringSet("profile_subscribe_button_tooltip_creator_set_new", c16910sj);
            if (stringSet == null) {
                stringSet = c16910sj;
            }
            HashSet hashSet = new HashSet(AbstractC001800i.A0j(stringSet));
            if (AbstractC63292u7.A03(userDetailFragment.A0I) && user.A02 != C17Q.A06 && !hashSet.contains(user.getId()) && i < 10 && System.currentTimeMillis() - j >= 86400000) {
                if (userDetailFragment.A0c == null) {
                    userDetailFragment.A0c = AbstractC152466tZ.A02(userDetailFragment.requireActivity(), view, userDetailFragment.getString(2131974796));
                }
                hashSet.add(user.getId());
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7L("profile_subscribe_button_tooltip_creator_set_new", hashSet);
                ARD.apply();
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7D("profile_subscribe_button_tooltip_count_new", i + 1);
                ARD2.apply();
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
                ARD3.E7G("profile_subscribe_button_tooltip_timestamp_new", currentTimeMillis);
                ARD3.apply();
                userDetailFragment.A0c.A07(userDetailFragment.A0I);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.6ro] */
    public C151436rl(FragmentActivity fragmentActivity, BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C156296zz c156296zz, AnonymousClass708 anonymousClass708, UserDetailFragment userDetailFragment, MUB mub, UserDetailLaunchConfig userDetailLaunchConfig, C154716xM c154716xM, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str5, 9);
        C14360o3.A0B(c154716xM, 14);
        this.A06 = userSession;
        this.A08 = userDetailFragment;
        this.A04 = fragmentActivity;
        this.A09 = mub;
        this.A0C = str;
        this.A0D = str2;
        this.A0J = str3;
        this.A0B = str4;
        this.A0I = str5;
        this.A07 = interfaceC60442pS;
        this.A0F = c156296zz;
        this.A0A = userDetailLaunchConfig;
        this.A05 = businessFlowAnalyticsLogger;
        this.A0H = c154716xM;
        this.A0G = anonymousClass708;
        this.A00 = "";
        this.A01 = "";
        this.A0E = new InterfaceC08100bW() { // from class: X.6ro
            @Override // X.InterfaceC08100bW
            public final void EH9(String str6) {
            }

            @Override // X.InterfaceC08100bW
            public final void EHA(String str6, String str7, Throwable th) {
                C14360o3.A0B(str6, 0);
                C14360o3.A0B(str7, 1);
                C14360o3.A0A(th);
                C0w9.A05(str6, str7, 1, th);
            }
        };
    }

    private final EnumC1571773w A00() {
        User user = this.A09.A03;
        if (user != null) {
            UserSession userSession = this.A06;
            if (C14360o3.A0K(userSession.userId, user.getId())) {
                return EnumC1571773w.A05;
            }
            if (C57582kX.A00(userSession).A0N(user) == FollowStatus.A05) {
                return EnumC1571773w.A03;
            }
        }
        return EnumC1571773w.A04;
    }

    private final void A01(User user, int i) {
        FragmentActivity fragmentActivity = this.A04;
        UserSession userSession = this.A06;
        UserDetailFragment userDetailFragment = this.A08;
        C36881nl A01 = C36881nl.A01(fragmentActivity, userDetailFragment, userSession, "contact_sheet");
        List singletonList = Collections.singletonList(new PendingRecipient(user));
        C14360o3.A07(singletonList);
        A01.A0B = new C122145g6(singletonList);
        A01.A0Z = userDetailFragment.requireContext().getString(i);
        A01.A0n = true;
        A01.A01 = userDetailFragment;
        A01.A06();
    }

    @Override // X.InterfaceC151446rm
    public final C41749IeN Agf(InterfaceC60442pS interfaceC60442pS, User user, String str) {
        C41749IeN A0N = C1XJ.A00.A0N(this.A04, user.A0A(), this.A06, interfaceC60442pS, str, interfaceC60442pS.getModuleName(), "mini_shop_storefront_hia", user.getId(), user.getUsername());
        A0N.A0C = this.A09.A02();
        String str2 = this.A0C;
        String str3 = this.A0D;
        A0N.A0E = str2;
        A0N.A0F = str3;
        A0N.A00 = this.A08;
        return A0N;
    }

    @Override // X.InterfaceC151446rm
    public final String Ayg() {
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r17.length() == 0) goto L6;
     */
    @Override // X.InterfaceC151446rm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0f(com.instagram.user.model.User r20, java.lang.String r21) {
        /*
            r19 = this;
            r18 = 0
            r10 = r20
            X.17P r0 = r10.A03
            java.lang.String r17 = r0.B5D()
            X.17P r0 = r10.A03
            java.lang.String r11 = r0.B4t()
            if (r17 == 0) goto L19
            int r0 = r17.length()
            r1 = 0
            if (r0 != 0) goto L1a
        L19:
            r1 = 1
        L1a:
            java.lang.String r2 = "app_id"
            r0 = r19
            r9 = r21
            if (r1 != 0) goto L79
            X.0xA r11 = new X.0xA
            r11.<init>()
            X.17P r1 = r10.A03
            java.lang.String r1 = r1.B5A()
            X.C19260xA.A00(r11, r1, r2)
            com.instagram.common.session.UserSession r3 = r0.A06
            java.lang.String r13 = r0.A0I
            java.lang.String r15 = r10.getId()
            com.instagram.user.model.FollowStatus r1 = r10.B7L()
            java.lang.String r16 = X.AbstractC38851rI.A06(r1)
            java.lang.String r14 = "book_appointment"
            r12 = r3
            X.FT3.A00(r11, r12, r13, r14, r15, r16)
            com.instagram.profile.fragment.UserDetailFragment r2 = r0.A08
            X.73w r4 = r0.A00()
            X.MUB r1 = r0.A09
            java.lang.String r6 = r1.A02()
            java.lang.String r7 = r0.A0C
            java.lang.String r8 = r0.A0D
            java.lang.String r5 = "tap_fbe"
            X.C1571673v.A08(r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.fragment.app.FragmentActivity r14 = r2.requireActivity()
            X.2Fb r16 = X.C2Fb.A2z
            X.SjR r1 = new X.SjR
            r13 = r1
            r15 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            java.lang.String r0 = r10.getId()
            r1.A0E(r0)
            java.lang.String r0 = r2.getModuleName()
            r1.A0S = r0
            r1.A0A()
            return
        L79:
            if (r11 == 0) goto Lcb
            int r1 = r11.length()
            if (r1 == 0) goto Lcb
            X.0xA r12 = new X.0xA
            r12.<init>()
            X.17P r1 = r10.A03
            java.lang.String r1 = r1.B4q()
            X.C19260xA.A00(r12, r1, r2)
            com.instagram.common.session.UserSession r3 = r0.A06
            java.lang.String r14 = r0.A0I
            java.lang.String r16 = r10.getId()
            com.instagram.user.model.FollowStatus r1 = r10.B7L()
            java.lang.String r17 = X.AbstractC38851rI.A06(r1)
            java.lang.String r15 = "book_appointment"
            r13 = r3
            X.FT3.A00(r12, r13, r14, r15, r16, r17)
            com.instagram.profile.fragment.UserDetailFragment r2 = r0.A08
            X.73w r4 = r0.A00()
            X.MUB r1 = r0.A09
            java.lang.String r6 = r1.A02()
            java.lang.String r7 = r0.A0C
            java.lang.String r8 = r0.A0D
            java.lang.String r5 = "tap_instant_experience"
            X.C1571673v.A08(r2, r3, r4, r5, r6, r7, r8, r9)
            android.content.Context r7 = r2.requireContext()
            androidx.fragment.app.FragmentActivity r6 = r0.A04
            X.2Fb r9 = X.C2Fb.A2z
            java.lang.String r12 = r2.getModuleName()
            r8 = r3
            X.AbstractC62255S4a.A00(r6, r7, r8, r9, r10, r11, r12)
            return
        Lcb:
            java.lang.Class<X.6rm> r0 = X.InterfaceC151446rm.class
            java.lang.String r1 = r0.getName()
            X.C14360o3.A07(r1)
            java.lang.String r0 = "CTA url is empty"
            X.C0w9.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151436rl.D0f(com.instagram.user.model.User, java.lang.String):void");
    }

    @Override // X.InterfaceC151446rm
    public final void D0i(Context context, User user, String str) {
        ((GBV) this.A0G.A0X.getValue()).A07(context, user, str);
    }

    @Override // X.InterfaceC151446rm
    public final void D0j(User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        String id = user.getId();
        String A06 = AbstractC38851rI.A06(user.B7L());
        MUB mub = this.A09;
        User user2 = mub.A03;
        if (user2 != null) {
            bool = Boolean.valueOf(user2.A1d());
        } else {
            bool = null;
        }
        FT3.A01(userSession, bool, str2, "send_email", "business_profile", id, A06);
        Integer num = C05F.A0C;
        UserDetailFragment userDetailFragment = this.A08;
        String str3 = this.A0C;
        String str4 = this.A0D;
        AbstractC34022F0b.A00(userSession, userDetailFragment, user, num, str3, str4);
        C1571673v.A09(userDetailFragment, userSession, A00(), "tap_email", mub.A02(), str3, str4, this.A0J, str);
        String A0R = AnonymousClass001.A0R("mailto:", user.A03.Bj6());
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setType(AbstractC43591JPw.A00(478));
        intent.addFlags(268435456);
        intent.setData(AbstractC08820cl.A01(this.A0E, A0R));
        C12260kU.A0I(intent, userDetailFragment);
    }

    @Override // X.InterfaceC151446rm
    public final void D0k(User user, String str) {
        Boolean Bvd;
        UserDetailFragment userDetailFragment = this.A08;
        if (userDetailFragment.A12()) {
            C193328hC c193328hC = new C193328hC(userDetailFragment.requireContext());
            c193328hC.A0A(2131954421);
            c193328hC.A09(2131954420);
            c193328hC.A0F(DialogInterfaceOnClickListenerC28558Ciq.A00);
            C0fJ.A00(c193328hC.A02());
            return;
        }
        C19260xA c19260xA = new C19260xA();
        C19260xA.A00(c19260xA, str, "click_point");
        MUB mub = this.A09;
        User user2 = mub.A03;
        if (user2 != null && (Bvd = user2.A03.Bvd()) != null) {
            C19260xA.A00(c19260xA, Bvd.toString(), AbstractC58317Pt9.A00(367));
        }
        UserSession userSession = this.A06;
        FT3.A00(c19260xA, userSession, this.A0I, "tap_audio_call", user.getId(), AbstractC38851rI.A06(user.B7L()));
        if (C14360o3.A0K(str, "contact_sheet")) {
            AbstractC34022F0b.A00(userSession, userDetailFragment, user, C05F.A0Y, this.A0C, this.A0D);
        }
        C1571673v.A08(userDetailFragment, userSession, A00(), "tap_audio_call", mub.A02(), this.A0C, this.A0D, str);
        if (C36711nU.A00 == null) {
            C14360o3.A0F("instance");
            throw C00O.createAndThrow();
        }
        FQS fqs = new FQS(userDetailFragment, userDetailFragment, userSession, C7T3.A04);
        if (C14360o3.A0K(str, "button_tray")) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A00.A0S;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!((Boolean) interfaceC16530ry.CES(A00, c0yrArr[240])).booleanValue()) {
                C50674MYs c50674MYs = new C50674MYs(userDetailFragment.requireContext(), userSession);
                String string = userDetailFragment.requireContext().getString(2131963914);
                C14360o3.A07(string);
                c50674MYs.A0B(string, new ViewOnClickListenerC35558FnA(fqs, user));
                c50674MYs.A01(ViewOnClickListenerC23247ASi.A00, 2131954754);
                new C31727DwY(c50674MYs).A05(userDetailFragment.requireActivity());
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                A002.A0S.Egi(A002, true, c0yrArr[240]);
                return;
            }
        }
        fqs.A00(user);
    }

    @Override // X.InterfaceC151446rm
    public final void D0n(Context context, User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        String id = user.getId();
        String A06 = AbstractC38851rI.A06(user.B7L());
        MUB mub = this.A09;
        User user2 = mub.A03;
        if (user2 != null) {
            bool = Boolean.valueOf(user2.A1d());
        } else {
            bool = null;
        }
        FT3.A01(userSession, bool, str2, "whatsapp", "business_profile", id, A06);
        C1571673v.A08(this.A08, userSession, A00(), "tap_whatsapp", mub.A02(), this.A0C, this.A0D, str);
        if (!AbstractC14490oL.A0G(context) && !AbstractC14490oL.A0J(context.getPackageManager(), "com.whatsapp.w4b")) {
            AbstractC14490oL.A07(context, "com.whatsapp", null);
        } else {
            AbstractC41776Ies.A03(this.A04, this.A00);
        }
    }

    @Override // X.InterfaceC151446rm
    public final void D0q(User user) {
        HashMap A00;
        String str;
        long j;
        UserSession userSession = this.A06;
        Context requireContext = this.A08.requireContext();
        if (WE6.A02(userSession)) {
            boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36314725876763420L);
            A00 = WE6.A01(user);
            j = 600;
            if (A06) {
                str = "com.instagram.social_impact.support_nonprofit_bottom_sheet.screen";
            } else {
                str = "com.instagram.social_impact.support_nonprofit_bottom_sheet.action";
            }
        } else {
            if (!WE6.A03(user) || !C18U.A06(C06090Tz.A06, userSession, 36313849703500048L)) {
                return;
            }
            A00 = WE6.A00(user);
            str = "com.bloks.www.ig.giving.profile_fundraiser.donate.screen";
            j = 600;
        }
        AbstractC54282Nz2.A00(requireContext, userSession, str, A00, j);
    }

    @Override // X.InterfaceC151446rm
    public final void D0r(User user, String str) {
        C44J c44j;
        UserSession userSession = this.A06;
        UserDetailFragment userDetailFragment = this.A08;
        MUB mub = this.A09;
        C1571673v.A08(userDetailFragment, userSession, C1571673v.A00(userSession, mub.A03), "donate_tap", mub.A02(), this.A0C, this.A0D, "button_tray");
        Context requireContext = userDetailFragment.requireContext();
        if (WE6.A02(userSession)) {
            if (C18U.A06(C06090Tz.A05, userSession, 36314725876763420L)) {
                C66277U6x.A01("com.instagram.social_impact.support_nonprofit_bottom_sheet.screen", WE6.A01(user)).A05(userDetailFragment.requireContext(), new IgBloksScreenConfig(userSession));
                return;
            }
            HashMap A01 = WE6.A01(user);
            Context requireContext2 = userDetailFragment.requireContext();
            AbstractC191798eb.A00(requireContext2, new C191778eZ(userSession), "com.instagram.social_impact.support_nonprofit_bottom_sheet.action", null, A01, 0L).A9b(new C42221In7(requireContext2, C62862tP.A03(userDetailFragment, userSession, null)));
            return;
        }
        if (WE6.A03(user) && C18U.A06(C06090Tz.A05, userSession, 36313849703500048L)) {
            C66277U6x.A01("com.bloks.www.ig.giving.profile_fundraiser.donate.screen", WE6.A00(user)).A05(requireContext, new IgBloksScreenConfig(userSession));
            AbstractC191798eb.A01(requireContext, new C191778eZ(userSession), "com.bloks.www.ig.giving.profile_fundraiser.donate.screen", null, WE6.A00(user));
            return;
        }
        V00 v00 = new V00();
        v00.A06 = new C42785IwN(requireContext, userDetailFragment, userSession, user);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putSerializable("fundraiser_entrypoint", EnumC68135VCu.ACTION_BUTTON);
        C44K AnF = user.A03.AnF();
        if (AnF != null) {
            c44j = AnF.F56();
        } else {
            c44j = null;
        }
        if (c44j == null) {
            C0w9.A03("ProfileFundraiserUtil", "Could not json serialize FundraiserDonateActionButtonModel for the fundraiser consumption sheet.");
            return;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            C44C.A00(A0A, c44j);
            A0A.close();
            bundle.putString("fundraiser_donate_action_button_model_json", stringWriter.toString());
            v00.setArguments(bundle);
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0a = false;
            c189448aO.A0d = requireContext.getString(2131970136);
            c189448aO.A00().A03(requireContext, v00);
        } catch (IOException unused) {
            C0w9.A03("ProfileFundraiserUtil", "Could not json serialize FundraiserDonateActionButtonModel for the fundraiser consumption sheet.");
        }
    }

    @Override // X.InterfaceC151446rm
    public final void D0t(C193328hC c193328hC) {
        UserSession userSession = this.A06;
        UserDetailFragment userDetailFragment = this.A08;
        C1571673v.A08(userDetailFragment, userSession, A00(), "tap_more", this.A09.A02(), this.A0C, this.A0D, "button_tray");
        c193328hC.A0m(userDetailFragment, userSession);
        C0fJ.A00(c193328hC.A02());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC151446rm
    public final void D0u() {
        UserSession userSession = this.A06;
        AbstractC25651Mw.A00(userSession).A05(new Object());
        Bundle bundle = new Bundle();
        bundle.putString("edit_profile_entry", "profile");
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "profile");
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        AbstractC155756z4.A00().A01();
        OnboardingCheckListFragment onboardingCheckListFragment = new OnboardingCheckListFragment();
        onboardingCheckListFragment.setArguments(bundle);
        C140966Yy c140966Yy = new C140966Yy(this.A04, userSession);
        c140966Yy.A0B(null, onboardingCheckListFragment);
        c140966Yy.A04();
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A05;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("self_profile", "self_profile", "onboarding_checklist", null, null, null, null, null));
        }
    }

    @Override // X.InterfaceC151446rm
    public final void D0v(User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        String id = user.getId();
        String A06 = AbstractC38851rI.A06(user.B7L());
        MUB mub = this.A09;
        User user2 = mub.A03;
        if (user2 != null) {
            bool = Boolean.valueOf(user2.A1d());
        } else {
            bool = null;
        }
        FT3.A01(userSession, bool, str2, "tap_request_email", "business_profile", id, A06);
        C1571673v.A08(this.A08, userSession, A00(), "tap_request_email", mub.A02(), this.A0C, this.A0D, "contact_sheet");
        A01(user, 2131972425);
    }

    @Override // X.InterfaceC151446rm
    public final void D0w(User user, String str) {
        Boolean bool;
        UserSession userSession = this.A06;
        String str2 = this.A0I;
        String id = user.getId();
        String A06 = AbstractC38851rI.A06(user.B7L());
        MUB mub = this.A09;
        User user2 = mub.A03;
        if (user2 != null) {
            bool = Boolean.valueOf(user2.A1d());
        } else {
            bool = null;
        }
        FT3.A01(userSession, bool, str2, "tap_request_phone", "business_profile", id, A06);
        C1571673v.A08(this.A08, userSession, A00(), "tap_request_phone", mub.A02(), this.A0C, this.A0D, "contact_sheet");
        A01(user, 2131972427);
    }

    @Override // X.InterfaceC151446rm
    public final void D0x(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", str);
        hashMap.put("referrer", "profile_cta");
        String A0R = AnonymousClass001.A0R(C151436rl.class.getName(), ".BACK_STACK");
        C66277U6x A01 = C66277U6x.A01("com.bloks.www.bloks.ig.menu", hashMap);
        UserSession userSession = this.A06;
        C72743Nv A02 = W6d.A02(new IgBloksScreenConfig(userSession), A01);
        C140966Yy c140966Yy = new C140966Yy(this.A04, userSession);
        c140966Yy.A0A = A0R;
        c140966Yy.A0D(A02);
        c140966Yy.A04();
    }

    @Override // X.InterfaceC151446rm
    public final void D10(User user, String str) {
        String url;
        ActionButtonPartnerType actionButtonPartnerType;
        InterfaceC111194zh Ayj;
        long j;
        UserDetailFragment userDetailFragment = this.A08;
        User user2 = userDetailFragment.A10.A03;
        if (AbstractC1566171j.A05(user2)) {
            String str2 = null;
            InterfaceC111194zh Ayj2 = user2.A03.Ayj();
            if (Ayj2 != null) {
                C154866xb c154866xb = userDetailFragment.A0E;
                String AcH = Ayj2.AcH();
                String Bba = Ayj2.Bba();
                String url2 = Ayj2.getUrl();
                String id = user2.getId();
                String Amd = Ayj2.Amd();
                String Aj3 = Ayj2.Aj3();
                C14360o3.A0B(AcH, 0);
                C14360o3.A0B(Bba, 1);
                C14360o3.A0B(url2, 2);
                C14360o3.A0B(Amd, 4);
                Long A0k = AbstractC003100w.A0k(10, id);
                if (A0k != null) {
                    j = A0k.longValue();
                } else {
                    j = 0;
                }
                C18920wW c18920wW = c154866xb.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_smb_partner_flow_consumer");
                long j2 = c154866xb.A00;
                A00.A9K("igid", Long.valueOf(j2));
                A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "support_button");
                A00.AAP("action", "tap");
                A00.AAP(AbstractC58410Puo.A00(), c154866xb.A02);
                boolean z = false;
                if (j2 == j) {
                    z = true;
                }
                A00.A7v("is_profile_owner", Boolean.valueOf(z));
                A00.A9K("profile_owner_id", Long.valueOf(j));
                A00.AAP("service_type", Amd);
                A00.A9K("partner_id", AbstractC003100w.A0k(10, AcH));
                A00.AAP("partner_name", Bba);
                A00.AAP("url", url2);
                A00.AAP("button_label", Aj3);
                A00.Cht();
                if (Ayj2.Bbb() == ActionButtonPartnerType.A04) {
                    userDetailFragment.A0x("support", "tap_fbe");
                }
                str2 = Ayj2.Amd();
            }
            userDetailFragment.A0x("support", "tap_support");
            if (str2 != null) {
                userDetailFragment.A0x("support", AnonymousClass001.A0R("tap_", str2));
            }
        }
        InterfaceC111194zh Ayj3 = user.A03.Ayj();
        C14360o3.A0A(Ayj3);
        SMBPartnerType A002 = AbstractC81793ku.A00(Ayj3.Amd());
        if (A002 == SMBPartnerType.A07) {
            AnonymousClass001.A0R(C151436rl.class.getName(), ".BACK_STACK");
            C35226FgJ.A01(this.A04, this.A06, EnumC53251Ngp.A05, user);
            return;
        }
        UserSession userSession = this.A06;
        InterfaceC111194zh Ayj4 = user.A03.Ayj();
        if (Ayj4 == null) {
            url = "";
        } else {
            url = Ayj4.getUrl();
        }
        C14360o3.A07(url);
        if (url.length() <= 0) {
            return;
        }
        InterfaceC111194zh Ayj5 = user.A03.Ayj();
        if (Ayj5 != null) {
            actionButtonPartnerType = Ayj5.Bbb();
        } else {
            actionButtonPartnerType = null;
        }
        FragmentActivity fragmentActivity = this.A04;
        if (!AbstractC1566171j.A04(fragmentActivity, actionButtonPartnerType, A002, url)) {
            C63397SjR c63397SjR = new C63397SjR(fragmentActivity, userSession, C2Fb.A3V, url, false);
            c63397SjR.A0E(userSession.userId);
            c63397SjR.A0S = userDetailFragment.getModuleName();
            c63397SjR.A0A();
            return;
        }
        User user3 = userDetailFragment.A10.A03;
        if (!AbstractC1566171j.A05(user3) || (Ayj = user3.A03.Ayj()) == null) {
            return;
        }
        userDetailFragment.A0E.A00(Ayj.AcH(), Ayj.Bba(), Ayj.getUrl(), user3.getId(), Ayj.Amd());
    }

    @Override // X.AnonymousClass742
    public final void DT3(boolean z) {
        if (!this.A02 && z) {
            BP5 bp5 = new BP5(this.A06, null);
            String A02 = this.A09.A02();
            C14360o3.A0B(A02, 0);
            BP5.A00(bp5, AbstractC003100w.A0k(10, A02), "profile_stardust_message_icon_impression");
            this.A02 = true;
        }
    }

    @Override // X.InterfaceC151446rm
    public final void EDh(View view, User user) {
        String str;
        String str2;
        UserSession userSession = this.A06;
        if (AbstractC1566271k.A0S(userSession, user)) {
            if (AbstractC1566271k.A0T(userSession, user)) {
                str = "mini_shops";
            } else {
                str = "mini_shop_storefront_hia";
            }
            User A07 = AbstractC1566271k.A07(userSession, user);
            if (A07 != null) {
                str2 = A07.getId();
            } else {
                str2 = null;
            }
            C154716xM c154716xM = this.A0H;
            String id = user.getId();
            String str3 = this.A0A.A0C;
            String str4 = this.A0B;
            String str5 = this.A0C;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = this.A0D;
            if (str6 == null) {
                str6 = "";
            }
            c154716xM.A00(view, null, id, str2, str3, str, null, str4, str5, str6);
        }
    }

    @Override // X.InterfaceC151446rm
    public final void FAm(Class cls, String str) {
        final C9CN A00 = C97F.A00(cls);
        UserSession userSession = this.A06;
        new C65933Twe(new C97O(userSession, C05F.A01), userSession).A00(A00, new C97X() { // from class: X.9JL
            @Override // X.C97X
            public final void onError(Throwable th) {
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
            
                if (X.C14360o3.A0K(r0, r8) == false) goto L24;
             */
            @Override // X.C97X
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r11) {
                /*
                    r10 = this;
                    X.Twv r11 = (X.C65950Twv) r11
                    r0 = 0
                    X.C14360o3.A0B(r11, r0)
                    X.9Im r2 = r11.A00
                    if (r2 == 0) goto L79
                    X.6rl r4 = r2
                    com.instagram.common.session.UserSession r7 = r4.A06
                    X.9CN r1 = r1
                    java.lang.String r0 = r2.A00(r1, r7)
                    if (r0 == 0) goto L79
                    java.lang.String r9 = r2.A00(r1, r7)
                    r5 = r9
                    r8 = r9
                    java.lang.String r2 = r4.A0C
                    r3 = 0
                    if (r2 == 0) goto L55
                    X.1w7 r1 = X.AbstractC41561w6.A00(r7)
                    boolean r0 = X.AbstractC41641wE.A00
                    if (r0 != 0) goto L55
                    java.util.Map r0 = r1.A00
                    java.lang.Object r0 = r0.get(r2)
                    X.1v4 r0 = (X.C40971v4) r0
                    if (r0 == 0) goto L55
                    com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = r0.A09
                    if (r0 == 0) goto L55
                    com.instagram.api.schemas.WhatsAppAttributionInfo r6 = r0.CHW()
                    if (r6 == 0) goto L55
                    r2 = 43
                    java.lang.String r0 = r6.AZS()
                    java.lang.String r1 = ""
                    if (r0 != 0) goto L48
                    r0 = r1
                L48:
                    java.lang.String r0 = X.AnonymousClass001.A0D(r0, r2)
                    if (r9 != 0) goto L4f
                    r8 = r1
                L4f:
                    boolean r0 = X.C14360o3.A0K(r0, r8)
                    if (r0 != 0) goto L56
                L55:
                    r6 = r3
                L56:
                    java.lang.String r3 = ""
                    if (r6 == 0) goto L7a
                    X.0Tz r2 = X.C06090Tz.A05
                    r0 = 36330685975249885(0x811291000043dd, double:3.039010330453687E-306)
                    boolean r0 = X.C18U.A06(r2, r7, r0)
                    if (r0 == 0) goto L7a
                    java.lang.String r0 = r6.AYb()
                    if (r0 != 0) goto L6e
                    r0 = r3
                L6e:
                    r4.A00 = r0
                    java.lang.String r0 = r6.AZS()
                    if (r0 == 0) goto L77
                    r3 = r0
                L77:
                    r4.A01 = r3
                L79:
                    return
                L7a:
                    java.lang.String r1 = "whatsapp://send?phone="
                    r0 = r9
                    if (r9 != 0) goto L80
                    r0 = r3
                L80:
                    java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
                    r4.A00 = r0
                    if (r9 != 0) goto L89
                    r5 = r3
                L89:
                    r4.A01 = r5
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C9JL.onSuccess(java.lang.Object):void");
            }
        }, str);
    }
}
