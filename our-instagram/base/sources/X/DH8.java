package X;

import android.graphics.RuntimeShader;

/* loaded from: classes5.dex */
public final class DH8 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ RuntimeShader A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH8(RuntimeShader runtimeShader) {
        super(1);
        this.A00 = runtimeShader;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j = ((C119055aN) obj).A00;
        this.A00.setFloatUniform("iResolution", AbstractC25225BEi.A06(j), C119055aN.A00(j));
        return C0eB.A00;
    }
}
