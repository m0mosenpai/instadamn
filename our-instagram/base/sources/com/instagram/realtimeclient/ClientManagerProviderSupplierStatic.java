package com.instagram.realtimeclient;

import X.AbstractC166987dD;
import X.AbstractC43371z7;
import X.C43351z5;
import X.C43531zN;
import X.C43551zQ;
import X.C43561zT;
import X.C43571zV;
import android.content.Context;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

/* loaded from: classes12.dex */
public class ClientManagerProviderSupplierStatic {
    public static List getRealtimeDelegateProviders(Context context) {
        return AbstractC166987dD.A1J(new C43351z5());
    }

    public static RealtimeClientManager.PresenceMsysAppStateChangeObserverProvider getAppStateChangeObserverProvider() {
        return C43571zV.A00;
    }

    public static RealtimeClientManager.GraphQLSubscriptionsProvider getGraphQLSubscriptionsProvider() {
        return C43551zQ.A00;
    }

    public static RealtimeClientManager.ObserversProvider getObserversProvider() {
        return C43561zT.A00;
    }

    public static List getOtherRealtimeEventHandlerProviders(Context context) {
        return AbstractC43371z7.A00(context);
    }

    public static RealtimeClientManager.RawSkywalkerSubscriptionsProvider getRawSkywalkerSubscriptionsProvider() {
        return C43531zN.A00;
    }
}
