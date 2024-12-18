package X;

/* renamed from: X.Jyu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45154Jyu extends C0T6 implements InterfaceC50387MMp {
    public final EnumC61185Rgl A00;
    public final String A01;
    public final String A02 = "iap_funding_failure";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45154Jyu) {
                C45154Jyu c45154Jyu = (C45154Jyu) obj;
                if (this.A00 != c45154Jyu.A00 || !C14360o3.A0K(this.A02, c45154Jyu.A02) || !C14360o3.A0K(this.A01, c45154Jyu.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C45154Jyu(EnumC61185Rgl enumC61185Rgl, String str) {
        this.A00 = enumC61185Rgl;
        this.A01 = str;
    }

    public final int hashCode() {
        return (AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A00)) * 31) + AbstractC25227BEk.A07(this.A01);
    }
}
