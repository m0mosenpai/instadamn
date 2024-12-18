package X;

import com.facebook.rsys.externalcall.gen.ExternalCallDelegate;

/* renamed from: X.OpR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55758OpR implements InterfaceC57909PmE {
    public final /* synthetic */ C52012MzG A00;

    public C55758OpR(C52012MzG c52012MzG) {
        this.A00 = c52012MzG;
    }

    @Override // X.InterfaceC57909PmE
    public final void Cwr() {
        ExternalCallDelegate externalCallDelegate = this.A00.A00;
        if (externalCallDelegate != null) {
            externalCallDelegate.onExternalCallStarted();
        }
    }
}
