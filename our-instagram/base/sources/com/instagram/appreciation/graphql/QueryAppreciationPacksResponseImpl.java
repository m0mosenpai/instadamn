package com.instagram.appreciation.graphql;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94894Ou;
import X.C95124Py;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public final class QueryAppreciationPacksResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class Viewer extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class User extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class ContentAppreciationFundingConfig extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class ContentAppreciationConsumableProducts extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class Product extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            C94754Oe c94754Oe = C94754Oe.A00;
                            C4OW A0V = AbstractC166997dE.A0V(c94754Oe);
                            C94894Ou c94894Ou = C94894Ou.A00;
                            return AbstractC58319PtB.A0U(A0V, AbstractC166987dD.A0i(c94894Ou, "base_units"), AbstractC166987dD.A0i(c94894Ou, "extra_units"), AbstractC166987dD.A0i(c94894Ou, "total_units"), AbstractC166987dD.A0i(c94754Oe, AbstractC43591JPw.A00(971)));
                        }

                        public Product() {
                            super(1438290007);
                        }
                    }

                    public final Product A0E() {
                        return (Product) A02(Product.class, "product", 1438290007);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58320PtC.A0W(AbstractC58319PtB.A0L(C94754Oe.A00), Product.class, "product", 1438290007);
                    }

                    public ContentAppreciationConsumableProducts() {
                        super(1515473024);
                    }
                }

                /* loaded from: classes10.dex */
                public final class FundingTos extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class Linkify extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            C94754Oe c94754Oe = C94754Oe.A00;
                            return AbstractC167017dG.A0Y(c94754Oe, AbstractC166987dD.A0i(c94754Oe, "link"), "text");
                        }

                        public Linkify() {
                            super(-328179364);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58320PtC.A0T(C4OO.A02(), AbstractC166987dD.A0i(C94754Oe.A00, "tos_content"), Linkify.class, "linkify", -328179364);
                    }

                    public FundingTos() {
                        super(274501959);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58320PtC.A0U(C94754Oe.A00, AbstractC166987dD.A0h(C4OO.A02(), ContentAppreciationConsumableProducts.class, AbstractC43591JPw.A00(874), 1515473024), AbstractC166987dD.A0i(C95124Py.A00, "has_funded"), AbstractC58318PtA.A0O(FundingTos.class, "funding_tos", 274501959), AbstractC43591JPw.A00(303));
                }

                public ContentAppreciationFundingConfig() {
                    super(-1773563726);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(ContentAppreciationFundingConfig.class, AbstractC43591JPw.A00(875), -1773563726);
            }

            public User() {
                super(-1127772318);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0b(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -1127772318);
        }

        public Viewer() {
            super(1602000960);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(Viewer.class, "viewer", 1602000960);
    }

    public QueryAppreciationPacksResponseImpl() {
        super(538047011);
    }
}
