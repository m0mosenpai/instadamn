package X;

import java.util.Map;

/* renamed from: X.Oou, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55728Oou implements InterfaceC65490TlB {
    public final /* synthetic */ Map A00;
    public final /* synthetic */ InterfaceC24901Jp A01;

    @Override // X.InterfaceC65490TlB
    public final void DcW(EnumC61185Rgl enumC61185Rgl) {
        String str;
        Map map = this.A00;
        map.put("purchase_product_status", "FAILURE");
        O77 o77 = (O77) AbstractC62347S7s.A00.get(enumC61185Rgl);
        String str2 = "";
        if (o77 == null) {
            str = "";
        } else {
            str = o77.A00;
        }
        map.put("purchase_product_status_error_code", str);
        if (o77 != null) {
            str2 = o77.A01;
        }
        map.put("purchase_product_status_error_description", str2);
        InterfaceC24901Jp interfaceC24901Jp = this.A01;
        if (interfaceC24901Jp.isActive()) {
            interfaceC24901Jp.resumeWith(false);
        }
    }

    @Override // X.InterfaceC65490TlB
    public final void DcY(C45126Jxv c45126Jxv) {
        String str;
        String str2;
        C14360o3.A0B(c45126Jxv, 0);
        Map map = this.A00;
        map.put("purchase_product_status", "SUCCESS");
        O77 o77 = (O77) AbstractC62347S7s.A00.get(EnumC61185Rgl.A0L);
        String str3 = "";
        if (o77 == null) {
            str = "";
        } else {
            str = o77.A00;
        }
        map.put("purchase_product_status_error_code", str);
        if (o77 == null) {
            str2 = "";
        } else {
            str2 = o77.A01;
        }
        map.put("purchase_product_status_error_description", str2);
        String str4 = c45126Jxv.A01;
        if (str4 == null) {
            str4 = "";
        }
        map.put(AbstractC58317Pt9.A00(295), str4);
        String str5 = c45126Jxv.A03;
        if (str5 != null) {
            str3 = str5;
        }
        map.put(AbstractC58317Pt9.A00(275), str3);
        InterfaceC24901Jp interfaceC24901Jp = this.A01;
        if (interfaceC24901Jp.isActive()) {
            interfaceC24901Jp.resumeWith(AbstractC166997dE.A0b());
        }
    }

    public C55728Oou(Map map, InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = map;
        this.A01 = interfaceC24901Jp;
    }
}
