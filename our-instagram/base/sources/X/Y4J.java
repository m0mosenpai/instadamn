package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes12.dex */
public abstract class Y4J {
    public static C72750XmR A00(C69495VoJ c69495VoJ, C12320ka c12320ka, List list) {
        Y0y y0y;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            Y0y[] y0yArr = new Y0y[size];
            C72674Xkt[] c72674XktArr = new C72674Xkt[size];
            int i = 0;
            StringBuilder A1C = AbstractC166987dD.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C73306Xzx c73306Xzx = (C73306Xzx) it.next();
                String A00 = WFT.A00(c73306Xzx.A02);
                String str = c73306Xzx.A00;
                if (str != null && A00 != null) {
                    C72674Xkt c72674Xkt = new C72674Xkt();
                    List<C72752XmT> list2 = c73306Xzx.A03;
                    if (list2 != null) {
                        for (C72752XmT c72752XmT : list2) {
                            c72674Xkt.A00.add(c69495VoJ.A00(c72752XmT.A00, c72752XmT.A01, c72752XmT.A02));
                        }
                    }
                    c72674XktArr[i] = c72674Xkt;
                    String str2 = c73306Xzx.A01;
                    if (str2 != null && !str2.isEmpty()) {
                        y0y = new Y0y(new WFT(A00, str2), c73306Xzx.A00);
                    } else {
                        y0y = new Y0y(c12320ka, c73306Xzx.A00);
                    }
                    y0yArr[i] = y0y;
                    if (i > 0) {
                        A1C.append(", ");
                    }
                    A1C.append(c73306Xzx.A00);
                    i++;
                } else {
                    throw new VI3("Bad context identifier", str);
                }
            }
            A1C.toString();
            return new C72750XmR(c72674XktArr, y0yArr);
        }
        throw new Exception("Missing context in config");
    }

    public static C72751XmS A01(List list) {
        String str;
        if (list != null && list.size() != 0) {
            int size = list.size();
            String[] strArr = new String[size];
            HashMap A0g = AbstractC72046XLm.A0g(size);
            int i = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C72753XmU c72753XmU = (C72753XmU) it.next();
                String str2 = c72753XmU.A02;
                if (str2 != null && (str = c72753XmU.A01) != null) {
                    strArr[i] = WFT.A00(str2);
                    A0g.put(str, Integer.valueOf(i));
                    if (strArr[i] != null) {
                        i++;
                    } else {
                        throw new VI3("Bad output type", c72753XmU.A02);
                    }
                } else {
                    throw new VI3("Missing output field", c72753XmU.A01);
                }
            }
            return new C72751XmS(A0g, strArr);
        }
        throw new Exception("Missing outputs field definition");
    }

    public static WFT[] A03(C72751XmS c72751XmS, List list) {
        int intValue;
        if (list != null) {
            int size = list.size();
            int i = c72751XmS.A00;
            if (size == i) {
                WFT[] wftArr = new WFT[i];
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C72713Xll c72713Xll = (C72713Xll) it.next();
                    Number A0Q = AbstractC37300Gc1.A0Q(c72713Xll.A00, c72751XmS.A01);
                    if (A0Q != null && (intValue = A0Q.intValue()) < i) {
                        wftArr[intValue] = new WFT(c72751XmS.A02[intValue], c72713Xll.A01);
                    } else {
                        throw new VI3("Undeclared output param", c72713Xll.A00);
                    }
                }
                for (int i2 = 0; i2 < i; i2++) {
                    if (wftArr[i2] == null) {
                        throw new Exception("Missing default value");
                    }
                }
                return wftArr;
            }
        }
        throw new Exception("Missing default value");
    }

    public static HashMap A02(C72751XmS c72751XmS, List list, WFT[] wftArr) {
        int intValue;
        HashMap A1G = AbstractC166987dD.A1G();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C72712Xlk c72712Xlk = (C72712Xlk) it.next();
                int i = c72751XmS.A00;
                WFT[] wftArr2 = new WFT[i];
                List<C72713Xll> list2 = c72712Xlk.A01;
                if (list2 != null) {
                    if (c72712Xlk.A00 != null) {
                        for (C72713Xll c72713Xll : list2) {
                            Number A0Q = AbstractC37300Gc1.A0Q(c72713Xll.A00, c72751XmS.A01);
                            if (A0Q != null && (intValue = A0Q.intValue()) < i) {
                                wftArr2[intValue] = new WFT(c72751XmS.A02[intValue], c72713Xll.A01);
                            } else {
                                throw new VI3("Undeclared output param", c72713Xll.A00);
                            }
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            if (wftArr2[i2] == null) {
                                wftArr2[i2] = wftArr[i2];
                            }
                        }
                        A1G.put(c72712Xlk.A00.toLowerCase(Locale.US), wftArr2);
                    } else {
                        throw new Exception("Missing table item bucket");
                    }
                } else {
                    throw new Exception("Missing table item values");
                }
            }
            return A1G;
        }
        throw new Exception("Missing table");
    }
}
