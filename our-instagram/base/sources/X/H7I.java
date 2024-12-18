package X;

import com.facebook.R;

/* loaded from: classes7.dex */
public final class H7I extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;

    public H7I(Integer num, Integer num2, String str, int i) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A00 = i;
        this.A01 = num;
        this.A02 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7I) {
                H7I h7i = (H7I) obj;
                if (!C14360o3.A0K(this.A03, h7i.A03) || this.A00 != h7i.A00 || !C14360o3.A0K(this.A01, h7i.A01) || !C14360o3.A0K(this.A02, h7i.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        return ((((AbstractC166987dD.A0J(this.A03) + this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        H7I h7i = (H7I) obj;
        C14360o3.A0B(h7i, 0);
        if (this.A00 == h7i.A00 && C14360o3.A0K(this.A01, h7i.A01)) {
            return true;
        }
        return false;
    }

    public H7I() {
        this(null, null, AbstractC166997dE.A0n(), R.dimen.abc_button_padding_horizontal_material);
    }
}
