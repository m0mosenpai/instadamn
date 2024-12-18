package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.KZi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46039KZi extends AbstractC26311Pm {
    public static final C46039KZi A02 = new C46039KZi();
    public final Integer A00 = C05F.A01;
    public final HashSet A01 = AbstractC166987dD.A1H();

    @Override // X.AbstractC26311Pm
    public final int A03(EnumC26291Pk enumC26291Pk, List list, int i) {
        C14360o3.A0B(list, 0);
        HashSet hashSet = this.A01;
        AbstractC166997dE.A1W(hashSet, i);
        return hashSet.size();
    }

    @Override // X.AbstractC26311Pm
    public final boolean A06(EnumC26291Pk enumC26291Pk, Integer num, List list, int i) {
        C14360o3.A0B(num, 3);
        return AbstractC167007dF.A1X(this.A00, num);
    }

    @Override // X.AbstractC26311Pm
    public final void A02() {
        this.A01.clear();
    }

    @Override // X.AbstractC26311Pm
    public final int A05(List list) {
        return this.A01.size();
    }
}
