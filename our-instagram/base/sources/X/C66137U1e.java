package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.U1e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66137U1e {
    public final InterfaceC132105xl A01;
    public final InterfaceC190488c6 A02;
    public final InterfaceC72022XFk A03;
    public final XB9 A04;
    public final XB8 A06;
    public final Map A05 = new LinkedHashMap();
    public String A00 = "";

    public final void A00(Tx0 tx0, User user, Integer num, String str, String str2, String str3, String str4, String str5) {
        String str6 = str3;
        String str7 = str2;
        C14360o3.A0B(tx0, 3);
        String E6U = this.A06.E6U();
        Map map = this.A05;
        Object obj = map.get(E6U);
        if (obj == null) {
            obj = new C66168U2j();
            map.put(E6U, obj);
        }
        C66168U2j c66168U2j = (C66168U2j) obj;
        List list = c66168U2j.A01;
        String str8 = tx0.A09;
        list.add(new C66167U2i(user, str, str7, str6, str8, tx0.A08, str4, tx0.A00));
        InterfaceC72022XFk interfaceC72022XFk = this.A03;
        c66168U2j.A00 = interfaceC72022XFk.E6d();
        if (str != null && str.equals("HCM_THREADS")) {
            this.A01.CmJ(null, null, null, null, null, null, tx0.A0A, E6U, tx0.A07, tx0.A02);
        }
        InterfaceC190488c6 interfaceC190488c6 = this.A02;
        if (str2 == null) {
            str7 = "";
        }
        if (str3 == null) {
            str6 = "";
        }
        interfaceC190488c6.Clc(C70108W4f.A00(num, tx0.A05, str7, str, str6, str8), this.A04.E6f(), E6U, interfaceC72022XFk.E6d(), str5, tx0.A00);
    }

    public C66137U1e(InterfaceC132105xl interfaceC132105xl, InterfaceC190488c6 interfaceC190488c6, InterfaceC72022XFk interfaceC72022XFk, XB8 xb8, XB9 xb9) {
        this.A02 = interfaceC190488c6;
        this.A01 = interfaceC132105xl;
        this.A06 = xb8;
        this.A03 = interfaceC72022XFk;
        this.A04 = xb9;
    }
}
