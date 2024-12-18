package X;

/* renamed from: X.Vuu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69757Vuu {
    public final C1338462s A00;
    public final XAK A01;
    public final AbstractC66258U6c A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69757Vuu) {
                C69757Vuu c69757Vuu = (C69757Vuu) obj;
                if (!C14360o3.A0K(this.A01, c69757Vuu.A01) || !C14360o3.A0K(this.A02, c69757Vuu.A02) || !C14360o3.A0K(this.A00, c69757Vuu.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BloksTreeManagerModification(target=");
        sb.append(this.A01);
        sb.append(", updateOperation=");
        sb.append(this.A02);
        sb.append(", parseResult=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }

    public C69757Vuu(C1338462s c1338462s, XAK xak, AbstractC66258U6c abstractC66258U6c) {
        AbstractC167017dG.A1P(xak, abstractC66258U6c);
        this.A01 = xak;
        this.A02 = abstractC66258U6c;
        this.A00 = c1338462s;
    }
}
