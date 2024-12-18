package com.instagram.appreciation.graphql;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C126885oS;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C67A;
import X.C94754Oe;
import X.C95124Py;
import X.MSV;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public final class FetchAppreciationCreatorInsightsQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class Viewer extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class User extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class ContentAppreciationInsights extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class LifetimeEstimatedEarnings extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0a(ContentAppreciationMetricsDataImpl.class, "ContentAppreciationMetricsData", 1941391533);
                    }

                    public LifetimeEstimatedEarnings() {
                        super(2086930639);
                    }
                }

                /* loaded from: classes10.dex */
                public final class MonthlyMetrics extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class Edges extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class Node extends C2JS implements C2JT {

                            /* loaded from: classes10.dex */
                            public final class MetricsData extends C2JS implements C2JT {
                                @Override // X.C2JS
                                public final C4OU modelSelectionSet() {
                                    return AbstractC167017dG.A0a(ContentAppreciationMetricsDataImpl.class, "ContentAppreciationMetricsData", 1941391533);
                                }

                                public MetricsData() {
                                    super(-785410175);
                                }
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0Y(C94754Oe.A00, AbstractC58318PtA.A0O(MetricsData.class, AbstractC43591JPw.A00(1176), -785410175), AbstractC43591JPw.A00(1004));
                            }

                            public Node() {
                                super(1191000141);
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0b(Node.class, "node", 1191000141);
                        }

                        public Edges() {
                            super(-1186689805);
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class PageInfo extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Y(C95124Py.A00, AbstractC166987dD.A0i(C94754Oe.A00, "start_cursor"), "has_next_page");
                        }

                        public PageInfo() {
                            super(-2144576818);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58320PtC.A0W(AbstractC166987dD.A0h(C4OO.A02(), Edges.class, "edges", -1186689805), PageInfo.class, "page_info", -2144576818);
                    }

                    public MonthlyMetrics() {
                        super(-1275275814);
                    }
                }

                /* loaded from: classes10.dex */
                public final class TopEarningContent extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class Media extends C2JS implements C2JT {

                        /* loaded from: classes11.dex */
                        public final class MediaGiftEarnings extends C2JS implements C2JT {
                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                C94754Oe c94754Oe = C94754Oe.A00;
                                return AbstractC167017dG.A0Y(c94754Oe, new C4OW(c94754Oe, "formatted_amount"), "amount_with_offset");
                            }

                            public MediaGiftEarnings() {
                                super(1942040202);
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            C94754Oe c94754Oe = C94754Oe.A00;
                            return AbstractC167007dF.A0Q(AbstractC166987dD.A0i(c94754Oe, MSV.A00(33)), AbstractC166987dD.A0i(C67A.A00, "creation_time"), AbstractC166987dD.A0i(c94754Oe, "display_url"), AbstractC58318PtA.A0O(MediaGiftEarnings.class, AbstractC43591JPw.A00(1163), 1942040202));
                        }

                        public Media() {
                            super(1586467715);
                        }
                    }

                    public final Media A0E() {
                        return (Media) A03(Media.class, "media", 1586467715);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Y(C94754Oe.A00, AbstractC58318PtA.A0O(Media.class, "media", 1586467715), AbstractC43591JPw.A00(1002));
                    }

                    public TopEarningContent() {
                        super(-962291286);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58320PtC.A0V(AbstractC58318PtA.A0O(LifetimeEstimatedEarnings.class, AbstractC43591JPw.A00(406), 2086930639), new C126885oS(AbstractC166987dD.A0h(C4OO.A02(), TopEarningContent.class, AbstractC43591JPw.A00(1373), -962291286), AbstractC43591JPw.A00(1324)), MonthlyMetrics.class, AbstractC43591JPw.A00(1181), -1275275814);
                }

                public ContentAppreciationInsights() {
                    super(-1737055912);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(ContentAppreciationInsights.class, AbstractC43591JPw.A00(324), -1737055912);
            }

            public User() {
                super(-507660251);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0b(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -507660251);
        }

        public Viewer() {
            super(317146606);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(Viewer.class, "viewer", 317146606);
    }

    public FetchAppreciationCreatorInsightsQueryResponseImpl() {
        super(1744226400);
    }
}
