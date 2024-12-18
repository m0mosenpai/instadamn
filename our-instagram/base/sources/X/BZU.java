package X;

/* loaded from: classes5.dex */
public final class BZU extends C92 {
    public final long A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BZU)) {
            return false;
        }
        return AbstractC167007dF.A1N((this.A00 > ((BZU) obj).A00 ? 1 : (this.A00 == ((BZU) obj).A00 ? 0 : -1)));
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }

    public BZU(long j) {
        this.A00 = j;
        if (AbstractC119395aw.A02(j)) {
        } else {
            throw AbstractC166987dD.A14("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Open(offset=");
        return AbstractC167017dG.A0o(C119365at.A08(this.A00), A1C);
    }
}
