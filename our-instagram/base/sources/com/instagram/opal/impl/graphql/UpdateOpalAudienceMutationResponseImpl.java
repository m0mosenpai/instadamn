package com.instagram.opal.impl.graphql;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58324PtG;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.MSV;

/* loaded from: classes10.dex */
public final class UpdateOpalAudienceMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtUpdateOpalAudience extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Opal extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Audience extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class Edges extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class Node extends C2JS implements C2JT {
                        public Node() {
                            super(-298572088);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC58324PtG.A0G();
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A01(), Node.class, "node", -298572088);
                    }

                    public Edges() {
                        super(760970486);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0W(C4OO.A02(), Edges.class, "edges", 760970486);
                }

                public Audience() {
                    super(-682684757);
                }
            }

            public Opal() {
                super(1639981732);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0W(AbstractC166987dD.A0i(AbstractC58319PtB.A0R(), "selected_audience_count"), Audience.class, MSV.A00(388), -682684757);
            }
        }

        public XdtUpdateOpalAudience() {
            super(-479904093);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58320PtC.A0W(AbstractC58319PtB.A0D(AbstractC58318PtA.A0Q()), Opal.class, "opal", 1639981732);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtUpdateOpalAudience.class, MSV.A00(1759), -479904093);
    }

    public UpdateOpalAudienceMutationResponseImpl() {
        super(300399840);
    }
}
