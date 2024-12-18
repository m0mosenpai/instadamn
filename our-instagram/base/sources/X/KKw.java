package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class KKw extends IgImageView {
    public final int A00;
    public final Paint A01;
    public final Path A02;

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.drawPath(this.A02, this.A01);
    }

    public KKw(Context context, int i) {
        super(context);
        this.A00 = i;
        this.A02 = AMo.A02(i);
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC43592JPx.A1E(A0R);
        A0R.setStrokeWidth(AMo.A00(context, R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
        AbstractC43594JPz.A14(context, A0R, R.attr.igds_color_secondary_text_on_media);
        A0R.setAlpha(155);
        this.A01 = A0R;
    }
}
