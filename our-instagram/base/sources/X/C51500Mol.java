package X;

import java.io.File;

/* renamed from: X.Mol, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51500Mol extends AbstractC53426NkF {
    public final File A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51500Mol) && C14360o3.A0K(this.A00, ((C51500Mol) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C51500Mol(File file) {
        this.A00 = file;
    }
}
