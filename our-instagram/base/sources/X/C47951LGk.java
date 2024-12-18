package X;

import java.util.List;

/* renamed from: X.LGk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47951LGk {
    public final MPQ A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47951LGk) {
                C47951LGk c47951LGk = (C47951LGk) obj;
                if (!C14360o3.A0K(this.A01, c47951LGk.A01) || !C14360o3.A0K(this.A00, c47951LGk.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C47951LGk(MPQ mpq) {
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 1);
        this.A01 = c16930sl;
        this.A00 = mpq;
    }

    public final int hashCode() {
        return (AbstractC166987dD.A0G(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RecommendationResult(notFilteredRecommendation=");
        A1C.append(this.A01);
        A1C.append(", error=");
        A1C.append((Object) null);
        A1C.append(", triggerRule=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C47951LGk(List list) {
        this.A01 = list;
        this.A00 = null;
    }
}
