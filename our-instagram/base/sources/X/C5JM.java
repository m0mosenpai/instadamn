package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5JM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5JM extends C0T6 implements C5JN {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;

    @Override // X.C5JN
    public final C5JM F3Y() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5JM) {
                C5JM c5jm = (C5JM) obj;
                if (!C14360o3.A0K(this.A04, c5jm.A04) || !C14360o3.A0K(this.A00, c5jm.A00) || !C14360o3.A0K(this.A01, c5jm.A01) || !C14360o3.A0K(this.A02, c5jm.A02) || !C14360o3.A0K(this.A03, c5jm.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A00;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.A01;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A02;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A03;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // X.C5JN
    public final String B0M() {
        return this.A04;
    }

    @Override // X.C5JN
    public final Integer BPw() {
        return this.A01;
    }

    @Override // X.C5JN
    public final Integer BPx() {
        return this.A02;
    }

    @Override // X.C5JN
    public final Integer BXe() {
        return this.A03;
    }

    @Override // X.C5JN
    public final Boolean CSv() {
        return this.A00;
    }

    @Override // X.C5JN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserAddressEditingConfigDict", AbstractC33769Evv.A00(this));
    }

    public C5JM(Boolean bool, Integer num, Integer num2, Integer num3, String str) {
        this.A04 = str;
        this.A00 = bool;
        this.A01 = num;
        this.A02 = num2;
        this.A03 = num3;
    }
}
