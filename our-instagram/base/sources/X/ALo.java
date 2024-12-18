package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* loaded from: classes4.dex */
public abstract class ALo {
    public static final RectF A01 = AbstractC166987dD.A0X();
    public static final RectF A00 = AbstractC166987dD.A0X();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(UserSession userSession, C1810981l c1810981l, InterfaceC186078Nb interfaceC186078Nb, C210959Us c210959Us, C148276lx c148276lx, Long l) {
        C55U c55u;
        C5RP c5rp;
        AbstractC167017dG.A1P(c210959Us, c148276lx);
        C447324d c447324d = AnonymousClass229.A01(userSession).A01;
        C14360o3.A07(c447324d);
        c447324d.A02(c148276lx.A0Z, c148276lx.A00().name());
        ConstrainedImageView constrainedImageView = c210959Us.A03;
        Context A0L = AbstractC166997dE.A0L(constrainedImageView);
        if (c1810981l != null) {
            c55u = C1810981l.A02(c1810981l);
        } else {
            c55u = null;
        }
        C209809Pq A012 = AbstractC209799Pp.A01(A0L, userSession, c55u, interfaceC186078Nb, c148276lx);
        c210959Us.A02.A02();
        constrainedImageView.setVisibility(0);
        Drawable drawable = A012.A00;
        constrainedImageView.setImageDrawable(drawable);
        constrainedImageView.setContentDescription(A012.A02);
        c210959Us.A00 = new A9O(userSession, interfaceC186078Nb, c210959Us, c148276lx, l);
        AbstractC167027dH.A0r(constrainedImageView, drawable);
        int ordinal = c148276lx.A00().ordinal();
        if (ordinal != 104 && ordinal != 37 && ordinal != 65) {
            if (ordinal != 38 && ordinal != 64) {
                constrainedImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                constrainedImageView.A01 = null;
            } else {
                constrainedImageView.setImageMatrix(null);
                constrainedImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                constrainedImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                constrainedImageView.A01 = null;
            }
        } else {
            Drawable drawable2 = constrainedImageView.getDrawable();
            if ((drawable2 instanceof C5RP) && (c5rp = (C5RP) drawable2) != null && c5rp.isLoading()) {
                constrainedImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                constrainedImageView.A01 = null;
                C14360o3.A0C(drawable2, "null cannot be cast to non-null type com.instagram.common.ui.drawables.LoadingDrawable");
                c5rp.A9I(new C23675AeA(0, drawable2, c5rp, c210959Us, c148276lx));
            } else {
                constrainedImageView.setScaleType(ImageView.ScaleType.MATRIX);
                constrainedImageView.A01 = new C23691AeQ(drawable2, c210959Us, c148276lx);
            }
        }
        if (c148276lx.A00() != EnumC150226pU.A0M) {
            new C66049Tym(constrainedImageView, new B61(7, c148276lx, c447324d), AbstractC209779Pn.A00(userSession)).A00();
        }
    }

    public static /* synthetic */ ConstrainedImageView A00(Context context, float f, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.ad_stories_more_info_footer_width), -2, 1.0f);
        ConstrainedImageView constrainedImageView = new ConstrainedImageView(context);
        if (z) {
            layoutParams.setMarginEnd(AbstractC167017dG.A0B(context));
        }
        constrainedImageView.setLayoutParams(layoutParams);
        constrainedImageView.A00 = f;
        constrainedImageView.setFocusable(true);
        constrainedImageView.setTag(new C210959Us(constrainedImageView));
        return constrainedImageView;
    }

    public static final void A01(Drawable drawable, C210959Us c210959Us, C148276lx c148276lx, int i, int i2) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        RectF rectF = A01;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        RectF rectF2 = A00;
        rectF2.set(0.0f, 0.0f, i, i2);
        Matrix matrix = c210959Us.A01;
        matrix.reset();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f = ((C148286ly) c148276lx.A0O.get(0)).A07;
        matrix.postScale(f, f, rectF2.centerX(), rectF2.centerY());
        c210959Us.A03.setImageMatrix(matrix);
    }
}
