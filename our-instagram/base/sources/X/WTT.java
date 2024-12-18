package X;

import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WTT implements InterfaceC72023XFl {
    public static final W3R A0A = new Object();
    public final SparseArray A00;
    public final InterfaceC65469Tkm A01;
    public final C1338462s A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final Map A08;
    public final Map A09;

    public final void A00(Bundle bundle, boolean z) {
        boolean z2;
        bundle.putString("__nav_data_type", "screen_query");
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("key_from_config_change", z);
        bundle2.putString("key_app_id", this.A05);
        bundle2.putInt("key_content_parse_result", AbstractC66261U6f.A00(this.A02));
        bundle2.putInt("key_tree_params", AbstractC66261U6f.A00(this.A09));
        bundle2.putInt("key_analytics_extras", AbstractC66261U6f.A00(this.A08));
        bundle2.putString("key_analytics_module", this.A04);
        Boolean bool = this.A03;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        bundle2.putBoolean("key_animate_on_navigation", z2);
        bundle2.putInt("key_container_config", AbstractC66261U6f.A00(this.A01));
        bundle.putBundle("key_screen_container_props_bundle", bundle2);
    }

    @Override // X.InterfaceC72023XFl
    public final String AcH() {
        return this.A05;
    }

    @Override // X.InterfaceC72023XFl
    public final String BWI() {
        return "screen_query";
    }

    public WTT(InterfaceC65469Tkm interfaceC65469Tkm, C1338462s c1338462s, Boolean bool, String str, List list, Map map, Map map2, boolean z, boolean z2) {
        LinkedHashMap linkedHashMap;
        this.A02 = c1338462s;
        this.A08 = map2;
        this.A03 = bool;
        this.A01 = interfaceC65469Tkm;
        this.A07 = list;
        String A00 = AbstractC58317Pt9.A00(658);
        map.get(A00);
        if (z && !z2) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("__infra__ttrc_instance_id", String.valueOf(new SecureRandom().nextInt()));
            linkedHashMap.put("__infra__ttrc_timestamp", Long.valueOf(AwakeTimeSinceBootClock.INSTANCE.now()));
        }
        this.A09 = linkedHashMap;
        Object obj = linkedHashMap.get(A00);
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj;
        this.A05 = str2;
        this.A04 = str == null ? str2 : str;
        Object obj2 = linkedHashMap.get(AbstractC58317Pt9.A00(661));
        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
        this.A06 = (String) obj2;
        C14360o3.A0C(linkedHashMap.get(AbstractC58317Pt9.A00(662)), "null cannot be cast to non-null type kotlin.Int");
        C14360o3.A0C(linkedHashMap.get(AbstractC58317Pt9.A00(659)), AbstractC111324zv.A00(10));
        this.A00 = (SparseArray) linkedHashMap.get(AbstractC111324zv.A00(1868));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WTT(InterfaceC65469Tkm interfaceC65469Tkm, C1338462s c1338462s, Boolean bool, String str, Map map, Map map2) {
        this(interfaceC65469Tkm, c1338462s, bool, str, C16930sl.A00, map, map2, false, false);
        AbstractC167017dG.A1P(c1338462s, map);
    }
}
