package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {379}, m = "animateWithTarget", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"})
/* renamed from: X.D3a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29625D3a extends C1Dq {
    public float A00;
    public float A01;
    public int A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;

    public C29625D3a(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A02 |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.A00(null, null, null, this, null, 0.0f, 0.0f);
    }
}
