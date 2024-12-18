package X;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class W33 {
    public int A00;
    public AnimatorSet A01;
    public final int A02;
    public final int A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;

    public W33(C6UL c6ul, int i) {
        C14360o3.A0B(c6ul, 1);
        this.A00 = i;
        View view = c6ul.A0C.getView();
        this.A05 = view;
        this.A06 = c6ul.A00();
        View view2 = c6ul.A02;
        if (view2 != null) {
            this.A07 = view2;
            this.A08 = c6ul.A0A;
            this.A04 = c6ul.A09;
            Resources resources = view.getResources();
            this.A03 = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            this.A02 = resources.getDimensionPixelSize(R.dimen.album_rounded_corner_overlay_padding);
            return;
        }
        C14360o3.A0F("endSceneOverlay");
        throw C00O.createAndThrow();
    }

    public static final void A00(W33 w33) {
        View view = w33.A05;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        w33.A07.setAlpha(0.0f);
        View view2 = w33.A06;
        view2.setAlpha(0.0f);
        view2.setTranslationY(w33.A03);
    }
}
