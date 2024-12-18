package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.InterfaceC70433Ec;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundRecommendationsQuery {
    public static final Companion Companion = new Object();

    /* loaded from: classes11.dex */
    public interface Builder extends InterfaceC70433Ec, BuilderForUserId, BuilderForIdentifier {
        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery.BuilderForIdentifier
        Builder setIdentifier(String str);

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQuery.BuilderForUserId
        Builder setUserId(String str);
    }

    /* loaded from: classes11.dex */
    public interface BuilderForIdentifier {
        BuilderForUserId setIdentifier(String str);
    }

    /* loaded from: classes11.dex */
    public interface BuilderForUserId {
        Builder setUserId(String str);
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public final BuilderForIdentifier create() {
            return new CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl.Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final BuilderForIdentifier create() {
        return new CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl.Builder();
    }
}
