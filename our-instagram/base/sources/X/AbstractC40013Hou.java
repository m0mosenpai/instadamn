package X;

import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hou, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40013Hou {
    public static Map A00(InterfaceC104894o0 interfaceC104894o0) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC104894o0.BG7() != null) {
            IGPBIAProfileBrowseTypeEnum BG7 = interfaceC104894o0.BG7();
            if (BG7 != null) {
                str = BG7.A00;
            } else {
                str = null;
            }
            A1I.put("ig_pbia_profile_and_browse_type", str);
        }
        if (interfaceC104894o0.BvO() != null) {
            A1I.put("should_render_dimmer", interfaceC104894o0.BvO());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
