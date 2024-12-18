package X;

/* renamed from: X.RPw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60753RPw extends B0V {
    @Override // X.B0V, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        TTY tty = this.A04;
        if (tty != null) {
            this.A03 = tty;
            A00();
            return this.A03;
        }
        throw AbstractC58318PtA.A13();
    }
}
