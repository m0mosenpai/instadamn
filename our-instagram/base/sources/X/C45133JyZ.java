package X;

import java.util.Map;

/* renamed from: X.JyZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45133JyZ extends C0T6 implements MPW {
    public final long A00;
    public final EnumC46307Ked A01;
    public final Map A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45133JyZ) {
                C45133JyZ c45133JyZ = (C45133JyZ) obj;
                if (this.A01 != c45133JyZ.A01 || this.A00 != c45133JyZ.A00 || !C14360o3.A0K(this.A02, c45133JyZ.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.MPW
    public final /* bridge */ /* synthetic */ InterfaceC50385MMn CBN() {
        return this.A01;
    }

    @Override // X.MPW
    public final Map getMetadata() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC25236BEt.A01(this.A00, AbstractC166987dD.A0G(this.A01)));
    }

    public C45133JyZ(EnumC46307Ked enumC46307Ked, Map map, long j) {
        AbstractC167017dG.A1Q(enumC46307Ked, map);
        this.A01 = enumC46307Ked;
        this.A00 = j;
        this.A02 = map;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EngagementEvent(type=");
        A1C.append(this.A01);
        A1C.append(", timestamp=");
        A1C.append(this.A00);
        A1C.append(", metadata=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
