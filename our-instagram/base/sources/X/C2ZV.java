package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: X.2ZV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2ZV {
    public boolean A00;
    public final C9BC A01;
    public final C9BC A02;
    public final C2ZT A03;
    public final List A04;
    public final List A05;

    private final String A00() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.A04) {
            if (!(obj instanceof C2ZX) && !(obj instanceof C51782Zb)) {
                sb.append(AbstractC100734fc.A00(arrayList));
                arrayList.clear();
                sb.append(obj.toString());
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            } else {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            sb.append(AbstractC100734fc.A00(arrayList));
        }
        if (sb.length() != 0) {
            char charAt = sb.charAt(sb.length() - 1);
            if (Character.valueOf(charAt) != null && charAt == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        String obj2 = sb.toString();
        C14360o3.A07(obj2);
        return obj2;
    }

    public static final JsonPrimitive A01(Object obj) {
        if (obj instanceof Number) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Number");
            SerialDescriptor serialDescriptor = AbstractC100754fe.A00;
            if (obj == null) {
                return JsonNull.A00;
            }
            return new JsonLiteral(obj, false);
        }
        if (obj instanceof Boolean) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return AbstractC100754fe.A04((Boolean) obj);
        }
        return AbstractC100754fe.A05(String.valueOf(obj));
    }

    public final String A02() {
        StringBuilder sb = new StringBuilder();
        C2ZT c2zt = this.A03;
        sb.append(c2zt.A00());
        sb.append("|");
        sb.append(c2zt.A00);
        sb.append("|");
        sb.append(c2zt.A01);
        sb.append("|");
        c2zt.A05(sb);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        List<C2ZY> list = this.A04;
        sb.append(list.size());
        for (C2ZY c2zy : list) {
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            sb.append(c2zy.A00());
            sb.append("|");
            c2zy.A02(sb);
        }
        for (AbstractC88103wI abstractC88103wI : this.A05) {
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(abstractC88103wI.A00());
            sb2.append("|");
            abstractC88103wI.A01(sb2);
            String obj = sb2.toString();
            C14360o3.A07(obj);
            sb.append(AbstractC002300n.A0d(obj, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, " ", false));
        }
        String obj2 = sb.toString();
        C14360o3.A07(obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A03(java.lang.Long r11) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2ZV.A03(java.lang.Long):java.lang.String");
    }

    public final LinkedHashMap A04() {
        C2ZT c2zt = this.A03;
        C09530e4 c09530e4 = new C09530e4("user_action", c2zt.A03());
        C09530e4 c09530e42 = new C09530e4("user_action_detail", c2zt.A01());
        C09530e4 c09530e43 = new C09530e4("current_module", c2zt.A01);
        List list = this.A04;
        C09530e4 c09530e44 = new C09530e4("app_reactions_count", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2ZY) it.next()).A01());
        }
        LinkedHashMap A06 = AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, new C09530e4("app_reactions_component", AbstractC001800i.A0Z(AbstractC001800i.A0W(arrayList))), new C09530e4("app_reactions_description", A00()));
        Map A04 = c2zt.A04();
        if (A04 == null) {
            A04 = C16920sk.A00;
            C14360o3.A0C(A04, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        }
        return AbstractC06930Yk.A04(A06, A04);
    }

    public C2ZV(C9BC c9bc, C9BC c9bc2, C2ZT c2zt, List list, List list2) {
        this.A03 = c2zt;
        this.A04 = list;
        this.A05 = list2;
        this.A02 = c9bc;
        this.A01 = c9bc2;
    }
}
