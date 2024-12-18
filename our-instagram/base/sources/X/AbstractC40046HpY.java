package X;

import com.instagram.api.schemas.LiveNoteResponseInfoIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HpY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40046HpY {
    public static Map A00(LiveNoteResponseInfoIntf liveNoteResponseInfoIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        List C3T = liveNoteResponseInfoIntf.C3T();
        if (C3T != null) {
            ArrayList A0q = AbstractC167017dG.A0q(C3T);
            Iterator it = C3T.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("subscribed_users", A0q);
        }
        liveNoteResponseInfoIntf.C8b();
        return AbstractC37301Gc2.A0r("timer_end_timestamp", Long.valueOf(liveNoteResponseInfoIntf.C8b()), A1I);
    }
}
