package X;

import com.meta.compose.component.swipeable.SwipeableState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.compose.component.swipeable.SwipeableState", f = "Swipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {153, 177, 180}, m = "processNewAnchors$fbandroid_java_com_meta_compose_component_swipeable_swipeable", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
/* renamed from: X.D3c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29627D3c extends C1Dq {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ SwipeableState A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29627D3c(SwipeableState swipeableState, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = swipeableState;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A01 |= Integer.MIN_VALUE;
        return this.A05.A02(null, null, this);
    }
}
