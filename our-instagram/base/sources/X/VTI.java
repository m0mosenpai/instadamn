package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.api.schemas.SuggestedUsersStyle;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* loaded from: classes11.dex */
public abstract class VTI {
    public static final void A00(Context context, Fragment fragment, UserSession userSession, InterfaceC63682up interfaceC63682up, C69115Vi5 c69115Vi5, C65742yC c65742yC, C114385Ef c114385Ef, C47K c47k, Integer num) {
        int i;
        AbstractC167007dF.A1K(context, fragment);
        AbstractC25234BEr.A0j(2, userSession, c69115Vi5, interfaceC63682up, c47k);
        AbstractC167017dG.A1U(c114385Ef, c65742yC);
        C14360o3.A0B(num, 8);
        if (c47k.A0K.length() > 0 && AbstractC114375Ed.A00(c47k) == SuggestedUsersStyle.A04) {
            TextView textView = c69115Vi5.A01;
            textView.setText(c47k.A0K);
            textView.setVisibility(0);
            if (c47k.B5n() == C1XV.A0v) {
                c69115Vi5.A00.setVisibility(0);
            }
        } else {
            c69115Vi5.A01.setVisibility(8);
            c69115Vi5.A00.setVisibility(8);
        }
        ReboundViewPager reboundViewPager = c69115Vi5.A02;
        UBD ubd = (UBD) reboundViewPager.getAdapter();
        if (ubd == null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.card_width_redesign);
            SuggestedUsersStyle A00 = AbstractC114375Ed.A00(c47k);
            SuggestedUsersStyle suggestedUsersStyle = SuggestedUsersStyle.A04;
            Resources resources = context.getResources();
            int i2 = R.dimen.card_height_redesign;
            if (A00 == suggestedUsersStyle) {
                i2 = R.dimen.card_height_redesign_embedded;
            }
            int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
            int A03 = AbstractC167017dG.A03(context);
            UBD ubd2 = new UBD(context, userSession, interfaceC63682up, new RunnableC71360WsV(c69115Vi5), dimensionPixelSize, dimensionPixelSize2);
            ubd2.A01 = c47k;
            C0fA.A00(ubd2, 361751265);
            reboundViewPager.setAdapter(ubd2);
            reboundViewPager.A0C = dimensionPixelSize;
            reboundViewPager.setPageSpacing(A03);
            String str = null;
            reboundViewPager.A0M(2, false);
            reboundViewPager.A0J = new C42E(dimensionPixelSize, A03, 0.86f);
            reboundViewPager.setAccessibilityDelegateCompat(new C174447pe(reboundViewPager));
            C69229Vjx c69229Vjx = c114385Ef.A03;
            if (c69229Vjx != null) {
                c69229Vjx.A01.A02(c69229Vjx.A00, C70712Wfb.class);
                c69229Vjx.A02.onDestroy();
            }
            if (c47k.A04() != null) {
                str = "preview";
            } else if (c47k.A0M != null) {
                str = "profile";
            }
            C69229Vjx c69229Vjx2 = new C69229Vjx(fragment, userSession, reboundViewPager, new C67972V4m(interfaceC63682up.Abd(), userSession, num, c47k.A0C, str, c47k.A0I, c47k.A01), ubd2);
            ubd2.A00 = c69229Vjx2;
            reboundViewPager.A0P(new V60(1, c114385Ef, c69229Vjx2));
            c114385Ef.A03 = c69229Vjx2;
            reboundViewPager.A0K(c114385Ef.A02);
            return;
        }
        if (!c114385Ef.A06 && ubd.A01 == c47k) {
            i = 273832890;
        } else {
            c114385Ef.A06 = false;
            ubd.A01 = c47k;
            i = 361751265;
        }
        C0fA.A00(ubd, i);
    }
}
