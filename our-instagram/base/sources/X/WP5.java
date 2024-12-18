package X;

import android.widget.SeekBar;
import com.facebook.react.uimanager.UIManagerHelper;

/* loaded from: classes11.dex */
public final class WP5 implements SeekBar.OnSeekBarChangeListener {
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        X9J A05 = UIManagerHelper.A05((Q21) seekBar.getContext(), seekBar.getId());
        if (A05 != null) {
            A05.APn(new C67619Usq(seekBar.getId(), z, ((C66362UDb) seekBar).A01(i)));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        X9J A05 = UIManagerHelper.A05((Q21) seekBar.getContext(), seekBar.getId());
        if (A05 != null) {
            A05.APn(new C67621Uss(UIManagerHelper.A01(seekBar), seekBar.getId(), ((C66362UDb) seekBar).A01(seekBar.getProgress())));
        }
    }
}
