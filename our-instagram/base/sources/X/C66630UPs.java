package X;

import java.util.List;

/* renamed from: X.UPs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66630UPs extends C0T6 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public UPR A06;
    public VDP A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;

    public C66630UPs(VDP vdp) {
        this.A09 = null;
        this.A07 = vdp;
        this.A0B = false;
        this.A0J = false;
        this.A0N = false;
        this.A0M = false;
        this.A0L = false;
        this.A0K = false;
        this.A0C = false;
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A0A = null;
        this.A04 = 0.0f;
        this.A02 = 0.0f;
        this.A03 = 0.0f;
        this.A05 = 0;
        this.A0G = false;
        this.A0H = false;
        this.A0F = false;
        this.A0I = false;
        this.A0D = false;
        this.A08 = null;
        this.A06 = null;
        this.A0E = false;
        this.A0O = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66630UPs) {
                C66630UPs c66630UPs = (C66630UPs) obj;
                if (!C14360o3.A0K(this.A09, c66630UPs.A09) || this.A07 != c66630UPs.A07 || this.A0B != c66630UPs.A0B || this.A0J != c66630UPs.A0J || this.A0N != c66630UPs.A0N || this.A0M != c66630UPs.A0M || this.A0L != c66630UPs.A0L || this.A0K != c66630UPs.A0K || this.A0C != c66630UPs.A0C || Float.compare(this.A01, c66630UPs.A01) != 0 || Float.compare(this.A00, c66630UPs.A00) != 0 || !C14360o3.A0K(this.A0A, c66630UPs.A0A) || Float.compare(this.A04, c66630UPs.A04) != 0 || Float.compare(this.A02, c66630UPs.A02) != 0 || Float.compare(this.A03, c66630UPs.A03) != 0 || this.A05 != c66630UPs.A05 || this.A0G != c66630UPs.A0G || this.A0H != c66630UPs.A0H || this.A0F != c66630UPs.A0F || this.A0I != c66630UPs.A0I || this.A0D != c66630UPs.A0D || !C14360o3.A0K(this.A08, c66630UPs.A08) || !C14360o3.A0K(this.A06, c66630UPs.A06) || this.A0E != c66630UPs.A0E || this.A0O != c66630UPs.A0O) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0G, (AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00((AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0K, AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0M, AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0J(this.A07, AbstractC167017dG.A0O(this.A09) * 31)))))))), this.A01), this.A00) + AbstractC167017dG.A0M(this.A0A)) * 31, this.A04), this.A02), this.A03) + this.A05) * 31))))) + AbstractC167017dG.A0O(this.A08)) * 31;
        UPR upr = this.A06;
        if (upr != null) {
            i = upr.hashCode();
        }
        int A0D2 = AbstractC167007dF.A0D(this.A0E, (A0D + i) * 31);
        int i2 = 1237;
        if (this.A0O) {
            i2 = 1231;
        }
        return A0D2 + i2;
    }

    public C66630UPs() {
        this(VDP.A04);
    }
}
