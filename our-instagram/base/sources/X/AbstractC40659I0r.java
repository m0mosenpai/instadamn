package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.I0r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40659I0r {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, JGA jga, C42800Iwc c42800Iwc, Reel reel, List list, boolean z) {
        int i;
        int i2;
        int i3;
        FrameLayout.LayoutParams layoutParams;
        int i4;
        C14360o3.A0B(userSession, 0);
        AbstractC25233BEq.A0v(1, interfaceC11380iw, c42800Iwc, reel);
        FrameLayout frameLayout = c42800Iwc.A01;
        Context context = frameLayout.getContext();
        C41181vS A0A = reel.A0A(userSession, 0);
        C14360o3.A07(A0A);
        C14360o3.A0A(context);
        int A0A2 = AbstractC13880nE.A0A(context);
        if (z) {
            View view = c42800Iwc.A00;
            view.setPadding(0, 0, 0, 0);
            view.getLayoutParams().width = A0A2 / 2;
        }
        CircularImageView circularImageView = c42800Iwc.A05;
        User user = A0A.A0i;
        if (user != null) {
            AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView, user);
            TextView textView = c42800Iwc.A04;
            textView.setText(user.getFullName());
            IgProgressImageView igProgressImageView = c42800Iwc.A06;
            igProgressImageView.setAdjustViewBounds(true);
            ImageUrl A08 = A0A.A08(context);
            if (A08 != null) {
                igProgressImageView.setUrl(A08, interfaceC11380iw);
                if (z) {
                    i3 = A0A2 / 2;
                } else {
                    FrameLayout frameLayout2 = c42800Iwc.A02;
                    if (frameLayout2 != null) {
                        i = frameLayout2.getPaddingLeft();
                    } else {
                        i = 0;
                    }
                    int i5 = A0A2 - i;
                    if (frameLayout2 != null) {
                        i2 = frameLayout2.getPaddingRight();
                    } else {
                        i2 = 0;
                    }
                    i3 = i5 - i2;
                }
                int A09 = (int) (i3 / (A0A2 / AbstractC13880nE.A09(context)));
                C38321qM c38321qM = A0A.A0b;
                c38321qM.getClass();
                String A31 = c38321qM.A31();
                String A30 = c38321qM.A30();
                if (A31 != null && A30 != null) {
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    layoutParams2.height = A09;
                    AbstractC37305Gc6.A04(frameLayout, layoutParams2, A31, A30, i3);
                }
                boolean CdW = A0A.CdW();
                TextView textView2 = c42800Iwc.A03;
                if (CdW) {
                    textView2.setVisibility(0);
                    AbstractC31173DnH.A19(context.getResources(), textView2, 2131957634);
                    ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                    C14360o3.A0C(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    layoutParams = (FrameLayout.LayoutParams) layoutParams3;
                    i4 = 48;
                } else {
                    textView2.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
                    C14360o3.A0C(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    layoutParams = (FrameLayout.LayoutParams) layoutParams4;
                    i4 = 16;
                }
                layoutParams.gravity = i4;
                C0fQ.A00(new ViewOnClickListenerC42030Ijz(11, list, jga, reel, c42800Iwc), frameLayout);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
