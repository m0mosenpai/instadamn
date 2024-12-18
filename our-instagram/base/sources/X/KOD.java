package X;

import java.util.Map;

/* loaded from: classes8.dex */
public class KOD extends ABN {
    public final C1OW A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public KOD(C1OW c1ow, C114675Fx c114675Fx, Integer num, Long l, String str, String str2, String str3) {
        super(num, str3);
        String str4;
        this.A01 = l;
        this.A00 = c1ow;
        this.A04 = str;
        this.A05 = str2;
        if (c114675Fx != null) {
            str4 = c114675Fx.A03;
        } else {
            str4 = null;
        }
        this.A02 = str4;
        this.A03 = c114675Fx != null ? c114675Fx.A04 : null;
    }

    @Override // X.ABN
    public String A00() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        Long l = this.A01;
        if (l != null) {
            long longValue = l.longValue();
            A1C.append("threadJid=");
            A1C.append(longValue);
        }
        C1OW c1ow = this.A00;
        if (c1ow != null) {
            A1C.append(" mutationId=");
            A1C.append(c1ow.A05);
            A1C.append(" mutation=");
            Class<?> cls = c1ow.getClass();
            Map map = C0YZ.A03;
            C14360o3.A0B(cls, 1);
            A1C.append(AbstractC13230m9.A01(cls));
        }
        String str = this.A04;
        if (str != null) {
            A1C.append(" recipientIgId=");
            A1C.append(str);
        }
        String str2 = this.A05;
        if (str2 != null) {
            A1C.append(" threadIgId=");
            A1C.append(str2);
        }
        String str3 = this.A02;
        if (str3 != null) {
            A1C.append(" errorCode=");
            A1C.append(str3);
        }
        String str4 = this.A03;
        if (str4 != null) {
            A1C.append(" errorMessage=");
            A1C.append(str4);
        }
        String str5 = super.A02;
        if (str5 != null) {
            A1C.append(" oneTraceId=");
            A1C.append(str5);
        }
        return AbstractC166987dD.A19(A1C);
    }
}
