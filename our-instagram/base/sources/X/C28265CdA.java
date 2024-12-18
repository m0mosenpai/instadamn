package X;

/* renamed from: X.CdA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28265CdA {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28265CdA) {
                C28265CdA c28265CdA = (C28265CdA) obj;
                if (this.A00 != c28265CdA.A00 || this.A01 != c28265CdA.A01 || this.A02 != c28265CdA.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A01, (AbstractC25225BEi.A08(this.A00) + 1231) * 31));
    }

    public C28265CdA(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WriteWithAIUIConfig(forceDarkMode=");
        A1C.append(this.A00);
        A1C.append(", isPillVisible=");
        A1C.append(true);
        A1C.append(", isComposerVisible=");
        A1C.append(this.A01);
        A1C.append(", shouldShowNuxIllustration=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }

    public C28265CdA() {
        this(false, true, false);
    }
}
