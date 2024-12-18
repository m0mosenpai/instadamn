package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BL3 extends C0T6 implements InterfaceC30872Dhl {
    public final CharSequence A00;
    public final List A01;
    public final boolean A02;
    public final String A03;
    public final boolean A04;

    public BL3(CharSequence charSequence, String str, List list, boolean z, boolean z2) {
        C14360o3.A0B(list, 5);
        this.A03 = str;
        this.A00 = charSequence;
        this.A02 = z;
        this.A04 = z2;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BL3) {
                BL3 bl3 = (BL3) obj;
                if (!C14360o3.A0K(this.A03, bl3.A03) || !C14360o3.A0K(this.A00, bl3.A00) || this.A02 != bl3.A02 || this.A04 != bl3.A04 || !C14360o3.A0K(this.A01, bl3.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A02, (AbstractC166987dD.A0J(this.A03) + AbstractC167017dG.A0M(this.A00)) * 31)));
    }
}
