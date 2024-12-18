package X;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public final class D3Z extends C12U implements AnonymousClass195 {
    public static final D3Z A00 = new D3Z();

    @Override // X.AnonymousClass195
    @Deprecated(level = AbstractC68219VIb.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final void AGH(CancellationException cancellationException) {
    }

    @Override // X.AnonymousClass195
    public final AnonymousClass195 BbF() {
        return null;
    }

    @Override // X.AnonymousClass195
    public final boolean CRW() {
        return false;
    }

    @Override // X.AnonymousClass195
    @Deprecated(level = AbstractC68219VIb.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final boolean Emo() {
        return false;
    }

    @Override // X.AnonymousClass195
    public final boolean isActive() {
        return true;
    }

    @Override // X.AnonymousClass195
    public final boolean isCancelled() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    public D3Z() {
        super(AnonymousClass195.A00);
    }

    @Override // X.AnonymousClass195
    @Deprecated(level = AbstractC68219VIb.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final CancellationException AlP() {
        throw AbstractC166987dD.A14("This job is always active");
    }

    @Override // X.AnonymousClass195
    @Deprecated(level = AbstractC68219VIb.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final Object CgU(InterfaceC23621Ds interfaceC23621Ds) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // X.AnonymousClass195
    public final InterfaceC224417g Anf() {
        return D38.A00;
    }

    @Override // X.AnonymousClass195
    @Deprecated(level = AbstractC68219VIb.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final C19D CPE(InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        return C19C.A00;
    }

    @Override // X.AnonymousClass195
    @Deprecated(level = AbstractC68219VIb.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final C19E ACx(AnonymousClass198 anonymousClass198) {
        return C19C.A00;
    }

    @Override // X.AnonymousClass195
    @Deprecated(level = AbstractC68219VIb.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public final C19D CPD(InterfaceC16660sJ interfaceC16660sJ) {
        return C19C.A00;
    }
}
