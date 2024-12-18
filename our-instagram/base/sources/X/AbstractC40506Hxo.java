package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Hxo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40506Hxo {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC65855TvH enumC65855TvH;
        EnumC39619HeT enumC39619HeT;
        InterfaceC11380iw A0D;
        Map map;
        String str;
        String str2;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        String str3 = "";
        String A0G = c102884kP.A0G();
        if (A0G != null) {
            str3 = A0G;
        }
        VG2 A00 = VXS.A00(C6BQ.A0G(AbstractC37301Gc2.A0b(c102884kP, 40)));
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.intf.FRXObjectType");
        String A0G2 = C6BQ.A0G(AbstractC37301Gc2.A0b(c102884kP, 38));
        EnumC65855TvH[] values = EnumC65855TvH.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC65855TvH = values[i];
                if (C14360o3.A0K(enumC65855TvH.A00, A0G2)) {
                    break;
                }
                i++;
            } else {
                enumC65855TvH = null;
                break;
            }
        }
        C14360o3.A0C(enumC65855TvH, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.intf.FRXLocation");
        String A0G3 = C6BQ.A0G(AbstractC37301Gc2.A0b(c102884kP, 35));
        EnumC39619HeT[] values2 = EnumC39619HeT.values();
        int length2 = values2.length;
        int i2 = 0;
        while (true) {
            if (i2 < length2) {
                enumC39619HeT = values2[i2];
                if (C14360o3.A0K(enumC39619HeT.A00, A0G3)) {
                    break;
                }
                i2++;
            } else {
                enumC39619HeT = null;
                break;
            }
        }
        C14360o3.A0C(enumC39619HeT, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.intf.FRXEntryPoint");
        boolean A0S = c102884kP.A0S(44, false);
        InterfaceC103384lE A0B = c102884kP.A0B(41);
        String A0H = c102884kP.A0H();
        if (A0H == null) {
            A0D = C6BQ.A08(c6fq);
        } else {
            A0D = AbstractC31171DnF.A0D(A0H);
        }
        Object A002 = C102884kP.A00(c102884kP, 43);
        if (A002 instanceof Map) {
            map = (Map) A002;
        } else {
            map = null;
        }
        WEz A01 = AbstractC69993VzD.A01(C6BQ.A04(c6fq), A0D, AbstractC31172DnG.A0W(c6fq), enumC65855TvH, A00, str3);
        A01.A07(enumC39619HeT);
        if (map != null) {
            ArrayList A17 = AbstractC25225BEi.A17(map.size());
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                Object key = A1K.getKey();
                Object value = A1K.getValue();
                if (key == null || (str = key.toString()) == null) {
                    str = "";
                }
                if (value == null || (str2 = value.toString()) == null) {
                    str2 = "";
                }
                A01.A09(str, str2);
                A17.add(A01);
            }
        }
        if (A0B != null) {
            A01.A08(new C53024Ncw(0, A0B, c6fq));
        }
        if (A0S) {
            A01.A0E = true;
            WEz.A00(null, A01);
            return null;
        }
        WEz.A00(null, A01);
        return null;
    }
}
