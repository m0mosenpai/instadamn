package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.FfR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35174FfR {
    public static final void A00(EnumC72435Xdf enumC72435Xdf, AbstractC12990ll abstractC12990ll, String str) {
        C14360o3.A0B(abstractC12990ll, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "fx_upsells_product");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1B(A0f, str);
            A0f.A8R(enumC72435Xdf, "upsell_flow_entry_point");
            AbstractC166997dE.A1N(A0f, "upsell_type", 2);
            A0f.Cht();
        }
    }

    public static final void A01(EnumC72435Xdf enumC72435Xdf, AbstractC12990ll abstractC12990ll, String str, Map map) {
        int A06 = AbstractC167007dF.A06(0, abstractC12990ll, enumC72435Xdf);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "fx_upsells_product");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1B(A0f, str);
            A0f.A8R(enumC72435Xdf, "upsell_flow_entry_point");
            AbstractC166997dE.A1N(A0f, "upsell_type", A06);
            A0f.A9M("debug_test_data", map);
            A0f.Cht();
        }
    }

    public static final void A02(EnumC72435Xdf enumC72435Xdf, AbstractC12990ll abstractC12990ll, String str, Map map, int i) {
        C14360o3.A0B(enumC72435Xdf, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "fx_upsells_product");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1B(A0f, str);
            A0f.A8R(enumC72435Xdf, "upsell_flow_entry_point");
            AbstractC166997dE.A1N(A0f, "upsell_type", i);
            A0f.A9M("debug_test_data", map);
            A0f.Cht();
        }
    }

    public static final void A03(AbstractC12990ll abstractC12990ll, Boolean bool, String str, String str2) {
        HashMap A1G = AbstractC166987dD.A1G();
        if (str2 != null) {
            A1G.put(CacheBehaviorLogger.SOURCE, str2);
        }
        if (bool != null) {
            A1G.put("contact_point_claiming", bool.toString());
        }
        A02(EnumC72435Xdf.A0B, abstractC12990ll, str, A1G, 2);
    }
}
