package X;

import java.util.List;

/* renamed from: X.Bza, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27215Bza extends AbstractC27439C9h {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27215Bza) {
                C27215Bza c27215Bza = (C27215Bza) obj;
                if (!C14360o3.A0K(this.A01, c27215Bza.A01) || !C14360o3.A0K(this.A00, c27215Bza.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C27215Bza(List list, List list2) {
        AbstractC167017dG.A1P(list, list2);
        this.A01 = list;
        this.A00 = list2;
    }
}
