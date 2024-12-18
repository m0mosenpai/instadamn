package androidx.compose.foundation.relocation;

import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5EA;
import X.InterfaceC50412MNo;

/* loaded from: classes5.dex */
public final class BringIntoViewRequesterElement extends C58N {
    public final InterfaceC50412MNo A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5EA, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        InterfaceC50412MNo interfaceC50412MNo = this.A00;
        ?? c58j = new C58J();
        c58j.A00 = interfaceC50412MNo;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        ((C5EA) c58j).A0F(this.A00);
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof BringIntoViewRequesterElement) && C14360o3.A0K(this.A00, ((BringIntoViewRequesterElement) obj).A00)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public BringIntoViewRequesterElement(InterfaceC50412MNo interfaceC50412MNo) {
        this.A00 = interfaceC50412MNo;
    }
}
