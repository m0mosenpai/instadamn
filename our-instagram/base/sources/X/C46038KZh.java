package X;

import java.util.List;

/* renamed from: X.KZh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46038KZh extends AbstractC26311Pm {
    public static final C46038KZh A00 = new Object();

    @Override // X.AbstractC26311Pm
    public final int A03(EnumC26291Pk enumC26291Pk, List list, int i) {
        C14360o3.A0B(list, 0);
        if (i == 0) {
            return A05(list);
        }
        return 0;
    }

    @Override // X.AbstractC26311Pm
    public final int A05(List list) {
        C14360o3.A0B(list, 0);
        Object A0J = AbstractC001800i.A0J(list);
        if (A0J == null || A0J == EnumC26291Pk.A03) {
            return 0;
        }
        return 1;
    }

    @Override // X.AbstractC26311Pm
    public final boolean A06(EnumC26291Pk enumC26291Pk, Integer num, List list, int i) {
        if (enumC26291Pk != EnumC26291Pk.A03 && i == 0) {
            return true;
        }
        return false;
    }
}
