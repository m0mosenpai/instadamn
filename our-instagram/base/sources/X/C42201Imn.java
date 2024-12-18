package X;

import android.media.AudioManager;

/* renamed from: X.Imn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42201Imn implements InterfaceC43435JGz {
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener A00;
    public final /* synthetic */ J25 A01;

    public C42201Imn(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, J25 j25) {
        this.A01 = j25;
        this.A00 = onAudioFocusChangeListener;
    }

    @Override // X.InterfaceC43435JGz
    public final void CqG() {
        J25 j25 = this.A01;
        AbstractC24321Hb.A00(j25.A03).A00(false);
        C5TA c5ta = j25.A00;
        if (c5ta != null) {
            c5ta.A02(0.0f, 0);
        }
        C41101vI c41101vI = j25.A02;
        c41101vI.A03(j25);
        c41101vI.A03(this.A00);
    }

    @Override // X.InterfaceC43435JGz
    public final void Eb6(float f) {
        C5TA c5ta = this.A01.A00;
        if (c5ta != null) {
            c5ta.A02(f, 0);
        }
    }
}
