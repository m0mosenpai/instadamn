package X;

/* loaded from: classes11.dex */
public final class UN1 extends AbstractC69517Vqg {
    public final Integer A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UN1) {
                UN1 un1 = (UN1) obj;
                if (!C14360o3.A0K(this.A01, un1.A01) || !C14360o3.A0K(this.A00, un1.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public UN1(String str, Integer num) {
        super(AnonymousClass001.A0S("Unmodified(reason='", str, '\''));
        this.A01 = str;
        this.A00 = num;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + AbstractC167017dG.A0M(this.A00);
    }

    @Override // X.AbstractC69517Vqg
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Unmodified(reason=");
        sb.append(this.A01);
        sb.append(", bestAllowlistedSize=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
