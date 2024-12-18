package X;

import com.facebook.R;

/* renamed from: X.BfO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26035BfO extends C0T6 {
    public final int A00;
    public final InterfaceC30795DgW A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C26035BfO(InterfaceC30795DgW interfaceC30795DgW, String str, String str2, int i, boolean z) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = interfaceC30795DgW;
        this.A03 = str2;
        this.A04 = z;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26035BfO) {
                C26035BfO c26035BfO = (C26035BfO) obj;
                if (!C14360o3.A0K(this.A02, c26035BfO.A02) || !C14360o3.A0K(this.A01, c26035BfO.A01) || !C14360o3.A0K(this.A03, c26035BfO.A03) || this.A04 != c26035BfO.A04 || this.A00 != c26035BfO.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A04, (AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0O(this.A03)) * 31) + this.A00;
    }

    public C26035BfO() {
        this(C29086CsD.A00, "", null, R.drawable.instagram_arrow_cw_pano_outline_24, true);
    }
}
