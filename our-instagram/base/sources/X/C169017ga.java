package X;

import java.util.Map;

/* renamed from: X.7ga, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169017ga extends C0YY implements C0s9 {
    public final /* synthetic */ C168997gY A00;
    public final /* synthetic */ C168977gW A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C169017ga(C168997gY c168997gY, C168977gW c168977gW) {
        super(7);
        this.A00 = c168997gY;
        this.A01 = c168977gW;
    }

    @Override // X.C0s9
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        ((Number) obj3).longValue();
        int intValue = ((Number) obj4).intValue();
        int intValue2 = ((Number) obj5).intValue();
        ((Number) obj7).intValue();
        C14360o3.A0B(obj6, 5);
        C168997gY c168997gY = this.A00;
        C168887gN c168887gN = this.A01.A00;
        c168997gY.A00((Map) c168887gN.A02.getValue(), (Map) c168887gN.A03.getValue(), intValue, intValue2);
        return C0eB.A00;
    }
}
