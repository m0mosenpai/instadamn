package X;

import com.instagram.api.schemas.FBBioLinkSocialContextType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Eua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33686Eua {
    public static Map A00(InterfaceC110294y0 interfaceC110294y0) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC110294y0.Ayb() != null) {
            A1I.put("display_text", interfaceC110294y0.Ayb());
        }
        interfaceC110294y0.BPU();
        A1I.put("magnitude", Integer.valueOf(interfaceC110294y0.BPU()));
        if (interfaceC110294y0.ByS() != null) {
            FBBioLinkSocialContextType ByS = interfaceC110294y0.ByS();
            C14360o3.A0B(ByS, 0);
            A1I.put(AbstractC111324zv.A00(75), ByS.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
