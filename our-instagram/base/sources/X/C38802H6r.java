package X;

import com.instagram.api.schemas.ThreadHeaderContextType;

/* renamed from: X.H6r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38802H6r extends C0T6 implements JJ1 {
    public final JJ3 A00;
    public final ThreadHeaderContextType A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38802H6r) {
                C38802H6r c38802H6r = (C38802H6r) obj;
                if (!C14360o3.A0K(this.A00, c38802H6r.A00) || this.A01 != c38802H6r.A01 || !C14360o3.A0K(this.A02, c38802H6r.A02) || !C14360o3.A0K(this.A03, c38802H6r.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC167017dG.A0M(this.A00) * 31)) + AbstractC25227BEk.A07(this.A03);
    }

    public C38802H6r(JJ3 jj3, ThreadHeaderContextType threadHeaderContextType, String str, String str2) {
        AbstractC167017dG.A1R(threadHeaderContextType, str);
        this.A00 = jj3;
        this.A01 = threadHeaderContextType;
        this.A02 = str;
        this.A03 = str2;
    }
}
