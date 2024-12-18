package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.Gcr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37349Gcr implements C32K {
    public final C32K A00;
    public final C32K A01;

    public C37349Gcr(C32K c32k, C32K c32k2) {
        this.A00 = c32k;
        this.A01 = c32k2;
    }

    @Override // X.C32K
    public final /* bridge */ /* synthetic */ void AWR(EnumC72351Xbn enumC72351Xbn, C1PZ c1pz, Object obj) {
        AbstractC167027dH.A12(obj, enumC72351Xbn, c1pz);
        this.A00.AWR(enumC72351Xbn, c1pz, obj);
        this.A01.AWR(enumC72351Xbn, c1pz, obj);
    }

    @Override // X.C32K
    public final C5IC E6J(String str, Collection collection, Map map, boolean z) {
        AbstractC167027dH.A13(collection, map, str);
        C5IC E6J = this.A00.E6J(str, collection, map, z);
        C5IC E6J2 = this.A01.E6J(str, E6J.A01, map, z);
        ArrayList A1F = AbstractC166987dD.A1F(E6J.A00);
        Collection collection2 = E6J2.A00;
        C14360o3.A06(collection2);
        A1F.addAll(collection2);
        return new C5IC(E6J2.A01, A1F);
    }
}
