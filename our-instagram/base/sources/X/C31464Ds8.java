package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Ds8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31464Ds8 extends C1P1 {
    public final /* synthetic */ UserDetailFragment A00;
    public final /* synthetic */ User A01;

    public C31464Ds8(UserDetailFragment userDetailFragment, User user) {
        this.A00 = userDetailFragment;
        this.A01 = user;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        List list;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        int A03 = C0f9.A03(196140253);
        C152486tb c152486tb = (C152486tb) obj;
        int A032 = C0f9.A03(-129133379);
        super.onSuccess(c152486tb);
        if (c152486tb != null && (list = c152486tb.A00) != null && ImmutableList.copyOf((Collection) list) != null) {
            List list2 = c152486tb.A00;
            if (list2 != null) {
                immutableList = ImmutableList.copyOf((Collection) list2);
            } else {
                immutableList = null;
            }
            if (!immutableList.isEmpty()) {
                List list3 = c152486tb.A00;
                if (list3 != null) {
                    immutableList2 = ImmutableList.copyOf((Collection) list3);
                } else {
                    immutableList2 = null;
                }
                UserDetailFragment userDetailFragment = this.A00;
                if (userDetailFragment.A09 != null) {
                    UserSession userSession = userDetailFragment.A0I;
                    User user = this.A01;
                    if (C1AD.A06(C06090Tz.A05, 2324140325808898794L) || AbstractC35181FfY.A03(userSession, user)) {
                        userDetailFragment.A11.A07 = immutableList2;
                        userDetailFragment.A09.Eka(true);
                        ViewOnClickListenerC35684FpJ.A00(userDetailFragment.A09.C94(), this, immutableList2, user, 44);
                        IgTextView C94 = userDetailFragment.A09.C94();
                        User user2 = userDetailFragment.A10.A03;
                        if (userDetailFragment.getActivity() != null && user2 != null) {
                            C23031Ai A00 = AbstractC23021Ah.A00(userDetailFragment.A0I);
                            String id = user2.getId();
                            InterfaceC19630xq interfaceC19630xq = A00.A01;
                            java.util.Set C2v = interfaceC19630xq.C2v("featured_accounts_tooltip_shown_account_set");
                            if (C2v.size() < 2 && !C2v.contains(id)) {
                                C5SW c5sw = userDetailFragment.A0W;
                                if (c5sw == null) {
                                    c5sw = AbstractC152466tZ.A00(userDetailFragment.requireActivity(), C94, EnumC58132lV.A03, userDetailFragment.getString(2131962366));
                                    userDetailFragment.A0W = c5sw;
                                }
                                if (!UserDetailFragment.A0i(userDetailFragment)) {
                                    c5sw.A07(userDetailFragment.A0I);
                                    java.util.Set A0j = AbstractC001800i.A0j(interfaceC19630xq.C2v("featured_accounts_tooltip_shown_account_set"));
                                    A0j.add(id);
                                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                                    ARD.EEj("featured_accounts_tooltip_shown_account_set");
                                    ARD.apply();
                                    InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                                    ARD2.E7L("featured_accounts_tooltip_shown_account_set", A0j);
                                    ARD2.apply();
                                }
                            }
                        }
                    }
                }
                i = -593033010;
                C0f9.A0A(i, A032);
                C0f9.A0A(-1796812109, A03);
            }
        }
        i = -325896239;
        C0f9.A0A(i, A032);
        C0f9.A0A(-1796812109, A03);
    }
}
