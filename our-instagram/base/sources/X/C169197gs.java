package X;

/* renamed from: X.7gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169197gs extends AbstractC166097bd {
    public final String A00;
    public final boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C169197gs(String str, boolean z) {
        super(AnonymousClass001.A0R("xar_disclosure_banner_row", str));
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169197gs) {
                C169197gs c169197gs = (C169197gs) obj;
                if (!C14360o3.A0K(this.A00, c169197gs.A00) || this.A01 != c169197gs.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
