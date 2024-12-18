package X;

import android.widget.SeekBar;

/* loaded from: classes9.dex */
public final class POU implements Runnable {
    public final /* synthetic */ C55535OlT A00;

    public POU(C55535OlT c55535OlT) {
        this.A00 = c55535OlT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55535OlT c55535OlT = this.A00;
        C50743Max c50743Max = c55535OlT.A08;
        if (c50743Max != null) {
            float f = c55535OlT.A0A.A01;
            SeekBar seekBar = c55535OlT.A06;
            c50743Max.A07 = c55535OlT.A07.getBitmap((int) ((f * AbstractC166987dD.A08(seekBar)) + 0.5f), seekBar.getHeight());
            c50743Max.invalidateSelf();
            seekBar.invalidate();
        }
    }
}
