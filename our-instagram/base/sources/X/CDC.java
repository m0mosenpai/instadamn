package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDC {
    public static Map A00(InterfaceC31133DmG interfaceC31133DmG) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC31133DmG.getContentUrl() != null) {
            A1I.put("content_url", interfaceC31133DmG.getContentUrl());
        }
        String str = null;
        if (interfaceC31133DmG.AxF() != null) {
            ImageUrl AxF = interfaceC31133DmG.AxF();
            if (AxF != null) {
                str = AxF.getUrl();
            }
            A1I.put(AbstractC58317Pt9.A00(10), str);
        }
        if (interfaceC31133DmG.getMediaCount() != null) {
            A1I.put("media_count", interfaceC31133DmG.getMediaCount());
        }
        User BhV = interfaceC31133DmG.BhV();
        if (BhV != null) {
            A1I.put("profile", BhV.A07());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
