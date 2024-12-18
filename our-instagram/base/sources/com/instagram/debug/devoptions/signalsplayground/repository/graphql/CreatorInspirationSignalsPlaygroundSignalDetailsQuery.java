package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.InterfaceC70433Ec;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundSignalDetailsQuery {
    public static final Companion Companion = new Object();

    /* loaded from: classes11.dex */
    public interface Builder extends InterfaceC70433Ec, BuilderForIdentifier {
        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQuery.BuilderForIdentifier
        Builder setIdentifier(String str);
    }

    /* loaded from: classes11.dex */
    public interface BuilderForIdentifier {
        Builder setIdentifier(String str);
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public final BuilderForIdentifier create() {
            return new CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl.Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final BuilderForIdentifier create() {
        return new CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl.Builder();
    }
}
