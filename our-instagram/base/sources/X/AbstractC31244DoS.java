package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DoS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31244DoS {
    public static Map A00(InterfaceC81873l7 interfaceC81873l7) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC81873l7.Anl() != null) {
            linkedHashMap.put("click_id", interfaceC81873l7.Anl());
        }
        if (interfaceC81873l7.B4Y() != null) {
            InterfaceC110294y0 B4Y = interfaceC81873l7.B4Y();
            if (B4Y != null) {
                treeUpdaterJNI = B4Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("fb_biolink_social_context", treeUpdaterJNI);
        }
        if (interfaceC81873l7.BAV() != null) {
            linkedHashMap.put("group_id", interfaceC81873l7.BAV());
        }
        if (interfaceC81873l7.BEy() != null) {
            linkedHashMap.put("icon_url", interfaceC81873l7.BEy());
        }
        if (interfaceC81873l7.BGu() != null) {
            linkedHashMap.put("image_url", interfaceC81873l7.BGu());
        }
        interfaceC81873l7.CaK();
        linkedHashMap.put("is_pinned", Boolean.valueOf(interfaceC81873l7.CaK()));
        interfaceC81873l7.isVerified();
        linkedHashMap.put("is_verified", Boolean.valueOf(interfaceC81873l7.isVerified()));
        if (interfaceC81873l7.BNQ() != null) {
            linkedHashMap.put("link_id", interfaceC81873l7.BNQ());
        }
        if (interfaceC81873l7.BNW() != null) {
            IgUserBioLinkTypeEnum BNW = interfaceC81873l7.BNW();
            C14360o3.A0B(BNW, 0);
            linkedHashMap.put("link_type", BNW.A00);
        }
        if (interfaceC81873l7.BPS() != null) {
            linkedHashMap.put("lynx_url", interfaceC81873l7.BPS());
        }
        if (interfaceC81873l7.BZ9() != null) {
            linkedHashMap.put("open_external_url_with_in_app_browser", interfaceC81873l7.BZ9());
        }
        if (interfaceC81873l7.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, interfaceC81873l7.getTitle());
        }
        if (interfaceC81873l7.getUrl() != null) {
            linkedHashMap.put("url", interfaceC81873l7.getUrl());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
