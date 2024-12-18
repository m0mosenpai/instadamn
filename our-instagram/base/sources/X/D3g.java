package X;

import com.instagram.barcelona.common.ui.feed.FeedCarouselPinchModifierKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.common.ui.feed.FeedCarouselPinchModifierKt", f = "FeedCarouselPinchModifier.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {45, 47, 75}, m = "detectZoom", n = {"$this$detectZoom", "onZoom", "zoom", "pastTouchSlop", "isConsuming", "touchSlop", "$this$detectZoom", "onZoom", "zoom", "pastTouchSlop", "isConsuming", "touchSlop", "$this$detectZoom", "onZoom", "event", "zoom", "pastTouchSlop", "isConsuming", "touchSlop"}, s = {"L$0", "L$1", "F$0", "I$0", "I$1", "F$1", "L$0", "L$1", "F$0", "I$0", "I$1", "F$1", "L$0", "L$1", "L$2", "F$0", "I$0", "I$1", "F$1"})
/* loaded from: classes5.dex */
public final class D3g extends C1Dq {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public /* synthetic */ Object A08;

    public D3g(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A08 = obj;
        this.A04 |= Integer.MIN_VALUE;
        return FeedCarouselPinchModifierKt.A00(null, this, null);
    }
}
