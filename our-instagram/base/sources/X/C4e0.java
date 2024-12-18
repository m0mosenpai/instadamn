package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.4e0, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4e0 {
    public static final void A00(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C81283jy c81283jy, InterfaceC75453aC interfaceC75453aC, C77963eO c77963eO, C77903eI c77903eI, C75113Zb c75113Zb) {
        ImageUrl Bhu;
        String Bhz;
        C14360o3.A0B(c77903eI, 3);
        C14360o3.A0B(c77963eO, 4);
        InterfaceC56392iX interfaceC56392iX = c81283jy.A0N;
        interfaceC56392iX.setVisibility(8);
        interfaceC56392iX.getView().setOnClickListener(null);
        CircularImageView circularImageView = c81283jy.A0I;
        circularImageView.setVisibility(0);
        User user = c77903eI.A04;
        if (c77903eI.A03 == EnumC76383bi.A0C) {
            InterfaceC109984xS BYy = user.A03.BYy();
            if (BYy != null && (Bhz = BYy.Bhz()) != null) {
                android.net.Uri A03 = AbstractC08820cl.A03(Bhz);
                C14360o3.A07(A03);
                Bhu = AbstractC81033jX.A00(A03, -1, -1);
            } else {
                Bhu = new SimpleImageUrl((String) null);
            }
        } else {
            Bhu = user.Bhu();
        }
        circularImageView.setUrl(Bhu, interfaceC60442pS);
        circularImageView.setContentDescription(context.getString(2131963268, user.getUsername()));
        circularImageView.setPadding(0, 0, 0, 0);
        AbstractC77703du.A05(circularImageView, EnumC77673dr.A0Q);
        if (user.A2N()) {
            C0fQ.A00(new ViewOnClickListenerC77633dn(userSession, null, new C9F4(37, c75113Zb, c77903eI), new C9FO(26, c77903eI, interfaceC75453aC, c77963eO), true), circularImageView);
            return;
        }
        if (c77903eI.A07) {
            circularImageView.setContentDescription(context.getString(2131976894, user.getUsername()));
        }
        C0fQ.A00(new ViewOnClickListenerC77633dn(userSession, null, new C9F4(38, c75113Zb, c77903eI), new C9FX(12, interfaceC75453aC, c77903eI, c77963eO, c81283jy), true), circularImageView);
        circularImageView.setOnTouchListener(c77963eO.A00(interfaceC75453aC, c77903eI));
    }
}
