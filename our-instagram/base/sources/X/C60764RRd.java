package X;

/* renamed from: X.RRd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60764RRd extends AbstractC116005Nc {
    @Override // X.AbstractC116005Nc, java.util.Iterator
    public final Object next() {
        C116015Nd c116015Nd = this.A05;
        if (c116015Nd != null) {
            this.A04 = c116015Nd;
            A00();
            return getKey();
        }
        throw AbstractC58318PtA.A13();
    }
}
