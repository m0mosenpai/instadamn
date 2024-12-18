package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.44N, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44N extends C0T6 implements C44O {
    public final int A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final boolean A05;

    @Override // X.C44O
    public final C44N Esi() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44N) {
                C44N c44n = (C44N) obj;
                if (this.A00 != c44n.A00 || this.A05 != c44n.A05 || !C14360o3.A0K(this.A01, c44n.A01) || !C14360o3.A0K(this.A02, c44n.A02) || !C14360o3.A0K(this.A03, c44n.A03) || !C14360o3.A0K(this.A04, c44n.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C44O
    public final int AdZ() {
        return this.A00;
    }

    @Override // X.C44O
    public final boolean CPZ() {
        return this.A05;
    }

    @Override // X.C44O
    public final Boolean CRS() {
        return this.A01;
    }

    @Override // X.C44O
    public final Boolean CV3() {
        return this.A02;
    }

    @Override // X.C44O
    public final Boolean CX3() {
        return this.A03;
    }

    @Override // X.C44O
    public final Boolean Cdv() {
        return this.A04;
    }

    @Override // X.C44O
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreatorBroadcastChatThreadPreviewResponse", AbstractC31533DtI.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = this.A00 * 31;
        int i2 = 1237;
        if (this.A05) {
            i2 = 1231;
        }
        int i3 = (i + i2) * 31;
        Boolean bool = this.A01;
        int i4 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        Boolean bool2 = this.A02;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        Boolean bool3 = this.A03;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        Boolean bool4 = this.A04;
        if (bool4 != null) {
            i4 = bool4.hashCode();
        }
        return i7 + i4;
    }

    public C44N(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, boolean z) {
        this.A00 = i;
        this.A05 = z;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A04 = bool4;
    }
}
