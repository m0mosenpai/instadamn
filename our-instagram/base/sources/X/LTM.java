package X;

import com.facebook.pando.PandoGraphQLConnectionConfig;
import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LTM implements InterfaceC70433Ec {
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
        A1E.add(new PandoGraphQLConnectionConfig("XFBGENAIPersonaLayout", "edges", AbstractC58317Pt9.A00(1019), "AiStudioFetchHomeSectionsV2_At_Pando_Connection_Pagination_XFBGENAIPersonaLayout_union_sections_query", "union_sections_query_before_cursor", "union_sections_query_after_cursor", "first_page_size", "union_sections_query_last", "enable_section_query_stream", "stream_initial_count", true, false));
        return new PandoGraphQLRequest(A0U, "AiStudioFetchHomeSectionsV2", paramsCopy, paramsCopy2, QpM.class, false, null, 0, null, "xfb_fetch_genai_persona_discovery_paginated_layout", A1E);
    }
}
