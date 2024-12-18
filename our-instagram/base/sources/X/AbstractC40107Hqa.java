package X;

import com.instagram.api.schemas.NoteChatResponseInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hqa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40107Hqa {
    public static Map A00(NoteChatResponseInfo noteChatResponseInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (noteChatResponseInfo.BAT() != null) {
            A1I.put("group_chat_hash", noteChatResponseInfo.BAT());
        }
        noteChatResponseInfo.CYL();
        A1I.put("is_member", Boolean.valueOf(noteChatResponseInfo.CYL()));
        if (noteChatResponseInfo.BLo() != null) {
            A1I.put("last_num_members", noteChatResponseInfo.BLo());
        }
        noteChatResponseInfo.BXk();
        A1I.put("num_members", Integer.valueOf(noteChatResponseInfo.BXk()));
        if (noteChatResponseInfo.ByV() != null) {
            List ByV = noteChatResponseInfo.ByV();
            ArrayList A0q = AbstractC167017dG.A0q(ByV);
            Iterator it = ByV.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("social_context_users", A0q);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
