package X;

import android.content.Context;
import android.os.Handler;
import android.widget.SeekBar;

/* renamed from: X.ATz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23288ATz implements SeekBar.OnSeekBarChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C23288ATz(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.A00 != 0) {
            AlI alI = (AlI) this.A03;
            alI.A01 = i;
            ((InterfaceC189998bI) this.A02).Dj7(alI, i);
        } else {
            Handler handler = AbstractC68625VYb.A00;
            C68714Vaq c68714Vaq = (C68714Vaq) this.A03;
            handler.removeMessages(0, c68714Vaq);
            c68714Vaq.A00 = new C69088Vhe((C6FG) this.A01, (C102884kP) this.A02, i);
            AbstractC166997dE.A1H(handler, c68714Vaq, 0);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.A00 != 0) {
            ((InterfaceC189998bI) this.A02).Dj6((AlI) this.A03);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.A00 != 0) {
            C23093AGd c23093AGd = BE3.A00;
            Context context = (Context) this.A01;
            C14360o3.A0A(context);
            AlI alI = (AlI) this.A03;
            AbstractC56932jR.A07(alI.A03, c23093AGd.A00(context, 2131967976, alI.A01, alI.A02));
            ((InterfaceC189998bI) this.A02).Dj5(alI);
        }
    }
}
