package X;

import androidx.media.AudioAttributesCompat;

/* renamed from: X.PPf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56964PPf implements Runnable {
    public final /* synthetic */ C55193Odz A00;
    public final /* synthetic */ boolean A01;

    public RunnableC56964PPf(C55193Odz c55193Odz, boolean z) {
        this.A00 = c55193Odz;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55193Odz c55193Odz = this.A00;
        AudioAttributesCompat audioAttributesCompat = C55193Odz.A0M;
        java.util.Set<InterfaceC16660sJ> set = c55193Odz.A0A;
        boolean z = this.A01;
        for (InterfaceC16660sJ interfaceC16660sJ : set) {
            c55193Odz.A07.A00(AnonymousClass001.A1D("isAudioDisabledBySystem - callback ", z), new Object[0]);
            AbstractC25227BEk.A1Q(interfaceC16660sJ, c55193Odz.A01);
        }
    }
}
