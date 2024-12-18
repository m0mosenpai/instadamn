package X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Pwy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58530Pwy extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C58530Pwy(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static String A00(AbstractC907342m abstractC907342m, Map map) {
        Sg3.A03(map, "email", abstractC907342m.A05("email"));
        Sg3.A03(map, "family-name", abstractC907342m.A05("family_name"));
        Sg3.A03(map, "given-name", abstractC907342m.A05("given_name"));
        return abstractC907342m.A05("postal_code");
    }

    public static String A01(AbstractC907342m abstractC907342m, Map map) {
        Sg3.A03(map, "address-level1", abstractC907342m.A05("address_level1"));
        Sg3.A03(map, "address-level2", abstractC907342m.A05("address_level2"));
        Sg3.A03(map, "address-level3", abstractC907342m.A05("address_level3"));
        Sg3.A03(map, "address-line1", abstractC907342m.A05("address_line1"));
        return abstractC907342m.A05("address_line2");
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 3:
                A03 = C0f9.A03(1081394630);
                super.onFail(abstractC115105If);
                i = 2035589198;
                break;
            case 4:
                A03 = C0f9.A03(-1468328783);
                SCX A00 = AbstractC62276S4v.A00((UserSession) this.A02);
                C16930sl c16930sl = C16930sl.A00;
                C14360o3.A0B(c16930sl, 0);
                A00.A00 = c16930sl;
                AbstractC25225BEi.A1U(this.A01, c16930sl);
                i = -621592757;
                break;
            case 5:
                A03 = C0f9.A03(-691163538);
                InterfaceC65530Tm0 interfaceC65530Tm0 = (InterfaceC65530Tm0) this.A01;
                if (interfaceC65530Tm0 != null) {
                    interfaceC65530Tm0.onFailure(abstractC115105If.A01());
                }
                i = -1058728674;
                break;
            case 6:
                A03 = C0f9.A03(442951253);
                InterfaceC65530Tm0 interfaceC65530Tm02 = (InterfaceC65530Tm0) this.A01;
                if (interfaceC65530Tm02 != null) {
                    interfaceC65530Tm02.onFailure(abstractC115105If.A01());
                }
                i = -1782810073;
                break;
            case 7:
                A03 = C0f9.A03(1939281988);
                InterfaceC65530Tm0 interfaceC65530Tm03 = (InterfaceC65530Tm0) this.A01;
                if (interfaceC65530Tm03 != null) {
                    interfaceC65530Tm03.onFailure(abstractC115105If.A01());
                }
                i = -1886077442;
                break;
            case 8:
            default:
                super.onFail(abstractC115105If);
                return;
            case 9:
                A03 = C0f9.A03(303677070);
                Throwable A01 = abstractC115105If.A01();
                if (A01 == null) {
                    A01 = new Exception("ZBD HTTP request failed with an unknown error");
                }
                ((InterfaceC65503TlX) this.A02).DGF(404, A01);
                i = -528528070;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.1P1, X.Pwy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        int i2;
        SCX A00;
        C16930sl c16930sl;
        C2JS optionalTreeField;
        ImmutableList requiredCompactedTreeListField;
        int i3;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(-1787604104);
                C124525kA c124525kA = (C124525kA) obj;
                int A0N = AbstractC167017dG.A0N(c124525kA, -619657748);
                AnonymousClass961 A002 = AnonymousClass960.A00((Context) this.A01, (UserSession) this.A02);
                String str = c124525kA.A00;
                InterfaceC19610xo ARD = A002.A00.ARD();
                ARD.E7K("autofill_js", str);
                ARD.apply();
                C0f9.A0A(-1940363273, A0N);
                i = -1257830536;
                break;
            case 3:
                A03 = C0f9.A03(2129262875);
                int A032 = C0f9.A03(1585884892);
                C34649FOh c34649FOh = ((ECB) obj).A00;
                if (c34649FOh == null) {
                    i2 = 1272399114;
                } else {
                    C63971Swx c63971Swx = (C63971Swx) this.A01;
                    C63971Swx.A00(c63971Swx, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c34649FOh.A0F);
                    String str2 = c34649FOh.A0F;
                    if (str2 != null) {
                        String[] split = str2.split(" ");
                        C63971Swx.A00(c63971Swx, "given-name", split[0]);
                        int length = split.length;
                        if (length > 1) {
                            C63971Swx.A00(c63971Swx, "family-name", split[length - 1]);
                        }
                    }
                    C63971Swx.A00(c63971Swx, "email", c34649FOh.A0D);
                    C63971Swx.A00(c63971Swx, "tel", c34649FOh.A0M);
                    InterfaceC65333TiE interfaceC65333TiE = (InterfaceC65333TiE) this.A02;
                    HashMap hashMap = c63971Swx.A03;
                    SZQ szq = SYP.A02;
                    interfaceC65333TiE.CyN(szq.A02(hashMap), c63971Swx.A01.A00(hashMap), szq.A01(hashMap), SZQ.A00(hashMap));
                    c63971Swx.A05 = true;
                    i2 = -2116366450;
                }
                C0f9.A0A(i2, A032);
                i = 2095916166;
                break;
            case 4:
                A03 = C0f9.A03(294314951);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A033 = C0f9.A03(949280123);
                C14360o3.A0B(anonymousClass435, 0);
                C2JS c2js = (C2JS) anonymousClass435.A01;
                if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, "me", C59986Qs8.class, 532359718)) != null && (requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "shared_accounts", C59985Qs7.class, -129741997)) != null) {
                    ?? A0q = AbstractC167017dG.A0q(requiredCompactedTreeListField);
                    Iterator it = requiredCompactedTreeListField.iterator();
                    while (it.hasNext()) {
                        C2JS c2js2 = (C2JS) it.next();
                        A0q.add(new C45116Jxl(c2js2.getOptionalStringField(0, "instagram_user_id"), c2js2.A08(AbstractC58357Ptx.A00()), c2js2.A09("profile_image_uri(size:150)"), 17));
                    }
                    A00 = AbstractC62276S4v.A00((UserSession) this.A02);
                    c16930sl = A0q;
                } else {
                    A00 = AbstractC62276S4v.A00((UserSession) this.A02);
                    C16930sl c16930sl2 = C16930sl.A00;
                    C14360o3.A0B(c16930sl2, 0);
                    c16930sl = c16930sl2;
                }
                A00.A00 = c16930sl;
                AbstractC25225BEi.A1U(this.A01, c16930sl);
                C0f9.A0A(1927238318, A033);
                i = -699392481;
                break;
            case 5:
                A03 = C0f9.A03(1059451560);
                int A034 = C0f9.A03(-2096709231);
                Object obj2 = ((AnonymousClass435) obj).A01;
                if (obj2 != null) {
                    C58904QHo c58904QHo = (C58904QHo) obj2;
                    if (c58904QHo.A07() != null) {
                        C23031Ai A003 = AbstractC23021Ah.A00((UserSession) this.A02);
                        boolean A06 = c58904QHo.A07().A06("is_payment_autofill_opt_in");
                        int optInt = c58904QHo.A07().A00.optInt("payment_autofill_consecutive_neg_interaction");
                        A003.A1H(A06);
                        A003.A0U(optInt);
                        InterfaceC65530Tm0 interfaceC65530Tm0 = (InterfaceC65530Tm0) this.A01;
                        if (interfaceC65530Tm0 != null) {
                            interfaceC65530Tm0.DqB(Integer.valueOf(optInt));
                        }
                    }
                }
                C0f9.A0A(1474918366, A034);
                i = -2001641954;
                break;
            case 6:
                A03 = C0f9.A03(1209989495);
                int A035 = C0f9.A03(-1326345471);
                Object obj3 = ((AnonymousClass435) obj).A01;
                if (obj3 != null) {
                    C58904QHo c58904QHo2 = (C58904QHo) obj3;
                    if (c58904QHo2.A07() != null) {
                        int optInt2 = c58904QHo2.A07().A00.optInt("consecutive_neg_interaction");
                        ((C23031Ai) this.A02).A0V(optInt2);
                        InterfaceC65530Tm0 interfaceC65530Tm02 = (InterfaceC65530Tm0) this.A01;
                        if (interfaceC65530Tm02 != null) {
                            interfaceC65530Tm02.DqB(Integer.valueOf(optInt2));
                        }
                    }
                }
                C0f9.A0A(86403517, A035);
                i = 552426477;
                break;
            case 7:
                A03 = C0f9.A03(-1887706230);
                int A036 = C0f9.A03(1717803004);
                Object obj4 = ((AnonymousClass435) obj).A01;
                if (obj4 != null) {
                    AbstractC907342m abstractC907342m = (AbstractC907342m) obj4;
                    if (abstractC907342m.A00(QHZ.class, "ig_iab_autofill_update_settings") != null) {
                        int optInt3 = abstractC907342m.A00(QHZ.class, "ig_iab_autofill_update_settings").A00.optInt("count");
                        C23031Ai c23031Ai = (C23031Ai) this.A02;
                        c23031Ai.A0N.Egi(c23031Ai, true, C23031Ai.A8c[164]);
                        c23031Ai.A0V(optInt3);
                        InterfaceC65530Tm0 interfaceC65530Tm03 = (InterfaceC65530Tm0) this.A01;
                        if (interfaceC65530Tm03 != null) {
                            interfaceC65530Tm03.DqB(Integer.valueOf(optInt3));
                        }
                    }
                }
                C0f9.A0A(-1756451708, A036);
                i = -2012838601;
                break;
            case 8:
                A03 = C0f9.A03(650254623);
                RaW raW = (RaW) obj;
                int A037 = C0f9.A03(2030957176);
                super.onSuccess(raW);
                ((AtomicReference) this.A02).set(raW.A00);
                C0f9.A0A(-1161646970, A037);
                i = -1324405485;
                break;
            case 9:
                A03 = C0f9.A03(-868001729);
                Q0U q0u = (Q0U) obj;
                int A038 = C0f9.A03(-26762464);
                if (((SLN) this.A01).A00.getBoolean("zero_balance_simulation", false)) {
                    ((InterfaceC65503TlX) this.A02).DGF(-1, new Throwable("Deliberately failing the ZBD ping for internal settings zero balance simulation"));
                    i3 = 862203652;
                } else {
                    ((InterfaceC65503TlX) this.A02).onSuccess(q0u.A00.A02);
                    i3 = -443708036;
                }
                C0f9.A0A(i3, A038);
                i = -302629120;
                break;
            default:
                super.onSuccess(obj);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        int i2;
        AbstractC907342m A00;
        AbstractC907342m abstractC907342m;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        AbstractC907342m A002;
        ArrayList A1E;
        int i3;
        ImmutableList A02;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1398449557);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A0N = AbstractC167017dG.A0N(anonymousClass435, 1357506000);
                Object obj2 = anonymousClass435.A01;
                if (obj2 == null) {
                    C0w9.A03("AutofillGraphQLRequest", "Error creating query autofill response");
                    i3 = -227258989;
                } else {
                    AbstractC907342m abstractC907342m2 = (AbstractC907342m) obj2;
                    if (abstractC907342m2 != null && (A02 = abstractC907342m2.A02("ig_iab_autofill_data_multi_entries", QHQ.class)) != null) {
                        A1E = AbstractC166987dD.A1F(A02);
                    } else {
                        A1E = AbstractC166987dD.A1E();
                    }
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it = A1E.iterator();
                    while (it.hasNext()) {
                        AbstractC907342m abstractC907342m3 = (AbstractC907342m) it.next();
                        HashMap A1G = AbstractC166987dD.A1G();
                        Sg3.A03(A1G, PublicKeyCredentialControllerUtility.JSON_KEY_ID, abstractC907342m3.A05("ent_id"));
                        Sg3.A03(A1G, "given-name", abstractC907342m3.A05("given_name"));
                        Sg3.A03(A1G, "family-name", abstractC907342m3.A05("family_name"));
                        Sg3.A03(A1G, "address-line1", abstractC907342m3.A05("address_line1"));
                        Sg3.A03(A1G, "address-line2", abstractC907342m3.A05("address_line2"));
                        Sg3.A03(A1G, "address-level1", abstractC907342m3.A05("address_level1"));
                        Sg3.A03(A1G, "address-level2", abstractC907342m3.A05("address_level2"));
                        Sg3.A03(A1G, "postal-code", abstractC907342m3.A05("postal_code"));
                        Sg3.A03(A1G, "country", abstractC907342m3.A05("country"));
                        Sg3.A03(A1G, "email", abstractC907342m3.A05("email"));
                        Sg3.A03(A1G, "tel", abstractC907342m3.A05("tel"));
                        A1E2.add(new AutofillData(A1G));
                    }
                    SharedPreferences.Editor edit = C20J.A00().edit();
                    Map<String, ?> all = C20J.A00().getAll();
                    C14360o3.A07(all);
                    if (MSW.A1b(all)) {
                        edit.clear();
                    }
                    Iterator it2 = A1E2.iterator();
                    while (it2.hasNext()) {
                        AutofillData autofillData = (AutofillData) it2.next();
                        String A1A = AbstractC166987dD.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, autofillData.A00);
                        if (A1A != null) {
                            AbstractC58318PtA.A1C(edit, A1A, autofillData.A01().toString());
                        }
                    }
                    i3 = 283157984;
                }
                C0f9.A0A(i3, A0N);
                i2 = -1926383504;
                break;
            case 1:
                A03 = C0f9.A03(-301195662);
                AnonymousClass435 anonymousClass4352 = (AnonymousClass435) obj;
                int A0N2 = AbstractC167017dG.A0N(anonymousClass4352, -1314315118);
                AbstractC907342m abstractC907342m4 = (AbstractC907342m) anonymousClass4352.A01;
                String str10 = null;
                if (abstractC907342m4 != null && (A00 = abstractC907342m4.A00(QHM.class, "iab_autofill_data")) != null && A00.A00(QHH.class, "data") != null) {
                    SharedPreferences sharedPreferences = C20J.A02;
                    if (sharedPreferences != null) {
                        AbstractC58320PtC.A1E(sharedPreferences);
                        AbstractC907342m A003 = abstractC907342m4.A00(QHM.class, "iab_autofill_data");
                        if (A003 != null) {
                            abstractC907342m = A003.A00(QHH.class, "data");
                        } else {
                            abstractC907342m = null;
                        }
                        HashMap A1G2 = AbstractC166987dD.A1G();
                        if (abstractC907342m != null) {
                            str = abstractC907342m.A05("given_name");
                        } else {
                            str = null;
                        }
                        Sg3.A03(A1G2, "given-name", str);
                        if (abstractC907342m != null) {
                            str2 = abstractC907342m.A05("family_name");
                        } else {
                            str2 = null;
                        }
                        Sg3.A03(A1G2, "family-name", str2);
                        if (abstractC907342m != null) {
                            str3 = abstractC907342m.A05("address_line1");
                        } else {
                            str3 = null;
                        }
                        Sg3.A03(A1G2, "address-line1", str3);
                        if (abstractC907342m != null) {
                            str4 = abstractC907342m.A05("address_line2");
                        } else {
                            str4 = null;
                        }
                        Sg3.A03(A1G2, "address-line2", str4);
                        if (abstractC907342m != null) {
                            str5 = abstractC907342m.A05("address_level1");
                        } else {
                            str5 = null;
                        }
                        Sg3.A03(A1G2, "address-level1", str5);
                        if (abstractC907342m != null) {
                            str6 = abstractC907342m.A05("address_level2");
                        } else {
                            str6 = null;
                        }
                        Sg3.A03(A1G2, "address-level2", str6);
                        if (abstractC907342m != null) {
                            str7 = abstractC907342m.A05("postal_code");
                        } else {
                            str7 = null;
                        }
                        Sg3.A03(A1G2, "postal-code", str7);
                        if (abstractC907342m != null) {
                            str8 = abstractC907342m.A05("country");
                        } else {
                            str8 = null;
                        }
                        Sg3.A03(A1G2, "country", str8);
                        if (abstractC907342m != null) {
                            str9 = abstractC907342m.A05("email");
                        } else {
                            str9 = null;
                        }
                        Sg3.A03(A1G2, "email", str9);
                        if (abstractC907342m != null) {
                            str10 = abstractC907342m.A05("tel");
                        }
                        Sg3.A03(A1G2, "tel", str10);
                        AutofillData autofillData2 = new AutofillData(A1G2);
                        Iterator A0k = AbstractC167007dF.A0k(A1G2);
                        while (true) {
                            if (A0k.hasNext()) {
                                String A1B = AbstractC166987dD.A1B(A0k);
                                if (A1B != null && A1B.length() != 0) {
                                    C20J.A01(autofillData2);
                                }
                            } else {
                                AbstractC58320PtC.A1E(C20J.A00());
                            }
                        }
                        AbstractC907342m A004 = abstractC907342m4.A00(QHM.class, "iab_autofill_data");
                        if (A004 != null && (A002 = A004.A00(QHL.class, "iab_autofill_wallet_data")) != null) {
                            AbstractC907342m A005 = A002.A00(QHI.class, "crossapp_autofill");
                            HashMap A1G3 = AbstractC166987dD.A1G();
                            if (A005 != null) {
                                Sg3.A03(A1G3, "address-line2", A01(A005, A1G3));
                                Sg3.A03(A1G3, "postal-code", A00(A005, A1G3));
                                Sg3.A03(A1G3, "tel", A005.A05("tel"));
                            }
                            AbstractC907342m A006 = A002.A00(QHJ.class, "default_wallet");
                            HashMap A1G4 = AbstractC166987dD.A1G();
                            if (A006 != null) {
                                Sg3.A03(A1G4, "address-line2", A01(A006, A1G4));
                                Sg3.A03(A1G4, "postal-code", A00(A006, A1G4));
                                Sg3.A03(A1G4, "tel", A006.A05("tel"));
                            }
                            AbstractC907342m A007 = A002.A00(QHK.class, "recent_wallet");
                            HashMap A1G5 = AbstractC166987dD.A1G();
                            if (A007 != null) {
                                Sg3.A03(A1G5, "address-line2", A01(A007, A1G5));
                                Sg3.A03(A1G5, "postal-code", A00(A007, A1G5));
                                Sg3.A03(A1G5, "tel", A007.A05("tel"));
                            }
                            SharedPreferences sharedPreferences2 = C20J.A02;
                            if (sharedPreferences2 != null) {
                                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                if (!A1G3.isEmpty()) {
                                    AbstractC58318PtA.A1C(edit2, "cross_app", new AutofillData(A1G3).A01().toString());
                                }
                                if (!A1G4.isEmpty()) {
                                    AbstractC58318PtA.A1C(edit2, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, new AutofillData(A1G4).A01().toString());
                                }
                                if (!A1G5.isEmpty()) {
                                    AbstractC58318PtA.A1C(edit2, "recent", new AutofillData(A1G5).A01().toString());
                                }
                            }
                        }
                        i = -413142143;
                    }
                    C14360o3.A0F("walletContactDataStore");
                    throw C00O.createAndThrow();
                }
                C0w9.A03("AutofillGraphQLRequest", "Error creating query autofill response");
                i = -1271308291;
                C0f9.A0A(i, A0N2);
                i2 = 943173104;
                break;
            default:
                super.onSuccessInBackground(obj);
                return;
        }
        C0f9.A0A(i2, A03);
    }
}
