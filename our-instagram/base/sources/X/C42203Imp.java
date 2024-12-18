package X;

import android.media.AudioManager;

/* renamed from: X.Imp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42203Imp implements InterfaceC43435JGz {
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener A00;
    public final /* synthetic */ J28 A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public C42203Imp(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, J28 j28, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = interfaceC16660sJ;
        this.A01 = j28;
        this.A00 = onAudioFocusChangeListener;
    }

    @Override // X.InterfaceC43435JGz
    public final void CqG() {
        J28 j28 = this.A01;
        AbstractC24321Hb.A00(j28.A04).A00(false);
        C5TA c5ta = j28.A01;
        if (c5ta != null) {
            c5ta.A02(0.0f, 0);
        }
        C41101vI c41101vI = j28.A03;
        c41101vI.A03(j28);
        c41101vI.A03(this.A00);
    }

    @Override // X.InterfaceC43435JGz
    public final void Eb6(float f) {
        this.A02.invoke(Float.valueOf(f));
    }
}
