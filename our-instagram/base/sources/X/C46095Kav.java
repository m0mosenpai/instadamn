package X;

import android.app.Activity;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Kav, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46095Kav extends C34722FRj {
    public final /* synthetic */ WEz A00;

    @Override // X.C34722FRj
    public final void A03(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, final String str, List list) {
        JsonObject jsonObject;
        final String asString;
        String A0n;
        Long A0j;
        C14360o3.A0B(str, 1);
        WEz wEz = this.A00;
        if (wEz.A0C) {
            Activity activity = wEz.A0F;
            C47984LJj c47984LJj = new C47984LJj(activity, wEz.A0H);
            if (!list.contains("ig_user_impersonation_me") && !list.contains("ig_user_impersonation_someone_i_know") && !list.contains("ig_user_impersonation_someone_i_follow") && !list.contains("ig_impersonation_celebrity") && !list.contains("ig_user_impersonation_someone_else")) {
                LMO lmo = new LMO(c6fq, c47984LJj, interfaceC103384lE2, wEz, list, interfaceC103384lE, str, 1);
                DialogInterfaceOnClickListenerC48022LMr dialogInterfaceOnClickListenerC48022LMr = new DialogInterfaceOnClickListenerC48022LMr(12, c47984LJj, interfaceC103384lE2, c6fq);
                C193328hC A0I = AbstractC31171DnF.A0I(activity);
                A0I.A0A(2131972384);
                A0I.A09(2131972382);
                A0I.A0t(false);
                A0I.A0s(false);
                A0I.A0J(lmo, 2131972383);
                A0I.A0D(dialogInterfaceOnClickListenerC48022LMr);
                AbstractC166987dD.A1W(A0I);
                return;
            }
            C131845xK c131845xK = new C131845xK(c6fq);
            if (AbstractC001900j.A0T(str)) {
                C0w9.A03("reporting_bottom_sheet_impersonation_report", "Token is blank, so unable to find Victim ID");
            } else {
                try {
                    jsonObject = (JsonObject) new Gson().A08(str, JsonObject.class);
                } catch (C90063zm e) {
                    C0w9.A06("reporting_bottom_sheet_impersonation_report", "Failed to parse Json token", e);
                }
                if (jsonObject.has("victim_id") && (asString = jsonObject.getAsJsonPrimitive("victim_id").getAsString()) != null && !AbstractC001900j.A0T(asString)) {
                    User user = wEz.A01;
                    if (user != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            Map map = C47984LJj.A02;
                            if (map.containsKey(next)) {
                                Object obj = map.get(next);
                                if (obj != null) {
                                    Number number = (Number) obj;
                                    if (number != null) {
                                        if (wEz.A08 == null) {
                                            String str2 = wEz.A04;
                                            if (str2 != null && (A0j = AbstractC166997dE.A0j(str2)) != null) {
                                                long longValue = A0j.longValue();
                                                C41761wQ A0S = AbstractC31174DnI.A0S();
                                                final ImmutableList A0L = AbstractC31173DnH.A0L(list);
                                                final int intValue = number.intValue();
                                                final Long BTC = user.BTC();
                                                if (BTC != null) {
                                                    long longValue2 = BTC.longValue();
                                                    C137766Ly c137766Ly = C137746Lw.A00(c47984LJj.A00, "MsysReportUtil").A01;
                                                    final Long valueOf = Long.valueOf(longValue);
                                                    A0S.A02(C42221xC.A01(C48332La7.A00, c137766Ly.A0C.A0L(new C6D2() { // from class: X.Lan
                                                        @Override // X.C6D2
                                                        public final Object apply(Object obj2) {
                                                            final String str3 = str;
                                                            final Long l = valueOf;
                                                            final Long l2 = BTC;
                                                            final ImmutableList immutableList = A0L;
                                                            final String str4 = asString;
                                                            final int i = intValue;
                                                            final K3M k3m = (K3M) obj2;
                                                            C137766Ly c137766Ly2 = C137766Ly.A0L;
                                                            return C42221xC.A07(new InterfaceC1345866i() { // from class: X.LcN
                                                                @Override // X.InterfaceC1345866i
                                                                public final void EpD(C1346766r c1346766r) {
                                                                    K3M k3m2 = K3M.this;
                                                                    String str5 = str3;
                                                                    Long l3 = l;
                                                                    Long l4 = l2;
                                                                    ImmutableList immutableList2 = immutableList;
                                                                    String str6 = str4;
                                                                    int i2 = i;
                                                                    C137766Ly c137766Ly3 = C137766Ly.A0L;
                                                                    long longValue3 = l3.longValue();
                                                                    long longValue4 = l4.longValue();
                                                                    JRS A00 = JRS.A00(c1346766r, 50);
                                                                    InterfaceExecutorC135866Co ASj = k3m2.mMailboxApiHandleMetaProvider.ASj(0);
                                                                    MailboxFutureImpl A0I2 = AbstractC43593JPy.A0I(ASj, A00);
                                                                    AbstractC25231BEo.A1C(ASj, new C48200LUy(A0I2, k3m2, immutableList2, str5, str6, i2, longValue3, longValue4), A0I2);
                                                                }
                                                            }, AbstractC137146It.A00("send_impersonation_report"));
                                                        }
                                                    }), C47984LJj.A00(c47984LJj, str, longValue2)), new C49717Lxm(7, c131845xK, interfaceC103384lE2, interfaceC103384lE, c47984LJj));
                                                    return;
                                                }
                                                throw AbstractC166987dD.A14("Required value was null.");
                                            }
                                            throw AbstractC166987dD.A14("Required value was null.");
                                        }
                                        InterfaceC14020nS A00 = C14120nc.A00();
                                        C14360o3.A07(A00);
                                        A00.ATO(new KMZ(c131845xK, interfaceC103384lE, interfaceC103384lE2, user, c47984LJj, str, asString, list));
                                        return;
                                    }
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            }
                        }
                        A0n = AbstractC167017dG.A0n(list, "Invalid impersonation reporting tags: ", AbstractC166987dD.A1C());
                        C0w9.A03("reporting_bottom_sheet_impersonation_report", A0n);
                        c47984LJj.A02(c131845xK, interfaceC103384lE2);
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                C0w9.A03("reporting_bottom_sheet_impersonation_report", "Victim ID not found in Json token");
            }
            A0n = "Unable to find Victim ID from Json token";
            C0w9.A03("reporting_bottom_sheet_impersonation_report", A0n);
            c47984LJj.A02(c131845xK, interfaceC103384lE2);
        }
    }

    public C46095Kav(WEz wEz) {
        this.A00 = wEz;
    }

    @Override // X.C34722FRj
    public final void A00() {
        ((C70155WDf) this.A00.A0N.getValue()).A01();
    }

    @Override // X.C34722FRj
    public final void A01() {
        WEz wEz = this.A00;
        wEz.A03.Dfe();
        ((C70155WDf) wEz.A0N.getValue()).A02(303960177);
        C9GR.A0E(wEz.A0F, "request_error");
    }

    @Override // X.C34722FRj
    public final void A02() {
        WEz wEz = this.A00;
        wEz.A03.Dfh(null);
        InterfaceC09390do interfaceC09390do = wEz.A0N;
        ((C70155WDf) interfaceC09390do.getValue()).A06(C05F.A00, null, true);
        ((C70155WDf) interfaceC09390do.getValue()).A03(303960177);
    }

    @Override // X.C34722FRj
    public final void A04(Integer num) {
        WEz wEz = this.A00;
        InterfaceC09390do interfaceC09390do = wEz.A0N;
        ((C70155WDf) interfaceC09390do.getValue()).A04(303960177);
        ((C70155WDf) interfaceC09390do.getValue()).A05(null, null, num, null, wEz.A04(), 303960177);
        ((C70155WDf) interfaceC09390do.getValue()).A05(AbstractC166997dE.A0b(), C05F.A00, num, null, null, 303965077);
    }

    @Override // X.C34722FRj
    public final void A05(HashMap hashMap) {
        if (hashMap != null) {
            String A0h = AbstractC31171DnF.A0h("selected_tag_types", hashMap);
            if (C14360o3.A0K(hashMap.get("feedback_submitted"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                WEz wEz = this.A00;
                wEz.A03.DpZ(A0h);
                wEz.A0B = true;
            }
            if (C14360o3.A0K(hashMap.get("submit_report_failed"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                this.A00.A03.DpY(A0h, null, null);
            }
        }
        WEz wEz2 = this.A00;
        wEz2.A03.Czw(wEz2.A0B);
    }
}
