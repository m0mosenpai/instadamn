package X;

/* loaded from: classes5.dex */
public final class CWA {
    public final C28274CdJ A00;
    public final InterfaceC31003Dk2 A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final InterfaceC30848DhN A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWA) {
                CWA cwa = (CWA) obj;
                if (!C14360o3.A0K(this.A01, cwa.A01) || !C14360o3.A0K(this.A05, cwa.A05) || !C14360o3.A0K(this.A00, cwa.A00) || !C14360o3.A0K(this.A02, cwa.A02) || this.A04 != cwa.A04 || this.A03 != cwa.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC167007dF.A0D(this.A04, (AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0G(this.A01)))) + AbstractC53644Nnp.A00()) * 31));
    }

    public CWA(C28274CdJ c28274CdJ, InterfaceC31003Dk2 interfaceC31003Dk2, InterfaceC30848DhN interfaceC30848DhN, String str, boolean z, boolean z2) {
        this.A01 = interfaceC31003Dk2;
        this.A05 = interfaceC30848DhN;
        this.A00 = c28274CdJ;
        this.A02 = str;
        this.A04 = z;
        this.A03 = z2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAiConfiguration(iconResolver=");
        A1C.append(this.A01);
        A1C.append(", appTheme=");
        A1C.append(this.A05);
        A1C.append(", metaAiLinks=");
        A1C.append(this.A00);
        A1C.append(", appName=");
        A1C.append(this.A02);
        AbstractC25235BEs.A1M(A1C, ", shouldShowCloseButton=");
        A1C.append(", shouldShowFeedbackInPopover=");
        A1C.append(this.A04);
        A1C.append(", shouldLockBottomSheetHeight=");
        return AbstractC25236BEt.A0a(A1C, this.A03);
    }
}
