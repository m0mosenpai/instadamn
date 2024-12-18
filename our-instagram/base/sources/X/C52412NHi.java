package X;

/* renamed from: X.NHi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52412NHi extends AbstractC187488Sq implements InterfaceC187498Sr {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52412NHi) && this.A00 == ((C52412NHi) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    @Override // X.AbstractC187488Sq
    public final int getSegmentIndex() {
        return this.A00;
    }

    public final String toString() {
        return AbstractC25235BEs.A0q("VideoDeleteDialog(segmentIndex=", this.A00);
    }

    public C52412NHi(int i) {
        this.A00 = i;
    }
}
