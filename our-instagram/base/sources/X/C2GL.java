package X;

import android.content.Context;
import android.util.Base64;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.2GL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GL extends C2GM {
    public static final C2GO A05 = new Object();
    public boolean A00;
    public final Context A01;
    public final C2GP A02;
    public final UserSession A03;
    public final C47522Gc A04;

    public static final void A00(C2GL c2gl) {
        UserSession userSession = c2gl.A03;
        C69572Vrb c69572Vrb = new C69572Vrb(AbstractC12220kQ.A02(userSession));
        ((C2GM) c2gl).A03 = c69572Vrb;
        boolean z = c2gl.A00;
        C2Hn c2Hn = c2gl.A04.A00;
        String A00 = AbstractC69851Vwc.A00(c2Hn.A03);
        String A002 = AbstractC69851Vwc.A00(c2Hn.A04);
        C06090Tz c06090Tz = C06090Tz.A06;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36310426619019364L);
        Boolean valueOf = Boolean.valueOf(A06);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36310426618822754L);
        Boolean valueOf2 = Boolean.valueOf(A062);
        long A01 = C18U.A01(c06090Tz, userSession, 36591901595795512L);
        Long valueOf3 = Long.valueOf(A01);
        long A012 = C18U.A01(c06090Tz, userSession, 36591901595926586L);
        Long valueOf4 = Long.valueOf(A012);
        long A013 = C18U.A01(c06090Tz, userSession, 36591901595861049L);
        Long valueOf5 = Long.valueOf(A013);
        String A04 = C18U.A04(c06090Tz, userSession, 36873376572702733L);
        HashMap hashMap = new HashMap();
        if (valueOf != null) {
            hashMap.put("autofill_migration_enabled", String.valueOf(A06));
        }
        if (valueOf2 != null) {
            hashMap.put("autofill_new_key_generation_enabled", String.valueOf(A062));
        }
        if (valueOf3 != null) {
            hashMap.put("card_binding_migration_periodic_trigger_days", String.valueOf(A01));
        }
        if (valueOf4 != null) {
            hashMap.put("card_binding_migration_retry_limit", String.valueOf(A012));
        }
        if (valueOf5 != null) {
            hashMap.put("card_binding_migration_retry_backoff_days", String.valueOf(A013));
        }
        hashMap.put("card_binding_migration_force_run_token", A04);
        LinkedHashMap A014 = AbstractC69851Vwc.A01(null, ((C2GM) c2gl).A00);
        C18920wW c18920wW = (C18920wW) c69572Vrb.A00;
        InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "client_copy_autofillproof_init");
        if (A003.isSampled()) {
            UL8 ul8 = new UL8();
            ul8.A03("has_legacy_key", Boolean.valueOf(z));
            ul8.A06("legacy_key_migration_status", A00);
            ul8.A08("migration_gk_statuses", hashMap);
            ul8.A06("cross_app_migration_status", A002);
            A003.AAP(AbstractC58358Pty.A01(9, 10, 108), c69572Vrb.A01);
            A003.A8R(C2O5.A04, "product_type");
            A003.A8R(EnumC31203Dnm.ANDROID, "platform");
            C14360o3.A07(c69572Vrb.A02.getValue());
            A003.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
            A003.AAQ(ul8, "event_payload");
            A003.A9M("extra_data", A014);
            A003.Cht();
        }
    }

    public final void A02(String str) {
        String str2;
        try {
            UserSession userSession = this.A03;
            C49352Or c49352Or = new C49352Or(userSession.userId);
            C49352Or c49352Or2 = new C49352Or("autofill_key");
            C19U A01 = C11830jh.A04.A01(userSession).A01(C19T.A1m);
            if (A01 != null) {
                str2 = A01.A01;
            } else {
                str2 = null;
            }
            String A00 = c49352Or.A00();
            String A002 = c49352Or2.A00();
            String A02 = c49352Or.A02(c49352Or2.A03());
            byte[] decode = Base64.decode(str, 11);
            C14360o3.A07(decode);
            String A022 = c49352Or2.A02(decode);
            C58444PvN c58444PvN = new C58444PvN();
            C0CA A023 = GraphQlCallInput.A02.A02();
            C0CA.A00(A023, A002, "app_key");
            C0CA.A00(A023, A02, "app_key_signature");
            C0CA.A00(A023, str, "cross_app_key");
            C0CA.A00(A023, A022, "cross_app_key_signature");
            C0CA.A00(A023, A00, "legacy_app_key");
            C0CA.A00(A023, str2, "family_device_id");
            try {
                Object invoke = CWy.class.getMethod("create", new Class[0]).invoke(null, new Object[0]);
                C14360o3.A0C(invoke, "null cannot be cast to non-null type com.fbpay.w3c.api.AutofillMigrateCreditCardMutation.BuilderForInput");
                C28929Cpd c28929Cpd = (C28929Cpd) invoke;
                c28929Cpd.A00.A00.A02().A0E(A023, "input");
                c28929Cpd.A01 = true;
                PandoGraphQLRequest build = c28929Cpd.build();
                C2FP.A06().A00.A00.ATV(new C63995SxS(c58444PvN), new C64007Sxe(c58444PvN), build);
                Q8H q8h = new Q8H(c58444PvN);
                C70305WQk c70305WQk = new C70305WQk(q8h, this);
                super.A02 = c70305WQk;
                List list = this.A05;
                list.add(c70305WQk);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    q8h.A06(C65705Tsd.A08, (InterfaceC58362lv) it.next());
                }
            } catch (Exception e) {
                if (!(e instanceof ClassNotFoundException) && !(e instanceof IllegalAccessException) && !(e instanceof InstantiationException) && !(e instanceof InvocationTargetException) && !(e instanceof NoSuchMethodException)) {
                    throw e;
                }
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            C69572Vrb c69572Vrb = super.A03;
            if (c69572Vrb != null) {
                c69572Vrb.A00(e2, "FAILURE", "FAILURE", AbstractC69851Vwc.A01(C2Ql.A00(e2), super.A00));
                String A04 = C18U.A04(C06090Tz.A06, this.A03, 36873376572702733L);
                C2I1 c2i1 = C2I1.NONE;
                A01(c2i1, c2i1, A04);
                return;
            }
            C14360o3.A0F("uplLogger");
            throw C00O.createAndThrow();
        }
    }

    public C2GL(Context context, UserSession userSession) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = new C2GP(context, null);
        this.A04 = new C47522Gc(userSession);
    }
}
