package X;

/* renamed from: X.Vuc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69742Vuc {
    public final long A00;
    public final C69379VmP A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69742Vuc) {
                C69742Vuc c69742Vuc = (C69742Vuc) obj;
                if (this.A00 != c69742Vuc.A00 || !C14360o3.A0K(this.A01, c69742Vuc.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC25228BEl.A03(this.A00) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECPInitDataValue(timestamp=");
        sb.append(this.A00);
        sb.append(", ecpInitData=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }

    public C69742Vuc(C69379VmP c69379VmP, long j) {
        this.A00 = j;
        this.A01 = c69379VmP;
    }
}
