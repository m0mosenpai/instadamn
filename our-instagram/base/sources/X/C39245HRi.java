package X;

/* renamed from: X.HRi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39245HRi extends C17T implements JJV {
    public JM8 A00;

    @Override // X.JJV
    public final JM8 Be5() {
        JM8 jm8 = this.A00;
        if (jm8 == null) {
            return (JM8) A04(1879474642, HRh.class);
        }
        return jm8;
    }

    @Override // X.JJV
    public final JJV E9a(C1DY c1dy) {
        JM8 Be5 = Be5();
        Be5.E9Z(c1dy);
        this.A00 = Be5;
        return this;
    }
}
