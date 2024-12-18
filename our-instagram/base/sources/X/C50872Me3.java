package X;

import java.util.Map;

/* renamed from: X.Me3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50872Me3 extends C2GS {
    public C152406tQ A00;
    public String A01;

    @Override // X.C2GT
    public final void A0B(Object obj) {
        C152406tQ c152406tQ = this.A00;
        if (c152406tQ != null) {
            Map map = c152406tQ.A03;
            String str = this.A01;
            map.put(str, obj);
            C05A c05a = (C05A) c152406tQ.A01.get(str);
            if (c05a != null) {
                c05a.Egh(obj);
            }
        }
        super.A0B(obj);
    }
}
