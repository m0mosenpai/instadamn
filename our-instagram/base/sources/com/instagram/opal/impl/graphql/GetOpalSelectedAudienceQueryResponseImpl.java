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
public final class GetOpalSelectedAudienceQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtOpal extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Audience extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Edges extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class Node extends C2JS implements C2JT {
                    public Node() {
                        super(2062210767);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58324PtG.A0G();
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0W(C4OO.A01(), Node.class, "node", 2062210767);
                }

                public Edges() {
                    super(-398773314);
                }
            }

            /* loaded from: classes10.dex */
            public final class PageInfo extends C2JS implements C2JT {
                public PageInfo() {
                    super(2059302573);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Y(C94754Oe.A00, AbstractC58319PtB.A0B(AbstractC58319PtB.A0S()), "end_cursor");
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0T(C4OO.A02(), AbstractC166987dD.A0h(C4OO.A01(), PageInfo.class, "page_info", 2059302573), Edges.class, "edges", -398773314);
            }

            public Audience() {
                super(-1524343173);
            }
        }

        public XdtOpal() {
            super(-329775722);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58320PtC.A0W(AbstractC166987dD.A0i(AbstractC58319PtB.A0R(), "selected_audience_count"), Audience.class, MSV.A00(964), -1524343173);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtOpal.class, "xdt_opal(input:$input)", -329775722);
    }

    public GetOpalSelectedAudienceQueryResponseImpl() {
        super(-1204715372);
    }
}
