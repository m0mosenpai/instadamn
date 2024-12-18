package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public final class AQE implements View.OnClickListener {
    public final /* synthetic */ C180667zu A00;

    public AQE(C180667zu c180667zu) {
        this.A00 = c180667zu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(217783217);
        C14360o3.A0B(view, 0);
        Drawable drawable = ((ImageView) view).getDrawable();
        C14360o3.A0C(drawable, "null cannot be cast to non-null type com.instagram.music.common.ui.MusicPreviewButtonDrawable");
        C8G6 c8g6 = (C8G6) drawable;
        BDK bdk = this.A00.A08;
        if (bdk != null && bdk.isPlaying()) {
            c8g6.A01(C8G5.A04);
            bdk.onPause();
        } else {
            c8g6.A01(C8G5.A05);
            if (bdk != null) {
                bdk.DYs();
            }
        }
        C0f9.A0C(1358337885, A05);
    }
}
