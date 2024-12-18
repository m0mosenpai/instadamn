package X;

import com.facebook.react.modules.intent.IntentModule;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {219, 220}, m = "emit", n = {IntentModule.EXTRA_MAP_KEY_FOR_VALUE, "$this$onEach_u24lambda_u248"}, s = {"L$0", "L$1"})
/* renamed from: X.10Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10Y extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C15360pr A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10Y(InterfaceC23621Ds interfaceC23621Ds, C15360pr c15360pr) {
        super(interfaceC23621Ds);
        this.A04 = c15360pr;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A04.emit(null, this);
    }
}
