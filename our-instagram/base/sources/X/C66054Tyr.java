package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchPrompt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Tyr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66054Tyr {
    public final C121125e6 A00;
    public final InterfaceC19630xq A01;
    public final InterfaceC19630xq A02;
    public final UserSession A03;

    public final ImmutableList A00() {
        EnumC50680MYy enumC50680MYy;
        this.A00.A00();
        Map all = this.A02.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator A15 = AbstractC166997dE.A15(all);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            String str = (String) entry.getKey();
            C14360o3.A0A(str);
            if (AbstractC002300n.A0h(str, "prompt:", false) && AbstractC001900j.A0R(str, new String[]{"prompt:"}, 0).size() == 2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator A14 = AbstractC166997dE.A14(linkedHashMap);
        while (A14.hasNext()) {
            Map.Entry entry2 = (Map.Entry) A14.next();
            Object value = entry2.getValue();
            C14360o3.A0A(value);
            if (AbstractC001900j.A0R(value.toString(), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0).size() == 3) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList A0k = MSY.A0k(linkedHashMap2);
        Iterator A142 = AbstractC166997dE.A14(linkedHashMap2);
        while (A142.hasNext()) {
            Map.Entry entry3 = (Map.Entry) A142.next();
            Object key = entry3.getKey();
            C14360o3.A0A(key);
            String str2 = (String) AbstractC001900j.A0R((CharSequence) key, new String[]{"prompt:"}, 0).get(1);
            Object obj = AbstractC001900j.A0R(String.valueOf(entry3.getValue()), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0).get(0);
            String str3 = (String) AbstractC001900j.A0R(String.valueOf(entry3.getValue()), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0).get(1);
            String str4 = (String) AbstractC001900j.A0R(String.valueOf(entry3.getValue()), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0).get(2);
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            C14360o3.A0B(obj, 0);
            EnumC50680MYy[] values = EnumC50680MYy.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    enumC50680MYy = values[i];
                    if (!C14360o3.A0K(enumC50680MYy.A00, obj)) {
                        i++;
                    }
                } else {
                    enumC50680MYy = EnumC50680MYy.A04;
                    break;
                }
            }
            A0k.add(new DirectSearchPrompt(enumC50680MYy, str2, str3, str4));
        }
        return AbstractC31173DnH.A0L(A0k);
    }

    public final ImmutableList A01() {
        this.A00.A00();
        Map all = this.A01.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator A15 = AbstractC166997dE.A15(all);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            String str = (String) entry.getKey();
            C14360o3.A0A(str);
            if (AbstractC002300n.A0h(str, "user:", false)) {
                AbstractC43594JPz.A1S(linkedHashMap, entry);
            }
        }
        Collection values = linkedHashMap.values();
        ArrayList A0q = AbstractC167017dG.A0q(values);
        for (Object obj : values) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            A0q.add(AbstractC221815t.A00((String) obj));
        }
        return AbstractC31173DnH.A0L(A0q);
    }

    public C66054Tyr(C121125e6 c121125e6, UserSession userSession) {
        this.A00 = c121125e6;
        this.A03 = userSession;
        C1AU A01 = C1AT.A01(userSession);
        C1AV c1av = C1AV.A06;
        Class<?> cls = getClass();
        InterfaceC19630xq A04 = A01.A04(c1av, cls);
        this.A01 = A04;
        this.A02 = C18U.A06(C06090Tz.A05, userSession, 36324767511294408L) ? C1AT.A01(userSession).A04(C1AV.A07, cls) : A04;
    }
}
