package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.W6q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70138W6q {
    public static void A01(CircularImageView circularImageView, Reel reel, InterfaceC58311Pt3 interfaceC58311Pt3, C5HW c5hw, GradientSpinner gradientSpinner, int i, boolean z) {
        View.OnClickListener viewOnClickListenerC35688FpN;
        if (gradientSpinner != null) {
            if (z) {
                gradientSpinner.setVisibility(8);
                return;
            }
            if (reel != null) {
                gradientSpinner.setVisibility(0);
                viewOnClickListenerC35688FpN = new ViewOnClickListenerC35610Fo1(13, interfaceC58311Pt3, reel, gradientSpinner, circularImageView);
            } else {
                gradientSpinner.setVisibility(4);
                viewOnClickListenerC35688FpN = new ViewOnClickListenerC35688FpN(interfaceC58311Pt3, c5hw, i, 16);
            }
            C0fQ.A00(viewOnClickListenerC35688FpN, circularImageView);
        }
    }

    public static boolean A02(C5HW c5hw) {
        C5HX c5hx = c5hw.A04;
        if ((!AbstractC81033jX.A03(c5hx.A0G)) && (!AbstractC81033jX.A03(c5hx.A0E))) {
            return true;
        }
        return false;
    }

    public static void A00(InterfaceC11380iw interfaceC11380iw, InterfaceC58311Pt3 interfaceC58311Pt3, InterfaceC71957XCj interfaceC71957XCj, C5HW c5hw, int i) {
        String str;
        CircularImageView BxW = interfaceC71957XCj.BxW();
        StackedAvatarView BzV = interfaceC71957XCj.BzV();
        C5HX c5hx = c5hw.A04;
        ImageUrl imageUrl = c5hx.A0E;
        ImageUrl imageUrl2 = c5hx.A0G;
        if (AbstractC81033jX.A03(imageUrl)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Missing Profile Image URL. story id: ");
            sb.append(c5hw.A09);
            sb.append("; text: ");
            sb.append(c5hx.A0o);
            sb.append("; type: ");
            C5Hd c5Hd = c5hw.A05;
            if (c5Hd != null) {
                str = c5Hd.name();
            } else {
                str = "unknown";
            }
            sb.append(str);
            sb.append("; story type: ");
            sb.append(c5hw.A00);
            sb.append("; profile id: ");
            C0w9.A03("profile_image_missing_newsfeed_story", AbstractC166997dE.A0x(c5hx.A0f, sb));
            BxW.setVisibility(4);
            BzV.setVisibility(8);
            return;
        }
        if (A02(c5hw)) {
            BxW.setVisibility(8);
            BzV.setVisibility(0);
            BzV.setUrls(imageUrl, imageUrl2, interfaceC11380iw);
            BzV.setRingColor(AbstractC53242c7.A00(BxW.getContext()));
            C0fQ.A00(new ViewOnClickListenerC35608Fnz(i, 5, BzV, interfaceC58311Pt3, c5hw), BzV);
            BzV.setOnLongClickListener(new ViewOnLongClickListenerC42043IkC(i, 4, interfaceC58311Pt3, c5hw));
            return;
        }
        BzV.setVisibility(8);
        BxW.setVisibility(0);
        BxW.setUrl(imageUrl, interfaceC11380iw);
        C0fQ.A00(new ViewOnClickListenerC35608Fnz(i, 5, BxW, interfaceC58311Pt3, c5hw), BxW);
        BxW.setOnLongClickListener(new ViewOnLongClickListenerC42043IkC(i, 4, interfaceC58311Pt3, c5hw));
    }
}
