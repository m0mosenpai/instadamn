package X;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.Fa3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34917Fa3 {
    public static final C35185Ffd A00 = new Object();
    public static final List A01 = AbstractC16960so.A1N("token", "password", "nonce", "sessionid", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);

    public static final void A00(Intent intent, InterfaceC11380iw interfaceC11380iw, AbstractC18680vv abstractC18680vv, String str) {
        C14360o3.A0B(abstractC18680vv, 0);
        AbstractC167027dH.A13(str, intent, interfaceC11380iw);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC18680vv);
        String BdA = AbstractC11060iN.A00(abstractC18680vv).BdA();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A012, "ig_url_loaded");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String stringExtra = intent.getStringExtra("EXTRA_REFERRER");
            if (stringExtra != null && stringExtra.length() != 0) {
                A0f.AAP("source_application", stringExtra);
            }
            String string = extras.getString("short_url");
            if (string != null && string.length() != 0) {
                A0f.AAP("short_url", C35185Ffd.A00(string));
            }
        }
        A0f.AAP(AbstractC111324zv.A00(5055), BdA);
        A0f.AAP("url", C35185Ffd.A00(str));
        A0f.A7v("fb_installed", Boolean.valueOf(AbstractC23851Es.A03()));
        AbstractC25232BEp.A1L(A0f, "waterfall_id", C1Q9.A01());
    }
}
