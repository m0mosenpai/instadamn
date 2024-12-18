package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.media.MediaPlayer;

/* renamed from: X.UOx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66610UOx extends AbstractC56722j5 {
    public MediaPlayer A00;

    @Override // X.AbstractC56722j5
    public final void A0A(Canvas canvas) {
    }

    @Override // X.AbstractC56722j5
    public final void A0E(RectF rectF) {
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // X.AbstractC56722j5
    public final void A08(float f) {
        float f2;
        C68i c68i;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            AbstractC56612iu abstractC56612iu = this.A04;
            float[] fArr = abstractC56612iu.A0w;
            if (fArr == null && abstractC56612iu.A0y == null) {
                return;
            }
            float f3 = 0.0f;
            if (fArr == null) {
                f2 = 0.0f;
            } else {
                f2 = fArr[0];
            }
            C68i[] c68iArr = abstractC56612iu.A0y;
            C68i c68i2 = null;
            if (c68iArr == null) {
                c68i = null;
            } else {
                c68i = c68iArr[0];
            }
            C56682j1 c56682j1 = this.A0B;
            float A00 = C3LR.A00(c68i, f2, f, c56682j1.A0E.A00);
            if (fArr != null) {
                f3 = fArr[1];
            }
            if (c68iArr != null) {
                c68i2 = c68iArr[1];
            }
            mediaPlayer.setVolume((float) Math.pow(10.0d, A00 / 20.0f), (float) Math.pow(10.0d, C3LR.A00(c68i2, f3, f, r1) / 20.0f));
            if (this.A00.isPlaying()) {
                return;
            }
            if (this.A00 != null) {
                float f4 = abstractC56612iu.A04;
                float duration = ((f - f4) / (abstractC56612iu.A0E - f4)) * r2.getDuration();
                if (Math.abs(this.A00.getCurrentPosition() - duration) > 0.1f) {
                    this.A00.seekTo((int) duration);
                }
            }
            if (c56682j1.A01 != 1) {
                return;
            }
            this.A00.start();
        }
    }
}
