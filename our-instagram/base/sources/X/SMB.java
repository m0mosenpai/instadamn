package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SMB {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ QIo A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ InterfaceC24901Jp A03;

    public final void A00(Throwable th) {
        C14360o3.A0B(th, 0);
        C63222SfT c63222SfT = this.A00.A06;
        Map map = this.A02;
        C14360o3.A0B(map, 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put(RhW.A0s.A00, th.getMessage());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        A1I.put(RhW.A0T.A00, stringWriter.toString());
        linkedHashMap.putAll(A1I);
        c63222SfT.A00.Ci3(linkedHashMap, null, "client_create_dcpquote_fail");
        this.A03.resumeWith(new C09540e5(th));
    }

    public SMB(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, QIo qIo, Map map, InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A02 = map;
        this.A01 = qIo;
        this.A03 = interfaceC24901Jp;
    }
}
