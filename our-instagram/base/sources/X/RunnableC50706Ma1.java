package X;

import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.Ma1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC50706Ma1 implements Runnable {
    public final /* synthetic */ VideoPreviewView A00;

    public RunnableC50706Ma1(VideoPreviewView videoPreviewView) {
        this.A00 = videoPreviewView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoPreviewView videoPreviewView = this.A00;
        InterfaceC58181Pql interfaceC58181Pql = videoPreviewView.A03;
        if (interfaceC58181Pql != null) {
            interfaceC58181Pql.DYx(videoPreviewView);
        }
    }
}
