package X;

import android.media.AudioManager;

/* loaded from: classes9.dex */
public final class OWW {
    public AH6 A00;
    public AH6 A01;
    public final AudioManager.OnAudioFocusChangeListener A02;
    public final C4RG A03;
    public final InterfaceC58103PpS A04;
    public final C55000OUz A05;
    public final InterfaceC58136Pq0 A06;

    public OWW(AudioManager audioManager, C55000OUz c55000OUz, InterfaceC58136Pq0 interfaceC58136Pq0) {
        C14360o3.A0B(audioManager, 1);
        this.A06 = interfaceC58136Pq0;
        this.A05 = c55000OUz;
        this.A03 = new C4RG(audioManager);
        this.A04 = new C55739Op8(null);
        this.A02 = new C55331Ogu(this, 1);
    }

    public static final boolean A00(AH6 ah6, OWW oww) {
        boolean A1P = AbstractC167007dF.A1P(oww.A03.A01(ah6), 1);
        oww.A05.A00("audio focus request successful: %b", Boolean.valueOf(A1P));
        return A1P;
    }

    public final void A01() {
        AH6 ah6 = this.A01;
        if (ah6 != null) {
            this.A05.A00("releasing audio focus for call", new Object[0]);
            this.A03.A00(ah6);
        }
        this.A01 = null;
    }

    public final void A02() {
        AH6 ah6 = this.A00;
        if (ah6 != null) {
            this.A05.A00("releasing audio focus for tones", new Object[0]);
            this.A03.A00(ah6);
        }
        this.A00 = null;
    }
}
