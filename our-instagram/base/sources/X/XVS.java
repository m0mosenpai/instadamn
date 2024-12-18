package X;

import java.util.Map;

/* loaded from: classes12.dex */
public final class XVS extends C0T6 {
    public final long A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Map A08;

    public XVS(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map, long j) {
        AbstractC167027dH.A0a(1, str, str2, map, str3);
        this.A03 = str;
        this.A02 = str2;
        this.A08 = map;
        this.A04 = str3;
        this.A00 = j;
        this.A06 = str4;
        this.A07 = str5;
        this.A05 = str6;
        this.A01 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AFILoggingInfo(afiId=");
        A1C.append(this.A03);
        A1C.append(AbstractC111324zv.A00(1391));
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(1414));
        A1C.append(this.A08);
        A1C.append(AbstractC111324zv.A00(1393));
        A1C.append(this.A04);
        A1C.append(AbstractC111324zv.A00(1417));
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(282));
        A1C.append(this.A06);
        A1C.append(AbstractC111324zv.A00(1462));
        A1C.append(this.A07);
        A1C.append(AbstractC111324zv.A00(1396));
        A1C.append(this.A05);
        A1C.append(AbstractC111324zv.A00(1392));
        Integer num = this.A01;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str = "RESPONSE";
            } else {
                str = "UNDO";
            }
        } else {
            str = "null";
        }
        return AbstractC25236BEt.A0Y(str, A1C);
    }
}
