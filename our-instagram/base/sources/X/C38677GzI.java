package X;

import android.view.View;

/* renamed from: X.GzI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38677GzI extends C0T6 {
    public final View.OnClickListener A00;
    public final View.OnClickListener A01;
    public final C5QE A02;
    public final InterfaceC43391JFg A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C38677GzI(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, C5QE c5qe, InterfaceC43391JFg interfaceC43391JFg, Integer num, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(interfaceC43391JFg, 6);
        this.A05 = z;
        this.A02 = c5qe;
        this.A04 = num;
        this.A06 = z2;
        this.A07 = z3;
        this.A03 = interfaceC43391JFg;
        this.A01 = onClickListener;
        this.A00 = onClickListener2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38677GzI) {
                C38677GzI c38677GzI = (C38677GzI) obj;
                if (this.A05 != c38677GzI.A05 || !C14360o3.A0K(this.A02, c38677GzI.A02) || !C14360o3.A0K(this.A04, c38677GzI.A04) || this.A06 != c38677GzI.A06 || this.A07 != c38677GzI.A07 || !C14360o3.A0K(this.A03, c38677GzI.A03) || !C14360o3.A0K(this.A01, c38677GzI.A01) || !C14360o3.A0K(this.A00, c38677GzI.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A03, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, (((AbstractC25225BEi.A08(this.A05) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UiState(isPlaceholder=");
        A1C.append(this.A05);
        A1C.append(", title=");
        A1C.append(this.A02);
        A1C.append(", titleHighlightColor=");
        A1C.append(this.A04);
        A1C.append(", shouldSetLinkMovementMethodForTitle=");
        A1C.append(this.A06);
        A1C.append(", shouldShowVerifiedBadge=");
        A1C.append(this.A07);
        A1C.append(", timestampState=");
        A1C.append(this.A03);
        A1C.append(", textContainerOnClickListener=");
        A1C.append(this.A01);
        A1C.append(", headerContainerOnClickListener=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C38677GzI() {
        this(null, null, null, J0B.A00, null, false, false, false);
    }
}
