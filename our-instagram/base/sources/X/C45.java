package X;

/* loaded from: classes5.dex */
public final class C45 extends AbstractC27456C9y {
    public final float A00;
    public final InterfaceC30841DhG A01;
    public final AbstractC27454C9w A02;
    public final AbstractC27455C9x A03;
    public final CWM A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45) {
                C45 c45 = (C45) obj;
                if (!C14360o3.A0K(this.A04, c45.A04) || !C14360o3.A0K(this.A05, c45.A05) || this.A08 != c45.A08 || this.A07 != c45.A07 || !C14360o3.A0K(this.A02, c45.A02) || !C14360o3.A0K(this.A01, c45.A01) || !C14360o3.A0K(this.A03, c45.A03) || this.A06 != c45.A06 || Float.compare(this.A00, c45.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC167007dF.A0D(this.A06, (AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A08, ((AbstractC167017dG.A0M(this.A04) * 31) + AbstractC167017dG.A0O(this.A05)) * 31)))) + AbstractC166997dE.A0I(this.A03)) * 31), this.A00);
    }

    public C45(InterfaceC30841DhG interfaceC30841DhG, AbstractC27454C9w abstractC27454C9w, AbstractC27455C9x abstractC27455C9x, CWM cwm, String str, float f, boolean z, boolean z2, boolean z3) {
        this.A04 = cwm;
        this.A05 = str;
        this.A08 = z;
        this.A07 = z2;
        this.A02 = abstractC27454C9w;
        this.A01 = interfaceC30841DhG;
        this.A03 = abstractC27455C9x;
        this.A06 = z3;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EditScreen(currentMedia=");
        A1C.append(this.A04);
        A1C.append(", currentEditSuggestion=");
        A1C.append(this.A05);
        A1C.append(", isUndoAvailable=");
        A1C.append(this.A08);
        A1C.append(", isRedoAvailable=");
        A1C.append(this.A07);
        A1C.append(", navigationState=");
        A1C.append(this.A02);
        A1C.append(", screenState=");
        A1C.append(this.A01);
        A1C.append(", lastAction=");
        A1C.append(this.A03);
        A1C.append(", actionButtonEnabled=");
        A1C.append(this.A06);
        A1C.append(", trueAspectRatio=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }

    public C45() {
        this(C29492Cz6.A00, C3T.A00, null, null, null, 1.0f, false, false, true);
    }
}
