package X;

/* renamed from: X.OLj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54825OLj {
    public EnumC53187Nfj A00;
    public boolean A01;
    public final String A02;

    public C54825OLj(String str) {
        EnumC53187Nfj enumC53187Nfj = EnumC53187Nfj.A0B;
        this.A02 = str;
        this.A00 = enumC53187Nfj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A02.equals(((C54825OLj) obj).A02);
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public final String toString() {
        return AbstractC13670mt.A06("Participant(id=%s, state=%s)", this.A02, this.A00.name());
    }
}
