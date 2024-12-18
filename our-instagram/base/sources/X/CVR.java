package X;

import com.meta.foa.session.FoaUserSession;

/* loaded from: classes5.dex */
public final class CVR {
    public final FoaUserSession A00;
    public final CVS A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVR) {
                CVR cvr = (CVR) obj;
                if (!C14360o3.A0K(this.A00, cvr.A00) || !C14360o3.A0K(this.A01, cvr.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public CVR(FoaUserSession foaUserSession, CVS cvs) {
        this.A00 = foaUserSession;
        this.A01 = cvs;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAIPromptSheetArgs(foaUserSession=");
        A1C.append(this.A00);
        A1C.append(", params=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
