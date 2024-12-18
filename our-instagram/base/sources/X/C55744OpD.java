package X;

import androidx.media.AudioAttributesCompat;

/* renamed from: X.OpD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55744OpD implements InterfaceC58136Pq0 {
    public final /* synthetic */ C55193Odz A00;

    @Override // X.InterfaceC58136Pq0
    public final synchronized void DIo() {
        C55193Odz c55193Odz = this.A00;
        AudioAttributesCompat audioAttributesCompat = C55193Odz.A0M;
        C54832OLr c54832OLr = c55193Odz.A00;
        if (c54832OLr != null) {
            c55193Odz.A06.Emj(c54832OLr);
        }
    }

    @Override // X.InterfaceC58136Pq0
    public final synchronized void DQt() {
        this.A00.A04();
    }

    @Override // X.InterfaceC58136Pq0
    public final synchronized void DvL() {
        C55193Odz c55193Odz = this.A00;
        AudioAttributesCompat audioAttributesCompat = C55193Odz.A0M;
        c55193Odz.A06.pause();
    }

    public C55744OpD(C55193Odz c55193Odz) {
        this.A00 = c55193Odz;
    }

    @Override // X.InterfaceC58136Pq0
    public final void Dfy() {
        AudioAttributesCompat audioAttributesCompat = C55193Odz.A0M;
    }
}
