package X;

import android.graphics.Bitmap;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.SfxSeekBarView;

/* loaded from: classes9.dex */
public final class OU5 {
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final String A03;
    public final /* synthetic */ SfxSeekBarView A04;

    public OU5(Bitmap bitmap, SfxSeekBarView sfxSeekBarView, String str, int i, int i2) {
        this.A04 = sfxSeekBarView;
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bitmap;
    }

    public static final float A00(OU5 ou5) {
        int i = ou5.A01;
        float f = ou5.A00 + i;
        SfxSeekBarView sfxSeekBarView = ou5.A04;
        float f2 = sfxSeekBarView.A00;
        float f3 = sfxSeekBarView.A01;
        Float valueOf = Float.valueOf((((f * f2) / f3) + ((i * f2) / f3)) * 0.5f);
        float f4 = sfxSeekBarView.A03;
        return AbstractC166987dD.A09(C17s.A09(valueOf, new JTC(f4, (sfxSeekBarView.A0A.right - f4) - 3.0f)));
    }
}
