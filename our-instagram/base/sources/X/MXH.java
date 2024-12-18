package X;

import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* loaded from: classes9.dex */
public final class MXH implements Runnable {
    public final /* synthetic */ VideoPreviewView A00;

    public MXH(VideoPreviewView videoPreviewView) {
        this.A00 = videoPreviewView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoPreviewView videoPreviewView = this.A00;
        InterfaceC58181Pql interfaceC58181Pql = videoPreviewView.A03;
        if (interfaceC58181Pql != null) {
            interfaceC58181Pql.Dbw(videoPreviewView.A00.getCurrentPosition(), videoPreviewView.A00.getDuration());
            videoPreviewView.postDelayed(this, 100L);
        }
    }
}
