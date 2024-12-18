package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.user.model.User;

/* renamed from: X.Chk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28492Chk {
    public static final C28492Chk A00 = new Object();

    public static final void A03(View view) {
        C29290Cvl c29290Cvl = new C29290Cvl(view);
        c29290Cvl.A0G.setVisibility(0);
        c29290Cvl.A0P.setVisibility(8);
        CircularImageView circularImageView = c29290Cvl.A0O;
        circularImageView.setVisibility(8);
        c29290Cvl.A0L.setVisibility(8);
        IgImageView igImageView = c29290Cvl.A0R;
        igImageView.setVisibility(8);
        c29290Cvl.A0H.setVisibility(8);
        circularImageView.setOnClickListener(null);
        IgFrameLayout igFrameLayout = c29290Cvl.A0B;
        igFrameLayout.setOnClickListener(null);
        igFrameLayout.setOnLongClickListener(null);
        igImageView.setOnClickListener(null);
    }

    public static final void A01(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IgTextView igTextView, C38321qM c38321qM, IntentAwareAdPivotState intentAwareAdPivotState, C75113Zb c75113Zb, C64052vQ c64052vQ, HBC hbc, C64042vP c64042vP, C60662pp c60662pp, int i) {
        String str;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null && A2E.A2N()) {
            str = AbstractC41071vF.A0G(userSession, c38321qM);
        } else {
            User A2E2 = c38321qM.A2E(userSession);
            if (A2E2 != null) {
                str = A2E2.getUsername();
            } else {
                str = null;
            }
        }
        igTextView.setText(str);
        A00(context, igTextView, EnumC71343Hv.A0e, interfaceC11380iw, userSession, c38321qM);
        if (!A05(userSession) && C18U.A06(C06090Tz.A06, userSession, 36312874755425743L)) {
            igTextView.setPadding((int) AbstractC13880nE.A00(context, 6.0f), 0, igTextView.getPaddingEnd(), 0);
        }
        C0fQ.A00(new ViewOnClickListenerC77633dn(userSession, null, C29804DCw.A00, new DIU(userSession, c38321qM, intentAwareAdPivotState, c75113Zb, c64052vQ, hbc, c64042vP, c60662pp, i, 1), true), igTextView);
    }

    public static final void A02(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, CircularImageView circularImageView, C38321qM c38321qM, IntentAwareAdPivotState intentAwareAdPivotState, C75113Zb c75113Zb, C64052vQ c64052vQ, HBC hbc, C64042vP c64042vP, C60662pp c60662pp, int i) {
        A00(context, circularImageView, EnumC71343Hv.A0e, interfaceC11380iw, userSession, c38321qM);
        AbstractC56952jT.A04(circularImageView, C05F.A15);
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            circularImageView.setContentDescription(AbstractC167007dF.A0f(context, A2E.B8y(), 2131964580));
            if (!A05(userSession) && ((C18U.A06(C06090Tz.A06, userSession, 36312874755425743L) || AbstractC28501Chu.A00(userSession, hbc.A00)) && !AbstractC28501Chu.A01(userSession, hbc.A00))) {
                ViewGroup.LayoutParams layoutParams = circularImageView.getLayoutParams();
                layoutParams.width = (int) AbstractC13880nE.A00(context, 24.0f);
                layoutParams.height = (int) AbstractC13880nE.A00(context, 24.0f);
            }
            User A2E2 = c38321qM.A2E(userSession);
            if (A2E2 != null) {
                circularImageView.setUrl(A2E2.Bhu(), interfaceC11380iw);
                C0fQ.A00(new ViewOnClickListenerC77633dn(userSession, null, C29803DCv.A00, new DIU(userSession, c38321qM, intentAwareAdPivotState, c75113Zb, c64052vQ, hbc, c64042vP, c60662pp, i, 0), true), circularImageView);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A04(UserSession userSession, C38321qM c38321qM, C64052vQ c64052vQ, HBC hbc) {
        String str;
        int i = hbc.A00;
        C14360o3.A0B(userSession, 0);
        if (C5MB.A00.A02(Integer.valueOf(i)) && C18U.A06(C06090Tz.A05, userSession, 36312874760144398L)) {
            String A07 = AbstractC41071vF.A07(userSession, c38321qM);
            if (A07 != null) {
                H4K h4k = hbc.A03;
                if (h4k != null && (str = h4k.A05) != null) {
                    c64052vQ.A03(A07, str, "1848189102340159");
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public static final boolean A05(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36312874753918395L) && !C18U.A06(c06090Tz, userSession, 36312874754573764L)) {
            return false;
        }
        return true;
    }

    public static final void A00(Context context, View view, EnumC71343Hv enumC71343Hv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        C71313Hs.A00(userSession).A05(view, enumC71343Hv);
        C71313Hs A002 = C71313Hs.A00(userSession);
        InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) interfaceC11380iw;
        C75113Zb c75113Zb = new C75113Zb();
        if (c38321qM.A5M()) {
            c75113Zb.A0B(0);
        }
        A002.A0A(view, new C79623hD(new C86933u7(context, c75113Zb, userSession, c38321qM), userSession, c38321qM, interfaceC60442pS));
    }
}
