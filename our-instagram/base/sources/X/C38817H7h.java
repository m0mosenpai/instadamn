package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H7h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38817H7h extends C0T6 implements JM0 {
    public final C5FI A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;

    @Override // X.JM0
    public final C38817H7h F5n() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38817H7h) {
                C38817H7h c38817H7h = (C38817H7h) obj;
                if (!C14360o3.A0K(this.A00, c38817H7h.A00) || !C14360o3.A0K(this.A01, c38817H7h.A01) || !C14360o3.A0K(this.A02, c38817H7h.A02) || !C14360o3.A0K(this.A03, c38817H7h.A03) || !C14360o3.A0K(this.A04, c38817H7h.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JM0
    public final /* bridge */ /* synthetic */ C5FJ Aln() {
        return this.A00;
    }

    @Override // X.JM0
    public final Integer BDS() {
        return this.A01;
    }

    @Override // X.JM0
    public final Integer Bzt() {
        return this.A02;
    }

    @Override // X.JM0
    public final Integer Bzv() {
        return this.A03;
    }

    @Override // X.JM0
    public final Integer CHg() {
        return this.A04;
    }

    @Override // X.JM0
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryAdAutoCropDict", I3A.A00(this));
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public C38817H7h(C5FI c5fi, Integer num, Integer num2, Integer num3, Integer num4) {
        this.A00 = c5fi;
        this.A01 = num;
        this.A02 = num2;
        this.A03 = num3;
        this.A04 = num4;
    }
}
