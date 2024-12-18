package X;

import java.util.List;

/* renamed from: X.Bii, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26218Bii extends C0T6 implements MNW {
    public final float A00;
    public final C45044JwZ A01;
    public final C45044JwZ A02;
    public final String A03;
    public final List A04;
    public final C5Hc A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C26218Bii(C45044JwZ c45044JwZ, C45044JwZ c45044JwZ2, String str, List list, C5Hc c5Hc, float f, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c5Hc, 1);
        this.A05 = c5Hc;
        this.A02 = c45044JwZ;
        this.A00 = f;
        this.A03 = str;
        this.A04 = list;
        this.A08 = z;
        this.A01 = c45044JwZ2;
        this.A06 = z2;
        this.A07 = z3;
    }

    public static /* synthetic */ C26218Bii A00(C26218Bii c26218Bii, String str, List list, float f, int i, boolean z) {
        C5Hc c5Hc;
        C45044JwZ c45044JwZ;
        boolean z2;
        boolean z3;
        boolean z4 = z;
        List list2 = list;
        String str2 = str;
        float f2 = f;
        C45044JwZ c45044JwZ2 = null;
        if ((i & 1) != 0) {
            c5Hc = c26218Bii.A05;
        } else {
            c5Hc = null;
        }
        if ((i & 2) != 0) {
            c45044JwZ = c26218Bii.A02;
        } else {
            c45044JwZ = null;
        }
        if ((i & 4) != 0) {
            f2 = c26218Bii.A00;
        }
        if ((i & 8) != 0) {
            str2 = c26218Bii.A03;
        }
        if ((i & 16) != 0) {
            list2 = c26218Bii.A04;
        }
        if ((i & 32) != 0) {
            z2 = c26218Bii.A08;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            c45044JwZ2 = c26218Bii.A01;
        }
        if ((i & 128) != 0) {
            z3 = c26218Bii.A06;
        } else {
            z3 = false;
        }
        if ((i & 256) != 0) {
            z4 = c26218Bii.A07;
        }
        AbstractC25233BEq.A0w(0, c5Hc, str2, list2);
        return new C26218Bii(c45044JwZ, c45044JwZ2, str2, list2, c5Hc, f2, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26218Bii) {
                C26218Bii c26218Bii = (C26218Bii) obj;
                if (!C14360o3.A0K(this.A05, c26218Bii.A05) || !C14360o3.A0K(this.A02, c26218Bii.A02) || Float.compare(this.A00, c26218Bii.A00) != 0 || !C14360o3.A0K(this.A03, c26218Bii.A03) || !C14360o3.A0K(this.A04, c26218Bii.A04) || this.A08 != c26218Bii.A08 || !C14360o3.A0K(this.A01, c26218Bii.A01) || this.A06 != c26218Bii.A06 || this.A07 != c26218Bii.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A07, AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A00((AbstractC166987dD.A0G(this.A05) + AbstractC167017dG.A0M(this.A02)) * 31, this.A00)))) + AbstractC166997dE.A0I(this.A01)) * 31));
    }

    public C26218Bii() {
        this(null, null, "", C16930sl.A00, AbstractC133095zb.A04(C6V.A02, C6V.A04, C6V.A03), 250.0f, false, true, true);
    }
}
