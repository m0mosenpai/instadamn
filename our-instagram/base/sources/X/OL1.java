package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class OL1 {
    public String A00;
    public final C54481O5j A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public OL1(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC169497hP interfaceC169497hP, C54481O5j c54481O5j, Integer num, List list, boolean z) {
        AbstractC25233BEq.A0x(2, userSession, c54481O5j, interfaceC169497hP);
        this.A01 = c54481O5j;
        this.A00 = "";
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C57239PbN(this, 13));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C57239PbN(this, 12));
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A03, new MED(interfaceC169497hP, this, userSession, list, 1, false, z));
        this.A05 = AbstractC09440dt.A00(EnumC09460dv.A04, new MEB(33, interfaceC11380iw, context, this, userSession, num));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C57239PbN(userSession, 11));
    }

    public final void A00() {
        boolean A1a = AbstractC31178DnM.A1a(this.A03);
        InterfaceC09390do interfaceC09390do = this.A05;
        C52198N8n c52198N8n = (C52198N8n) interfaceC09390do.getValue();
        if (A1a) {
            c52198N8n.A00 = 0;
        } else {
            c52198N8n.A01 = false;
        }
        ((C52198N8n) interfaceC09390do.getValue()).A00();
    }

    public final void A01(String str, int i, boolean z) {
        boolean A1a = AbstractC31178DnM.A1a(this.A03);
        InterfaceC09390do interfaceC09390do = this.A05;
        C52198N8n c52198N8n = (C52198N8n) interfaceC09390do.getValue();
        if (A1a) {
            c52198N8n.A00 = 10;
        } else {
            c52198N8n.A03.A00 = z;
            C31699Dw4 c31699Dw4 = c52198N8n.A02;
            c31699Dw4.A01 = str;
            c31699Dw4.A00 = i;
            c52198N8n.A01 = true;
        }
        ((C52198N8n) interfaceC09390do.getValue()).A00();
    }
}
