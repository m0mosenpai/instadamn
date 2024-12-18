package com.facebook.tigon.iface;

import X.C1S0;
import X.C1S3;
import X.EnumC26881Rz;
import java.util.Map;

/* loaded from: classes.dex */
public interface TigonRequest {
    public static final Companion Companion = Companion.A00;
    public static final String FETCH = "fetch";
    public static final String GET = "GET";
    public static final String HEAD = "HEAD";
    public static final String POST = "POST";
    public static final String PREFETCH = "prefetch";

    /* loaded from: classes.dex */
    public final class Companion {
        public static final /* synthetic */ Companion A00 = new Object();
        public static final String FETCH = "fetch";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String POST = "POST";
        public static final String PREFETCH = "prefetch";
    }

    long addedToMiddlewareSinceEpochMS();

    TigonAuthHandler authHandler();

    long connectionTimeoutMS();

    long expectedResponseSizeBytes();

    Object getLayerInformation(C1S3 c1s3);

    Map headers();

    C1S0 httpPriority();

    HttpPriorityContext httpPriorityContext();

    long idleTimeoutMS();

    String loggingId();

    String method();

    boolean replaySafe();

    EnumC26881Rz requestCategory();

    long requestTimeoutMS();

    boolean retryable();

    int startupStatusOnAdded();

    int tigonPriority();

    String url();
}
