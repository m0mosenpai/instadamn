package com.facebook.tigon.iface;

import X.C1S0;
import X.C1S2;
import X.C1S3;
import X.EnumC26881Rz;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class TigonRequestBuilder {
    public long mConnectionTimeoutMS;
    public long mIdleTimeoutMS;
    public String mMethod;
    public long mRequestTimeoutMS;
    public String mUrl;
    public boolean mRetryable = true;
    public boolean mReplaySafe = false;
    public Map mLayerInformation = new HashMap();
    public long mExpectedResponseSizeBytes = -1;
    public EnumC26881Rz mRequestCategory = EnumC26881Rz.A0D;
    public String mLoggingId = "";
    public int mStartupStatusOnAdded = -1;
    public long mAddedToMiddlewareSinceEpochMS = -1;
    public TigonAuthHandler mAuthHandler = null;
    public HttpPriorityContext mHttpPriorityContext = null;
    public Map mHeaders = new HashMap();
    public int mTigonPriority = 1;
    public C1S0 mHttpPriority = new C1S0();

    /* loaded from: classes.dex */
    public class TigonRequestImpl implements TigonRequest {
        public final int A00;
        public final int A01;
        public final long A02;
        public final long A03;
        public final long A04;
        public final long A05;
        public final long A06;
        public final C1S0 A07;
        public final EnumC26881Rz A08;
        public final String A09;
        public final String A0A;
        public final String A0B;
        public final Map A0C;
        public final Map A0D;
        public final boolean A0E;
        public final boolean A0F;
        public final TigonAuthHandler mAuthHandler;
        public final HttpPriorityContext mHttpPriorityContext;

        @Override // com.facebook.tigon.iface.TigonRequest
        public final long addedToMiddlewareSinceEpochMS() {
            return this.A02;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public TigonAuthHandler authHandler() {
            return this.mAuthHandler;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final long connectionTimeoutMS() {
            return this.A03;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final long expectedResponseSizeBytes() {
            return this.A04;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final Object getLayerInformation(C1S3 c1s3) {
            Map map = this.A0D;
            if (map == null) {
                return null;
            }
            return map.get(c1s3);
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final Map headers() {
            return this.A0C;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final C1S0 httpPriority() {
            return this.A07;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public HttpPriorityContext httpPriorityContext() {
            return this.mHttpPriorityContext;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final long idleTimeoutMS() {
            return this.A05;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final String loggingId() {
            return this.A09;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final String method() {
            return this.A0A;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final boolean replaySafe() {
            return this.A0E;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final EnumC26881Rz requestCategory() {
            return this.A08;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final long requestTimeoutMS() {
            return this.A06;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final boolean retryable() {
            return this.A0F;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final int startupStatusOnAdded() {
            return this.A00;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final int tigonPriority() {
            return this.A01;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public final String url() {
            return this.A0B;
        }

        public TigonRequestImpl(TigonRequestBuilder tigonRequestBuilder) {
            this.A0A = tigonRequestBuilder.mMethod;
            this.A0B = tigonRequestBuilder.mUrl;
            this.A0C = Collections.unmodifiableMap(tigonRequestBuilder.mHeaders);
            this.A01 = tigonRequestBuilder.mTigonPriority;
            this.A07 = tigonRequestBuilder.mHttpPriority;
            this.A0F = tigonRequestBuilder.mRetryable;
            this.A0E = tigonRequestBuilder.mReplaySafe;
            this.A0D = Collections.unmodifiableMap(tigonRequestBuilder.mLayerInformation);
            this.A03 = tigonRequestBuilder.mConnectionTimeoutMS;
            this.A05 = tigonRequestBuilder.mIdleTimeoutMS;
            this.A06 = tigonRequestBuilder.mRequestTimeoutMS;
            this.A04 = tigonRequestBuilder.mExpectedResponseSizeBytes;
            this.A08 = tigonRequestBuilder.mRequestCategory;
            this.A09 = tigonRequestBuilder.mLoggingId;
            this.A00 = tigonRequestBuilder.mStartupStatusOnAdded;
            this.A02 = tigonRequestBuilder.mAddedToMiddlewareSinceEpochMS;
            this.mAuthHandler = tigonRequestBuilder.mAuthHandler;
            this.mHttpPriorityContext = tigonRequestBuilder.mHttpPriorityContext;
        }
    }

    public static TigonRequest create(String str, String str2, String[] strArr, int i, boolean z, FacebookLoggingRequestInfo facebookLoggingRequestInfo) {
        TigonRequestBuilder tigonRequestBuilder = new TigonRequestBuilder(str, str2);
        tigonRequestBuilder.mTigonPriority = i;
        tigonRequestBuilder.mRetryable = z;
        int length = strArr.length;
        if ((length & 1) == 0) {
            for (int i2 = 0; i2 < length; i2 += 2) {
                String str3 = strArr[i2];
                String str4 = strArr[i2 + 1];
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    tigonRequestBuilder.mHeaders.put(str3, str4);
                }
            }
            if (facebookLoggingRequestInfo != null) {
                tigonRequestBuilder.mLayerInformation.put(C1S2.A01, facebookLoggingRequestInfo);
            }
            return new TigonRequestImpl(tigonRequestBuilder);
        }
        throw new IllegalArgumentException("must have even number of flattened headers");
    }

    public TigonRequestBuilder(String str, String str2) {
        this.mUrl = "";
        this.mMethod = str;
        this.mUrl = str2;
    }

    public TigonRequestBuilder addHeaders(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.mHeaders.put(str, str2);
            }
        }
        return this;
    }
}
