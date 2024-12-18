package X;

import com.facebook.pando.PandoGraphQLConnectionConfig;
import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LTJ implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A01 = AbstractC25225BEi.A0b();
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        InterfaceC40501uJ A0U = AbstractC25227BEk.A0U(this.A02);
        Map paramsCopy = this.A00.getParamsCopy();
        Map paramsCopy2 = this.A01.getParamsCopy();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new PandoGraphQLConnectionConfig("Query", "edges", "xfb_fetch_continue_chatting_section_personas", "AiAgentContinueChattingQuery_At_Pando_Connection_Pagination_Query_xfb_fetch_continue_chatting_section_personas", "xfb_fetch_continue_chatting_section_personas_before_cursor", "xfb_fetch_continue_chatting_section_personas_after_cursor", "count", "xfb_fetch_continue_chatting_section_personas_last", "xfb_fetch_continue_chatting_section_personas_stream_enabled", "xfb_fetch_continue_chatting_section_personas_stream_initial_count", true, false));
        return new PandoGraphQLRequest(A0U, "AiAgentContinueChattingQuery", paramsCopy, paramsCopy2, QoU.class, false, null, 0, null, "xfb_fetch_continue_chatting_section_personas", A1E);
    }
}
