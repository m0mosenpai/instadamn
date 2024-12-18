package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.JRz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43641JRz extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Drawable A05;
    public final Drawable A06;
    public final Drawable A07;
    public final MVC A08;
    public final MVC A09;
    public final C99E A0A;
    public final Integer A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43641JRz) {
                C43641JRz c43641JRz = (C43641JRz) obj;
                if (!C14360o3.A0K(this.A08, c43641JRz.A08) || this.A04 != c43641JRz.A04 || this.A03 != c43641JRz.A03 || !C14360o3.A0K(this.A09, c43641JRz.A09) || !C14360o3.A0K(this.A05, c43641JRz.A05) || !C14360o3.A0K(this.A07, c43641JRz.A07) || !C14360o3.A0K(this.A06, c43641JRz.A06) || this.A00 != c43641JRz.A00 || this.A0D != c43641JRz.A0D || !C14360o3.A0K(this.A0A, c43641JRz.A0A) || this.A02 != c43641JRz.A02 || this.A01 != c43641JRz.A01 || this.A0C != c43641JRz.A0C || this.A0B != c43641JRz.A0B || this.A0E != c43641JRz.A0E) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A0C, (((((AbstractC167007dF.A0D(this.A0D, ((((((((((((((AbstractC167017dG.A0M(this.A08) * 31) + this.A04) * 31) + this.A03) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + this.A00) * 31) + AbstractC166997dE.A0I(this.A0A)) * 31) + this.A02) * 31) + this.A01) * 31);
        Integer num = this.A0B;
        return AbstractC166987dD.A0K(this.A0E, AbstractC167017dG.A0L(num, AbstractC46784Kmf.A00(num), A0D));
    }

    public C43641JRz(Drawable drawable, Drawable drawable2, Drawable drawable3, MVC mvc, MVC mvc2, C99E c99e, Integer num, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        this.A08 = mvc;
        this.A04 = i;
        this.A03 = i2;
        this.A09 = mvc2;
        this.A05 = drawable;
        this.A07 = drawable2;
        this.A06 = drawable3;
        this.A00 = i3;
        this.A0D = z;
        this.A0A = c99e;
        this.A02 = i4;
        this.A01 = i5;
        this.A0C = z2;
        this.A0B = num;
        this.A0E = z3;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("InboxThreadDigestViewModel(digest=");
        A1C.append(this.A08);
        A1C.append(", prefixRes=");
        A1C.append(this.A04);
        A1C.append(", prefixColor=");
        A1C.append(this.A03);
        A1C.append(", timestamp=");
        A1C.append(this.A09);
        A1C.append(", leftDrawable=");
        A1C.append(this.A05);
        A1C.append(", rightDrawable=");
        A1C.append(this.A07);
        A1C.append(", lockDrawable=");
        A1C.append(this.A06);
        A1C.append(", drawablePadding=");
        A1C.append(this.A00);
        A1C.append(", isDrawablesRelativeWithIntrinsicBounds=");
        A1C.append(this.A0D);
        A1C.append(", vaultContext=");
        A1C.append(this.A0A);
        A1C.append(", numUnreadMessages=");
        A1C.append(this.A02);
        A1C.append(", maxUnreadMessageCount=");
        A1C.append(this.A01);
        A1C.append(", digestIsUnreadMessages=");
        A1C.append(this.A0C);
        A1C.append(", threadDigestType=");
        Integer num = this.A0B;
        if (num != null) {
            str = AbstractC46784Kmf.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", isUnwatchedClipsOnly=");
        return AbstractC25236BEt.A0a(A1C, this.A0E);
    }
}
