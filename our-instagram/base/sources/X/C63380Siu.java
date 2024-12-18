package X;

import X.AbstractC63402SjX;
import X.C0f9;
import X.C63380Siu;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.autofill.AutofillValue;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.W3CCardDetail;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.meta.vault.service.base.DefaultVaultService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Siu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63380Siu {
    public int A00;
    public InterfaceC58362lv A01;
    public Q4Z A02;
    public C58883QEt A03;
    public SKL A04;
    public C63009SaX A05;
    public QF6 A06;
    public C0JM A07;
    public C62694SMi A08;
    public C2GP A09;
    public UserSession A0A;
    public DefaultVaultService A0B;
    public Integer A0C;
    public Long A0D;
    public List A0E;
    public Map A0F;
    public Map A0G;
    public Map A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final C5G6 A0Q;
    public final SKK A0R;
    public final Map A0S;
    public final Map A0T;

    public final CardDetails A0A(CardDetails cardDetails) {
        C09530e4 A03;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        QIj qIj = (QIj) this.A0Q.A00.A06.A03;
        if (qIj != null) {
            str = qIj.A02;
            if (str != null) {
                str = str.trim();
            }
            String str2 = qIj.A03;
            if (!TextUtils.isEmpty(str2) && (A03 = AbstractC63230Sfi.A03(str2)) != null) {
                num = (Integer) A03.A00;
                num2 = (Integer) A03.A01;
            } else {
                String str3 = qIj.A04;
                if (str3 != null) {
                    try {
                        num = Integer.valueOf(Integer.parseInt(str3));
                    } catch (NumberFormatException unused) {
                    }
                }
                String str4 = qIj.A05;
                Integer num3 = null;
                if (str4 != null) {
                    try {
                        num3 = Integer.valueOf(Integer.parseInt(str4));
                    } catch (NumberFormatException unused2) {
                    }
                }
                num2 = AbstractC63230Sfi.A00(num3);
            }
        }
        CardDetails cardDetails2 = new CardDetails(null, null, null, num, num2, null, null, null, null, str, null);
        Integer num4 = cardDetails.A03;
        Integer num5 = cardDetails.A04;
        String str5 = cardDetails.A09;
        Address address = cardDetails.A00;
        ImmutableList immutableList = cardDetails.A01;
        String str6 = cardDetails.A05;
        String str7 = cardDetails.A07;
        Boolean bool = cardDetails.A02;
        String str8 = cardDetails.A0A;
        if (num4 == null) {
            num4 = cardDetails2.A03;
        }
        if (num5 == null) {
            num5 = cardDetails2.A04;
        }
        if (str5 == null) {
            str5 = cardDetails2.A09;
        }
        return new CardDetails(address, immutableList, bool, num4, num5, str6, null, str7, null, str5, str8);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(int r28, android.content.Intent r29) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63380Siu.A0E(int, android.content.Intent):void");
    }

    public C63380Siu(C5G6 c5g6, C58883QEt c58883QEt, SKL skl, C63009SaX c63009SaX, UserSession userSession, DefaultVaultService defaultVaultService) {
        SKK skk = new SKK(C18950wb.A01);
        this.A0L = false;
        this.A01 = null;
        this.A0M = false;
        this.A0N = false;
        this.A07 = C03250Di.A00;
        this.A0O = false;
        this.A00 = 0;
        this.A03 = c58883QEt;
        this.A0S = AbstractC166987dD.A1G();
        this.A0T = AbstractC166987dD.A1G();
        this.A0P = false;
        this.A0F = AbstractC166987dD.A1G();
        this.A0K = false;
        this.A0D = null;
        this.A0J = false;
        this.A0G = AbstractC166987dD.A1G();
        this.A0H = AbstractC166987dD.A1G();
        this.A0E = AbstractC166987dD.A1E();
        this.A0C = C05F.A0Y;
        this.A0R = skk;
        this.A0Q = c5g6;
        this.A05 = c63009SaX;
        this.A04 = skl;
        this.A0B = defaultVaultService;
        this.A0A = userSession;
        c5g6.A00.A02 = new C51756Mtf(AbstractC28057CYl.A01(userSession), 1);
    }

    public static C07X A00(C63380Siu c63380Siu) {
        C58883QEt c58883QEt = c63380Siu.A03;
        InterfaceC172727mi interfaceC172727mi = ((AbstractC63223SfY) c58883QEt).A04;
        if (interfaceC172727mi instanceof C07X) {
            return (C07X) interfaceC172727mi;
        }
        AbstractC63402SjX.A0A(c58883QEt.A03(), c63380Siu.A0Q, c63380Siu.A08("NULL_LIFE_CYCLE_OWNER").A00());
        return null;
    }

    public static void A01(C63380Siu c63380Siu) {
        Object obj;
        C5G6 c5g6 = c63380Siu.A0Q;
        C62620SJd c62620SJd = c5g6.A00;
        C51760Mtj c51760Mtj = c62620SJd.A0M;
        Object obj2 = c51760Mtj.A00;
        Integer num = C05F.A0N;
        if (obj2 == num && (obj = c51760Mtj.A02) != C05F.A0C && obj != num && AbstractC63232Sfk.A03(c62620SJd)) {
            if ("PERSISTENT".equals(AbstractC58320PtC.A0y(C06090Tz.A05, c5g6.A04.A00))) {
                c51760Mtj.A02 = C05F.A01;
                C58883QEt c58883QEt = c63380Siu.A03;
                SOE soe = c58883QEt.A06;
                if (soe != null && c58883QEt.A05 != null) {
                    soe.A01();
                    return;
                }
                return;
            }
        }
        SOE soe2 = c63380Siu.A03.A06;
        if (soe2 == null) {
            return;
        }
        soe2.A00();
    }

    public static void A02(C63380Siu c63380Siu, SYH syh) {
        AutofillData autofillData;
        String str = c63380Siu.A0Q.A00.A09.A01;
        String A02 = AbstractC63387Sj3.A02(str);
        if (str != null && A02 != null) {
            if (syh != null) {
                autofillData = syh.A00;
            } else {
                autofillData = null;
            }
            boolean z = true;
            AbstractC43592JPx.A1W(A02, c63380Siu.A0S, AbstractC167007dF.A1W(syh));
            c63380Siu.A0T.put(str, AbstractC61731Rsm.A00(autofillData, null));
            if (syh == null) {
                z = false;
            }
            c63380Siu.A0P = z;
        }
    }

    public static void A03(C63380Siu c63380Siu, CardDetails cardDetails) {
        Integer num;
        String str;
        if (c63380Siu.A06 != null) {
            Map map = c63380Siu.A0T;
            C5G6 c5g6 = c63380Siu.A0Q;
            C62620SJd c62620SJd = c5g6.A00;
            SYH syh = (SYH) map.get(c62620SJd.A09.A01);
            AutofillData autofillData = null;
            if (syh != null) {
                autofillData = syh.A00;
            }
            SYH A00 = AbstractC61731Rsm.A00(autofillData, cardDetails);
            HashMap A1G = AbstractC166987dD.A1G();
            if (A00 != null) {
                A1G.putAll(A00.A01());
                HashMap A1G2 = AbstractC166987dD.A1G();
                CardDetails cardDetails2 = A00.A01;
                if (cardDetails2 != null) {
                    String str2 = cardDetails2.A07;
                    if (str2 != null) {
                        A1G2.put("cc-number", str2);
                    }
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    Integer num2 = cardDetails2.A03;
                    if (num2 != null) {
                        String A0o = AbstractC58318PtA.A0o(Locale.US, "%02d", Arrays.copyOf(AbstractC25228BEl.A1Y(num2.intValue() % 100), 1));
                        A1G2.put("cc-exp-month", A0o);
                        A1C.append(A0o);
                    }
                    Integer num3 = cardDetails2.A04;
                    if (num3 != null) {
                        String A0o2 = AbstractC58318PtA.A0o(Locale.US, "%02d", Arrays.copyOf(AbstractC25228BEl.A1Y(num3.intValue() % 100), 1));
                        A1G2.put("cc-exp-year", String.valueOf(num3));
                        A1C.append('/');
                        A1C.append(A0o2);
                    }
                    if (A1C.length() == 5) {
                        A1G2.put("cc-exp", A1C.toString());
                    }
                }
                A1G.putAll(A1G2);
            }
            if (cardDetails != null) {
                c62620SJd.A0M.A01 = C05F.A00;
                A1G.put("cc-number", cardDetails.A07);
                A1G.put("cc-csc", cardDetails.A09);
            }
            Q4Z q4z = c63380Siu.A02;
            java.util.Set set = C63269SgT.A08;
            java.util.Set set2 = C63269SgT.A0B;
            C43031yW c43031yW = c5g6.A04;
            SparseArray<AutofillValue> A002 = AbstractC63087ScA.A00(q4z, c43031yW, A1G, set, set2);
            if (!A1G.isEmpty()) {
                String obj = A1G.keySet().toString();
                HashMap A1G3 = AbstractC166987dD.A1G();
                A1G3.put("autofill_tags", obj);
                A1G3.put("family_device_id", SYL.A00(c62620SJd.A0Q));
                C61602RqR A08 = c63380Siu.A08("AUTOFILL_APPLY_INIT");
                A08.A0K = A1G3;
                AbstractC63402SjX.A0C(c5g6, c63380Siu, A08);
            }
            ((SystemWebView) c63380Siu.A06).A04.autofill(A002);
            if (!A1G.isEmpty() && c63380Siu.A06 != null) {
                if ("CONTACT_AUTOFILL".equals(AbstractC63232Sfk.A01(c62620SJd))) {
                    c63380Siu.A0R.A00("Contact autofill happening using Android Framework");
                } else {
                    java.util.Set keySet = A1G.keySet();
                    QF6 qf6 = c63380Siu.A06;
                    C58883QEt c58883QEt = c63380Siu.A03;
                    Q4Z A04 = qf6.A04();
                    HashSet A1H = AbstractC166987dD.A1H();
                    Iterator A13 = AbstractC31174DnI.A13(A04.A0A);
                    while (A13.hasNext()) {
                        Q4Z q4z2 = (Q4Z) A13.next();
                        AutofillValue autofillValue = q4z2.A04;
                        String A003 = STE.A00(q4z2, c43031yW, set2, null);
                        if (A003 != null && autofillValue != null) {
                            if (!autofillValue.isText() || autofillValue.getTextValue().length() != 0) {
                                if (autofillValue.isList()) {
                                    int listValue = autofillValue.getListValue();
                                    CharSequence[] charSequenceArr = q4z2.A08;
                                    if (charSequenceArr != null && listValue < charSequenceArr.length) {
                                    }
                                }
                            }
                            A1H.add(A003);
                        }
                    }
                    LinkedHashMap A01 = AbstractC63087ScA.A01(qf6.A04(), c43031yW, set2);
                    HashMap A1G4 = AbstractC166987dD.A1G();
                    A1G4.put("DETECTION_SOURCE", "framework");
                    for (Object obj2 : keySet) {
                        if (A1H.contains(obj2)) {
                            num = C05F.A00;
                        } else if (A01.containsKey(obj2)) {
                            num = C05F.A01;
                        }
                        if (num.intValue() != 0) {
                            str = "FILLED";
                        } else {
                            str = "NOT_FILLED";
                        }
                        A1G4.put(obj2, str.toLowerCase(Locale.ROOT));
                    }
                    HashMap A1G5 = AbstractC166987dD.A1G();
                    A1G5.put("autofill_applied_statuses", new Gson().A0C(A1G4, ((AbstractC140846Ym) new C60778RSn(c63380Siu)).A00));
                    C61602RqR A082 = c63380Siu.A08("AUTOFILL_APPLY_COMPLETED");
                    Map map2 = A082.A0K;
                    if (map2 == null) {
                        map2 = AbstractC166987dD.A1G();
                        A082.A0K = map2;
                    }
                    map2.putAll(A1G5);
                    AbstractC63402SjX.A0B(c5g6, c58883QEt, A082);
                }
            }
            c63380Siu.A0F.putAll(A1G);
        }
    }

    public static void A04(C63380Siu c63380Siu, CardDetails cardDetails) {
        C62761SPt c62761SPt;
        if (cardDetails != null) {
            long now = c63380Siu.A07.now();
            C62694SMi c62694SMi = c63380Siu.A08;
            if (c62694SMi != null) {
                C2GS A0J = AbstractC58318PtA.A0J();
                try {
                    S26.A00(cardDetails);
                    c62694SMi.A01.getApplicationContext();
                    C2FP.A0D();
                    c62761SPt = c62694SMi.A00;
                } catch (IllegalArgumentException e) {
                    A0J.A0A(new SED(null, e));
                }
                if (c62761SPt == null) {
                    C14360o3.A0F("w3cAppRepo");
                    throw C00O.createAndThrow();
                }
                S24.A00(c62694SMi.A02, c62761SPt.A01(cardDetails), new DRW(A0J, 2));
                EnumC61149RgA enumC61149RgA = (EnumC61149RgA) c63380Siu.A0Q.A00.A0K.A00;
                if (A00(c63380Siu) != null) {
                    A0J.A06(A00(c63380Siu), new C63625SqX(0, A0J, c63380Siu));
                }
                A0J.A09(new C63614SqM(A0J, enumC61149RgA, c63380Siu, now));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.QEF] */
    /* JADX WARN: Type inference failed for: r13v4, types: [X.QEF] */
    public static void A05(C63380Siu c63380Siu, Boolean bool, List list) {
        String str;
        QE4 qe4;
        Bundle A0b;
        QE4 qe42;
        C58883QEt c58883QEt = c63380Siu.A03;
        Activity activity = (Activity) ((AbstractC63223SfY) c58883QEt).A00;
        if (c63380Siu.A09 != null && activity != null) {
            C5G6 c5g6 = c63380Siu.A0Q;
            C63021Sam c63021Sam = c5g6.A02;
            C0JO c0jo = C63021Sam.A02;
            Integer A00 = c63021Sam.A00(Long.valueOf(c0jo.now()), 772810340, 0);
            c63021Sam.A02(A00, Long.valueOf(c0jo.now()), "requestSecurityCodeValidationForResult", 772810340);
            if (AbstractC31177DnL.A1U(C06090Tz.A05, c5g6.A04.A00, 36322800416926288L)) {
                if (list != null && !list.isEmpty() && list.get(0) != null && ((CardDetails) list.get(0)).A08 != null) {
                    if (bool.booleanValue()) {
                        A0b = AbstractC166987dD.A0b();
                        ?? qef = new QEF();
                        A0b.putParcelableArrayList("cardDetailsList", (ArrayList) list);
                        qe42 = qef;
                    } else {
                        String str2 = ((CardDetails) list.get(0)).A08;
                        C14360o3.A0B(str2, 0);
                        A0b = AbstractC166987dD.A0b();
                        ?? qef2 = new QEF();
                        A0b.putString("keyCredentialId", str2);
                        qe42 = qef2;
                    }
                    if (A00 != null) {
                        A0b.putInt("qplInstanceKey", A00.intValue());
                    }
                    qe42.setArguments(A0b);
                    qe4 = qe42;
                } else {
                    qe4 = null;
                }
                qe4.getClass();
                qe4.A02 = AbstractC25225BEi.A16(c63380Siu);
                Bundle A03 = c58883QEt.A03();
                TW3 tw3 = new TW3(c63380Siu, 1);
                qe4.A01 = c5g6;
                qe4.A00 = A03;
                qe4.A03 = tw3;
                c58883QEt.A09(qe4, null, null, C05F.A01, "CvvVerificationBottomsheetFragment");
            } else {
                Bundle A0b2 = AbstractC166987dD.A0b();
                if (list != null && !list.isEmpty()) {
                    str = ((CardDetails) list.get(0)).A08;
                } else {
                    str = null;
                }
                A0b2.putString("keyCredentialId", str);
                if (A00 != null) {
                    A0b2.putInt("qplInstanceKey", A00.intValue());
                }
                C2GP c2gp = c63380Siu.A09;
                Intent A002 = C2GP.A00(activity, c2gp);
                if (A002 != null) {
                    A0b2.putStringArrayList("methodNames", c2gp.A0C);
                    A002.putExtras(A0b2);
                    AbstractC07840b2.A00(activity, A002, 1001);
                } else {
                    throw AbstractC166987dD.A14("No payment activity is found. Did you check if payment is available?");
                }
            }
            AbstractC63402SjX.A0B(c5g6, c58883QEt, c63380Siu.A08("PROMPTED_VERIFICATION"));
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.QEF, X.QE5, androidx.fragment.app.Fragment, X.QEJ] */
    public final QEJ A07(EnumC61100RfE enumC61100RfE, AutofillData autofillData, CardDetails cardDetails, boolean z) {
        UserSession userSession = this.A0A;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36310426615414849L);
        if (autofillData != null && !autofillData.A02() && !C18U.A06(c06090Tz, userSession, 36310426618167387L)) {
            autofillData = null;
        }
        long A01 = C18U.A01(c06090Tz, userSession, 36591901593763891L);
        boolean A062 = C18U.A06(C06090Tz.A06, this.A03.A0a, 36319222707526756L);
        ?? qef = new QEF();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("contact_info", C0B1.A00(autofillData));
        A0b.putParcelable("payment_info", C0B1.A00(cardDetails));
        A0b.putSerializable("action", enumC61100RfE);
        A0b.putBoolean("is_consent_accepted", z);
        A0b.putBoolean("should_always_show_ads_disclosure", A06);
        A0b.putLong("disable_autofill_dismiss_option", A01);
        A0b.putBoolean("autofill_show_unified_wallet_disclaimer_enabled", A062);
        qef.setArguments(A0b);
        qef.A00 = this.A0Q;
        return qef;
    }

    public final C61602RqR A08(String str) {
        return A09(str, -1L, -1L, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c9, code lost:
    
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0426, code lost:
    
        r5.put(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0447, code lost:
    
        if (r6.A00() == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0449, code lost:
    
        r1 = java.lang.String.valueOf(X.AbstractC166987dD.A0x(r0.A03.A00).getBoolean("is_passkey_content_visible", false));
        r0 = "has_preselected_checkbox_for_passkey_creation";
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03d6, code lost:
    
        if (r0 == false) goto L117;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00dc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x00e9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0102. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0105. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0351. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03e0  */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.RqR, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C61602RqR A09(java.lang.String r31, long r32, long r34, boolean r36) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63380Siu.A09(java.lang.String, long, long, boolean):X.RqR");
    }

    public final void A0B() {
        C62620SJd c62620SJd = this.A0Q.A00;
        C14360o3.A0B(c62620SJd, 0);
        c62620SJd.A06 = new QIy();
    }

    public final void A0C() {
        AutofillContactDataCallback.Stub stub = new AutofillContactDataCallback.Stub() { // from class: com.facebook.browser.lite.extensions.autofill.base.AutofillFrameworkControllerBase$6
            {
                C0f9.A0A(1967169064, C0f9.A03(1269239284));
            }

            @Override // com.facebook.browser.lite.ipc.AutofillContactDataCallback
            public final void D1F(List list) {
                int A03 = C0f9.A03(1789124006);
                C63380Siu.this.A0E = AbstractC63402SjX.A05(list);
                C0f9.A0A(959344954, A03);
            }
        };
        BrowserLiteCallback browserLiteCallback = C63305ShB.A00().A06;
        if (browserLiteCallback != null) {
            try {
                browserLiteCallback.AV0(stub);
            } catch (RemoteException e) {
                C0K8.A0J("BrowserLiteCallbacker", "Error in fetchAutofillContactData", e);
            }
        }
    }

    public final void A0D() {
        QIp qIp;
        String str;
        String str2;
        C63024Sau c63024Sau = this.A0Q.A01;
        Map map = this.A0F;
        boolean z = this.A0P;
        Bundle A03 = this.A03.A03();
        C62620SJd c62620SJd = c63024Sau.A00;
        java.util.Set set = c62620SJd.A00.A03;
        if (!set.isEmpty() && (qIp = (QIp) c62620SJd.A06.A00) != null) {
            Map A00 = AbstractC61726Rsh.A00(qIp);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            for (Object obj : set) {
                if (C63269SgT.A0C.contains(obj)) {
                    Object obj2 = map.get(obj);
                    String A1A = AbstractC166987dD.A1A(obj, A00);
                    if (z) {
                        if (obj2 != null && obj2.equals(A1A)) {
                            str2 = "no_changes";
                        } else {
                            str2 = "has_changes";
                        }
                    } else if (A1A != null && A1A.length() == 0) {
                        str2 = "empty";
                    } else {
                        str2 = "non_empty";
                    }
                    A1I.put(obj, str2);
                } else {
                    return;
                }
            }
            if (z) {
                str = "EDIT_FIELD_END";
            } else {
                str = "FILL_FIELD_END";
            }
            c63024Sau.A02(A03, new C26061Bfo((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Map) A1I, 1022, false), AbstractC63232Sfk.A00(c62620SJd), str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x028d, code lost:
    
        if (X.AbstractC61720Rsb.A00(r10, new X.C51760Mtj(r3, r3, r3, 3)) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x043c, code lost:
    
        if (r3.length() == 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0448, code lost:
    
        if (r2.length() == 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0451, code lost:
    
        if (r19 != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04a8, code lost:
    
        if (r3.length() == 0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x04b4, code lost:
    
        if (r2.length() == 0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04bd, code lost:
    
        if (r18 != false) goto L259;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r36, X.QF6 r37) {
        /*
            Method dump skipped, instructions count: 1739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63380Siu.A0F(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy, X.QF6):void");
    }

    public final void A0G(Q4Z q4z) {
        C5G6 c5g6 = this.A0Q;
        C14360o3.A0B(c5g6, 0);
        if (q4z != null) {
            C62620SJd c62620SJd = c5g6.A00;
            C14360o3.A0B(c62620SJd, 1);
            String A02 = AbstractC63387Sj3.A02(q4z.A06);
            if (A02 != null && !((java.util.Set) c62620SJd.A0J.A01).contains(A02)) {
                if (AbstractC31177DnL.A1U(C06090Tz.A05, c5g6.A04.A00, 36322800421055108L)) {
                    C19K A00 = SVZ.A00();
                    AbstractC23641Du.A05(AnonymousClass191.A00, new MBr(c5g6, q4z, (InterfaceC23621Ds) null, 9), A00);
                    return;
                }
                C63253SgA.A01(q4z, c5g6);
            }
        }
    }

    public final void A0H(Q4Z q4z) {
        C5G6 c5g6 = this.A0Q;
        C58883QEt c58883QEt = this.A03;
        Context context = ((AbstractC63223SfY) c58883QEt).A00;
        Bundle A03 = c58883QEt.A03();
        InterfaceC172727mi interfaceC172727mi = ((AbstractC63223SfY) c58883QEt).A04;
        C14360o3.A0B(c5g6, 0);
        if (context != null && q4z != null) {
            C62620SJd c62620SJd = c5g6.A00;
            C14360o3.A0B(c62620SJd, 1);
            String A02 = AbstractC63387Sj3.A02(q4z.A06);
            if (A02 != null && !((java.util.Set) c62620SJd.A0J.A01).contains(A02)) {
                if (AbstractC31177DnL.A1U(C06090Tz.A05, c5g6.A04.A00, 36322800421055108L)) {
                    C19K A00 = SVZ.A00();
                    AbstractC23641Du.A05(AnonymousClass191.A00, new PXl(c5g6, context, q4z, A03, interfaceC172727mi, null, 0, false), A00);
                    return;
                }
                C63253SgA.A00(context, A03, q4z, c5g6, false);
            }
        }
    }

    public final void A0I(SYH syh) {
        String str;
        Integer num;
        FragmentActivity activity;
        if (this.A02 != null && this.A06 != null) {
            A02(this, syh);
            if (syh != null) {
                C5G6 c5g6 = this.A0Q;
                C62620SJd c62620SJd = c5g6.A00;
                MUG mug = c62620SJd.A0K;
                if (mug.A00 == EnumC61149RgA.A03) {
                    str = "ACCEPTED_PREFETCH";
                } else {
                    str = "ACCEPTED_AUTOFILL";
                }
                AutofillData autofillData = syh.A00;
                if (autofillData != null) {
                    if (syh.A01 != null) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A00;
                    }
                } else {
                    num = C05F.A01;
                }
                String A00 = SQk.A00(num);
                C61602RqR A08 = A08(str);
                A08.A0H = A00;
                C58883QEt c58883QEt = this.A03;
                AbstractC63223SfY.A04(c58883QEt, A08);
                C51760Mtj c51760Mtj = c62620SJd.A0M;
                if (c51760Mtj.A02 == C05F.A0C) {
                    A08.A01("is_payment_soft_keyboard", "true");
                }
                mug.A01 = true;
                CardDetails cardDetails = syh.A01;
                if (cardDetails != null) {
                    String str2 = cardDetails.A08;
                    if (str2 != null) {
                        A08.A0E = str2;
                    }
                } else {
                    c51760Mtj.A00 = C05F.A0N;
                }
                boolean z = false;
                A08.A01("contact_autofill_accepted", String.valueOf(AbstractC167007dF.A1W(autofillData)));
                if (cardDetails != null) {
                    z = true;
                }
                A08.A01("payment_autofill_accepted", String.valueOf(z));
                AbstractC63402SjX.A0B(c5g6, c58883QEt, A08);
                if (cardDetails != null) {
                    InterfaceC172717mh interfaceC172717mh = ((AbstractC63223SfY) c58883QEt).A03;
                    if (interfaceC172717mh != null && (activity = interfaceC172717mh.getActivity()) != null) {
                        ImmutableList immutableList = cardDetails.A01;
                        if (immutableList != null && immutableList.size() != 0) {
                            TW1 tw1 = new TW1(0, cardDetails, this);
                            HashMap A1G = AbstractC166987dD.A1G();
                            A1G.put("iab_session_id", c62620SJd.A09.A05);
                            TW0 tw0 = new TW0(this, 2);
                            TW0 tw02 = new TW0(this, 3);
                            TW5 tw5 = new TW5(this, 2);
                            C64834TVz c64834TVz = new C64834TVz(1);
                            Context context = ((AbstractC63223SfY) c58883QEt).A00;
                            C43031yW c43031yW = c5g6.A04;
                            C63024Sau c63024Sau = c5g6.A01;
                            Bundle A03 = c58883QEt.A03();
                            String str3 = cardDetails.A08;
                            C14360o3.A0B(c43031yW, 1);
                            if (context != null && str3 != null) {
                                ImmutableSet A032 = ImmutableSet.A03(immutableList);
                                if (c43031yW.A08(true)) {
                                    c63024Sau.A06("PROMPTED_PASSKEY_VERIFICATION", A03);
                                    C14360o3.A0B(A032, 2);
                                    AbstractC69814Vw0.A01(context, str3, A1G, A032, tw0, tw02, c64834TVz, tw1, tw5);
                                    return;
                                }
                            }
                        }
                        DefaultVaultService defaultVaultService = this.A0B;
                        C07X A002 = A00(this);
                        C62694SMi c62694SMi = this.A08;
                        Bundle A033 = c58883QEt.A03();
                        SKJ skj = new SKJ(this);
                        C14360o3.A0B(defaultVaultService, 1);
                        AbstractC23641Du.A05(AnonymousClass191.A00, new JWL(A033, A002, c62694SMi, c5g6, defaultVaultService, skj, activity, cardDetails, null, 2), SVZ.A00());
                        return;
                    }
                    return;
                }
                if (this.A06 == null) {
                    return;
                }
                ((SystemWebView) this.A06).A04.autofill(AbstractC63087ScA.A00(this.A02, c5g6.A04, syh.A01(), C63269SgT.A08, C63269SgT.A0B));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01b5, code lost:
    
        if (r1 != 4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r3 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014a, code lost:
    
        if (r5 == false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(X.QIj r10, com.fbpay.w3c.CardDetails r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63380Siu.A0J(X.QIj, com.fbpay.w3c.CardDetails, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r17 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r29 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r3 = r25.A0Q;
        r2 = r3.A02;
        r2.A03(r26, "prompt_type", "CONTACT_AND_PAYMENT_AUTOFILL", 772805755);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        r10 = r3.A00;
        r1 = (X.EnumC61149RgA) r10.A0K.A00;
        r9 = "PROMPTED_AUTOFILL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r17 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r29 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r22 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1 != X.EnumC61149RgA.A03) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r9 = "PROMPTED_PREFETCH";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        r15 = X.AbstractC63355SiC.A03((java.util.List) r10.A0E.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r25.A0P != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r15.isEmpty() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r17 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if ("PAYMENT_AUTOFILL".equals(X.AbstractC63232Sfk.A01(r10)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        r1 = r3.A04;
        r8 = r1.A00;
        r0 = X.C06090Tz.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (X.AbstractC31177DnL.A1U(r0, r8, 36322800416926288L) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
    
        if (X.AbstractC31177DnL.A1U(r0, r8, 36328289383497133L) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (r1.A08(false) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (X.AbstractC31177DnL.A1U(X.C06090Tz.A05, r8, 36322800417057361L) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        r0 = r10.A09.A01;
        r1 = X.AbstractC63387Sj3.A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        if (r1 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        X.AbstractC43592JPx.A1W(r1, r25.A0S, true);
        r25.A0P = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        r7 = A08(r9);
        r1 = r25.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if (r1.A0H() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
    
        r7.A0P = r11;
        X.AbstractC63402SjX.A0B(r3, r1, r7);
        r2.A03(r26, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
        r2.A01(r26, null, 772805755);
        r3 = X.C05F.A00;
        r2 = X.C05F.A01;
        X.AbstractC62769SQl.A01(r10, new X.C51760Mtj(r3, r2, r3, 3), r2);
        A05(r25, true, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        r0 = X.SQk.A00(r22);
        r8 = A08(r9);
        r8.A0H = r0;
        r0 = r25.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        r8.A0P = X.AbstractC167007dF.A1N(r0.A0H() ? 1 : 0);
        r9 = ((X.AbstractC63223SfY) r0).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
    
        if (r29 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
    
        if (r9 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        if (X.AbstractC61721Rsc.A00(r3.A03, new X.TW0(r25, 5)) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0129, code lost:
    
        r2.A03(r26, "prompt_name", "UsageBloksBottomSheetWithMerging", 772805755);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0130, code lost:
    
        if (r27 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013a, code lost:
    
        if (r27.isEmpty() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013c, code lost:
    
        r23 = "BLOKS_HYBRID_PAYMENT_USAGE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
    
        r0.A07(r9, r8, r26, r22, r23, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c8, code lost:
    
        if (r0.A0J() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ca, code lost:
    
        if (r17 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cc, code lost:
    
        r0.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
    
        r23 = "BLOKS_PAYMENT_USAGE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0148, code lost:
    
        r16 = X.AbstractC166987dD.A1F(r28);
        r15 = r0.A0H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0150, code lost:
    
        if (r29 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0152, code lost:
    
        r0.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0155, code lost:
    
        r11 = r25.A0A;
        r10 = X.C06090Tz.A05;
        r12 = X.C18U.A06(r10, r11, 36310426615414849L);
        r9 = r0.A0J();
        r0 = X.C18U.A01(r10, r11, 36591901593763891L);
        r13 = new X.QEF();
        r11 = X.AbstractC166987dD.A0b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0178, code lost:
    
        if (r27 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        r11.putParcelableArrayList("contact_entries", X.AbstractC166987dD.A1F(r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r29 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0183, code lost:
    
        r11.putStringArrayList("requested_fields", X.AbstractC166987dD.A1F(r16));
        r11.putBoolean("is_consent_accepted", r15);
        r11.putBoolean("should_always_show_ads_disclosure", r12);
        r11.putBoolean("should_show_fbpay_disclosure", r9);
        r11.putLong("disable_autofill_dismiss_option", r0);
        r11.putBoolean("has_payment_entries", r29);
        r13.setArguments(r11);
        r13.A01 = r25;
        r13.A02 = r25.A08;
        r13.A00 = r3;
        r2.A03(r26, "prompt_name", "AutofillPaymentBottomSheetDialogFragment", 772805755);
        r0.A09(r13, r8, r26, r22, "AutofillPaymentBottomSheetDialogFragment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f9, code lost:
    
        r22 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0055, code lost:
    
        r22 = X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0057, code lost:
    
        if (r29 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x003b, code lost:
    
        r3 = r25.A0Q;
        r2 = r3.A02;
        r2.A03(r26, "prompt_type", "CONTACT_AUTOFILL", 772805755);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x002f, code lost:
    
        r3 = r25.A0Q;
        r2 = r3.A02;
        r2.A03(r26, "prompt_type", "PAYMENT_AUTOFILL", 772805755);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0011, code lost:
    
        if (r27.isEmpty() != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.QEF, X.QE7, X.0SG, androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0K(java.lang.Integer r26, java.util.List r27, java.util.Set r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63380Siu.A0K(java.lang.Integer, java.util.List, java.util.Set, boolean):void");
    }

    public final void A0L(String str, Integer num) {
        String str2;
        if (str.contains("SHOW_") && str.contains("_DIALOG")) {
            String A0R = AnonymousClass001.A0R("SUPPRESSED_", str.replace("SHOW_", "").replace("_DIALOG", ""));
            if (str.contains("OPT_IN")) {
                A0R = "SUPPRESSED_SAVE";
            }
            HashMap A1G = AbstractC166987dD.A1G();
            if (num.intValue() != 0) {
                str2 = "SuppressAndDeferToClose";
            } else {
                str2 = "SuppressIndefinitely";
            }
            A1G.put("suppress_strategy_type", str2);
            C61602RqR A08 = A08(A0R);
            Map map = A08.A0K;
            if (map == null) {
                map = AbstractC166987dD.A1G();
                A08.A0K = map;
            }
            map.putAll(A1G);
            AbstractC63402SjX.A0A(this.A03.A03(), this.A0Q, A08.A00());
        }
    }

    public final boolean A0M() {
        C5G6 c5g6 = this.A0Q;
        boolean A08 = c5g6.A04.A08(true);
        List list = (List) c5g6.A00.A0E.A00;
        if (A08) {
            ArrayList A12 = AbstractC166997dE.A12(list, 0);
            for (Object obj : list) {
                W3CCardDetail w3CCardDetail = (W3CCardDetail) obj;
                if (C14360o3.A0K(AbstractC63355SiC.A00(w3CCardDetail), MessageAvailabilityResponseId$Companion.AVAILABLE) || AbstractC166997dE.A1Z(w3CCardDetail.A01, true)) {
                    A12.add(obj);
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(A12);
            Iterator it = A12.iterator();
            while (it.hasNext()) {
                A0q.add(((W3CCardDetail) it.next()).A00);
            }
            return AbstractC166987dD.A1b(A0q);
        }
        return AbstractC166987dD.A1b(AbstractC63355SiC.A03(list));
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c3, code lost:
    
        if (r11.equals("PROMPTED_RE_OPT_IN") != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04f4, code lost:
    
        if (r5 == null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (((java.util.List) r1.A04.A02).contains(X.EnumC61119RfZ.A02) != false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00b3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0N(com.facebook.browser.lite.extensions.autofill.model.AutofillData r52, java.lang.String r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63380Siu.A0N(com.facebook.browser.lite.extensions.autofill.model.AutofillData, java.lang.String, boolean):boolean");
    }

    private void A06(Map map, String str) {
        if (!map.isEmpty()) {
            HashMap A10 = AbstractC58318PtA.A10(map);
            A10.put("user_action", str);
            C63305ShB.A01(this.A03.A03(), A10);
        }
    }
}
