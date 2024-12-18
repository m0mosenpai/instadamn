package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9hi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216259hi extends C5RN implements InterfaceC133125ze, InterfaceC25171BBr, InterfaceC202698xn {
    public final Drawable A00;
    public final C202668xk A01;
    public final GradientDrawable A02;
    public final UserSession A03;
    public final C1815783k A04;
    public final List A05;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C2GS c2gs;
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
        C1815783k c1815783k = this.A04;
        if (c1815783k == null || (c2gs = c1815783k.A05) == null || !AbstractC166997dE.A1Z(c2gs.A02(), true)) {
            this.A02.draw(canvas);
            canvas.save();
            canvas.scale(1.3157895f, 1.3157895f);
            this.A01.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            AbstractC166987dD.A0Z(it).setBounds(rect);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A05;
    }

    @Override // X.InterfaceC25171BBr
    public final Drawable Ad0() {
        return this.A00;
    }

    @Override // X.InterfaceC202698xn
    public final C202668xk BhW() {
        return this.A01;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        C2GS c2gs;
        C1815783k c1815783k = this.A04;
        if (c1815783k != null && (c2gs = c1815783k.A05) != null && AbstractC166997dE.A1Z(c2gs.A02(), true)) {
            return "reel_mention_post_fullscreen_photo";
        }
        return "reel_mention_post";
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C1815783k c1815783k = this.A04;
        if (c1815783k != null) {
            return c1815783k.A00;
        }
        return this.A00.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C1815783k c1815783k = this.A04;
        if (c1815783k != null) {
            return c1815783k.A01;
        }
        return this.A00.getIntrinsicWidth();
    }

    public C216259hi(Context context, Drawable drawable, Drawable drawable2, UserSession userSession, C1815783k c1815783k, User user, String str, String str2) {
        this.A00 = drawable;
        this.A03 = userSession;
        this.A04 = c1815783k;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        int A0A = AbstractC166997dE.A0A(resources);
        int A08 = AbstractC166997dE.A08(resources);
        C14360o3.A0B(user, 2);
        Resources resources2 = context.getResources();
        resources2.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        resources2.getDimensionPixelSize(R.dimen.font_large);
        resources2.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A01 = new C202668xk(context, drawable2, EnumC15950qp.A0v, user, str2, str, A08, A08, dimensionPixelSize, A0A, A08, false);
        int[] intArray = context.getResources().getIntArray(R.array.media_sticker_top_legibility_gradient_colors);
        C14360o3.A07(intArray);
        int intrinsicWidth = getIntrinsicWidth();
        int intrinsicHeight = getIntrinsicHeight();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, intArray);
        gradientDrawable.setShape(0);
        gradientDrawable.setBounds(0, 0, intrinsicWidth, (int) (intrinsicHeight * 0.22f));
        gradientDrawable.setCornerRadius(intrinsicWidth * 0.04f);
        this.A02 = gradientDrawable;
        this.A05 = AbstractC16960so.A1N(this.A00, this.A01);
    }
}
