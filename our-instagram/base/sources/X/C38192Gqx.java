package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gqx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38192Gqx implements InterfaceC61432r6 {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC60442pS A03;
    public final C1M6 A04;
    public final C61412r4 A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.3ry, java.lang.Object] */
    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        Map AUS;
        C14360o3.A0B(str, 0);
        long currentTimeMillis = System.currentTimeMillis();
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (this.A08 && (this.A06 || this.A07)) {
            AbstractC37302Gc3.A1X(str, A1I, this.A02);
            if (this.A07) {
                AUS = AbstractC37302Gc3.A0k(str, this.A01);
            }
            this.A04.EIH(new Object(), this.A03.getModuleName(), str, AbstractC001800i.A0a(A1I.keySet()), A1I, AbstractC37300Gc1.A00(currentTimeMillis));
            return A1I;
        }
        A1I.putAll(AbstractC37302Gc3.A0k(str, this.A01));
        AUS = ((InterfaceC61432r6) this.A00.getValue()).AUS(str);
        A1I.putAll(AUS);
        this.A04.EIH(new Object(), this.A03.getModuleName(), str, AbstractC001800i.A0a(A1I.keySet()), A1I, AbstractC37300Gc1.A00(currentTimeMillis));
        return A1I;
    }

    public C38192Gqx(InterfaceC60442pS interfaceC60442pS, C1M6 c1m6, C61412r4 c61412r4, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, boolean z, boolean z2, boolean z3) {
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A04 = c1m6;
        this.A03 = interfaceC60442pS;
        this.A05 = c61412r4;
        this.A01 = AbstractC37301Gc2.A0s(interfaceC16820sZ2, 33);
        this.A02 = AbstractC37301Gc2.A0s(interfaceC16820sZ3, 34);
        this.A00 = AbstractC37301Gc2.A0s(interfaceC16820sZ, 32);
    }

    @Override // X.InterfaceC61432r6
    public final void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
        AbstractC167017dG.A1N(collection, enumC74603Ws);
        this.A05.A00(enumC74603Ws, collection);
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
    }
}
