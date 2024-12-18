package X;

import android.os.Handler;
import android.widget.SeekBar;

/* loaded from: classes11.dex */
public final class WP7 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ V4A A00;
    public final /* synthetic */ C69473Vnw A01;
    public final /* synthetic */ C6FG A02;
    public final /* synthetic */ C102884kP A03;
    public final /* synthetic */ InterfaceC103384lE A04;
    public final /* synthetic */ InterfaceC103384lE A05;

    public WP7(V4A v4a, C69473Vnw c69473Vnw, C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2) {
        this.A00 = v4a;
        this.A01 = c69473Vnw;
        this.A05 = interfaceC103384lE;
        this.A03 = c102884kP;
        this.A02 = c6fg;
        this.A04 = interfaceC103384lE2;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Handler handler = W6z.A00;
        C69473Vnw c69473Vnw = this.A01;
        handler.removeMessages(0, c69473Vnw);
        c69473Vnw.A07 = i;
        AbstractC166997dE.A1H(handler, c69473Vnw, 0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        InterfaceC103384lE interfaceC103384lE = this.A05;
        if (interfaceC103384lE != null) {
            C102884kP c102884kP = this.A03;
            C6FX c6fx = new C6FX();
            C6FG c6fg = this.A02;
            c6fx.A01(c6fg);
            AbstractC65702TsY.A1Q(c6fg, c102884kP, c6fx, interfaceC103384lE);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        InterfaceC103384lE interfaceC103384lE = this.A04;
        if (interfaceC103384lE != null) {
            C102884kP c102884kP = this.A03;
            C6FX c6fx = new C6FX();
            C6FG c6fg = this.A02;
            c6fx.A01(c6fg);
            AbstractC65702TsY.A1Q(c6fg, c102884kP, c6fx, interfaceC103384lE);
        }
    }
}
