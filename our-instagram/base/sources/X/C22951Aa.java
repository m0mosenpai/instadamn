package X;

/* renamed from: X.1Aa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22951Aa {
    public final AbstractC20080yf A00;

    public final String A00(Integer num) {
        String str;
        StringBuilder sb = new StringBuilder();
        AbstractC20080yf abstractC20080yf = this.A00;
        sb.append(abstractC20080yf.getConfigKey());
        sb.append(':');
        sb.append(C0UM.A00(abstractC20080yf.mobileConfigSpecifier));
        sb.append(':');
        if (num.intValue() != 0) {
            str = "CACHED";
        } else {
            str = "LATEST";
        }
        sb.append(str);
        return sb.toString();
    }

    public C22951Aa(AbstractC20080yf abstractC20080yf) {
        this.A00 = abstractC20080yf;
    }
}
