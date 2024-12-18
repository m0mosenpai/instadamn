package X;

import com.instagram.api.schemas.ReelsMediaInteractivityType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDU {
    public static Map A00(InterfaceC31130DmD interfaceC31130DmD) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC31130DmD.Aye() != null) {
            A1I.put("display_uri", interfaceC31130DmD.Aye());
        }
        if (interfaceC31130DmD.Azi() != null) {
            A1I.put(AbstractC111324zv.A00(4343), interfaceC31130DmD.Azi());
        }
        if (interfaceC31130DmD.BDM() != null) {
            A1I.put("headline", interfaceC31130DmD.BDM());
        }
        interfaceC31130DmD.CTZ();
        A1I.put("is_eligible_for_tappable_tooltip", Boolean.valueOf(interfaceC31130DmD.CTZ()));
        if (interfaceC31130DmD.BR8() != null) {
            List<ReelsMediaInteractivityType> BR8 = interfaceC31130DmD.BR8();
            if (BR8 != null) {
                arrayList = AbstractC167017dG.A0q(BR8);
                for (ReelsMediaInteractivityType reelsMediaInteractivityType : BR8) {
                    C14360o3.A0B(reelsMediaInteractivityType, 0);
                    arrayList.add(reelsMediaInteractivityType.A00);
                }
            } else {
                arrayList = null;
            }
            A1I.put("media_interactivity_types", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
