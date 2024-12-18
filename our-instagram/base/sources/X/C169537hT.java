package X;

/* renamed from: X.7hT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169537hT extends AbstractC166097bd {
    public final EnumC76383bi A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169537hT) {
                C169537hT c169537hT = (C169537hT) obj;
                if (this.A02 != c169537hT.A02 || !C14360o3.A0K(this.A01, c169537hT.A01) || this.A00 != c169537hT.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public C169537hT(EnumC76383bi enumC76383bi, String str, boolean z) {
        super(AnonymousClass001.A1A("audience_disclosure_banner_row", str, enumC76383bi.name(), z));
        this.A02 = z;
        this.A01 = str;
        this.A00 = enumC76383bi;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return (((i * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }
}
