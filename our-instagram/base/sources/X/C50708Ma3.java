package X;

import android.media.MediaPlayer;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.Ma3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50708Ma3 implements MediaPlayer.OnInfoListener {
    public final /* synthetic */ VideoPreviewView A00;

    public C50708Ma3(VideoPreviewView videoPreviewView) {
        this.A00 = videoPreviewView;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        VideoPreviewView videoPreviewView = this.A00;
        InterfaceC58181Pql interfaceC58181Pql = videoPreviewView.A03;
        if (i == 3 && interfaceC58181Pql != null) {
            videoPreviewView.removeCallbacks(videoPreviewView.A05);
            interfaceC58181Pql.DYw(videoPreviewView);
            videoPreviewView.post(videoPreviewView.A06);
            return false;
        }
        return false;
    }
}
