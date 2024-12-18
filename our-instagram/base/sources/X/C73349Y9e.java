package X;

import android.view.Surface;

/* renamed from: X.Y9e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73349Y9e implements InterfaceC197958p6 {
    public C178597wX A00;
    public final /* synthetic */ C73348Y9d A01;

    public C73349Y9e(C178597wX c178597wX, C73348Y9d c73348Y9d) {
        this.A01 = c73348Y9d;
        this.A00 = c178597wX;
    }

    @Override // X.InterfaceC197958p6
    public final void AWg(InterfaceC185788Ly interfaceC185788Ly) {
        C73348Y9d.A00(this.A01, interfaceC185788Ly, 31);
    }

    @Override // X.InterfaceC197958p6
    public final void EpX(Surface surface, InterfaceC185788Ly interfaceC185788Ly) {
        C73348Y9d.A01(this.A01, new Object[]{interfaceC185788Ly, surface}, 10);
    }

    @Override // X.InterfaceC197958p6
    public final void EpZ(InterfaceC185788Ly interfaceC185788Ly) {
        C73348Y9d c73348Y9d = this.A01;
        Y7X y7x = c73348Y9d.A03;
        synchronized (interfaceC185788Ly) {
            y7x.A0i.add(interfaceC185788Ly);
        }
        C73348Y9d.A00(c73348Y9d, interfaceC185788Ly, 11);
    }
}
