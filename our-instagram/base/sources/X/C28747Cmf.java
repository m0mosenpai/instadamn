package X;

import java.util.ArrayList;

/* renamed from: X.Cmf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28747Cmf implements InterfaceC30904DiH {
    public C28747Cmf() {
        if (Float.compare(82.0f, 0.0f) > 0) {
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Provided size ");
        A1C.append((Object) C119145aW.A00(82.0f));
        throw AbstractC166987dD.A12(AbstractC166997dE.A0x(" should be larger than zero.", A1C));
    }

    @Override // X.InterfaceC30904DiH
    public final ArrayList AF4(InterfaceC1128957x interfaceC1128957x, int i, int i2) {
        int EL8 = interfaceC1128957x.EL8(82.0f);
        int i3 = EL8 + i2;
        int i4 = i2 + i;
        if (i3 < i4) {
            int i5 = i4 / i3;
            ArrayList A17 = AbstractC25225BEi.A17(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                AbstractC166997dE.A1W(A17, EL8);
            }
            return A17;
        }
        ArrayList A172 = AbstractC25225BEi.A17(1);
        AbstractC166997dE.A1W(A172, i);
        return A172;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C28747Cmf) && C119145aW.A01(82.0f, 82.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(82.0f);
    }
}
