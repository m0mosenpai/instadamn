package X;

/* renamed from: X.MhW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51076MhW extends AbstractC53418Nk7 {
    public final Throwable A00;

    public C51076MhW(Throwable th) {
        C14360o3.A0B(th, 1);
        this.A00 = th;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51076MhW) && C14360o3.A0K(this.A00, ((C51076MhW) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LoadResult.Error(\n                    |   throwable: ");
        A1C.append(this.A00);
        return AbstractC16490ru.A0q(AbstractC166997dE.A0x("\n                    |) ", A1C), "|");
    }
}
