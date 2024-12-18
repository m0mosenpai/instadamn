package X;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;

/* loaded from: classes5.dex */
public final class DHB extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ RuntimeShader A00;
    public final /* synthetic */ InterfaceC74953Yl A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHB(RuntimeShader runtimeShader, InterfaceC74953Yl interfaceC74953Yl) {
        super(1);
        this.A00 = runtimeShader;
        this.A01 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC1132159j A0b = AbstractC25228BEl.A0b(obj);
        A0b.EPa(0.2f);
        A0b.ERU(true);
        RuntimeShader runtimeShader = this.A00;
        runtimeShader.setFloatUniform("iTime", AbstractC25231BEo.A03(this.A01));
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "composable");
        C14360o3.A07(createRuntimeShaderEffect);
        A0b.EcY(CBD.A00(createRuntimeShaderEffect));
        return C0eB.A00;
    }
}
