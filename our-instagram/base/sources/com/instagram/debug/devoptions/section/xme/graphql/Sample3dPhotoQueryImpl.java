package com.instagram.debug.devoptions.section.xme.graphql;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.C2JM;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.debug.devoptions.section.xme.graphql.Sample3dPhotoQuery;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Sample3dPhotoQueryImpl {
    public static final Companion Companion = new Object();
    public static final String QUERY_NAME = "Sample3dPhoto";

    /* loaded from: classes5.dex */
    public final class Companion {
        public final Builder create() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes5.dex */
    public final class Builder implements Sample3dPhotoQuery.Builder {
        public final C2JM params = AbstractC25225BEi.A0b();
        public final C2JM transientParams = AbstractC25225BEi.A0b();

        @Override // X.InterfaceC70433Ec
        /* renamed from: build */
        public PandoGraphQLRequest A00() {
            return new PandoGraphQLRequest(AbstractC25225BEi.A0c(), Sample3dPhotoQueryImpl.QUERY_NAME, this.params.getParamsCopy(), this.transientParams.getParamsCopy(), Sample3dPhotoResponseImpl.class, false, null, 0, null, AbstractC111324zv.A00(1240), AbstractC166987dD.A1E());
        }
    }

    public static final Builder create() {
        return new Builder();
    }
}
