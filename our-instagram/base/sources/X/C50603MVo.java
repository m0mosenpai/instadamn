package X;

import java.util.List;

/* renamed from: X.MVo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50603MVo extends C0T6 {
    public final int A00;
    public final EnumC50656MXw A01;
    public final List A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C50603MVo) {
                C50603MVo c50603MVo = (C50603MVo) obj;
                if (this.A00 != c50603MVo.A00 || !C14360o3.A0K(this.A02, c50603MVo.A02) || !C14360o3.A0K(this.A03, c50603MVo.A03) || this.A01 != c50603MVo.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A03, ((this.A00 * 31) + AbstractC167017dG.A0M(this.A02)) * 31));
    }

    public C50603MVo(EnumC50656MXw enumC50656MXw, List list, List list2, int i) {
        AbstractC37302Gc3.A1U(list2, enumC50656MXw);
        this.A00 = i;
        this.A02 = list;
        this.A03 = list2;
        this.A01 = enumC50656MXw;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediaDraftInDatabase(version=");
        A1C.append(this.A00);
        A1C.append(", stickers=");
        A1C.append(this.A02);
        A1C.append(", unschematizedCompositions=");
        A1C.append(this.A03);
        A1C.append(", mediaType=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
