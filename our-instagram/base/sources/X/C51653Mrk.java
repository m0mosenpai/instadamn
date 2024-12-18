package X;

import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Mrk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51653Mrk extends C0T6 {
    public EnumC53208Ng6 A00;
    public C51737MtK A01;
    public JSONObject A02;
    public boolean A03;
    public final C51687MsI A04;
    public final Boolean A05;
    public final Double A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final boolean A0L;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51653Mrk) {
                C51653Mrk c51653Mrk = (C51653Mrk) obj;
                if (!C14360o3.A0K(this.A09, c51653Mrk.A09) || !C14360o3.A0K(this.A0B, c51653Mrk.A0B) || !C14360o3.A0K(this.A0A, c51653Mrk.A0A) || !C14360o3.A0K(this.A04, c51653Mrk.A04) || !C14360o3.A0K(this.A06, c51653Mrk.A06) || this.A0F != c51653Mrk.A0F || this.A0L != c51653Mrk.A0L || this.A00 != c51653Mrk.A00 || this.A03 != c51653Mrk.A03 || !C14360o3.A0K(this.A01, c51653Mrk.A01) || !C14360o3.A0K(this.A02, c51653Mrk.A02) || this.A0G != c51653Mrk.A0G || this.A0E != c51653Mrk.A0E || this.A0D != c51653Mrk.A0D || !C14360o3.A0K(this.A08, c51653Mrk.A08) || !C14360o3.A0K(this.A07, c51653Mrk.A07) || !C14360o3.A0K(this.A05, c51653Mrk.A05) || !C14360o3.A0K(this.A0I, c51653Mrk.A0I) || !C14360o3.A0K(this.A0K, c51653Mrk.A0K) || !C14360o3.A0K(this.A0H, c51653Mrk.A0H) || !C14360o3.A0K(this.A0J, c51653Mrk.A0J) || !C14360o3.A0K(this.A0C, c51653Mrk.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0G, (((AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0F, (AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0K(this.A0B, AbstractC167017dG.A0O(this.A09) * 31))) + AbstractC167017dG.A0M(this.A06)) * 31)))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31))) + AbstractC53644Nnp.A00()) * 31) + AbstractC167017dG.A0O(this.A08)) * 31 * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A0I)) * 31) + AbstractC167017dG.A0M(this.A0K)) * 31) + AbstractC167017dG.A0M(this.A0H)) * 31) + AbstractC167017dG.A0M(this.A0J)) * 31) + AbstractC166997dE.A0I(this.A0C);
    }

    public C51653Mrk(EnumC53208Ng6 enumC53208Ng6, C51687MsI c51687MsI, C51737MtK c51737MtK, Boolean bool, Double d, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, List list, JSONObject jSONObject, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC43594JPz.A1P(str2, c51687MsI);
        C14360o3.A0B(enumC53208Ng6, 8);
        this.A09 = str;
        this.A0B = str2;
        this.A0A = str3;
        this.A04 = c51687MsI;
        this.A06 = d;
        this.A0F = z;
        this.A0L = z2;
        this.A00 = enumC53208Ng6;
        this.A03 = z3;
        this.A01 = c51737MtK;
        this.A02 = jSONObject;
        this.A0G = z4;
        this.A0E = z5;
        this.A0D = z6;
        this.A08 = str4;
        this.A07 = num;
        this.A05 = bool;
        this.A0I = num2;
        this.A0K = num3;
        this.A0H = num4;
        this.A0J = num5;
        this.A0C = list;
    }
}
