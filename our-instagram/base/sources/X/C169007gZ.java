package X;

import java.util.Map;

/* renamed from: X.7gZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169007gZ extends C0YY implements InterfaceC16590sC {
    public final /* synthetic */ C168997gY A00;
    public final /* synthetic */ C168977gW A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C169007gZ(C168997gY c168997gY, C168977gW c168977gW) {
        super(5);
        this.A00 = c168997gY;
        this.A01 = c168977gW;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        int intValue5 = ((Number) obj5).intValue();
        C168997gY c168997gY = this.A00;
        C168977gW c168977gW = this.A01;
        C168887gN c168887gN = c168977gW.A00;
        c168997gY.A00((Map) c168887gN.A02.getValue(), (Map) c168887gN.A03.getValue(), intValue, intValue2);
        C168137f8 c168137f8 = c168977gW.A01;
        if (c168137f8 != null && intValue2 >= (intValue3 - 1) - 3) {
            c168137f8.A00.invoke();
        }
        InterfaceC16590sC interfaceC16590sC = c168977gW.A02;
        if (interfaceC16590sC != null) {
            interfaceC16590sC.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue4), Integer.valueOf(intValue5));
        }
        return C0eB.A00;
    }
}
