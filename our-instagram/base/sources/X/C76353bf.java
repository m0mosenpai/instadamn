package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.3bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76353bf extends C0T6 {
    public final SpannableStringBuilder A00;
    public final C38321qM A01;
    public final C75113Zb A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76353bf) {
                C76353bf c76353bf = (C76353bf) obj;
                if (!C14360o3.A0K(this.A01, c76353bf.A01) || !C14360o3.A0K(this.A02, c76353bf.A02) || this.A04 != c76353bf.A04 || !C14360o3.A0K(this.A03, c76353bf.A03) || !C14360o3.A0K(this.A00, c76353bf.A00) || this.A05 != c76353bf.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        String str = this.A03;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((i2 + hashCode) * 31) + this.A00.hashCode()) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        return hashCode3 + i3;
    }

    public C76353bf(SpannableStringBuilder spannableStringBuilder, C38321qM c38321qM, C75113Zb c75113Zb, String str, boolean z, boolean z2) {
        this.A01 = c38321qM;
        this.A02 = c75113Zb;
        this.A04 = z;
        this.A03 = str;
        this.A00 = spannableStringBuilder;
        this.A05 = z2;
    }
}
