package com.instagram.opal.impl.graphql;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58324PtG;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C94754Oe;
import X.MSV;

/* loaded from: classes10.dex */
public final class GetOpalSuggestedAudienceQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtOpal extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class SuggestedAudiencePaginated extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Edges extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class Node extends C2JS implements C2JT {
                    public Node() {
                        super(-341997121);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58324PtG.A0G();
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0W(C4OO.A01(), Node.class, "node", -341997121);
                }

                public Edges() {
                    super(141969700);
                }
            }

            /* loaded from: classes10.dex */
            public final class PageInfo extends C2JS implements C2JT {
                public PageInfo() {
                    super(2041944670);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Y(C94754Oe.A00, AbstractC58319PtB.A0B(AbstractC58319PtB.A0S()), "end_cursor");
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0T(C4OO.A02(), AbstractC166987dD.A0h(C4OO.A01(), PageInfo.class, "page_info", 2041944670), Edges.class, "edges", 141969700);
            }

            public SuggestedAudiencePaginated() {
                super(-1843339477);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0W(C4OO.A01(), SuggestedAudiencePaginated.class, MSV.A00(1636), -1843339477);
        }

        public XdtOpal() {
            super(-1330464266);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtOpal.class, "xdt_opal(input:$input)", -1330464266);
    }

    public GetOpalSuggestedAudienceQueryResponseImpl() {
        super(-769279061);
    }
}
