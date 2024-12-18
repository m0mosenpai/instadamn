package X;

import android.view.View;

/* loaded from: classes7.dex */
public final class H7F extends C0T6 implements InterfaceC66482zP {
    public final View.OnClickListener A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7F) {
                H7F h7f = (H7F) obj;
                if (!C14360o3.A0K(this.A05, h7f.A05) || !C14360o3.A0K(this.A06, h7f.A06) || !C14360o3.A0K(this.A04, h7f.A04) || !C14360o3.A0K(this.A03, h7f.A03) || !C14360o3.A0K(this.A00, h7f.A00) || !C14360o3.A0K(this.A01, h7f.A01) || !C14360o3.A0K(this.A02, h7f.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final int hashCode() {
        return ((((((((((AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A05)) * 31 * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
    }

    public H7F(View.OnClickListener onClickListener, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A00 = onClickListener;
        this.A01 = num;
        this.A02 = num2;
    }
}
