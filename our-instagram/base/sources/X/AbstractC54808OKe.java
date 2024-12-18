package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.OKe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54808OKe {
    public WeakReference A00;
    public final float A01;
    public final float A02;

    public AbstractC54808OKe(View view, float f, float f2) {
        C14360o3.A0B(view, 1);
        this.A01 = f;
        this.A02 = f2;
        this.A00 = AbstractC25225BEi.A16(view);
    }

    public final synchronized WeakReference A00() {
        return this.A00;
    }

    public void A01(Context context, RoundedCornerImageView roundedCornerImageView) {
        C52376NFs c52376NFs = (C52376NFs) this;
        roundedCornerImageView.setRadius(0.0f);
        roundedCornerImageView.setAlpha(204);
        roundedCornerImageView.setBackgroundDrawable(null);
        roundedCornerImageView.setImageBitmap(c52376NFs.A02);
        roundedCornerImageView.setLayoutParams(new FrameLayout.LayoutParams(c52376NFs.A01, c52376NFs.A00, 51));
    }
}
