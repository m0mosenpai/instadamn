package X;

/* renamed from: X.RPy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60755RPy extends B0V {
    @Override // X.B0V, java.util.Iterator
    public final Object next() {
        TTY tty = this.A04;
        if (tty != null) {
            this.A03 = tty;
            A00();
            return this.A03.getValue();
        }
        throw AbstractC58318PtA.A13();
    }
}
