package com.instagram.realtimeclient;

import android.content.Context;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

/* loaded from: classes12.dex */
public interface ClientManagerProviderSupplier {
    RealtimeClientManager.PresenceMsysAppStateChangeObserverProvider getAppStateChangeObserverProvider();

    RealtimeClientManager.GraphQLSubscriptionsProvider getGraphQLSubscriptionsProvider();

    RealtimeClientManager.ObserversProvider getObserversProvider();

    List getOtherRealtimeEventHandlerProviders(Context context);

    RealtimeClientManager.RawSkywalkerSubscriptionsProvider getRawSkywalkerSubscriptionsProvider();

    List getRealtimeDelegateProviders(Context context);
}
