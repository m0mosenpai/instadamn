package X;

import android.view.View;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;

/* renamed from: X.NXy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52789NXy extends AnonymousClass522 {
    public final int A00 = 2;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52789NXy(OBO obo, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = obo;
        this.A02 = str;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        long j;
        Long A0j;
        switch (this.A00) {
            case 0:
                ((InterfaceC57962Pn8) this.A01).CP6(this.A02);
                return;
            case 1:
                HashMap A1G = AbstractC166987dD.A1G();
                C55136Oc4 c55136Oc4 = (C55136Oc4) this.A01;
                String[] split = c55136Oc4.A0M.split("_");
                A1G.put("ig_media_id", split[0]);
                A1G.put("action", this.A02);
                A1G.put(CacheBehaviorLogger.SOURCE, "product_tagging_edit_flow");
                UserSession userSession = c55136Oc4.A0K;
                String str2 = split[0];
                Integer num = c55136Oc4.A07;
                String str3 = null;
                if (num != null) {
                    str = AbstractC40900I9y.A00(num);
                } else {
                    str = null;
                }
                if (split.length > 1) {
                    str3 = split[1];
                }
                C14360o3.A0B(userSession, 1);
                if (str2 != null && (A0j = AbstractC166997dE.A0j(str2)) != null) {
                    j = A0j.longValue();
                } else {
                    j = -1;
                }
                if (str == null) {
                    str = "";
                }
                if (str3 == null) {
                    str3 = "-1";
                }
                C4SX A00 = C4SX.A00(str3);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, userSession), "instagram_shopping_commerce_media_untagging_interaction");
                if (A0f.isSampled()) {
                    A0f.A9K("ig_media_id", Long.valueOf(j));
                    AbstractC50523MSb.A0u(A00, A0f, "appeals_flow_entry_tapped", str);
                }
                C72743Nv A0G = AbstractC31180DnO.A0G(userSession, "com.bloks.www.commerce.media_untagging_appeals", A1G);
                C140966Yy A0r = AbstractC25225BEi.A0r(c55136Oc4.A0I, userSession);
                A0r.A0E(A0G);
                A0r.A0A = c55136Oc4.A0J.getModuleName();
                A0r.A04();
                return;
            default:
                C14360o3.A0B(view, 0);
                C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                OBO obo = (OBO) this.A01;
                c35133Fea.A02(obo.A00, obo.A01, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, this.A02, "https://help.instagram.com/1146896693058557?ref=learn_more"));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52789NXy(InterfaceC57962Pn8 interfaceC57962Pn8, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = interfaceC57962Pn8;
        this.A02 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52789NXy(C55136Oc4 c55136Oc4, Integer num, String str) {
        super(num);
        this.A01 = c55136Oc4;
        this.A02 = str;
    }
}
