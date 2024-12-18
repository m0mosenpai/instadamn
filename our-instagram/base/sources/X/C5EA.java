package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;

/* renamed from: X.5EA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EA extends C58J {
    public InterfaceC50412MNo A00;

    public final void A0F(InterfaceC50412MNo interfaceC50412MNo) {
        InterfaceC50412MNo interfaceC50412MNo2 = this.A00;
        if (interfaceC50412MNo2 instanceof BringIntoViewRequesterImpl) {
            C14360o3.A0C(interfaceC50412MNo2, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) interfaceC50412MNo2).A00.A0B(this);
        }
        if (interfaceC50412MNo instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) interfaceC50412MNo).A00.A09(this);
        }
        this.A00 = interfaceC50412MNo;
    }
}
