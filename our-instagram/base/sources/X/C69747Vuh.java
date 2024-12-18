package X;

/* renamed from: X.Vuh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69747Vuh {
    public final C6DY A00;
    public final C69757Vuu A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69747Vuh) {
                C69747Vuh c69747Vuh = (C69747Vuh) obj;
                if (!C14360o3.A0K(this.A01, c69747Vuh.A01) || !C14360o3.A0K(this.A00, c69747Vuh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BloksTreeUpdateOperation(treeModification=");
        sb.append(this.A01);
        sb.append(", variableUpdate=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }

    public C69747Vuh(C6DY c6dy, C69757Vuu c69757Vuu) {
        this.A01 = c69757Vuu;
        this.A00 = c6dy;
    }
}
