package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class T2O implements InterfaceC65504TlY {
    public final PhoneNumberUtil A00;
    public final Context A03;
    public final C62643SKa A01 = new C62643SKa();
    public final SKb A02 = new SKb();
    public final C62985Sa9 A04 = new C62985Sa9();

    public static final synchronized void A04(C58252li c58252li, C69740Vua c69740Vua, T2O t2o, String str, List list) {
        synchronized (t2o) {
            C63406Sjd A0S = AbstractC58318PtA.A0S(c58252li);
            SOu sOu = (SOu) A0S.A01;
            C67524UnO c67524UnO = sOu.A02.A00;
            C14360o3.A0B(list, 0);
            C69764Vv1 c69764Vv1 = new C69764Vv1(c67524UnO, c69740Vua, str, list);
            C69763Vv0 c69763Vv0 = sOu.A00;
            c58252li.A0B(C63406Sjd.A02(A0S, new SOu(new C69763Vv0(c69763Vv0.A00, null, null, c69763Vv0.A03), sOu.A01, c69764Vv1)));
        }
    }

    public final void A0C(C62735SOb c62735SOb, C63406Sjd c63406Sjd) {
        C14360o3.A0B(c62735SOb, 0);
        C58252li A00 = A00(c62735SOb, this);
        if (C63406Sjd.A0J(c63406Sjd)) {
            R1O r1o = (R1O) C63406Sjd.A08(c63406Sjd);
            if (r1o.A0E() == null && C63406Sjd.A0F(A00)) {
                List list = ((SOu) C63406Sjd.A07(A00)).A00.A03;
                C2JS optionalTreeField = r1o.getOptionalTreeField(0, "email", QRY.class, -1147891044);
                if (optionalTreeField != null) {
                    QT8 qt8 = (QT8) optionalTreeField.reinterpretRequired(0, QT8.class, 693675366);
                    C14360o3.A07(qt8);
                    C69776VvD A002 = SS6.A00(qt8);
                    int i = 1;
                    if (!(!list.isEmpty()) || !((C69776VvD) list.get(0)).A03) {
                        i = 0;
                    }
                    A05(A00, null, A002.A01, AbstractC63058Sbf.A02(A002, list, C65081TdE.A00, i));
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }

    public final void A0E(C62735SOb c62735SOb, C63406Sjd c63406Sjd) {
        C14360o3.A0B(c62735SOb, 0);
        C58252li A00 = A00(c62735SOb, this);
        if (C63406Sjd.A0J(c63406Sjd)) {
            R1S r1s = (R1S) C63406Sjd.A08(c63406Sjd);
            if (r1s.A0E() == null && C63406Sjd.A0F(A00)) {
                List list = ((SOu) C63406Sjd.A07(A00)).A02.A03;
                C2JS optionalTreeField = r1s.getOptionalTreeField(0, "phone", QWO.class, -1981689008);
                if (optionalTreeField != null) {
                    QTY qty = (QTY) optionalTreeField.reinterpretRequired(0, QTY.class, 1741235608);
                    C14360o3.A07(qty);
                    C69772Vv9 A01 = SS6.A01(qty);
                    int i = 1;
                    if (!(!list.isEmpty()) || !((C69772Vv9) list.get(0)).A04) {
                        i = 0;
                    }
                    A04(A00, null, this, A01.A02, AbstractC63058Sbf.A02(A01, list, C65082TdF.A00, i));
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.0Zx, X.QCo] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.0Zx, X.QCo] */
    @Override // X.InterfaceC65504TlY
    public final C2GT AOg(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        Object obj = sparseArray.get(12);
        if (obj != null) {
            String str4 = (String) obj;
            C62735SOb c62735SOb = new C62735SOb(otcInput2, str2);
            if (i != 0) {
                if (i == 1) {
                    C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str4, "email_id");
                    C0CA.A00(A0T, true, "skip_validation");
                    C0CA.A00(A0T, "DELETE", "mutation_type");
                    Be9 be9 = new Be9();
                    be9.A07(str, AbstractC63083Sc6.A00());
                    be9.A07(c62735SOb.A01, "product_id");
                    be9.A07(str3, "client_receiver_id");
                    AbstractC31173DnH.A1M(A0T, be9, "email_input");
                    be9.A07("", "platform_trust_token");
                    AbstractC63060Sbh.A02(be9, otcInput);
                    ?? c0Zx = new C0Zx();
                    c0Zx.A01(AbstractC58323PtF.A0L(c0Zx, "email", "DELETE"), "mutation_type");
                    C65049Tce c65049Tce = C65049Tce.A00;
                    MHY mhy = new MHY(c0Zx, loggingContext, otcInput, 1);
                    C43650JSi c43650JSi = new C43650JSi(c0Zx, loggingContext, otcInput, 4);
                    mhy.invoke();
                    Q8J A00 = REV.A00(C2FP.A06(), new C63544SpC(this, 1), new C63582Spp(be9, this, str2, 0), 1);
                    C14360o3.A0A(A00);
                    C58252li A01 = C75M.A01(A00, new C65076Td9(42, c43650JSi, c65049Tce));
                    A02(A01, c62735SOb, this, "DELETE", str4);
                    return A01;
                }
                throw AbstractC25230BEn.A0n("{ContactInformationRepoImpl} deleteMutation is not supported for identifier => ", i);
            }
            C0CA A0T2 = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str4, "phone_id");
            C0CA.A00(A0T2, true, "skip_validation");
            C0CA.A00(A0T2, "DELETE", "mutation_type");
            Be9 be92 = new Be9();
            be92.A07(str, AbstractC63083Sc6.A00());
            be92.A07(c62735SOb.A01, "product_id");
            be92.A07(str3, "client_receiver_id");
            AbstractC31173DnH.A1M(A0T2, be92, "phone_input");
            be92.A07("", "platform_trust_token");
            AbstractC63060Sbh.A02(be92, otcInput);
            ?? c0Zx2 = new C0Zx();
            c0Zx2.A01(AbstractC58323PtF.A0L(c0Zx2, "phone", "DELETE"), "mutation_type");
            C65050Tcf c65050Tcf = C65050Tcf.A00;
            MHY mhy2 = new MHY(c0Zx2, loggingContext, otcInput, 2);
            C43650JSi c43650JSi2 = new C43650JSi(c0Zx2, loggingContext, otcInput, 5);
            mhy2.invoke();
            Q8J A002 = REV.A00(C2FP.A06(), new C63544SpC(this, 0), new C63582Spp(be92, this, str2, 0), 1);
            C14360o3.A0A(A002);
            C58252li A012 = C75M.A01(A002, new C65076Td9(42, c43650JSi2, c65050Tcf));
            A03(A012, c62735SOb, this, "DELETE", str4);
            return A012;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00df A[Catch: 40f -> 0x00eb, TRY_LEAVE, TryCatch #0 {40f -> 0x00eb, blocks: (B:26:0x00d2, B:28:0x00df), top: B:25:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    @Override // X.InterfaceC65504TlY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C58252li ENq(android.util.SparseArray r26, com.facebookpay.logging.LoggingContext r27, com.facebookpay.otc.models.OtcInput r28, com.facebookpay.otc.models.OtcInput r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T2O.ENq(android.util.SparseArray, com.facebookpay.logging.LoggingContext, com.facebookpay.otc.models.OtcInput, com.facebookpay.otc.models.OtcInput, java.lang.String, java.lang.String, java.lang.String, int):X.2li");
    }

    public static final void A02(C2GT c2gt, C62735SOb c62735SOb, T2O t2o, String str, String str2) {
        C14360o3.A0C(c2gt, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.EmailResponse>>");
        C58252li A01 = C75M.A01(c2gt, C65051Tcg.A00);
        C58252li A00 = A00(c62735SOb, t2o);
        C14360o3.A0C(A01, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayEmailResponse>>");
        A00.A0E(A01, new C65991Txk(1, new C65026TcC(A00, t2o, c62735SOb, A01, str, str2, 0)));
    }

    public static final void A03(C2GT c2gt, C62735SOb c62735SOb, T2O t2o, String str, String str2) {
        C14360o3.A0C(c2gt, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.PhoneResponse>>");
        C58252li A01 = C75M.A01(c2gt, C65052Tch.A00);
        C58252li A00 = A00(c62735SOb, t2o);
        C14360o3.A0C(A01, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayPhoneNumberResponse>>");
        A00.A0E(A01, new C65991Txk(1, new C65026TcC(A00, t2o, c62735SOb, A01, str, str2, 1)));
    }

    public static void A06(String str, String str2, AbstractCollection abstractCollection) {
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("mutation_data", str);
        c0Zx.A01(RiI.valueOf(str2), "mutation_type");
        abstractCollection.add(c0Zx);
    }

    public final void A0B(C62735SOb c62735SOb) {
        C62985Sa9.A00(this.A04, c62735SOb.A00, c62735SOb);
    }

    public T2O(Context context) {
        this.A03 = context;
        this.A00 = PhoneNumberUtil.A01(context);
    }

    public static C58252li A00(C62735SOb c62735SOb, T2O t2o) {
        C58252li A07 = t2o.A07(c62735SOb);
        C14360o3.A0C(A07, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        return A07;
    }

    public static final ArrayList A01(SparseArray sparseArray, String str) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Object obj = sparseArray.get(2);
        Object obj2 = null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        Object obj3 = sparseArray.get(1);
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        Object obj4 = sparseArray.get(0);
        if (obj4 instanceof String) {
            obj2 = obj4;
        }
        if (obj != null) {
            A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str, A1E);
        }
        if (obj3 != null) {
            A06("email", str, A1E);
        }
        if (obj2 != null) {
            A06("phone", str, A1E);
        }
        return A1E;
    }

    public static final void A05(C58252li c58252li, C69740Vua c69740Vua, String str, List list) {
        C63406Sjd A0S = AbstractC58318PtA.A0S(c58252li);
        SOu sOu = (SOu) A0S.A01;
        C67524UnO c67524UnO = sOu.A00.A00;
        C14360o3.A0B(list, 0);
        C69763Vv0 c69763Vv0 = new C69763Vv0(c67524UnO, c69740Vua, str, list);
        C69764Vv1 c69764Vv1 = sOu.A02;
        c58252li.A0B(C63406Sjd.A02(A0S, new SOu(c69763Vv0, sOu.A01, new C69764Vv1(c69764Vv1.A00, null, null, c69764Vv1.A03))));
    }

    public final C58252li A07(C62735SOb c62735SOb) {
        boolean A02 = C2FP.A0D().A02();
        C63406Sjd c63406Sjd = null;
        C62985Sa9 c62985Sa9 = this.A04;
        if (!A02) {
            c63406Sjd = C63406Sjd.A03(null);
        }
        return c62985Sa9.A01(c63406Sjd, c62735SOb);
    }

    public final C58252li A08(C63019Saj c63019Saj, LoggingContext loggingContext, boolean z) {
        C62735SOb A00 = AbstractC62191S1m.A00(c63019Saj);
        C62985Sa9 c62985Sa9 = this.A04;
        if (c62985Sa9.A03(A00) == null) {
            if (!C2FP.A0D().A02()) {
                C63406Sjd.A0D(c62985Sa9.A01(C63406Sjd.A03(null), A00), null);
            }
            A09(c63019Saj, loggingContext, z);
        }
        return A07(A00);
    }

    public final C58252li A09(C63019Saj c63019Saj, LoggingContext loggingContext, boolean z) {
        C70073W1q c70073W1q;
        Wap A0H = AbstractC43592JPx.A0H();
        List A1J = AbstractC166987dD.A1J(EnumC129485tD.A05);
        String str = c63019Saj.A09;
        boolean A0K = C14360o3.A0K(str, "PRE_WARM");
        OtcInput otcInput = c63019Saj.A04;
        if (otcInput != null) {
            c70073W1q = AbstractC63060Sbh.A01(otcInput);
        } else {
            c70073W1q = null;
        }
        A0H.A0U(loggingContext, str, A1J, AbstractC58320PtC.A1B(c70073W1q), A0K);
        A0A(AbstractC62191S1m.A00(c63019Saj));
        c63019Saj.A01(ImmutableList.of((Object) "CONTACT_INFORMATION"));
        REP rep = new REP(C2FP.A06(), this, c63019Saj, 0, z);
        AbstractC63144Sdq.A02(rep);
        Q8J q8j = ((AbstractC63144Sdq) rep).A03;
        C58252li A00 = A00(AbstractC62191S1m.A00(c63019Saj), this);
        if (A00.A02() == null) {
            C63406Sjd.A0D(A00, null);
        }
        C14360o3.A0A(q8j);
        AbstractC63246Sg0.A02(q8j, A00, new C63626SqY(A00, c63019Saj, loggingContext, 2));
        return A00;
    }

    public final void A0A(C62735SOb c62735SOb) {
        C63406Sjd c63406Sjd;
        C58252li A00 = A00(c62735SOb, this);
        C63406Sjd A0S = AbstractC58318PtA.A0S(A00);
        if (A0S != null) {
            c63406Sjd = C63406Sjd.A01(C63554SpM.A00, A0S);
        } else {
            c63406Sjd = null;
        }
        A00.A0B(c63406Sjd);
    }

    public final void A0D(C62735SOb c62735SOb, C63406Sjd c63406Sjd) {
        AbstractC167017dG.A1N(c62735SOb, c63406Sjd);
        C58252li A00 = A00(c62735SOb, this);
        if (C63406Sjd.A0J(c63406Sjd)) {
            C60474R0a c60474R0a = (C60474R0a) C63406Sjd.A08(c63406Sjd);
            if (c60474R0a.A0E() == null && C63406Sjd.A0F(A00)) {
                String A07 = c60474R0a.A07("payer_name_on_file");
                if (A07 != null) {
                    C63406Sjd A0S = AbstractC58318PtA.A0S(A00);
                    SOu sOu = (SOu) A0S.A01;
                    C62736SOc c62736SOc = new C62736SOc(sOu.A01.A00, A07);
                    C69763Vv0 c69763Vv0 = sOu.A00;
                    C69763Vv0 c69763Vv02 = new C69763Vv0(c69763Vv0.A00, null, null, c69763Vv0.A03);
                    C69764Vv1 c69764Vv1 = sOu.A02;
                    A00.A0B(C63406Sjd.A02(A0S, new SOu(c69763Vv02, c62736SOc, new C69764Vv1(c69764Vv1.A00, null, null, c69764Vv1.A03))));
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }

    public final boolean A0F(C62735SOb c62735SOb) {
        SOu sOu;
        C63406Sjd A0S = AbstractC58318PtA.A0S(A07(c62735SOb));
        if (A0S == null || (sOu = (SOu) A0S.A01) == null || !AbstractC166987dD.A1b(sOu.A00.A03)) {
            return false;
        }
        return true;
    }

    public final boolean A0G(C62735SOb c62735SOb) {
        SOu sOu;
        String str;
        C63406Sjd A0S = AbstractC58318PtA.A0S(A07(c62735SOb));
        if (A0S == null || (sOu = (SOu) A0S.A01) == null || (str = sOu.A01.A01) == null || AbstractC001900j.A0T(str)) {
            return false;
        }
        return true;
    }

    public final boolean A0H(C62735SOb c62735SOb) {
        SOu sOu;
        C63406Sjd A0S = AbstractC58318PtA.A0S(A07(c62735SOb));
        if (A0S == null || (sOu = (SOu) A0S.A01) == null || !AbstractC166987dD.A1b(sOu.A02.A03)) {
            return false;
        }
        return true;
    }
}
