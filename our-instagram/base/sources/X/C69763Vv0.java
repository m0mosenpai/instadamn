package X;

import java.util.List;

/* renamed from: X.Vv0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69763Vv0 {
    public final C67524UnO A00;
    public final C69740Vua A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69763Vv0) {
                C69763Vv0 c69763Vv0 = (C69763Vv0) obj;
                if (!C14360o3.A0K(this.A03, c69763Vv0.A03) || !C14360o3.A0K(this.A00, c69763Vv0.A00) || !C14360o3.A0K(this.A02, c69763Vv0.A02) || !C14360o3.A0K(this.A01, c69763Vv0.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (AbstractC166997dE.A0J(this.A00, this.A03.hashCode() * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
        C69740Vua c69740Vua = this.A01;
        if (c69740Vua != null) {
            i = c69740Vua.hashCode();
        }
        return A0J + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FBPayEmailsComponent(emails=");
        sb.append(this.A03);
        sb.append(", emailFormFieldConfig=");
        sb.append(this.A00);
        sb.append(", addedEmailId=");
        sb.append(this.A02);
        sb.append(", updatedEmailIdParams=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }

    public C69763Vv0(C67524UnO c67524UnO, C69740Vua c69740Vua, String str, List list) {
        this.A03 = list;
        this.A00 = c67524UnO;
        this.A02 = str;
        this.A01 = c69740Vua;
    }
}
