package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.E6h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32055E6h extends C0T6 {
    public final int A00;
    public final C37838Gks A01;
    public final C45209Jzp A02;
    public final EnumC33345Eoe A03;
    public final User A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final String A09;
    public final String A0A;
    public final ArrayList A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32055E6h) {
                C32055E6h c32055E6h = (C32055E6h) obj;
                if (!C14360o3.A0K(this.A0E, c32055E6h.A0E) || !C14360o3.A0K(this.A0C, c32055E6h.A0C) || !C14360o3.A0K(this.A0F, c32055E6h.A0F) || !C14360o3.A0K(this.A0D, c32055E6h.A0D) || !C14360o3.A0K(this.A0A, c32055E6h.A0A) || !C14360o3.A0K(this.A09, c32055E6h.A09) || !C14360o3.A0K(this.A04, c32055E6h.A04) || !C14360o3.A0K(this.A06, c32055E6h.A06) || !C14360o3.A0K(this.A07, c32055E6h.A07) || !C14360o3.A0K(this.A02, c32055E6h.A02) || !C14360o3.A0K(this.A01, c32055E6h.A01) || this.A03 != c32055E6h.A03 || this.A00 != c32055E6h.A00 || this.A0G != c32055E6h.A0G || this.A0H != c32055E6h.A0H || !C14360o3.A0K(this.A08, c32055E6h.A08) || !C14360o3.A0K(this.A0B, c32055E6h.A0B) || !C14360o3.A0K(this.A05, c32055E6h.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0G, (((((((((((((((((((AbstractC166997dE.A0J(this.A0F, AbstractC166997dE.A0J(this.A0C, AbstractC166987dD.A0G(this.A0E))) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + this.A00) * 31)) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC166997dE.A0I(this.A05);
    }

    public C32055E6h(C37838Gks c37838Gks, C45209Jzp c45209Jzp, EnumC33345Eoe enumC33345Eoe, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, ArrayList arrayList, List list, List list2, List list3, List list4, int i, boolean z, boolean z2) {
        this.A0E = list;
        this.A0C = list2;
        this.A0F = list3;
        this.A0D = list4;
        this.A0A = str;
        this.A09 = str2;
        this.A04 = user;
        this.A06 = bool;
        this.A07 = bool2;
        this.A02 = c45209Jzp;
        this.A01 = c37838Gks;
        this.A03 = enumC33345Eoe;
        this.A00 = i;
        this.A0G = z;
        this.A0H = z2;
        this.A08 = bool3;
        this.A0B = arrayList;
        this.A05 = bool4;
    }
}
