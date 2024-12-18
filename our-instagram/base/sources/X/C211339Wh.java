package X;

import java.util.Map;

/* renamed from: X.9Wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211339Wh extends AbstractC131215w9 {
    public Map A00;
    public final C19L A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C211339Wh(C35777FrF c35777FrF) {
        super(c35777FrF);
        C19K A0w = AbstractC167017dG.A0w(C12L.A00, 1573891647);
        C14360o3.A0B(A0w, 2);
        this.A01 = A0w;
    }

    @Override // X.AbstractC131215w9
    public final UPS A00(String str) {
        Map map = this.A00;
        if (map == null) {
            C14360o3.A0F("productMap");
            throw C00O.createAndThrow();
        }
        return (UPS) map.get(str);
    }
}
