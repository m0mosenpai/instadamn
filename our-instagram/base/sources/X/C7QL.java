package X;

/* renamed from: X.7QL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7QL extends C0T6 implements InterfaceC129545tJ {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C2EY A04;
    public final InterfaceC09390do A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.messagethread.commondecorations.theme.model.ThemeModel");
                C7QL c7ql = (C7QL) obj;
                if (this.A04 != c7ql.A04 || !C14360o3.A0K(this.A02, c7ql.A02) || this.A06 != c7ql.A06 || this.A07 != c7ql.A07 || this.A00 != c7ql.A00 || this.A01 != c7ql.A01 || this.A08 != c7ql.A08 || this.A09 != c7ql.A09 || !C14360o3.A0K(this.A03, c7ql.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVa() {
        return this.A00;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVb() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A07) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A00) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A01) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A08) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A09) {
            i11 = 1231;
        }
        return ((i10 + i11) * 31) + this.A03.hashCode();
    }

    public C7QL(AnonymousClass988 anonymousClass988, C7IM c7im, C2EY c2ey, InterfaceC09390do interfaceC09390do, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A04 = c2ey;
        this.A02 = anonymousClass988;
        this.A05 = interfaceC09390do;
        this.A06 = z;
        this.A07 = z2;
        this.A00 = z3;
        this.A01 = z4;
        this.A08 = z5;
        this.A09 = z6;
        this.A03 = c7im;
    }
}
