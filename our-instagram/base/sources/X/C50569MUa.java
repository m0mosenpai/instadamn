package X;

import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.MUa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50569MUa extends C0T6 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    public C50569MUa(C7QL c7ql, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, int i, boolean z, boolean z2) {
        this.A05 = z;
        this.A02 = privacyMediaOverlayViewModel;
        this.A04 = z2;
        this.A01 = i;
        this.A03 = c7ql;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C50569MUa) {
                    C50569MUa c50569MUa = (C50569MUa) obj;
                    if (c50569MUa.A00 != 1 || this.A05 != c50569MUa.A05 || !C14360o3.A0K(this.A02, c50569MUa.A02) || this.A04 != c50569MUa.A04 || this.A01 != c50569MUa.A01 || !C14360o3.A0K(this.A03, c50569MUa.A03)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C50569MUa)) {
                return false;
            }
            C50569MUa c50569MUa2 = (C50569MUa) obj;
            if (c50569MUa2.A00 != 0 || !C14360o3.A0K(this.A02, c50569MUa2.A02) || !C14360o3.A0K(this.A03, c50569MUa2.A03) || this.A05 != c50569MUa2.A05 || this.A04 != c50569MUa2.A04 || this.A01 != c50569MUa2.A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int i;
        if (this.A00 != 0) {
            A0D = (AbstractC167007dF.A0D(this.A04, (AbstractC25225BEi.A08(this.A05) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A01) * 31;
            i = this.A03.hashCode();
        } else {
            A0D = AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC167017dG.A0M(this.A02) * 31)));
            i = this.A01;
        }
        return A0D + i;
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ThreadsXpostUiState(linkedBarcelonaProfile=");
        A1C.append(this.A02);
        A1C.append(", stateHolder=");
        A1C.append(this.A03);
        A1C.append(", isUnlinkedUser=");
        A1C.append(this.A05);
        A1C.append(", isRowAvailable=");
        A1C.append(this.A04);
        A1C.append(", _counterToTriggerObserver=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }

    public C50569MUa(OJY ojy, InterfaceC173987oq interfaceC173987oq, int i, boolean z, boolean z2) {
        this.A02 = interfaceC173987oq;
        this.A03 = ojy;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = i;
    }
}
