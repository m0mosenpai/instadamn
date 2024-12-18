package X;

import com.facebook.zero.sdk.staticdeps.json.JsonProvider;
import com.facebook.zero.sdk.staticdeps.uuid.UUIDGenerator;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class XYN extends XXm {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public YD8 A05;
    public YD8 A06;
    public YD8 A07;
    public XYV A08;
    public XYV A09;
    public C72209XYd A0A;
    public XY0 A0B;
    public Xl7 A0C;
    public Y06 A0D;
    public C72761Xmd A0E;
    public Y10 A0F;
    public YDP A0G;
    public YDP A0H;
    public String A0I;
    public String A0J;
    public final YCh A0K = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v60, types: [X.YNu, java.lang.Object] */
    @Override // X.YCO
    public final void A04() {
        Object yd9;
        YD5 yd5;
        Number number;
        int i = super.A00;
        int i2 = 2;
        if (i != 0 && i != 1) {
            int i3 = 4;
            if (i != 2) {
                i2 = 32;
                if (i != 4) {
                    i3 = 82;
                    if (i != 35) {
                        if (i != 82) {
                            if (i != 32) {
                                if (i == 33) {
                                    this.A0H = (YDP) super.A01;
                                    YCO.A00(this, new Object(), 35);
                                    return;
                                }
                                return;
                            }
                            A06(33, this.A07);
                            return;
                        }
                    } else {
                        this.A0F = (Y10) super.A01;
                        this.A03 = 0;
                        this.A00 = 0;
                        YD8 yd8 = new YD8();
                        this.A05 = yd8;
                        this.A01 = 0;
                        int i4 = 0;
                        YD8 yd82 = yd8;
                        while (true) {
                            YDP ydp = this.A0H;
                            if (i4 < ydp.A00.size()) {
                                C72209XYd c72209XYd = (C72209XYd) ydp.A00.get(i4);
                                this.A0A = c72209XYd;
                                this.A08 = (XYV) ((AbstractC72210XYe) c72209XYd).A00;
                                if (c72209XYd.A03) {
                                    this.A03++;
                                } else {
                                    this.A00++;
                                }
                                String str = c72209XYd.A02;
                                if (str != null) {
                                    if (str.startsWith("for (;;);")) {
                                        str.substring(9);
                                    }
                                    try {
                                        JsonProvider.get();
                                        throw AbstractC166987dD.A15("parseStrict");
                                        break;
                                    } catch (IOException unused) {
                                    }
                                }
                                C72209XYd c72209XYd2 = this.A0A;
                                String str2 = c72209XYd2.A01;
                                if (str2 == null) {
                                    str2 = null;
                                }
                                String str3 = this.A08.A01.A01;
                                int i5 = c72209XYd2.A00;
                                boolean z = c72209XYd2.A03;
                                YD8 yd83 = this.A05;
                                YCO.A02(yd83, new XYA(str3, str3, str2, i5, z));
                                i4 = this.A01 + 1;
                                this.A01 = i4;
                                yd82 = yd83;
                            } else {
                                int i6 = this.A00;
                                int i7 = this.A03;
                                int i8 = this.A02;
                                YCO.A02(yd82, new XY9(C05F.A01, i7 + i6 + i8, i6, i7, i8));
                                yd5 = yd82;
                                break;
                            }
                        }
                    }
                } else {
                    Y06 y06 = (Y06) super.A01;
                    this.A0D = y06;
                    if (y06.A02) {
                        Xl7 xl7 = y06.A00;
                        this.A0C = xl7;
                        if (xl7 != null) {
                            this.A02 = 0;
                            this.A04 = ((AbstractC72503XfI) this.A0B).A00;
                            this.A06 = new YD8();
                            this.A07 = new YD8();
                            this.A0G = new YDP(xl7.A00);
                            this.A0I = UUIDGenerator.uuid();
                            this.A01 = 0;
                            int i9 = 0;
                            while (true) {
                                YDP ydp2 = this.A0G;
                                if (i9 >= ydp2.A00.size()) {
                                    break;
                                }
                                this.A0E = (C72761Xmd) ydp2.A00.get(i9);
                                this.A0J = UUIDGenerator.uuid();
                                C72761Xmd c72761Xmd = this.A0E;
                                Y06 y062 = this.A0D;
                                long j = this.A04;
                                if (this.A0B.A00 != C05F.A0N && (number = (Number) new HashMap(y062.A01.A00).get(c72761Xmd.A01)) != null && j - number.longValue() <= c72761Xmd.A00 * 1000) {
                                    this.A02++;
                                } else {
                                    XYV xyv = new XYV(this.A0E, this.A0I, this.A0J, this.A04);
                                    this.A09 = xyv;
                                    YCO.A02(this.A06, xyv);
                                    YD8 yd84 = this.A07;
                                    yd84.A02.A00(new YD9(new YDH(this, xyv, C72209XYd.class)));
                                    yd84.A03.A00(null);
                                }
                                i9 = this.A01 + 1;
                                this.A01 = i9;
                            }
                            yd9 = this.A06;
                        }
                    }
                }
                A05(1);
                return;
            }
            this.A0B = (XY0) super.A01;
            yd5 = new YD5(this.A0K);
            A06(i3, yd5);
            return;
        }
        yd9 = new YD9(XY0.class);
        A06(i2, yd9);
    }
}
