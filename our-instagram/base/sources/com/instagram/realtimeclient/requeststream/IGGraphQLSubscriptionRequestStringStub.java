package com.instagram.realtimeclient.requeststream;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public class IGGraphQLSubscriptionRequestStringStub {
    public static final String DEFAULT_CALLER_NAME = "UNKNOWN";
    public static final String DEFAULT_CALL_NAME = "UNKNOWN";
    public String mCallName;
    public String mCallerName;
    public final Map mOptionParameters;
    public final String mParamsKey;
    public final String mQueryId;
    public final String mQueryName;

    public synchronized IGGraphQLSubscriptionRequestStringStub addOptionalParameter(String str, Object obj) {
        this.mOptionParameters.put(str, obj);
        return this;
    }

    public synchronized String getCallName() {
        return this.mCallName;
    }

    public synchronized String getCallerName() {
        return this.mCallerName;
    }

    public synchronized String getQueryName() {
        return this.mQueryName;
    }

    public String getQueryText() {
        return null;
    }

    public Class getTreeModelType() {
        return null;
    }

    public long getTreeShapeHash() {
        return 0L;
    }

    public int getTypeTag() {
        return 0;
    }

    public boolean hasVirtualRootType() {
        return false;
    }

    public boolean isMutation() {
        return false;
    }

    public boolean isRootedOnOperation() {
        return false;
    }

    public boolean isVarArgsCall() {
        return false;
    }

    public boolean requireAcsToken() {
        return false;
    }

    public boolean requireOhaiConfig() {
        return false;
    }

    public synchronized void setCallName(String str) {
        this.mCallName = str;
    }

    public synchronized void setCallerName(String str) {
        this.mCallerName = str;
    }

    public IGGraphQLSubscriptionRequestStringStub setEnableFullConsistency(boolean z) {
        return this;
    }

    public IGGraphQLSubscriptionRequestStringStub setParam_DO_NOT_USE(String str, Object obj) {
        return this;
    }

    public Map getOptionParameters() {
        return ImmutableMap.copyOf(this.mOptionParameters);
    }

    public String getParamsKey() {
        return this.mParamsKey;
    }

    public String getQueryId() {
        return this.mQueryId;
    }

    public Set getRuntimeDefaultParams() {
        return new HashSet();
    }

    public IGGraphQLSubscriptionRequestStringStub(String str, String str2, String str3) {
        this.mCallerName = "UNKNOWN";
        this.mCallName = "UNKNOWN";
        this.mOptionParameters = new HashMap();
        this.mQueryName = str;
        this.mQueryId = str2;
        this.mParamsKey = str3;
    }

    public IGGraphQLSubscriptionRequestStringStub(String str, String str2) {
        this(str, str2, null);
    }
}
