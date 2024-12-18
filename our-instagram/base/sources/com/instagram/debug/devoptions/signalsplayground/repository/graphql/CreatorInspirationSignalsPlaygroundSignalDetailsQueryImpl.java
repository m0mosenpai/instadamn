package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC25227BEk;
import X.C14360o3;
import X.C2JM;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQuery;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl {
    public static final Companion Companion = new Object();
    public static final String QUERY_NAME = "CreatorInspirationSignalsPlaygroundSignalDetailsQuery";

    /* loaded from: classes11.dex */
    public final class Builder implements CreatorInspirationSignalsPlaygroundSignalDetailsQuery.Builder {
        public boolean isIdentifierSet;
        public final C2JM params = new C2JM();
        public final C2JM transientParams = new C2JM();

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQuery.Builder, com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQuery.BuilderForIdentifier
        public Builder setIdentifier(String str) {
            C14360o3.A0B(str, 0);
            this.params.A04("identifier", str);
            this.isIdentifierSet = true;
            return this;
        }

        @Override // X.InterfaceC70433Ec
        /* renamed from: build */
        public PandoGraphQLRequest A00() {
            return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.isIdentifierSet), CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl.QUERY_NAME, this.params.getParamsCopy(), this.transientParams.getParamsCopy(), CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl.class, false, null, 0, null, "xdt_get_creators_signal_playground", new ArrayList());
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQuery.Builder, com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQuery.BuilderForIdentifier
        public /* bridge */ /* synthetic */ CreatorInspirationSignalsPlaygroundSignalDetailsQuery.Builder setIdentifier(String str) {
            setIdentifier(str);
            return this;
        }
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public final CreatorInspirationSignalsPlaygroundSignalDetailsQuery.BuilderForIdentifier create() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final CreatorInspirationSignalsPlaygroundSignalDetailsQuery.BuilderForIdentifier create() {
        return new Builder();
    }
}
