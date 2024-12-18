package X;

import com.instagram.api.schemas.ProfileBannerType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EvJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33731EvJ {
    public static Map A00(InterfaceC37267GbK interfaceC37267GbK) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37267GbK.AfP() != null) {
            A1I.put("banner_id", interfaceC37267GbK.AfP());
        }
        if (interfaceC37267GbK.AfV() != null) {
            ProfileBannerType AfV = interfaceC37267GbK.AfV();
            C14360o3.A0B(AfV, 0);
            A1I.put("banner_type", AfV.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
