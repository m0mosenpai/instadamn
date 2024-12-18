package X;

import kotlin.Deprecated;

@Deprecated(message = "Please use GenericXmaContentViewModel#NavigationFields instead.")
/* renamed from: X.BzT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27210BzT extends AbstractC27437C9f {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27210BzT) {
                C27210BzT c27210BzT = (C27210BzT) obj;
                if (!C14360o3.A0K(this.A01, c27210BzT.A01) || this.A00 != c27210BzT.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + this.A00;
    }

    public C27210BzT(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
