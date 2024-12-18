package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes12.dex */
public final class XS0 extends YA6 {
    public final C72750XmR A00;
    public final C72750XmR A01;
    public final C72751XmS A02;
    public final Map A03;
    public final WFT[] A04;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.XmU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.Xll] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.Xll] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.Xlk] */
    public XS0(C69495VoJ c69495VoJ, OMZ omz, YOn yOn, XS2 xs2, C12320ka c12320ka) {
        super(omz, yOn, xs2);
        C73306Xzx c73306Xzx = xs2.A00;
        if (c73306Xzx != null) {
            this.A00 = Y4J.A00(c69495VoJ, c12320ka, Collections.singletonList(c73306Xzx));
            this.A01 = null;
            String str = xs2.A01;
            ?? obj = new Object();
            obj.A02 = str;
            obj.A01 = "DUMMY_PARAM_NAME";
            C72751XmS A01 = Y4J.A01(Collections.singletonList(obj));
            this.A02 = A01;
            String str2 = xs2.A02;
            ?? obj2 = new Object();
            obj2.A00 = "DUMMY_PARAM_NAME";
            obj2.A01 = str2;
            WFT[] A03 = Y4J.A03(A01, Collections.singletonList(obj2));
            this.A04 = A03;
            List<C72714Xlm> list = xs2.A03;
            if (list != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                for (C72714Xlm c72714Xlm : list) {
                    ?? obj3 = new Object();
                    obj3.A00 = c72714Xlm.A00;
                    ArrayList A17 = AbstractC25225BEi.A17(1);
                    obj3.A01 = A17;
                    ?? obj4 = new Object();
                    obj4.A01 = c72714Xlm.A01;
                    obj4.A00 = "DUMMY_PARAM_NAME";
                    A17.add(obj4);
                    A1E.add(obj3);
                }
                this.A03 = Y4J.A02(A01, A1E, A03);
                return;
            }
            throw new Exception("Missing table");
        }
        throw new Exception("Missing context in config");
    }

    @Override // X.InterfaceC58193Pqz
    public final C54504O6h EK7(C72772Xmp c72772Xmp) {
        WFT[] wftArr;
        String str;
        C72750XmR c72750XmR = this.A00;
        WFT[] A00 = AbstractC72542XgB.A00(c72750XmR, c72772Xmp);
        int i = c72750XmR.A00;
        C72674Xkt[] c72674XktArr = c72750XmR.A01;
        String[] strArr = new String[i];
        int i2 = 0;
        while (true) {
            wftArr = null;
            if (i2 >= i) {
                break;
            }
            WFT wft = A00[i2];
            if (wft != null) {
                List<YOm> list = c72674XktArr[i2].A00;
                if (list.isEmpty()) {
                    str = wft.toString().toLowerCase(Locale.US);
                } else {
                    for (YOm yOm : list) {
                        if (yOm.Cne(wft)) {
                            str = yOm.getName();
                        }
                    }
                }
                if (str != null) {
                    strArr[i2] = str;
                    i2++;
                }
            }
            str = "n/a";
            strArr[i2] = str;
            i2++;
        }
        C72750XmR c72750XmR2 = this.A01;
        if (c72750XmR2 != null) {
            wftArr = AbstractC72542XgB.A00(c72750XmR2, c72772Xmp);
        }
        WFT[] wftArr2 = (WFT[]) this.A03.get(TextUtils.join(", ", strArr));
        if (wftArr2 == null) {
            wftArr2 = this.A04;
        }
        this.A06.ECX(this, A00, wftArr, wftArr2, strArr, super.A00);
        return new C54504O6h(this, wftArr2);
    }

    @Override // X.InterfaceC58193Pqz
    public final Y0y[] ArL() {
        return this.A00.A02;
    }

    @Override // X.InterfaceC58193Pqz
    public final Y0y[] BUn() {
        C72750XmR c72750XmR = this.A01;
        if (c72750XmR != null) {
            return c72750XmR.A02;
        }
        return null;
    }

    @Override // X.InterfaceC58193Pqz
    public final int BbD(String str) {
        Number A0Q = AbstractC37300Gc1.A0Q("min_bitrate", this.A02.A01);
        if (A0Q == null) {
            return -1;
        }
        return A0Q.intValue();
    }

    public XS0(C69495VoJ c69495VoJ, OMZ omz, YOn yOn, XS4 xs4, C12320ka c12320ka) {
        super(omz, yOn, xs4);
        C72750XmR c72750XmR;
        this.A00 = Y4J.A00(c69495VoJ, c12320ka, xs4.A00);
        List list = xs4.A02;
        if (list != null && !list.isEmpty()) {
            c72750XmR = Y4J.A00(c69495VoJ, c12320ka, xs4.A02);
        } else {
            c72750XmR = null;
        }
        this.A01 = c72750XmR;
        C72751XmS A01 = Y4J.A01(xs4.A03);
        this.A02 = A01;
        WFT[] A03 = Y4J.A03(A01, xs4.A01);
        this.A04 = A03;
        this.A03 = Y4J.A02(A01, xs4.A04, A03);
    }
}
