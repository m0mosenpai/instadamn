package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Rbw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60942Rbw extends IgImageView {
    public static float A00(Resources resources, C60942Rbw c60942Rbw, int i) {
        return resources.getDimensionPixelSize(i) * c60942Rbw.getCurrentScale();
    }

    private final Path getCirclePath() {
        Path A0T = AbstractC166987dD.A0T();
        float A00 = A00(getContext().getResources(), this, R.dimen.asset_picker_redesign_sticker_height) / 2.0f;
        A0T.addCircle(getWidth() / 2.0f, getHeight() - A00, A00, Path.Direction.CW);
        return A0T;
    }

    private final float getCurrentScale() {
        return getWidth() / getContext().getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
    }

    private final Path getCustomMaskPath() {
        Path A0T = AbstractC166987dD.A0T();
        Context context = getContext();
        float A00 = A00(context.getResources(), this, R.dimen.asset_picker_redesign_sticker_height) / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        A0T.addCircle(getWidth() / 2.0f, getHeight() - A00, A00, direction);
        float A002 = A00(context.getResources(), this, R.dimen.abc_star_medium);
        float width = getWidth();
        float height = (getHeight() / 2.0f) + A00(context.getResources(), this, R.dimen.abc_edit_text_inset_bottom_material);
        float[] fArr = new float[8];
        fArr[0] = A002;
        AbstractC43594JPz.A1U(fArr, A002, 1);
        AbstractC167017dG.A1X(fArr, 0.0f);
        A0T.addRoundRect(0.0f, 0.0f, width, height, fArr, direction);
        A0T.addRect(getWidth() / 2.0f, getHeight() / 2.0f, getWidth(), A00(context.getResources(), this, R.dimen.abc_dialog_padding_top_material) + (getHeight() / 2.0f), direction);
        return A0T;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A0N = AbstractC167017dG.A0N(canvas, 294486286);
        Path circlePath = getCirclePath();
        Paint A0R = AbstractC166987dD.A0R();
        Context context = getContext();
        A0R.setColor(context.getColor(R.color.igds_prism_black_alpha_15));
        canvas.drawPath(circlePath, A0R);
        canvas.clipPath(getCustomMaskPath());
        canvas.save();
        canvas.translate(A00(context.getResources(), this, R.dimen.abc_control_corner_material), 0.0f);
        super.draw(canvas);
        C0f9.A0A(246152390, A0N);
    }
}
