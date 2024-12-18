package X;

import com.google.gson.Gson;
import java.util.HashMap;

/* renamed from: X.21C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C21C {
    public final InterfaceC19630xq A00;

    public final void A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        HashMap A00 = A00();
        A00.put(str, str2);
        String A0B = new Gson().A0B(A00);
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7K("key_user_avatar_version_pre_rendering_cache_map", A0B);
        ARD.apply();
    }

    public final HashMap A00() {
        String string = this.A00.getString("key_user_avatar_version_pre_rendering_cache_map", null);
        if (string != null) {
            Object A09 = new Gson().A09(string, new AbstractC140846Ym<HashMap<String, String>>() { // from class: X.6Yl
            }.A00);
            C14360o3.A07(A09);
            return (HashMap) A09;
        }
        return new HashMap();
    }

    public final void A01() {
        InterfaceC19630xq interfaceC19630xq = this.A00;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7G(AnonymousClass001.A0R("key_suggested_sticker_hint_impression_count", "COMMENTS"), 0L);
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7G(AnonymousClass001.A0R("key_suggested_sticker_cool_down_end", "COMMENTS"), 0L);
        ARD2.apply();
        InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
        ARD3.E7G(AnonymousClass001.A0R("key_suggested_sticker_cool_down_length", "COMMENTS"), 0L);
        ARD3.apply();
        InterfaceC19610xo ARD4 = interfaceC19630xq.ARD();
        ARD4.E7G(AnonymousClass001.A0R("key_suggested_sticker_cool_down_phase", "COMMENTS"), 0L);
        ARD4.apply();
        InterfaceC19610xo ARD5 = interfaceC19630xq.ARD();
        ARD5.E7D(AnonymousClass001.A0R("key_suggested_sticker_banner_impression_count", "COMMENTS"), 0);
        ARD5.apply();
    }

    public final void A02() {
        InterfaceC19630xq interfaceC19630xq = this.A00;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("reshare_tooltip_view_count", interfaceC19630xq.getInt("reshare_tooltip_view_count", 0) + 1);
        ARD.apply();
    }

    public C21C(C1AU c1au) {
        this.A00 = c1au.A03(C1AV.A0Q);
    }
}
