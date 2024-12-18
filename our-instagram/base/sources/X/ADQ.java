package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* loaded from: classes4.dex */
public abstract class ADQ {
    public static final void A00(UserSession userSession, InterfaceC186078Nb interfaceC186078Nb, C210979Uu c210979Uu, C148276lx c148276lx, Long l, float f) {
        float f2;
        int A0H;
        AbstractC167017dG.A1P(c210979Uu, c148276lx);
        C447324d c447324d = AnonymousClass229.A01(userSession).A01;
        C14360o3.A07(c447324d);
        c447324d.A02(c148276lx.A0Z, c148276lx.A00().name());
        View view = c210979Uu.A01;
        Context A0L = AbstractC166997dE.A0L(view);
        C209809Pq A02 = AbstractC209799Pp.A02(A0L, userSession, interfaceC186078Nb, c148276lx);
        c210979Uu.A03.A02();
        view.setVisibility(0);
        ConstrainedImageView constrainedImageView = c210979Uu.A04;
        constrainedImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, (int) (A0L.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height) * AbstractC172687md.A00(userSession))));
        Drawable drawable = A02.A00;
        constrainedImageView.setImageDrawable(drawable);
        view.setContentDescription(A02.A02);
        view.setRotation(f);
        c210979Uu.A00 = new A9P(userSession, interfaceC186078Nb, c210979Uu, c148276lx, l);
        boolean A01 = A01(userSession, interfaceC186078Nb, c148276lx);
        IgTextView igTextView = c210979Uu.A02;
        if (A01) {
            igTextView.setVisibility(0);
            igTextView.setTypeface(AbstractC15960qq.A00(A0L).A02(EnumC15950qp.A0T));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(AbstractC166987dD.A04(igTextView.getContext().getResources(), R.dimen.abc_dialog_padding_top_material));
            Integer num = A02.A01;
            if (num != null) {
                A0H = num.intValue();
            } else {
                A0H = AbstractC53242c7.A0H(A0L, R.attr.igds_color_creation_tools_purple);
            }
            gradientDrawable.setColor(A0L.getColor(A0H));
            igTextView.setBackground(gradientDrawable);
        } else {
            igTextView.setVisibility(8);
        }
        AbstractC167027dH.A0r(constrainedImageView, drawable);
        Drawable drawable2 = constrainedImageView.getDrawable();
        C14360o3.A0A(drawable2);
        C14360o3.A0B(drawable2, 0);
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            f2 = intrinsicWidth / intrinsicHeight;
        } else {
            f2 = 2.2f;
        }
        constrainedImageView.A00 = f2;
        int dimensionPixelSize = (int) (A0L.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height) * AbstractC172687md.A00(userSession));
        constrainedImageView.getLayoutParams().height = dimensionPixelSize;
        constrainedImageView.getLayoutParams().width = (int) (dimensionPixelSize * f2);
        constrainedImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        constrainedImageView.A01 = null;
        new C66049Tym(constrainedImageView, new B61(8, c148276lx, c447324d), AbstractC209779Pn.A00(userSession)).A00();
    }

    public static final boolean A01(UserSession userSession, InterfaceC186078Nb interfaceC186078Nb, C148276lx c148276lx) {
        C149656oI c149656oI = new C149656oI(userSession);
        boolean contains = AbstractC166987dD.A0x(userSession).C2v("preference_sticker_drops_new_badge_interacted_with_sticker_ids").contains(c148276lx.A0Z);
        if (c148276lx.A00() == EnumC150226pU.A0B && !contains && c149656oI.A04()) {
            return true;
        }
        if (c148276lx.A00() == EnumC150226pU.A0m && !contains && C18U.A06(C06090Tz.A05, userSession, 36327172694948233L)) {
            return true;
        }
        if (c148276lx.A00() == EnumC150226pU.A1p && !contains) {
            return true;
        }
        if (interfaceC186078Nb.Cdj() && AbstractC166997dE.A1Z(c148276lx.A0A, true) && !contains) {
            return true;
        }
        return false;
    }
}
