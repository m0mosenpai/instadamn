package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.8fB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192108fB {
    public static String A00 = "";
    public static String A01 = "";
    public static final C192108fB A04 = new Object();
    public static HashSet A02 = new HashSet();
    public static HashSet A03 = new HashSet();

    public static final C25621Ms A00(AbstractC12990ll abstractC12990ll, boolean z) {
        String str;
        C1Ef c1Ef;
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll, -2);
        c25621Ms.A9s("bloks_versioning_id", "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf");
        ArrayList A012 = AbstractC191898el.A01(new InterfaceC16620sF() { // from class: X.9QS
            @Override // X.InterfaceC16620sF
            public final Object invoke(Object obj, Object obj2) {
                return new C206409Bx((List) obj, 2, (String) obj2);
            }
        });
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            A0A.A0S("bloks_version", "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf");
            A0A.A0S("styles_id", "instagram");
            if (A012 != null) {
                C16V.A03(A0A, "theme_params");
                Iterator it = A012.iterator();
                while (it.hasNext()) {
                    C206409Bx c206409Bx = (C206409Bx) it.next();
                    if (c206409Bx != null) {
                        A0A.A0d();
                        List<String> list = (List) c206409Bx.A00;
                        if (list != null) {
                            C16V.A03(A0A, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                            for (String str2 : list) {
                                if (str2 != null) {
                                    A0A.A0u(str2);
                                }
                            }
                            A0A.A0Z();
                        }
                        String str3 = c206409Bx.A01;
                        if (str3 != null) {
                            A0A.A0S("design_system_name", str3);
                        }
                        A0A.A0a();
                    }
                }
                A0A.A0Z();
            }
            A0A.A0a();
            A0A.close();
            str = stringWriter.toString();
        } catch (IOException e) {
            C0w9.A06("IgBloksClientContext", "Error jsonizing IgBloksClientContext", e);
            str = "";
        }
        c25621Ms.A9s("bk_client_context", str);
        if (z) {
            c1Ef = C1Ef.OffScreen;
        } else {
            c1Ef = C1Ef.OnScreen;
        }
        ((AbstractC23721Ec) c25621Ms).A05 = c1Ef;
        ((AbstractC23721Ec) c25621Ms).A06 = EnumC23341Bw.API;
        if (z) {
            c25621Ms.A09 = C05F.A01;
        }
        return c25621Ms;
    }

    public static final AbstractC192798gL A01(C1OL c1ol, AbstractC12990ll abstractC12990ll, String str, String str2, Map map, int i, long j, boolean z) {
        C40701ud A002;
        UserSession userSession;
        C192108fB c192108fB = A04;
        if (c192108fB.A0A(abstractC12990ll, str)) {
            C04060Jx c04060Jx = GraphQlCallInput.A02;
            C0CA A022 = c04060Jx.A02();
            C0CA.A00(A022, str, "app_id");
            C0CA.A00(A022, "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf", "bloks_versioning_id");
            String A05 = C16030qx.A02.A05(AbstractC12290kX.A00);
            String A023 = AbstractC31581Du9.A02(0, 9, 107);
            C0CA A024 = c04060Jx.A02();
            C0CA.A00(A024, A05, A023);
            A022.A0E(A024, "infra_params");
            if (map != null) {
                C73773Sh c73773Sh = AbstractC73763Sg.A03;
                C73803Sk c73803Sk = c73773Sh.A02;
                C0YW A003 = AbstractC15410pw.A00(String.class);
                Integer num = C05F.A00;
                C0CA.A00(A022, c73773Sh.A02(map, AbstractC192158fG.A02(AbstractC15410pw.A02(new C18210v6(num, A003), new C18210v6(num, new C0YW(Collections.emptyList(), new C0YZ(String.class), true))), c73803Sk)), "params");
            }
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            c2jm.A00.A02().A0E(A022, "params");
            c2jm.A00(C192748gG.A00(), "bk_context");
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            C1Dk maxToleratedCacheAgeMs = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGBloksAppRootQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C192768gI.class, false, null, 0, null, "bloks_app", new ArrayList()).setMaxToleratedCacheAgeMs(j);
            int i2 = 2;
            if (i == 3) {
                i2 = 1;
            }
            C1Dk requestPurpose = maxToleratedCacheAgeMs.setRequestPurpose(i2);
            if (!(abstractC12990ll instanceof UserSession) || (userSession = (UserSession) abstractC12990ll) == null || (A002 = AbstractC40691uc.A01(userSession)) == null) {
                A002 = AbstractC40691uc.A00((C07270a1) abstractC12990ll);
            }
            return new C192788gK(requestPurpose, new C192778gJ(C63B.A01), A002);
        }
        return new C9QQ(c192108fB.A07(c1ol, abstractC12990ll, str, str2, "bloks/apps/", map, i, j, z));
    }

    public static final AbstractC192798gL A02(C1OL c1ol, AbstractC12990ll abstractC12990ll, String str, Map map) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(str, 1);
        if (C1AD.A06(C06090Tz.A05, 18315260968583655L)) {
            return A03(c1ol, abstractC12990ll, str, map);
        }
        return A01(c1ol, abstractC12990ll, str, null, map, 0, 0L, false);
    }

    public static final AbstractC192798gL A04(AbstractC12990ll abstractC12990ll, String str, Map map) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(str, 1);
        return A02(null, abstractC12990ll, str, map);
    }

    public static final AbstractC192798gL A05(AbstractC12990ll abstractC12990ll, String str, Map map) {
        return A02(null, abstractC12990ll, str, map);
    }

    public static final AbstractC192798gL A06(AbstractC12990ll abstractC12990ll, String str, Map map) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(str, 1);
        return A01(null, abstractC12990ll, str, null, map, 0, 0L, false);
    }

    private final C1ON A07(C1OL c1ol, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, Map map, int i, long j, boolean z) {
        Class cls;
        Class cls2;
        boolean z2 = false;
        if (i == 3) {
            z2 = true;
        }
        C25621Ms A002 = A00(abstractC12990ll, z2);
        A002.A09(C05F.A01);
        A002.A0B(AnonymousClass001.A0S(str3, str, '/'));
        if (c1ol != null) {
            A002.A00 = c1ol;
        }
        if (z) {
            cls = HDW.class;
            cls2 = C41289IPe.class;
        } else {
            cls = C38257Gs0.class;
            cls2 = C38256Grz.class;
        }
        A002.A0P(null, cls, cls2, false);
        boolean z3 = j >= TimeUnit.DAYS.toMillis(1L);
        boolean z4 = abstractC12990ll instanceof UserSession;
        if (z4 && str2 != null && z3) {
            A002.A0A = str2;
            A002.A08(C05F.A0N);
            ((AbstractC23721Ec) A002).A01 = j;
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                A002.A9s((String) entry.getKey(), (String) entry.getValue());
            }
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C1AD.A06(c06090Tz, 2324147236411414888L)) {
            String A042 = C1AD.A04(c06090Tz, 18867177151005057L);
            if (!C14360o3.A0K(A00, A042)) {
                A00 = A042;
                A02 = A08(A042);
            }
            if (A02.contains(str)) {
                ((AbstractC23721Ec) A002).A03 = null;
                A002.A0L = true;
            }
        }
        if (C1AD.A06(c06090Tz, 2324147236411480425L)) {
            String A043 = C1AD.A04(c06090Tz, 18867177151070594L);
            if (!C14360o3.A0K(A01, A043)) {
                A01 = A043;
                A03 = A08(A043);
            }
            if (A03.contains(str)) {
                ((AbstractC23721Ec) A002).A02 = null;
                A002.A0M = true;
            }
        }
        if (z4 && C18U.A06(c06090Tz, abstractC12990ll, 36322882020649700L)) {
            A002.A0G("X-IG-BLOKS-SERIALIZE-PAYLOAD", "true");
        }
        return A002.A0N();
    }

    public static final boolean A09(String str, String str2) {
        if (str2.length() != 0) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    C14360o3.A0A(string);
                    if (AbstractC002300n.A0h(str, string, false)) {
                        return false;
                    }
                }
            } catch (JSONException unused) {
                C18950wb.A01.EH8(245701013, AnonymousClass001.A0g("Denylist ", str2, " for QE 'ig_android_bloks_graphql.app_id_prefix_denylist'"));
                return true;
            }
        }
        return true;
    }

    public final boolean A0A(AbstractC12990ll abstractC12990ll, String str) {
        if (!AbstractC002300n.A0h(str, "com.bloks.www", false)) {
            return false;
        }
        if (abstractC12990ll instanceof C07270a1) {
            if (!A09(str, C1AD.A04(C06090Tz.A06, 18875951769256828L)) || !C1AD.A06(C06090Tz.A05, 18313001815783986L)) {
                return false;
            }
            return true;
        }
        return A09(str, C18U.A04(C06090Tz.A05, abstractC12990ll, 36883177683681776L));
    }

    public static final AbstractC192798gL A03(C1OL c1ol, AbstractC12990ll abstractC12990ll, String str, Map map) {
        C40701ud A002;
        UserSession userSession;
        C192108fB c192108fB = A04;
        if (c192108fB.A0A(abstractC12990ll, str)) {
            C04060Jx c04060Jx = GraphQlCallInput.A02;
            C0CA A022 = c04060Jx.A02();
            C0CA.A00(A022, str, "app_id");
            C0CA.A00(A022, "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf", "bloks_versioning_id");
            String A05 = C16030qx.A02.A05(AbstractC12290kX.A00);
            String A023 = AbstractC31581Du9.A02(0, 9, 107);
            C0CA A024 = c04060Jx.A02();
            C0CA.A00(A024, A05, A023);
            A022.A0E(A024, "infra_params");
            if (map != null) {
                C73773Sh c73773Sh = AbstractC73763Sg.A03;
                C73803Sk c73803Sk = c73773Sh.A02;
                C0YW A003 = AbstractC15410pw.A00(String.class);
                Integer num = C05F.A00;
                C0CA.A00(A022, c73773Sh.A02(map, AbstractC192158fG.A02(AbstractC15410pw.A02(new C18210v6(num, A003), new C18210v6(num, new C0YW(Collections.emptyList(), new C0YZ(String.class), true))), c73803Sk)), "params");
            }
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            c2jm.A00.A02().A0E(A022, "params");
            c2jm.A00(C192748gG.A00(), "bk_context");
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            C1Dk requestPurpose = new PandoGraphQLRequest(AbstractC40511uK.A00(), "BloksAsyncActionQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C213039cQ.class, false, null, 0, null, "bloks_action", new ArrayList()).setMaxToleratedCacheAgeMs(0L).setRequestPurpose(2);
            if (!(abstractC12990ll instanceof UserSession) || (userSession = (UserSession) abstractC12990ll) == null || (A002 = AbstractC40691uc.A01(userSession)) == null) {
                A002 = AbstractC40691uc.A00((C07270a1) abstractC12990ll);
            }
            return new C209919Qd(requestPurpose, new C192778gJ(C63B.A01), A002);
        }
        if (AbstractC002300n.A0h(str, "com.bloks.www", false)) {
            final C1ON A07 = c192108fB.A07(c1ol, abstractC12990ll, str, null, "bloks/async_action/", map, 0, 0L, false);
            return new C9QQ(A07) { // from class: X.9QV
                public final C1ON A00;

                {
                    super(A07);
                    this.A00 = A07;
                }
            };
        }
        return new C9QQ(c192108fB.A07(c1ol, abstractC12990ll, str, null, "bloks/apps/", map, 0, 0L, false));
    }

    public static final HashSet A08(String str) {
        List list;
        HashSet hashSet = new HashSet();
        int length = str.length();
        if (length > 0) {
            int i = length - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= i) {
                int i3 = i;
                if (!z) {
                    i3 = i2;
                }
                int A002 = C14360o3.A00(str.charAt(i3), 32);
                boolean z2 = false;
                if (A002 <= 0) {
                    z2 = true;
                }
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i2++;
                    }
                } else {
                    if (!z2) {
                        break;
                    }
                    i--;
                }
            }
            List A032 = new C11L("\\s*,\\s*").A03(str.subSequence(i2, i + 1).toString());
            if (!A032.isEmpty()) {
                ListIterator listIterator = A032.listIterator(A032.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = AbstractC001800i.A0d(A032, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = C16930sl.A00;
            for (String str2 : (String[]) list.toArray(new String[0])) {
                if (str2.length() > 0) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }
}
