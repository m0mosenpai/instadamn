package com.instagram.debug.devoptions.signalsplayground.repository;

import X.AbstractC167017dG;
import X.AbstractC40691uc;
import X.C14360o3;
import X.C1Dk;
import X.C40701ud;
import X.InterfaceC23621Ds;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundDataSource {
    public final C40701ud executor;
    public final UserSession userSession;

    public final Object getSignalDetails(String str, InterfaceC23621Ds interfaceC23621Ds) {
        C1Dk A00 = new CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl.Builder().setIdentifier(str).A00();
        C40701ud c40701ud = this.executor;
        C14360o3.A0A(A00);
        return c40701ud.A04(A00, interfaceC23621Ds);
    }

    public final Object getSignalRecommendations(String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        C1Dk A00 = new CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl.Builder().setIdentifier(str).setUserId(str2).A00();
        C40701ud c40701ud = this.executor;
        C14360o3.A0A(A00);
        return c40701ud.A04(A00, interfaceC23621Ds);
    }

    public final Object getSignals(InterfaceC23621Ds interfaceC23621Ds) {
        PandoGraphQLRequest A00 = new CreatorInspirationSignalsPlaygroundSignalsQueryImpl.Builder().A00();
        C40701ud c40701ud = this.executor;
        C14360o3.A0A(A00);
        return c40701ud.A04(A00, interfaceC23621Ds);
    }

    public CreatorInspirationSignalsPlaygroundDataSource(UserSession userSession, C40701ud c40701ud) {
        AbstractC167017dG.A1P(userSession, c40701ud);
        this.userSession = userSession;
        this.executor = c40701ud;
    }

    public /* synthetic */ CreatorInspirationSignalsPlaygroundDataSource(UserSession userSession, C40701ud c40701ud, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession, (i & 2) != 0 ? AbstractC40691uc.A01(userSession) : c40701ud);
    }
}
