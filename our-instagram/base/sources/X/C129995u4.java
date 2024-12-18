package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.5u4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129995u4 {
    public final C65750TtP A00(InterfaceC138736Qd interfaceC138736Qd, C6PT c6pt, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 1);
        C37416Gdw c37416Gdw = (C37416Gdw) c6pt;
        String str4 = c37416Gdw.A03;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = c37416Gdw.A04;
        if (str5 == null) {
            str5 = "";
        }
        Integer num = null;
        Integer num2 = null;
        String str6 = null;
        String str7 = null;
        Integer num3 = null;
        Integer num4 = null;
        ImmutableList Acw = c6pt.Acw();
        ImmutableList Acy = c6pt.Acy();
        String str8 = c37416Gdw.A02;
        if (str2 != null) {
            str7 = str2;
        }
        if (interfaceC138736Qd != null) {
            C138956Rc c138956Rc = (C138956Rc) interfaceC138736Qd;
            str6 = c138956Rc.A04.EqO();
            num2 = Integer.valueOf(c138956Rc.A01);
            if (z) {
                num = Integer.valueOf(c138956Rc.A00);
                num3 = Integer.valueOf(c138956Rc.A02);
                num4 = Integer.valueOf(c138956Rc.A03);
            }
        }
        return AbstractC65749TtO.A00(num, num2, num3, num4, str8, str4, str5, str6, str7, str, str3, Acw, Acy);
    }

    public final C65750TtP A01(InterfaceC138736Qd interfaceC138736Qd, C6PT c6pt, String str, String str2, boolean z) {
        C14360o3.A0B(str, 1);
        String str3 = ((C37416Gdw) c6pt).A05;
        if (str3 == null) {
            str3 = "";
        }
        return A00(interfaceC138736Qd, c6pt, str, str2, str3, z);
    }
}
