package X;

import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectSearchResult;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G2P implements GXU {
    public final /* synthetic */ C32372ENy A00;

    public G2P(C32372ENy c32372ENy) {
        this.A00 = c32372ENy;
    }

    @Override // X.GXU
    public final void DjK(DirectSearchResult directSearchResult) {
        C32372ENy c32372ENy = this.A00;
        C36294Fzo c36294Fzo = c32372ENy.A05;
        String str = c32372ENy.A09;
        String str2 = c32372ENy.A0C;
        if (c36294Fzo.A00 != null && (directSearchResult instanceof DirectMessageSearchMessage)) {
            DirectMessageSearchMessage directMessageSearchMessage = (DirectMessageSearchMessage) directSearchResult;
            Map map = c36294Fzo.A05;
            String str3 = directMessageSearchMessage.A07;
            double d = directMessageSearchMessage.A02;
            C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(c36294Fzo.A04, "direct_message_search_msg_impression"), 145);
            if (AbstractC25226BEj.A1Z(A0A)) {
                A0A.A0R("message_search_session_id", c36294Fzo.A00);
                A0A.A0R("surface_name", "message_list");
                A0A.A0R("query_string", str);
                A0A.A0R("thread_type", str2);
                A0A.A0P("message_sent_time", Double.valueOf(d));
                A0A.A0R("universal_search_session_id", c36294Fzo.A02);
            } else {
                A0A = null;
            }
            map.put(str3, A0A);
        }
    }
}
