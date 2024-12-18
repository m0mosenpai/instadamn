package X;

import java.io.File;

/* renamed from: X.Mo1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51455Mo1 extends AbstractC53421NkA {
    public final File A00;
    public final String A01;

    public C51455Mo1(String str, File file) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = file;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51455Mo1) {
                C51455Mo1 c51455Mo1 = (C51455Mo1) obj;
                if (!C14360o3.A0K(this.A01, c51455Mo1.A01) || !C14360o3.A0K(this.A00, c51455Mo1.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TemplateExistEvent(message=");
        A1C.append(this.A01);
        A1C.append(", file=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
