package androidx.compose.runtime;

import X.C12W;
import X.C19L;
import X.InterfaceC74953Yl;

/* loaded from: classes3.dex */
public final class ProduceStateScopeImpl implements InterfaceC74953Yl, C19L {
    public final C12W A00;
    public final /* synthetic */ InterfaceC74953Yl A01;

    @Override // X.InterfaceC74953Yl
    public final void Egh(Object obj) {
        this.A01.Egh(obj);
    }

    @Override // X.InterfaceC74953Yl, X.InterfaceC74963Ym
    public final Object getValue() {
        return this.A01.getValue();
    }

    @Override // X.C19L
    public final C12W Arv() {
        return this.A00;
    }

    public ProduceStateScopeImpl(InterfaceC74953Yl interfaceC74953Yl, C12W c12w) {
        this.A00 = c12w;
        this.A01 = interfaceC74953Yl;
    }
}
