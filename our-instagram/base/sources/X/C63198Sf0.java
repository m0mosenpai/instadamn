package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;

/* renamed from: X.Sf0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63198Sf0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final DialogInterface.OnClickListener A07;
    public final DialogInterface.OnClickListener A08;
    public final DialogInterface.OnClickListener A09;
    public final Drawable A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    public C63198Sf0(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A0B = null;
        this.A00 = i;
        this.A0A = null;
        this.A0F = true;
        this.A07 = onClickListener;
        this.A0C = null;
        this.A01 = i2;
        this.A08 = null;
        this.A02 = 0;
        this.A09 = onClickListener2;
        this.A03 = i3;
        this.A04 = i4;
        this.A0D = null;
        this.A05 = i5;
        this.A0E = null;
        this.A06 = i6;
    }

    public C63198Sf0(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, Drawable drawable, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A0B = str;
        this.A00 = i;
        this.A0A = drawable;
        this.A0F = z;
        this.A07 = onClickListener;
        this.A0C = str2;
        this.A01 = i2;
        this.A08 = onClickListener2;
        this.A02 = i3;
        this.A09 = onClickListener3;
        this.A03 = i4;
        this.A04 = i5;
        this.A0D = str3;
        this.A05 = i6;
        this.A0E = str4;
        this.A06 = i7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63198Sf0) {
                C63198Sf0 c63198Sf0 = (C63198Sf0) obj;
                if (!C14360o3.A0K(this.A0B, c63198Sf0.A0B) || this.A00 != c63198Sf0.A00 || !C14360o3.A0K(this.A0A, c63198Sf0.A0A) || this.A0F != c63198Sf0.A0F || !C14360o3.A0K(this.A07, c63198Sf0.A07) || !C14360o3.A0K(this.A0C, c63198Sf0.A0C) || this.A01 != c63198Sf0.A01 || !C14360o3.A0K(this.A08, c63198Sf0.A08) || this.A02 != c63198Sf0.A02 || !C14360o3.A0K(this.A09, c63198Sf0.A09) || this.A03 != c63198Sf0.A03 || this.A04 != c63198Sf0.A04 || !C14360o3.A0K(this.A0D, c63198Sf0.A0D) || this.A05 != c63198Sf0.A05 || !C14360o3.A0K(this.A0E, c63198Sf0.A0E) || this.A06 != c63198Sf0.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((AbstractC63311ShH.A02(this.A0B) * 31) + this.A00) * 31) + AbstractC25235BEs.A06(null)) * 31) + AbstractC25235BEs.A06(this.A0A)) * 31) + AbstractC58322PtE.A02(this.A0F ? 1 : 0)) * 31) + AbstractC25235BEs.A06(null)) * 31) + AbstractC25235BEs.A06(null)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31 * 31) + 1) * 31) + AbstractC25235BEs.A06(this.A0C)) * 31) + this.A01) * 31) + AbstractC25235BEs.A06(this.A08)) * 31 * 31) + 1) * 31 * 31) + this.A02) * 31) + AbstractC25235BEs.A06(this.A09)) * 31) + this.A03) * 31) + this.A04) * 31) + AbstractC25235BEs.A06(this.A0D)) * 31) + this.A05) * 31) + AbstractC25235BEs.A06(this.A0E)) * 31) + this.A06;
    }

    public C63198Sf0(SIO sio) {
        this.A0B = sio.A03;
        this.A00 = 0;
        this.A0A = null;
        this.A0F = true;
        this.A07 = null;
        this.A0C = null;
        this.A01 = 0;
        this.A08 = null;
        this.A02 = 0;
        this.A09 = sio.A02;
        this.A03 = 0;
        this.A04 = 1;
        this.A0D = null;
        this.A05 = sio.A01;
        this.A0E = sio.A04;
        this.A06 = 0;
    }
}
