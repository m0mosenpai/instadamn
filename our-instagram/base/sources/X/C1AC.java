package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1AC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AC {
    public final Context A00;
    public final C1AB A01;
    public final String A02;
    public final AtomicBoolean A03;
    public final boolean A04;

    public C1AC(Context context, AbstractC12990ll abstractC12990ll, C1AB c1ab, String str) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(str, 2);
        this.A02 = str;
        this.A03 = new AtomicBoolean(false);
        this.A00 = context.getApplicationContext();
        this.A01 = c1ab;
        this.A04 = abstractC12990ll instanceof UserSession;
    }

    public final Object A01(long j, Object obj) {
        C229419w c229419w = this.A01.A00;
        int i = (int) ((j >>> 48) & 63);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return obj;
                    }
                    C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Double");
                    return Double.valueOf(c229419w.AzA(C06090Tz.A06, ((Number) obj).doubleValue(), j));
                }
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                return c229419w.C2y(C06090Tz.A06, (String) obj, j);
            }
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Long");
            return Long.valueOf(c229419w.BPE(C06090Tz.A06, j, ((Number) obj).longValue()));
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return Boolean.valueOf(c229419w.AhF(C06090Tz.A06, j, ((Boolean) obj).booleanValue()));
    }

    public static final C13310mH A00(final C1AC c1ac, boolean z) {
        final C13310mH c13310mH = new C13310mH();
        C0U3 c0u3 = new C0U3();
        c0u3.A03 = false;
        c0u3.A04 = z;
        c0u3.A01 = new MobileConfigUpdateConfigsCallback() { // from class: X.5N1
            @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
            public final void onNetworkComplete(boolean z2) {
                EnumC124875ks enumC124875ks;
                C1AC c1ac2 = c1ac;
                if (c1ac2.A04) {
                    C1AB c1ab = c1ac2.A01;
                    C229419w c229419w = c1ab.A00;
                    C14360o3.A0A(c229419w);
                    C06090Tz c06090Tz = C06090Tz.A04;
                    if (c229419w.AhF(c06090Tz, 36312814617036046L, false)) {
                        c1ab.A03(c229419w.AhF(c06090Tz, 36312814617101583L, false));
                    }
                }
                if (AbstractC229319v.A00() && c1ac2.A03.compareAndSet(false, true)) {
                    c1ac2.A01.A00.A0E();
                }
                if (c1ac2.A01.A00.A06 == 2) {
                    InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
                    ARD.E77("session_based_client_config_success_fetched", z2);
                    ARD.apply();
                }
                C13310mH c13310mH2 = c13310mH;
                if (z2) {
                    enumC124875ks = EnumC124875ks.A05;
                } else {
                    enumC124875ks = EnumC124875ks.A03;
                }
                c13310mH2.A00 = enumC124875ks;
                c13310mH2.A02.countDown();
                if (!c13310mH2.A01.isEmpty()) {
                    Iterator it = c13310mH2.A01.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC13300mG) it.next()).run(c13310mH2.A00);
                    }
                }
            }
        };
        C229419w c229419w = c1ac.A01.A00;
        c229419w.A0C();
        c229419w.A0A().updateConfigs(c0u3);
        return c13310mH;
    }

    public final void A02(AbstractC12990ll abstractC12990ll, boolean z) {
        String str;
        if (abstractC12990ll instanceof UserSession) {
            UserSession userSession = (UserSession) abstractC12990ll;
            C229419w c229419w = this.A01.A00;
            long currentTimeMillis = System.currentTimeMillis();
            long j = AbstractC23021Ah.A00(userSession).A01.getLong("launcher_last_consistency_check_time_ms", 0L);
            if (!z) {
                if (c229419w.AhB(36312814616773901L, false)) {
                    if (currentTimeMillis <= (1000 * c229419w.BP3(36594289593878187L, SandboxRepository.CACHE_TTL)) + j && currentTimeMillis >= j) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C5F7 A0B = c229419w.A0B();
            InterfaceC10260gi A07 = c229419w.A07();
            String str2 = "{}";
            if (A0B != null) {
                C1A2 c1a2 = null;
                if (A07 instanceof C1A2) {
                    c1a2 = (C1A2) A07;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    C06090Tz A00 = C06090Tz.A00(new C06090Tz());
                    A00.A03 = true;
                    C06090Tz A002 = C06090Tz.A00(A00);
                    A002.A02 = true;
                    String str3 = "";
                    for (C5NW c5nw : A0B.A03) {
                        if (c5nw.A08 == c229419w.A06) {
                            int i = c5nw.A03;
                            String str4 = c5nw.A00;
                            if (i > 0 && i < 1048576) {
                                str4 = String.valueOf(i);
                            }
                            if (!TextUtils.isEmpty(str4)) {
                                if (!str3.equals(str4)) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject2 = new JSONObject();
                                    jSONObject3.put("parameters", jSONObject2);
                                    jSONObject.put(str4, jSONObject3);
                                } else {
                                    str4 = str3;
                                }
                                JSONObject jSONObject4 = new JSONObject();
                                long A003 = c5nw.A00();
                                Object A004 = C1AB.A00(A07, A002, c5nw, A003);
                                if (A004 != null) {
                                    jSONObject4.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A004);
                                }
                                if (c1a2 != null) {
                                    String BOq = c1a2.BOq(A003);
                                    if (!TextUtils.isEmpty(BOq)) {
                                        jSONObject4.put("logging_id", BOq);
                                    }
                                }
                                MobileConfigValueSource mobileConfigValueSource = A002.A00.A00;
                                if (mobileConfigValueSource != MobileConfigValueSource.SERVER && mobileConfigValueSource != MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL) {
                                    jSONObject4.put("src", mobileConfigValueSource.getSource());
                                }
                                if (jSONObject4.length() > 0) {
                                    int i2 = c5nw.A04;
                                    if (i2 == -1 || i2 >= 16384) {
                                        str = c5nw.A01;
                                    } else {
                                        str = Integer.toString(i2);
                                    }
                                    if (!TextUtils.isEmpty(str)) {
                                        jSONObject2.put(str, jSONObject4);
                                    }
                                }
                                str3 = str4;
                            }
                        }
                    }
                    str2 = jSONObject.toString();
                } catch (JSONException e) {
                    C0K8.A0I("MobileConfigFunctions", "Failed to generate consistency JSON.", e);
                }
            }
            C14360o3.A07(str2);
            String str5 = this.A02;
            C14360o3.A0B(userSession, 0);
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A09(C05F.A01);
            c25621Ms.A0B("launcher/check_consistency/");
            c25621Ms.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5);
            c25621Ms.A9s("mc_configs", str2);
            c25621Ms.A9s("is_realtime_subscription_enabled", "false");
            c25621Ms.A0P(null, C40781ul.class, C55702hA.class, false);
            c25621Ms.A0R = true;
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C1P1() { // from class: X.5Na
                @Override // X.C1P1
                public final void onFail(AbstractC115105If abstractC115105If) {
                    int A03 = C0f9.A03(1493631814);
                    C14360o3.A0B(abstractC115105If, 0);
                    if (abstractC115105If instanceof C115115Ig) {
                        ((InterfaceC40821up) ((C115115Ig) abstractC115105If).A00).getErrorMessage();
                    }
                    C0f9.A0A(27386442, A03);
                }
            };
            C1GJ.A06(A0N, 238, 3, true, true);
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
            ARD.E7G("launcher_last_consistency_check_time_ms", currentTimeMillis);
            ARD.apply();
        }
    }
}
