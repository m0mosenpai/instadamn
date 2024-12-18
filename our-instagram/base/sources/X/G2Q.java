package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G2Q implements GXU {
    public final /* synthetic */ ELR A00;

    public G2Q(ELR elr) {
        this.A00 = elr;
    }

    @Override // X.GXU
    public final void DjK(DirectSearchResult directSearchResult) {
        String str;
        String str2;
        String str3;
        C14360o3.A0B(directSearchResult, 0);
        boolean z = directSearchResult instanceof DirectMessageSearchMessage;
        if (z) {
            str = ((DirectMessageSearchMessage) directSearchResult).A0A;
        } else if (directSearchResult instanceof DirectMessageSearchThread) {
            str = ((DirectMessageSearchThread) directSearchResult).A0A;
        } else {
            return;
        }
        ELR elr = this.A00;
        C36294Fzo c36294Fzo = elr.A05;
        if (c36294Fzo == null) {
            str3 = "messageSearchLogger";
        } else {
            String str4 = elr.A07;
            if (str4 == null) {
                str3 = "query";
            } else {
                if (c36294Fzo.A00 != null) {
                    double d = 0.0d;
                    if (z) {
                        DirectMessageSearchMessage directMessageSearchMessage = (DirectMessageSearchMessage) directSearchResult;
                        str2 = directMessageSearchMessage.A09;
                        d = directMessageSearchMessage.A02;
                    } else if (!(directSearchResult instanceof DirectMessageSearchThread)) {
                        return;
                    } else {
                        str2 = ((DirectMessageSearchThread) directSearchResult).A08;
                    }
                    if (str2 != null) {
                        Map map = c36294Fzo.A06;
                        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(c36294Fzo.A04, "direct_message_search_thread_impression"), 146);
                        if (AbstractC25226BEj.A1Z(A0A)) {
                            A0A.A0R("message_search_session_id", c36294Fzo.A00);
                            A0A.A0R("surface_name", "thread_list");
                            A0A.A0R("query_string", str4);
                            A0A.A0R("thread_type", str);
                            A0A.A0P("message_sent_time", Double.valueOf(d));
                            A0A.A0R("universal_search_session_id", c36294Fzo.A02);
                            A0A.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, null);
                        } else {
                            A0A = null;
                        }
                        map.put(str2, A0A);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }
}
