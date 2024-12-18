package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class FR7 {
    public final Context A00;
    public final UserSession A01;
    public final Fragment A02;

    public FR7(Fragment fragment, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A02 = fragment;
        this.A00 = fragment.requireContext();
        this.A01 = userSession;
    }

    public final void A00(Context context, User user, String str, boolean z) {
        String str2;
        int i;
        boolean A1t = user.A1t();
        user.A0w(!A1t);
        UserSession userSession = this.A01;
        user.A0c(userSession);
        String id = user.getId();
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        Object[] objArr = {id};
        if (A1t) {
            str2 = "friendships/unblock_friend_reel/%s/";
        } else {
            str2 = "friendships/block_friend_reel/%s/";
        }
        AbstractC31173DnH.A1Q(A0c, str2, objArr);
        A0c.A9s(CacheBehaviorLogger.SOURCE, str);
        A0c.A0P(null, EDR.class, C34858FXs.class, false);
        C1ON A0U = AbstractC31172DnG.A0U(A0c, true);
        A0U.A00 = new HGR(1, user, context, this, A1t);
        C1GJ.A01().schedule(A0U);
        Context context2 = this.A00;
        boolean A1t2 = user.A1t();
        if (z) {
            i = 2131976443;
            if (A1t2) {
                i = 2131976442;
            }
        } else {
            i = 2131976563;
            if (A1t2) {
                i = 2131976562;
            }
        }
        String A0c2 = AbstractC31178DnM.A0c(context2, user, i);
        C14360o3.A0A(A0c2);
        C9GR.A03(context, A0c2, null, 0);
    }

    public final void A01(GZU gzu, User user, String str, boolean z, boolean z2) {
        C193328hC A0a;
        String username;
        C14360o3.A0B(user, 0);
        if (user.A1t()) {
            if (z) {
                A00(this.A00, user, str, z2);
                if (gzu != null) {
                    gzu.Dda();
                    return;
                }
                return;
            }
            int i = 2131966329;
            if (z2) {
                i = 2131966326;
            }
            Context context = this.A00;
            if (user.BJ8() == 1) {
                username = user.getFullName();
            } else {
                username = user.getUsername();
            }
            CharSequence[] charSequenceArr = {AbstractC167007dF.A0f(context, username, i)};
            A0a = AbstractC31171DnF.A0I(context);
            A0a.A0m(this.A02, this.A01);
            A0a.A0f(new DialogInterfaceOnClickListenerC35361Fic(gzu, this, user, str, 0, z2), charSequenceArr);
        } else {
            Context context2 = this.A00;
            int i2 = 2131953927;
            if (z2) {
                i2 = 2131966859;
            }
            String A0c = AbstractC31178DnM.A0c(context2, user, i2);
            C14360o3.A0A(A0c);
            int i3 = 2131953925;
            if (C04100Kb.A00(context2) >= 2011) {
                i3 = 2131953926;
            }
            String A0c2 = AbstractC31178DnM.A0c(context2, user, i3);
            C14360o3.A0A(A0c2);
            A0a = AbstractC31176DnK.A0a(context2, A0c2, A0c);
            A0a.A0D(new DialogInterfaceOnClickListenerC35301Fha(16));
            A0a.A0J(new DialogInterfaceOnClickListenerC35361Fic(gzu, this, user, str, 1, z2), 2131963527);
        }
        AbstractC31178DnM.A1R(A0a, true);
    }
}
