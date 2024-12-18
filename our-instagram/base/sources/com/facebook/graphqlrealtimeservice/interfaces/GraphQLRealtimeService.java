package com.facebook.graphqlrealtimeservice.interfaces;

import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Summary;

/* loaded from: classes10.dex */
public interface GraphQLRealtimeService {

    /* loaded from: classes10.dex */
    public interface RealtimeDataCallbacks extends GraphQLService.DataCallbacks {
        void onStatusChange(StreamStatus streamStatus, Summary summary);
    }

    /* loaded from: classes10.dex */
    public interface Token extends GraphQLService.Token {
    }
}
