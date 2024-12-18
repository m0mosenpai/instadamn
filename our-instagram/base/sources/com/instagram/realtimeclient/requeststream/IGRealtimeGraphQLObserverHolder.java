package com.instagram.realtimeclient.requeststream;

import X.AbstractC12290kX;
import X.AbstractC13670mt;
import X.C07510aQ;
import X.C0K8;
import X.C16L;
import X.C1Dk;
import X.C222015v;
import X.C2JL;
import X.InterfaceC16820sZ;
import X.X7T;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

@Deprecated(since = "Use IgGraphQLQueryExecutor instead. Wiki: https://fburl.com/wiki/4l43dk3q")
/* loaded from: classes11.dex */
public class IGRealtimeGraphQLObserverHolder {
    public static final String FAILED_TO_PARSE_RESPONSE_ERROR = "Failed to parse response";
    public final Executor mExecutor;
    public final C222015v mJsonFactory;
    public final SubscribeExecutor mSubscribeExecutor;

    /* loaded from: classes11.dex */
    public final class ErrorHandlingFutureCallback implements C2JL {
        public final C2JL mInner;
        public final String mUseCase;

        @Override // X.C2JL
        public final void onFailure(Throwable th) {
            try {
                this.mInner.onFailure(th);
            } catch (Exception e) {
                C0K8.A0K(AbstractC13670mt.A06("realtime_handler_exception_%s", this.mUseCase), "Caught error in handler", e);
            }
        }

        @Override // X.C2JL
        public final void onSuccess(Object obj) {
            try {
                this.mInner.onSuccess(obj);
            } catch (Exception e) {
                C0K8.A0K(AbstractC13670mt.A06("realtime_handler_exception_%s", this.mUseCase), "Caught error in handler", e);
            }
        }

        public ErrorHandlingFutureCallback(C2JL c2jl, String str) {
            this.mInner = c2jl;
            this.mUseCase = str;
        }
    }

    public static IGRealtimeGraphQLObserverHolder getInstanceDistillery(final UserSession userSession) {
        return (IGRealtimeGraphQLObserverHolder) userSession.A01(DistilleryIGRealtimeGraphQLObserverHolder.class, new InterfaceC16820sZ() { // from class: com.instagram.realtimeclient.requeststream.IGRealtimeGraphQLObserverHolder$$ExternalSyntheticLambda0
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return IGRealtimeGraphQLObserverHolder.lambda$getInstanceDistillery$1(UserSession.this);
            }
        });
    }

    public static IGRealtimeGraphQLObserverHolder getInstanceWWW(final UserSession userSession) {
        return (IGRealtimeGraphQLObserverHolder) userSession.A01(WWWIGRealtimeGraphQLObserverHolder.class, new InterfaceC16820sZ() { // from class: com.instagram.realtimeclient.requeststream.IGRealtimeGraphQLObserverHolder$$ExternalSyntheticLambda1
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return IGRealtimeGraphQLObserverHolder.lambda$getInstanceWWW$0(UserSession.this);
            }
        });
    }

    public SubscriptionHandler subscribe(C1Dk c1Dk, C2JL c2jl, X7T x7t) {
        return subscribe(c1Dk, c2jl, this.mExecutor, x7t);
    }

    public IGRealtimeGraphQLObserverHolder(SubscribeExecutor subscribeExecutor, Executor executor, C222015v c222015v) {
        this.mSubscribeExecutor = subscribeExecutor;
        this.mExecutor = executor;
        this.mJsonFactory = c222015v;
    }

    public static /* synthetic */ DistilleryIGRealtimeGraphQLObserverHolder lambda$getInstanceDistillery$1(UserSession userSession) {
        return new DistilleryIGRealtimeGraphQLObserverHolder(DistillerySubscribeExecutor.getInstance(userSession), AbstractC12290kX.A00.getMainExecutor(), new C07510aQ(userSession));
    }

    public static /* synthetic */ WWWIGRealtimeGraphQLObserverHolder lambda$getInstanceWWW$0(UserSession userSession) {
        return new WWWIGRealtimeGraphQLObserverHolder(WWWSubscribeExecutor.getInstance(userSession), AbstractC12290kX.A00.getMainExecutor(), new C07510aQ(userSession));
    }

    public static Object parseFromJson(String str, Class cls, C222015v c222015v) {
        try {
            C16L A03 = c222015v.A03(str);
            try {
                A03.A1J();
                Object invoke = cls.getMethod("parseFromJson", C16L.class).invoke(null, A03);
                A03.close();
                return invoke;
            } catch (Throwable th) {
                try {
                    A03.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to parse json", e);
        }
    }

    /* loaded from: classes11.dex */
    public class DistilleryIGRealtimeGraphQLObserverHolder extends IGRealtimeGraphQLObserverHolder {
        public DistilleryIGRealtimeGraphQLObserverHolder(SubscribeExecutor subscribeExecutor, Executor executor, C222015v c222015v) {
            super(subscribeExecutor, executor, c222015v);
        }
    }

    /* loaded from: classes11.dex */
    public class WWWIGRealtimeGraphQLObserverHolder extends IGRealtimeGraphQLObserverHolder {
        public WWWIGRealtimeGraphQLObserverHolder(SubscribeExecutor subscribeExecutor, Executor executor, C222015v c222015v) {
            super(subscribeExecutor, executor, c222015v);
        }
    }

    public SubscriptionHandler subscribe(C1Dk c1Dk, C2JL c2jl, Executor executor, X7T x7t) {
        return subscribe(c1Dk, c2jl, executor, x7t, 0);
    }

    public SubscriptionHandler subscribe(C1Dk c1Dk, C2JL c2jl, Executor executor, X7T x7t, int i) {
        final GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub = (GraphQLSubscriptionRequestStub) c1Dk;
        final ErrorHandlingFutureCallback errorHandlingFutureCallback = new ErrorHandlingFutureCallback(c2jl, graphQLSubscriptionRequestStub.mTypedGraphQLQueryString.getQueryName());
        return this.mSubscribeExecutor.subscribe(c1Dk, executor, new DataCallBack() { // from class: com.instagram.realtimeclient.requeststream.IGRealtimeGraphQLObserverHolder.1
            @Override // com.instagram.realtimeclient.requeststream.DataCallBack
            public void onData(String str) {
                try {
                    errorHandlingFutureCallback.onSuccess(IGRealtimeGraphQLObserverHolder.parseFromJson(str, graphQLSubscriptionRequestStub.mJsonHelperClass, IGRealtimeGraphQLObserverHolder.this.mJsonFactory));
                } catch (IOException | IllegalArgumentException e) {
                    errorHandlingFutureCallback.onFailure(new IOException(IGRealtimeGraphQLObserverHolder.FAILED_TO_PARSE_RESPONSE_ERROR, e));
                }
            }
        }, x7t, i);
    }
}
