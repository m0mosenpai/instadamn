package X;

import com.facebook.common.dextricks.Constants;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Bg4 */
/* loaded from: classes5.dex */
public final class C26075Bg4 extends C0T6 {
    public final EnumC39642HiX A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final EnumC27395C6y A04;
    public final EnumC27396C6z A05;
    public final EnumC27383C6m A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;

    public static /* synthetic */ C26075Bg4 A02(C26075Bg4 c26075Bg4, Integer num, Integer num2, String str, String str2, int i, boolean z) {
        return A00(null, null, null, null, null, null, c26075Bg4, num, num2, null, str, str2, null, null, i, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26075Bg4) {
                C26075Bg4 c26075Bg4 = (C26075Bg4) obj;
                if (!C14360o3.A0K(this.A09, c26075Bg4.A09) || !C14360o3.A0K(this.A0D, c26075Bg4.A0D) || this.A05 != c26075Bg4.A05 || !C14360o3.A0K(this.A07, c26075Bg4.A07) || !C14360o3.A0K(this.A08, c26075Bg4.A08) || !C14360o3.A0K(this.A02, c26075Bg4.A02) || !C14360o3.A0K(this.A03, c26075Bg4.A03) || !C14360o3.A0K(this.A0C, c26075Bg4.A0C) || !C14360o3.A0K(this.A0B, c26075Bg4.A0B) || !C14360o3.A0K(this.A0A, c26075Bg4.A0A) || this.A0F != c26075Bg4.A0F || this.A04 != c26075Bg4.A04 || this.A06 != c26075Bg4.A06 || this.A0G != c26075Bg4.A0G || !C14360o3.A0K(this.A0E, c26075Bg4.A0E) || this.A00 != c26075Bg4.A00 || !C14360o3.A0K(this.A01, c26075Bg4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26075Bg4(EnumC39642HiX enumC39642HiX, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, EnumC27395C6y enumC27395C6y, EnumC27396C6z enumC27396C6z, EnumC27383C6m enumC27383C6m, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        AbstractC25229BEm.A1M(str4, 9, enumC27383C6m);
        AbstractC25229BEm.A1P(str6, 15, enumC39642HiX);
        this.A09 = str;
        this.A0D = str2;
        this.A05 = enumC27396C6z;
        this.A07 = num;
        this.A08 = num2;
        this.A02 = immutableList;
        this.A03 = immutableList2;
        this.A0C = str3;
        this.A0B = str4;
        this.A0A = str5;
        this.A0F = z;
        this.A04 = enumC27395C6y;
        this.A06 = enumC27383C6m;
        this.A0G = z2;
        this.A0E = str6;
        this.A00 = enumC39642HiX;
        this.A01 = immutableList3;
    }

    public static /* synthetic */ C26075Bg4 A00(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, EnumC27395C6y enumC27395C6y, EnumC27396C6z enumC27396C6z, EnumC27383C6m enumC27383C6m, C26075Bg4 c26075Bg4, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        boolean z2;
        String str6;
        ImmutableList immutableList4 = immutableList3;
        String str7 = str;
        String str8 = str2;
        EnumC27396C6z enumC27396C6z2 = enumC27396C6z;
        Integer num3 = num;
        Integer num4 = num2;
        ImmutableList immutableList5 = immutableList;
        String str9 = str5;
        ImmutableList immutableList6 = immutableList2;
        String str10 = str3;
        String str11 = str4;
        boolean z3 = z;
        EnumC27395C6y enumC27395C6y2 = enumC27395C6y;
        EnumC27383C6m enumC27383C6m2 = enumC27383C6m;
        EnumC39642HiX enumC39642HiX = null;
        if ((i & 1) != 0) {
            str7 = c26075Bg4.A09;
        }
        if ((i & 2) != 0) {
            str8 = c26075Bg4.A0D;
        }
        if ((i & 4) != 0) {
            enumC27396C6z2 = c26075Bg4.A05;
        }
        if ((i & 8) != 0) {
            num3 = c26075Bg4.A07;
        }
        if ((i & 16) != 0) {
            num4 = c26075Bg4.A08;
        }
        if ((i & 32) != 0) {
            immutableList5 = c26075Bg4.A02;
        }
        if ((i & 64) != 0) {
            immutableList6 = c26075Bg4.A03;
        }
        if ((i & 128) != 0) {
            str10 = c26075Bg4.A0C;
        }
        if ((i & 256) != 0) {
            str11 = c26075Bg4.A0B;
        }
        if ((i & 512) != 0) {
            str9 = c26075Bg4.A0A;
        }
        if ((i & 1024) != 0) {
            z3 = c26075Bg4.A0F;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            enumC27395C6y2 = c26075Bg4.A04;
        }
        if ((i & 4096) != 0) {
            enumC27383C6m2 = c26075Bg4.A06;
        }
        if ((i & 8192) != 0) {
            z2 = c26075Bg4.A0G;
        } else {
            z2 = false;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            str6 = c26075Bg4.A0E;
        } else {
            str6 = null;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            enumC39642HiX = c26075Bg4.A00;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            immutableList4 = c26075Bg4.A01;
        }
        AbstractC167017dG.A1T(immutableList5, immutableList6);
        AbstractC25229BEm.A1L(str11, 8, enumC27383C6m2);
        AbstractC25229BEm.A1O(str6, 14, enumC39642HiX);
        C14360o3.A0B(immutableList4, 16);
        return new C26075Bg4(enumC39642HiX, immutableList5, immutableList6, immutableList4, enumC27395C6y2, enumC27396C6z2, enumC27383C6m2, num3, num4, str7, str8, str10, str11, str9, str6, z3, z2);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A0E, AbstractC167007dF.A0D(this.A0G, AbstractC166997dE.A0J(this.A06, (AbstractC167007dF.A0D(this.A0F, (AbstractC166997dE.A0K(this.A0B, (AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, ((((((((AbstractC167017dG.A0O(this.A09) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31)) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31)))));
    }

    public static void A03(C0CA c0ca, C05A c05a) {
        C0CA.A00(c0ca, ((C26075Bg4) c05a.getValue()).A0E, "waterfall_id");
    }
}
