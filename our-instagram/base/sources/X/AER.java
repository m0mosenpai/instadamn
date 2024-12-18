package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes4.dex */
public abstract class AER {
    public static final C73053Pg A00(Context context) {
        C14360o3.A0B(context, 0);
        Drawable drawable = context.getDrawable(R.drawable.instagram_heart_pano_filled_24);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTint(AbstractC167007dF.A09(context, R.attr.igds_color_icon_badge));
            int A0E = AbstractC167017dG.A0E(context);
            int A04 = AbstractC167017dG.A04(context);
            int i = (A04 * 2) + A0E;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(context.getColor(AbstractC53242c7.A0D(context)));
            int i2 = A0E + A04;
            mutate.setBounds(A04, A04, i2, i2);
            mutate.draw(canvas);
            C14360o3.A07(createBitmap);
            return new C73053Pg(createBitmap, false);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(View view, ViewGroup viewGroup, AnonymousClass693 anonymousClass693, IgSimpleImageView igSimpleImageView) {
        C14360o3.A0B(anonymousClass693, 0);
        if (anonymousClass693.isPlaying()) {
            anonymousClass693.stop();
            anonymousClass693.EMk(0.0f);
        }
        igSimpleImageView.setImageDrawable(anonymousClass693);
        int dimensionPixelSize = igSimpleImageView.getContext().getResources().getDimensionPixelSize(R.dimen.album_preview_view_width);
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        view.getLocationOnScreen(new int[2]);
        viewGroup.getLocationOnScreen(new int[2]);
        igSimpleImageView.setTranslationX((r6[0] - r4[0]) - AbstractC166987dD.A02(dimensionPixelSize - view.getWidth()));
        igSimpleImageView.setTranslationY((r6[1] - r4[1]) - dimensionPixelSize);
        anonymousClass693.A8x(new C46074KaV(viewGroup, 7));
        viewGroup.setVisibility(0);
        anonymousClass693.E4S();
    }
}
