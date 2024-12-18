package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vqf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69516Vqf {
    public final XG2 A00;

    public final boolean A03(WFa wFa, long j) {
        int i;
        int i2;
        XG2 xg2;
        if (this instanceof C66406UFr) {
            C66406UFr c66406UFr = (C66406UFr) this;
            int A05 = wFa.A05();
            byte[] bArr = wFa.A02;
            int i3 = wFa.A01;
            int i4 = i3 + 1;
            int i5 = (((bArr[i3] & 255) << 24) >> 8) | ((bArr[i4] & 255) << 8);
            int i6 = i4 + 1 + 1;
            wFa.A01 = i6;
            long j2 = j + (((bArr[r2] & 255) | i5) * 1000);
            if (A05 == 0) {
                if (!c66406UFr.A02) {
                    WFa wFa2 = new WFa(new byte[wFa.A00 - i6]);
                    wFa.A0R(wFa2.A02, 0, wFa.A00 - i6);
                    W3B A00 = W3B.A00(wFa2);
                    c66406UFr.A01 = A00.A08;
                    C70116W4o c70116W4o = new C70116W4o();
                    c70116W4o.A00("video/avc");
                    c70116W4o.A0R = A00.A0A;
                    c70116W4o.A0L = A00.A09;
                    c70116W4o.A09 = A00.A06;
                    c70116W4o.A01 = A00.A00;
                    c70116W4o.A0X = A00.A0B;
                    ((AbstractC69516Vqf) c66406UFr).A00.AWZ(new C70130W5r(c70116W4o));
                    c66406UFr.A02 = true;
                }
            } else if (A05 == 1 && c66406UFr.A02) {
                boolean A1P = AbstractC167007dF.A1P(c66406UFr.A00, 1);
                if (c66406UFr.A03 || A1P) {
                    WFa wFa3 = c66406UFr.A04;
                    byte[] bArr2 = wFa3.A02;
                    bArr2[0] = 0;
                    bArr2[1] = 0;
                    bArr2[2] = 0;
                    int i7 = 4 - c66406UFr.A01;
                    int i8 = 0;
                    while (wFa.A00 - wFa.A01 > 0) {
                        wFa.A0R(wFa3.A02, i7, c66406UFr.A01);
                        wFa3.A0O(0);
                        int A07 = wFa3.A07();
                        WFa wFa4 = c66406UFr.A05;
                        wFa4.A0O(0);
                        XG2 xg22 = ((AbstractC69516Vqf) c66406UFr).A00;
                        xg22.ELL(wFa4, 4);
                        xg22.ELL(wFa, A07);
                        i8 = i8 + 4 + A07;
                    }
                    ((AbstractC69516Vqf) c66406UFr).A00.ELS(null, A1P ? 1 : 0, i8, 0, j2);
                    c66406UFr.A03 = true;
                    return true;
                }
            }
        } else {
            if (this instanceof C66407UFs) {
                C66407UFs c66407UFs = (C66407UFs) this;
                if (wFa.A05() != 2 || !"onMetaData".equals(C66407UFs.A01(wFa)) || wFa.A00 - wFa.A01 == 0 || wFa.A05() != 8) {
                    return false;
                }
                HashMap A02 = C66407UFs.A02(wFa);
                Object obj = A02.get("duration");
                if (obj instanceof Double) {
                    double doubleValue = ((Number) obj).doubleValue();
                    if (doubleValue > 0.0d) {
                        c66407UFs.A00 = (long) (doubleValue * 1000000.0d);
                    }
                }
                Object obj2 = A02.get("keyframes");
                if (!(obj2 instanceof Map)) {
                    return false;
                }
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if (!(obj3 instanceof List) || !(obj4 instanceof List)) {
                    return false;
                }
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                c66407UFs.A02 = new long[size];
                c66407UFs.A01 = new long[size];
                for (int i9 = 0; i9 < size; i9++) {
                    Object obj5 = list.get(i9);
                    Object obj6 = list2.get(i9);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        c66407UFs.A02[i9] = (long) (((Number) obj6).doubleValue() * 1000000.0d);
                        c66407UFs.A01[i9] = ((Number) obj5).longValue();
                    } else {
                        c66407UFs.A02 = new long[0];
                        c66407UFs.A01 = new long[0];
                        return false;
                    }
                }
                return false;
            }
            C66405UFq c66405UFq = (C66405UFq) this;
            int i10 = c66405UFq.A00;
            if (i10 == 2) {
                i2 = wFa.A00 - wFa.A01;
                xg2 = ((AbstractC69516Vqf) c66405UFq).A00;
                xg2.ELL(wFa, i2);
                i = 0;
            } else {
                int A052 = wFa.A05();
                i = 0;
                if (A052 == 0 && !c66405UFq.A01) {
                    int i11 = wFa.A00 - wFa.A01;
                    byte[] bArr3 = new byte[i11];
                    wFa.A0R(bArr3, 0, i11);
                    C69034Vgb A01 = W8a.A01(new WFZ(bArr3), false);
                    C70116W4o c70116W4o2 = new C70116W4o();
                    c70116W4o2.A00("audio/mp4a-latm");
                    c70116W4o2.A0R = A01.A02;
                    c70116W4o2.A04 = A01.A00;
                    c70116W4o2.A0G = A01.A01;
                    c70116W4o2.A0X = Collections.singletonList(bArr3);
                    ((AbstractC69516Vqf) c66405UFq).A00.AWZ(new C70130W5r(c70116W4o2));
                    c66405UFq.A01 = true;
                } else if (i10 != 10 || A052 == 1) {
                    i2 = wFa.A00 - wFa.A01;
                    xg2 = ((AbstractC69516Vqf) c66405UFq).A00;
                    xg2.ELL(wFa, i2);
                }
            }
            xg2.ELS(null, 1, i2, i, j);
            return true;
        }
        return false;
    }

    public AbstractC69516Vqf(XG2 xg2) {
        this.A00 = xg2;
    }
}
