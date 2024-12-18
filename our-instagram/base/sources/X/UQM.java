package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class UQM extends C0T6 {
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public int A04;
    public int A06;
    public int A07;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public C51737MtK A0E;
    public Boolean A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public List A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public int A05 = 0;
    public int A08 = 0;
    public String A0X = "";

    public UQM() {
        A01(this);
        this.A0E = null;
        A00(this);
        this.A0e = null;
        A02(this);
        this.A0F = null;
    }

    public static void A00(UQM uqm) {
        uqm.A0N = null;
        uqm.A0i = false;
        uqm.A0f = false;
        uqm.A00 = 0.0d;
        uqm.A01 = 0.0d;
        uqm.A0B = 0;
        uqm.A04 = 0;
        uqm.A0V = null;
        uqm.A0T = null;
        uqm.A0Z = null;
        uqm.A0G = null;
        uqm.A0R = null;
    }

    public static void A01(UQM uqm) {
        uqm.A02 = 0;
        uqm.A0O = null;
        uqm.A07 = 0;
        uqm.A03 = 0;
        uqm.A0D = 0L;
        uqm.A0C = 0L;
        uqm.A0g = false;
        uqm.A0c = null;
        uqm.A0U = null;
        uqm.A0a = null;
        uqm.A06 = 0;
        uqm.A0J = null;
        uqm.A0K = null;
        uqm.A0d = null;
        uqm.A0M = null;
    }

    public static void A02(UQM uqm) {
        uqm.A0Y = null;
        uqm.A0L = null;
        uqm.A0Q = null;
        uqm.A0P = null;
        uqm.A0S = null;
        uqm.A0A = 0;
        uqm.A09 = 0;
        uqm.A0b = null;
        uqm.A0h = false;
        uqm.A0H = null;
        uqm.A0I = null;
        uqm.A0W = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQM) {
                UQM uqm = (UQM) obj;
                if (this.A05 != uqm.A05 || this.A08 != uqm.A08 || !C14360o3.A0K(this.A0X, uqm.A0X) || this.A02 != uqm.A02 || !C14360o3.A0K(this.A0O, uqm.A0O) || this.A07 != uqm.A07 || this.A03 != uqm.A03 || this.A0D != uqm.A0D || this.A0C != uqm.A0C || this.A0g != uqm.A0g || !C14360o3.A0K(this.A0c, uqm.A0c) || !C14360o3.A0K(this.A0U, uqm.A0U) || !C14360o3.A0K(this.A0a, uqm.A0a) || this.A06 != uqm.A06 || !C14360o3.A0K(this.A0J, uqm.A0J) || !C14360o3.A0K(this.A0K, uqm.A0K) || !C14360o3.A0K(this.A0d, uqm.A0d) || !C14360o3.A0K(this.A0M, uqm.A0M) || !C14360o3.A0K(this.A0E, uqm.A0E) || !C14360o3.A0K(this.A0N, uqm.A0N) || this.A0i != uqm.A0i || this.A0f != uqm.A0f || Double.compare(this.A00, uqm.A00) != 0 || Double.compare(this.A01, uqm.A01) != 0 || this.A0B != uqm.A0B || this.A04 != uqm.A04 || !C14360o3.A0K(this.A0V, uqm.A0V) || !C14360o3.A0K(this.A0T, uqm.A0T) || !C14360o3.A0K(this.A0Z, uqm.A0Z) || !C14360o3.A0K(this.A0G, uqm.A0G) || !C14360o3.A0K(this.A0R, uqm.A0R) || !C14360o3.A0K(this.A0e, uqm.A0e) || !C14360o3.A0K(this.A0Y, uqm.A0Y) || !C14360o3.A0K(this.A0L, uqm.A0L) || !C14360o3.A0K(this.A0Q, uqm.A0Q) || !C14360o3.A0K(this.A0P, uqm.A0P) || !C14360o3.A0K(this.A0S, uqm.A0S) || this.A0A != uqm.A0A || this.A09 != uqm.A09 || !C14360o3.A0K(this.A0b, uqm.A0b) || this.A0h != uqm.A0h || !C14360o3.A0K(this.A0H, uqm.A0H) || !C14360o3.A0K(this.A0I, uqm.A0I) || !C14360o3.A0K(this.A0W, uqm.A0W) || !C14360o3.A0K(this.A0F, uqm.A0F)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (((((AbstractC167007dF.A0D(this.A0h, (((((((((((((((((((((((((((((((((((AbstractC167007dF.A0D(this.A0f, AbstractC167007dF.A0D(this.A0i, (((((((((((((((((((AbstractC167007dF.A0D(this.A0g, AbstractC167007dF.A07(this.A0C, AbstractC167007dF.A07(this.A0D, (((((((AbstractC166997dE.A0K(this.A0X, ((this.A05 * 31) + this.A08) * 31) + this.A02) * 31) + AbstractC167017dG.A0O(this.A0O)) * 31) + this.A07) * 31) + this.A03) * 31))) + AbstractC167017dG.A0O(this.A0c)) * 31) + AbstractC167017dG.A0O(this.A0U)) * 31) + AbstractC167017dG.A0O(this.A0a)) * 31) + this.A06) * 31) + AbstractC167017dG.A0O(this.A0J)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31) + AbstractC167017dG.A0O(this.A0d)) * 31) + AbstractC167017dG.A0O(this.A0M)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0N)) * 31)) + AbstractC28006CWd.A00(this.A00)) * 31) + AbstractC28006CWd.A00(this.A01)) * 31) + this.A0B) * 31) + this.A04) * 31) + AbstractC167017dG.A0O(this.A0V)) * 31) + AbstractC167017dG.A0O(this.A0T)) * 31) + AbstractC167017dG.A0O(this.A0Z)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0O(this.A0R)) * 31) + AbstractC167017dG.A0M(this.A0e)) * 31) + AbstractC167017dG.A0O(this.A0Y)) * 31) + AbstractC167017dG.A0O(this.A0L)) * 31) + AbstractC167017dG.A0O(this.A0Q)) * 31) + AbstractC167017dG.A0O(this.A0P)) * 31) + AbstractC167017dG.A0O(this.A0S)) * 31) + this.A0A) * 31) + this.A09) * 31) + AbstractC167017dG.A0O(this.A0b)) * 31) + AbstractC167017dG.A0O(this.A0H)) * 31) + AbstractC167017dG.A0O(this.A0I)) * 31) + AbstractC167017dG.A0O(this.A0W)) * 31;
        Boolean bool = this.A0F;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0D + i;
    }
}
