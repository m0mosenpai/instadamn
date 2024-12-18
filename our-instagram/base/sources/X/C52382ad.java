package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52382ad {
    public static final /* synthetic */ C0YR[] A05 = {new AnonymousClass013(C52382ad.class, "size", "getSize()D", 0)};
    public String A00;
    public final InterfaceC52252aQ A01;
    public final InterfaceC16530ry A02;
    public final Map A03;
    public final Map A04;

    public C52382ad(InterfaceC52252aQ interfaceC52252aQ, String str, Map map) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = interfaceC52252aQ;
        this.A03 = map;
        this.A02 = new C52302aV(null);
        this.A04 = new LinkedHashMap(map);
    }

    public final void A02(C52342aZ c52342aZ, Object obj) {
        C14360o3.A0B(c52342aZ, 0);
        this.A04.put(c52342aZ.A00, obj);
    }

    public final C52432ai A00() {
        InterfaceC52252aQ interfaceC52252aQ = this.A01;
        Map map = this.A04;
        AbstractC52412ag A00 = AbstractC52392ae.A00(interfaceC52252aQ, this.A00, map);
        if (!(A00 instanceof C52422ah)) {
            return new C52432ai(this.A00, map, ((Number) this.A02.CES(this, A05[0])).doubleValue());
        }
        throw new IllegalStateException(A00.toString());
    }

    public final void A01(double d) {
        this.A02.Egi(this, Double.valueOf(d), A05[0]);
    }
}
