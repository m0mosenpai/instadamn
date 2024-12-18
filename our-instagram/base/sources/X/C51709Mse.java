package X;

import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Mse, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51709Mse extends C0T6 {
    public final int A00;
    public final int A01;
    public final QIz A02;
    public final C109054vU A03;
    public final LiveUserPaySupportTier A04;
    public final User A05;
    public final C3PO A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final java.util.Set A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final EnumC109104va A0O;
    public final List A0P;
    public final boolean A0Q;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51709Mse) {
                C51709Mse c51709Mse = (C51709Mse) obj;
                if (!C14360o3.A0K(this.A05, c51709Mse.A05) || !C14360o3.A0K(this.A0H, c51709Mse.A0H) || !C14360o3.A0K(this.A0E, c51709Mse.A0E) || !C14360o3.A0K(this.A0D, c51709Mse.A0D) || this.A01 != c51709Mse.A01 || this.A06 != c51709Mse.A06 || this.A0K != c51709Mse.A0K || this.A0M != c51709Mse.A0M || this.A0Q != c51709Mse.A0Q || !C14360o3.A0K(this.A08, c51709Mse.A08) || !C14360o3.A0K(this.A09, c51709Mse.A09) || this.A0O != c51709Mse.A0O || !C14360o3.A0K(this.A03, c51709Mse.A03) || this.A04 != c51709Mse.A04 || this.A00 != c51709Mse.A00 || this.A0J != c51709Mse.A0J || !C14360o3.A0K(this.A0A, c51709Mse.A0A) || !C14360o3.A0K(this.A07, c51709Mse.A07) || !C14360o3.A0K(this.A0G, c51709Mse.A0G) || !C14360o3.A0K(this.A0C, c51709Mse.A0C) || !C14360o3.A0K(this.A0B, c51709Mse.A0B) || !C14360o3.A0K(this.A0F, c51709Mse.A0F) || !C14360o3.A0K(this.A0P, c51709Mse.A0P) || this.A0N != c51709Mse.A0N || this.A0L != c51709Mse.A0L || this.A0I != c51709Mse.A0I || !C14360o3.A0K(this.A02, c51709Mse.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public C51709Mse(QIz qIz, C109054vU c109054vU, LiveUserPaySupportTier liveUserPaySupportTier, EnumC109104va enumC109104va, User user, C3PO c3po, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, java.util.Set set, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AbstractC167027dH.A13(user, set, list);
        C14360o3.A0B(c3po, 6);
        C14360o3.A0B(str7, 21);
        this.A05 = user;
        this.A0H = set;
        this.A0E = list;
        this.A0D = str;
        this.A01 = i;
        this.A06 = c3po;
        this.A0K = z;
        this.A0M = z2;
        this.A0Q = z3;
        this.A08 = str2;
        this.A09 = str3;
        this.A0O = enumC109104va;
        this.A03 = c109054vU;
        this.A04 = liveUserPaySupportTier;
        this.A00 = i2;
        this.A0J = z4;
        this.A0A = str4;
        this.A07 = str5;
        this.A0G = list2;
        this.A0C = str6;
        this.A0B = str7;
        this.A0F = list3;
        this.A0P = list4;
        this.A0N = z5;
        this.A0L = z6;
        this.A0I = z7;
        this.A02 = qIz;
    }

    public static String A00(C51709Mse c51709Mse) {
        return c51709Mse.A05.getId();
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0N, AbstractC166997dE.A0J(this.A0P, AbstractC166997dE.A0J(this.A0F, AbstractC166997dE.A0K(this.A0B, (AbstractC166997dE.A0J(this.A0G, (((AbstractC167007dF.A0D(this.A0J, (((((((AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0K(this.A08, AbstractC167007dF.A0D(this.A0Q, AbstractC167007dF.A0D(this.A0M, AbstractC167007dF.A0D(this.A0K, AbstractC166997dE.A0J(this.A06, (((AbstractC166997dE.A0J(this.A0E, AbstractC166997dE.A0J(this.A0H, AbstractC166987dD.A0G(this.A05))) + AbstractC167017dG.A0O(this.A0D)) * 31) + this.A01) * 31)))))) + AbstractC167017dG.A0M(this.A0O)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31)))))) + AbstractC166997dE.A0I(this.A02);
    }
}
