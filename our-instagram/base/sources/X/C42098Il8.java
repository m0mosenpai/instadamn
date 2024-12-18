package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Il8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42098Il8 implements InterfaceC48192Ji {
    public final /* synthetic */ C70Y A00;
    public final /* synthetic */ IFZ A01;

    public C42098Il8(C70Y c70y, IFZ ifz) {
        this.A00 = c70y;
        this.A01 = ifz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        long A01;
        Context requireContext;
        Map map;
        C191778eZ c191778eZ;
        String str;
        String str2;
        Object Bos;
        ImmutableList requiredCompactedTreeListField;
        Integer num;
        String str3;
        C70Y c70y = this.A00;
        if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
            C60478R0e c60478R0e = (C60478R0e) Bos;
            if (c60478R0e.A0E() != null && c60478R0e.A0E().A03(C59191QaP.class, "cart", -441817504) != null) {
                C2JS A03 = c60478R0e.A0E().A03(C59191QaP.class, "cart", -441817504);
                String A00 = AbstractC58317Pt9.A00(313);
                if (A03.getOptionalTreeField(0, A00, C59190QaO.class, -1896123978) != null && c60478R0e.A0E().A03(C59191QaP.class, "cart", -441817504).getOptionalTreeField(0, A00, C59190QaO.class, -1896123978).getRequiredCompactedTreeListField(0, "edges", C59189QaN.class, 197665599) != null && (requiredCompactedTreeListField = c60478R0e.A0E().A03(C59191QaP.class, "cart", -441817504).getOptionalTreeField(0, A00, C59190QaO.class, -1896123978).getRequiredCompactedTreeListField(0, "edges", C59189QaN.class, 197665599)) != null) {
                    if (requiredCompactedTreeListField.size() == 1) {
                        num = C05F.A01;
                    } else {
                        num = C05F.A0C;
                    }
                    c70y.A02 = num;
                    if (requiredCompactedTreeListField.size() > 0 && ((C2JS) requiredCompactedTreeListField.get(0)).getOptionalTreeField(0, "node", C59188QaM.class, -629534115) != null && ((C2JS) requiredCompactedTreeListField.get(0)).getOptionalTreeField(0, "node", C59188QaM.class, -629534115).getOptionalStringField(0, "strong_id__") != null) {
                        str3 = ((C2JS) requiredCompactedTreeListField.get(0)).getOptionalTreeField(0, "node", C59188QaM.class, -629534115).getOptionalStringField(0, "strong_id__");
                    } else {
                        c70y.A02 = C05F.A00;
                        str3 = null;
                    }
                    c70y.A03 = str3;
                }
            }
        }
        IFZ ifz = this.A01;
        UserSession userSession = ifz.A01;
        AbstractC59962oe abstractC59962oe = ifz.A00;
        String str4 = C70Y.A00(userSession).A03;
        FBZ.A00(abstractC59962oe, userSession, str4);
        int intValue = C70Y.A00(userSession).A02.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 0) {
                    if (C18U.A06(C06090Tz.A06, userSession, 36310890471162214L)) {
                        HashMap A0r = AbstractC167017dG.A0r("_PRELOAD_ID_KEY_", "SingleMerchantCart");
                        if (str4 != null) {
                            A0r = AbstractC167017dG.A0r("params", AnonymousClass001.A0g("{\"client_input_params\":{\"merchant-id\":", str4, "},\"server_params\":{\"prefetch_view_only\":1}}"));
                        }
                        AbstractC191798eb.A03(abstractC59962oe.requireContext(), new C191778eZ(userSession), "com.bloks.www.bloks.commerce.cart.singlemerchantcart", "SingleMerchantCart", A0r, I7M.A00(userSession).longValue());
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, userSession, 36310890471883119L)) {
                            AbstractC191798eb.A03(abstractC59962oe.requireContext(), new C191778eZ(userSession), "async.components.singlemerchantcart.template", "TDSeparationSingleMerchantCart", null, C18U.A01(c06090Tz, userSession, 36592365448659392L));
                        }
                    }
                } else {
                    return;
                }
            }
            if (C18U.A06(C06090Tz.A06, userSession, 36310890471162214L)) {
                AbstractC191798eb.A03(abstractC59962oe.requireContext(), new C191778eZ(userSession), "com.bloks.www.bloks.commerce.cart.multimerchantcart", "MultiMerchantCart", AbstractC167017dG.A0r("_PRELOAD_ID_KEY_", "MultiMerchantCart"), I7M.A00(userSession).longValue());
                C06090Tz c06090Tz2 = C06090Tz.A05;
                if (C18U.A06(c06090Tz2, userSession, 36310890471883119L)) {
                    A01 = C18U.A01(c06090Tz2, userSession, 36592365448659392L);
                    requireContext = abstractC59962oe.requireContext();
                    map = null;
                    c191778eZ = new C191778eZ(userSession);
                    str = "async.components.multimerchantcart.template";
                    str2 = "TDSeparationMultiMerchantCart";
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (!C18U.A06(C06090Tz.A06, userSession, 36310890471162214L)) {
                return;
            }
            HashMap A0r2 = AbstractC167017dG.A0r("_PRELOAD_ID_KEY_", "SingleMerchantCart");
            if (str4 != null) {
                A0r2 = AbstractC167017dG.A0r("params", AnonymousClass001.A0g("{\"client_input_params\":{\"merchant-id\":", str4, "},\"server_params\":{\"prefetch_view_only\":1}}"));
            }
            AbstractC191798eb.A03(abstractC59962oe.requireContext(), new C191778eZ(userSession), "com.bloks.www.bloks.commerce.cart.singlemerchantcart", "SingleMerchantCart", A0r2, I7M.A00(userSession).longValue());
            C06090Tz c06090Tz3 = C06090Tz.A05;
            if (!C18U.A06(c06090Tz3, userSession, 36310890471883119L)) {
                return;
            }
            A01 = C18U.A01(c06090Tz3, userSession, 36592365448659392L);
            requireContext = abstractC59962oe.requireContext();
            map = null;
            c191778eZ = new C191778eZ(userSession);
            str = "async.components.singlemerchantcart.template";
            str2 = "TDSeparationSingleMerchantCart";
        }
        AbstractC191798eb.A03(requireContext, c191778eZ, str, str2, map, A01);
    }
}
