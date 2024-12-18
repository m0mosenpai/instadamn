package androidx.compose.animation.core;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C5Y1;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class Animatable$snapTo$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public final /* synthetic */ C5Y1 A00;
    public final /* synthetic */ Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(C5Y1 c5y1, Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A00 = c5y1;
        this.A01 = obj;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new Animatable$snapTo$2(this.A00, this.A01, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Animatable$snapTo$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        C5Y1 c5y1 = this.A00;
        C5Y1.A01(c5y1);
        Object A00 = C5Y1.A00(c5y1, this.A01);
        c5y1.A04.A05.Egh(A00);
        c5y1.A09.Egh(A00);
        return C0eB.A00;
    }
}
