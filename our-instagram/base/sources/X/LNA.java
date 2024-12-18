package X;

import android.media.MediaPlayer;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* loaded from: classes8.dex */
public final class LNA implements MediaPlayer.OnPreparedListener {
    public final int A00;
    public final Object A01;

    public LNA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                RoundedCornerFrameLayout roundedCornerFrameLayout = ((PHB) this.A01).A03.A09;
                if (roundedCornerFrameLayout != null) {
                    roundedCornerFrameLayout.setVisibility(0);
                }
                mediaPlayer.setVolume(0.0f, 0.0f);
                mediaPlayer.setLooping(true);
                mediaPlayer.start();
                return;
            case 2:
                C14360o3.A0B(mediaPlayer, 0);
                mediaPlayer.setLooping(true);
                float f = 1.0f;
                if (((C45484KBy) this.A01).A05) {
                    f = 0.0f;
                }
                mediaPlayer.setVolume(f, f);
                try {
                    mediaPlayer.start();
                    return;
                } catch (IllegalStateException e) {
                    C0w9.A07("DirectClipsPreviewViewModel mediaPlayer.start failed", e);
                    return;
                }
            case 3:
                JQ0.A0x(mediaPlayer);
                IgEditText igEditText = ((C45466KBb) this.A01).A0I;
                if (igEditText == null) {
                    C14360o3.A0F("noteEditText");
                    throw C00O.createAndThrow();
                }
                F3X.A00(igEditText);
                return;
            case 4:
                mediaPlayer.setOnInfoListener(new LN9((ConstraintLayout) this.A01));
                mediaPlayer.setVideoScalingMode(1);
                return;
            case 5:
                mediaPlayer.setLooping(true);
                AbstractC43593JPy.A1Q(this.A01);
                return;
            default:
                return;
        }
    }
}
