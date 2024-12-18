package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;

/* renamed from: X.GgA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37554GgA {
    public final InterfaceC31077DlK A00;
    public final C37546Gg2 A01;

    public static final int A00(C37554GgA c37554GgA, Integer num, int i) {
        IntentAwareAdsInfoIntf A00;
        for (int i2 = i - 1; -1 < i2; i2--) {
            C120985dq A0F = c37554GgA.A01.A0A.A0F(i2);
            if (A0F.A0G() && (A00 = A0F.A00()) != null) {
                Integer BVJ = A00.BVJ();
                int A002 = C5MB.A00(num);
                if (BVJ != null && BVJ.intValue() == A002) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public C37554GgA(InterfaceC31077DlK interfaceC31077DlK, C37546Gg2 c37546Gg2) {
        this.A01 = c37546Gg2;
        this.A00 = interfaceC31077DlK;
    }
}
