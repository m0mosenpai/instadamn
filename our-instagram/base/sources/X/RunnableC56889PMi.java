package X;

import android.graphics.Bitmap;
import android.widget.SeekBar;
import com.instagram.creation.base.ui.ConstrainedTextureView;

/* renamed from: X.PMi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56889PMi implements Runnable {
    public final /* synthetic */ NLG A00;

    public RunnableC56889PMi(NLG nlg) {
        this.A00 = nlg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        NLG nlg = this.A00;
        SeekBar seekBar = nlg.A05;
        if (seekBar != null) {
            int A08 = (int) ((nlg.A01 * AbstractC166987dD.A08(seekBar)) + 0.5f);
            C50743Max c50743Max = nlg.A06;
            if (c50743Max != null) {
                ConstrainedTextureView constrainedTextureView = ((KB4) nlg).A03;
                if (constrainedTextureView != null) {
                    bitmap = constrainedTextureView.getBitmap(A08, seekBar.getHeight());
                } else {
                    bitmap = null;
                }
                c50743Max.A07 = bitmap;
                c50743Max.invalidateSelf();
            }
            seekBar.invalidate();
        }
    }
}
