package X;

import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class G5J implements InterfaceC163847Uy {
    public final /* synthetic */ InterfaceC83733oI A00;

    @Override // X.InterfaceC163847Uy
    public final C80993jT BsB(boolean z) {
        return null;
    }

    public G5J(InterfaceC83733oI interfaceC83733oI) {
        this.A00 = interfaceC83733oI;
    }

    @Override // X.InterfaceC163847Uy
    public final C3o9 Afi() {
        InterfaceC83733oI interfaceC83733oI = this.A00;
        C14360o3.A0C(interfaceC83733oI, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadId");
        return new DirectThreadKey(((C83693oE) interfaceC83733oI).A00, null);
    }
}
