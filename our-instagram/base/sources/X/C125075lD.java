package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5lD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125075lD implements InterfaceC61432r6 {
    public final C128415rA A00;
    public final InterfaceC128455rE A01;

    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        C14360o3.A0B(str, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.A01.AUi(str));
        return linkedHashMap;
    }

    @Override // X.InterfaceC61432r6
    public final /* synthetic */ void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        EnumC64262vl enumC64262vl;
        C38321qM c38321qM = (C38321qM) obj;
        C14360o3.A0B(anonymousClass317, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(obj2, 2);
        C14360o3.A0B(c6t6, 3);
        if (anonymousClass317 == AnonymousClass317.A0Y) {
            C128415rA c128415rA = this.A00;
            if (c38321qM.CdW()) {
                enumC64262vl = EnumC64262vl.A05;
            } else {
                enumC64262vl = EnumC64262vl.A04;
            }
            String str = c6t6.A03;
            if (str == null) {
                str = "n/a";
            }
            c128415rA.A00(enumC64262vl, c38321qM, obj2, str);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wrong signal type in XoutRealtimeSignalProviderImpl: ");
        sb.append(anonymousClass317);
        throw new IllegalArgumentException(sb.toString());
    }

    public C125075lD(InterfaceC128455rE interfaceC128455rE, C128415rA c128415rA) {
        this.A00 = c128415rA;
        this.A01 = interfaceC128455rE;
    }
}
