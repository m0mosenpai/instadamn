package X;

import java.util.List;

/* renamed from: X.Muv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51791Muv extends C0T6 implements InterfaceC58236Prg {
    public final Long A00;
    public final List A01;
    public final List A02;

    public C51791Muv(Long l, List list, List list2) {
        C14360o3.A0B(list2, 3);
        this.A01 = list;
        this.A00 = l;
        this.A02 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51791Muv) {
                C51791Muv c51791Muv = (C51791Muv) obj;
                if (!C14360o3.A0K(this.A01, c51791Muv.A01) || !C14360o3.A0K(this.A00, c51791Muv.A00) || !C14360o3.A0K(this.A02, c51791Muv.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, ((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00)) * 31);
    }
}
