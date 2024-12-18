package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.MMe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50377MMe extends C3Iv implements C19L, InterfaceC24751Is {
    @Override // X.AnonymousClass198
    public final void A0O(Throwable th) {
        InterfaceC24731Iq interfaceC24731Iq = ((C3Iv) this).A00;
        CancellationException cancellationException = null;
        if (th != null && (!(th instanceof CancellationException) || (cancellationException = (CancellationException) th) == null)) {
            cancellationException = new CancellationException(AnonymousClass001.A0R(AbstractC31173DnH.A0q(this), " was cancelled"));
            cancellationException.initCause(th);
        }
        interfaceC24731Iq.AGH(cancellationException);
    }

    @Override // X.AnonymousClass198
    public final boolean A0V(Throwable th) {
        CLX.A00(((AbstractC23681Dy) this).A00, th);
        return true;
    }
}
