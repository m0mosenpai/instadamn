package X;

import com.facebook.rsys.externalcall.gen.ExternalCallDelegate;

/* renamed from: X.OpQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55757OpQ implements InterfaceC57909PmE {
    public final /* synthetic */ C52013MzH A00;

    public C55757OpQ(C52013MzH c52013MzH) {
        this.A00 = c52013MzH;
    }

    @Override // X.InterfaceC57909PmE
    public final void Cwr() {
        ExternalCallDelegate externalCallDelegate = this.A00.A00;
        if (externalCallDelegate != null) {
            externalCallDelegate.onExternalCallStarted();
        }
    }
}
