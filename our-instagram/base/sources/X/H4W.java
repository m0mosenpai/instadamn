package X;

/* loaded from: classes7.dex */
public final class H4W extends C0T6 implements InterfaceC43511JJx {
    public final C38690H2b A00;
    public final C38070Goz A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4W) {
                H4W h4w = (H4W) obj;
                if (!C14360o3.A0K(this.A00, h4w.A00) || !C14360o3.A0K(this.A01, h4w.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43511JJx
    public final /* bridge */ /* synthetic */ InterfaceC43529JKp AmX() {
        return this.A00;
    }

    @Override // X.InterfaceC43511JJx
    public final /* bridge */ /* synthetic */ JM8 Be5() {
        return this.A01;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H4W(C38690H2b c38690H2b, C38070Goz c38070Goz) {
        this.A00 = c38690H2b;
        this.A01 = c38070Goz;
    }

    @Override // X.InterfaceC43511JJx
    public final InterfaceC43511JJx E9b(C1DY c1dy) {
        return this;
    }
}
