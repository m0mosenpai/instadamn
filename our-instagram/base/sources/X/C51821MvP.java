package X;

import android.view.View;

/* renamed from: X.MvP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51821MvP extends C0T6 implements InterfaceC66482zP {
    public final int A00 = 2131964259;
    public final View.OnClickListener A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51821MvP) {
                C51821MvP c51821MvP = (C51821MvP) obj;
                if (this.A00 != c51821MvP.A00 || !C14360o3.A0K(this.A01, c51821MvP.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, this.A00 * 31);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51821MvP c51821MvP = (C51821MvP) obj;
        C14360o3.A0B(c51821MvP, 0);
        return AbstractC167007dF.A1P(this.A00, c51821MvP.A00);
    }

    public C51821MvP(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewModel(textRes=");
        A1C.append(this.A00);
        A1C.append(", tapListener=");
        A1C.append(this.A01);
        A1C.append(", detailText=");
        return AbstractC25236BEt.A0Y(null, A1C);
    }
}
