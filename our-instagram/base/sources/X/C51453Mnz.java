package X;

import java.io.File;

/* renamed from: X.Mnz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51453Mnz extends AbstractC53421NkA {
    public final File A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51453Mnz) && C14360o3.A0K(this.A00, ((C51453Mnz) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C51453Mnz(File file) {
        this.A00 = file;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CDLSuccessEvent(file=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
