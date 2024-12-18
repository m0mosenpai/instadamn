package X;

import android.view.View;

/* renamed from: X.E6z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32073E6z extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32073E6z(View.OnClickListener onClickListener, int i, int i2) {
        this(null, onClickListener, null, i, i2, 2);
        this.A00 = 2;
    }

    public static C32073E6z A00(Object obj, int i, int i2, int i3) {
        return new C32073E6z(new ViewOnClickListenerC35666Fp0(obj, i), i2, i3);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C32073E6z)) {
                        return false;
                    }
                    C32073E6z c32073E6z = (C32073E6z) obj;
                    if (c32073E6z.A00 != 0 || this.A01 != c32073E6z.A01 || this.A02 != c32073E6z.A02 || !C14360o3.A0K(this.A03, c32073E6z.A03) || !C14360o3.A0K(this.A04, c32073E6z.A04)) {
                        return false;
                    }
                    obj2 = this.A05;
                    obj3 = c32073E6z.A05;
                    break;
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C32073E6z)) {
                        return false;
                    }
                    C32073E6z c32073E6z2 = (C32073E6z) obj;
                    if (c32073E6z2.A00 != 1 || !C14360o3.A0K(this.A05, c32073E6z2.A05) || this.A02 != c32073E6z2.A02 || this.A04 != c32073E6z2.A04 || this.A03 != c32073E6z2.A03 || this.A01 != c32073E6z2.A01) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                if (this != obj) {
                    if (obj instanceof C32073E6z) {
                        C32073E6z c32073E6z3 = (C32073E6z) obj;
                        if (c32073E6z3.A00 == 2 && this.A01 == c32073E6z3.A01 && this.A02 == c32073E6z3.A02 && C14360o3.A0K(this.A04, c32073E6z3.A04) && C14360o3.A0K(this.A05, c32073E6z3.A05)) {
                            obj2 = this.A03;
                            obj3 = c32073E6z3.A03;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0M;
        int A07;
        switch (this.A00) {
            case 0:
                A0M = ((((((this.A01 * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
                A07 = AbstractC25227BEk.A07(this.A05);
                break;
            case 1:
                int A0J = AbstractC166997dE.A0J(this.A04, (AbstractC166987dD.A0J(this.A05) + this.A02) * 31);
                Integer num = (Integer) this.A03;
                A07 = AbstractC167017dG.A0L(num, AbstractC68471VSc.A00(num), A0J);
                A0M = this.A01;
                break;
            default:
                A07 = ((((((this.A01 * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05)) * 31;
                A0M = this.A03.hashCode();
                break;
        }
        return A0M + A07;
    }

    public final String toString() {
        String str;
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DirectGifCategoriesTabModel(searchQuery=");
        A1C.append(this.A05);
        A1C.append(", resInt=");
        A1C.append(this.A02);
        A1C.append(", tabType=");
        A1C.append(this.A04);
        A1C.append(", serverType=");
        Integer num = (Integer) this.A03;
        if (num != null) {
            str = AbstractC68471VSc.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(MSV.A00(129));
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }

    public C32073E6z(Object obj, Object obj2, String str, int i, int i2, int i3) {
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = obj;
        this.A05 = str;
        this.A03 = obj2;
    }

    public C32073E6z(EnumC46159Kbx enumC46159Kbx, Integer num, String str, int i, int i2) {
        this.A00 = 1;
        this.A05 = str;
        this.A02 = i;
        this.A04 = enumC46159Kbx;
        this.A03 = num;
        this.A01 = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32073E6z(Integer num, int i, int i2) {
        this(null, num, null, i, i2, 0);
        this.A00 = 0;
    }
}
