package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {101, 147}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
/* renamed from: X.D3d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29628D3d extends C1Dq {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ UpdatableAnimationState A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29628D3d(UpdatableAnimationState updatableAnimationState, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A06 = updatableAnimationState;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A01 |= Integer.MIN_VALUE;
        return this.A06.A00(this, null, null);
    }
}
