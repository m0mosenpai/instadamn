package X;

import kotlin.Deprecated;

@Deprecated(message = "Please use GenericXmaContentViewModel#NavigationFields instead.")
/* renamed from: X.BzU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27211BzU extends AbstractC27437C9f {
    public final C1NB A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C27211BzU(C1NB c1nb, String str, String str2, String str3) {
        AbstractC167007dF.A1F(str3, 3, c1nb);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = c1nb;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27211BzU) {
                C27211BzU c27211BzU = (C27211BzU) obj;
                if (!C14360o3.A0K(this.A01, c27211BzU.A01) || !C14360o3.A0K(this.A02, c27211BzU.A02) || !C14360o3.A0K(this.A03, c27211BzU.A03) || !C14360o3.A0K(this.A00, c27211BzU.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0O(this.A01) * 31)));
    }
}
