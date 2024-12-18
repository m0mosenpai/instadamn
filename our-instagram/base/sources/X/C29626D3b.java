package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 0}, l = {605, 613}, m = "animateScrollToPage", n = {"this", "animationSpec", "page", "pageOffsetFraction"}, s = {"L$0", "L$1", "I$0", "F$0"})
/* renamed from: X.D3b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29626D3b extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ BVY A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29626D3b(BVY bvy, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = bvy;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A01 |= Integer.MIN_VALUE;
        return this.A05.A06(null, this, 0);
    }
}
