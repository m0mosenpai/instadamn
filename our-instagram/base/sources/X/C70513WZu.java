package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.WZu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70513WZu implements InterfaceC72024XFm {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70513WZu) {
                C70513WZu c70513WZu = (C70513WZu) obj;
                if (!C14360o3.A0K(this.A00, c70513WZu.A00) || !C14360o3.A0K(this.A01, c70513WZu.A01) || this.A02 != c70513WZu.A02 || this.A03 != c70513WZu.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72024XFm
    public final void EPs(View view) {
        throw new C141786av(MSV.A00(144));
    }

    public final int hashCode() {
        int i = 0;
        int A0O = AbstractC167017dG.A0O(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        int A0D = AbstractC167007dF.A0D(this.A02, (A0O + i) * 31);
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        return A0D + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UrlImageResource(imageUrl=");
        sb.append(this.A00);
        sb.append(", imageUrlDark=");
        sb.append(this.A01);
        sb.append(", isCircular=");
        sb.append(this.A02);
        sb.append(", skipCancelRequestOnViewDetach=");
        return AbstractC25236BEt.A0a(sb, this.A03);
    }

    public C70513WZu(String str, String str2, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // X.InterfaceC72024XFm
    public final void ChW(ImageView imageView) {
        String str;
        String A1A;
        String A1A2;
        WFY.A02();
        if (((AbstractC72723Nt.A00(AbstractC166997dE.A0L(imageView)) && (str = this.A01) != null && (A1A2 = AbstractC25228BEl.A1A(str)) != null && A1A2.length() != 0) || (str = this.A00) != null) && (A1A = AbstractC25228BEl.A1A(str)) != null && A1A.length() != 0) {
            C60615REa A00 = C2FP.A0G().A00(str, AbstractC58317Pt9.A00(541));
            A00.A06 = this.A02;
            A00.A07 = this.A03;
            A00.A02(imageView);
        }
    }
}
