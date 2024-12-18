package X;

import com.facebook.react.modules.intent.IntentModule;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {33, 34, 36}, m = "emit", n = {"this", IntentModule.EXTRA_MAP_KEY_FOR_VALUE}, s = {"L$0", "L$1"})
/* renamed from: X.118, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass118 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C16250rT A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass118(InterfaceC23621Ds interfaceC23621Ds, C16250rT c16250rT) {
        super(interfaceC23621Ds);
        this.A04 = c16250rT;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A04.emit(null, this);
    }
}
