package com.facebook.graphservice.interfaces;

import X.C1Df;
import com.facebook.tigon.TigonErrorException;

/* loaded from: classes10.dex */
public interface GraphQLService {

    /* loaded from: classes10.dex */
    public interface DataCallbacks {
        void onError(TigonErrorException tigonErrorException, Summary summary);

        void onUpdate(Tree tree, Summary summary);
    }

    /* loaded from: classes10.dex */
    public interface OperationCallbacks {
        void onError(TigonErrorException tigonErrorException);

        void onSuccess();
    }

    /* loaded from: classes10.dex */
    public interface Token extends C1Df {
        @Override // X.C1Df
        void cancel();
    }
}
