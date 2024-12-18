package X;

/* renamed from: X.Vuy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69761Vuy {
    public final AbstractC68256VJt A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    public C69761Vuy(AbstractC68256VJt abstractC68256VJt, Object obj, Throwable th, boolean z) {
        String localizedMessage;
        String str = null;
        if (th != null && ((((localizedMessage = th.getLocalizedMessage()) != null && !localizedMessage.isEmpty()) || (localizedMessage = th.getMessage()) != null) && !localizedMessage.isEmpty())) {
            str = localizedMessage;
        }
        this.A03 = z;
        this.A02 = str;
        this.A01 = obj;
        this.A00 = abstractC68256VJt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C69761Vuy c69761Vuy = (C69761Vuy) obj;
            if (this.A03 == c69761Vuy.A03) {
                String str = this.A02;
                String str2 = c69761Vuy.A02;
                if (str == null ? str2 == null : str.equals(str2)) {
                    return this.A01.equals(c69761Vuy.A01);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.A03 ? 1 : 0) * 31) + AbstractC31177DnL.A04(this.A02)) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ViewModelHolder{mValue=");
        sb.append(this.A01);
        sb.append(", mLoading=");
        sb.append(this.A03);
        sb.append(", mErrorMessage='");
        AbstractC58319PtB.A1K(sb, this.A02);
        return AbstractC167027dH.A0R(sb);
    }
}
