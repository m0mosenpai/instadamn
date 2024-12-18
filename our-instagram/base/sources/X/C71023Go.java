package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Go, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71023Go implements InterfaceC61432r6 {
    public final InterfaceC60442pS A00;
    public final C1M6 A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final C61412r4 A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.3ry, java.lang.Object] */
    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        Map AUS;
        C14360o3.A0B(str, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long currentTimeMillis = System.currentTimeMillis();
        if (this.A0G && (this.A0D || this.A0F)) {
            linkedHashMap.putAll(((InterfaceC126055mz) this.A0A.getValue()).AUc(str));
            if (this.A0F) {
                AUS = ((InterfaceC85683rx) this.A08.getValue()).Bbk(str);
                linkedHashMap.putAll(AUS);
            }
        } else {
            linkedHashMap.putAll(((InterfaceC61432r6) this.A0B.getValue()).AUS(str));
            linkedHashMap.putAll(((InterfaceC61432r6) this.A06.getValue()).AUS(str));
            linkedHashMap.putAll(((InterfaceC85683rx) this.A08.getValue()).Bbk(str));
            linkedHashMap.putAll(((InterfaceC61432r6) this.A03.getValue()).AUS(str));
            linkedHashMap.putAll(((InterfaceC61432r6) this.A05.getValue()).AUS(str));
            linkedHashMap.putAll(((InterfaceC61432r6) this.A02.getValue()).AUS(str));
            if (this.A0E) {
                AUS = ((InterfaceC61432r6) this.A04.getValue()).AUS(str);
                linkedHashMap.putAll(AUS);
            }
        }
        this.A01.EIH(new Object(), this.A00.getModuleName(), str, AbstractC001800i.A0a(linkedHashMap.keySet()), AbstractC06930Yk.A0B(linkedHashMap), System.currentTimeMillis() - currentTimeMillis);
        return linkedHashMap;
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        InterfaceC09390do interfaceC09390do;
        C14360o3.A0B(anonymousClass317, 0);
        C14360o3.A0B(obj, 1);
        C14360o3.A0B(obj2, 2);
        C14360o3.A0B(c6t6, 3);
        switch (anonymousClass317.ordinal()) {
            case 2:
                interfaceC09390do = this.A04;
                break;
            case 7:
                interfaceC09390do = this.A06;
                break;
            case 16:
                interfaceC09390do = this.A0B;
                break;
            case 24:
                interfaceC09390do = this.A09;
                break;
            case 26:
                interfaceC09390do = this.A02;
                break;
            case 27:
                interfaceC09390do = this.A05;
                break;
            case 28:
                interfaceC09390do = this.A03;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Wrong signal type in RealtimeSignalProviderImpl for Stories: ");
                sb.append(anonymousClass317);
                throw new IllegalArgumentException(sb.toString());
        }
        ((InterfaceC61432r6) interfaceC09390do.getValue()).DVi(c6t6, anonymousClass317, obj, obj2);
    }

    @Override // X.InterfaceC61432r6
    public final void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
        C14360o3.A0B(collection, 0);
        C14360o3.A0B(enumC74603Ws, 1);
        C61412r4 c61412r4 = this.A0C;
        if (c61412r4 != null) {
            c61412r4.A00(enumC74603Ws, collection);
        }
    }

    public C71023Go(InterfaceC60442pS interfaceC60442pS, C1M6 c1m6, C61412r4 c61412r4, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16820sZ interfaceC16820sZ9, InterfaceC16820sZ interfaceC16820sZ10, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0D = z;
        this.A0F = z2;
        this.A0G = z3;
        this.A01 = c1m6;
        this.A00 = interfaceC60442pS;
        this.A0E = z4;
        this.A0C = c61412r4;
        this.A0B = AbstractC09440dt.A01(new C9EO(interfaceC16820sZ, 46));
        this.A06 = AbstractC09440dt.A01(new C9EO(interfaceC16820sZ2, 41));
        this.A04 = AbstractC09440dt.A01(new C9EO(interfaceC16820sZ3, 39));
        this.A09 = AbstractC09440dt.A01(new C9EO(interfaceC16820sZ4, 44));
        this.A03 = AbstractC09440dt.A01(new C9EO(interfaceC16820sZ5, 38));
        this.A05 = AbstractC09440dt.A01(new C9EO(interfaceC16820sZ6, 40));
        this.A02 = AbstractC09440dt.A01(new C9EO(interfaceC16820sZ7, 37));
        this.A08 = AbstractC09440dt.A01(new C9EO(interfaceC16820sZ8, 43));
        this.A07 = AbstractC09440dt.A01(new C9EO(interfaceC16820sZ9, 42));
        this.A0A = AbstractC09440dt.A01(new C9EO(interfaceC16820sZ10, 45));
    }
}
