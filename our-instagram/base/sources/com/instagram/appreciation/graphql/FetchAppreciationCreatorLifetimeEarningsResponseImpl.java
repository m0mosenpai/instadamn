package com.instagram.appreciation.graphql;

import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public final class FetchAppreciationCreatorLifetimeEarningsResponseImpl extends C2JS implements C2JT {

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
                        super(-2006277420);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0b(LifetimeEstimatedEarnings.class, AbstractC43591JPw.A00(406), -2006277420);
                }

                public ContentAppreciationInsights() {
                    super(684595534);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(ContentAppreciationInsights.class, AbstractC43591JPw.A00(324), 684595534);
            }

            public User() {
                super(-697973659);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0b(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -697973659);
        }

        public Viewer() {
            super(-1780990833);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(Viewer.class, "viewer", -1780990833);
    }

    public FetchAppreciationCreatorLifetimeEarningsResponseImpl() {
        super(1451341697);
    }
}
