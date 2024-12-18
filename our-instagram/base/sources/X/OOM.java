package X;

import com.instagram.music.common.model.MusicAssetBeatInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class OOM {
    public static final List A01(List list, int i) {
        ArrayList A0i;
        C14360o3.A0B(list, 0);
        if (AbstractC001800i.A02(list) <= i) {
            A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0i.add(new OLX(0, AbstractC167007dF.A0B(it)));
            }
        } else {
            int size = list.size();
            ArrayList A17 = AbstractC25225BEi.A17(size);
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC166997dE.A1W(A17, 0);
            }
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            Iterator it2 = AbstractC001800i.A0p(list).iterator();
            while (it2.hasNext()) {
                C0eP c0eP = (C0eP) it2.next();
                A1I.put(Integer.valueOf(c0eP.A00), c0eP.A01);
            }
            while (MSW.A1b(A1I) && i / A1I.size() > 0) {
                int size2 = i / A1I.size();
                Iterator A14 = AbstractC166997dE.A14(A1I);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    int A0H = AbstractC166987dD.A0H(A1K.getKey());
                    int A0H2 = AbstractC166987dD.A0H(A1K.getValue());
                    int min = Math.min(size2, A0H2);
                    A17.set(A0H, Integer.valueOf(AbstractC166987dD.A0H(A17.get(A0H)) + min));
                    i -= min;
                    int i3 = A0H2 - min;
                    if (i3 > 0) {
                        AbstractC37301Gc2.A1T(Integer.valueOf(A0H), A1I, i3);
                    } else {
                        A14.remove();
                    }
                }
            }
            A0i = AbstractC167007dF.A0i(A17);
            Iterator it3 = A17.iterator();
            while (it3.hasNext()) {
                A0i.add(new OLX(0, AbstractC167007dF.A0B(it3)));
            }
        }
        return A0i;
    }

    public static ArrayList A00(List list, List list2, int i, int i2) {
        ArrayList A0i;
        OLY oly;
        MusicAssetBeatInfo musicAssetBeatInfo;
        EnumC53179Nfb enumC53179Nfb;
        C14360o3.A0B(list, 0);
        if (list.size() == 1) {
            A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0i.add(new OLX(0, Math.min(AbstractC167007dF.A0B(it), i2)));
            }
        } else {
            int i3 = i2 + i;
            int i4 = 0;
            while (i4 < list2.size() && i >= ((MusicAssetBeatInfo) list2.get(i4)).A00) {
                i4++;
            }
            OLY oly2 = new OLY(i, i4);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            A1I.put(oly2, AbstractC166987dD.A1L(new C56834PKe(0), AbstractC166987dD.A1E()));
            ArrayList A0i2 = AbstractC167007dF.A0i(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int A0B = AbstractC167007dF.A0B(it2);
                LinkedHashMap A1I2 = AbstractC166987dD.A1I();
                Iterator A14 = AbstractC166997dE.A14(A1I);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    int i5 = ((OLY) A1K.getKey()).A00;
                    C56834PKe c56834PKe = (C56834PKe) ((C09530e4) A1K.getValue()).A00;
                    Collection collection = (Collection) ((C09530e4) A1K.getValue()).A01;
                    int size = list2.size();
                    for (int i6 = ((OLY) A1K.getKey()).A01; i6 < size; i6++) {
                        int min = Math.min(((MusicAssetBeatInfo) list2.get(i6)).A00, i3);
                        int i7 = min - i5;
                        if (i7 >= 1000) {
                            C56834PKe c56834PKe2 = new C56834PKe(c56834PKe.A00);
                            int[] iArr = c56834PKe.A01;
                            int[] iArr2 = c56834PKe2.A01;
                            AbstractC06960Yn.A0U(iArr, iArr2, 0, 0, iArr.length);
                            ArrayList A0U = AbstractC001800i.A0U(collection);
                            if (A0B >= i7) {
                                AbstractC166997dE.A1W(A0U, i7);
                                if (min == ((MusicAssetBeatInfo) list2.get(i6)).A00) {
                                    musicAssetBeatInfo = (MusicAssetBeatInfo) list2.get(i6);
                                } else {
                                    musicAssetBeatInfo = null;
                                }
                                c56834PKe2.A00 += i7;
                                if (musicAssetBeatInfo != null) {
                                    boolean z = musicAssetBeatInfo.A04;
                                    if (z && musicAssetBeatInfo.A01 && musicAssetBeatInfo.A02) {
                                        enumC53179Nfb = EnumC53179Nfb.A08;
                                    } else {
                                        boolean z2 = musicAssetBeatInfo.A02;
                                        if (z) {
                                            if (z2) {
                                                enumC53179Nfb = EnumC53179Nfb.A07;
                                            } else if (musicAssetBeatInfo.A01) {
                                                enumC53179Nfb = EnumC53179Nfb.A06;
                                            } else {
                                                enumC53179Nfb = EnumC53179Nfb.A05;
                                            }
                                        } else if (z2) {
                                            enumC53179Nfb = EnumC53179Nfb.A03;
                                        } else if (musicAssetBeatInfo.A01) {
                                            enumC53179Nfb = EnumC53179Nfb.A02;
                                        } else {
                                            enumC53179Nfb = EnumC53179Nfb.A04;
                                        }
                                    }
                                    int ordinal = enumC53179Nfb.ordinal();
                                    iArr2[ordinal] = iArr2[ordinal] + 1;
                                }
                                oly = new OLY(min, i6 + 1);
                            } else {
                                AbstractC166997dE.A1W(A0U, A0B);
                                c56834PKe2.A00 += A0B;
                                oly = new OLY(i5 + A0B, i6);
                            }
                            if (oly.A00 <= i3 && (!A1I2.containsKey(oly) || c56834PKe2.compareTo((C56834PKe) ((C09530e4) AbstractC06930Yk.A01(oly, A1I2)).A00) > 0)) {
                                A1I2.put(oly, AbstractC166987dD.A1L(c56834PKe2, A0U));
                            }
                            if (A0B > i7 && min < i3) {
                            }
                        }
                    }
                }
                A0i2.add(C0eB.A00);
                A1I = A1I2;
            }
            Iterator A142 = AbstractC166997dE.A14(A1I);
            C56834PKe c56834PKe3 = new C56834PKe(0);
            List list3 = C16930sl.A00;
            while (A142.hasNext()) {
                Map.Entry A1K2 = AbstractC166987dD.A1K(A142);
                if (((C56834PKe) ((C09530e4) A1K2.getValue()).A00).compareTo(c56834PKe3) >= 0) {
                    c56834PKe3 = (C56834PKe) ((C09530e4) A1K2.getValue()).A00;
                    list3 = (List) ((C09530e4) A1K2.getValue()).A01;
                }
            }
            A0i = AbstractC167007dF.A0i(list3);
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                A0i.add(new OLX(0, AbstractC167007dF.A0B(it3)));
            }
        }
        return A0i;
    }
}
