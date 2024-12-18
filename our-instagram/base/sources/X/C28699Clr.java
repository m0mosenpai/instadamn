package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView;

/* renamed from: X.Clr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28699Clr implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBar.OnSeekBarChangeListener A00;
    public final /* synthetic */ C79553h6 A01;
    public final /* synthetic */ C86033sa A02;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C14360o3.A0B(seekBar, 0);
        this.A00.onProgressChanged(seekBar, i, z);
        InterfaceC09390do interfaceC09390do = this.A02.A05;
        if (AbstractC166987dD.A0d(interfaceC09390do).getVisibility() == 0) {
            ((ScrubberPreviewThumbnailView) interfaceC09390do.getValue()).A00(i, seekBar.getMax());
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        C14360o3.A0B(seekBar, 0);
        this.A00.onStartTrackingTouch(seekBar);
        C86033sa c86033sa = this.A02;
        ((ProgressBar) c86033sa.A03.getValue()).setProgressDrawable((Drawable) AbstractC166987dD.A17(c86033sa.A04));
        if (this.A01.A03) {
            View A0d = AbstractC166987dD.A0d(c86033sa.A05);
            C04870Ng c04870Ng = C04870Ng.A00;
            AbstractC13160m2.A02(A0d, c04870Ng, 0, 200L);
            AbstractC13160m2.A02(AbstractC166987dD.A0d(c86033sa.A06), c04870Ng, 0, 200L);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C14360o3.A0B(seekBar, 0);
        this.A00.onStopTrackingTouch(seekBar);
        C86033sa c86033sa = this.A02;
        ((ProgressBar) c86033sa.A03.getValue()).setProgressDrawable((Drawable) AbstractC166987dD.A17(c86033sa.A02));
        if (this.A01.A03) {
            View A0d = AbstractC166987dD.A0d(c86033sa.A05);
            C04870Ng c04870Ng = C04870Ng.A00;
            AbstractC13160m2.A02(A0d, c04870Ng, 8, 200L);
            AbstractC13160m2.A02(AbstractC166987dD.A0d(c86033sa.A06), c04870Ng, 8, 200L);
        }
    }

    public C28699Clr(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, C79553h6 c79553h6, C86033sa c86033sa) {
        this.A00 = onSeekBarChangeListener;
        this.A02 = c86033sa;
        this.A01 = c79553h6;
    }
}
