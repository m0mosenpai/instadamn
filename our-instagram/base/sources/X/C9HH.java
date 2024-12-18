package X;

import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 0, 1}, l = {104, 105}, m = "onPostFling-RZ2iAVY", n = {"this", "consumed", "available", "selfConsumed"}, s = {"L$0", "J$0", "J$1", "J$0"})
/* renamed from: X.9HH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9HH extends C1Dq {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ NestedScrollNode A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9HH(NestedScrollNode nestedScrollNode, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = nestedScrollNode;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A05.DZz(this, 0L, 0L);
    }
}
