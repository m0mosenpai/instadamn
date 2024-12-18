package X;

/* renamed from: X.JxG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45086JxG extends C0T6 {
    public final C45126Jxv A00;
    public final EnumC46151Kbp A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45086JxG) {
                C45086JxG c45086JxG = (C45086JxG) obj;
                if (this.A03 != c45086JxG.A03 || this.A04 != c45086JxG.A04 || this.A05 != c45086JxG.A05 || !C14360o3.A0K(this.A02, c45086JxG.A02) || this.A06 != c45086JxG.A06 || !C14360o3.A0K(this.A00, c45086JxG.A00) || this.A01 != c45086JxG.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A03))) + AbstractC167017dG.A0M(this.A02)) * 31)));
    }

    public C45086JxG(C45126Jxv c45126Jxv, EnumC46151Kbp enumC46151Kbp, Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167017dG.A1U(c45126Jxv, enumC46151Kbp);
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A02 = num;
        this.A06 = z4;
        this.A00 = c45126Jxv;
        this.A01 = enumC46151Kbp;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewStateExtras(gdriveBackedUp=");
        A1C.append(this.A03);
        A1C.append(", isPinAvailable=");
        A1C.append(this.A04);
        A1C.append(", shouldOverrideCutoverTimestamp=");
        A1C.append(this.A05);
        A1C.append(", currentOverrideCutoverTimestamp=");
        A1C.append(this.A02);
        A1C.append(", shouldShowPrimaryDeviceInternal=");
        A1C.append(this.A06);
        A1C.append(", encryptedBackupsPrimaryDevice=");
        A1C.append(this.A00);
        A1C.append(", autoBackupState=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
