package X;

import java.util.Map;

/* renamed from: X.Jyb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45135Jyb extends C0T6 implements MPW {
    public final EnumC46306Kec A00;
    public final Map A01;
    public final long A02;

    public C45135Jyb(EnumC46306Kec enumC46306Kec, Map map, long j) {
        C14360o3.A0B(enumC46306Kec, 1);
        this.A00 = enumC46306Kec;
        this.A02 = j;
        this.A01 = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45135Jyb) {
                C45135Jyb c45135Jyb = (C45135Jyb) obj;
                if (this.A00 != c45135Jyb.A00 || this.A02 != c45135Jyb.A02 || !C14360o3.A0K(this.A01, c45135Jyb.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.MPW
    public final /* bridge */ /* synthetic */ InterfaceC50385MMn CBN() {
        return this.A00;
    }

    @Override // X.MPW
    public final Map getMetadata() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC25236BEt.A01(this.A02, AbstractC166987dD.A0G(this.A00)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ModelEngagementEvent(type=");
        A1C.append(this.A00);
        A1C.append(", timestamp=");
        A1C.append(this.A02);
        A1C.append(", metadata=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
