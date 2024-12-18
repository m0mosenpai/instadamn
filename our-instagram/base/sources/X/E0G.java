package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.feed.feeditem.SuggestedChannels;
import java.util.AbstractCollection;
import java.util.List;

/* loaded from: classes6.dex */
public final class E0G extends C1I4 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ SuggestedChannels A01;

    public E0G(UserSession userSession, SuggestedChannels suggestedChannels) {
        this.A01 = suggestedChannels;
        this.A00 = userSession;
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        InterfaceC37253Gb6 interfaceC37253Gb6;
        String str;
        int A03 = C0f9.A03(-52534854);
        C14360o3.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        LinearLayoutManager A0J = AbstractC31177DnL.A0J(recyclerView);
        int A1c = A0J.A1c();
        int A1d = A0J.A1d();
        SuggestedChannels suggestedChannels = this.A01;
        String id = suggestedChannels.getId();
        C36279FzW A00 = AbstractC34241F8n.A00(this.A00);
        if (A1c <= A1d) {
            while (true) {
                E6U e6u = suggestedChannels.A00;
                List list = e6u.A07;
                if (list != null && (interfaceC37253Gb6 = (InterfaceC37253Gb6) list.get(A1c)) != null && (str = ((E8D) interfaceC37253Gb6).A06) != null) {
                    String str2 = e6u.A03;
                    if (str2 == null) {
                        str2 = "";
                    }
                    boolean A1a = AbstractC31177DnL.A1a(((E8D) interfaceC37253Gb6).A01);
                    AbstractC167007dF.A1E(id, 0, str2);
                    AbstractCollection abstractCollection = (AbstractCollection) A00.A02.get(id);
                    if (abstractCollection != null && !abstractCollection.contains(str)) {
                        abstractCollection.add(str);
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00.A00, "igd_channels_client_actions");
                        if (A0f.isSampled()) {
                            A0f.AAP("user_igid", A00.A01);
                            AbstractC31171DnF.A1B(A0f, "channel_suggestion_impression");
                            AbstractC31171DnF.A1E(A0f, "feed_netego");
                            AbstractC31177DnL.A1F(A0f, "channel_suggestion_item");
                            AbstractC31178DnM.A1A(A0f, str, A1c);
                            A0f.AAP("ranking_request_id", str2);
                            AbstractC31174DnI.A1F(A0f, AbstractC167007dF.A0n("is_follower", AbstractC31172DnG.A0z(A1a ? 1 : 0)));
                        }
                    }
                }
                if (A1c == A1d) {
                    break;
                } else {
                    A1c++;
                }
            }
        }
        C0f9.A0A(615419493, A03);
    }
}
