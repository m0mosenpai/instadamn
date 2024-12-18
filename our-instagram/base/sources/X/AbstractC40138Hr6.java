package X;

import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hr6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40138Hr6 {
    public static Map A00(InterfaceC114865Gw interfaceC114865Gw) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (interfaceC114865Gw.AfG() != null) {
            PendingShareToFriendsStoryBadgePreviewState AfG = interfaceC114865Gw.AfG();
            if (AfG != null) {
                str = AfG.A00;
            }
            A1I.put("badge_preview_state", str);
        }
        if (interfaceC114865Gw.AvB() != null) {
            A1I.put("cursor", interfaceC114865Gw.AvB());
        }
        List BRB = interfaceC114865Gw.BRB();
        if (BRB != null) {
            ArrayList A0q = AbstractC167017dG.A0q(BRB);
            Iterator it = BRB.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1S(A0q, it);
            }
            A1I.put("media_items", A0q);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
