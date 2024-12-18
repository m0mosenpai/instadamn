package androidx.compose.foundation;

import X.AbstractC166987dD;
import X.C14360o3;
import X.C25778BaH;
import X.C58J;
import X.C58K;
import X.C58N;
import X.C5AY;
import X.C5XP;
import X.InterfaceC118065Vq;

/* loaded from: classes5.dex */
public final class IndicationModifierElement extends C58N {
    public final InterfaceC118065Vq A00;
    public final C5XP A01;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IndicationModifierElement) {
                IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
                if (!C14360o3.A0K(this.A01, indicationModifierElement.A01) || !C14360o3.A0K(this.A00, indicationModifierElement.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.5AY, X.58J, X.BaH] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        C58K AL3 = this.A00.AL3(this.A01);
        ?? c5ay = new C5AY();
        c5ay.A00 = AL3;
        c5ay.A0F(AL3);
        return c5ay;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C25778BaH c25778BaH = (C25778BaH) c58j;
        C58K AL3 = this.A00.AL3(this.A01);
        c25778BaH.A0G(c25778BaH.A00);
        c25778BaH.A00 = AL3;
        c25778BaH.A0F(AL3);
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public IndicationModifierElement(InterfaceC118065Vq interfaceC118065Vq, C5XP c5xp) {
        this.A01 = c5xp;
        this.A00 = interfaceC118065Vq;
    }
}
