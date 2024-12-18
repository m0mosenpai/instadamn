package X;

/* renamed from: X.MhC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51058MhC extends O1E {
    public final Throwable A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51058MhC(Throwable th) {
        super(false);
        C14360o3.A0B(th, 1);
        this.A00 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C51058MhC) {
            C51058MhC c51058MhC = (C51058MhC) obj;
            if (super.A00 == ((O1E) c51058MhC).A00 && C14360o3.A0K(this.A00, c51058MhC.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        if (super.A00) {
            i = 1231;
        }
        return AbstractC166987dD.A0I(this.A00, i);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Error(endOfPaginationReached=");
        A1C.append(super.A00);
        A1C.append(AbstractC43591JPw.A00(101));
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
