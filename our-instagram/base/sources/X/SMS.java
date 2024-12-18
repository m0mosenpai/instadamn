package X;

import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABIPAMatchKeyEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SMS {
    public final Bundle A00;
    public final C63305ShB A01;
    public final C62974SZu A02;
    public final C23016ACq A03;
    public final ZonePolicy A04;

    public SMS(Bundle bundle, C63305ShB c63305ShB, C62974SZu c62974SZu, C23016ACq c23016ACq, ZonePolicy zonePolicy) {
        AbstractC25233BEq.A0w(2, c63305ShB, c23016ACq, bundle);
        C14360o3.A0B(zonePolicy, 5);
        this.A02 = c62974SZu;
        this.A01 = c63305ShB;
        this.A03 = c23016ACq;
        this.A00 = bundle;
        this.A04 = zonePolicy;
    }

    @JavascriptInterface
    public final String createAndSubmitConversionReport(int i) {
        IABEvent iABEvent;
        String str;
        C62974SZu c62974SZu = this.A02;
        byte b = (byte) i;
        long A01 = c62974SZu.A01();
        C62974SZu.A00(c62974SZu);
        C63294Sgu c63294Sgu = S6L.A00;
        long j = c62974SZu.A01;
        int i2 = (int) A01;
        String str2 = c62974SZu.A07;
        SKI ski = c62974SZu.A05;
        Map map = c62974SZu.A02;
        if (map == null) {
            C14360o3.A0F("keysetHandles");
            throw C00O.createAndThrow();
        }
        C14360o3.A0B(ski, 4);
        SUU.A00 = 824189150;
        C006802i c006802i = SUU.A01;
        c006802i.markerStart(824189150);
        SUU.A00("get_encrypted_match_key_start");
        Integer num = C05F.A00;
        C51u A03 = c63294Sgu.A03(ski, num, str2, map, j);
        SUU.A00("get_encrypted_match_key_end");
        SUU.A00("get_encrypted_event_details_start");
        C62626SJj c62626SJj = C63170SeV.A03;
        C51u A00 = c62626SJj.A00(EnumC61063Rec.A04, i2);
        C51u A002 = c62626SJj.A00(EnumC61063Rec.A02, 0L);
        C51u A003 = c62626SJj.A00(EnumC61063Rec.A05, b);
        C51u A04 = c63294Sgu.A04(ski, num, str2, map, new C51u(AbstractC61737Rss.A00((C63170SeV) A00.A00, (C63170SeV) A002.A00, (C63170SeV) A003.A00), AbstractC61737Rss.A00((C63170SeV) A00.A01, (C63170SeV) A002.A01, (C63170SeV) A003.A01), AbstractC61737Rss.A00((C63170SeV) A00.A02, (C63170SeV) A002.A02, (C63170SeV) A003.A02)));
        SUU.A00("get_encrypted_event_details_end");
        SUU.A00("get_encrypted_reports_start");
        C51u A012 = C63294Sgu.A01(A03, A04);
        SUU.A00("get_encrypted_reports_end");
        c006802i.markerEnd(SUU.A00, (short) 2);
        SLU slu = c62974SZu.A06;
        slu.A00.add(AbstractC166987dD.A1L(Rg5.A03, A012));
        C63305ShB c63305ShB = this.A01;
        C23016ACq c23016ACq = this.A03;
        long A013 = c62974SZu.A01();
        long j2 = c62974SZu.A04;
        String str3 = c62974SZu.A08;
        C51u A02 = c62974SZu.A02(C05F.A01);
        if (c23016ACq.A0p && (str = c23016ACq.A0Z) != null) {
            long now = c23016ACq.A0m.now();
            iABEvent = new IABIPAMatchKeyEvent(str, str3, A02, now, now, A013, j2);
        } else {
            iABEvent = IABEvent.A04;
        }
        c63305ShB.A06(this.A00, iABEvent, this.A04);
        Integer num2 = C05F.A0C;
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("version", "0.0");
        A0q.put("per_helper", new JSONArray((Collection) slu.A00(num2, true, false)));
        JSONObject A0q2 = AbstractC31171DnF.A0q();
        A0q2.put("report", A0q);
        A0q2.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "OK");
        return String.valueOf(A0q2);
    }
}
