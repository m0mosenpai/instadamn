package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.8aP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189458aP extends C0T6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public View.OnClickListener A05;
    public CharSequence A06;
    public CharSequence A07;
    public Integer A08;
    public boolean A09;
    public boolean A0A;

    public C189458aP(View.OnClickListener onClickListener, CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        C14360o3.A0B(charSequence2, 8);
        this.A0A = true;
        this.A09 = false;
        this.A02 = i;
        this.A01 = 0;
        this.A04 = null;
        this.A06 = charSequence;
        this.A07 = charSequence2;
        this.A05 = onClickListener;
        this.A00 = i2;
        this.A08 = null;
        this.A03 = 0;
    }

    public final void A01(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        this.A07 = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C189458aP) {
                C189458aP c189458aP = (C189458aP) obj;
                if (this.A0A != c189458aP.A0A || this.A09 != c189458aP.A09 || this.A02 != c189458aP.A02 || this.A01 != c189458aP.A01 || !C14360o3.A0K(this.A04, c189458aP.A04) || !C14360o3.A0K(this.A06, c189458aP.A06) || !C14360o3.A0K(this.A07, c189458aP.A07) || !C14360o3.A0K(this.A05, c189458aP.A05) || this.A00 != c189458aP.A00 || !C14360o3.A0K(this.A08, c189458aP.A08) || this.A03 != c189458aP.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final C189468aQ A00() {
        CharSequence charSequence;
        boolean z = this.A0A;
        boolean z2 = this.A09;
        int i = this.A02;
        int i2 = this.A01;
        Drawable drawable = this.A04;
        CharSequence charSequence2 = this.A06;
        if (this.A07.length() == 0) {
            charSequence = this.A06;
            if (charSequence == null) {
                charSequence = "";
            }
        } else {
            charSequence = this.A07;
        }
        View.OnClickListener onClickListener = null;
        if (this.A0A) {
            onClickListener = this.A05;
        }
        return new C189468aQ(drawable, onClickListener, charSequence2, charSequence, this.A08, Integer.valueOf(this.A03), i, i2, this.A00, z, z2);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (((((i2 + i3) * 31) + this.A02) * 31) + this.A01) * 31 * 31;
        Drawable drawable = this.A04;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int i5 = (i4 + hashCode) * 31;
        CharSequence charSequence = this.A06;
        if (charSequence == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = charSequence.hashCode();
        }
        int hashCode5 = (((i5 + hashCode2) * 31) + this.A07.hashCode()) * 31;
        View.OnClickListener onClickListener = this.A05;
        if (onClickListener == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = onClickListener.hashCode();
        }
        int i6 = (((hashCode5 + hashCode3) * 31) + this.A00) * 31;
        Integer num = this.A08;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        return ((i6 + hashCode4) * 31 * 31 * 31) + this.A03;
    }

    public C189458aP() {
        this(null, null, "", 0, 0);
    }
}
