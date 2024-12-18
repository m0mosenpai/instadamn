package X;

/* renamed from: X.NHh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52411NHh extends AbstractC187488Sq implements InterfaceC187498Sr {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52411NHh) && this.A00 == ((C52411NHh) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    @Override // X.AbstractC187488Sq
    public final int getSegmentIndex() {
        return this.A00;
    }

    public final String toString() {
        return AbstractC25235BEs.A0q("ThirdPartyMediaReplace(segmentIndex=", this.A00);
    }

    public C52411NHh(int i) {
        this.A00 = i;
    }
}
