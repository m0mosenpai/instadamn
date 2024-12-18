package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.52i, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52i extends C0T6 implements InterfaceC1118152j {
    public final InterfaceC1118052h A00;
    public final InterfaceC1118052h A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Float A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public C52i(InterfaceC1118052h interfaceC1118052h, InterfaceC1118052h interfaceC1118052h2, Boolean bool, Boolean bool2, Float f, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 7);
        C14360o3.A0B(str6, 14);
        this.A07 = str;
        this.A05 = num;
        this.A06 = num2;
        this.A0E = z;
        this.A02 = bool;
        this.A03 = bool2;
        this.A08 = str2;
        this.A09 = str3;
        this.A00 = interfaceC1118052h;
        this.A0A = str4;
        this.A01 = interfaceC1118052h2;
        this.A0B = str5;
        this.A04 = f;
        this.A0C = str6;
        this.A0D = str7;
    }

    @Override // X.InterfaceC1118152j
    public final C52i Et3() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52i) {
                C52i c52i = (C52i) obj;
                if (!C14360o3.A0K(this.A07, c52i.A07) || !C14360o3.A0K(this.A05, c52i.A05) || !C14360o3.A0K(this.A06, c52i.A06) || this.A0E != c52i.A0E || !C14360o3.A0K(this.A02, c52i.A02) || !C14360o3.A0K(this.A03, c52i.A03) || !C14360o3.A0K(this.A08, c52i.A08) || !C14360o3.A0K(this.A09, c52i.A09) || !C14360o3.A0K(this.A00, c52i.A00) || !C14360o3.A0K(this.A0A, c52i.A0A) || !C14360o3.A0K(this.A01, c52i.A01) || !C14360o3.A0K(this.A0B, c52i.A0B) || !C14360o3.A0K(this.A04, c52i.A04) || !C14360o3.A0K(this.A0C, c52i.A0C) || !C14360o3.A0K(this.A0D, c52i.A0D)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1118152j
    public final /* bridge */ /* synthetic */ C41211IMa AKI() {
        return new C41211IMa(this);
    }

    @Override // X.InterfaceC1118152j
    public final Integer BGg() {
        return this.A05;
    }

    @Override // X.InterfaceC1118152j
    public final Integer BGz() {
        return this.A06;
    }

    @Override // X.InterfaceC1118152j
    public final String BS0() {
        return this.A08;
    }

    @Override // X.InterfaceC1118152j
    public final String Byk() {
        return this.A09;
    }

    @Override // X.InterfaceC1118152j
    public final InterfaceC1118052h Bym() {
        return this.A00;
    }

    @Override // X.InterfaceC1118152j
    public final String Byp() {
        return this.A0A;
    }

    @Override // X.InterfaceC1118152j
    public final InterfaceC1118052h C0V() {
        return this.A01;
    }

    @Override // X.InterfaceC1118152j
    public final String C0W() {
        return this.A0B;
    }

    @Override // X.InterfaceC1118152j
    public final Float C0Z() {
        return this.A04;
    }

    @Override // X.InterfaceC1118152j
    public final String C0o() {
        return this.A0C;
    }

    @Override // X.InterfaceC1118152j
    public final boolean CcL() {
        return this.A0E;
    }

    @Override // X.InterfaceC1118152j
    public final Boolean CcM() {
        return this.A02;
    }

    @Override // X.InterfaceC1118152j
    public final Boolean Cep() {
        return this.A03;
    }

    @Override // X.InterfaceC1118152j
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCutoutSticker", AbstractC39893Hmg.A00(this));
    }

    @Override // X.InterfaceC1118152j
    public final String getId() {
        return this.A07;
    }

    @Override // X.InterfaceC1118152j
    public final String getStrongId() {
        return this.A0D;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11 = this.A07.hashCode() * 31;
        Integer num = this.A05;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode11 + hashCode) * 31;
        Integer num2 = this.A06;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A0E) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        Boolean bool = this.A02;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        Boolean bool2 = this.A03;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int hashCode12 = (((i6 + hashCode4) * 31) + this.A08.hashCode()) * 31;
        String str = this.A09;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i7 = (hashCode12 + hashCode5) * 31;
        InterfaceC1118052h interfaceC1118052h = this.A00;
        if (interfaceC1118052h == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = interfaceC1118052h.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        String str2 = this.A0A;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        InterfaceC1118052h interfaceC1118052h2 = this.A01;
        if (interfaceC1118052h2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = interfaceC1118052h2.hashCode();
        }
        int i10 = (i9 + hashCode8) * 31;
        String str3 = this.A0B;
        if (str3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str3.hashCode();
        }
        int i11 = (i10 + hashCode9) * 31;
        Float f = this.A04;
        if (f == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = f.hashCode();
        }
        int hashCode13 = (((i11 + hashCode10) * 31) + this.A0C.hashCode()) * 31;
        String str4 = this.A0D;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode13 + i;
    }
}
