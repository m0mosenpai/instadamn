package X;

import android.os.Bundle;
import com.facebookpay.msc.logging.LoggingData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class UFY extends AbstractC52922bZ implements InterfaceC65626Tpm {
    public Boolean A00;
    public List A01;
    public C2GT A02;
    public LoggingData A03;
    public String A04;
    public List A05;
    public final C2GT A06;
    public final C58252li A07;
    public final C2GS A08;
    public final InterfaceC09390do A09;

    public final void A03(Bundle bundle) {
        String string;
        List list;
        LoggingData loggingData = bundle != null ? (LoggingData) bundle.getParcelable("logging_data") : null;
        if (loggingData != null) {
            this.A03 = loggingData;
            if (bundle != null && (string = bundle.getString("parent_view_name")) != null) {
                this.A04 = string;
                ArrayList<String> stringArrayList = bundle.getStringArrayList(MSV.A00(1482));
                if (stringArrayList != null) {
                    list = AbstractC001800i.A0a(stringArrayList);
                } else {
                    list = C16930sl.A00;
                }
                this.A05 = list;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        String str;
        C14360o3.A0B(c07x, 0);
        if (this.A01 != null) {
            C2GT c2gt = this.A02;
            if (c2gt != null) {
                str = (String) c2gt.A02();
            } else {
                str = null;
            }
            A01(this, str, true);
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public static final void A01(UFY ufy, String str, boolean z) {
        if (str == null) {
            List list = ufy.A05;
            if (list != null) {
                if (list.isEmpty()) {
                    return;
                }
            }
            C14360o3.A0F("subtypesToFilter");
            throw C00O.createAndThrow();
        }
        ufy.A00 = null;
        A00(ufy, "client_fetch_payouthub_init", null, null, null, null, null, null, null, null, "BSC_CLIENT_FETCH_NOTIFICATIONS", null, null, null);
        String str2 = ufy.A04;
        String str3 = "parentViewName";
        if (str2 != null) {
            C2FP.A02();
            String str4 = null;
            AbstractC70159WDv.A03(str, null, null, null, null, str2, null, null, null, 667758647, 0);
            C2FP.A02();
            AbstractC70159WDv.A00(667758647, 0, "fetch_init", AbstractC06930Yk.A0E());
            C58252li c58252li = ufy.A07;
            Was was = (Was) ufy.A09.getValue();
            LoggingData loggingData = ufy.A03;
            if (loggingData == null) {
                str3 = "loggingData";
            } else {
                String str5 = loggingData.A00;
                String str6 = ufy.A04;
                if (str6 != null) {
                    String A0h = AbstractC167007dF.A0h(str6);
                    switch (A0h.hashCode()) {
                        case -1749375484:
                            if (A0h.equals(MSV.A00(1270))) {
                                str4 = "IG_PRODUCT_SETTINGS_SUBPAGE";
                                break;
                            }
                            break;
                        case -349205283:
                            if (A0h.equals("payouthub_payouts")) {
                                str4 = "PAYOUTS";
                                break;
                            }
                            break;
                        case -133197479:
                            if (A0h.equals("payouthub_earnings")) {
                                str4 = "EARNINGS";
                                break;
                            }
                            break;
                        case 530115961:
                            if (A0h.equals("overview")) {
                                str4 = "OVERVIEW";
                                break;
                            }
                            break;
                        case 550105257:
                            if (A0h.equals("payout_details")) {
                                str4 = "PAYOUT_DETAILS";
                                break;
                            }
                            break;
                        case 664105997:
                            if (A0h.equals("earning_details")) {
                                str4 = "EARNING_DETAILS";
                                break;
                            }
                            break;
                        case 1434631203:
                            if (A0h.equals("settings")) {
                                str4 = "SETTINGS";
                                break;
                            }
                            break;
                        case 1954122069:
                            if (A0h.equals("transactions")) {
                                str4 = "TRANSACTIONS";
                                break;
                            }
                            break;
                    }
                    List list2 = ufy.A05;
                    if (list2 != null) {
                        Q8J A00 = REU.A00(new C70273WPe(was, str, str5, str4, list2), C2FP.A06());
                        C14360o3.A07(A00);
                        AbstractC63246Sg0.A02(A00, c58252li, new WQm(0, ufy, z));
                        return;
                    }
                    C14360o3.A0F("subtypesToFilter");
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    public final void A02() {
        if (AbstractC31177DnL.A1b(this.A00)) {
            this.A00 = null;
            C2FP.A02();
            AbstractC70159WDv.A02(667758647, 0, (short) 2);
        } else {
            if (!AbstractC166997dE.A1Z(this.A00, false)) {
                return;
            }
            this.A00 = null;
            C2FP.A02();
            AbstractC70159WDv.A02(667758647, 0, (short) 3);
        }
    }

    public final void A04(C2GT c2gt) {
        C2GT c2gt2 = this.A02;
        if (c2gt2 != null) {
            this.A07.A0D(c2gt2);
        }
        this.A02 = c2gt;
        AbstractC58321PtD.A1D(c2gt, this.A07, new X59(this, 37), 18);
    }

    public UFY() {
        C58252li c58252li = new C58252li();
        this.A07 = c58252li;
        this.A06 = C75M.A01(c58252li, X5V.A00);
        this.A08 = new C2GS();
        this.A09 = AbstractC09440dt.A01(X3u.A00);
    }

    public static final void A00(UFY ufy, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2) {
        Object A02;
        String str12;
        C2GC c2gc = C2FP.A02().A01;
        LoggingData loggingData = ufy.A03;
        if (loggingData == null) {
            str12 = "loggingData";
        } else {
            HashMap A00 = VNP.A00(loggingData);
            String str13 = ufy.A04;
            if (str13 == null) {
                str12 = "parentViewName";
            } else {
                AbstractC65703TsZ.A1O("view_name", str13, str2, A00);
                C2GT c2gt = ufy.A02;
                if (c2gt != null && (A02 = c2gt.A02()) != null) {
                    A00.put("financial_entity_id", A02);
                }
                if (str3 != null) {
                    A00.put("notification_identifier", str3);
                }
                if (str4 != null) {
                    A00.put("notification_source", str4);
                }
                if (str5 != null) {
                    A00.put("cta_text", str5);
                }
                if (str6 != null) {
                    A00.put("cta_uri", str6);
                }
                if (list2 != null) {
                    A00.put("holds_list", list2);
                }
                if (list != null) {
                    A00.put("notification_id_list", list);
                }
                if (str7 != null) {
                    A00.put("error_message", str7);
                }
                if (str8 != null) {
                    A00.put("error_stacktrace", str8);
                }
                if (str9 != null) {
                    A00.put("exception_class", str9);
                }
                if (str10 != null) {
                    A00.put("endpoint", str10);
                }
                if (str11 != null) {
                    A00.put("cta_title", str11);
                }
                c2gc.Chz(str, A00);
                return;
            }
        }
        C14360o3.A0F(str12);
        throw C00O.createAndThrow();
    }
}
