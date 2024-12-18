package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.FRr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34728FRr {
    public static void A00(Context context, DialogInterface.OnClickListener onClickListener) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A09(2131968430);
        A0I.A0F(onClickListener);
        AbstractC31178DnM.A1R(A0I, true);
    }

    public static void A01(Context context, InterfaceC11380iw interfaceC11380iw, CircularImageView circularImageView, User user) {
        circularImageView.A09();
        user.Bhu();
        if (user.A1k()) {
            AbstractC166997dE.A19(context, circularImageView, R.drawable.profile_anonymous_user);
        } else {
            AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView, user);
        }
        circularImageView.A0H(1, AbstractC53242c7.A0F(context, R.attr.avatarInnerStroke));
    }
}
