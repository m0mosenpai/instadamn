package X;

import android.media.AudioManager;

/* renamed from: X.OrX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55883OrX implements InterfaceC43435JGz {
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener A00;
    public final /* synthetic */ C55333Ogw A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    public C55883OrX(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, C55333Ogw c55333Ogw, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A03 = interfaceC16660sJ;
        this.A02 = interfaceC16820sZ;
        this.A01 = c55333Ogw;
        this.A00 = onAudioFocusChangeListener;
    }

    @Override // X.InterfaceC43435JGz
    public final void CqG() {
        this.A02.invoke();
        this.A01.A00.A03(this.A00);
    }

    @Override // X.InterfaceC43435JGz
    public final void Eb6(float f) {
        this.A03.invoke(Float.valueOf(f));
    }
}
