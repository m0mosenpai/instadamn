package X;

import android.graphics.Rect;

/* renamed from: X.XQe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72149XQe extends AbstractC72460Xe6 {
    public final Rect A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72149XQe) {
                C72149XQe c72149XQe = (C72149XQe) obj;
                if (!C14360o3.A0K(this.A01, c72149XQe.A01) || !C14360o3.A0K(this.A00, c72149XQe.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public C72149XQe(Rect rect, String str) {
        this.A01 = str;
        this.A00 = rect;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AiOutputRect(type=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(1444));
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
