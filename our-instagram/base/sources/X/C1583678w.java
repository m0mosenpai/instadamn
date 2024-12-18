package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.78w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1583678w extends C0T6 {
    public final Drawable A00;
    public final Drawable A01;
    public final CharSequence A02;
    public final CharSequence A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final List A0A;

    public C1583678w(Drawable drawable, Drawable drawable2, CharSequence charSequence, CharSequence charSequence2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, List list) {
        C14360o3.A0B(charSequence, 2);
        this.A0A = list;
        this.A03 = charSequence;
        this.A02 = charSequence2;
        this.A00 = drawable;
        this.A01 = drawable2;
        this.A06 = num;
        this.A07 = num2;
        this.A08 = num3;
        this.A05 = num4;
        this.A04 = num5;
        this.A09 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1583678w) {
                C1583678w c1583678w = (C1583678w) obj;
                if (!C14360o3.A0K(this.A0A, c1583678w.A0A) || !C14360o3.A0K(this.A03, c1583678w.A03) || !C14360o3.A0K(this.A02, c1583678w.A02) || !C14360o3.A0K(this.A00, c1583678w.A00) || !C14360o3.A0K(this.A01, c1583678w.A01) || !C14360o3.A0K(this.A06, c1583678w.A06) || !C14360o3.A0K(this.A07, c1583678w.A07) || !C14360o3.A0K(this.A08, c1583678w.A08) || !C14360o3.A0K(this.A05, c1583678w.A05) || !C14360o3.A0K(this.A04, c1583678w.A04) || !C14360o3.A0K(this.A09, c1583678w.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A0A.hashCode() * 31) + this.A03.hashCode()) * 31;
        CharSequence charSequence = this.A02;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Drawable drawable = this.A00;
        int hashCode3 = (hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.A01;
        int hashCode4 = (hashCode3 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Integer num = this.A06;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A07;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A08;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A05;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.A04;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31 * 31 * 31 * 31;
        String str = this.A09;
        return hashCode9 + (str != null ? str.hashCode() : 0);
    }
}
