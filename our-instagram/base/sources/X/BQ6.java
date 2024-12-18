package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BQ6 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ SeekBar.OnSeekBarChangeListener A01;
    public final /* synthetic */ SeekBar A02;
    public final /* synthetic */ BPE A03;
    public final /* synthetic */ boolean A04;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C14360o3.A0B(seekBar, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A01;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
        if (z) {
            ViewGroup A01 = AbstractC124845kp.A01(seekBar);
            String A02 = C23831Eq.A02(i);
            View requireViewById = A01.requireViewById(R.id.progress_time);
            C14360o3.A07(requireViewById);
            ((TextView) requireViewById).setText(A02);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        C14360o3.A0B(seekBar, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A01;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
        Context context = seekBar.getContext();
        Drawable drawable = context.getResources().getDrawable(R.drawable.clips_attached_scrubber_progress_active_drawable);
        SeekBar seekBar2 = this.A02;
        seekBar2.setProgressDrawable(drawable);
        if (this.A03.A0A) {
            seekBar2.setThumb(context.getDrawable(R.drawable.clips_scrubber_thumb_active_drawable));
        }
        if (this.A04) {
            AbstractC166997dE.A0S(AbstractC124845kp.A01(seekBar), R.id.timestamps_container).setVisibility(0);
        }
        View view = this.A00;
        if (view != null) {
            AbstractC13160m2.A02(view, C04870Ng.A00, 0, 200L);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C14360o3.A0B(seekBar, 0);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A01;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
        Drawable drawable = AbstractC25228BEl.A0M(seekBar).getDrawable(R.drawable.clips_attached_scrubber_progress_inactive_drawable);
        if (this.A03.A0A && !(seekBar.getThumb() instanceof ColorDrawable)) {
            seekBar.setThumb(AbstractC25225BEi.A0G(0));
        }
        this.A02.setProgressDrawable(drawable);
        AbstractC166997dE.A0S(AbstractC124845kp.A01(seekBar), R.id.timestamps_container).setVisibility(8);
        View view = this.A00;
        if (view != null) {
            AbstractC13160m2.A02(view, C04870Ng.A00, 8, 200L);
        }
    }

    public BQ6(View view, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, SeekBar seekBar, BPE bpe, boolean z) {
        this.A01 = onSeekBarChangeListener;
        this.A03 = bpe;
        this.A02 = seekBar;
        this.A04 = z;
        this.A00 = view;
    }
}
