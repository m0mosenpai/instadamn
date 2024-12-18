package X;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio.StackedAdjustHorizontalScrollView;

/* loaded from: classes9.dex */
public final class OJs {
    public float A00;
    public int A01;
    public final int A02;
    public final View A03;
    public final FrameLayout A04;
    public final C51198Mji A05;
    public final O23 A06;
    public final NI7 A07;
    public final StackedAdjustHorizontalScrollView A08;
    public final C50788Mby A09;
    public final Mb0 A0A;
    public final FrameLayout A0B;

    public final synchronized int A00() {
        return (int) ((this.A08.getScrollX() * this.A00) / AbstractC50522MSa.A00(AbstractC166997dE.A0L(this.A04), OZQ.A00));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.Mby, android.view.View] */
    public OJs(Context context, O23 o23, NI7 ni7, int i) {
        this.A07 = ni7;
        this.A06 = o23;
        this.A02 = i;
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.layout_stacked_adjust_audio_segment);
        C14360o3.A0C(A0C, AbstractC111324zv.A00(1));
        FrameLayout frameLayout = (FrameLayout) A0C;
        this.A04 = frameLayout;
        StackedAdjustHorizontalScrollView stackedAdjustHorizontalScrollView = (StackedAdjustHorizontalScrollView) AbstractC166987dD.A0c(frameLayout, R.id.clips_editor_audio_adjust_scroll);
        this.A08 = stackedAdjustHorizontalScrollView;
        this.A05 = new C51198Mji(this, 4);
        View A0c = AbstractC166987dD.A0c(frameLayout, R.id.clips_editor_audio_dimmer);
        this.A03 = A0c;
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.clips_editor_audio_waveform);
        this.A0B = frameLayout2;
        ?? view = new View(AbstractC166997dE.A0L(frameLayout));
        view.A00 = 1.0f;
        this.A09 = view;
        this.A00 = 1.0f;
        frameLayout2.addView(view);
        Mb0 mb0 = new Mb0(Color.argb(155, 0, 0, 0));
        this.A0A = mb0;
        A0c.setForeground(mb0);
        stackedAdjustHorizontalScrollView.setOnScrollStoppedListener(new C56301OzM(this));
    }
}
