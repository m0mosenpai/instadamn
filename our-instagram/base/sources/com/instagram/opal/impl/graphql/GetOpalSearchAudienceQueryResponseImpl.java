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
public final class GetOpalSearchAudienceQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtOpal extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class SearchAudience extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Edges extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class Node extends C2JS implements C2JT {
                    public Node() {
                        super(-266726937);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58324PtG.A0G();
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Y(AbstractC58319PtB.A0S(), AbstractC166987dD.A0h(C4OO.A01(), Node.class, "node", -266726937), "selected");
                }

                public Edges() {
                    super(-435883496);
                }
            }

            /* loaded from: classes10.dex */
            public final class PageInfo extends C2JS implements C2JT {
                public PageInfo() {
                    super(1605480580);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Y(C94754Oe.A00, AbstractC58319PtB.A0B(AbstractC58319PtB.A0S()), "end_cursor");
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0T(C4OO.A02(), AbstractC166987dD.A0h(C4OO.A01(), PageInfo.class, "page_info", 1605480580), Edges.class, "edges", -435883496);
            }

            public SearchAudience() {
                super(2114662413);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0W(C4OO.A01(), SearchAudience.class, MSV.A00(1578), 2114662413);
        }

        public XdtOpal() {
            super(-1645892878);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtOpal.class, "xdt_opal(input:$input)", -1645892878);
    }

    public GetOpalSearchAudienceQueryResponseImpl() {
        super(-1619741776);
    }
}
