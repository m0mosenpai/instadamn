package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GkN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37808GkN implements InterfaceC61432r6 {
    public final C5Jz A00;
    public final C5K3 A01;

    @Override // X.InterfaceC61432r6
    public final /* synthetic */ void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        EnumC64262vl enumC64262vl;
        C120985dq c120985dq = (C120985dq) obj;
        AbstractC167027dH.A12(anonymousClass317, c120985dq, obj2);
        C14360o3.A0B(c6t6, 3);
        if (anonymousClass317 == AnonymousClass317.A0J) {
            C5Jz c5Jz = this.A00;
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && c38321qM.CdW()) {
                enumC64262vl = EnumC64262vl.A05;
            } else {
                enumC64262vl = EnumC64262vl.A04;
            }
            String str = c6t6.A02;
            if (str == null) {
                str = "";
            }
            c5Jz.A00(enumC64262vl, c120985dq, obj2, str);
            return;
        }
        throw AbstractC37303Gc4.A0M(anonymousClass317, "Wrong signal type in ProfileTapRealtimeSignalProviderImpl for Clips: ", AbstractC166987dD.A1C());
    }

    public C37808GkN(C5K3 c5k3, C5Jz c5Jz) {
        this.A00 = c5Jz;
        this.A01 = c5k3;
    }

    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        LinkedHashMap A0i = AbstractC37302Gc3.A0i(str);
        A0i.putAll(this.A01.AUU(str));
        return A0i;
    }
}
