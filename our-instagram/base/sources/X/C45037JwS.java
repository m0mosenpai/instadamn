package X;

import java.util.List;

/* renamed from: X.JwS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45037JwS extends C0T6 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public C45037JwS(EnumC46135KbZ enumC46135KbZ, List list, int i, int i2, boolean z) {
        this.A00 = i2;
        if (i2 == 0) {
            C14360o3.A0B(list, 2);
        }
        C14360o3.A0B(enumC46135KbZ, 3);
        this.A01 = i;
        this.A03 = list;
        this.A02 = enumC46135KbZ;
        this.A04 = z;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C45037JwS) {
            C45037JwS c45037JwS = (C45037JwS) obj;
            if (c45037JwS.A00 != i || this.A01 != c45037JwS.A01 || !C14360o3.A0K(this.A03, c45037JwS.A03) || this.A02 != c45037JwS.A02 || this.A04 != c45037JwS.A04) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, this.A01 * 31)));
    }
}
