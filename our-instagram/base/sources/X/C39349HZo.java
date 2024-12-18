package X;

/* renamed from: X.HZo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39349HZo extends IN1 {
    public final C38321qM A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39349HZo(C38321qM c38321qM, String str) {
        super(new C41630IbL(c38321qM), C05F.A0Y, str, "catalog_video", c38321qM.A0m());
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = c38321qM;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39349HZo) {
                C39349HZo c39349HZo = (C39349HZo) obj;
                if (!C14360o3.A0K(this.A01, c39349HZo.A01) || !C14360o3.A0K(this.A00, c39349HZo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }
}
