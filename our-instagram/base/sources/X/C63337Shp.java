package X;

import android.text.TextUtils;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Shp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63337Shp {
    public final C2GC A00;
    public final SCP A01;
    public final SDZ A02;

    public static QSK A00(QS6 qs6, QSK qsk, String str, String str2) {
        if (qsk != null) {
            C1LC A0a = AbstractC58319PtB.A0a(qsk, QSJ.class, "sub_actions", 4, -1899203755);
            while (A0a.hasNext()) {
                C2JS A0l = AbstractC25225BEi.A0l(A0a);
                EnumC61197Rgx enumC61197Rgx = EnumC61197Rgx.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                if (A0l.getOptionalEnumField(1, "sub_action_type", enumC61197Rgx) != null && ((EnumC61197Rgx) A0l.getOptionalEnumField(1, "sub_action_type", enumC61197Rgx)).name().equals(str)) {
                    C1LC it = qs6.A06(QS1.class, "actions", -384450045).iterator();
                    while (it.hasNext()) {
                        QSL qsl = (QSL) AbstractC25225BEi.A0l(it).reinterpretRequired(0, QSL.class, -687358097);
                        RhY rhY = RhY.A02;
                        if (qsl.getOptionalEnumField(0, "action_type", rhY) != null && A0l.getOptionalEnumField(2, "action_type", rhY) != null && ((RhY) qsl.getOptionalEnumField(0, "action_type", rhY)).name().equals(((RhY) A0l.getOptionalEnumField(2, "action_type", rhY)).name())) {
                            return A01(qsl, str2);
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static QSK A01(QSL qsl, String str) {
        C1LC A0a = AbstractC58319PtB.A0a(qsl, QSK.class, "steps", 2, 650156755);
        while (A0a.hasNext()) {
            QSK qsk = (QSK) A0a.next();
            EnumC61196Rgw enumC61196Rgw = EnumC61196Rgw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            if (qsk.getOptionalEnumField(0, "step_type", enumC61196Rgw) != null && ((EnumC61196Rgw) qsk.getOptionalEnumField(0, "step_type", enumC61196Rgw)).name().equals(str)) {
                return qsk;
            }
        }
        return null;
    }

    public static String A03(QSK qsk) {
        C1LC A0a = AbstractC58319PtB.A0a(qsk, QSJ.class, "sub_actions", 4, -1899203755);
        while (A0a.hasNext()) {
            C2JS A0l = AbstractC25225BEi.A0l(A0a);
            if (A0l.getOptionalTreeField(0, "text", QSI.class, 724782142) != null && !TextUtils.isEmpty(A0l.getOptionalTreeField(0, "text", QSI.class, 724782142).getOptionalStringField(0, "text"))) {
                return A0l.getOptionalTreeField(0, "text", QSI.class, 724782142).getOptionalStringField(0, "text");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.RqQ, java.lang.Object] */
    public final C58252li A04(C61549RpU c61549RpU, FBPayLoggerData fBPayLoggerData) {
        SDZ sdz = this.A02;
        String string = c61549RpU.A00.getString("BUNDLE_KEY_PRIMARY_FLOW_TYPE");
        String string2 = c61549RpU.A00.getString("BUNDLE_KEY_PAYMENT_TYPE");
        ?? obj = new Object();
        obj.A00 = string;
        obj.A01 = string2;
        Map map = sdz.A01;
        Q8K q8k = (Q8K) map.get(obj);
        if (q8k == null) {
            q8k = new Q8K(sdz, string, string2);
            map.put(obj, q8k);
        }
        C62567SGs c62567SGs = q8k.A03.A00;
        String str = q8k.A02;
        AbstractC167017dG.A1N(str, fBPayLoggerData);
        Map map2 = c62567SGs.A02;
        C14360o3.A06(map2);
        Object obj2 = map2.get(str);
        if (obj2 == null) {
            obj2 = new C62953SYv(c62567SGs.A00, c62567SGs.A01);
            map2.put(str, obj2);
        }
        ((C62953SYv) obj2).A00(fBPayLoggerData, C05F.A0C, str).A9a(q8k.A00);
        return C75M.A01(q8k, new TW4(0, this, c61549RpU, fBPayLoggerData));
    }

    public C63337Shp(SDZ sdz, C2GC c2gc, SCP scp) {
        this.A02 = sdz;
        this.A01 = scp;
        this.A00 = c2gc;
    }

    public static SLH A02(QTO qto) {
        ArrayList A1E = AbstractC166987dD.A1E();
        C1LC A0a = AbstractC58319PtB.A0a(qto, QTN.class, "ranges", 1, -41917707);
        while (A0a.hasNext()) {
            C2JS A0l = AbstractC25225BEi.A0l(A0a);
            A1E.add(new C62901SWh(A0l.getCoercedIntField(0, "length"), A0l.getCoercedIntField(1, "offset"), A0l.A09("override_uri")));
        }
        String A07 = qto.A07("text");
        A07.getClass();
        return AbstractC62201S1w.A00(A07, Collections.unmodifiableList(A1E));
    }
}
