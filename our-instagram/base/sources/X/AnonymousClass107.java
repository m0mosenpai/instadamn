package X;

import com.facebook.react.modules.intent.IntentModule;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {26}, m = "emit", n = {"this", IntentModule.EXTRA_MAP_KEY_FOR_VALUE}, s = {"L$0", "L$1"})
/* renamed from: X.107, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass107 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ C0p7 A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass107(InterfaceC23621Ds interfaceC23621Ds, C0p7 c0p7) {
        super(interfaceC23621Ds);
        this.A05 = c0p7;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A05.emit(null, this);
    }
}
