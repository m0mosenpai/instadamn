package X;

/* loaded from: classes11.dex */
public final class UtY extends AbstractC53312cF {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public UtY(String str, String str2, int i, int i2, boolean z) {
        super(EnumC53322cG.A0L);
        this.A03 = str;
        this.A04 = z;
        this.A00 = i;
        this.A02 = z ? str2 : null;
        this.A01 = z ? i2 : -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC50523MSb.A1N("videoId=", this.A03, sb);
        sb.append(AnonymousClass001.A1D(", isSucceeded=", this.A04));
        sb.append(AnonymousClass001.A0O(", invalidResponseCode=", this.A00));
        String str = this.A02;
        if (str != null) {
            AbstractC50523MSb.A1N(", loapStreamId=", str, sb);
            sb.append(AnonymousClass001.A0O(", loapStreamType=", this.A01));
        }
        return sb.toString();
    }
}
