package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* renamed from: X.Fh6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35271Fh6 {
    public static final void A00(Activity activity, C19260xA c19260xA, C1P1 c1p1, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, User user) {
        AbstractC167027dH.A12(activity, userSession, user);
        A07(activity, c19260xA, c1p1, userSession, c38321qM, c75113Zb, null, null, null, null, user, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static final void A01(Activity activity, C19260xA c19260xA, C1P1 c1p1, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, User user, String str) {
        AbstractC167017dG.A1N(activity, userSession);
        A07(activity, c19260xA, c1p1, userSession, c38321qM, c75113Zb, null, null, null, null, user, null, null, null, str, null, null, null, null, null, null, null);
    }

    public static final void A02(Activity activity, UserSession userSession, FollowButtonBase followButtonBase, InterfaceC77483dY interfaceC77483dY, User user, String str) {
        Context context = activity;
        AbstractC167027dH.A13(followButtonBase, userSession, str);
        if (activity == null) {
            context = followButtonBase.getContext();
        }
        FollowStatus B7L = user.B7L();
        if (interfaceC77483dY != null) {
            interfaceC77483dY.DHs(user);
        }
        C28261Yl.A00.A00(context, null, userSession, user, new C36763GIm(followButtonBase, interfaceC77483dY, B7L, user), str, null, user.getUsername());
    }

    public static final void A03(Activity activity, UserSession userSession, User user, String str) {
        AbstractC167017dG.A1Q(userSession, str);
        A09(activity, null, userSession, user, str, null, null);
    }

    public static final void A04(Activity activity, UserSession userSession, User user, String str, String str2) {
        AbstractC25234BEr.A1P(userSession, user, str2);
        A09(activity, null, userSession, user, str, null, str2);
    }

    public static final void A05(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, InterfaceC11380iw interfaceC11380iw, InterfaceC77483dY interfaceC77483dY, User user) {
        String A0c;
        int i;
        Integer B7J = user.A03.B7J();
        if (B7J != null) {
            int intValue = B7J.intValue();
            if (intValue == 1) {
                A0c = context.getString(2131962692);
                i = 2131962690;
            } else {
                if (intValue != 2) {
                    return;
                }
                A0c = AbstractC31178DnM.A0c(context, user, 2131962691);
                i = 2131962689;
            }
            SpannableStringBuilder A05 = AbstractC31175DnJ.A05(context, i);
            if (A0c != null) {
                if (interfaceC77483dY != null) {
                    interfaceC77483dY.DHs(user);
                }
                C193328hC A0I = AbstractC31171DnF.A0I(context);
                A0I.A0o(user.Bhu(), interfaceC11380iw);
                A0I.A05 = A0c;
                A0B(A05);
                A0I.A0r(A05);
                A0I.A0g(new DialogInterfaceOnDismissListenerC35459FkG(2, user, interfaceC77483dY));
                A0I.A0J(onClickListener, 2131962676);
                AbstractC31176DnK.A14(onClickListener2, A0I);
            }
        }
    }

    public static final void A06(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, InterfaceC11380iw interfaceC11380iw, InterfaceC77483dY interfaceC77483dY, User user) {
        int i;
        AbstractC167007dF.A1D(context, 0, user);
        if (user.A0M() == C05F.A01) {
            i = 2131976078;
        } else if (user.A0M() != C05F.A0C) {
            return;
        } else {
            i = 2131976077;
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31178DnM.A0c(context, user, i));
        String username = user.getUsername();
        int A08 = AbstractC001900j.A08(AbstractC166987dD.A19(A0H), username, 0, false);
        A0H.setSpan(new StyleSpan(1), A08, username.length() + A08, 33);
        if (interfaceC77483dY != null) {
            interfaceC77483dY.DHs(user);
        }
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0o(user.Bhu(), interfaceC11380iw);
        A0I.A05 = null;
        A0I.A0r(A0H);
        A0I.A0g(new DialogInterfaceOnDismissListenerC35459FkG(4, user, interfaceC77483dY));
        A0I.A0L(onClickListener, 2131976069);
        AbstractC31176DnK.A14(onClickListener2, A0I);
    }

    public static final void A08(Context context, C1P1 c1p1, UserSession userSession, User user, String str) {
        AbstractC167017dG.A1P(userSession, user);
        A09(context, c1p1, userSession, user, str, null, null);
    }

    public static final void A09(Context context, C1P1 c1p1, UserSession userSession, User user, String str, String str2, String str3) {
        A07(context, null, c1p1, userSession, null, null, null, null, null, null, user, null, null, null, str, null, str2, str3, null, null, null, null);
    }

    public static final void A07(Context context, C19260xA c19260xA, C1P1 c1p1, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, UserDetailEntryInfo userDetailEntryInfo, SearchContext searchContext, InterfaceC77483dY interfaceC77483dY, EnumC77563dg enumC77563dg, User user, Boolean bool, Double d, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject) {
        FollowStatus B7L = user.B7L();
        AbstractC129875tr.A00(userSession).A09(context, c19260xA, c1p1, c38321qM, c75113Zb, userDetailEntryInfo, searchContext, enumC77563dg, user, bool, d, null, l, str, str2, str3, str4, null, str5, str6, str7, jSONObject);
        AbstractC25651Mw.A00(userSession).E4s(new C3MC(user.B7L(), user.getId()));
        if ((c38321qM != null && c38321qM.CdW() && C18U.A06(C06090Tz.A05, userSession, 36331197076358353L)) || interfaceC77483dY == null) {
            return;
        }
        interfaceC77483dY.D3u(B7L, user);
    }

    public static final void A0A(SpannableStringBuilder spannableStringBuilder) {
        Matcher matcher = AbstractC13670mt.A01.matcher(spannableStringBuilder.toString());
        C14360o3.A07(matcher);
        while (matcher.find()) {
            spannableStringBuilder.setSpan(new StyleSpan(1), matcher.start(1), matcher.end(1), 33);
        }
    }

    public static final void A0B(SpannableStringBuilder spannableStringBuilder) {
        Matcher A09 = AbstractC13670mt.A09(spannableStringBuilder.toString());
        while (A09.find()) {
            spannableStringBuilder.setSpan(new StyleSpan(1), A09.start(1), A09.end(1), 33);
        }
    }
}
