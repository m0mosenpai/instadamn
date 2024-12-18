package com.instagram.opal.impl.graphql;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58324PtG;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C94754Oe;
import X.C95124Py;
import X.MSV;

/* loaded from: classes10.dex */
public final class GetOpalQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtOpal extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Audience extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Edges extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class Node extends C2JS implements C2JT {
                    public Node() {
                        super(-712504337);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58324PtG.A0G();
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0W(C4OO.A01(), Node.class, "node", -712504337);
                }

                public Edges() {
                    super(-5723451);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0W(C4OO.A02(), Edges.class, "edges", -5723451);
            }

            public Audience() {
                super(-1543286222);
            }
        }

        /* loaded from: classes10.dex */
        public final class OpalInfo extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0X(c94754Oe, AbstractC58321PtD.A0U(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "bio"), "profile_picture_url");
            }

            public OpalInfo() {
                super(-1295484760);
            }
        }

        public final OpalInfo A0E() {
            return (OpalInfo) A03(OpalInfo.class, "opal_info", -1295484760);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167007dF.A0Q(AbstractC58318PtA.A0O(OpalInfo.class, "opal_info", -1295484760), AbstractC166987dD.A0i(C95124Py.A00, MSV.A00(1351)), AbstractC166987dD.A0i(AbstractC58319PtB.A0R(), "selected_audience_count"), AbstractC58318PtA.A0O(Audience.class, MSV.A00(388), -1543286222));
        }

        public XdtOpal() {
            super(973923119);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtOpal.class, "xdt_opal(input:$input)", 973923119);
    }

    public GetOpalQueryResponseImpl() {
        super(-1724114753);
    }
}
