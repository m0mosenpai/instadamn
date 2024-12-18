package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC25227BEk;
import X.C14360o3;
import X.C18C;
import X.C2JM;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl {
    public static final Companion Companion = new Object();
    public static final String QUERY_NAME = "CreatorInspirationSignalsPlaygroundRecommendationsQuery";

    /* loaded from: classes11.dex */
    public final class Builder implements CreatorInspirationSignalsPlaygroundRecommendationsQuery.Builder {
        public boolean isIdentifierSet;
        public boolean isUserIdSet;
        public final C2JM params = new C2JM();
        public final C2JM transientParams = new C2JM();

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery.Builder, com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery.BuilderForIdentifier
        public Builder setIdentifier(String str) {
            C14360o3.A0B(str, 0);
            this.params.A04("identifier", str);
            this.isIdentifierSet = true;
            return this;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery.Builder, com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery.BuilderForUserId
        public Builder setUserId(String str) {
            C14360o3.A0B(str, 0);
            this.params.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
            this.isUserIdSet = true;
            return this;
        }

        @Override // X.InterfaceC70433Ec
        /* renamed from: build */
        public PandoGraphQLRequest A00() {
            C18C.A0E(this.isIdentifierSet);
            return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.isUserIdSet), CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl.QUERY_NAME, this.params.getParamsCopy(), this.transientParams.getParamsCopy(), CreatorInspirationSignalsPlaygroundRecommendationsQueryResponseImpl.class, false, null, 0, null, "xdt_get_creators_signal_playground", new ArrayList());
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery.Builder, com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery.BuilderForIdentifier
        public /* bridge */ /* synthetic */ CreatorInspirationSignalsPlaygroundRecommendationsQuery.Builder setIdentifier(String str) {
            setIdentifier(str);
            return this;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery.Builder, com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery.BuilderForUserId
        public /* bridge */ /* synthetic */ CreatorInspirationSignalsPlaygroundRecommendationsQuery.Builder setUserId(String str) {
            setUserId(str);
            return this;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery.BuilderForIdentifier
        public /* bridge */ /* synthetic */ CreatorInspirationSignalsPlaygroundRecommendationsQuery.BuilderForUserId setIdentifier(String str) {
            setIdentifier(str);
            return this;
        }
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public final CreatorInspirationSignalsPlaygroundRecommendationsQuery.BuilderForIdentifier create() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final CreatorInspirationSignalsPlaygroundRecommendationsQuery.BuilderForIdentifier create() {
        return new Builder();
    }
}
