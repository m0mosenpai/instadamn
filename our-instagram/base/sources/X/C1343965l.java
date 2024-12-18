package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.65l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1343965l extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C62D A01;
    public final /* synthetic */ C5Y2 A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ C15370ps A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343965l(C62D c62d, C5Y2 c5y2, InterfaceC16660sJ interfaceC16660sJ, C15370ps c15370ps, float f) {
        super(1);
        this.A04 = c15370ps;
        this.A00 = f;
        this.A01 = c62d;
        this.A02 = c5y2;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.A04.A00;
        C14360o3.A0A(obj2);
        float f = this.A00;
        SuspendAnimationKt.A05(this.A01, (C62T) obj2, this.A02, this.A03, f, longValue);
        return C0eB.A00;
    }
}
