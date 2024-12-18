package X;

import java.util.List;

/* renamed from: X.781, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass781 extends AbstractC129515tG implements InterfaceC129545tJ, AnonymousClass782, InterfaceC129555tK {
    public final AnonymousClass541 A00;
    public final Py8 A01;
    public final C7QX A02;
    public final C7QL A03;
    public final CharSequence A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass781(AnonymousClass541 anonymousClass541, Py8 py8, C7QX c7qx, C7QL c7ql, CharSequence charSequence, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(c7qx);
        C14360o3.A0B(charSequence, 2);
        this.A04 = charSequence;
        this.A0D = z;
        this.A0B = z2;
        this.A0G = z3;
        this.A03 = c7ql;
        this.A02 = c7qx;
        this.A00 = anonymousClass541;
        this.A08 = list;
        this.A06 = str;
        this.A0E = z4;
        this.A0A = z5;
        this.A0F = z6;
        this.A09 = z7;
        this.A01 = py8;
        this.A0C = z8;
        this.A07 = str2;
        this.A05 = charSequence.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass781) {
                AnonymousClass781 anonymousClass781 = (AnonymousClass781) obj;
                if (!C14360o3.A0K(this.A04, anonymousClass781.A04) || this.A0D != anonymousClass781.A0D || this.A0B != anonymousClass781.A0B || this.A0G != anonymousClass781.A0G || !C14360o3.A0K(this.A03, anonymousClass781.A03) || !C14360o3.A0K(this.A02, anonymousClass781.A02) || this.A00 != anonymousClass781.A00 || !C14360o3.A0K(this.A08, anonymousClass781.A08) || !C14360o3.A0K(this.A06, anonymousClass781.A06) || this.A0E != anonymousClass781.A0E || this.A0A != anonymousClass781.A0A || this.A0F != anonymousClass781.A0F || this.A09 != anonymousClass781.A09 || !C14360o3.A0K(this.A01, anonymousClass781.A01) || this.A0C != anonymousClass781.A0C || !C14360o3.A0K(this.A07, anonymousClass781.A07)) {
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

    @Override // X.AnonymousClass782
    public final String Arl() {
        return this.A05;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVa() {
        return this.A03.A00;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVb() {
        return this.A03.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (38347 + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A0D) {
            i = 1231;
        }
        int i2 = (hashCode4 + i) * 31;
        int i3 = 1237;
        if (this.A0B) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0G) {
            i5 = 1231;
        }
        int hashCode5 = (((((((i4 + i5) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31;
        List list = this.A08;
        int i6 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i7 = (hashCode5 + hashCode) * 31;
        String str = this.A06;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        int i9 = 1237;
        if (this.A0E) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0A) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0F) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A09) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        Py8 py8 = this.A01;
        if (py8 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = py8.hashCode();
        }
        int i17 = (i16 + hashCode3) * 31;
        int i18 = 1237;
        if (this.A0C) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        String str2 = this.A07;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i19 + i6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnonymousClass781(AnonymousClass541 anonymousClass541, C7QX c7qx, C7QL c7ql, CharSequence charSequence, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this(anonymousClass541, null, c7qx, c7ql, charSequence, str, null, null, z, z2, false, z3, z4, false, false, false);
        C14360o3.A0B(charSequence, 2);
    }
}
