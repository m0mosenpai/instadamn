package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.feed.ui.rows.videoscrubber.buffer.layout.MediaVideoScrubberBufferRelativeLayout;

/* loaded from: classes8.dex */
public final class LQB implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MediaVideoScrubberBufferRelativeLayout A01;

    public LQB(MediaVideoScrubberBufferRelativeLayout mediaVideoScrubberBufferRelativeLayout, int i) {
        this.A01 = mediaVideoScrubberBufferRelativeLayout;
        this.A00 = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        MediaVideoScrubberBufferRelativeLayout mediaVideoScrubberBufferRelativeLayout = this.A01;
        int A03 = AbstractC167017dG.A03(mediaVideoScrubberBufferRelativeLayout.getContext());
        int i9 = this.A00;
        AbstractC25236BEt.A0f(new Rect(0, 0, A03, i9), mediaVideoScrubberBufferRelativeLayout, A03, i9);
    }
}