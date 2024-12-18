package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC40511uK;
import X.C2JM;
import X.C2JQ;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoQuery;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class DevserversCategoryInfoQueryImpl {
    public static final Companion Companion = new Object();
    public static final String QUERY_NAME = "DevserversCategoryInfo";

    /* loaded from: classes11.dex */
    public final class Builder implements DevserversCategoryInfoQuery.Builder {
        public final C2JM params = new C2JM();
        public final C2JM transientParams = new C2JM();

        @Override // X.InterfaceC70433Ec
        /* renamed from: build */
        public PandoGraphQLRequest A00() {
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            return new PandoGraphQLRequest(AbstractC40511uK.A00(), DevserversCategoryInfoQueryImpl.QUERY_NAME, this.params.getParamsCopy(), this.transientParams.getParamsCopy(), DevserversCategoryInfoResponseImpl.class, false, null, 0, null, "xdt_api__v1__devservers__list_categorized", new ArrayList());
        }
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public final Builder create() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final Builder create() {
        return new Builder();
    }
}
