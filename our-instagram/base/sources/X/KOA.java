package X;

/* loaded from: classes8.dex */
public final class KOA extends ABN {
    public final long A00;
    public final long A01;
    public final long A02;
    public final Integer A03;
    public final String A04;

    public KOA(Integer num, Integer num2, String str, String str2, long j, long j2, long j3) {
        super(num, str2);
        this.A01 = j;
        this.A00 = j2;
        this.A04 = str;
        this.A02 = j3;
        this.A03 = num2;
    }

    @Override // X.ABN
    public final String A00() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("threadJid=");
        A1C.append(this.A01);
        A1C.append(" senderEimuId=");
        A1C.append(this.A00);
        A1C.append(" messageId=");
        A1C.append(this.A04);
        A1C.append(" wa_timestamp=");
        A1C.append(String.valueOf(this.A02));
        Integer num = this.A03;
        if (num != null) {
            int intValue = num.intValue();
            A1C.append(" placeholderType=");
            A1C.append(intValue);
        }
        String str = super.A02;
        if (str != null) {
            A1C.append(" oneTraceId=");
            A1C.append(str);
        }
        return AbstractC166987dD.A19(A1C);
    }
}
