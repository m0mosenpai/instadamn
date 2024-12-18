package X;

/* renamed from: X.Vv6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69769Vv6 {
    public final int A00;
    public final AbstractC68256VJt A01;
    public final Object A02;
    public final Throwable A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C69769Vv6 c69769Vv6 = (C69769Vv6) obj;
            if (this.A04 == c69769Vv6.A04 && this.A00 == c69769Vv6.A00) {
                return this.A02.equals(c69769Vv6.A02);
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.A04 ? 1 : 0) * 31) + this.A00) * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PresenterStateHolder{mValue=");
        sb.append(this.A02);
        sb.append(", mLoading=");
        sb.append(this.A04);
        sb.append(", mError=");
        return AbstractC58320PtC.A11(this.A03, sb);
    }

    public C69769Vv6(AbstractC68256VJt abstractC68256VJt, Object obj, Throwable th, boolean z) {
        this.A04 = z;
        this.A03 = th;
        if (th != null) {
            r1 = th.getMessage() != null ? 0 + th.getMessage().hashCode() : 0;
            if (th.getLocalizedMessage() != null) {
                r1 += th.getLocalizedMessage().hashCode();
            }
        }
        this.A00 = r1;
        this.A02 = obj;
        this.A01 = abstractC68256VJt;
    }
}
