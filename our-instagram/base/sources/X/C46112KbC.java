package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KbC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46112KbC extends L0V {
    public final Drawable A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IgImageView A03;

    public C46112KbC(FrameLayout frameLayout, UserSession userSession) {
        super(frameLayout);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean booleanValue = AbstractC166997dE.A0c(c06090Tz, userSession, 36322465407838464L).booleanValue();
        int i = R.id.image_view;
        if (booleanValue) {
            AbstractC31172DnG.A1J(frameLayout, R.id.rounded_corner_frame_layout, 0);
            i = R.id.rounded_corner_image_view;
        }
        IgImageView A0Z = AbstractC31172DnG.A0Z(frameLayout, i);
        this.A02 = A0Z;
        A0Z.setVisibility(0);
        this.A01 = AbstractC166997dE.A0T(frameLayout, R.id.text_view);
        this.A03 = AbstractC31172DnG.A0Z(frameLayout, R.id.private_story_image_view);
        boolean booleanValue2 = AbstractC166997dE.A0c(c06090Tz, userSession, 36322465407838464L).booleanValue();
        Context context = frameLayout.getContext();
        if (booleanValue2) {
            Drawable mutate = context.getDrawable(R.drawable.instagram_eye_pano_outline_24).mutate();
            AbstractC25231BEo.A0x(context, mutate, R.color.design_dark_default_color_on_background);
            Paint paint = C3LQ.A00;
            Bitmap A0F = AbstractC167007dF.A0F(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
            Canvas A06 = AbstractC43592JPx.A06(A0F);
            mutate.setBounds(0, 0, A06.getWidth(), A06.getHeight());
            mutate.draw(A06);
            Resources resources = frameLayout.getResources();
            this.A00 = new BitmapDrawable(resources, AbstractC46528KiT.A00(A0F, Math.round(TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()))));
            return;
        }
        Drawable mutate2 = context.getDrawable(R.drawable.viewers_icon).mutate();
        this.A00 = mutate2;
        AbstractC25231BEo.A0x(context, mutate2, R.color.design_dark_default_color_on_background);
    }
}
